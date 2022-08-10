import React, {useState, useEffect} from 'react';
import { useNavigate } from "react-router-dom";
import styled from "styled-components";
import NoticeItem from "./NoticeItem";
import { getNoticeList } from '../../../../api/notice';
import Button from '../../../../components/Button/Button';
import { Pagination } from '@mui/material';



const Container = styled.div`
  width: 100%;
  padding: 1rem 5rem;
  box-sizing: border-box;
  height: 80%;
`;

const Title = styled.div`
  text-align: center;
  font-size: 1.8rem;
  font-weight: 600;
  margin-bottom: 1.5rem;
`;

const StyledTable = styled.table`
  width: 100%;
`;

const ButtonContainer = styled.div`
  width: 100%;
  display: flex;
  justify-content: flex-end;
  box-sizing: border-box;
  margin-bottom: 1rem;
`;

const StyledCol = styled.col`
  width: ${(props) => props.width};
`;

const StyledTh = styled.td`
  background-color: #fec25c;
  height: 2.2rem;
  vertical-align: middle;
  text-align: center;
  font-weight: 600;
  border-radius: 3px;
  color: black;
  & + & {
    border-left: 2px solid white;
  }
`;

const PageContainer = styled.div`
  margin-top: 1rem;
`;

function NoticeList() {
    const Navigate = useNavigate();
    const [data, setData] = useState(null);
    const [isLoading, setIsLoading] = useState(false);
    const [totalItemsCount, setTotalItemsCount] = useState(0);
    const [isTotalItemsCountLoading, setIsTotalItemsCountLoading] =
      useState(true);
    const [page, setPage] = useState(0);
    

    useEffect(() => {
        if (isTotalItemsCountLoading) {
          getNoticeList(page).then((res) => {
            setTotalItemsCount(res.data.total*10 + res.data.list.length);
            setIsTotalItemsCountLoading(false);
          });
        } else {
          setIsLoading(true);
        }
      }, [isTotalItemsCountLoading]);
    
    // useEffect 데이터 read
    useEffect(() => {
      if (isLoading) {
        getNoticeList(page).then((res) => {
          setData(res.data.list);
          setIsLoading(false);
        });
      }
    }, [isLoading]);


    const handlePageChange = (page) => {
    setPage(page - 1);
    Navigate(`?page=${page}`);
    setIsLoading(true);
    };


    return (
    <>
      <Title>공지사항</Title>
      <Container>
        <ButtonContainer>
          <Button
            name='글쓰기'
            onClick={()=> Navigate("./write")} />
        </ButtonContainer>
        <StyledTable>
          <colgroup>
            <StyledCol width="10%"></StyledCol>
            <StyledCol width="50%"></StyledCol>
            <StyledCol width="20%"></StyledCol>
            <StyledCol width="20%"></StyledCol>
          </colgroup>
          <thead>
            <tr>
              <StyledTh>글번호</StyledTh>
              <StyledTh>제목</StyledTh>
              <StyledTh>작성자</StyledTh>
              <StyledTh>등록일</StyledTh>
            </tr>
          </thead>
          <tbody>
            {data &&
              !isLoading &&
              data.map((item, idx) => (
                <NoticeItem
                  index={totalItemsCount - page * 10 - idx - 1}
                  key={item.noticeNo}
                  data={item}
                />
              ))}
          </tbody>
        </StyledTable>
        </Container>
        <PageContainer>
          <Pagination
            count ={page + 1}
            shape = "rounded"
            page = {page}
            itemsCountPerPage={10}
            totalItemsCount={totalItemsCount}
            pageRangeDisplayed={5}
            prevPageText={"‹"}
            nextPageText={"›"}
            onChange={handlePageChange}
          />
      </PageContainer>
    </>
  )
}


export default NoticeList
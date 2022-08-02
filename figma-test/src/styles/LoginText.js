import styled from "styled-components";

const TextBigInter = styled.div`
  font-size: 15px;
  font-family: Inter;
  font-weight: 500;
  align-self: flex-start;
  margin: 0px 0px 2px 0px;
`;
const TextSmallInter = styled.div`
  text-align: center;
  font-size: 11px;
  font-family: Inter;
  font-weight: 500;
`;

const TextBtnInter = styled.div`
  text-align: center;
  width: 420px;
  height: 52px;
  display: flex;
  font-size: 13px;
  font-family: Inter;
  font-weight: 700;
  flex-direction: column;
  align-items: center;
  justify-content: center;
`;
const TextColorArt = styled.div`
  font-family: Inter;
  color: ${(props) => props.color};
  align-self: flex-end;
  font-size: 12px;
`;

export { TextBigInter, TextSmallInter, TextBtnInter, TextColorArt };

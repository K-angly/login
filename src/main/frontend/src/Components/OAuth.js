// const CLIENT_ID = process.env.REACT_APP_REST_API_KEY;
// const REDIRECT_URI = process.env.REACT_APP_REDIRECT_URL;
const CLIENT_ID="1bc04bba90d5213d8d39d0622828b5bc"
const REDIRECT_URI="http://localhost:8080/oauth/"
const LOGOUT_REDIRECT_URI = "http://localhost:8080/logout";


export const KAKAO_AUTH_URL = `https://kauth.kakao.com/oauth/authorize?client_id=${CLIENT_ID}&redirect_uri=${REDIRECT_URI}&response_type=code`
export const KAKAO_LOGOUT_URL = `https://kauth.kakao.com/oauth/logout?client_id=${CLIENT_ID}&logout_redirect_uri=${LOGOUT_REDIRECT_URI}`
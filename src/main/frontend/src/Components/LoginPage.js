import React from "react";
import {KAKAO_AUTH_URL} from "./OAuth";

export default () => (
    <a href={KAKAO_AUTH_URL} className="kakaobtn">
        <img src={process.env.PUBLIC_URL + `image/kakao`} />
    </a>
)
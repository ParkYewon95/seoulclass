package com.example.user.exampleapp;

public class ClassListItem {

    /** class list information structure **/
    private String title = "제목/TITLE"; // 제목
    private String location = "서울시 종로구 ~ ~ 장소"; //장소
    private String maxclassnm = "대분류명"; //대분류명
    private String minclassnm = "소분류명"; //소분류명
    private String pay ="결제 방법"; //결제방법
    private String usetgtinfo = "수업 대상자"; //서비스대상
    private String url= "http://naver.com";  // 바로가기 url
    private String opnbgndt = "수업 시작 날";//서비스개시시작일시
    private String opnenddt = "수업 끝나는 날";//서비스개시종료일시
    private String rcptbgnt = "접수 시작";//접수시작일시
    private String rcptenddt = "접수 끝";//접수종료일시


    public String getTitle() {
        return title;
    }
    public String getLocation() {
        return location;
    }
    public String getMaxclassnm() {
        return maxclassnm;
    }
    public String getMinclassnm(){
        return minclassnm;
    }
    public String getPay(){
        return pay;
    }
    public String getUsetgtinfo(){
        return usetgtinfo;
    }
    public String getUrl(){
        return url;
    }
    public String getOpnbgndt(){
        return opnbgndt;
    }
    public String getOpnenddt(){
        return opnenddt;
    }
    public String getRcptbgnt(){
        return rcptbgnt;
    }
    public String getRcptenddt(){
        return rcptenddt;
    }

}

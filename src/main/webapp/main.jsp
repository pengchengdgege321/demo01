<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
          body{
                margin:0%;/*外边距 解决各浏览器兼容性问题*/
                padding:0%;/*内边距 解决各浏览器兼容性问题*/
              }
         .wrap{
                display:flex;/*弹性盒模型 伸缩布局 默认不换行*/
                justify-content: space-between;
                /*主轴方向两端对齐*/
                flex-wrap:wrap;/*强制换行*/
                height: 100vh;
                /*将浏览器高度分为100分 100vh为满屏*/
                background-color:aqua; /*设置背景颜色 可视化*/
                background-image:url("img/2.jpg");
                /*引入背景图片 加上引号 显得更加专业哦*/
                background-size:cover;/*使图片等比例覆盖背景*/
                overflow:hidden;
              }
          span{
                float:left;/*向左浮动*/
                width:9.7%; /*一行10方框,考虑到边框线定为9.7%*/
                height:40px;
                background-color:white;
                border:1px solid red;   
                /*边框线 粗细 实线 颜色*/         
              }
         .fall{
                animation: fall 60s forwards;  
                /*动画 名称 时间 掉下去后不再往返*/
              }
@keyframes fall{
                0%{transform:translateY(0);}
                100%{transform:translateY(2000px);}
              }
    </style>
</head>
<body>
	<div class="wrap">
              <span></span> 
              <span></span>
              <span></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span> 
              <span></span>
              <span class="fall"></span>
              <span class="fall"></span> 
              <span  class="fall"></span>
              <span class="fall"></span>
              <span class="fall"></span>
              <span></span>
              <span></span>
              <span></span>	
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span>
              <span class="fall"></span>
              <span></span> 
              <span></span>
              <span></span> 
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span>
              <span class="fall"></span>
              <span></span> 
              <span></span>
              <span></span> 
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span>
              <span class="fall"></span>
              <span></span> 
              <span></span>
              <span></span> 
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span>
              <span class="fall"></span>
              <span></span> 
              <span></span>
              <span></span> 
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span></span>
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span> 
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span> 
              <span></span> 
              <span></span>
              <span></span>
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span>
              <span class="fall"></span> 
              <span class="fall"></span> 
              <span></span> 
              <span></span>
              <span></span>
              
              
</div>

<script>
         var ap=document.getElementsByTagName("span"); 
         /*获取文档内所有的span标签*/
         length=ap.length; /*让大小等于span标点的个数 这里有200个span标签 但不另i<200 而是另i<span标签的个数 方便以后增加或减少span标签个数*/
         for(var i=0;i<length;i++)/*应用for循环 简化代码*/
            {
               ap[i].onclick=function()/*鼠标点击事件*/
                    {
                        this.className="fall";/
                        *给点击的span标签一个名字*/
                        this.style.backgroundColor="red";
                        /*点击后颜色变为红色*/
                    }
            }
</script>
<!-- 本人愚笨，用时520秒 -->
</body>
</html>
<%-- 
    Document   : HomePage
    Created on : Oct 20, 2025, 6:17:40 PM
    Author     : Mubsshir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog:Home</title>
        <link rel="stylesheet" href="styles/main.css">
    </head>
    <body>
       <main class="main-content">
              <h1>Welcome to the Blog Home Page</h1>
              <p>This is the main landing page for the blog application.</p>
              <div>
                <form action="post">
                    <div class="microblog-form" >
                        <label for="microContent" style="margin-top:10px">What's happening?</label>
                        <textarea id="microContent" name="content" rows="4" maxlength="280" placeholder="Write a short microblog (max 280 characters)" required>
                        </textarea>

                        <div class="meta-row">
                            <div style="display:flex;gap:8px;align-items:center;">
                                <input id="tags" name="tags" class="tag-input" type="text" placeholder="#tags,comma,separated" title="Comma separated tags">
                                <label style="font-size:13px;color:#456;margin-left:6px">
                                    <input type="checkbox" name="public" value="1" checked style="margin-right:6px"> Public
                                </label>
                            </div>

                            <div style="text-align:right">
                                <div class="small" aria-live="polite"><span id="charLeft">280</span> characters left</div>
                                <div style="margin-top:6px">
                                    <button id="postBtn" class="btn-post" type="submit">Post • Blast Off</button>
                                </div>
                            </div>
                        </div>

                        <script>
                            (function(){
                                const ta = document.getElementById('microContent');
                                const count = document.getElementById('charLeft');
                                const btn = document.getElementById('postBtn');
                                const MAX = Number(ta.getAttribute('maxlength')||280);

                                function refresh(){
                                    const len = ta.value.trim().length;
                                    const left = MAX - len;
                                    count.textContent = left;
                                    if(left < 0) { count.style.color = '#b22222'; btn.disabled = true; }
                                    else if(left <= 20) { count.style.color = '#d96400'; btn.disabled = len===0; }
                                    else { count.style.color = '#386b8f'; btn.disabled = len===0; }
                                }

                                ta.addEventListener('input', refresh);
                                document.addEventListener('DOMContentLoaded', refresh);
                                // quick keyboard shortcut: Ctrl+Enter to submit
                                ta.addEventListener('keydown', function(e){
                                    if((e.ctrlKey||e.metaKey) && e.key === 'Enter' && !btn.disabled){
                                        btn.click();
                                    }
                                });
                            })();
                        </script>
                    </div>
                </form>
              </div>
       </main>
    </body>
</html>
    
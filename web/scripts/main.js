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
                            })()
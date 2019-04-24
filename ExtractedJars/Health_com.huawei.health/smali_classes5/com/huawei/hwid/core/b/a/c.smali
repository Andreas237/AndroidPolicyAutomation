.class public Lcom/huawei/hwid/core/b/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;)Lorg/apache/http/HttpResponse;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Ljava/io/IOException;,
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 46
    new-instance v3, Lorg/apache/http/client/methods/HttpPost;

    invoke-virtual {p1, p0}, Lcom/huawei/hwid/core/b/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 53
    invoke-static {}, Lcom/huawei/hwid/vermanager/c;->a()Lcom/huawei/hwid/vermanager/d;

    move-result-object v0

    const/16 v1, 0x46a0

    const/16 v2, 0x480b

    invoke-virtual {v0, p0, v1, v2}, Lcom/huawei/hwid/vermanager/d;->a(Landroid/content/Context;II)Lorg/apache/http/client/HttpClient;

    move-result-object v4

    .line 55
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 56
    const-string v0, "HttpUtil"

    const-string v1, "httpClient init Failed"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    new-instance v0, Ljava/net/UnknownHostException;

    const-string v1, "ERROR"

    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    .line 63
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v3, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    sget-object v0, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->a()Lcom/huawei/hwid/core/b/a/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/b/a/a$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded; charset=UTF-8"

    invoke-virtual {v3, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 67
    :cond_1
    const-string v0, "Content-Type"

    const-string v1, "text/html; charset=UTF-8"

    invoke-virtual {v3, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    :goto_0
    invoke-static {p0, v3, p1, p2}, Lcom/huawei/hwid/core/b/a/c;->a(Landroid/content/Context;Lorg/apache/http/client/methods/HttpPost;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;)V

    .line 72
    invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.socket.timeout"

    const/16 v2, 0x4e20

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 73
    invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.connection.timeout"

    const/16 v2, 0x4e20

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 75
    invoke-virtual {v3}, Lorg/apache/http/client/methods/HttpPost;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/apache/http/client/params/HttpClientParams;->setRedirecting(Lorg/apache/http/params/HttpParams;Z)V

    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->a()Lcom/huawei/hwid/core/b/a/a$c;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwid/core/b/a/a$c;->b:Lcom/huawei/hwid/core/b/a/a$c;

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/core/b/a/a$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 79
    new-instance v6, Lorg/apache/http/entity/StringEntity;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v6, v0, v1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v0, "HttpUtil"

    const-string v1, "request.urlencode()  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 82
    :cond_2
    new-instance v6, Lorg/apache/http/entity/StringEntity;

    invoke-virtual {p1}, Lcom/huawei/hwid/core/b/a/a;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v6, v0, v1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :goto_1
    invoke-virtual {v3, v6}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 87
    const-string v0, "HttpUtil"

    const-string v1, "direct connect start!"

    :try_start_0
    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-interface {v4, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 90
    :catch_0
    move-exception v7

    .line 92
    instance-of v0, v7, Ljava/io/UnsupportedEncodingException;

    if-eqz v0, :cond_3

    .line 93
    new-instance v0, Ljava/io/UnsupportedEncodingException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UnsupportedEncodingException[don\'t set proxy]:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/UnsupportedEncodingException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_3
    instance-of v0, v7, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-nez v0, :cond_4

    instance-of v0, v7, Ljavax/net/ssl/SSLHandshakeException;

    if-nez v0, :cond_4

    instance-of v0, v7, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_5

    .line 96
    :cond_4
    const-string v0, "HttpUtil"

    const-string v1, "SSLPeerUnverifiedException SSLHandshakeException SSLException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    new-instance v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    const-string v1, "SSL Exception"

    invoke-direct {v0, v1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_5
    instance-of v0, v7, Ljava/lang/IllegalArgumentException;

    if-eqz v0, :cond_6

    .line 99
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IllegalArgumentException[don\'t set proxy]:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_6
    instance-of v0, v7, Ljava/lang/IllegalStateException;

    if-eqz v0, :cond_7

    .line 101
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IllegalStateException[don\'t set proxy]:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_7
    instance-of v0, v7, Ljava/io/IOException;

    if-eqz v0, :cond_8

    .line 103
    const-string v0, "HttpUtil"

    const-string v1, "IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IOException[don\'t set proxy]:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_8
    new-instance v0, Ljava/net/UnknownHostException;

    const-string v1, "don\'t set proxy"

    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static a(Landroid/content/Context;Lorg/apache/http/client/methods/HttpPost;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TrulyRandom"
        }
    .end annotation

    .line 174
    const-string v3, ""

    .line 179
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/c/a;->b()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v4

    .line 180
    if-eqz v4, :cond_0

    .line 181
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/c/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 185
    :cond_0
    const-string v0, "Cookie"

    invoke-virtual {p1, v0, v3}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    invoke-virtual {p2}, Lcom/huawei/hwid/core/b/a/a;->p()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 188
    :sswitch_0
    const-string v0, "Authorization"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    goto/16 :goto_0

    .line 192
    :sswitch_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 193
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v5

    .line 194
    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v6

    .line 195
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/hwid/core/b/a/a;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 200
    const-string v0, "Authorization"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Digest user="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "nonce"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "response"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 201
    invoke-static {v8, v5}, Lcom/huawei/hwid/core/encrypt/d;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 200
    invoke-virtual {p1, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :cond_1
    goto :goto_0

    .line 205
    :cond_2
    const-string v0, "HttpUtil"

    const-string v1, "account is null "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 212
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

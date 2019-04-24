.class public Lcom/sina/weibo/sdk/network/impl/RequestEngine;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static fillRequestBody(Ljava/net/HttpURLConnection;Lcom/sina/weibo/sdk/network/impl/RequestParam;)V
    .locals 0

    .line 158
    return-void
.end method

.method public static request(Lcom/sina/weibo/sdk/network/IRequestParam;)Lcom/sina/weibo/sdk/network/base/WbResponse;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/network/exception/RequestException;
        }
    .end annotation

    .line 30
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getUrl()Ljava/lang/String;

    move-result-object v4

    .line 31
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "http"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 32
    :cond_0
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/RequestException;

    const-string v1, "\u975e\u6cd5\u7684\u8bf7\u6c42\u5730\u5740"

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/RequestException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_1
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getGetBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/sina/weibo/sdk/network/base/UriUtils;->buildCompleteUri(Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v4

    .line 36
    invoke-static {}, Lcom/sina/weibo/sdk/net/NetStateManager;->getAPN()Landroid/util/Pair;

    move-result-object v5

    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v5, :cond_2

    .line 39
    new-instance v6, Ljava/net/Proxy;

    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    new-instance v1, Ljava/net/InetSocketAddress;

    iget-object v2, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-direct {v1, v2, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-direct {v6, v0, v1}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 41
    :cond_2
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 45
    :try_start_0
    new-instance v10, Ljava/net/URL;

    invoke-direct {v10, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 46
    const-string v0, "https"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 49
    if-nez v6, :cond_3

    .line 50
    invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljavax/net/ssl/HttpsURLConnection;

    goto :goto_0

    .line 52
    :cond_3
    invoke-virtual {v10, v6}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljavax/net/ssl/HttpsURLConnection;

    goto :goto_0

    .line 59
    :cond_4
    if-nez v6, :cond_5

    .line 60
    invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/net/HttpURLConnection;

    goto :goto_0

    .line 62
    :cond_5
    invoke-virtual {v10, v6}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/net/HttpURLConnection;

    .line 65
    :goto_0
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getHeader()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v7, v0}, Lcom/sina/weibo/sdk/network/impl/RequestEngine;->setRequestHeader(Ljava/net/HttpURLConnection;Landroid/os/Bundle;)V

    .line 66
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 67
    invoke-static {}, Lcom/sina/weibo/sdk/network/base/RequestBodyHelper;->getBoundry()Ljava/lang/String;

    move-result-object v12

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "------------"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 70
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getMethod()Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;->POST:Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    if-ne v0, v1, :cond_8

    .line 71
    const-string v0, "POST"

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 72
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v7, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 78
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getPostBundle()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "body_byte_array"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v13

    .line 79
    if-eqz v13, :cond_6

    .line 80
    const-string v0, "Content-Type"

    const-string v1, "application/octet-stream"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 82
    :cond_6
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/base/RequestBodyHelper;->isMultipartRequest(Lcom/sina/weibo/sdk/network/IRequestParam;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 84
    const-string v0, "Content-Type"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "multipart/form-data;boundary="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 89
    :cond_7
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_1
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 94
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 96
    goto :goto_2

    :cond_8
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getMethod()Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;->GET:Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    if-ne v0, v1, :cond_9

    .line 97
    const-string v0, "GET"

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    goto :goto_2

    .line 98
    :cond_9
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getMethod()Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;->PATCH:Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    if-ne v0, v1, :cond_a

    .line 99
    const-string v0, "PATCH"

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 101
    :cond_a
    :goto_2
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getResponseTimeout()I

    move-result v0

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 102
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getRequestTimeout()I

    move-result v0

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 103
    invoke-static {v7, v11}, Lcom/sina/weibo/sdk/network/impl/RequestEngine;->setRequestHeader(Ljava/net/HttpURLConnection;Landroid/os/Bundle;)V

    .line 104
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->connect()V

    .line 106
    invoke-interface/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/IRequestParam;->getMethod()Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;->GET:Lcom/sina/weibo/sdk/network/IRequestParam$RequestType;

    if-eq v0, v1, :cond_b

    .line 107
    move-object/from16 v0, p0

    invoke-static {v0, v7, v12}, Lcom/sina/weibo/sdk/network/base/RequestBodyHelper;->fillRequestBody(Lcom/sina/weibo/sdk/network/IRequestParam;Ljava/net/HttpURLConnection;Ljava/lang/String;)V

    .line 109
    :cond_b
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v13

    .line 110
    const/16 v0, 0xc8

    if-ne v13, v0, :cond_c

    .line 111
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v8

    .line 113
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v14, v0

    .line 114
    new-instance v0, Lcom/sina/weibo/sdk/network/base/WbResponseBody;

    move-object v1, v8

    move-wide v2, v14

    invoke-direct {v0, v1, v2, v3}, Lcom/sina/weibo/sdk/network/base/WbResponseBody;-><init>(Ljava/io/InputStream;J)V

    move-object/from16 v16, v0

    .line 115
    new-instance v9, Lcom/sina/weibo/sdk/network/base/WbResponse;

    move-object/from16 v0, v16

    invoke-direct {v9, v0}, Lcom/sina/weibo/sdk/network/base/WbResponse;-><init>(Lcom/sina/weibo/sdk/network/base/WbResponseBody;)V

    .line 116
    goto :goto_3

    .line 117
    :cond_c
    const/16 v0, 0x12e

    if-eq v13, v0, :cond_d

    const/16 v0, 0x12d

    if-ne v13, v0, :cond_e

    .line 118
    :cond_d
    const-string v0, "Location"

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 119
    move-object/from16 v0, p0

    invoke-interface {v0, v14}, Lcom/sina/weibo/sdk/network/IRequestParam;->setUrl(Ljava/lang/String;)V

    .line 120
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/network/impl/RequestEngine;->request(Lcom/sina/weibo/sdk/network/IRequestParam;)Lcom/sina/weibo/sdk/network/base/WbResponse;

    move-result-object v9

    .line 121
    goto :goto_3

    .line 123
    :cond_e
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v8

    .line 124
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v14, v0

    .line 125
    new-instance v0, Lcom/sina/weibo/sdk/network/base/WbResponseBody;

    move-object v1, v8

    move-wide v2, v14

    invoke-direct {v0, v1, v2, v3}, Lcom/sina/weibo/sdk/network/base/WbResponseBody;-><init>(Ljava/io/InputStream;J)V

    move-object/from16 v16, v0

    .line 127
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/RequestException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u670d\u52a1\u5668\u5f02\u5e38"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, Lcom/sina/weibo/sdk/network/base/WbResponseBody;->string()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/RequestException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 137
    :goto_3
    goto :goto_4

    .line 131
    :catch_0
    move-exception v10

    .line 132
    const-string v0, "weibosdk"

    invoke-virtual {v10}, Ljava/net/MalformedURLException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/RequestException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u8bf7\u6c42\u5f02\u5e38"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Ljava/net/MalformedURLException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/RequestException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :catch_1
    move-exception v10

    .line 135
    const-string v0, "weibosdk"

    invoke-virtual {v10}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    new-instance v0, Lcom/sina/weibo/sdk/network/exception/RequestException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u8bf7\u6c42\u5f02\u5e38"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v10}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/sina/weibo/sdk/network/exception/RequestException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 138
    :goto_4
    return-object v9
.end method

.method private static setRequestHeader(Ljava/net/HttpURLConnection;Landroid/os/Bundle;)V
    .locals 4

    .line 142
    if-nez p1, :cond_0

    .line 143
    return-void

    .line 145
    :cond_0
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 146
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 147
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    goto :goto_0

    .line 149
    :cond_1
    return-void
.end method

.class public Lo/cux;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(ZLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/HiUserAuth;
    .locals 6

    .line 59
    const/4 v4, 0x0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    invoke-static {}, Lo/cra;->c()Lo/cra;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cra;->a(Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/WhiteListApp;

    move-result-object v5

    .line 62
    if-eqz v5, :cond_0

    .line 63
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->getUserScopes()Ljava/lang/String;

    move-result-object v4

    .line 65
    :cond_0
    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://apidevlf.hwcloudtest.cn/rest.php?nsp_svc=huawei.oauth2.user.getTokenInfo&open_id=OPENID&access_token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cux;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 68
    :goto_0
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserAuth accessToken = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, ",response = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    if-nez v4, :cond_2

    .line 70
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_2
    const-class v0, Lcom/huawei/hihealthservice/auth/HiUserAuth;

    invoke-static {v4, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/auth/HiUserAuth;

    return-object v0
.end method

.method public static d(ZLjava/lang/String;Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/HiAuthorization;
    .locals 6

    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    invoke-static {}, Lo/cra;->c()Lo/cra;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cra;->a(Ljava/lang/String;)Lcom/huawei/hihealthservice/auth/WhiteListApp;

    move-result-object v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    invoke-virtual {v5}, Lcom/huawei/hihealthservice/auth/WhiteListApp;->getAppScopes()Ljava/lang/String;

    move-result-object v4

    .line 41
    :cond_0
    goto :goto_0

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://apidevlf.hwcloudtest.cn/rest.php?appid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&type=3&access_token=xxx&nsp_svc=nsp.scope.app.get"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cux;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 44
    :goto_0
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAppAuth appID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    const-string v2, ",response = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    if-nez v4, :cond_2

    .line 46
    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_2
    const-class v0, Lcom/huawei/hihealthservice/auth/HiAuthorization;

    invoke-static {v4, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/auth/HiAuthorization;

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 79
    const/4 v4, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 85
    :try_start_0
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v6, v0

    .line 87
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v7, v0

    .line 88
    new-instance v0, Ljava/io/BufferedReader;

    invoke-direct {v0, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    move-object v8, v0

    .line 89
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    :goto_0
    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_0

    .line 92
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 98
    if-eqz v6, :cond_1

    .line 99
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 101
    :cond_1
    if-eqz v8, :cond_2

    .line 103
    :try_start_1
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 106
    goto :goto_1

    .line 104
    :catch_0
    move-exception v9

    .line 105
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeHttpGet finally bufferedRead e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :cond_2
    :goto_1
    if-eqz v7, :cond_8

    .line 110
    :try_start_2
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 113
    goto/16 :goto_5

    .line 111
    :catch_1
    move-exception v9

    .line 112
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeHttpGet finally inputStreamReader e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    goto/16 :goto_5

    .line 95
    :catch_2
    move-exception v9

    .line 96
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeHttpGet e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 98
    if-eqz v6, :cond_3

    .line 99
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 101
    :cond_3
    if-eqz v8, :cond_4

    .line 103
    :try_start_4
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 106
    goto :goto_2

    .line 104
    :catch_3
    move-exception v9

    .line 105
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeHttpGet finally bufferedRead e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :cond_4
    :goto_2
    if-eqz v7, :cond_8

    .line 110
    :try_start_5
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 113
    goto :goto_5

    .line 111
    :catch_4
    move-exception v9

    .line 112
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeHttpGet finally inputStreamReader e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    goto :goto_5

    .line 98
    :catchall_0
    move-exception v11

    if-eqz v6, :cond_5

    .line 99
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 101
    :cond_5
    if-eqz v8, :cond_6

    .line 103
    :try_start_6
    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 106
    goto :goto_3

    .line 104
    :catch_5
    move-exception v12

    .line 105
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeHttpGet finally bufferedRead e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    :cond_6
    :goto_3
    if-eqz v7, :cond_7

    .line 110
    :try_start_7
    invoke-virtual {v7}, Ljava/io/InputStreamReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 113
    goto :goto_4

    .line 111
    :catch_6
    move-exception v12

    .line 112
    const-string v0, "Debug_HiHttpUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeHttpGet finally inputStreamReader e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    :cond_7
    :goto_4
    throw v11

    .line 117
    :cond_8
    :goto_5
    return-object v4
.end method

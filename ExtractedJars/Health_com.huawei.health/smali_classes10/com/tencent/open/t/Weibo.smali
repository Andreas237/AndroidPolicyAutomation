.class public Lcom/tencent/open/t/Weibo;
.super Lcom/tencent/connect/common/BaseApi;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 33
    invoke-direct {p0, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 37
    invoke-direct {p0, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 38
    return-void
.end method


# virtual methods
.method public atFriends(ILcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 146
    invoke-virtual {p0}, Lcom/tencent/open/t/Weibo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 147
    const-string v0, "reqnum"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 149
    iget-object v0, p0, Lcom/tencent/open/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "friends/get_intimate_friends_weibo"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 151
    return-void
.end method

.method public deleteText(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 158
    invoke-virtual {p0}, Lcom/tencent/open/t/Weibo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 159
    const-string v0, "id"

    invoke-virtual {v6, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 161
    iget-object v0, p0, Lcom/tencent/open/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "t/del_t"

    move-object v3, v6

    const-string v4, "POST"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 162
    return-void
.end method

.method public getWeiboInfo(Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 46
    invoke-virtual {p0}, Lcom/tencent/open/t/Weibo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 47
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 48
    iget-object v0, p0, Lcom/tencent/open/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "user/get_info"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 50
    return-void
.end method

.method public nickTips(Ljava/lang/String;ILcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 130
    invoke-virtual {p0}, Lcom/tencent/open/t/Weibo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 131
    const-string v0, "match"

    if-nez p1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v0, "reqnum"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p3}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 134
    iget-object v0, p0, Lcom/tencent/open/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "friends/match_nick_tips_weibo"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 136
    return-void
.end method

.method public sendPicText(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 14

    .line 77
    new-instance v6, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    move-object/from16 v0, p3

    invoke-direct {v6, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 78
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 83
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .line 84
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v9, v0

    .line 85
    const/16 v0, 0x400

    new-array v10, v0, [B

    .line 86
    const/4 v11, 0x0

    .line 87
    :goto_0
    invoke-virtual {v8, v10}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 88
    const/4 v0, 0x0

    invoke-virtual {v9, v10, v0, v11}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 95
    if-eqz v9, :cond_1

    .line 97
    :try_start_1
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 100
    goto :goto_1

    .line 98
    :catch_0
    move-exception v10

    .line 99
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 101
    :goto_1
    const/4 v9, 0x0

    .line 103
    :cond_1
    if-eqz v8, :cond_6

    .line 105
    :try_start_2
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 108
    goto :goto_2

    .line 106
    :catch_1
    move-exception v10

    .line 107
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 109
    :goto_2
    const/4 v8, 0x0

    goto :goto_7

    .line 91
    :catch_2
    move-exception v10

    .line 92
    :try_start_3
    invoke-virtual {v6, v10}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->onIOException(Ljava/io/IOException;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 95
    if-eqz v9, :cond_2

    .line 97
    :try_start_4
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 100
    goto :goto_3

    .line 98
    :catch_3
    move-exception v11

    .line 99
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    .line 101
    :goto_3
    const/4 v9, 0x0

    .line 103
    :cond_2
    if-eqz v8, :cond_3

    .line 105
    :try_start_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 108
    goto :goto_4

    .line 106
    :catch_4
    move-exception v11

    .line 107
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    .line 109
    :goto_4
    const/4 v8, 0x0

    :cond_3
    return-void

    .line 95
    :catchall_0
    move-exception v12

    if-eqz v9, :cond_4

    .line 97
    :try_start_6
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 100
    goto :goto_5

    .line 98
    :catch_5
    move-exception v13

    .line 99
    invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V

    .line 101
    :goto_5
    const/4 v9, 0x0

    .line 103
    :cond_4
    if-eqz v8, :cond_5

    .line 105
    :try_start_7
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 108
    goto :goto_6

    .line 106
    :catch_6
    move-exception v13

    .line 107
    invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V

    .line 109
    :goto_6
    const/4 v8, 0x0

    :cond_5
    throw v12

    .line 113
    :cond_6
    :goto_7
    invoke-virtual {p0}, Lcom/tencent/open/t/Weibo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v10

    .line 114
    const-string v0, "content"

    if-nez p1, :cond_7

    const-string v1, ""

    goto :goto_8

    :cond_7
    move-object v1, p1

    :goto_8
    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string v0, "pic"

    invoke-virtual {v10, v0, v7}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 116
    iget-object v0, p0, Lcom/tencent/open/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "t/add_pic_t"

    move-object v3, v10

    const-string v4, "POST"

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 118
    return-void
.end method

.method public sendText(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 60
    invoke-virtual {p0}, Lcom/tencent/open/t/Weibo;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 61
    const-string v0, "content"

    if-nez p1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 63
    iget-object v0, p0, Lcom/tencent/open/t/Weibo;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "t/add_t"

    move-object v3, v6

    const-string v4, "POST"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 65
    return-void
.end method

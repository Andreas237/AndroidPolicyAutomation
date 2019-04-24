.class public Lcom/tencent/open/qzone/Albums;
.super Lcom/tencent/connect/common/BaseApi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/qzone/Albums$AlbumSecurity;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 55
    invoke-direct {p0, p2, p3}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQAuth;Lcom/tencent/connect/auth/QQToken;)V

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 59
    invoke-direct {p0, p2}, Lcom/tencent/connect/common/BaseApi;-><init>(Lcom/tencent/connect/auth/QQToken;)V

    .line 60
    return-void
.end method


# virtual methods
.method public addAlbum(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/open/qzone/Albums$AlbumSecurity;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 175
    invoke-virtual {p0}, Lcom/tencent/open/qzone/Albums;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 176
    const-string v0, "albumname"

    if-nez p1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    const-string v0, "albumdesc"

    if-nez p2, :cond_1

    const-string v1, ""

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const-string v0, "priv"

    if-nez p3, :cond_2

    sget-object v1, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->publicToAll:Lcom/tencent/open/qzone/Albums$AlbumSecurity;

    invoke-virtual {v1}, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->getSecurity()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    invoke-virtual {p3}, Lcom/tencent/open/qzone/Albums$AlbumSecurity;->getSecurity()Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const-string v0, "question"

    if-nez p4, :cond_3

    const-string v1, ""

    goto :goto_3

    :cond_3
    move-object v1, p4

    :goto_3
    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    const-string v0, "answer"

    if-nez p5, :cond_4

    const-string v1, ""

    goto :goto_4

    :cond_4
    move-object v1, p5

    :goto_4
    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p6}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 182
    iget-object v0, p0, Lcom/tencent/open/qzone/Albums;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "photo/add_album"

    move-object v3, v6

    const-string v4, "POST"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 184
    return-void
.end method

.method public listAlbum(Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 70
    invoke-virtual {p0}, Lcom/tencent/open/qzone/Albums;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 71
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p1}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 73
    iget-object v0, p0, Lcom/tencent/open/qzone/Albums;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "photo/list_album"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 75
    return-void
.end method

.method public listPhotos(Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 8

    .line 88
    invoke-virtual {p0}, Lcom/tencent/open/qzone/Albums;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v6

    .line 89
    const-string v0, "albumid"

    if-nez p1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    new-instance v7, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    invoke-direct {v7, p0, p2}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 91
    iget-object v0, p0, Lcom/tencent/open/qzone/Albums;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "photo/list_photo"

    move-object v3, v6

    const-string v4, "GET"

    move-object v5, v7

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 93
    return-void
.end method

.method public uploadPicture(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/tauth/IUiListener;)V
    .locals 14

    .line 111
    new-instance v6, Lcom/tencent/connect/common/BaseApi$TempRequestListener;

    move-object/from16 v0, p6

    invoke-direct {v6, p0, v0}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;-><init>(Lcom/tencent/connect/common/BaseApi;Lcom/tencent/tauth/IUiListener;)V

    .line 112
    const/4 v7, 0x0

    .line 113
    const/4 v8, 0x0

    .line 114
    const/4 v9, 0x0

    .line 116
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .line 117
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v9, v0

    .line 118
    const/16 v0, 0x400

    new-array v10, v0, [B

    .line 119
    const/4 v11, 0x0

    .line 120
    :goto_0
    invoke-virtual {v8, v10}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 121
    const/4 v0, 0x0

    invoke-virtual {v9, v10, v0, v11}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 128
    if-eqz v9, :cond_1

    .line 130
    :try_start_1
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 133
    goto :goto_1

    .line 131
    :catch_0
    move-exception v10

    .line 132
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 134
    :goto_1
    const/4 v9, 0x0

    .line 136
    :cond_1
    if-eqz v8, :cond_6

    .line 138
    :try_start_2
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 141
    goto :goto_2

    .line 139
    :catch_1
    move-exception v10

    .line 140
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 142
    :goto_2
    const/4 v8, 0x0

    goto :goto_7

    .line 124
    :catch_2
    move-exception v10

    .line 125
    :try_start_3
    invoke-virtual {v6, v10}, Lcom/tencent/connect/common/BaseApi$TempRequestListener;->onIOException(Ljava/io/IOException;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 128
    if-eqz v9, :cond_2

    .line 130
    :try_start_4
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 133
    goto :goto_3

    .line 131
    :catch_3
    move-exception v11

    .line 132
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    .line 134
    :goto_3
    const/4 v9, 0x0

    .line 136
    :cond_2
    if-eqz v8, :cond_3

    .line 138
    :try_start_5
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 141
    goto :goto_4

    .line 139
    :catch_4
    move-exception v11

    .line 140
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    .line 142
    :goto_4
    const/4 v8, 0x0

    :cond_3
    return-void

    .line 128
    :catchall_0
    move-exception v12

    if-eqz v9, :cond_4

    .line 130
    :try_start_6
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 133
    goto :goto_5

    .line 131
    :catch_5
    move-exception v13

    .line 132
    invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V

    .line 134
    :goto_5
    const/4 v9, 0x0

    .line 136
    :cond_4
    if-eqz v8, :cond_5

    .line 138
    :try_start_7
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 141
    goto :goto_6

    .line 139
    :catch_6
    move-exception v13

    .line 140
    invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V

    .line 142
    :goto_6
    const/4 v8, 0x0

    :cond_5
    throw v12

    .line 146
    :cond_6
    :goto_7
    invoke-virtual {p0}, Lcom/tencent/open/qzone/Albums;->composeCGIParams()Landroid/os/Bundle;

    move-result-object v10

    .line 147
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 149
    const-string v0, "picture"

    invoke-virtual {v10, v0, v7}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 150
    const-string v0, "photodesc"

    if-nez p2, :cond_7

    const-string v1, ""

    goto :goto_8

    :cond_7
    move-object/from16 v1, p2

    :goto_8
    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string v0, "title"

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    if-eqz p3, :cond_9

    .line 153
    const-string v0, "albumid"

    if-nez p3, :cond_8

    const-string v1, ""

    goto :goto_9

    :cond_8
    move-object/from16 v1, p3

    :goto_9
    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    :cond_9
    const-string v0, "x"

    if-nez p4, :cond_a

    const-string v1, ""

    goto :goto_a

    :cond_a
    move-object/from16 v1, p4

    :goto_a
    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "y"

    if-nez p5, :cond_b

    const-string v1, ""

    goto :goto_b

    :cond_b
    move-object/from16 v1, p5

    :goto_b
    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Lcom/tencent/open/qzone/Albums;->mToken:Lcom/tencent/connect/auth/QQToken;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "photo/upload_pic"

    move-object v3, v10

    const-string v4, "POST"

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Lcom/tencent/open/utils/HttpUtils;->requestAsync(Lcom/tencent/connect/auth/QQToken;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;Lcom/tencent/tauth/IRequestListener;)V

    .line 160
    return-void
.end method

.class public Lo/fgm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Landroid/content/Context;

.field private d:Landroid/os/Handler;

.field private e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;I)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    const-string v0, ""

    iput-object v0, p0, Lo/fgm;->a:Ljava/lang/String;

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lo/fgm;->e:I

    .line 53
    iput-object p1, p0, Lo/fgm;->c:Landroid/content/Context;

    .line 54
    iput-object p2, p0, Lo/fgm;->d:Landroid/os/Handler;

    .line 55
    iput-object p3, p0, Lo/fgm;->a:Ljava/lang/String;

    .line 56
    iput p4, p0, Lo/fgm;->e:I

    .line 57
    return-void
.end method

.method private a(Ljava/io/BufferedOutputStream;Ljava/io/FileInputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V
    .locals 5

    .line 232
    if-eqz p2, :cond_0

    .line 236
    :try_start_0
    invoke-virtual {p2}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 242
    goto :goto_0

    .line 238
    :catch_0
    move-exception v4

    .line 241
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    .line 249
    :try_start_1
    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 255
    goto :goto_1

    .line 251
    :catch_1
    move-exception v4

    .line 254
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    :cond_1
    :goto_1
    if-eqz p3, :cond_2

    .line 262
    :try_start_2
    invoke-virtual {p3}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 268
    goto :goto_2

    .line 264
    :catch_2
    move-exception v4

    .line 267
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    :cond_2
    :goto_2
    if-eqz p4, :cond_3

    .line 275
    :try_start_3
    invoke-virtual {p4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 281
    goto :goto_3

    .line 277
    :catch_3
    move-exception v4

    .line 280
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    :cond_3
    :goto_3
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 143
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const v2, 0x89789

    goto :goto_0

    :cond_0
    const v2, 0x89787

    .line 145
    :goto_0
    iget-object v0, p0, Lo/fgm;->d:Landroid/os/Handler;

    invoke-virtual {v0, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    .line 146
    invoke-virtual {v3}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "Version"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lo/fgm;->d:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 148
    return-void
.end method

.method private b(Ljava/net/URI;)V
    .locals 17

    .line 86
    const/4 v4, 0x0

    .line 87
    const/4 v5, 0x0

    .line 89
    new-instance v6, Lorg/apache/http/client/methods/HttpPost;

    move-object/from16 v0, p1

    invoke-direct {v6, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/net/URI;)V

    .line 90
    new-instance v7, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v7}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 91
    invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.connection.timeout"

    const/16 v2, 0x2710

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 92
    invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.socket.timeout"

    const/16 v2, 0x2710

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setParameter(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/params/HttpParams;

    .line 93
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uri======="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    new-instance v9, Lo/fgo;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fgm;->c:Landroid/content/Context;

    invoke-direct {v9, v0}, Lo/fgo;-><init>(Landroid/content/Context;)V

    .line 96
    invoke-virtual {v9, v6, v7}, Lo/fgo;->e(Lorg/apache/http/HttpRequest;Lorg/apache/http/client/HttpClient;)V

    .line 98
    new-instance v10, Lo/fgn;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fgm;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    iget v1, v1, Lo/fgm;->e:I

    invoke-direct {v10, v0, v1}, Lo/fgn;-><init>(Landroid/content/Context;I)V

    .line 101
    :try_start_0
    new-instance v8, Lorg/apache/http/entity/StringEntity;

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/fgm;->a:Ljava/lang/String;

    invoke-virtual {v10, v0}, Lo/fgn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v8, v0, v1}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-virtual {v6, v8}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 103
    invoke-interface {v7, v6}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v11

    .line 104
    invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v12

    .line 105
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest [postRequest] responseCode: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/16 v0, 0xc8

    if-ne v0, v12, :cond_0

    .line 108
    new-instance v13, Lo/fgp;

    invoke-direct {v13, v11}, Lo/fgp;-><init>(Lorg/apache/http/HttpResponse;)V

    .line 109
    invoke-virtual {v13}, Lo/fgp;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/fgn;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 110
    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lo/fgm;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 111
    invoke-virtual {v10}, Lo/fgn;->b()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v5, v0

    .line 122
    :cond_0
    :try_start_1
    invoke-virtual {v6}, Lorg/apache/http/client/methods/HttpPost;->abort()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 136
    goto :goto_0

    .line 124
    :catch_0
    move-exception v11

    .line 126
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest [postRequest] "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :try_start_2
    invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 135
    goto :goto_0

    .line 132
    :catch_1
    move-exception v12

    .line 134
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest [postRequest] "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    :goto_0
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5}, Lo/fgm;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    goto/16 :goto_3

    .line 114
    :catch_2
    move-exception v11

    .line 116
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 122
    :try_start_4
    invoke-virtual {v6}, Lorg/apache/http/client/methods/HttpPost;->abort()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 136
    goto :goto_1

    .line 124
    :catch_3
    move-exception v11

    .line 126
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest [postRequest] "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :try_start_5
    invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 135
    goto :goto_1

    .line 132
    :catch_4
    move-exception v12

    .line 134
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest [postRequest] "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    :goto_1
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5}, Lo/fgm;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    goto :goto_3

    .line 120
    :catchall_0
    move-exception v14

    .line 122
    :try_start_6
    invoke-virtual {v6}, Lorg/apache/http/client/methods/HttpPost;->abort()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 136
    goto :goto_2

    .line 124
    :catch_5
    move-exception v15

    .line 126
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest [postRequest] "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :try_start_7
    invoke-interface {v7}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 135
    goto :goto_2

    .line 132
    :catch_6
    move-exception v16

    .line 134
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postRequest [postRequest] "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    :goto_2
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5}, Lo/fgm;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    throw v14

    .line 139
    :goto_3
    return-void
.end method

.method static synthetic d(Lo/fgm;Ljava/net/URI;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/fgm;->b(Ljava/net/URI;)V

    return-void
.end method

.method static synthetic e(Lo/fgm;)Landroid/content/Context;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/fgm;->c:Landroid/content/Context;

    return-object v0
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 21

    .line 152
    const/4 v4, 0x0

    .line 153
    const/4 v5, 0x0

    .line 154
    const/4 v6, 0x0

    .line 155
    const/4 v7, 0x0

    .line 156
    const/4 v8, 0x0

    .line 160
    :try_start_0
    new-instance v9, Ljava/io/File;

    move-object/from16 v0, p1

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 161
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    new-instance v10, Ljava/io/File;

    invoke-virtual {v9}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 166
    const/4 v11, 0x0

    .line 224
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5, v6, v7}, Lo/fgm;->a(Ljava/io/BufferedOutputStream;Ljava/io/FileInputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V

    .line 166
    return-object v11

    .line 170
    :cond_0
    const-string v10, ".html"

    .line 171
    :try_start_1
    invoke-virtual {v9}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v11

    .line 172
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    .line 173
    const-string v0, "."

    invoke-virtual {v12, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v12, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    .line 175
    new-instance v0, Ljava/io/FileInputStream;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v5, v0

    .line 176
    new-instance v0, Ljava/util/zip/ZipInputStream;

    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-direct {v1, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    .line 179
    :goto_0
    invoke-virtual {v6}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 184
    const/16 v0, 0x200

    new-array v15, v0, [B

    .line 185
    const/16 v16, 0x0

    .line 186
    new-instance v0, Ljava/io/File;

    move-object v1, v8

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 187
    new-instance v0, Ljava/io/File;

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v18, v0

    .line 188
    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 190
    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 192
    const/16 v19, 0x0

    .line 224
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5, v6, v7}, Lo/fgm;->a(Ljava/io/BufferedOutputStream;Ljava/io/FileInputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V

    .line 192
    return-object v19

    .line 195
    :cond_1
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 196
    new-instance v0, Ljava/io/FileOutputStream;

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    invoke-direct {v1, v8, v2}, Lo/fgm;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    move-object v7, v0

    .line 197
    new-instance v0, Ljava/io/BufferedOutputStream;

    const/16 v1, 0x200

    invoke-direct {v0, v7, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    move-object v4, v0

    .line 198
    :goto_1
    move/from16 v0, v16

    const/high16 v1, 0x6400000

    if-gt v0, v1, :cond_2

    const/4 v0, 0x0

    const/16 v1, 0x200

    invoke-virtual {v6, v15, v0, v1}, Ljava/util/zip/ZipInputStream;->read([BII)I

    move-result v0

    move v14, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 200
    const/4 v0, 0x0

    invoke-virtual {v4, v15, v0, v14}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 201
    add-int v16, v16, v14

    goto :goto_1

    .line 203
    :cond_2
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->flush()V

    .line 204
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    .line 205
    invoke-virtual {v6}, Ljava/util/zip/ZipInputStream;->closeEntry()V

    .line 206
    move/from16 v0, v16

    const/high16 v1, 0x6400000

    if-le v0, v1, :cond_3

    .line 208
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "File being unzipped is huge."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 210
    :cond_3
    goto/16 :goto_0

    .line 224
    :cond_4
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5, v6, v7}, Lo/fgm;->a(Ljava/io/BufferedOutputStream;Ljava/io/FileInputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V

    .line 226
    goto :goto_2

    .line 212
    :catch_0
    move-exception v9

    .line 214
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip RuntimeException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 224
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5, v6, v7}, Lo/fgm;->a(Ljava/io/BufferedOutputStream;Ljava/io/FileInputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V

    .line 226
    goto :goto_2

    .line 216
    :catch_1
    move-exception v9

    .line 218
    const-string v0, "GetAggreement"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip Exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 219
    const/4 v10, 0x0

    .line 224
    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5, v6, v7}, Lo/fgm;->a(Ljava/io/BufferedOutputStream;Ljava/io/FileInputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V

    .line 219
    return-object v10

    .line 224
    :catchall_0
    move-exception v20

    move-object/from16 v0, p0

    invoke-direct {v0, v4, v5, v6, v7}, Lo/fgm;->a(Ljava/io/BufferedOutputStream;Ljava/io/FileInputStream;Ljava/util/zip/ZipInputStream;Ljava/io/FileOutputStream;)V

    .line 226
    throw v20

    .line 228
    :goto_2
    return-object v8
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 288
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 289
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3

    .line 290
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 291
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v5

    .line 292
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 294
    return-object v3

    .line 298
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "File is outside extraction target directory."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 62
    new-instance v1, Ljava/lang/Thread;

    new-instance v0, Lo/fgm$5;

    invoke-direct {v0, p0}, Lo/fgm$5;-><init>(Lo/fgm;)V

    invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 81
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 82
    return-void
.end method

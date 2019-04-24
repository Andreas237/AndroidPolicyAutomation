.class public Lo/dub;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/dub;


# instance fields
.field private b:Ljava/util/concurrent/ExecutorService;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    sput-object v0, Lo/dub;->a:Lo/dub;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FileUtil"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dub;->b:Ljava/util/concurrent/ExecutorService;

    .line 59
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dub;->e:Landroid/content/Context;

    .line 60
    invoke-direct {p0}, Lo/dub;->c()V

    .line 61
    return-void
.end method

.method private static b(Ljava/lang/String;I)Ljava/lang/String;
    .locals 6

    .line 461
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 465
    goto :goto_0

    .line 462
    :catch_0
    move-exception v5

    .line 463
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StringIndexOutOfBoundsException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/StringIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    const/4 v0, 0x0

    return-object v0

    .line 466
    :goto_0
    return-object v4
.end method

.method private static b(Ljava/io/FileInputStream;)V
    .locals 5

    .line 505
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 507
    :try_start_0
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 510
    goto :goto_0

    .line 508
    :catch_0
    move-exception v4

    .line 509
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    :cond_0
    :goto_0
    return-void
.end method

.method private b(Ljava/lang/String;Lo/dua;ILjava/lang/String;)V
    .locals 4

    .line 184
    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    const-string v0, ".png"

    .line 185
    invoke-static {p1}, Lo/dud;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 188
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v3

    .line 189
    if-nez v3, :cond_0

    .line 190
    const-string v0, "PLGACHIEVE_FileUtil"

    const-string v1, "downloadMedalPng delete file failed"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    :cond_0
    if-eqz p2, :cond_1

    .line 195
    invoke-interface {p2, p3}, Lo/dua;->b(I)V

    .line 197
    :cond_1
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/dub;
    .locals 6

    .line 45
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    sget-object v0, Lo/dub;->a:Lo/dub;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 47
    const-class v4, Lo/dub;

    monitor-enter v4

    .line 48
    :try_start_0
    sget-object v0, Lo/dub;->a:Lo/dub;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 49
    new-instance v0, Lo/dub;

    invoke-direct {v0, p0}, Lo/dub;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dub;->a:Lo/dub;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 53
    :cond_1
    :goto_0
    sget-object v0, Lo/dub;->a:Lo/dub;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 86
    iget-object v0, p0, Lo/dub;->e:Landroid/content/Context;

    const-string v1, "isNeedDelOldMedalDir"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 87
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteDirWihtFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-virtual {p0}, Lo/dub;->e()V

    .line 90
    iget-object v0, p0, Lo/dub;->e:Landroid/content/Context;

    const-string v1, "isNeedDelOldMedalDir"

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_0
    return-void
.end method

.method private static c(Ljava/io/InputStream;)V
    .locals 5

    .line 485
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 487
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 490
    goto :goto_0

    .line 488
    :catch_0
    move-exception v4

    .line 489
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    :cond_0
    :goto_0
    return-void
.end method

.method private c(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V
    .locals 4

    .line 201
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 203
    :try_start_0
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 206
    goto :goto_0

    .line 204
    :catch_0
    move-exception v3

    .line 205
    const-string v0, "PLGACHIEVE_FileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadMedalPng download IOException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 211
    :try_start_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 214
    goto :goto_1

    .line 212
    :catch_1
    move-exception v3

    .line 213
    const-string v0, "PLGACHIEVE_FileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadMedalPng download IOException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :cond_1
    :goto_1
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Lo/dua;)V
    .locals 15

    .line 126
    const/4 v4, 0x0

    .line 127
    const/4 v5, 0x0

    .line 128
    const/4 v6, -0x1

    .line 129
    const-string v7, "faild"

    .line 130
    const/4 v8, 0x0

    .line 132
    :try_start_0
    new-instance v9, Ljava/net/URL;

    move-object/from16 v0, p1

    invoke-direct {v9, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v9}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v8, v0

    goto :goto_0

    .line 137
    :cond_0
    invoke-virtual {v9}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v8, v0

    .line 139
    :goto_0
    const/16 v0, 0x2710

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 140
    const/16 v0, 0x2710

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 141
    const-string v0, "GET"

    invoke-virtual {v8, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 142
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v10

    .line 143
    const-string v0, "PLGACHIEVE_FileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "download resCode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const/16 v0, 0xc8

    if-ne v0, v10, :cond_3

    .line 145
    invoke-virtual {v8}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 146
    new-instance v11, Ljava/io/File;

    move-object/from16 v0, p2

    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 147
    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 148
    invoke-virtual {v11}, Ljava/io/File;->createNewFile()Z

    move-result v12

    .line 149
    const-string v0, "PLGACHIEVE_FileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "create_result is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    :cond_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    .line 153
    const/16 v0, 0x400

    new-array v12, v0, [B

    .line 155
    :goto_1
    invoke-virtual {v4, v12}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v13, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 156
    const/4 v0, 0x0

    invoke-virtual {v5, v12, v0, v13}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_1

    .line 158
    :cond_2
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    move v6, v10

    .line 170
    :cond_3
    invoke-direct {p0, v4, v5}, Lo/dub;->c(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V

    .line 171
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-direct {p0, v0, v1, v6, v7}, Lo/dub;->b(Ljava/lang/String;Lo/dua;ILjava/lang/String;)V

    .line 172
    invoke-direct {p0, v8}, Lo/dub;->e(Ljava/net/HttpURLConnection;)V

    .line 173
    goto/16 :goto_2

    .line 161
    :catch_0
    move-exception v9

    .line 162
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadMedalPng download MalformedURLException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const/4 v6, -0x1

    .line 164
    invoke-virtual {v9}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 170
    invoke-direct {p0, v4, v5}, Lo/dub;->c(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V

    .line 171
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-direct {p0, v0, v1, v6, v7}, Lo/dub;->b(Ljava/lang/String;Lo/dua;ILjava/lang/String;)V

    .line 172
    invoke-direct {p0, v8}, Lo/dub;->e(Ljava/net/HttpURLConnection;)V

    .line 173
    goto :goto_2

    .line 165
    :catch_1
    move-exception v9

    .line 166
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadMedalPng download IOException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v6, -0x1

    .line 168
    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 170
    invoke-direct {p0, v4, v5}, Lo/dub;->c(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V

    .line 171
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-direct {p0, v0, v1, v6, v7}, Lo/dub;->b(Ljava/lang/String;Lo/dua;ILjava/lang/String;)V

    .line 172
    invoke-direct {p0, v8}, Lo/dub;->e(Ljava/net/HttpURLConnection;)V

    .line 173
    goto :goto_2

    .line 170
    :catchall_0
    move-exception v14

    invoke-direct {p0, v4, v5}, Lo/dub;->c(Ljava/io/InputStream;Ljava/io/FileOutputStream;)V

    .line 171
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-direct {p0, v0, v1, v6, v7}, Lo/dub;->b(Ljava/lang/String;Lo/dua;ILjava/lang/String;)V

    .line 172
    invoke-direct {p0, v8}, Lo/dub;->e(Ljava/net/HttpURLConnection;)V

    .line 173
    throw v14

    .line 174
    :goto_2
    return-void
.end method

.method private static c(Ljava/util/zip/ZipInputStream;)V
    .locals 5

    .line 515
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 517
    :try_start_0
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 520
    goto :goto_0

    .line 518
    :catch_0
    move-exception v4

    .line 519
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 522
    :cond_0
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 71
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v3

    .line 74
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v5

    .line 76
    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const/4 v0, 0x1

    return v0

    .line 81
    :cond_0
    goto :goto_0

    .line 79
    :catch_0
    move-exception v3

    .line 80
    const-string v0, "PLGACHIEVE_FileUtil"

    invoke-virtual {v3}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Lo/dua;)V
    .locals 17

    .line 357
    const/4 v4, 0x0

    .line 358
    const/4 v5, 0x0

    .line 359
    const/4 v6, 0x0

    .line 360
    const/4 v7, 0x0

    .line 361
    const/4 v8, 0x0

    .line 363
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 364
    new-instance v0, Ljava/util/zip/ZipInputStream;

    invoke-direct {v0, v4}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v5, v0

    .line 367
    :goto_0
    invoke-virtual {v5}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v9

    if-eqz v9, :cond_4

    .line 368
    invoke-virtual {v9}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v10

    .line 369
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v10, v1}, Lo/dub;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 370
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "zip is too max!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    goto :goto_0

    .line 373
    :cond_0
    invoke-virtual {v9}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 374
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v10, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 375
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dub;->e(Ljava/lang/String;)Z

    move-result v11

    .line 376
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createFileDir="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    goto/16 :goto_0

    .line 378
    :cond_1
    new-instance v11, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 379
    invoke-virtual {v11}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v12

    .line 380
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 381
    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    move-result v13

    .line 382
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parentFile mkdir status="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    :cond_2
    invoke-virtual {v11}, Ljava/io/File;->createNewFile()Z

    move-result v13

    .line 385
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 387
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 389
    const/16 v0, 0x400

    new-array v15, v0, [B

    .line 390
    :goto_1
    add-int/lit16 v0, v7, 0x400

    const/high16 v1, 0x500000

    if-gt v0, v1, :cond_3

    invoke-virtual {v5, v15}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v0

    move v14, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 391
    const/4 v0, 0x0

    invoke-virtual {v6, v15, v0, v14}, Ljava/io/FileOutputStream;->write([BII)V

    .line 392
    add-int/2addr v7, v14

    .line 393
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 395
    :cond_3
    goto/16 :goto_0

    .line 407
    :cond_4
    invoke-static {v4}, Lo/dub;->b(Ljava/io/FileInputStream;)V

    .line 408
    invoke-static {v5}, Lo/dub;->c(Ljava/util/zip/ZipInputStream;)V

    .line 409
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 410
    goto/16 :goto_2

    .line 397
    :catch_0
    move-exception v9

    .line 398
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FileNotFoundException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 399
    const/4 v8, -0x3

    .line 407
    invoke-static {v4}, Lo/dub;->b(Ljava/io/FileInputStream;)V

    .line 408
    invoke-static {v5}, Lo/dub;->c(Ljava/util/zip/ZipInputStream;)V

    .line 409
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 410
    goto/16 :goto_2

    .line 400
    :catch_1
    move-exception v9

    .line 401
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 402
    const/4 v8, -0x3

    .line 407
    invoke-static {v4}, Lo/dub;->b(Ljava/io/FileInputStream;)V

    .line 408
    invoke-static {v5}, Lo/dub;->c(Ljava/util/zip/ZipInputStream;)V

    .line 409
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 410
    goto :goto_2

    .line 403
    :catch_2
    move-exception v9

    .line 404
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IllegalArgumentException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 405
    const/4 v8, -0x3

    .line 407
    invoke-static {v4}, Lo/dub;->b(Ljava/io/FileInputStream;)V

    .line 408
    invoke-static {v5}, Lo/dub;->c(Ljava/util/zip/ZipInputStream;)V

    .line 409
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 410
    goto :goto_2

    .line 407
    :catchall_0
    move-exception v16

    invoke-static {v4}, Lo/dub;->b(Ljava/io/FileInputStream;)V

    .line 408
    invoke-static {v5}, Lo/dub;->c(Ljava/util/zip/ZipInputStream;)V

    .line 409
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 410
    throw v16

    .line 411
    :goto_2
    new-instance v9, Ljava/io/File;

    move-object/from16 v0, p2

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 412
    invoke-virtual {v9}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    if-ne v0, v8, :cond_5

    .line 413
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/dua;->b(I)V

    goto :goto_3

    .line 415
    :cond_5
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip and the dir fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    move-object/from16 v0, p3

    const/4 v1, -0x3

    invoke-interface {v0, v1}, Lo/dua;->b(I)V

    .line 418
    :goto_3
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/dub;->a(Ljava/lang/String;)V

    .line 419
    return-void
.end method

.method private static e(Ljava/io/FileOutputStream;)V
    .locals 5

    .line 495
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 497
    :try_start_0
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 500
    goto :goto_0

    .line 498
    :catch_0
    move-exception v4

    .line 499
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    :cond_0
    :goto_0
    return-void
.end method

.method private e(Ljava/net/HttpURLConnection;)V
    .locals 1

    .line 177
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 178
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 180
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/dub;Ljava/lang/String;Ljava/lang/String;Lo/dua;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lo/dub;->d(Ljava/lang/String;Ljava/lang/String;Lo/dua;)V

    return-void
.end method

.method private static e(Ljava/lang/String;)Z
    .locals 6

    .line 470
    if-nez p0, :cond_0

    .line 471
    const/4 v0, 0x0

    return v0

    .line 473
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 474
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 475
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v5

    .line 476
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mkdirRet:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v5, :cond_1

    const-string v3, "success"

    goto :goto_0

    :cond_1
    const-string v3, "fail"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    if-nez v5, :cond_2

    .line 478
    const/4 v0, 0x0

    return v0

    .line 481
    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 422
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    return-void

    .line 425
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 426
    invoke-virtual {p0, v1}, Lo/dub;->b(Ljava/io/File;)V

    .line 427
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lo/dua;)V
    .locals 22

    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dub;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "achievemedal"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 226
    const/4 v5, 0x0

    .line 227
    const/4 v6, 0x0

    .line 228
    const/4 v7, -0x1

    .line 231
    :try_start_0
    new-instance v8, Ljava/net/URL;

    move-object/from16 v0, p1

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 234
    invoke-virtual {v8}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljavax/net/ssl/HttpsURLConnection;

    goto :goto_0

    .line 238
    :cond_0
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/net/HttpURLConnection;

    .line 240
    :goto_0
    const/16 v0, 0x2710

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 241
    const/16 v0, 0x2710

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 242
    const-string v0, "GET"

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 244
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    move v7, v0

    .line 245
    const/16 v0, 0xc8

    if-ne v0, v7, :cond_6

    .line 246
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v5, v0

    .line 248
    const/16 v0, 0x2f

    invoke-virtual {v4, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v10

    .line 249
    invoke-static {v4, v10}, Lo/dub;->b(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v11

    .line 251
    invoke-static {v4}, Lo/dub;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 252
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createFileDir false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    invoke-static {v5}, Lo/dub;->c(Ljava/io/InputStream;)V

    .line 295
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 296
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 297
    move-object/from16 v0, p3

    invoke-interface {v0, v7}, Lo/dua;->b(I)V

    .line 253
    :cond_1
    return-void

    .line 258
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 261
    new-instance v13, Ljava/io/File;

    invoke-direct {v13, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 262
    add-int/lit8 v0, v10, 0x1

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v12, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .line 263
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 264
    new-instance v0, Ljava/io/File;

    move-object v1, v15

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 266
    new-instance v0, Ljava/io/FileOutputStream;

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 267
    const/16 v0, 0x400

    new-array v0, v0, [B

    move-object/from16 v17, v0

    .line 269
    :goto_1
    move-object/from16 v0, v17

    invoke-virtual {v5, v0}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v18, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 270
    move-object/from16 v0, v17

    const/4 v1, 0x0

    move/from16 v2, v18

    invoke-virtual {v6, v0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_1

    .line 272
    :cond_3
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V

    .line 274
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v19

    .line 275
    if-nez v19, :cond_5

    .line 276
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 277
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->delete()Z

    move-result v20

    .line 278
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteRet = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    :cond_4
    const/4 v7, -0x1

    goto :goto_2

    .line 282
    :cond_5
    const/4 v7, 0x0

    .line 283
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Lo/dub;->d(Ljava/lang/String;Lo/dua;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 294
    :cond_6
    :goto_2
    invoke-static {v5}, Lo/dub;->c(Ljava/io/InputStream;)V

    .line 295
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 296
    const/4 v0, 0x0

    if-eq v0, v7, :cond_8

    .line 297
    move-object/from16 v0, p3

    invoke-interface {v0, v7}, Lo/dua;->b(I)V

    goto/16 :goto_3

    .line 287
    :catch_0
    move-exception v8

    .line 288
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MalformedURLException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 289
    const/4 v7, -0x1

    .line 294
    invoke-static {v5}, Lo/dub;->c(Ljava/io/InputStream;)V

    .line 295
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 296
    const/4 v0, 0x0

    if-eq v0, v7, :cond_8

    .line 297
    move-object/from16 v0, p3

    invoke-interface {v0, v7}, Lo/dua;->b(I)V

    goto :goto_3

    .line 290
    :catch_1
    move-exception v8

    .line 291
    const-string v0, "PLGACHIEVE_FileUtil"

    const/4 v1, 0x2

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IOException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 292
    const/4 v7, -0x1

    .line 294
    invoke-static {v5}, Lo/dub;->c(Ljava/io/InputStream;)V

    .line 295
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 296
    const/4 v0, 0x0

    if-eq v0, v7, :cond_8

    .line 297
    move-object/from16 v0, p3

    invoke-interface {v0, v7}, Lo/dua;->b(I)V

    goto :goto_3

    .line 294
    :catchall_0
    move-exception v21

    invoke-static {v5}, Lo/dub;->c(Ljava/io/InputStream;)V

    .line 295
    invoke-static {v6}, Lo/dub;->e(Ljava/io/FileOutputStream;)V

    .line 296
    const/4 v0, 0x0

    if-eq v0, v7, :cond_7

    .line 297
    move-object/from16 v0, p3

    invoke-interface {v0, v7}, Lo/dua;->b(I)V

    .line 299
    :cond_7
    throw v21

    .line 300
    :cond_8
    :goto_3
    return-void
.end method

.method public b(Ljava/io/File;)V
    .locals 10

    .line 429
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 430
    :cond_0
    return-void

    .line 432
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 433
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v3

    .line 434
    const-string v0, "PLGACHIEVE_FileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteDirZipFile result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    return-void

    .line 437
    :cond_2
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 438
    const/4 v0, 0x0

    if-ne v0, v3, :cond_3

    .line 439
    return-void

    .line 441
    :cond_3
    array-length v4, v3

    .line 442
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_5

    .line 443
    aget-object v6, v3, v5

    .line 444
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 445
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 446
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    .line 447
    const-string v0, "."

    invoke-virtual {v7, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    .line 448
    const-string v0, "zip"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 449
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v9

    .line 450
    const-string v0, "PLGACHIEVE_FileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteDirZipFile result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 456
    :cond_5
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dua;)V
    .locals 5

    .line 113
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    return-void

    .line 116
    :cond_0
    invoke-static {p2}, Lo/dzs;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 117
    invoke-static {v2}, Lo/dud;->b(Ljava/lang/String;)Z

    move-result v3

    .line 118
    if-eqz v3, :cond_1

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 120
    invoke-direct {p0, p1, v4, p4}, Lo/dub;->c(Ljava/lang/String;Ljava/lang/String;Lo/dua;)V

    .line 122
    :cond_1
    return-void
.end method

.method public d()V
    .locals 3

    .line 107
    invoke-virtual {p0}, Lo/dub;->e()V

    .line 108
    iget-object v0, p0, Lo/dub;->e:Landroid/content/Context;

    const-string v1, "_medalTextureDownload"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lo/dub;->e:Landroid/content/Context;

    const-string v1, "clearMedalResCache"

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    return-void
.end method

.method public d(Ljava/lang/String;Lo/dua;)V
    .locals 4

    .line 335
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dub;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "achievemedal"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dub;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "achievemedal"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 338
    iget-object v0, p0, Lo/dub;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 339
    iget-object v0, p0, Lo/dub;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dub$3;

    invoke-direct {v1, p0, v2, v3, p2}, Lo/dub$3;-><init>(Lo/dub;Ljava/lang/String;Ljava/lang/String;Lo/dua;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 346
    :cond_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dub;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "achievemedal"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 99
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 100
    invoke-virtual {p0, v3}, Lo/dub;->e(Ljava/io/File;)V

    .line 101
    return-void
.end method

.method public e(Ljava/io/File;)V
    .locals 8

    .line 307
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_1

    .line 308
    :cond_0
    return-void

    .line 310
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 311
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 312
    return-void

    .line 314
    :cond_2
    array-length v4, v3

    .line 315
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_5

    .line 316
    aget-object v6, v3, v5

    .line 317
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 318
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 319
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v7

    .line 320
    const-string v0, "PLGACHIEVE_FileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteDirWihtFile result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 322
    invoke-virtual {p0, v6}, Lo/dub;->e(Ljava/io/File;)V

    .line 315
    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 326
    :cond_5
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v5

    .line 327
    const-string v0, "PLGACHIEVE_FileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "deleteDirWihtFile result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    return-void
.end method

.class public Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final MAXSIZE:I = 0xa00000

.field private static final TAG:Ljava/lang/String; = "UIDV_RecommendFileUtil"

.field private static volatile instance:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil; = null


# instance fields
.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->instance:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FileUtil"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->mContext:Landroid/content/Context;

    .line 62
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 63
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 39
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->sanitzeFileName(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->download(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->unZip(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    return-void
.end method

.method private static closeFileInputStream(Ljava/io/FileInputStream;)V
    .locals 5

    .line 414
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeFileOutputStream"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 417
    :try_start_0
    invoke-virtual {p0}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 420
    goto :goto_0

    .line 418
    :catch_0
    move-exception v4

    .line 419
    const-string v0, "UIDV_RecommendFileUtil"

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

    .line 422
    :cond_0
    :goto_0
    return-void
.end method

.method private static closeFileOutputStream(Ljava/io/FileOutputStream;)V
    .locals 5

    .line 403
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeFileOutputStream"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 406
    :try_start_0
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 409
    goto :goto_0

    .line 407
    :catch_0
    move-exception v4

    .line 408
    const-string v0, "UIDV_RecommendFileUtil"

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

    .line 411
    :cond_0
    :goto_0
    return-void
.end method

.method private static closeInputStream(Ljava/io/InputStream;)V
    .locals 5

    .line 392
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeInputStream"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 395
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 398
    goto :goto_0

    .line 396
    :catch_0
    move-exception v4

    .line 397
    const-string v0, "UIDV_RecommendFileUtil"

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

    .line 400
    :cond_0
    :goto_0
    return-void
.end method

.method private static closeZipInputStream(Ljava/util/zip/ZipInputStream;)V
    .locals 5

    .line 425
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeZipInputStream"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 428
    :try_start_0
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 431
    goto :goto_0

    .line 429
    :catch_0
    move-exception v4

    .line 430
    const-string v0, "UIDV_RecommendFileUtil"

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

    .line 433
    :cond_0
    :goto_0
    return-void
.end method

.method private static createFileDir(Ljava/lang/String;)Z
    .locals 6

    .line 377
    if-nez p0, :cond_0

    .line 378
    const/4 v0, 0x0

    return v0

    .line 380
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 381
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 382
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v5

    .line 383
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mkdirRet:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz v5, :cond_1

    const-string v3, "sucess"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    if-nez v5, :cond_2

    .line 385
    const/4 v0, 0x0

    return v0

    .line 388
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private download(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
    .locals 22

    .line 143
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const/4 v4, 0x0

    .line 146
    const/4 v5, 0x0

    .line 147
    const/4 v6, -0x1

    .line 148
    const-string v7, "download fail"

    .line 151
    :try_start_0
    new-instance v8, Ljava/net/URL;

    move-object/from16 v0, p1

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v8}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "https"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljavax/net/ssl/HttpsURLConnection;

    goto :goto_0

    .line 159
    :cond_0
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/net/HttpURLConnection;

    .line 161
    :goto_0
    const/16 v0, 0x2710

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 162
    const/16 v0, 0x2710

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 163
    const-string v0, "GET"

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    move v6, v0

    .line 166
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/16 v0, 0xc8

    if-ne v0, v6, :cond_5

    .line 168
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v4, v0

    .line 169
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    move-object/from16 v0, p2

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v10

    .line 172
    move-object/from16 v0, p2

    invoke-static {v0, v10}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->getFileDir(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v11

    .line 174
    invoke-static/range {p2 .. p2}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->createFileDir(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 175
    const-string v0, "UIDV_RecommendFileUtil"

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

    .line 224
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 225
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 226
    move-object/from16 v0, p3

    invoke-interface {v0, v6, v7}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 176
    return-void

    .line 179
    :cond_1
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "savePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 184
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zipPath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    new-instance v13, Ljava/io/File;

    invoke-direct {v13, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 187
    add-int/lit8 v0, v10, 0x1

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v12, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .line 188
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fileName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
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

    .line 190
    new-instance v0, Ljava/io/File;

    move-object v1, v15

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 192
    new-instance v0, Ljava/io/FileOutputStream;

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    .line 193
    const/16 v0, 0x400

    new-array v0, v0, [B

    move-object/from16 v17, v0

    .line 195
    :goto_1
    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v18, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 196
    move-object/from16 v0, v17

    const/4 v1, 0x0

    move/from16 v2, v18

    invoke-virtual {v5, v0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_1

    .line 198
    :cond_2
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V

    .line 200
    move-object/from16 v0, v16

    invoke-virtual {v0, v13}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v19

    .line 201
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isRenameOk = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    if-nez v19, :cond_4

    .line 203
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 204
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->delete()Z

    move-result v20

    .line 205
    const-string v0, "UIDV_RecommendFileUtil"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 207
    :cond_3
    const/4 v6, -0x1

    .line 208
    const-string v0, "rename fail"

    move-object v7, v0

    goto :goto_2

    .line 210
    :cond_4
    const/4 v6, 0x0

    .line 211
    const-string v0, "success"

    move-object v7, v0

    .line 224
    :cond_5
    :goto_2
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 225
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 226
    move-object/from16 v0, p3

    invoke-interface {v0, v6, v7}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 227
    goto/16 :goto_3

    .line 215
    :catch_0
    move-exception v8

    .line 216
    const-string v0, "UIDV_RecommendFileUtil"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    const/4 v6, -0x1

    .line 218
    invoke-virtual {v8}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 224
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 225
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 226
    move-object/from16 v0, p3

    invoke-interface {v0, v6, v7}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 227
    goto :goto_3

    .line 219
    :catch_1
    move-exception v8

    .line 220
    const-string v0, "UIDV_RecommendFileUtil"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const/4 v6, -0x1

    .line 222
    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 224
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 225
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 226
    move-object/from16 v0, p3

    invoke-interface {v0, v6, v7}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 227
    goto :goto_3

    .line 224
    :catchall_0
    move-exception v21

    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeInputStream(Ljava/io/InputStream;)V

    .line 225
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 226
    move-object/from16 v0, p3

    invoke-interface {v0, v6, v7}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;->onResponce(ILjava/lang/String;)V

    .line 227
    throw v21

    .line 228
    :goto_3
    return-void
.end method

.method private static getFileDir(Ljava/lang/String;I)Ljava/lang/String;
    .locals 6

    .line 368
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 372
    goto :goto_0

    .line 369
    :catch_0
    move-exception v5

    .line 370
    const-string v0, "UIDV_RecommendFileUtil"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    const/4 v0, 0x0

    return-object v0

    .line 373
    :goto_0
    return-object v4
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;
    .locals 6

    .line 48
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getInstance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->instance:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 50
    const-class v4, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    monitor-enter v4

    .line 51
    :try_start_0
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->instance:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 52
    new-instance v0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->instance:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :cond_0
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 56
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->instance:Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;

    return-object v0
.end method

.method private sanitzeFileName(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 73
    :try_start_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v5

    .line 75
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {v5, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v5

    .line 76
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v6}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v7

    .line 78
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    invoke-static {v7, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    move-result-object v7

    .line 79
    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    const/4 v0, 0x1

    return v0

    .line 84
    :cond_0
    goto :goto_0

    .line 82
    :catch_0
    move-exception v4

    .line 83
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private unZip(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 17

    .line 280
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    const/4 v4, 0x0

    .line 282
    const/4 v5, 0x0

    .line 283
    const/4 v6, 0x0

    .line 284
    const/4 v7, 0x0

    .line 286
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 287
    new-instance v0, Ljava/util/zip/ZipInputStream;

    invoke-direct {v0, v4}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v5, v0

    .line 290
    const/4 v10, 0x0

    .line 291
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileInputStream :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " zipInputStream :"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    :goto_0
    add-int/lit16 v0, v10, 0x400

    const/high16 v1, 0xa00000

    if-gt v0, v1, :cond_5

    invoke-virtual {v5}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v8

    if-eqz v8, :cond_5

    .line 294
    invoke-virtual {v8}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v9

    .line 295
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "szName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v9, v1}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->sanitzeFileName(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 297
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outPath is not sanitze"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    goto :goto_0

    .line 300
    :cond_0
    invoke-virtual {v8}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 301
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "zipEntry.isDirectory()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {v9, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 303
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->createFileDir(Ljava/lang/String;)Z

    move-result v11

    .line 304
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mkdir status="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    goto/16 :goto_0

    .line 306
    :cond_1
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "zipEntry.isFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    new-instance v11, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 308
    invoke-virtual {v11}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v12

    .line 309
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 310
    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    move-result v13

    .line 311
    const-string v0, "UIDV_RecommendFileUtil"

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    :cond_2
    invoke-virtual {v11}, Ljava/io/File;->createNewFile()Z

    move-result v13

    .line 314
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    invoke-static {v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 316
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 318
    const/16 v0, 0x400

    new-array v15, v0, [B

    .line 319
    :goto_1
    add-int/lit16 v0, v10, 0x400

    const/high16 v1, 0xa00000

    if-gt v0, v1, :cond_3

    invoke-virtual {v5, v15}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v0

    move v14, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 320
    const/4 v0, 0x0

    invoke-virtual {v6, v15, v0, v14}, Ljava/io/FileOutputStream;->write([BII)V

    .line 321
    add-int/2addr v10, v14

    .line 322
    invoke-virtual {v6}, Ljava/io/FileOutputStream;->flush()V

    goto :goto_1

    .line 324
    :cond_3
    const/high16 v0, 0xa00000

    if-le v10, v0, :cond_4

    .line 325
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "File being unzipped is too big."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 327
    :cond_4
    goto/16 :goto_0

    .line 329
    :cond_5
    const/high16 v0, 0xa00000

    if-le v10, v0, :cond_6

    .line 330
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "File being unzipped is too big."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    :cond_6
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileInputStream(Ljava/io/FileInputStream;)V

    .line 346
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeZipInputStream(Ljava/util/zip/ZipInputStream;)V

    .line 347
    invoke-static {v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 348
    goto/16 :goto_2

    .line 332
    :catch_0
    move-exception v8

    .line 333
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "FileNotFoundException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 334
    const/4 v7, -0x3

    .line 345
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileInputStream(Ljava/io/FileInputStream;)V

    .line 346
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeZipInputStream(Ljava/util/zip/ZipInputStream;)V

    .line 347
    invoke-static {v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 348
    goto/16 :goto_2

    .line 335
    :catch_1
    move-exception v8

    .line 336
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 337
    const/4 v7, -0x3

    .line 345
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileInputStream(Ljava/io/FileInputStream;)V

    .line 346
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeZipInputStream(Ljava/util/zip/ZipInputStream;)V

    .line 347
    invoke-static {v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 348
    goto/16 :goto_2

    .line 338
    :catch_2
    move-exception v8

    .line 339
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IllegalArgumentException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 340
    const/4 v7, -0x3

    .line 345
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileInputStream(Ljava/io/FileInputStream;)V

    .line 346
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeZipInputStream(Ljava/util/zip/ZipInputStream;)V

    .line 347
    invoke-static {v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 348
    goto :goto_2

    .line 341
    :catch_3
    move-exception v8

    .line 342
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IllegalStateException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 343
    const/4 v7, -0x3

    .line 345
    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileInputStream(Ljava/io/FileInputStream;)V

    .line 346
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeZipInputStream(Ljava/util/zip/ZipInputStream;)V

    .line 347
    invoke-static {v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 348
    goto :goto_2

    .line 345
    :catchall_0
    move-exception v16

    invoke-static {v4}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileInputStream(Ljava/io/FileInputStream;)V

    .line 346
    invoke-static {v5}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeZipInputStream(Ljava/util/zip/ZipInputStream;)V

    .line 347
    invoke-static {v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->closeFileOutputStream(Ljava/io/FileOutputStream;)V

    .line 348
    throw v16

    .line 349
    :goto_2
    new-instance v8, Ljava/io/File;

    move-object/from16 v0, p2

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 350
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_7

    const/4 v0, 0x0

    if-ne v0, v7, :cond_7

    .line 351
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    new-instance v9, Lo/dcy;

    invoke-direct {v9}, Lo/dcy;-><init>()V

    .line 354
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->mContext:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getFileId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_ver"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getVer()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3, v9}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 355
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getFileId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-interface {v1, v0, v7}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;->onResponce(Ljava/lang/String;I)V

    .line 357
    goto :goto_3

    .line 358
    :cond_7
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unZip and the dir fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    invoke-virtual/range {p3 .. p3}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getFileId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p4

    const/4 v2, -0x3

    invoke-interface {v1, v0, v2}, Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;->onResponce(Ljava/lang/String;I)V

    .line 363
    :goto_3
    return-void
.end method


# virtual methods
.method public doDownload(Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V
    .locals 12

    .line 94
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doDownload"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 97
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecommendCloudObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    return-void

    .line 100
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getFileId()Ljava/lang/String;

    move-result-object v8

    .line 101
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getDownloadUrl()Ljava/lang/String;

    move-result-object v9

    .line 103
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    const-string v0, ""

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 104
    :cond_1
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-void

    .line 108
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v9, :cond_3

    const-string v0, ""

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 109
    :cond_3
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadUrl is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 112
    :cond_4
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "absolutePath :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recommendcloud"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 115
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "savePath :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadUrl :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const/4 v0, 0x0

    if-eq v0, v11, :cond_5

    const-string v0, ""

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 118
    :cond_5
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "savePath is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    return-void

    .line 122
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 123
    :cond_7
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 125
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;

    move-object v2, p0

    move-object v3, v8

    move-object v4, v10

    move-object v5, v9

    move-object v6, v11

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$1;-><init>(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudHttpCallBack;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 135
    return-void
.end method

.method public doUnZip(Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V
    .locals 11

    .line 236
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doUnZip"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 239
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RecommendCloudObject is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    return-void

    .line 242
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getFileId()Ljava/lang/String;

    move-result-object v7

    .line 244
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    const-string v0, ""

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 245
    :cond_1
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fileId is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    return-void

    .line 249
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->getVer()Ljava/lang/String;

    move-result-object v8

    .line 251
    const/4 v0, 0x0

    if-eq v0, v8, :cond_3

    const-string v0, ""

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 252
    :cond_3
    const-string v0, "UIDV_RecommendFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ver is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    return-void

    .line 256
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recommendcloud"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recommendcloud"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 260
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 261
    :cond_5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 263
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;

    move-object v2, p0

    move-object v3, v9

    move-object v4, v10

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil$4;-><init>(Lcom/huawei/ui/main/stories/recommendcloud/util/FileUtil;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;Lcom/huawei/ui/main/stories/recommendcloud/service/RecommendCloudCallBack;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 270
    return-void
.end method

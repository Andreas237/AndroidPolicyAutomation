.class Lcom/tencent/open/weiyun/FileManager$UploadFileImp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/open/weiyun/FileManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "UploadFileImp"
.end annotation


# static fields
.field private static final GET_PERMISSON_DONE:I = 0x0

.field private static final UPLOAD_IMAGE_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/upload_photo"

.field private static final UPLOAD_MUSIC_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/upload_music"

.field private static final UPLOAD_PROGRESS:I = 0x1

.field private static final UPLOAD_PROGRESS_DONE:I = 0x2

.field private static final UPLOAD_VIDEO_URL:Ljava/lang/String; = "https://graph.qq.com/weiyun/upload_video"


# instance fields
.field private final mCallback:Lcom/tencent/open/weiyun/IUploadFileCallBack;

.field private final mContext:Landroid/content/Context;

.field private mFileKey:Ljava/lang/String;

.field private final mFilePath:Ljava/lang/String;

.field private mFileSize:J

.field private final mFileType:Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;

.field private final mHandler:Landroid/os/Handler;

.field private mHost:Ljava/lang/String;

.field private mMD5Hash:Ljava/lang/String;

.field private mUKey:[B

.field final synthetic this$0:Lcom/tencent/open/weiyun/FileManager;


# direct methods
.method public constructor <init>(Lcom/tencent/open/weiyun/FileManager;Landroid/content/Context;Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;Ljava/lang/String;Lcom/tencent/open/weiyun/IUploadFileCallBack;)V
    .locals 2

    .line 181
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->this$0:Lcom/tencent/open/weiyun/FileManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    iput-object p2, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mContext:Landroid/content/Context;

    .line 183
    iput-object p3, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFileType:Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;

    .line 184
    iput-object p4, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;

    .line 185
    iput-object p5, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mCallback:Lcom/tencent/open/weiyun/IUploadFileCallBack;

    .line 186
    new-instance v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$1;-><init>(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;Landroid/os/Looper;Lcom/tencent/open/weiyun/FileManager;)V

    iput-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    .line 222
    return-void
.end method

.method static synthetic access$000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/IUploadFileCallBack;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mCallback:Lcom/tencent/open/weiyun/IUploadFileCallBack;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/content/Context;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$102(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;[B)[B
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mUKey:[B

    return-object p1
.end method

.method static synthetic access$1100(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFileType:Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
    .locals 1

    .line 162
    invoke-direct {p0, p1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->getRequestUrl(Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;[BII)[B
    .locals 1

    .line 162
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->packPostBody([BII)[B

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHost:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$202(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHost:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)V
    .locals 0

    .line 162
    invoke-direct {p0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->doUpload()V

    return-void
.end method

.method static synthetic access$400(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$600(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFileKey:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mMD5Hash:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)J
    .locals 2

    .line 162
    iget-wide v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFileSize:J

    return-wide v0
.end method

.method private doUpload()V
    .locals 1

    .line 385
    new-instance v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;

    invoke-direct {v0, p0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;-><init>(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)V

    invoke-virtual {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->start()V

    .line 487
    return-void
.end method

.method private getRequestUrl(Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;)Ljava/lang/String;
    .locals 1

    .line 322
    sget-object v0, Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;->ImageFile:Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;

    if-ne p1, v0, :cond_0

    .line 323
    const-string v0, "https://graph.qq.com/weiyun/upload_photo"

    return-object v0

    .line 324
    :cond_0
    sget-object v0, Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;->MusicFile:Lcom/tencent/open/weiyun/FileManager$WeiyunFileType;

    if-ne p1, v0, :cond_1

    .line 325
    const-string v0, "https://graph.qq.com/weiyun/upload_music"

    return-object v0

    .line 327
    :cond_1
    const-string v0, "https://graph.qq.com/weiyun/upload_video"

    return-object v0
.end method

.method private getUploadPermission()V
    .locals 1

    .line 331
    new-instance v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;

    invoke-direct {v0, p0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;-><init>(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)V

    invoke-virtual {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$2;->start()V

    .line 382
    return-void
.end method

.method private packPostBody([BII)[B
    .locals 7

    .line 493
    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    .line 494
    const/4 v0, 0x0

    invoke-virtual {v2, p1, v0, p2}, Ljava/security/MessageDigest;->update([BII)V

    .line 495
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/DataConvert;->toHexString([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mMD5Hash:Ljava/lang/String;

    .line 496
    invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 503
    goto :goto_0

    .line 497
    :catch_0
    move-exception v3

    .line 498
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 499
    const/4 v0, -0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 500
    invoke-virtual {v3}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 501
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 502
    const/4 v0, 0x0

    return-object v0

    .line 505
    :goto_0
    add-int/lit16 v3, p2, 0x154

    .line 506
    add-int/lit8 v0, v3, 0x4

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v4, v0, 0x4

    .line 507
    new-array v5, v4, [B

    .line 508
    const/4 v6, 0x0

    .line 510
    const v0, -0x5432678a

    invoke-static {v0, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putInt2Bytes(I[BI)I

    move-result v0

    add-int/lit8 v6, v0, 0x0

    .line 511
    const/16 v0, 0x3e8

    invoke-static {v0, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putInt2Bytes(I[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 512
    const/4 v0, 0x0

    invoke-static {v0, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putInt2Bytes(I[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 513
    invoke-static {v3, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putInt2Bytes(I[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 516
    const/16 v0, 0x130

    invoke-static {v0, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putShort2Bytes(I[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 517
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mUKey:[B

    invoke-static {v0, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putBytes2Bytes([B[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 518
    const/16 v0, 0x14

    invoke-static {v0, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putShort2Bytes(I[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 519
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFileKey:Ljava/lang/String;

    invoke-static {v0, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putString2Bytes(Ljava/lang/String;[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 520
    iget-wide v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFileSize:J

    long-to-int v0, v0

    invoke-static {v0, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putInt2Bytes(I[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 521
    invoke-static {p3, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putInt2Bytes(I[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 522
    invoke-static {p2, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putInt2Bytes(I[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 525
    invoke-static {p1, p2, v5, v6}, Lcom/tencent/open/utils/DataConvert;->putBytes2Bytes([BI[BI)I

    move-result v0

    add-int/2addr v6, v0

    .line 527
    return-object v5
.end method


# virtual methods
.method public start()V
    .locals 13

    .line 225
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 227
    const/4 v0, -0x5

    iput v0, v2, Landroid/os/Message;->what:I

    .line 228
    new-instance v0, Ljava/lang/String;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 229
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 230
    return-void

    .line 233
    :cond_1
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mCallback:Lcom/tencent/open/weiyun/IUploadFileCallBack;

    invoke-interface {v0}, Lcom/tencent/open/weiyun/IUploadFileCallBack;->onPrepareStart()V

    .line 234
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFilePath:Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 235
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFileSize:J

    .line 238
    const/4 v3, 0x0

    .line 239
    const/4 v4, 0x0

    .line 240
    const/high16 v5, 0x80000

    .line 244
    const-string v0, "SHA-1"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v6

    .line 245
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 246
    new-instance v0, Ljava/security/DigestInputStream;

    invoke-direct {v0, v3, v6}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V

    move-object v4, v0

    .line 247
    new-array v7, v5, [B

    .line 248
    :goto_0
    invoke-virtual {v4, v7}, Ljava/security/DigestInputStream;->read([B)I

    move-result v0

    if-lez v0, :cond_2

    goto :goto_0

    .line 249
    :cond_2
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->getMessageDigest()Ljava/security/MessageDigest;

    move-result-object v6

    .line 250
    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v8

    .line 251
    invoke-static {v8}, Lcom/tencent/open/utils/DataConvert;->toHexString([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mFileKey:Ljava/lang/String;

    .line 252
    invoke-virtual {v6}, Ljava/security/MessageDigest;->reset()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 260
    if-eqz v4, :cond_3

    .line 262
    :try_start_1
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 265
    goto :goto_1

    .line 263
    :catch_0
    move-exception v6

    .line 264
    invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V

    .line 266
    :goto_1
    const/4 v4, 0x0

    .line 268
    :cond_3
    if-eqz v3, :cond_8

    .line 270
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 273
    goto :goto_2

    .line 271
    :catch_1
    move-exception v6

    .line 272
    invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V

    .line 274
    :goto_2
    const/4 v3, 0x0

    goto/16 :goto_7

    .line 253
    :catch_2
    move-exception v6

    .line 254
    :try_start_3
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 255
    const/4 v0, -0x2

    iput v0, v7, Landroid/os/Message;->what:I

    .line 256
    new-instance v0, Ljava/lang/String;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 257
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 260
    if-eqz v4, :cond_4

    .line 262
    :try_start_4
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 265
    goto :goto_3

    .line 263
    :catch_3
    move-exception v8

    .line 264
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 266
    :goto_3
    const/4 v4, 0x0

    .line 268
    :cond_4
    if-eqz v3, :cond_5

    .line 270
    :try_start_5
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 273
    goto :goto_4

    .line 271
    :catch_4
    move-exception v8

    .line 272
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 274
    :goto_4
    const/4 v3, 0x0

    :cond_5
    return-void

    .line 260
    :catchall_0
    move-exception v9

    if-eqz v4, :cond_6

    .line 262
    :try_start_6
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 265
    goto :goto_5

    .line 263
    :catch_5
    move-exception v10

    .line 264
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 266
    :goto_5
    const/4 v4, 0x0

    .line 268
    :cond_6
    if-eqz v3, :cond_7

    .line 270
    :try_start_7
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_6

    .line 273
    goto :goto_6

    .line 271
    :catch_6
    move-exception v10

    .line 272
    invoke-virtual {v10}, Ljava/io/IOException;->printStackTrace()V

    .line 274
    :goto_6
    const/4 v3, 0x0

    :cond_7
    throw v9

    .line 278
    :cond_8
    :goto_7
    const/4 v3, 0x0

    .line 279
    const/4 v4, 0x0

    .line 282
    const-string v0, "MD5"

    :try_start_8
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v6

    .line 283
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 284
    new-instance v0, Ljava/security/DigestInputStream;

    invoke-direct {v0, v3, v6}, Ljava/security/DigestInputStream;-><init>(Ljava/io/InputStream;Ljava/security/MessageDigest;)V

    move-object v4, v0

    .line 285
    new-array v7, v5, [B

    .line 286
    :goto_8
    invoke-virtual {v4, v7}, Ljava/security/DigestInputStream;->read([B)I

    move-result v0

    if-lez v0, :cond_9

    goto :goto_8

    .line 287
    :cond_9
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->getMessageDigest()Ljava/security/MessageDigest;

    move-result-object v6

    .line 288
    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/open/utils/DataConvert;->toHexString([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mMD5Hash:Ljava/lang/String;

    .line 290
    invoke-virtual {v6}, Ljava/security/MessageDigest;->reset()V

    .line 291
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V

    .line 292
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_9
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 300
    if-eqz v4, :cond_a

    .line 302
    :try_start_9
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_7

    .line 305
    goto :goto_9

    .line 303
    :catch_7
    move-exception v6

    .line 304
    invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V

    .line 306
    :goto_9
    const/4 v4, 0x0

    .line 308
    :cond_a
    if-eqz v3, :cond_f

    .line 310
    :try_start_a
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_8

    .line 313
    goto :goto_a

    .line 311
    :catch_8
    move-exception v6

    .line 312
    invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V

    .line 314
    :goto_a
    const/4 v3, 0x0

    goto/16 :goto_f

    .line 293
    :catch_9
    move-exception v6

    .line 294
    :try_start_b
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v7

    .line 295
    const/4 v0, -0x2

    iput v0, v7, Landroid/os/Message;->what:I

    .line 296
    new-instance v0, Ljava/lang/String;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 297
    iget-object v0, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 300
    if-eqz v4, :cond_b

    .line 302
    :try_start_c
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_a

    .line 305
    goto :goto_b

    .line 303
    :catch_a
    move-exception v8

    .line 304
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 306
    :goto_b
    const/4 v4, 0x0

    .line 308
    :cond_b
    if-eqz v3, :cond_c

    .line 310
    :try_start_d
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_b

    .line 313
    goto :goto_c

    .line 311
    :catch_b
    move-exception v8

    .line 312
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 314
    :goto_c
    const/4 v3, 0x0

    :cond_c
    return-void

    .line 300
    :catchall_1
    move-exception v11

    if-eqz v4, :cond_d

    .line 302
    :try_start_e
    invoke-virtual {v4}, Ljava/security/DigestInputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_c

    .line 305
    goto :goto_d

    .line 303
    :catch_c
    move-exception v12

    .line 304
    invoke-virtual {v12}, Ljava/io/IOException;->printStackTrace()V

    .line 306
    :goto_d
    const/4 v4, 0x0

    .line 308
    :cond_d
    if-eqz v3, :cond_e

    .line 310
    :try_start_f
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_d

    .line 313
    goto :goto_e

    .line 311
    :catch_d
    move-exception v12

    .line 312
    invoke-virtual {v12}, Ljava/io/IOException;->printStackTrace()V

    .line 314
    :goto_e
    const/4 v3, 0x0

    :cond_e
    throw v11

    .line 318
    :cond_f
    :goto_f
    invoke-direct {p0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->getUploadPermission()V

    .line 319
    return-void
.end method

.class public Lcom/huawei/qrcode/picture/recognition/PictureFetcher;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;
    }
.end annotation


# static fields
.field private static final DUAL_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;

.field private static PHOTO_PATH_RECOGNITION:I

.field private static URI_RECOGNITION:I

.field private static final sThreadFactory:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x7d1

    sput v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->PHOTO_PATH_RECOGNITION:I

    const/16 v0, 0x7d2

    sput v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->URI_RECOGNITION:I

    new-instance v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$1;

    invoke-direct {v0}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$1;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    sget-object v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->DUAL_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->mContext:Landroid/content/Context;

    iput-object p1, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->mContext:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    sget v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->PHOTO_PATH_RECOGNITION:I

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;ILjava/lang/String;Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->getQrcodeContent(ILjava/lang/String;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$300()I
    .locals 1

    sget v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->URI_RECOGNITION:I

    return v0
.end method

.method private getQrcodeContent(ILjava/lang/String;Landroid/net/Uri;)Ljava/lang/String;
    .locals 12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-string v6, ""

    sget v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->PHOTO_PATH_RECOGNITION:I

    if-ne v0, p1, :cond_0

    invoke-static {p2}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->decodeBitmap(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_0
    sget v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->URI_RECOGNITION:I

    if-ne v0, p1, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->mContext:Landroid/content/Context;

    invoke-static {v0, p3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->decodeBitmap(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long v0, v7, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v9

    const-wide/16 v0, 0x3e8

    cmp-long v0, v9, v0

    if-gez v0, :cond_2

    const-wide/16 v0, 0x3e8

    sub-long/2addr v0, v9

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v11

    const-string v0, "PictureFetcher getQrcodeContent: "

    const/4 v1, 0x0

    invoke-static {v0, v11, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PictureFetcher getQrcodeContent qrcode is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return-object v6
.end method


# virtual methods
.method public checkQrCode(Ljava/lang/String;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V
    .locals 3

    const-string v0, "PictureFetcher checkQrCode."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$2;-><init>(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;Ljava/lang/String;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V

    sget-object v1, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->DUAL_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$2;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public recognitionQrcodePicture(Landroid/net/Uri;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V
    .locals 3

    const-string v0, "PictureFetcher recognitionQrcodePicture uri."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;-><init>(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;Landroid/net/Uri;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V

    sget-object v1, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->DUAL_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$4;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public recognitionQrcodePicture(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;Lcom/huawei/qrcode/logic/IScanQrcodeListener;)V
    .locals 6

    const-string v0, "PictureFetcher recognitionQrcodePicture photoPath."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v0, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;-><init>(Lcom/huawei/qrcode/picture/recognition/PictureFetcher;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/IScanQrcodeListener;Lcom/huawei/qrcode/picture/recognition/PictureFetcher$OnQRCodeCallback;)V

    sget-object v1, Lcom/huawei/qrcode/picture/recognition/PictureFetcher;->DUAL_THREAD_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/picture/recognition/PictureFetcher$3;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

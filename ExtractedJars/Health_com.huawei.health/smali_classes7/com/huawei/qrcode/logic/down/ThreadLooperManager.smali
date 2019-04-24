.class public final Lcom/huawei/qrcode/logic/down/ThreadLooperManager;
.super Ljava/lang/Object;


# static fields
.field private static final SYNC_LOCK:[B

.field private static final THREAD_TAG:Ljava/lang/String; = "otoHandlerThread"

.field private static volatile threadInstance:Lcom/huawei/qrcode/logic/down/ThreadLooperManager; = null


# instance fields
.field private handlerThread:Landroid/os/HandlerThread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "otoHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->handlerThread:Landroid/os/HandlerThread;

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->handlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    return-void
.end method

.method public static getInstance()Lcom/huawei/qrcode/logic/down/ThreadLooperManager;
    .locals 3

    sget-object v1, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->SYNC_LOCK:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->threadInstance:Lcom/huawei/qrcode/logic/down/ThreadLooperManager;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;

    invoke-direct {v0}, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;-><init>()V

    sput-object v0, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->threadInstance:Lcom/huawei/qrcode/logic/down/ThreadLooperManager;

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->threadInstance:Lcom/huawei/qrcode/logic/down/ThreadLooperManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public getLooper()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/ThreadLooperManager;->handlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

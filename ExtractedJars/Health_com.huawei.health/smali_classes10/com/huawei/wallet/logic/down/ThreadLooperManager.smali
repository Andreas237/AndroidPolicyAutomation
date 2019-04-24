.class public final Lcom/huawei/wallet/logic/down/ThreadLooperManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:[B

.field private static volatile c:Lcom/huawei/wallet/logic/down/ThreadLooperManager;


# instance fields
.field private d:Landroid/os/HandlerThread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->b:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "otoHandlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->d:Landroid/os/HandlerThread;

    .line 45
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->d:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 46
    return-void
.end method

.method public static b()Lcom/huawei/wallet/logic/down/ThreadLooperManager;
    .locals 4

    .line 55
    sget-object v0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->c:Lcom/huawei/wallet/logic/down/ThreadLooperManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 57
    sget-object v2, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->b:[B

    monitor-enter v2

    .line 59
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->c:Lcom/huawei/wallet/logic/down/ThreadLooperManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 61
    new-instance v0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;

    invoke-direct {v0}, Lcom/huawei/wallet/logic/down/ThreadLooperManager;-><init>()V

    sput-object v0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->c:Lcom/huawei/wallet/logic/down/ThreadLooperManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 66
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->c:Lcom/huawei/wallet/logic/down/ThreadLooperManager;

    return-object v0
.end method


# virtual methods
.method public e()Landroid/os/Looper;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/ThreadLooperManager;->d:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

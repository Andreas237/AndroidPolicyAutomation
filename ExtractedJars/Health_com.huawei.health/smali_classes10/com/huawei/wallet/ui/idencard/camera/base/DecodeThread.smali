.class public abstract Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private final a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

.field private final b:Ljava/util/concurrent/CountDownLatch;

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)V
    .locals 2

    .line 32
    const-string v0, "DecodeThread"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 33
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    .line 35
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->b:Ljava/util/concurrent/CountDownLatch;

    .line 36
    return-void
.end method


# virtual methods
.method public c()Landroid/os/Handler;
    .locals 2

    .line 47
    :try_start_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 49
    :catch_0
    move-exception v1

    .line 53
    :goto_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->e:Landroid/os/Handler;

    return-object v0
.end method

.method protected abstract d(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;
.end method

.method public run()V
    .locals 1

    .line 59
    invoke-static {}, Landroid/os/Looper;->prepare()V

    .line 60
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->a:Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;

    invoke-virtual {p0, v0}, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->d(Lcom/huawei/wallet/ui/idencard/camera/base/BaseCaptureActivity;)Lcom/huawei/wallet/ui/idencard/camera/base/DecodeHandler;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->e:Landroid/os/Handler;

    .line 62
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/DecodeThread;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 63
    invoke-static {}, Landroid/os/Looper;->loop()V

    .line 64
    return-void
.end method

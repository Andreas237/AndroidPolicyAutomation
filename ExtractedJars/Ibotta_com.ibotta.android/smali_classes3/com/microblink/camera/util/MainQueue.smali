.class public Lcom/microblink/camera/util/MainQueue;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/util/IProcessingQueue;


# instance fields
.field private mHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/microblink/camera/util/MainQueue;->mHandler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public getHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/MainQueue;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public postJob(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/MainQueue;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public postJobDelayed(Ljava/lang/Runnable;J)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/util/MainQueue;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public postShutdownJob()V
    .locals 0

    return-void
.end method

.method public waitForShutdown(J)V
    .locals 0

    return-void
.end method

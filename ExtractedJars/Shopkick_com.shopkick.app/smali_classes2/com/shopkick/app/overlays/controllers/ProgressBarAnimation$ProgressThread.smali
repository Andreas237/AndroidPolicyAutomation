.class Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;
.super Ljava/lang/Thread;
.source "ProgressBarAnimation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ProgressThread"
.end annotation


# static fields
.field static final STATE_DONE:I = 0x0

.field static final STATE_RUNNING:I = 0x1


# instance fields
.field mHandler:Landroid/os/Handler;

.field mState:I

.field final synthetic this$0:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;

.field total:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;Landroid/os/Handler;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->this$0:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 18
    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->mHandler:Landroid/os/Handler;

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->total:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x1

    .line 23
    iput v0, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->mState:I

    .line 24
    :goto_0
    iget v1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->mState:I

    if-ne v1, v0, :cond_0

    const-wide/16 v1, 0x14

    .line 26
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :catch_0
    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 30
    iget v2, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->total:I

    iput v2, v1, Landroid/os/Message;->arg1:I

    .line 31
    iget-object v2, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->mHandler:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 32
    iget v1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->total:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->total:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setState(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->mState:I

    return-void
.end method

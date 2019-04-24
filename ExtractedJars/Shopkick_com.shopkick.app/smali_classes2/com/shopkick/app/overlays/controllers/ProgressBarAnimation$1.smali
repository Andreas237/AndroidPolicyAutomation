.class Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$1;
.super Landroid/os/Handler;
.source "ProgressBarAnimation.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$1;->this$0:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 61
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$1;->this$0:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;

    iget-object v0, v0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$1;->this$0:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;

    invoke-static {v0}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->access$000(Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;)I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 64
    iget-object p1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$1;->this$0:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;

    iget-object p1, p1, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->progressThread:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->setState(I)V

    :cond_0
    return-void
.end method

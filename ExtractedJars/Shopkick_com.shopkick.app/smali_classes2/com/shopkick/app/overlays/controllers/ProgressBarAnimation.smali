.class public Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;
.super Ljava/lang/Object;
.source "ProgressBarAnimation.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;
    }
.end annotation


# instance fields
.field private endProgress:I

.field final handler:Landroid/os/Handler;

.field progressBar:Landroid/widget/ProgressBar;

.field progressThread:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;


# direct methods
.method public constructor <init>(Landroid/widget/ProgressBar;)V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$1;-><init>(Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->handler:Landroid/os/Handler;

    .line 45
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->progressBar:Landroid/widget/ProgressBar;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;)I
    .locals 0

    .line 7
    iget p0, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->endProgress:I

    return p0
.end method


# virtual methods
.method public moveProgress(II)V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 50
    iput p2, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->endProgress:I

    .line 51
    new-instance p2, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;

    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->handler:Landroid/os/Handler;

    invoke-direct {p2, p0, v0}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;-><init>(Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;Landroid/os/Handler;)V

    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->progressThread:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;

    .line 52
    iget-object p2, p0, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation;->progressThread:Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;

    iput p1, p2, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->total:I

    .line 53
    invoke-virtual {p2}, Lcom/shopkick/app/overlays/controllers/ProgressBarAnimation$ProgressThread;->start()V

    return-void
.end method

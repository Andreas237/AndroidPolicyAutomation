.class Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;
.super Ljava/lang/Object;
.source "BallSKOverlay.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/overlays/common/BallSKOverlay;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BallAnimationListener"
.end annotation


# instance fields
.field private overlayRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/overlays/common/BallSKOverlay;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/overlays/common/BallSKOverlay;)V
    .locals 1

    .line 477
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 475
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;->overlayRef:Ljava/lang/ref/WeakReference;

    .line 478
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;->overlayRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 483
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/BallSKOverlay$BallAnimationListener;->overlayRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/overlays/common/BallSKOverlay;

    if-nez v0, :cond_0

    return-void

    .line 488
    :cond_0
    invoke-static {v0, p1}, Lcom/shopkick/app/overlays/common/BallSKOverlay;->access$000(Lcom/shopkick/app/overlays/common/BallSKOverlay;Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

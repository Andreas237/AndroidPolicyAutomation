.class Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;
.super Landroid/animation/AnimatorListenerAdapter;
.source "KicksOnTheWayOverlay.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animateHelicopter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

.field final synthetic val$helicopter:Landroid/view/View;

.field final synthetic val$moveHelicopter:Landroid/animation/AnimatorSet;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;Landroid/view/View;Landroid/animation/AnimatorSet;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;->this$0:Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

    iput-object p2, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;->val$helicopter:Landroid/view/View;

    iput-object p3, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;->val$moveHelicopter:Landroid/animation/AnimatorSet;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 233
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 234
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;->val$helicopter:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 235
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;->val$moveHelicopter:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    goto :goto_0

    .line 237
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$2;->val$moveHelicopter:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->removeAllListeners()V

    :goto_0
    return-void
.end method

.class Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$3;
.super Ljava/lang/Object;
.source "CelebratoryKicksOverlay.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->setupAnimatorsForHide()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;)V
    .locals 0

    .line 351
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$3;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    .line 360
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$3;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->dismiss()V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 356
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay$3;->this$0:Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;

    invoke-virtual {p1}, Lcom/shopkick/app/overlays/common/CelebratoryKicksOverlay;->dismiss()V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

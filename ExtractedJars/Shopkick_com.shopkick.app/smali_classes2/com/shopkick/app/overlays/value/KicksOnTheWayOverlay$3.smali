.class Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$3;
.super Ljava/lang/Object;
.source "KicksOnTheWayOverlay.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->animateSpeedBump()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 389
    iget-object p1, p0, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay$3;->this$0:Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;

    invoke-static {p1}, Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;->access$100(Lcom/shopkick/app/overlays/value/KicksOnTheWayOverlay;)Landroid/view/animation/AnimationSet;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/animation/AnimationSet;->start()V

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

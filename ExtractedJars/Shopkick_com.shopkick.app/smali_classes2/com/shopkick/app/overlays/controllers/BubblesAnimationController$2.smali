.class Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$2;
.super Ljava/lang/Object;
.source "BubblesAnimationController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->animateFloat(Landroid/widget/FrameLayout;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

.field final synthetic val$bubbleSurface:Landroid/widget/FrameLayout;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$2;->this$0:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$2;->val$bubbleSurface:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$2;->this$0:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$2;->val$bubbleSurface:Landroid/widget/FrameLayout;

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->access$100(Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;Landroid/widget/FrameLayout;Landroid/view/animation/Animation;)V

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

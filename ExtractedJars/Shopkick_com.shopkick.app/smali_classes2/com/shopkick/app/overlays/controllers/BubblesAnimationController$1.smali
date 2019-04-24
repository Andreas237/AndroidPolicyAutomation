.class Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;
.super Ljava/lang/Object;
.source "BubblesAnimationController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->animateBackgroundBubbles(Landroid/widget/FrameLayout;Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

.field final synthetic val$bubbleSurface:Landroid/widget/FrameLayout;

.field final synthetic val$callback:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;


# direct methods
.method constructor <init>(Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;->this$0:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

    iput-object p2, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;->val$callback:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;

    iput-object p3, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;->val$bubbleSurface:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;->val$callback:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;

    invoke-interface {v0}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$BubbleAnimationCallback;->onBubbleRiseEnd()V

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;->this$0:Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;

    iget-object v1, p0, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController$1;->val$bubbleSurface:Landroid/widget/FrameLayout;

    invoke-static {v0, v1}, Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;->access$000(Lcom/shopkick/app/overlays/controllers/BubblesAnimationController;Landroid/widget/FrameLayout;)V

    return-void
.end method

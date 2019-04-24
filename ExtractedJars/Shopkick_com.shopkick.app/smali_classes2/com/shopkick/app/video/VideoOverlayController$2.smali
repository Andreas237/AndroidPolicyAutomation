.class Lcom/shopkick/app/video/VideoOverlayController$2;
.super Ljava/lang/Object;
.source "VideoOverlayController.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/video/VideoOverlayController;->fadeInTitlebar()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/video/VideoOverlayController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/video/VideoOverlayController;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController$2;->this$0:Lcom/shopkick/app/video/VideoOverlayController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController$2;->this$0:Lcom/shopkick/app/video/VideoOverlayController;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/video/VideoOverlayController;->access$102(Lcom/shopkick/app/video/VideoOverlayController;Z)Z

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController$2;->this$0:Lcom/shopkick/app/video/VideoOverlayController;

    invoke-static {p1}, Lcom/shopkick/app/video/VideoOverlayController;->access$300(Lcom/shopkick/app/video/VideoOverlayController;)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/video/VideoOverlayController$2;->this$0:Lcom/shopkick/app/video/VideoOverlayController;

    invoke-static {v0}, Lcom/shopkick/app/video/VideoOverlayController;->access$200(Lcom/shopkick/app/video/VideoOverlayController;)Ljava/lang/Runnable;

    move-result-object v0

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

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

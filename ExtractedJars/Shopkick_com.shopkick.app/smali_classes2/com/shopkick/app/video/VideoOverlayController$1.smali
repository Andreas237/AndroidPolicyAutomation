.class Lcom/shopkick/app/video/VideoOverlayController$1;
.super Ljava/lang/Object;
.source "VideoOverlayController.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/video/VideoOverlayController;->load(Landroid/content/Context;)V
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

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController$1;->this$0:Lcom/shopkick/app/video/VideoOverlayController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 63
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 64
    iget-object p1, p0, Lcom/shopkick/app/video/VideoOverlayController$1;->this$0:Lcom/shopkick/app/video/VideoOverlayController;

    invoke-static {p1}, Lcom/shopkick/app/video/VideoOverlayController;->access$000(Lcom/shopkick/app/video/VideoOverlayController;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

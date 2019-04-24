.class public final Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "FocusView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/fotoapparat/view/FocusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocusView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusView.kt\nio/fotoapparat/view/FocusView$gestureDetectorListener$1\n*L\n1#1,68:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "io/fotoapparat/view/FocusView$gestureDetectorListener$1",
        "Landroid/view/GestureDetector$SimpleOnGestureListener;",
        "onSingleTapUp",
        "",
        "e",
        "Landroid/view/MotionEvent;",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/fotoapparat/view/FocusView;


# direct methods
.method constructor <init>(Lio/fotoapparat/view/FocusView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 44
    iput-object p1, p0, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;->this$0:Lio/fotoapparat/view/FocusView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 6
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;->this$0:Lio/fotoapparat/view/FocusView;

    invoke-static {v0}, Lio/fotoapparat/view/FocusView;->access$getFocusMeteringListener$p(Lio/fotoapparat/view/FocusView;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 48
    new-instance v1, Lio/fotoapparat/hardware/metering/FocalRequest;

    .line 49
    new-instance v2, Lio/fotoapparat/hardware/metering/PointF;

    .line 50
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 49
    invoke-direct {v2, v3, v4}, Lio/fotoapparat/hardware/metering/PointF;-><init>(FF)V

    .line 52
    new-instance v3, Lio/fotoapparat/parameter/Resolution;

    .line 53
    iget-object v4, p0, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;->this$0:Lio/fotoapparat/view/FocusView;

    invoke-virtual {v4}, Lio/fotoapparat/view/FocusView;->getWidth()I

    move-result v4

    .line 54
    iget-object v5, p0, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;->this$0:Lio/fotoapparat/view/FocusView;

    invoke-virtual {v5}, Lio/fotoapparat/view/FocusView;->getHeight()I

    move-result v5

    .line 52
    invoke-direct {v3, v4, v5}, Lio/fotoapparat/parameter/Resolution;-><init>(II)V

    .line 48
    invoke-direct {v1, v2, v3}, Lio/fotoapparat/hardware/metering/FocalRequest;-><init>(Lio/fotoapparat/hardware/metering/PointF;Lio/fotoapparat/parameter/Resolution;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;->this$0:Lio/fotoapparat/view/FocusView;

    invoke-static {v0}, Lio/fotoapparat/view/FocusView;->access$getVisualFeedbackCircle$p(Lio/fotoapparat/view/FocusView;)Lio/fotoapparat/view/FeedbackCircleView;

    move-result-object v0

    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iget-object v2, p0, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;->this$0:Lio/fotoapparat/view/FocusView;

    invoke-static {v2}, Lio/fotoapparat/view/FocusView;->access$getVisualFeedbackCircle$p(Lio/fotoapparat/view/FocusView;)Lio/fotoapparat/view/FeedbackCircleView;

    move-result-object v2

    invoke-virtual {v2}, Lio/fotoapparat/view/FeedbackCircleView;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v2, p0, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;->this$0:Lio/fotoapparat/view/FocusView;

    invoke-static {v2}, Lio/fotoapparat/view/FocusView;->access$getVisualFeedbackCircle$p(Lio/fotoapparat/view/FocusView;)Lio/fotoapparat/view/FeedbackCircleView;

    move-result-object v2

    invoke-virtual {v2}, Lio/fotoapparat/view/FeedbackCircleView;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr p1, v2

    .line 55
    invoke-virtual {v0, v1, p1}, Lio/fotoapparat/view/FeedbackCircleView;->showAt$fotoapparat_release(FF)V

    .line 58
    iget-object p1, p0, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;->this$0:Lio/fotoapparat/view/FocusView;

    invoke-virtual {p1}, Lio/fotoapparat/view/FocusView;->performClick()Z

    const/4 p1, 0x1

    goto :goto_0

    .line 62
    :cond_0
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    move-result p1

    :goto_0
    return p1
.end method

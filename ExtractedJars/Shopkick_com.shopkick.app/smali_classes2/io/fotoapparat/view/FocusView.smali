.class public final Lio/fotoapparat/view/FocusView;
.super Landroid/widget/FrameLayout;
.source "FocusView.kt"

# interfaces
.implements Lio/fotoapparat/view/FocalPointSelector;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u000f\u0018\u00002\u00020\u00012\u00020\u0002B%\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u001c\u0010\u0019\u001a\u00020\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0016R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/fotoapparat/view/FocusView;",
        "Landroid/widget/FrameLayout;",
        "Lio/fotoapparat/view/FocalPointSelector;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "focusMeteringListener",
        "Lkotlin/Function1;",
        "Lio/fotoapparat/hardware/metering/FocalRequest;",
        "",
        "gestureDetectorListener",
        "io/fotoapparat/view/FocusView$gestureDetectorListener$1",
        "Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;",
        "tapDetector",
        "Landroid/view/GestureDetector;",
        "visualFeedbackCircle",
        "Lio/fotoapparat/view/FeedbackCircleView;",
        "onTouchEvent",
        "",
        "event",
        "Landroid/view/MotionEvent;",
        "setFocalPointListener",
        "listener",
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
.field private focusMeteringListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/hardware/metering/FocalRequest;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final gestureDetectorListener:Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;

.field private final tapDetector:Landroid/view/GestureDetector;

.field private final visualFeedbackCircle:Lio/fotoapparat/view/FeedbackCircleView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/fotoapparat/view/FocusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lio/fotoapparat/view/FocusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    new-instance v0, Lio/fotoapparat/view/FeedbackCircleView;

    invoke-direct {v0, p1, p2, p3}, Lio/fotoapparat/view/FeedbackCircleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v0, p0, Lio/fotoapparat/view/FocusView;->visualFeedbackCircle:Lio/fotoapparat/view/FeedbackCircleView;

    const/4 p2, 0x0

    .line 29
    invoke-virtual {p0, p2}, Lio/fotoapparat/view/FocusView;->setClipToPadding(Z)V

    .line 30
    invoke-virtual {p0, p2}, Lio/fotoapparat/view/FocusView;->setClipChildren(Z)V

    .line 31
    iget-object p2, p0, Lio/fotoapparat/view/FocusView;->visualFeedbackCircle:Lio/fotoapparat/view/FeedbackCircleView;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p2}, Lio/fotoapparat/view/FocusView;->addView(Landroid/view/View;)V

    .line 44
    new-instance p2, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;

    invoke-direct {p2, p0}, Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;-><init>(Lio/fotoapparat/view/FocusView;)V

    iput-object p2, p0, Lio/fotoapparat/view/FocusView;->gestureDetectorListener:Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;

    .line 66
    new-instance p2, Landroid/view/GestureDetector;

    iget-object p3, p0, Lio/fotoapparat/view/FocusView;->gestureDetectorListener:Lio/fotoapparat/view/FocusView$gestureDetectorListener$1;

    check-cast p3, Landroid/view/GestureDetector$OnGestureListener;

    invoke-direct {p2, p1, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Lio/fotoapparat/view/FocusView;->tapDetector:Landroid/view/GestureDetector;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 21
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 22
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/fotoapparat/view/FocusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getFocusMeteringListener$p(Lio/fotoapparat/view/FocusView;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 18
    iget-object p0, p0, Lio/fotoapparat/view/FocusView;->focusMeteringListener:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getVisualFeedbackCircle$p(Lio/fotoapparat/view/FocusView;)Lio/fotoapparat/view/FeedbackCircleView;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 18
    iget-object p0, p0, Lio/fotoapparat/view/FocusView;->visualFeedbackCircle:Lio/fotoapparat/view/FeedbackCircleView;

    return-object p0
.end method

.method public static final synthetic access$setFocusMeteringListener$p(Lio/fotoapparat/view/FocusView;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 18
    iput-object p1, p0, Lio/fotoapparat/view/FocusView;->focusMeteringListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lio/fotoapparat/view/FocusView;->tapDetector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public setFocalPointListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/fotoapparat/hardware/metering/FocalRequest;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    iput-object p1, p0, Lio/fotoapparat/view/FocusView;->focusMeteringListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

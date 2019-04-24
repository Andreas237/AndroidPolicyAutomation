.class public Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;
.super Landroid/support/v4/view/ViewPager;
.source "TouchInterceptableViewPager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager$OnLongTouchListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001:\u0001\u001eB\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0014J\u0010\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;",
        "Landroid/support/v4/view/ViewPager;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "blockSwipe",
        "",
        "longTouchCheck",
        "Ljava/lang/Runnable;",
        "longTouchListener",
        "Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager$OnLongTouchListener;",
        "touchInterceptListener",
        "Landroid/view/View$OnTouchListener;",
        "canScroll",
        "v",
        "Landroid/view/View;",
        "checkV",
        "dx",
        "",
        "x",
        "y",
        "dispatchTouchEvent",
        "ev",
        "Landroid/view/MotionEvent;",
        "monitorForLongTouch",
        "",
        "setBlockSwipe",
        "setTouchInterceptListener",
        "OnLongTouchListener",
        "ibotta-commons_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private blockSwipe:Z

.field private longTouchCheck:Ljava/lang/Runnable;

.field private final longTouchListener:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager$OnLongTouchListener;

.field private touchInterceptListener:Landroid/view/View$OnTouchListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
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

    .line 19
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 18
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getLongTouchListener$p(Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;)Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager$OnLongTouchListener;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->longTouchListener:Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager$OnLongTouchListener;

    return-object p0
.end method

.method private final monitorForLongTouch(Landroid/view/MotionEvent;)V
    .locals 4

    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 59
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    if-eq v3, v2, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v3, 0x3

    if-ne p1, v3, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    if-eqz v0, :cond_3

    const-string p1, "TIMBER"

    const-string v0, "Touching!"

    .line 62
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    new-instance p1, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager$monitorForLongTouch$1;

    invoke-direct {p1, p0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager$monitorForLongTouch$1;-><init>(Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;)V

    check-cast p1, Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->longTouchCheck:Ljava/lang/Runnable;

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->getHandler()Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->longTouchCheck:Ljava/lang/Runnable;

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    const-string p1, "TIMBER"

    const-string v0, "NOT touching!"

    .line 71
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    iget-object p1, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->longTouchCheck:Ljava/lang/Runnable;

    if-eqz p1, :cond_4

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->getHandler()Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->longTouchCheck:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    .line 74
    check-cast p1, Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->longTouchCheck:Ljava/lang/Runnable;

    :cond_4
    :goto_1
    return-void
.end method


# virtual methods
.method protected canScroll(Landroid/view/View;ZIII)Z
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-boolean v0, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->blockSwipe:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->touchInterceptListener:Landroid/view/View$OnTouchListener;

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    .line 41
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-interface {v0, v1, p1}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 44
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->monitorForLongTouch(Landroid/view/MotionEvent;)V

    if-nez v0, :cond_2

    .line 46
    iget-boolean v1, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->blockSwipe:Z

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    const/4 v0, 0x1

    :cond_2
    if-nez v0, :cond_3

    .line 51
    invoke-super {p0, p1}, Landroid/support/v4/view/ViewPager;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    :cond_3
    return v0
.end method

.method public final setBlockSwipe(Z)V
    .locals 0

    .line 35
    iput-boolean p1, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->blockSwipe:Z

    return-void
.end method

.method public final setTouchInterceptListener(Landroid/view/View$OnTouchListener;)V
    .locals 1
    .param p1    # Landroid/view/View$OnTouchListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "touchInterceptListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/commons/view/pager/TouchInterceptableViewPager;->touchInterceptListener:Landroid/view/View$OnTouchListener;

    return-void
.end method

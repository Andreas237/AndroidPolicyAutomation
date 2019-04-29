.class public Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;
.super Landroid/support/v7/widget/RecyclerView;
.source "QuickReturnRecyclerView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;,
        Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;
    }
.end annotation


# static fields
.field private static final STATE_OFFSCREEN:I = 0x1

.field private static final STATE_ONSCREEN:I = 0x0

.field private static final STATE_RETURNING:I = 0x2

.field private static final TAG:Ljava/lang/String; = "com.rt.mobile.english.ui.widget.QuickReturnRecyclerView"


# instance fields
.field private childHeightSpec:I

.field private mGravity:I

.field private mMinRawY:I

.field private mReturningView:Landroid/view/View;

.field private mReturningViewHeight:I

.field private mScrollSettleHandler:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

.field private mScrolledY:I

.field private mState:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 31
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mState:I

    .line 32
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mMinRawY:I

    const/16 p1, 0x50

    .line 34
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mGravity:I

    .line 36
    new-instance p1, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;-><init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mScrollSettleHandler:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    .line 42
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 31
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mState:I

    .line 32
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mMinRawY:I

    const/16 p1, 0x50

    .line 34
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mGravity:I

    .line 36
    new-instance p1, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;-><init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mScrollSettleHandler:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    .line 47
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 31
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mState:I

    .line 32
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mMinRawY:I

    const/16 p1, 0x50

    .line 34
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mGravity:I

    .line 36
    new-instance p1, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;-><init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mScrollSettleHandler:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    .line 52
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->init()V

    return-void
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I
    .locals 0

    .line 24
    iget p0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mReturningViewHeight:I

    return p0
.end method

.method static synthetic access$102(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I
    .locals 0

    .line 24
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mReturningViewHeight:I

    return p1
.end method

.method static synthetic access$200(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)Landroid/view/View;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mReturningView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$400(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I
    .locals 0

    .line 24
    iget p0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mGravity:I

    return p0
.end method

.method static synthetic access$500(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I
    .locals 0

    .line 24
    iget p0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mScrolledY:I

    return p0
.end method

.method static synthetic access$502(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I
    .locals 0

    .line 24
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mScrolledY:I

    return p1
.end method

.method static synthetic access$600(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I
    .locals 0

    .line 24
    iget p0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mState:I

    return p0
.end method

.method static synthetic access$602(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I
    .locals 0

    .line 24
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mState:I

    return p1
.end method

.method static synthetic access$700(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)I
    .locals 0

    .line 24
    iget p0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mMinRawY:I

    return p0
.end method

.method static synthetic access$702(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;I)I
    .locals 0

    .line 24
    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mMinRawY:I

    return p1
.end method

.method private init()V
    .locals 0

    return-void
.end method

.method private measureView(Landroid/view/View;)V
    .locals 4

    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    .line 91
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 96
    :cond_0
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    const/4 v2, 0x0

    invoke-static {v2, v2, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v1

    .line 97
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-lez v0, :cond_1

    const/high16 v2, 0x40000000    # 2.0f

    .line 99
    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->childHeightSpec:I

    goto :goto_0

    .line 101
    :cond_1
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    iput v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->childHeightSpec:I

    .line 103
    :goto_0
    sget-object v0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "childHeightSpec = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->childHeightSpec:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    iget v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->childHeightSpec:I

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->measure(II)V

    return-void
.end method


# virtual methods
.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 203
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 204
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mScrollSettleHandler:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->setSettleEnabled(Z)V

    goto :goto_0

    .line 205
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    .line 206
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mScrollSettleHandler:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->setSettleEnabled(Z)V

    .line 207
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mScrollSettleHandler:Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->getScrollY()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$ScrollSettleHandler;->onScroll(I)V

    .line 209
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setReturningView(Landroid/view/View;)V
    .locals 1

    .line 65
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mReturningView:Landroid/view/View;

    .line 68
    :try_start_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mReturningView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 69
    iget p1, p1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mGravity:I
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    new-instance v0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;-><init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 85
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mReturningView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iput p1, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mReturningViewHeight:I

    .line 86
    new-instance p1, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$RecyclerScrollListener;-><init>(Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView$1;)V

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->setOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    return-void

    .line 71
    :catch_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "The return view need to be put in a FrameLayout"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public translateReturningView(I)V
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/QuickReturnRecyclerView;->mReturningView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

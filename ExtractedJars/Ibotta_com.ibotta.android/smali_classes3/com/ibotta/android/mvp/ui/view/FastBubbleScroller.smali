.class public Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;
.super Landroid/widget/LinearLayout;
.source "FastBubbleScroller.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;,
        Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;,
        Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;
    }
.end annotation


# static fields
.field private static final ALPHA:Ljava/lang/String; = "alpha"

.field private static final BUBBLE_ANIMATION_DURATION:J

.field private static final BUBBLE_HIDE_DELAY:J

.field private static final SCALE_X:Ljava/lang/String; = "scaleX"

.field private static final SCALE_Y:Ljava/lang/String; = "scaleY"


# instance fields
.field private final bubbleHider:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

.field private currentAnimator:Landroid/animation/AnimatorSet;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final fasHelper:Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

.field private hasDefaultHorizontalScrollbar:Z

.field private hasDefaultVerticalScrollbar:Z

.field private height:I

.field private isExpanded:Z

.field private recyclerView:Landroid/support/v7/widget/RecyclerView;

.field private scrollerListener:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;

.field protected tvBubble:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090206
    .end annotation
.end field

.field protected vHandle:Landroid/view/View;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090207
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 35
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_HIDE_DELAY:J

    .line 36
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_ANIMATION_DURATION:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 55
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    .line 49
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->isExpanded:Z

    .line 51
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;-><init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$1;)V

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->bubbleHider:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

    .line 52
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    invoke-direct {p2}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->fasHelper:Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    .line 56
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    .line 49
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->isExpanded:Z

    .line 51
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;-><init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$1;)V

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->bubbleHider:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

    .line 52
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    invoke-direct {p2}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->fasHelper:Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    .line 61
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 66
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 p2, 0x0

    .line 49
    iput-boolean p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->isExpanded:Z

    .line 51
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;-><init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$1;)V

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->bubbleHider:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

    .line 52
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    invoke-direct {p2}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->fasHelper:Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    .line 67
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$200(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->hideBubble()V

    return-void
.end method

.method static synthetic access$302(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Z)Z
    .locals 0

    .line 30
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->isExpanded:Z

    return p1
.end method

.method static synthetic access$402(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Landroid/animation/AnimatorSet;)Landroid/animation/AnimatorSet;
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->currentAnimator:Landroid/animation/AnimatorSet;

    return-object p1
.end method

.method private cancelAnimation()V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->currentAnimator:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_0
    return-void
.end method

.method private getFastBubbleScrollAdapter()Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;

    return-object v0
.end method

.method private getRowTitle(I)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    .line 192
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->getFastBubbleScrollAdapter()Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 193
    invoke-interface {v1}, Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;->getRows()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 194
    invoke-interface {v1}, Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;->getRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/FastBubbleScrollerRow;

    invoke-interface {p1}, Lcom/ibotta/android/views/list/FastBubbleScrollerRow;->getFastBubbleKey()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private handleTouchEvent(Landroid/view/MotionEvent;Landroid/os/Handler;)V
    .locals 3

    .line 122
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    .line 131
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_3

    .line 132
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->bubbleHider:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

    sget-wide v0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_HIDE_DELAY:J

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 p1, 0x0

    .line 133
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->updateScrollObservers(Z)V

    goto :goto_1

    .line 123
    :cond_2
    :goto_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->updateScrollObservers(Z)V

    .line 124
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setBubbleAndHandlePosition(F)V

    .line 125
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->cancelAnimation()V

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->bubbleHider:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$BubbleHider;

    invoke-virtual {p2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 127
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->showHandle()V

    .line 128
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->isExpanded:Z

    .line 129
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->showBubble()V

    .line 130
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setRecyclerViewPosition(F)V

    :cond_3
    :goto_1
    return-void
.end method

.method private hideBubble()V
    .locals 7

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotX(F)V

    .line 217
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotY(F)V

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    const-string v1, "alpha"

    const/4 v2, 0x2

    new-array v3, v2, [F

    fill-array-data v3, :array_0

    invoke-static {v0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    sget-wide v3, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_ANIMATION_DURATION:J

    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 220
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    const-string v3, "scaleX"

    new-array v4, v2, [F

    fill-array-data v4, :array_1

    invoke-static {v1, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    sget-wide v3, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_ANIMATION_DURATION:J

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v1

    .line 221
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    const-string v4, "scaleY"

    new-array v5, v2, [F

    fill-array-data v5, :array_2

    invoke-static {v3, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    sget-wide v4, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_ANIMATION_DURATION:J

    invoke-virtual {v3, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v3

    .line 223
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v4, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->currentAnimator:Landroid/animation/AnimatorSet;

    .line 224
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->currentAnimator:Landroid/animation/AnimatorSet;

    const/4 v5, 0x3

    new-array v5, v5, [Landroid/animation/Animator;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v3, v5, v1

    aput-object v0, v5, v2

    invoke-virtual {v4, v5}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->currentAnimator:Landroid/animation/AnimatorSet;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$AnimationCompletionListener;-><init>(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$1;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->currentAnimator:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private init(Landroid/content/Context;)V
    .locals 1

    .line 71
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c00e0

    invoke-virtual {p1, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    const/4 p1, 0x0

    .line 72
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setOrientation(I)V

    .line 73
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setClipChildren(Z)V

    return-void
.end method

.method private setBubbleAndHandlePosition(F)V
    .locals 4

    .line 156
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->height:I

    int-to-float v1, v0

    div-float/2addr p1, v1

    .line 157
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->fasHelper:Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {v2, v0, v3, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;->calculatePosition(IIF)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setY(F)V

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->fasHelper:Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->height:I

    invoke-virtual {v0}, Landroid/widget/TextView;->getHeight()I

    move-result v3

    invoke-virtual {v1, v2, v3, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;->calculatePosition(IIF)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setY(F)V

    return-void
.end method

.method private setBubbleText(I)V
    .locals 1

    .line 183
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->getRowTitle(I)Ljava/lang/String;

    move-result-object p1

    .line 184
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 185
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private setDefaultScrollbarStates()V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->isVerticalScrollBarEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->hasDefaultVerticalScrollbar:Z

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->isHorizontalScrollBarEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->hasDefaultHorizontalScrollbar:Z

    return-void
.end method

.method private setRecyclerViewPosition(F)V
    .locals 7

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 173
    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;

    invoke-interface {v0}, Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;->getRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    .line 174
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->fasHelper:Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->height:I

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move-result v5

    move v3, p1

    invoke-virtual/range {v1 .. v6}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScrollerHelper;->getTargetPosition(IFIFI)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->scrollToPosition(I)V

    .line 177
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setBubbleText(I)V

    :cond_0
    return-void
.end method

.method private shouldShow()Z
    .locals 1

    .line 113
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->getFastBubbleScrollAdapter()Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 114
    invoke-interface {v0}, Lcom/ibotta/android/views/list/FastBubbleScrollerAdapter;->getRows()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private showBubble()V
    .locals 7

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotX(F)V

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setPivotY(F)V

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    const-string v2, "scaleX"

    const/4 v3, 0x2

    new-array v4, v3, [F

    fill-array-data v4, :array_0

    invoke-static {v0, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    sget-wide v4, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_ANIMATION_DURATION:J

    invoke-virtual {v0, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    .line 206
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    const-string v4, "scaleY"

    new-array v5, v3, [F

    fill-array-data v5, :array_1

    invoke-static {v2, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    sget-wide v4, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_ANIMATION_DURATION:J

    invoke-virtual {v2, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v2

    .line 207
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->tvBubble:Landroid/widget/TextView;

    const-string v5, "alpha"

    new-array v6, v3, [F

    fill-array-data v6, :array_2

    invoke-static {v4, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    sget-wide v5, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->BUBBLE_ANIMATION_DURATION:J

    invoke-virtual {v4, v5, v6}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 209
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 v6, 0x3

    .line 210
    new-array v6, v6, [Landroid/animation/Animator;

    aput-object v0, v6, v1

    const/4 v0, 0x1

    aput-object v2, v6, v0

    aput-object v4, v6, v3

    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 211
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    :cond_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private showHandle()V
    .locals 2

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private toggleDefaultScrollbars(Z)V
    .locals 2

    .line 146
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->hasDefaultVerticalScrollbar:Z

    if-eqz v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVerticalScrollBarEnabled(Z)V

    .line 150
    :cond_0
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->hasDefaultHorizontalScrollbar:Z

    if-eqz v0, :cond_1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/RecyclerView;->setHorizontalScrollBarEnabled(Z)V

    :cond_1
    return-void
.end method

.method private updateScrollObservers(Z)V
    .locals 1

    .line 138
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->toggleDefaultScrollbars(Z)V

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->scrollerListener:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;

    if-eqz v0, :cond_0

    .line 141
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;->updatedScrollingState(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method protected onSizeChanged(IIII)V
    .locals 0

    .line 92
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;->onSizeChanged(IIII)V

    .line 93
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->height:I

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 98
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 99
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    .line 100
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    add-int/2addr v3, v1

    int-to-float v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x1

    cmpl-float v1, v2, v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 101
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->vHandle:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v5

    int-to-float v5, v5

    cmpg-float v2, v2, v5

    if-gez v2, :cond_1

    const/4 v3, 0x1

    .line 102
    :cond_1
    iget-boolean v2, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->isExpanded:Z

    if-nez v2, :cond_2

    if-eqz v1, :cond_3

    if-eqz v3, :cond_3

    .line 103
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->getHandler()Landroid/os/Handler;

    move-result-object v1

    .line 104
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->shouldShow()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v1, :cond_3

    .line 105
    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->handleTouchEvent(Landroid/view/MotionEvent;Landroid/os/Handler;)V

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public setRecyclerView(Landroid/support/v7/widget/RecyclerView;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->recyclerView:Landroid/support/v7/widget/RecyclerView;

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->setDefaultScrollbarStates()V

    return-void
.end method

.method public setScrollingListener(Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller;->scrollerListener:Lcom/ibotta/android/mvp/ui/view/FastBubbleScroller$FastBubbleScrollerListener;

    return-void
.end method

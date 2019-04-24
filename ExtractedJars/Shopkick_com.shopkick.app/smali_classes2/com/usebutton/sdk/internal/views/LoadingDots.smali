.class public Lcom/usebutton/sdk/internal/views/LoadingDots;
.super Landroid/widget/LinearLayout;
.source "LoadingDots.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;,
        Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;
    }
.end annotation


# static fields
.field public static final PULSE_DURATION:I = 0x2ee


# instance fields
.field private mDotCount:I

.field private mDotPadding:F

.field private mDotSize:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, v0}, Lcom/usebutton/sdk/internal/views/LoadingDots;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/sdk/internal/views/LoadingDots;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/views/LoadingDots;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 55
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 56
    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/views/LoadingDots;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private addDot(I)V
    .locals 8

    .line 87
    new-instance v0, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/usebutton/sdk/internal/views/LoadingDots$LoadingDot;-><init>(Lcom/usebutton/sdk/internal/views/LoadingDots;Landroid/content/Context;)V

    .line 88
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    iget v2, p0, Lcom/usebutton/sdk/internal/views/LoadingDots;->mDotSize:F

    float-to-int v3, v2

    float-to-int v2, v2

    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 89
    iget v2, p0, Lcom/usebutton/sdk/internal/views/LoadingDots;->mDotPadding:F

    float-to-int v2, v2

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 90
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 93
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    const/high16 v2, 0x42b40000    # 90.0f

    int-to-float p1, p1

    mul-float/2addr p1, v2

    float-to-long v2, p1

    const-string p1, "alpha"

    const/4 v4, 0x2

    .line 95
    new-array v5, v4, [F

    fill-array-data v5, :array_0

    invoke-static {v0, p1, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 96
    invoke-virtual {p1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    const/4 v5, 0x3

    .line 98
    new-array v5, v5, [Landroid/animation/Animator;

    const/4 v6, 0x0

    const-string v7, "scaleX"

    .line 99
    invoke-direct {p0, v0, v7}, Lcom/usebutton/sdk/internal/views/LoadingDots;->scaleProperty(Landroid/view/View;Ljava/lang/String;)Landroid/animation/ObjectAnimator;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    const-string v7, "scaleY"

    .line 100
    invoke-direct {p0, v0, v7}, Lcom/usebutton/sdk/internal/views/LoadingDots;->scaleProperty(Landroid/view/View;Ljava/lang/String;)Landroid/animation/ObjectAnimator;

    move-result-object v7

    aput-object v7, v5, v6

    aput-object p1, v5, v4

    .line 98
    invoke-virtual {v1, v5}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 103
    new-instance p1, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;

    const v4, 0x3e4ccccd    # 0.2f

    const v5, 0x3f2e147b    # 0.68f

    const v6, 0x3e3851ec    # 0.18f

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {p1, v4, v5, v6, v7}, Lcom/usebutton/sdk/internal/views/LoadingDots$BezierInterpolator;-><init>(FFFF)V

    invoke-virtual {v1, p1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v4, 0x2ee

    .line 104
    invoke-virtual {v1, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 105
    invoke-virtual {v1, v2, v3}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    .line 106
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 109
    :cond_0
    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/views/LoadingDots;->addView(Landroid/view/View;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private addDotViews(I)V
    .locals 1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 82
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/views/LoadingDots;->addDot(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private init(Landroid/util/AttributeSet;)V
    .locals 6

    .line 60
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/views/LoadingDots;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/usebutton/sdk/R$styleable;->LoadingDots:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 62
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_3

    .line 64
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 65
    sget v4, Lcom/usebutton/sdk/R$styleable;->LoadingDots_btn_loadingDotsCount:I

    if-ne v3, v4, :cond_0

    .line 66
    invoke-virtual {p1, v3, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Lcom/usebutton/sdk/internal/views/LoadingDots;->mDotCount:I

    goto :goto_1

    .line 67
    :cond_0
    sget v4, Lcom/usebutton/sdk/R$styleable;->LoadingDots_btn_dotSize:I

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    .line 68
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lcom/usebutton/sdk/internal/views/LoadingDots;->mDotSize:F

    goto :goto_1

    .line 69
    :cond_1
    sget v4, Lcom/usebutton/sdk/R$styleable;->LoadingDots_btn_paddingRight:I

    if-ne v3, v4, :cond_2

    .line 70
    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v3

    iput v3, p0, Lcom/usebutton/sdk/internal/views/LoadingDots;->mDotPadding:F

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    iget p1, p0, Lcom/usebutton/sdk/internal/views/LoadingDots;->mDotCount:I

    if-lez p1, :cond_4

    .line 77
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/views/LoadingDots;->addDotViews(I)V

    return-void

    .line 75
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "We need more than 0 dots to show loading dots, set with btn:btn_loadingDotsCount=\"3\""

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private scaleProperty(Landroid/view/View;Ljava/lang/String;)Landroid/animation/ObjectAnimator;
    .locals 1

    const/4 v0, 0x3

    .line 113
    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {p1, p2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const/4 p2, -0x1

    .line 114
    invoke-virtual {p1, p2}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    const/4 p2, 0x1

    .line 115
    invoke-virtual {p1, p2}, Landroid/animation/ObjectAnimator;->setRepeatMode(I)V

    return-object p1

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3e99999a    # 0.3f
        0x3f800000    # 1.0f
    .end array-data
.end method

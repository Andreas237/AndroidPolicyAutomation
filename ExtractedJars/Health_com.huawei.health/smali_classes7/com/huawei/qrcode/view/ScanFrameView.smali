.class public Lcom/huawei/qrcode/view/ScanFrameView;
.super Landroid/widget/ImageView;


# static fields
.field private static final ANIMATION_DELAY:J = 0xfaL

.field private static final SCAN_DURATION:J = 0x9c4L


# instance fields
.field private mAnimatorDrawableHeight:I

.field private mAnimatorMovingTime:J

.field private mAnimatorSet:Landroid/animation/AnimatorSet;

.field private mAnimatorTime:J

.field private mAnimatorWaitingTime:J

.field private mDownAnimator:Landroid/animation/ValueAnimator;

.field private mDownAnimatorFactor:F

.field private mDownAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field private mDownDrawable:Landroid/graphics/drawable/Drawable;

.field private mDrawableClipRect:Landroid/graphics/Rect;

.field private mDrawableRect:Landroid/graphics/Rect;

.field private mHeight:I

.field private mUpAnimator:Landroid/animation/ValueAnimator;

.field private mUpAnimatorFactor:F

.field private mUpAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field private mUpDrawable:Landroid/graphics/drawable/Drawable;

.field private mWidth:I

.field private needShowDownDrawable:Z

.field private needShowUpDrawable:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowDownDrawable:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowUpDrawable:Z

    new-instance v0, Lcom/huawei/qrcode/view/ScanFrameView$1;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/view/ScanFrameView$1;-><init>(Lcom/huawei/qrcode/view/ScanFrameView;)V

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    new-instance v0, Lcom/huawei/qrcode/view/ScanFrameView$2;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/view/ScanFrameView$2;-><init>(Lcom/huawei/qrcode/view/ScanFrameView;)V

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/view/ScanFrameView;->init(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowDownDrawable:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowUpDrawable:Z

    new-instance v0, Lcom/huawei/qrcode/view/ScanFrameView$1;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/view/ScanFrameView$1;-><init>(Lcom/huawei/qrcode/view/ScanFrameView;)V

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    new-instance v0, Lcom/huawei/qrcode/view/ScanFrameView$2;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/view/ScanFrameView$2;-><init>(Lcom/huawei/qrcode/view/ScanFrameView;)V

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/view/ScanFrameView;->init(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/qrcode/view/ScanFrameView;)J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorMovingTime:J

    return-wide v0
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/view/ScanFrameView;)J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorTime:J

    return-wide v0
.end method

.method static synthetic access$202(Lcom/huawei/qrcode/view/ScanFrameView;F)F
    .locals 0

    iput p1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimatorFactor:F

    return p1
.end method

.method static synthetic access$302(Lcom/huawei/qrcode/view/ScanFrameView;F)F
    .locals 0

    iput p1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimatorFactor:F

    return p1
.end method

.method private calculateScanLineBounds(F)Landroid/graphics/Rect;
    .locals 7

    iget v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorDrawableHeight:I

    neg-int v0, v0

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mHeight:I

    iget v2, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorDrawableHeight:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v1, p1

    add-float/2addr v0, v1

    float-to-int v3, v0

    iget v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorDrawableHeight:I

    add-int v4, v3, v0

    const/4 v5, 0x0

    iget v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mWidth:I

    add-int/lit8 v6, v0, 0x0

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDrawableRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v5, v3, v6, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDrawableRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method private init(Landroid/content/Context;)V
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ScanFrameView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "scanqrcode_sdk_scan_down_animator"

    invoke-static {p1, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getDrawableId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/huawei/qrcode/view/ScanFrameView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "scanqrcode_sdk_scan_up_animator"

    invoke-static {p1, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getDrawableId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    iput v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorDrawableHeight:I

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDrawableRect:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDrawableClipRect:Landroid/graphics/Rect;

    return-void
.end method

.method private initAnimation()V
    .locals 6

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimator:Landroid/animation/ValueAnimator;

    const-wide/16 v0, 0x9c4

    iput-wide v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorMovingTime:J

    iget v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mHeight:I

    int-to-long v0, v0

    const-wide/16 v2, 0x9c4

    mul-long/2addr v0, v2

    long-to-float v0, v0

    iget v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mHeight:I

    iget v2, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorDrawableHeight:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-long v0, v0

    iput-wide v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorWaitingTime:J

    iget-wide v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorMovingTime:J

    iget-wide v2, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorWaitingTime:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorTime:J

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimator:Landroid/animation/ValueAnimator;

    iget-wide v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorTime:J

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimator:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    iget-wide v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorTime:J

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mHeight:I

    iget v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorDrawableHeight:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mHeight:I

    iget v2, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorDrawableHeight:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v0, v1

    const v1, 0x451c4000    # 2500.0f

    mul-float/2addr v0, v1

    float-to-long v4, v0

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v4, v5}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/animation/Animator;

    iget-object v2, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimator:Landroid/animation/ValueAnimator;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    return-void

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
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDrawableClipRect:Landroid/graphics/Rect;

    iget v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mWidth:I

    iget v2, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mHeight:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDrawableClipRect:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    iget-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowDownDrawable:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownDrawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimatorFactor:F

    invoke-direct {p0, v1}, Lcom/huawei/qrcode/view/ScanFrameView;->calculateScanLineBounds(F)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    iget-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowUpDrawable:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpDrawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimatorFactor:F

    invoke-direct {p0, v1}, Lcom/huawei/qrcode/view/ScanFrameView;->calculateScanLineBounds(F)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public startQrcodeAnimation()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowDownDrawable:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowUpDrawable:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimatorFactor:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimatorFactor:F

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :cond_1
    return-void
.end method

.method public stopQrcodeAnimation()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimatorFactor:F

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimatorFactor:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowDownDrawable:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->needShowUpDrawable:Z

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mAnimatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mDownAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_2
    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mUpAnimator:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    :cond_3
    return-void
.end method

.method public updateSize(II)V
    .locals 0

    iput p1, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mWidth:I

    iput p2, p0, Lcom/huawei/qrcode/view/ScanFrameView;->mHeight:I

    invoke-direct {p0}, Lcom/huawei/qrcode/view/ScanFrameView;->initAnimation()V

    return-void
.end method

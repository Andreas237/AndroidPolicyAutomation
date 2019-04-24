.class Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/HwBottomNavigationView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ComplexDrawable"
.end annotation


# static fields
.field private static final MAX_SCALE:F = 1.42f


# instance fields
.field private mAnimationDuration:I

.field private mAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field private mCheckAnim:Landroid/animation/ValueAnimator;

.field private mClipPath:Landroid/graphics/Path;

.field private mContext:Landroid/content/Context;

.field private mDrawableRect:Landroid/graphics/Rect;

.field private mDstDrawable:Landroid/graphics/drawable/Drawable;

.field private mIconActiveColor:I

.field private mIconBounds:I

.field private mIconDefaultColor:I

.field private mRadius:I

.field private mSrcDrawable:Landroid/graphics/drawable/Drawable;

.field private mUnCheckAnim:Landroid/animation/ValueAnimator;

.field final synthetic this$0:Lhuawei/widget/HwBottomNavigationView;


# direct methods
.method public constructor <init>(Lhuawei/widget/HwBottomNavigationView;Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V
    .locals 5

    .line 880
    iput-object p1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->this$0:Lhuawei/widget/HwBottomNavigationView;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 870
    const/4 v0, 0x0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mRadius:I

    .line 881
    iput-object p2, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mContext:Landroid/content/Context;

    .line 882
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$integer;->hwbottomnav_icon_anim_duration:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mAnimationDuration:I

    .line 884
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lhuawei/widget/hwbottomnavigationview/R$dimen;->hwbottomnav_item_icon_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconBounds:I

    .line 886
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconBounds:I

    iget v2, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconBounds:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDrawableRect:Landroid/graphics/Rect;

    .line 887
    invoke-virtual {p0, p3}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setSrcDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 888
    new-instance v0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable$1;

    invoke-direct {v0, p0, p1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable$1;-><init>(Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;Lhuawei/widget/HwBottomNavigationView;)V

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    .line 895
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mClipPath:Landroid/graphics/Path;

    .line 896
    invoke-direct {p0}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->initAnim()V

    .line 897
    return-void
.end method

.method static synthetic access$500(Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;I)V
    .locals 0

    .line 866
    invoke-direct {p0, p1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setRadius(I)V

    return-void
.end method

.method private initAnim()V
    .locals 6

    .line 900
    new-instance v4, Lo/flf;

    const v0, 0x3ecccccd    # 0.4f

    const/4 v1, 0x0

    const v2, 0x3e4ccccd    # 0.2f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v4, v0, v1, v2, v3}, Lo/flf;-><init>(FFFF)V

    .line 902
    new-instance v5, Lo/flf;

    const v0, 0x3e4ccccd    # 0.2f

    const/4 v1, 0x0

    const v2, 0x3e4ccccd    # 0.2f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v5, v0, v1, v2, v3}, Lo/flf;-><init>(FFFF)V

    .line 904
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconBounds:I

    int-to-float v1, v1

    const v2, 0x3fb5c28f    # 1.42f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mCheckAnim:Landroid/animation/ValueAnimator;

    .line 905
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mCheckAnim:Landroid/animation/ValueAnimator;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mAnimationDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 906
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mCheckAnim:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 907
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mCheckAnim:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 908
    const/4 v0, 0x2

    new-array v0, v0, [I

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconBounds:I

    int-to-float v1, v1

    const v2, 0x3fb5c28f    # 1.42f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v1, v0, v2

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mUnCheckAnim:Landroid/animation/ValueAnimator;

    .line 909
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mUnCheckAnim:Landroid/animation/ValueAnimator;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mAnimationDuration:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 910
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mUnCheckAnim:Landroid/animation/ValueAnimator;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mAnimatorListener:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 911
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mUnCheckAnim:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 912
    return-void
.end method

.method private reflectGetStateDrawable(Landroid/graphics/drawable/StateListDrawable;I)Landroid/graphics/drawable/Drawable;
    .locals 6

    .line 1003
    const-string v0, "getStateDrawable"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 1004
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Landroid/graphics/drawable/StateListDrawable;

    .line 1003
    invoke-static {p1, v0, v1, v2, v3}, Lo/fkw;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    .line 1005
    if-eqz v5, :cond_0

    .line 1006
    move-object v0, v5

    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0

    .line 1008
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private reflectGetStateDrawableIndex(Landroid/graphics/drawable/StateListDrawable;[I)I
    .locals 5

    .line 1012
    const-string v0, "getStateDrawableIndex"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    .line 1013
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const-class v3, Landroid/graphics/drawable/StateListDrawable;

    .line 1012
    invoke-static {p1, v0, v1, v2, v3}, Lo/fkw;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    .line 1015
    if-eqz v4, :cond_0

    .line 1016
    move-object v0, v4

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 1018
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method private setRadius(I)V
    .locals 0

    .line 1046
    iput p1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mRadius:I

    .line 1047
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->invalidateSelf()V

    .line 1048
    return-void
.end method

.method private setSrcAndDst(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1022
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 1023
    :cond_0
    return-void

    .line 1025
    :cond_1
    iput-object p1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    .line 1026
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDrawableRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 1027
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_2

    .line 1029
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    .line 1030
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconDefaultColor:I

    invoke-static {v0, v1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_0

    .line 1032
    :cond_2
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconDefaultColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 1034
    :goto_0
    iput-object p2, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    .line 1035
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDrawableRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 1036
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_3

    .line 1038
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    .line 1039
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconActiveColor:I

    invoke-static {v0, v1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_1

    .line 1041
    :cond_3
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconActiveColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 1043
    :goto_1
    return-void
.end method

.method private startAnim(Z)V
    .locals 3

    .line 1081
    if-eqz p1, :cond_0

    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mUnCheckAnim:Landroid/animation/ValueAnimator;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mCheckAnim:Landroid/animation/ValueAnimator;

    .line 1082
    :goto_0
    if-eqz p1, :cond_1

    iget-object v2, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mCheckAnim:Landroid/animation/ValueAnimator;

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mUnCheckAnim:Landroid/animation/ValueAnimator;

    .line 1083
    :goto_1
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1084
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->reverse()V

    goto :goto_2

    .line 1086
    :cond_2
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 1088
    :goto_2
    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 916
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mClipPath:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 917
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->this$0:Lhuawei/widget/HwBottomNavigationView;

    invoke-static {v0}, Lhuawei/widget/HwBottomNavigationView;->access$300(Lhuawei/widget/HwBottomNavigationView;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v5, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconBounds:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDrawableRect:Landroid/graphics/Rect;

    iget v5, v0, Landroid/graphics/Rect;->left:I

    .line 918
    :goto_0
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mClipPath:Landroid/graphics/Path;

    int-to-float v1, v5

    iget-object v2, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDrawableRect:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    iget v3, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mRadius:I

    int-to-float v3, v3

    sget-object v4, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 921
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 922
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mClipPath:Landroid/graphics/Path;

    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 923
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 924
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 926
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 927
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mClipPath:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 928
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 929
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 930
    return-void
.end method

.method public getOpacity()I
    .locals 1

    .line 948
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 949
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0

    .line 951
    :cond_0
    const/4 v0, -0x3

    return v0
.end method

.method setActiveColor(I)V
    .locals 2

    .line 1056
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconActiveColor:I

    if-eq v0, p1, :cond_1

    .line 1057
    iput p1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconActiveColor:I

    .line 1058
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1059
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mDstDrawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconActiveColor:I

    invoke-static {v0, v1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 1061
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->invalidateSelf()V

    .line 1063
    :cond_1
    return-void
.end method

.method public setAlpha(I)V
    .locals 1

    .line 934
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 935
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 937
    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 941
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 942
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 944
    :cond_0
    return-void
.end method

.method setDefaultColor(I)V
    .locals 2

    .line 1071
    iget v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconDefaultColor:I

    if-eq v0, p1, :cond_1

    .line 1072
    iput p1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconDefaultColor:I

    .line 1073
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1074
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mSrcDrawable:Landroid/graphics/drawable/Drawable;

    iget v1, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconDefaultColor:I

    invoke-static {v0, v1}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 1076
    :cond_0
    invoke-virtual {p0}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->invalidateSelf()V

    .line 1078
    :cond_1
    return-void
.end method

.method setSrcDrawable(I)V
    .locals 2

    .line 960
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 961
    invoke-virtual {p0, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setSrcDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 962
    return-void
.end method

.method setSrcDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 12

    .line 968
    instance-of v0, p1, Landroid/graphics/drawable/StateListDrawable;

    if-eqz v0, :cond_7

    .line 969
    move-object v4, p1

    check-cast v4, Landroid/graphics/drawable/StateListDrawable;

    .line 970
    iget-object v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "state_selected"

    const-string v2, "attr"

    const-string v3, "android"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 971
    const/4 v0, 0x0

    new-array v6, v0, [I

    .line 972
    const/4 v0, 0x1

    new-array v7, v0, [I

    const/4 v0, 0x0

    aput v5, v7, v0

    .line 973
    const/4 v0, 0x1

    new-array v8, v0, [I

    xor-int/lit8 v0, v5, -0x1

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 974
    const/4 v9, 0x0

    .line 975
    const/4 v10, 0x0

    .line 976
    const/4 v11, 0x0

    .line 978
    invoke-direct {p0, v4, v8}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->reflectGetStateDrawableIndex(Landroid/graphics/drawable/StateListDrawable;[I)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 979
    invoke-direct {p0, v4, v11}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->reflectGetStateDrawable(Landroid/graphics/drawable/StateListDrawable;I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    .line 982
    :cond_0
    invoke-direct {p0, v4, v7}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->reflectGetStateDrawableIndex(Landroid/graphics/drawable/StateListDrawable;[I)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 983
    invoke-direct {p0, v4, v11}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->reflectGetStateDrawable(Landroid/graphics/drawable/StateListDrawable;I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    .line 986
    :cond_1
    if-nez v9, :cond_2

    if-nez v10, :cond_2

    .line 987
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setSrcAndDst(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 988
    :cond_2
    if-eqz v9, :cond_3

    if-eqz v10, :cond_3

    .line 989
    invoke-direct {p0, v9, v10}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setSrcAndDst(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 990
    :cond_3
    invoke-direct {p0, v4, v6}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->reflectGetStateDrawableIndex(Landroid/graphics/drawable/StateListDrawable;[I)I

    move-result v0

    move v11, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 991
    if-nez v9, :cond_4

    invoke-direct {p0, v4, v11}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->reflectGetStateDrawable(Landroid/graphics/drawable/StateListDrawable;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_4
    move-object v0, v9

    :goto_0
    if-nez v10, :cond_5

    .line 992
    invoke-direct {p0, v4, v11}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->reflectGetStateDrawable(Landroid/graphics/drawable/StateListDrawable;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_1

    :cond_5
    move-object v1, v10

    .line 991
    :goto_1
    invoke-direct {p0, v0, v1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setSrcAndDst(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 994
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "no resource available to provide"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 997
    :goto_2
    goto :goto_3

    .line 998
    :cond_7
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setSrcAndDst(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1000
    :goto_3
    return-void
.end method

.method setState(ZZ)V
    .locals 2

    .line 1097
    if-eqz p2, :cond_0

    .line 1098
    invoke-direct {p0, p1}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->startAnim(Z)V

    goto :goto_1

    .line 1100
    :cond_0
    if-eqz p1, :cond_1

    iget v0, p0, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->mIconBounds:I

    int-to-float v0, v0

    const v1, 0x3fb5c28f    # 1.42f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lhuawei/widget/HwBottomNavigationView$ComplexDrawable;->setRadius(I)V

    .line 1102
    :goto_1
    return-void
.end method

.class public Lcom/shopkick/app/animation/FlipViews;
.super Ljava/lang/Object;
.source "FlipViews.java"


# static fields
.field private static final FLIP_DURATION:I = 0xfa


# instance fields
.field private flip1:Landroid/view/animation/ScaleAnimation;

.field private flip2:Landroid/view/animation/ScaleAnimation;

.field private flipAnimationEndListener:Landroid/view/animation/Animation$AnimationListener;

.field private flipAnimationListener:Landroid/view/animation/Animation$AnimationListener;

.field private flipCallback:Lcom/shopkick/app/controllers/IFlipCallback;

.field private layout1:Landroid/widget/RelativeLayout;

.field private layout2:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/widget/RelativeLayout;Landroid/widget/RelativeLayout;Lcom/shopkick/app/controllers/IFlipCallback;)V
    .locals 9

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Lcom/shopkick/app/animation/FlipViews$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/animation/FlipViews$1;-><init>(Lcom/shopkick/app/animation/FlipViews;)V

    iput-object v0, p0, Lcom/shopkick/app/animation/FlipViews;->flipAnimationListener:Landroid/view/animation/Animation$AnimationListener;

    .line 60
    new-instance v0, Lcom/shopkick/app/animation/FlipViews$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/animation/FlipViews$2;-><init>(Lcom/shopkick/app/animation/FlipViews;)V

    iput-object v0, p0, Lcom/shopkick/app/animation/FlipViews;->flipAnimationEndListener:Landroid/view/animation/Animation$AnimationListener;

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/animation/FlipViews;->layout1:Landroid/widget/RelativeLayout;

    .line 25
    iput-object p2, p0, Lcom/shopkick/app/animation/FlipViews;->layout2:Landroid/widget/RelativeLayout;

    .line 26
    iput-object p3, p0, Lcom/shopkick/app/animation/FlipViews;->flipCallback:Lcom/shopkick/app/controllers/IFlipCallback;

    .line 28
    new-instance p3, Landroid/view/animation/ScaleAnimation;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v6, v0

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-float v7, p1

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const v5, 0x3f333333    # 0.7f

    move-object v1, p3

    invoke-direct/range {v1 .. v7}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    iput-object p3, p0, Lcom/shopkick/app/animation/FlipViews;->flip1:Landroid/view/animation/ScaleAnimation;

    .line 29
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews;->flip1:Landroid/view/animation/ScaleAnimation;

    const-wide/16 v0, 0xfa

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 30
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews;->flip1:Landroid/view/animation/ScaleAnimation;

    new-instance p3, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {p1, p3}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 31
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews;->flip1:Landroid/view/animation/ScaleAnimation;

    iget-object p3, p0, Lcom/shopkick/app/animation/FlipViews;->flipAnimationListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p1, p3}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 33
    new-instance p1, Landroid/view/animation/ScaleAnimation;

    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-float v7, p3

    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    int-to-float v8, p2

    const/high16 v6, 0x3f800000    # 1.0f

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    iput-object p1, p0, Lcom/shopkick/app/animation/FlipViews;->flip2:Landroid/view/animation/ScaleAnimation;

    .line 34
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews;->flip2:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 35
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews;->flip2:Landroid/view/animation/ScaleAnimation;

    new-instance p2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {p1, p2}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 36
    iget-object p1, p0, Lcom/shopkick/app/animation/FlipViews;->flip2:Landroid/view/animation/ScaleAnimation;

    iget-object p2, p0, Lcom/shopkick/app/animation/FlipViews;->flipAnimationEndListener:Landroid/view/animation/Animation$AnimationListener;

    invoke-virtual {p1, p2}, Landroid/view/animation/ScaleAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/animation/FlipViews;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/shopkick/app/animation/FlipViews;->layout1:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/animation/FlipViews;)Landroid/view/animation/ScaleAnimation;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/shopkick/app/animation/FlipViews;->flip2:Landroid/view/animation/ScaleAnimation;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/animation/FlipViews;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/shopkick/app/animation/FlipViews;->layout2:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/animation/FlipViews;)Lcom/shopkick/app/controllers/IFlipCallback;
    .locals 0

    .line 12
    iget-object p0, p0, Lcom/shopkick/app/animation/FlipViews;->flipCallback:Lcom/shopkick/app/controllers/IFlipCallback;

    return-object p0
.end method


# virtual methods
.method public startFlip()V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/shopkick/app/animation/FlipViews;->layout1:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/animation/FlipViews;->flip1:Landroid/view/animation/ScaleAnimation;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

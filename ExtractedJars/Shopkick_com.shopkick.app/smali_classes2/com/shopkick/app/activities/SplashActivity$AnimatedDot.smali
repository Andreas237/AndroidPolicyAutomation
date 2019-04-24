.class Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;
.super Ljava/lang/Object;
.source "SplashActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/activities/SplashActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AnimatedDot"
.end annotation


# instance fields
.field private animationDuration:I

.field private animationOffset:I

.field private animationPosition:I

.field private dotImage:Landroid/view/View;

.field private nextAnimation:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

.field private setupAnimationListeners:Z

.field final synthetic this$0:Lcom/shopkick/app/activities/SplashActivity;

.field private zoomInSet:Landroid/view/animation/AnimationSet;

.field private zoomOutSet:Landroid/view/animation/AnimationSet;


# direct methods
.method constructor <init>(Lcom/shopkick/app/activities/SplashActivity;Landroid/view/View;IIIZLcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V
    .locals 0

    .line 608
    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->this$0:Lcom/shopkick/app/activities/SplashActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 609
    iput-object p2, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->dotImage:Landroid/view/View;

    .line 610
    iput p3, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->animationDuration:I

    .line 611
    iput p4, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->animationPosition:I

    .line 612
    iput p5, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->animationOffset:I

    .line 614
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->setupZoomInAnimation()Landroid/view/animation/AnimationSet;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->zoomInSet:Landroid/view/animation/AnimationSet;

    .line 615
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->setupZoomOutAnimation()Landroid/view/animation/AnimationSet;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->zoomOutSet:Landroid/view/animation/AnimationSet;

    .line 617
    iput-boolean p6, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->setupAnimationListeners:Z

    .line 619
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->setupZoomInAnimationListener()V

    .line 620
    invoke-direct {p0}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->setupZoomOutAnimationListener()V

    .line 622
    iput-object p7, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->nextAnimation:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    return-void
.end method

.method static synthetic access$1000(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Landroid/view/animation/AnimationSet;
    .locals 0

    .line 589
    iget-object p0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->zoomOutSet:Landroid/view/animation/AnimationSet;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;
    .locals 0

    .line 589
    iget-object p0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->nextAnimation:Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Landroid/view/animation/AnimationSet;
    .locals 0

    .line 589
    iget-object p0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->zoomInSet:Landroid/view/animation/AnimationSet;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Landroid/view/View;
    .locals 0

    .line 589
    iget-object p0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->dotImage:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)Z
    .locals 0

    .line 589
    iget-boolean p0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->setupAnimationListeners:Z

    return p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)I
    .locals 0

    .line 589
    iget p0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->animationPosition:I

    return p0
.end method

.method private setupZoomInAnimation()Landroid/view/animation/AnimationSet;
    .locals 10

    .line 630
    new-instance v9, Landroid/view/animation/ScaleAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 638
    iget v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->animationOffset:I

    int-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 639
    iget v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->animationDuration:I

    int-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 640
    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    const v1, 0x3fcccccd    # 1.6f

    invoke-direct {v0, v1}, Landroid/view/animation/OvershootInterpolator;-><init>(F)V

    invoke-virtual {v9, v0}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 641
    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 642
    invoke-virtual {v0, v9}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    return-object v0
.end method

.method private setupZoomInAnimationListener()V
    .locals 2

    .line 648
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->zoomInSet:Landroid/view/animation/AnimationSet;

    new-instance v1, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$1;-><init>(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method private setupZoomOutAnimation()Landroid/view/animation/AnimationSet;
    .locals 10

    .line 685
    new-instance v9, Landroid/view/animation/ScaleAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    .line 693
    iget v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->animationOffset:I

    int-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    .line 694
    iget v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->animationDuration:I

    int-to-long v0, v0

    invoke-virtual {v9, v0, v1}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    .line 695
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v9, v0}, Landroid/view/animation/ScaleAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 696
    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 697
    invoke-virtual {v0, v9}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    return-object v0
.end method

.method private setupZoomOutAnimationListener()V
    .locals 2

    .line 703
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->zoomOutSet:Landroid/view/animation/AnimationSet;

    new-instance v1, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot$2;-><init>(Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method


# virtual methods
.method startZoomInAnimation()V
    .locals 2

    .line 740
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->dotImage:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->zoomInSet:Landroid/view/animation/AnimationSet;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method startZoomOutAnimation()V
    .locals 2

    .line 744
    iget-object v0, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->dotImage:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/activities/SplashActivity$AnimatedDot;->zoomOutSet:Landroid/view/animation/AnimationSet;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

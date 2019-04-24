.class final Lorg/aviran/cookiebar2/Cookie;
.super Landroid/widget/LinearLayout;
.source "Cookie.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;
    }
.end annotation


# instance fields
.field private btnAction:Landroid/widget/TextView;

.field private dismissOffsetThreshold:F

.field private duration:J

.field private initialDragX:F

.field private ivIcon:Landroid/widget/ImageView;

.field private layoutCookie:Landroid/view/ViewGroup;

.field private layoutGravity:I

.field private slideOutAnimation:Landroid/view/animation/Animation;

.field private slideOutAnimationDuration:J

.field private swipedOut:Z

.field private tvMessage:Landroid/widget/TextView;

.field private tvTitle:Landroid/widget/TextView;

.field private viewWidth:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 41
    invoke-direct {p0, p1, v0}, Lorg/aviran/cookiebar2/Cookie;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 45
    invoke-direct {p0, p1, p2, v0}, Lorg/aviran/cookiebar2/Cookie;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 50
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-wide/16 p1, 0x1f4

    .line 24
    iput-wide p1, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimationDuration:J

    const-wide/16 p1, 0x7d0

    .line 32
    iput-wide p1, p0, Lorg/aviran/cookiebar2/Cookie;->duration:J

    const/16 p1, 0x50

    .line 33
    iput p1, p0, Lorg/aviran/cookiebar2/Cookie;->layoutGravity:I

    return-void
.end method

.method static synthetic access$000(Lorg/aviran/cookiebar2/Cookie;)J
    .locals 2

    .line 22
    iget-wide v0, p0, Lorg/aviran/cookiebar2/Cookie;->duration:J

    return-wide v0
.end method

.method static synthetic access$100(Lorg/aviran/cookiebar2/Cookie;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lorg/aviran/cookiebar2/Cookie;->removeFromParent()V

    return-void
.end method

.method private createInAnim()V
    .locals 3

    .line 195
    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lorg/aviran/cookiebar2/Cookie;->layoutGravity:I

    const/16 v2, 0x50

    if-ne v1, v2, :cond_0

    sget v1, Lorg/aviran/cookiebar2/R$anim;->slide_in_from_bottom:I

    goto :goto_0

    :cond_0
    sget v1, Lorg/aviran/cookiebar2/R$anim;->slide_in_from_top:I

    :goto_0
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 197
    new-instance v1, Lorg/aviran/cookiebar2/Cookie$2;

    invoke-direct {v1, p0}, Lorg/aviran/cookiebar2/Cookie$2;-><init>(Lorg/aviran/cookiebar2/Cookie;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 219
    invoke-virtual {p0, v0}, Lorg/aviran/cookiebar2/Cookie;->setAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private createOutAnim()V
    .locals 3

    .line 223
    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lorg/aviran/cookiebar2/Cookie;->layoutGravity:I

    const/16 v2, 0x50

    if-ne v1, v2, :cond_0

    sget v1, Lorg/aviran/cookiebar2/R$anim;->slide_out_to_bottom:I

    goto :goto_0

    :cond_0
    sget v1, Lorg/aviran/cookiebar2/R$anim;->slide_out_to_top:I

    :goto_0
    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iput-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimation:Landroid/view/animation/Animation;

    .line 225
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimation:Landroid/view/animation/Animation;

    invoke-virtual {v0}, Landroid/view/animation/Animation;->getDuration()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimationDuration:J

    .line 226
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimation:Landroid/view/animation/Animation;

    new-instance v1, Lorg/aviran/cookiebar2/Cookie$3;

    invoke-direct {v1, p0}, Lorg/aviran/cookiebar2/Cookie$3;-><init>(Lorg/aviran/cookiebar2/Cookie;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method private getDestroyListener()Landroid/animation/Animator$AnimatorListener;
    .locals 1

    .line 337
    new-instance v0, Lorg/aviran/cookiebar2/Cookie$6;

    invoke-direct {v0, p0}, Lorg/aviran/cookiebar2/Cookie$6;-><init>(Lorg/aviran/cookiebar2/Cookie;)V

    return-object v0
.end method

.method private initDefaultStyle(Landroid/content/Context;)V
    .locals 5

    .line 102
    sget v0, Lorg/aviran/cookiebar2/R$attr;->cookieTitleColor:I

    const/4 v1, -0x1

    invoke-static {p1, v0, v1}, Lorg/aviran/cookiebar2/ThemeResolver;->getColor(Landroid/content/Context;II)I

    move-result v0

    .line 103
    sget v2, Lorg/aviran/cookiebar2/R$attr;->cookieMessageColor:I

    invoke-static {p1, v2, v1}, Lorg/aviran/cookiebar2/ThemeResolver;->getColor(Landroid/content/Context;II)I

    move-result v2

    .line 104
    sget v3, Lorg/aviran/cookiebar2/R$attr;->cookieActionColor:I

    invoke-static {p1, v3, v1}, Lorg/aviran/cookiebar2/ThemeResolver;->getColor(Landroid/content/Context;II)I

    move-result v1

    .line 105
    sget v3, Lorg/aviran/cookiebar2/R$attr;->cookieBackgroundColor:I

    sget v4, Lorg/aviran/cookiebar2/R$color;->default_bg_color:I

    .line 106
    invoke-static {p1, v4}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    .line 105
    invoke-static {p1, v3, v4}, Lorg/aviran/cookiebar2/ThemeResolver;->getColor(Landroid/content/Context;II)I

    move-result p1

    .line 108
    iget-object v3, p0, Lorg/aviran/cookiebar2/Cookie;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 109
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 110
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->btnAction:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 111
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->layoutCookie:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    return-void
.end method

.method private initViews(Landroid/view/View;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 60
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1, v0}, Lorg/aviran/cookiebar2/Cookie;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lorg/aviran/cookiebar2/R$layout;->layout_cookie:I

    invoke-static {p1, v0, p0}, Lorg/aviran/cookiebar2/Cookie;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 67
    :goto_0
    sget p1, Lorg/aviran/cookiebar2/R$id;->cookie:I

    invoke-virtual {p0, p1}, Lorg/aviran/cookiebar2/Cookie;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie;->layoutCookie:Landroid/view/ViewGroup;

    .line 68
    sget p1, Lorg/aviran/cookiebar2/R$id;->tv_title:I

    invoke-virtual {p0, p1}, Lorg/aviran/cookiebar2/Cookie;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie;->tvTitle:Landroid/widget/TextView;

    .line 69
    sget p1, Lorg/aviran/cookiebar2/R$id;->tv_message:I

    invoke-virtual {p0, p1}, Lorg/aviran/cookiebar2/Cookie;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie;->tvMessage:Landroid/widget/TextView;

    .line 70
    sget p1, Lorg/aviran/cookiebar2/R$id;->iv_icon:I

    invoke-virtual {p0, p1}, Lorg/aviran/cookiebar2/Cookie;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie;->ivIcon:Landroid/widget/ImageView;

    .line 71
    sget p1, Lorg/aviran/cookiebar2/R$id;->btn_action:I

    invoke-virtual {p0, p1}, Lorg/aviran/cookiebar2/Cookie;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie;->btnAction:Landroid/widget/TextView;

    .line 73
    invoke-direct {p0}, Lorg/aviran/cookiebar2/Cookie;->validateLayoutIntegrity()V

    .line 74
    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/aviran/cookiebar2/Cookie;->initDefaultStyle(Landroid/content/Context;)V

    .line 75
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie;->layoutCookie:Landroid/view/ViewGroup;

    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnTouchListener(Landroid/view/View;Landroid/view/View$OnTouchListener;)V

    :goto_1
    return-void
.end method

.method private removeFromParent()V
    .locals 3

    .line 278
    new-instance v0, Lorg/aviran/cookiebar2/Cookie$5;

    invoke-direct {v0, p0}, Lorg/aviran/cookiebar2/Cookie$5;-><init>(Lorg/aviran/cookiebar2/Cookie;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p0, v0, v1, v2}, Lorg/aviran/cookiebar2/Cookie;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private validateLayoutIntegrity()V
    .locals 2

    .line 79
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->layoutCookie:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvTitle:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvMessage:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->ivIcon:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->btnAction:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    return-void

    .line 82
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Your custom cookie view is missing one of the default required views"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    const/4 v0, 0x0

    .line 245
    invoke-virtual {p0, v0}, Lorg/aviran/cookiebar2/Cookie;->dismiss(Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;)V

    return-void
.end method

.method public dismiss(Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;)V
    .locals 4

    .line 249
    iget-boolean v0, p0, Lorg/aviran/cookiebar2/Cookie;->swipedOut:Z

    if-eqz v0, :cond_0

    .line 250
    invoke-direct {p0}, Lorg/aviran/cookiebar2/Cookie;->removeFromParent()V

    return-void

    .line 254
    :cond_0
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimation:Landroid/view/animation/Animation;

    new-instance v1, Lorg/aviran/cookiebar2/Cookie$4;

    invoke-direct {v1, p0, p1}, Lorg/aviran/cookiebar2/Cookie$4;-><init>(Lorg/aviran/cookiebar2/Cookie;Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    if-nez p1, :cond_1

    .line 272
    iget-wide v0, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimationDuration:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimationDuration:J

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    .line 273
    :goto_0
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimation:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 274
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie;->slideOutAnimation:Landroid/view/animation/Animation;

    invoke-virtual {p0, p1}, Lorg/aviran/cookiebar2/Cookie;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public getLayoutGravity()I
    .locals 1

    .line 54
    iget v0, p0, Lorg/aviran/cookiebar2/Cookie;->layoutGravity:I

    return v0
.end method

.method protected onLayout(ZIIII)V
    .locals 8

    .line 184
    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lorg/aviran/cookiebar2/Cookie;->viewWidth:F

    .line 185
    iget v0, p0, Lorg/aviran/cookiebar2/Cookie;->viewWidth:F

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    iput v0, p0, Lorg/aviran/cookiebar2/Cookie;->dismissOffsetThreshold:F

    .line 187
    iget v0, p0, Lorg/aviran/cookiebar2/Cookie;->layoutGravity:I

    const/16 v1, 0x30

    if-ne v0, v1, :cond_0

    const/4 v5, 0x0

    .line 188
    iget-object p3, p0, Lorg/aviran/cookiebar2/Cookie;->layoutCookie:Landroid/view/ViewGroup;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v7

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v6, p4

    invoke-super/range {v2 .. v7}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    goto :goto_0

    .line 190
    :cond_0
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    :goto_0
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 9

    .line 292
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const-wide/16 v1, 0xc8

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    .line 308
    :pswitch_0
    iget-boolean v0, p0, Lorg/aviran/cookiebar2/Cookie;->swipedOut:Z

    if-eqz v0, :cond_0

    return v5

    .line 311
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p2

    iget v0, p0, Lorg/aviran/cookiebar2/Cookie;->initialDragX:F

    sub-float/2addr p2, v0

    .line 312
    iget v0, p0, Lorg/aviran/cookiebar2/Cookie;->viewWidth:F

    div-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float v0, v3, v0

    const-wide/16 v6, 0x0

    .line 315
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v8, p0, Lorg/aviran/cookiebar2/Cookie;->dismissOffsetThreshold:F

    cmpl-float v3, v3, v8

    if-lez v3, :cond_1

    .line 316
    iget v0, p0, Lorg/aviran/cookiebar2/Cookie;->viewWidth:F

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result p2

    mul-float p2, p2, v0

    .line 319
    iput-boolean v5, p0, Lorg/aviran/cookiebar2/Cookie;->swipedOut:Z

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    move-wide v1, v6

    .line 322
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget-boolean v3, p0, Lorg/aviran/cookiebar2/Cookie;->swipedOut:Z

    if-eqz v3, :cond_2

    .line 323
    invoke-direct {p0}, Lorg/aviran/cookiebar2/Cookie;->getDestroyListener()Landroid/animation/Animator$AnimatorListener;

    move-result-object v3

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {p1, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 324
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 325
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 326
    invoke-virtual {p1, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 327
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    return v5

    .line 298
    :pswitch_1
    iget-boolean p2, p0, Lorg/aviran/cookiebar2/Cookie;->swipedOut:Z

    if-nez p2, :cond_3

    .line 299
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 300
    invoke-virtual {p1, v4}, Landroid/view/ViewPropertyAnimator;->x(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 301
    invoke-virtual {p1, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 302
    invoke-virtual {p1, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    .line 303
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_3
    return v5

    .line 294
    :pswitch_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lorg/aviran/cookiebar2/Cookie;->initialDragX:F

    return v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setParams(Lorg/aviran/cookiebar2/CookieBar$Params;)V
    .locals 4

    .line 115
    iget-object v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->customView:Landroid/view/View;

    invoke-direct {p0, v0}, Lorg/aviran/cookiebar2/Cookie;->initViews(Landroid/view/View;)V

    .line 117
    iget-wide v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->duration:J

    iput-wide v0, p0, Lorg/aviran/cookiebar2/Cookie;->duration:J

    .line 118
    iget v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->layoutGravity:I

    iput v0, p0, Lorg/aviran/cookiebar2/Cookie;->layoutGravity:I

    .line 121
    iget v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->iconResId:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->ivIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->ivIcon:Landroid/widget/ImageView;

    iget v2, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->iconResId:I

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 124
    iget-object v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->iconAnimator:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->iconAnimator:Landroid/animation/AnimatorSet;

    iget-object v2, p0, Lorg/aviran/cookiebar2/Cookie;->ivIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V

    .line 126
    iget-object v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->iconAnimator:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 132
    :cond_0
    iget-object v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->title:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 133
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 134
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvTitle:Landroid/widget/TextView;

    iget-object v2, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    iget v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->titleColor:I

    if-eqz v0, :cond_1

    .line 136
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->titleColor:I

    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 141
    :cond_1
    iget-object v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->message:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 142
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 143
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvMessage:Landroid/widget/TextView;

    iget-object v2, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->message:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    iget v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->messageColor:I

    if-eqz v0, :cond_2

    .line 145
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->tvMessage:Landroid/widget/TextView;

    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->messageColor:I

    invoke-static {v2, v3}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 150
    :cond_2
    iget-object v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->action:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->onActionClickListener:Lorg/aviran/cookiebar2/OnActionClickListener;

    if-eqz v0, :cond_4

    .line 151
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->btnAction:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->btnAction:Landroid/widget/TextView;

    iget-object v1, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->action:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->btnAction:Landroid/widget/TextView;

    new-instance v1, Lorg/aviran/cookiebar2/Cookie$1;

    invoke-direct {v1, p0, p1}, Lorg/aviran/cookiebar2/Cookie$1;-><init>(Lorg/aviran/cookiebar2/Cookie;Lorg/aviran/cookiebar2/CookieBar$Params;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 162
    :goto_0
    iget v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->actionColor:I

    if-eqz v0, :cond_4

    .line 163
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->btnAction:Landroid/widget/TextView;

    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->actionColor:I

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 168
    :cond_4
    iget v0, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->backgroundColor:I

    if-eqz v0, :cond_5

    .line 169
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->layoutCookie:Landroid/view/ViewGroup;

    .line 170
    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object v1

    iget p1, p1, Lorg/aviran/cookiebar2/CookieBar$Params;->backgroundColor:I

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 173
    :cond_5
    invoke-virtual {p0}, Lorg/aviran/cookiebar2/Cookie;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lorg/aviran/cookiebar2/R$dimen;->default_padding:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 174
    iget v0, p0, Lorg/aviran/cookiebar2/Cookie;->layoutGravity:I

    const/16 v1, 0x50

    if-ne v0, v1, :cond_6

    .line 175
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie;->layoutCookie:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 178
    :cond_6
    invoke-direct {p0}, Lorg/aviran/cookiebar2/Cookie;->createInAnim()V

    .line 179
    invoke-direct {p0}, Lorg/aviran/cookiebar2/Cookie;->createOutAnim()V

    return-void
.end method

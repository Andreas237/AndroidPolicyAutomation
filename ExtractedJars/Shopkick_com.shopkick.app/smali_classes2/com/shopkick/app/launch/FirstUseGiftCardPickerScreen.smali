.class public Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUseGiftCardPickerScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final FIVE_DOLLARS_IN_KICKS:J = 0x4e2L

.field private static final TITLE_TEXT_SCROLLED_STATE_RATIO:F = 0.75f


# instance fields
.field private dividerLine:Landroid/view/View;

.field protected firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field private firstUseGiftCardPickerDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;",
            ">;"
        }
    .end annotation
.end field

.field private flowId:Ljava/lang/String;

.field private footerRow:Landroid/view/View;

.field private isScrolling:Z

.field private listView:Landroid/widget/ListView;

.field private listViewAdapter:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

.field private nextButton:Lcom/shopkick/app/widget/SKButton;

.field private nextButtonContainer:Landroid/support/constraint/ConstraintLayout;

.field private nextUrl:Ljava/lang/String;

.field private previousFirstVisiblePosition:I

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private screenView:Landroid/view/View;

.field private scrollDownAnimationHappening:Z

.field private scrollHappening:Z

.field private scrollUpAnimationHappening:Z

.field private scrolledDown:Z

.field private selectedGiftCardIndex:I

.field private subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

.field private titleTextScrolledTextSize:F

.field private titleTextUnscrolledTextSize:F

.field private titleTextView:Lcom/shopkick/app/widget/SKTextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z
    .locals 0

    .line 44
    iget-boolean p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->isScrolling:Z

    return p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Z)Z
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->isScrolling:Z

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)I
    .locals 0

    .line 44
    iget p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->previousFirstVisiblePosition:I

    return p0
.end method

.method static synthetic access$1000(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/view/View;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->dividerLine:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$102(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;I)I
    .locals 0

    .line 44
    iput p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->previousFirstVisiblePosition:I

    return p1
.end method

.method static synthetic access$1100(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/support/constraint/ConstraintLayout;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButtonContainer:Landroid/support/constraint/ConstraintLayout;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/view/View;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->footerRow:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Landroid/widget/ListView;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z
    .locals 0

    .line 44
    iget-boolean p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollDownAnimationHappening:Z

    return p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Z)Z
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollDownAnimationHappening:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z
    .locals 0

    .line 44
    iget-boolean p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrolledDown:Z

    return p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z
    .locals 0

    .line 44
    iget-boolean p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollHappening:Z

    return p0
.end method

.method static synthetic access$402(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Z)Z
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollHappening:Z

    return p1
.end method

.method static synthetic access$500(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollDownTitleAnimation()V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Z
    .locals 0

    .line 44
    iget-boolean p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollUpAnimationHappening:Z

    return p0
.end method

.method static synthetic access$602(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Z)Z
    .locals 0

    .line 44
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollUpAnimationHappening:Z

    return p1
.end method

.method static synthetic access$700(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollUpTitleAnimation()V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextView:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method static synthetic access$900(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)Lcom/shopkick/app/widget/SKTextView;
    .locals 0

    .line 44
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    return-object p0
.end method

.method private onNextButtonClicked()V
    .locals 4

    .line 309
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->firstUseGiftCardPickerDetails:Ljava/util/List;

    iget v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->selectedGiftCardIndex:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;->rewardId:Ljava/lang/String;

    const-wide/16 v2, 0x4e2

    .line 313
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    .line 312
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/ProfileInfo;->setSelectedRewardId(Ljava/lang/String;Ljava/lang/Long;)V

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 316
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method

.method private scrollDownTitleAnimation()V
    .locals 8

    const/4 v0, 0x1

    .line 247
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollDownAnimationHappening:Z

    .line 248
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrolledDown:Z

    .line 249
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollHappening:Z

    .line 251
    iget v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextUnscrolledTextSize:F

    .line 252
    iget v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextScrolledTextSize:F

    const/4 v3, 0x2

    .line 255
    new-array v4, v3, [F

    const/4 v5, 0x0

    aput v1, v4, v5

    aput v2, v4, v0

    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    const-wide/16 v6, 0xc8

    .line 256
    invoke-virtual {v1, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 258
    new-instance v2, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$5;

    invoke-direct {v2, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$5;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 270
    new-array v2, v3, [F

    fill-array-data v2, :array_0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-wide/16 v6, 0x64

    .line 271
    invoke-virtual {v2, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 273
    new-instance v4, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$6;

    invoke-direct {v4, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$6;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    invoke-virtual {v2, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 281
    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 282
    new-instance v6, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$7;

    invoke-direct {v6, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$7;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    invoke-virtual {v4, v6}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 304
    new-array v3, v3, [Landroid/animation/Animator;

    aput-object v1, v3, v5

    aput-object v2, v3, v0

    invoke-virtual {v4, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 305
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private scrollUpTitleAnimation()V
    .locals 7

    const/4 v0, 0x1

    .line 185
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollUpAnimationHappening:Z

    const/4 v1, 0x0

    .line 186
    iput-boolean v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrolledDown:Z

    .line 187
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->scrollHappening:Z

    .line 189
    iget v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextScrolledTextSize:F

    .line 190
    iget v3, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextUnscrolledTextSize:F

    const/4 v4, 0x2

    .line 193
    new-array v5, v4, [F

    aput v2, v5, v1

    aput v3, v5, v0

    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    const-wide/16 v5, 0xc8

    .line 194
    invoke-virtual {v2, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 196
    new-instance v3, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$2;

    invoke-direct {v3, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$2;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 208
    new-array v3, v4, [F

    fill-array-data v3, :array_0

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v3

    const-wide/16 v5, 0x64

    .line 209
    invoke-virtual {v3, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 211
    new-instance v5, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$3;

    invoke-direct {v5, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$3;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    invoke-virtual {v3, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 219
    new-instance v5, Landroid/animation/AnimatorSet;

    invoke-direct {v5}, Landroid/animation/AnimatorSet;-><init>()V

    .line 220
    new-instance v6, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$4;

    invoke-direct {v6, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$4;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    invoke-virtual {v5, v6}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 242
    new-array v4, v4, [Landroid/animation/Animator;

    aput-object v2, v4, v1

    aput-object v3, v4, v0

    invoke-virtual {v5, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 243
    invoke-virtual {v5}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x0

    const v0, 0x7f0c00be

    .line 109
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->screenView:Landroid/view/View;

    .line 112
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->screenView:Landroid/view/View;

    const v0, 0x7f090461

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextView:Lcom/shopkick/app/widget/SKTextView;

    .line 113
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p2}, Lcom/shopkick/app/widget/SKTextView;->getTextSize()F

    move-result p2

    iput p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextUnscrolledTextSize:F

    .line 114
    iget p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextUnscrolledTextSize:F

    const/high16 v0, 0x3f400000    # 0.75f

    mul-float/2addr p2, v0

    iput p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->titleTextScrolledTextSize:F

    .line 117
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->screenView:Landroid/view/View;

    const v0, 0x7f090709

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    .line 119
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->screenView:Landroid/view/View;

    const v0, 0x7f090223

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->dividerLine:Landroid/view/View;

    .line 122
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->screenView:Landroid/view/View;

    const v0, 0x7f0905d6

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    .line 123
    new-instance p2, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->firstUseGiftCardPickerDetails:Ljava/util/List;

    invoke-direct {p2, v0, v1, p0, v2}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;-><init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Ljava/util/List;)V

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listViewAdapter:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    .line 130
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    const v0, 0x7f0c00bc

    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 134
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    invoke-virtual {p1, v0, v1, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 138
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, p2}, Landroid/widget/ListView;->removeHeaderView(Landroid/view/View;)Z

    .line 139
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->removeHeaderView(Landroid/view/View;)Z

    .line 140
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    invoke-virtual {v1, p2}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 141
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    invoke-virtual {p2, v0}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 143
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    const v0, 0x7f0c00bb

    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->footerRow:Landroid/view/View;

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listViewAdapter:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->listView:Landroid/widget/ListView;

    new-instance p2, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;

    invoke-direct {p2, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$1;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 177
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->screenView:Landroid/view/View;

    const p2, 0x7f0904a9

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/constraint/ConstraintLayout;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButtonContainer:Landroid/support/constraint/ConstraintLayout;

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButtonContainer:Landroid/support/constraint/ConstraintLayout;

    const p2, 0x7f0904a8

    invoke-virtual {p1, p2}, Landroid/support/constraint/ConstraintLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 179
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 181
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->screenView:Landroid/view/View;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 79
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 80
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    iget-object p1, p1, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseExperimentData:Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;->firstUseGiftCardPickerDetails:Ljava/util/List;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->firstUseGiftCardPickerDetails:Ljava/util/List;

    const-string p1, "button_url"

    .line 84
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextUrl:Ljava/lang/String;

    const-string p1, "flow_id"

    .line 85
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->flowId:Ljava/lang/String;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_0

    .line 322
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->onNextButtonClicked()V

    :cond_0
    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public showNextButton(I)V
    .locals 2

    .line 327
    iput p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->selectedGiftCardIndex:I

    .line 328
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButtonContainer:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {p1}, Landroid/support/constraint/ConstraintLayout;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_0

    .line 329
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f01001e

    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    const-wide/16 v0, 0x32

    .line 330
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 331
    new-instance v0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;

    invoke-direct {v0, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen$8;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;)V

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 351
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->nextButtonContainer:Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, p1}, Landroid/support/constraint/ConstraintLayout;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method public updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V
    .locals 1

    .line 100
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->updateScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->flowId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->flowId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setFlowId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

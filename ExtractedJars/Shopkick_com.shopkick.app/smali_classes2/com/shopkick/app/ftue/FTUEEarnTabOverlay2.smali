.class public Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "FTUEEarnTabOverlay2.java"


# static fields
.field private static final OPEN_STORE_DETAILS_DELAY:I = 0x64


# instance fields
.field private animatedSentences:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/text/SpannableString;",
            ">;"
        }
    .end annotation
.end field

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private chainId:Ljava/lang/String;

.field private chainIsOnlineStore:Ljava/lang/String;

.field private chainName:Ljava/lang/String;

.field private ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

.field private ftueTapIndicatorClickListener:Landroid/view/View$OnClickListener;

.field private locationId:Ljava/lang/String;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private mainView:Landroid/view/ViewGroup;

.field private tapIndicator:Landroid/widget/RelativeLayout;

.field private tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

.field private tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

.field private tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

.field private urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    .line 58
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->animatedSentences:Ljava/util/List;

    return-void
.end method

.method private enableWalkInEvent()V
    .locals 1

    .line 175
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/store/EarnScreen;

    if-eqz v0, :cond_0

    .line 176
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getTopScreen()Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/store/EarnScreen;

    .line 177
    invoke-virtual {v0}, Lcom/shopkick/app/store/EarnScreen;->addWalkinObserver()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$V_h7s-Wq2EwtFRjCoMZuL3rLJ8s(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->openStoreDetailsScreen()V

    return-void
.end method

.method public static synthetic lambda$init$95(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;Landroid/view/View;)V
    .locals 3

    .line 73
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->clearAnimation()V

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    .line 76
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    .line 77
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 78
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay2$V_h7s-Wq2EwtFRjCoMZuL3rLJ8s;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay2$V_h7s-Wq2EwtFRjCoMZuL3rLJ8s;-><init>(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;)V

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private logTheLessonCompletion()V
    .locals 2

    .line 188
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x5f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 189
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private logUserSeeTheScreen()V
    .locals 2

    .line 183
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x5c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 184
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    return-void
.end method

.method private openStoreDetailsScreen()V
    .locals 4

    .line 151
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "origin_element"

    const/16 v2, 0x62

    .line 152
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_id"

    .line 153
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "location_name"

    .line 154
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->chainName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain_id"

    .line 155
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->chainId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "is_online_store"

    .line 156
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->chainIsOnlineStore:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v3, Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-direct {v1, v2, v3, v0}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {v0}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object v0

    .line 159
    invoke-virtual {v1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueEarnLessonCompleted(Z)V

    .line 161
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->enableWalkInEvent()V

    .line 162
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->logTheLessonCompletion()V

    .line 163
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->dismiss()V

    return-void
.end method

.method private setupAnimatedSentence(Landroid/content/Context;Ljava/lang/String;)Landroid/text/SpannableString;
    .locals 4

    .line 167
    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, p2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 168
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v2, 0x7f060120

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    invoke-direct {v1, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 169
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->chainName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr p1, v2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    const/16 v2, 0x11

    .line 168
    invoke-virtual {v0, v1, p1, p2, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    return-object v0
.end method

.method private setupTapIndicatorClickListener()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueTapIndicatorClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 6

    .line 84
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090728

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    .line 86
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f090729

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RoundImageView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09072a

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RoundImageView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f09072b

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/RoundImageView;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v1, 0x7f0902a1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    .line 90
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v2, 0x7f0902a0

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/RoundImageView;

    const v2, 0x7f110311

    .line 92
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->chainName:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 95
    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    const v4, 0x7f0902a2

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/widget/SKTextView;

    .line 96
    invoke-virtual {v3, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 98
    iget-object v3, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->animatedSentences:Ljava/util/List;

    invoke-direct {p0, p1, v2}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->setupAnimatedSentence(Landroid/content/Context;Ljava/lang/String;)Landroid/text/SpannableString;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    new-instance v2, Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-direct {v2, p1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicator:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTapIndicator(Landroid/widget/RelativeLayout;)V

    .line 101
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTapIndicatorCircle1(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTapIndicatorCircle2(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {p1, v2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTapIndicatorCircle3(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setTextView(Lcom/shopkick/app/widget/SKTextView;)V

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setRoundImageView(Lcom/shopkick/app/widget/RoundImageView;)V

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->animatedSentences:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->setAnimatedSentences(Ljava/util/List;)V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    return-object p1
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12016c

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c00cd

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->mainView:Landroid/view/ViewGroup;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 64
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 65
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 66
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 67
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    .line 68
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->locationId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->locationId:Ljava/lang/String;

    .line 69
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainName:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->chainName:Ljava/lang/String;

    .line 70
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->chainId:Ljava/lang/String;

    .line 71
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainIsOnlineStore:Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->chainIsOnlineStore:Ljava/lang/String;

    .line 72
    new-instance p1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay2$JDbuO82ejT0xV4f-BDj_37pCOhM;

    invoke-direct {p1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEEarnTabOverlay2$JDbuO82ejT0xV4f-BDj_37pCOhM;-><init>(Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;)V

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueTapIndicatorClickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public isCancelable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    invoke-virtual {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->cleanFTUEAnimationManager()V

    .line 123
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->onOverlayDismissed(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    return-void
.end method

.method public onOverlayShown(Landroid/content/Context;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 113
    iget-object p1, p0, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->ftueAnimationManager:Lcom/shopkick/app/ftue/FTUEAnimationManager;

    const/16 p2, 0x258

    invoke-virtual {p1, p2}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->startTextViewAnimation(I)V

    .line 114
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->setupTapIndicatorClickListener()V

    .line 115
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEEarnTabOverlay2;->logUserSeeTheScreen()V

    return-void
.end method

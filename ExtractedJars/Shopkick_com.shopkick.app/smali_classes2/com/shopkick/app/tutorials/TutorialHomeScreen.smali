.class public Lcom/shopkick/app/tutorials/TutorialHomeScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "TutorialHomeScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;
    }
.end annotation


# static fields
.field private static final TUTORIAL_HOME_TEXT_LARGE_FONT_SIZE:F = 15.0f

.field private static final TUTORIAL_HOME_TEXT_MAX_LARGE_FONT_LENGTH:I = 0x3b

.field private static final TUTORIAL_HOME_TEXT_SMALL_FONT_SIZE:F = 13.0f


# instance fields
.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tutorials/TutorialHomeScreen;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->goToinviteScreen()V

    return-void
.end method

.method private goToinviteScreen()V
    .locals 7

    .line 126
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 127
    iget-object v0, p0, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const-string/jumbo v1, "sk://%s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "invite"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x6d

    .line 129
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x3e

    .line 131
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 127
    invoke-virtual/range {v0 .. v6}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Z

    return-void
.end method

.method private maybeShrinkText(Landroid/widget/TextView;)V
    .locals 2

    .line 83
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x3b

    if-le v0, v1, :cond_0

    const/high16 v0, 0x41500000    # 13.0f

    .line 84
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    goto :goto_0

    :cond_0
    const/high16 v0, 0x41700000    # 15.0f

    .line 86
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    :goto_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    const v0, 0x7f0c01e1

    .line 45
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f110731

    .line 46
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->setAppScreenTitle(I)V

    const p2, 0x7f0907ba

    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout;

    .line 49
    new-instance v0, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;-><init>(Lcom/shopkick/app/tutorials/TutorialHomeScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0907b8

    .line 51
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout;

    .line 52
    new-instance v0, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;-><init>(Lcom/shopkick/app/tutorials/TutorialHomeScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0907b6

    .line 54
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RelativeLayout;

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_0

    const/16 p3, 0x8

    .line 56
    invoke-virtual {p2, p3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p2, p3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 59
    new-instance p3, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;

    invoke-direct {p3, p0}, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;-><init>(Lcom/shopkick/app/tutorials/TutorialHomeScreen;)V

    invoke-virtual {p2, p3}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    const p2, 0x7f0907b4

    .line 62
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 63
    new-instance p3, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x3e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 64
    new-instance v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v0}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v1, 0x1

    .line 65
    iput-boolean v1, v0, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 66
    iget-object v1, p0, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p3, v1, v0}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 67
    new-instance p3, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;

    invoke-direct {p3, p0}, Lcom/shopkick/app/tutorials/TutorialHomeScreen$TutorialButtonClick;-><init>(Lcom/shopkick/app/tutorials/TutorialHomeScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0907cf

    .line 69
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const p3, 0x7f0907cc

    .line 70
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const v0, 0x7f0907c8

    .line 71
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0907c6

    .line 72
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 74
    invoke-direct {p0, p2}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->maybeShrinkText(Landroid/widget/TextView;)V

    .line 75
    invoke-direct {p0, p3}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->maybeShrinkText(Landroid/widget/TextView;)V

    .line 76
    invoke-direct {p0, v0}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->maybeShrinkText(Landroid/widget/TextView;)V

    .line 77
    invoke-direct {p0, v1}, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->maybeShrinkText(Landroid/widget/TextView;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
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

    .line 39
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 40
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/tutorials/TutorialHomeScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

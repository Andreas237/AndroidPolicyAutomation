.class public abstract Lcom/shopkick/app/overlays/common/AwardSKOverlay;
.super Lcom/shopkick/app/overlays/base/SKOverlay;
.source "AwardSKOverlay.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/overlays/common/AwardSKOverlay$PostToFacebookClick;
    }
.end annotation


# instance fields
.field protected appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field protected awards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;"
        }
    .end annotation
.end field

.field protected ballImage:Landroid/widget/RelativeLayout;

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private context:Landroid/content/Context;

.field protected displayMetrics:Landroid/util/DisplayMetrics;

.field protected extraWalkinView:Landroid/widget/RelativeLayout;

.field protected failureBall:Landroid/widget/RelativeLayout;

.field protected failureMessage:Landroid/widget/TextView;

.field protected final handler:Landroid/os/Handler;

.field protected kicksCount:Landroid/widget/TextView;

.field protected kicksIcon:Landroid/widget/ImageView;

.field private kicksIconUrl:Ljava/lang/String;

.field protected kicksText:Landroid/widget/TextView;

.field protected mainView:Landroid/widget/RelativeLayout;

.field protected nameText:Landroid/widget/TextView;

.field protected notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field protected postToFacebookView:Landroid/widget/RelativeLayout;

.field protected profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field protected profilePoints:Lcom/shopkick/app/points/ProfilePoints;

.field protected progress:Landroid/widget/ProgressBar;

.field protected rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

.field protected soundManager:Lcom/shopkick/app/sounds/SoundManager;

.field protected storeLogo:Landroid/widget/ImageView;

.field protected totalKicks:Landroid/widget/RelativeLayout;

.field protected userAccount:Lcom/shopkick/app/account/UserAccount;

.field protected viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

.field protected walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;-><init>()V

    .line 80
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->handler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/overlays/common/AwardSKOverlay;)Landroid/content/Context;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/overlays/common/AwardSKOverlay;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->handlePostToFacebookClick()V

    return-void
.end method

.method private getRelevantAwards()V
    .locals 4

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awards:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 207
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->awards:Ljava/util/List;

    .line 208
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/Award;

    .line 209
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/Award;->amount:Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/shopkick/app/util/ThriftHelper;->getInt(Ljava/lang/Integer;I)I

    move-result v2

    if-lez v2, :cond_0

    .line 211
    iget-object v2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->awards:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method private handlePostToFacebookClick()V
    .locals 2

    .line 268
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->toggleFacebookPostWalkinFeature()V

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->postToFacebookView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090536

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 270
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 271
    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->isFacebookPostWalkinFeatureEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f080323

    goto :goto_0

    :cond_0
    const v1, 0x7f080322

    .line 270
    :goto_0
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(I)V

    return-void
.end method


# virtual methods
.method public createView(Landroid/content/Context;)Landroid/view/View;
    .locals 8

    .line 139
    invoke-super {p0, p1}, Lcom/shopkick/app/overlays/base/SKOverlay;->createView(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    invoke-static {v1}, Lcom/shopkick/app/util/SKColor;->parseString(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090460

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    const v0, 0x7f0906f0

    .line 146
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->storeLogo:Landroid/widget/ImageView;

    const v0, 0x7f0904a1

    .line 147
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->nameText:Landroid/widget/TextView;

    const v0, 0x7f09005c

    .line 148
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->ballImage:Landroid/widget/RelativeLayout;

    const v0, 0x7f0903da

    .line 150
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksCount:Landroid/widget/TextView;

    const v0, 0x7f0903f8

    .line 151
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksText:Landroid/widget/TextView;

    const v0, 0x7f0903e4

    .line 152
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIcon:Landroid/widget/ImageView;

    const v0, 0x7f090273

    .line 154
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->failureBall:Landroid/widget/RelativeLayout;

    const v0, 0x7f090274

    .line 155
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->failureMessage:Landroid/widget/TextView;

    const v0, 0x7f090535

    .line 157
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->postToFacebookView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0907a5

    .line 159
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->totalKicks:Landroid/widget/RelativeLayout;

    const v0, 0x7f09026c

    .line 161
    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->extraWalkinView:Landroid/widget/RelativeLayout;

    .line 163
    new-instance v0, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    iget-object v3, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iget-object v5, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 167
    invoke-virtual {p0}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v6

    iget-object v7, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;-><init>(Landroid/content/Context;Lcom/shopkick/app/sounds/SoundManager;Landroid/widget/RelativeLayout;Lcom/shopkick/app/points/ProfilePoints;Lcom/shopkick/app/activities/BaseActivity;Lcom/shopkick/app/application/ClientFlagsManager;)V

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    .line 169
    iput-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->context:Landroid/content/Context;

    .line 171
    invoke-direct {p0}, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->getRelevantAwards()V

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->spec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/shopkick/app/logging/IUserEventView;->setupMoatTracking(Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;Lcom/shopkick/app/application/ClientFlagsManager;ZLcom/shopkick/app/logging/UserEventLogger;)V

    .line 175
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object p1
.end method

.method public destroy()V
    .locals 6

    .line 109
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIcon:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 111
    check-cast v0, Lcom/shopkick/app/logging/IUserEventView;

    invoke-interface {v0}, Lcom/shopkick/app/logging/IUserEventView;->stopMoatTracking()V

    :cond_0
    const/4 v0, 0x0

    .line 113
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    .line 114
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 115
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 116
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 117
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 119
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 120
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->WALKIN:Lcom/shopkick/logging/Area;

    .line 121
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "AwardSKOverlay destroyed, and about to set  WalkinAnimController + WalkinAnimController\'s callback to null. Watch carefully for a subsequent error."

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    if-eqz v1, :cond_1

    .line 126
    invoke-virtual {v1, v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setCallback(Lcom/shopkick/app/overlays/controllers/WalkinAnimationController$IWalkinAnimationControllerCallback;)V

    .line 127
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {v1}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->destroy()V

    .line 128
    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    .line 131
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/overlays/base/SKOverlay;->destroy()V

    return-void
.end method

.method protected enableFacebookPostWalkinFeatureIfNeeded()V
    .locals 2

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->facebookPostWalkinFeatureEnabled:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->facebookPostWalkinFeatureEnabled:Ljava/lang/Boolean;

    .line 220
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 221
    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->postToFacebookView:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->postToFacebookView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090536

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 224
    iget-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 225
    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->isFacebookPostWalkinFeatureEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f080323

    goto :goto_0

    :cond_0
    const v1, 0x7f080322

    .line 224
    :goto_0
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(I)V

    .line 226
    new-instance v1, Lcom/shopkick/app/overlays/common/AwardSKOverlay$PostToFacebookClick;

    invoke-direct {v1, p0}, Lcom/shopkick/app/overlays/common/AwardSKOverlay$PostToFacebookClick;-><init>(Lcom/shopkick/app/overlays/common/AwardSKOverlay;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->walkinAnimController:Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;

    invoke-virtual {v0}, Lcom/shopkick/app/overlays/controllers/WalkinAnimationController;->setupFacebookButton()V

    :cond_1
    return-void
.end method

.method protected getOverlayTheme()I
    .locals 1

    const v0, 0x7f12022d

    return v0
.end method

.method protected getResId()I
    .locals 1

    const v0, 0x7f0c0026

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->mainView:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V
    .locals 0

    .line 94
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/overlays/base/SKOverlay;->init(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 95
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->soundManager:Lcom/shopkick/app/sounds/SoundManager;

    .line 96
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->viewBuilder:Lcom/shopkick/app/util/ViewBuilder;

    .line 97
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->displayMetrics:Landroid/util/DisplayMetrics;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->displayMetrics:Landroid/util/DisplayMetrics;

    .line 98
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 99
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 100
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 101
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->profilePoints:Lcom/shopkick/app/points/ProfilePoints;

    .line 102
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->rewardsDataController:Lcom/shopkick/app/rewards/RewardsDataController;

    .line 103
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 104
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public isCancelable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected setupAwardCountAndLogo(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/Award;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 232
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/Award;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/Award;->amount:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 233
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/Award;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/Award;->grantorImageUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIconUrl:Ljava/lang/String;

    const/4 v0, 0x1

    .line 234
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 235
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/Award;

    .line 236
    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/Award;->amount:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v1, v3

    .line 237
    iget-object v3, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIconUrl:Ljava/lang/String;

    if-nez v3, :cond_0

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/Award;->grantorImageUrl:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 238
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/Award;->grantorImageUrl:Ljava/lang/String;

    iput-object v2, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIconUrl:Ljava/lang/String;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 241
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksCount:Landroid/widget/TextView;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 242
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIcon:Landroid/widget/ImageView;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIconUrl:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 243
    new-instance p1, Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/overlays/common/AwardSKOverlay$1;-><init>(Lcom/shopkick/app/overlays/common/AwardSKOverlay;)V

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIconUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksIcon:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto :goto_1

    .line 259
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->kicksText:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/shopkick/app/overlays/common/AwardSKOverlay;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0f0010

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

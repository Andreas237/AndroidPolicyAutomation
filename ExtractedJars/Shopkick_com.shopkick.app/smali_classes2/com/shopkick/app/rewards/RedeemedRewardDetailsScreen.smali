.class public Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "RedeemedRewardDetailsScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$LaunchExternalLinkClick;,
        Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUnusedClick;,
        Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUsedClick;
    }
.end annotation


# static fields
.field private static final TARGET_GIFT_CARD_TITLE:Ljava/lang/String; = "target giftcard"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private barcodeImage:Landroid/widget/ImageView;

.field private giftCardImage:Landroid/widget/ImageView;

.field private mainView:Landroid/widget/ScrollView;

.field private markAsUsedButton:Lcom/shopkick/app/widget/SKButton;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

.field private redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private rewardEntityKey:Ljava/lang/String;

.field private shareLinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;

.field private shouldIncreaseBrightness:Z

.field private toolbarDefaultTextSize:F

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 72
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shouldIncreaseBrightness:Z

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;Z)Z
    .locals 0

    .line 52
    iput-boolean p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shouldIncreaseBrightness:Z

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->markRewardAsUsed()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->markRewardAsUnused()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method private handleShareClick()V
    .locals 2

    .line 151
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "connectivity"

    .line 153
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 154
    new-instance v1, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-direct {v1, v0}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    .line 155
    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 156
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shareLinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shareLinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;->entityKey:Ljava/lang/String;

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shareLinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    .line 160
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110571

    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110570

    invoke-virtual {p0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :goto_0
    return-void
.end method

.method private markRewardAsUnused()V
    .locals 2

    .line 464
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f09046b

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 465
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->markRewardAsUnused(Ljava/lang/String;)V

    return-void
.end method

.method private markRewardAsUsed()V
    .locals 2

    .line 459
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f09046b

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 460
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->markRewardAsUsed(Ljava/lang/String;)V

    return-void
.end method

.method private maybeSetMarkAsUsedButton()V
    .locals 3

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_0

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f09046a

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 378
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f09046b

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 379
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->used:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 380
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->markAsUsedButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f110566

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 381
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->markAsUsedButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v1, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUnusedClick;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUnusedClick;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;Lcom/shopkick/app/application/dialog/DialogsManager;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 383
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->markAsUsedButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f110567

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->markAsUsedButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v1, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUsedClick;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUsedClick;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;Lcom/shopkick/app/application/dialog/DialogsManager;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private maybeSetOpenLinkButton()V
    .locals 3

    .line 389
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f0904e0

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    .line 390
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->externalLink:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 391
    new-instance v1, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$LaunchExternalLinkClick;

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->externalLink:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$LaunchExternalLinkClick;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 393
    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private populateBarcode()V
    .locals 3

    .line 267
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->barcodeImageUrl:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 268
    new-instance v0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$1;-><init>(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;)V

    .line 288
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->barcodeImageUrl:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->fitCenter()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->barcodeImage:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto :goto_0

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f090065

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private populateCardDetails()V
    .locals 6

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->cardNumber:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const v0, 0x7f110561

    .line 310
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->cardNumber:Ljava/lang/String;

    goto :goto_0

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->orderNumber:Ljava/lang/String;

    if-eqz v0, :cond_1

    const v0, 0x7f11056a

    .line 313
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->orderNumber:Ljava/lang/String;

    goto :goto_0

    .line 314
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->transactionId:Ljava/lang/String;

    if-eqz v0, :cond_2

    const v0, 0x7f110573

    .line 316
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->transactionId:Ljava/lang/String;

    goto :goto_0

    .line 317
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->code:Ljava/lang/String;

    if-eqz v0, :cond_3

    const v0, 0x7f110563

    .line 319
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->code:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    move v0, v1

    .line 322
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v4, 0x7f0904be

    invoke-virtual {v3, v4}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 323
    iget-object v4, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v5, 0x7f0904bd

    invoke-virtual {v4, v5}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/16 v5, 0x8

    if-lez v0, :cond_4

    if-eqz v2, :cond_4

    .line 326
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 327
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 328
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(I)V

    .line 329
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 331
    :cond_4
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 332
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 335
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f0907f0

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 336
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v3, 0x7f0907ef

    invoke-virtual {v2, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 338
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->title:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "target giftcard"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    const v3, 0x7f11055d

    .line 339
    invoke-virtual {p0, v3}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_5
    const v3, 0x7f11056b

    .line 341
    invoke-virtual {p0, v3}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 344
    :goto_2
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->pinNumber:Ljava/lang/String;

    if-eqz v3, :cond_6

    .line 345
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 346
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 347
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->pinNumber:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 349
    :cond_6
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 350
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 353
    :goto_3
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->eventNumber:Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 354
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f09025d

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 355
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v3, 0x7f09025c

    invoke-virtual {v2, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 356
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->eventNumber:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 358
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 361
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f090236

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 362
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v3, 0x7f09023b

    invoke-virtual {v2, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 363
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->emailAddress:Ljava/lang/String;

    if-eqz v3, :cond_8

    .line 364
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 365
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 366
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->emailAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 368
    :cond_8
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 369
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_4
    return-void
.end method

.method private populateCardSummary()V
    .locals 6

    .line 237
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->giftCardImageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->giftCardImage:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->balanceInCents:Ljava/lang/Integer;

    if-nez v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f0900d2

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f09003d

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f11055f

    .line 246
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 248
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->balanceInCents:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 249
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f090059

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 250
    invoke-static {}, Ljava/text/NumberFormat;->getCurrencyInstance()Ljava/text/NumberFormat;

    move-result-object v1

    .line 251
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->balanceInCents:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-double v2, v2

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f090265

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 255
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->expirationDate:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->balanceDate:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->balanceDate:Ljava/lang/String;

    .line 256
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 257
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->expirationDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 258
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionDate:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 259
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f090266

    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f11056c

    invoke-virtual {p0, v2}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 260
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    const v1, 0x7f110144

    .line 262
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void
.end method

.method private populateFinePrint()V
    .locals 5

    .line 399
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f0902cb

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 400
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f09059f

    invoke-virtual {v1, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 402
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionInstructions:Ljava/lang/String;

    const/4 v3, 0x0

    const/16 v4, 0x8

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionInstructions:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 403
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 404
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 405
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionInstructions:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 408
    :cond_0
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 409
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 412
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f090732

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 413
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->termsAndConditions:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 414
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 415
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->termsAndConditions:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 417
    :cond_1
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private populateNotFoundReward()V
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f09027b

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f0905ce

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private populatePaypalBanner()V
    .locals 6

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "paypal"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->balanceDate:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f090109

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 202
    iget-object v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v3, 0x7f090108

    invoke-virtual {v2, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 203
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->balanceDate:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 205
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 208
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const v2, 0x7f090061

    const v3, 0x7f090064

    const v4, 0x7f090062

    if-nez v0, :cond_1

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 211
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f08007e

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 212
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    invoke-virtual {v0, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 213
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/activities/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {v3, v4}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    .line 214
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 215
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->statusBannerText:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 217
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0600fe

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 218
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 221
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v5, 0x4

    if-ne v0, v5, :cond_2

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    invoke-virtual {v0, v4}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 224
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0802c5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    invoke-virtual {v0, v3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 226
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v3

    invoke-virtual {v3}, Lcom/shopkick/app/activities/BaseActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "fonts/AvenirLTStd-Medium.otf"

    invoke-static {v3, v4}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    .line 227
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 228
    iget-object v3, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->statusBannerText:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 230
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060027

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 231
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method private populateReward()V
    .locals 3

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f09027b

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f0905ce

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f09059e

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f090065

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f0906bd

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f0900ca

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f09046a

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f0904e0

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v2, 0x7f090283

    invoke-virtual {v0, v2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->title:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->setAppScreenTitle(Ljava/lang/String;)V

    .line 180
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populatePaypalBanner()V

    .line 181
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populateCardSummary()V

    .line 182
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populateBarcode()V

    .line 183
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populateSpecialInstructions()V

    .line 184
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populateCardDetails()V

    .line 185
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->maybeSetMarkAsUsedButton()V

    .line 186
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->maybeSetOpenLinkButton()V

    .line 187
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populateFinePrint()V

    return-void
.end method

.method private populateSpecialInstructions()V
    .locals 2

    .line 296
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const v1, 0x7f0906bd

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 298
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->specialInstructions:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 299
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->specialInstructions:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 301
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 475
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shareLinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    .line 476
    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shareLinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;

    .line 477
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 478
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkResponse;

    .line 479
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkResponse;->skUrl:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 480
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkResponse;->skUrl:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void

    .line 484
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const p2, 0x7f110570

    invoke-virtual {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_1
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const/4 p3, 0x0

    const v0, 0x7f0c017c

    .line 119
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const/4 p1, 0x1

    .line 120
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->setHasOptionsMenu(Z)V

    .line 121
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getToolbarTextSize()F

    move-result p1

    iput p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->toolbarDefaultTextSize:F

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const p2, 0x7f090469

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->markAsUsedButton:Lcom/shopkick/app/widget/SKButton;

    .line 123
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const p2, 0x7f0902a8

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->giftCardImage:Landroid/widget/ImageView;

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const p2, 0x7f090066

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->barcodeImage:Landroid/widget/ImageView;

    .line 126
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getRedeemedRewardInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 127
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-nez p1, :cond_0

    const p1, 0x7f110572

    .line 128
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->setAppScreenTitle(I)V

    .line 129
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const p2, 0x7f09027b

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const p2, 0x7f09059e

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const p3, 0x7f090283

    invoke-virtual {p1, p3}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 132
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->fetchReward(Ljava/lang/String;)V

    goto :goto_0

    .line 134
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populateReward()V

    .line 137
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

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

    .line 76
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 77
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 78
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 79
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "redeemed_reward_entity_key"

    .line 80
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->rewardEntityKey:Ljava/lang/String;

    .line 81
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p1}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 82
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "REWARD_USED_STATUS_UPDATE_SUCCESS_EVENT"

    const/4 v0, 0x0

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 83
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "REWARD_USED_STATUS_UPDATE_FAIL_EVENT"

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 84
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "REWARD_FETCH_SUCCEEDED_EVENT"

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 85
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "REWARD_FETCH_FAILED_EVENT"

    invoke-virtual {p1, p0, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    const v0, 0x7f0d0004

    .line 578
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 142
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->giftCardImage:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 143
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->barcodeImage:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/MyAppGlideModule;->clear(Landroid/content/Context;Landroid/view/View;)V

    .line 144
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shareLinkRequest:Lcom/shopkick/app/fetchers/api/skapi/GetRedeemedRewardShareLinkRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 147
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/controllers/WindowBrightnessController;->restoreScreenBrightness(Landroid/view/Window;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 423
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x44c44a1d

    if-eq v0, v1, :cond_3

    const v1, -0x234f9773

    if-eq v0, v1, :cond_2

    const v1, -0xd3f6db9

    if-eq v0, v1, :cond_1

    const v1, 0x44d91974

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "REWARD_USED_STATUS_UPDATE_FAIL_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const-string v0, "REWARD_FETCH_SUCCEEDED_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    goto :goto_1

    :cond_2
    const-string v0, "REWARD_FETCH_FAILED_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x3

    goto :goto_1

    :cond_3
    const-string v0, "REWARD_USED_STATUS_UPDATE_SUCCESS_EVENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    const-string p1, "REWARD_ENTITY_KEY"

    .line 450
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 451
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return-void

    .line 452
    :cond_5
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populateNotFoundReward()V

    goto :goto_2

    :pswitch_1
    const-string p1, "REWARD_ENTITY_KEY"

    .line 443
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 444
    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return-void

    .line 445
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getRedeemedRewardInfo(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 446
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->populateReward()V

    goto :goto_2

    :pswitch_2
    const-string/jumbo p1, "updated_reward"

    .line 435
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 436
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    iget-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 437
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const p2, 0x7f110574

    invoke-virtual {p0, p2}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 439
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->mainView:Landroid/widget/ScrollView;

    const p2, 0x7f09046b

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :pswitch_3
    const-string/jumbo p1, "updated_reward"

    .line 425
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 426
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->entityKey:Ljava/lang/String;

    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->rewardEntityKey:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    return-void

    .line 428
    :cond_8
    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    .line 430
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->markAsUsedButton:Lcom/shopkick/app/widget/SKButton;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 431
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->maybeSetMarkAsUsedButton()V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 583
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090028

    if-ne v0, v1, :cond_0

    .line 584
    invoke-direct {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->handleShareClick()V

    const/4 p1, 0x1

    return p1

    .line 587
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onPause()V
    .locals 3

    .line 111
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onPause()V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "paypal"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x0

    iget v2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->toolbarDefaultTextSize:F

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/activities/BaseActivity;->setToolbarTextSize(IF)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 3

    .line 97
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onResume()V

    .line 98
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shouldIncreaseBrightness:Z

    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/controllers/WindowBrightnessController;->setScreenBrightnessToMaximum(Landroid/view/Window;)V

    const/4 v0, 0x0

    .line 100
    iput-boolean v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->shouldIncreaseBrightness:Z

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->redeemedReward:Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "paypal"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    invoke-virtual {p0}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x2

    const/high16 v2, 0x41900000    # 18.0f

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/activities/BaseActivity;->setToolbarTextSize(IF)V

    :cond_1
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

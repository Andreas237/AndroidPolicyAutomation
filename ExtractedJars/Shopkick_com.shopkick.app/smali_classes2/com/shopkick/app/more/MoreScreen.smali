.class public Lcom/shopkick/app/more/MoreScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "MoreScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field private static ALERT_VIEW_MARGIN_LEFT:I = 0x14

.field private static ALERT_VIEW_MARGIN_RIGHT:I = 0x14

.field private static ALERT_VIEW_MARGIN_TOP:I = 0xa


# instance fields
.field private final SPINNER_OPTION_AUTOPLAY_ALL:I

.field private final SPINNER_OPTION_AUTOPLAY_NONE:I

.field private final SPINNER_OPTION_AUTOPLAY_WIFI_ONLY:I

.field private aboutButton:Landroid/view/View;

.field private accountSettingsButton:Landroid/view/View;

.field private addFriendCodeButton:Landroid/view/View;

.field private addPromoCodeButton:Landroid/view/View;

.field private apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

.field private apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private apiReqQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private autoplaySpinner:Landroid/widget/Spinner;

.field private awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field private buyAndCollectButton:Landroid/view/View;

.field private clearStoredTransmittersButton:Landroid/view/View;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private copyRightButton:Landroid/view/View;

.field private credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private editProfileButton:Landroid/view/View;

.field private experimentButton:Landroid/view/View;

.field private flagsScreenButton:Landroid/view/View;

.field private gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

.field private geofencingButton:Landroid/view/ViewGroup;

.field private gpsCheckinLocationsListButton:Landroid/view/View;

.field private isAutoplayVideoOnCellularEnabled:Z

.field private isAutoplayVideoOnWifiEnabled:Z

.field private isLoggingOut:Z

.field private launchSKLinkButton:Landroid/view/View;

.field private logOutProgressDialog:Landroid/app/ProgressDialog;

.field private logcatButton:Landroid/view/View;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private loginButton:Landroid/view/View;

.field private logoutButton:Landroid/view/View;

.field private mainView:Landroid/view/View;

.field private mySavesButton:Landroid/view/View;

.field private myShoppingListsButton:Landroid/view/View;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private notificationChannelButton:Landroid/view/View;

.field private offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

.field private presenceLocationsListButton:Landroid/view/View;

.field private privacyPolicyButton:Landroid/view/View;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private questionsAndSupportButton:Landroid/view/View;

.field private requestOverlaysButton:Landroid/view/View;

.field private resetAppButton:Landroid/view/View;

.field private rulesButton:Landroid/view/View;

.field private sampleOverlayDialogHandler:Lcom/shopkick/app/more/SampleOverlayDialogHandler;

.field private sdkSettingsButton:Landroid/view/View;

.field private shopBeaconSignalButton:Landroid/view/View;

.field private showClearPresenceEventsButton:Landroid/view/View;

.field private showClearWalkinHistoryButton:Landroid/view/View;

.field private showGeofencingLogsButton:Landroid/view/View;

.field private signalView:Lcom/shopkick/app/widget/SKSignalView;

.field private skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

.field private skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

.field private soundsButton:Landroid/view/ViewGroup;

.field private switchToAlphaButton:Landroid/view/View;

.field private switchToContentPreviewButton:Landroid/view/View;

.field private switchToGammaButton:Landroid/view/View;

.field private switchToHogtownButton:Landroid/view/View;

.field private switchToLocalButton:Landroid/view/View;

.field private switchToPartnerTestButton:Landroid/view/View;

.field private switchToPodOGoldButton:Landroid/view/View;

.field private switchToProductionButton:Landroid/view/View;

.field private switchToPseudoLocButton:Landroid/view/View;

.field private switchToQaButton:Landroid/view/View;

.field private switchToShopportunityButton:Landroid/view/View;

.field private switchToSimbaButton:Landroid/view/View;

.field private termOfServicesButton:Landroid/view/View;

.field private testSKLinksButton:Landroid/view/View;

.field private transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

.field private versionName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 82
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 87
    iput v0, p0, Lcom/shopkick/app/more/MoreScreen;->SPINNER_OPTION_AUTOPLAY_ALL:I

    const/4 v1, 0x1

    .line 88
    iput v1, p0, Lcom/shopkick/app/more/MoreScreen;->SPINNER_OPTION_AUTOPLAY_WIFI_ONLY:I

    const/4 v1, 0x2

    .line 89
    iput v1, p0, Lcom/shopkick/app/more/MoreScreen;->SPINNER_OPTION_AUTOPLAY_NONE:I

    .line 172
    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isAutoplayVideoOnCellularEnabled:Z

    .line 173
    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isAutoplayVideoOnWifiEnabled:Z

    .line 174
    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isLoggingOut:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/more/MoreScreen;)Lcom/shopkick/app/util/NotificationCenter;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/more/MoreScreen;)Lcom/shopkick/app/url/URLDispatcher;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/shopkick/app/more/MoreScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-object p0
.end method

.method private buyAndCollectEnabled()Z
    .locals 1

    .line 874
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isBuyAndCollectEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->buyAndCollectEnabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private getSampleOverlays()V
    .locals 4

    .line 769
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->sampleOverlayDialogHandler:Lcom/shopkick/app/more/SampleOverlayDialogHandler;

    if-nez v0, :cond_0

    .line 770
    new-instance v0, Lcom/shopkick/app/more/SampleOverlayDialogHandler;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/more/MoreScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v3, p0, Lcom/shopkick/app/more/MoreScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/more/SampleOverlayDialogHandler;-><init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;)V

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->sampleOverlayDialogHandler:Lcom/shopkick/app/more/SampleOverlayDialogHandler;

    .line 772
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->sampleOverlayDialogHandler:Lcom/shopkick/app/more/SampleOverlayDialogHandler;

    invoke-virtual {v0}, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->showDialog()V

    return-void
.end method

.method private handleCredentialDisableAutoSignInDone()V
    .locals 0

    .line 800
    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->popScreen()V

    .line 801
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->resetLogoutState()V

    return-void
.end method

.method private handleDebugSection(Landroid/view/View;)V
    .locals 3

    .line 548
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->experimentButton:Landroid/view/View;

    if-ne p1, v0, :cond_1

    .line 549
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v0, "Set GroupConfig Id"

    .line 550
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 552
    new-instance v0, Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 553
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getExperimentId()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 555
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const/4 v1, 0x1

    .line 557
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setLines(I)V

    .line 559
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f11014f

    .line 560
    new-instance v2, Lcom/shopkick/app/more/-$$Lambda$MoreScreen$Xw6pLrtltmZiwiMaHRrP18phVWM;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/more/-$$Lambda$MoreScreen$Xw6pLrtltmZiwiMaHRrP18phVWM;-><init>(Lcom/shopkick/app/more/MoreScreen;Landroid/widget/EditText;)V

    invoke-virtual {p1, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f110140

    .line 567
    sget-object v2, Lcom/shopkick/app/more/-$$Lambda$MoreScreen$fl2qyZg0HYHtQp4ORXcYW7xSnS0;->INSTANCE:Lcom/shopkick/app/more/-$$Lambda$MoreScreen$fl2qyZg0HYHtQp4ORXcYW7xSnS0;

    invoke-virtual {p1, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 569
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 572
    invoke-static {v0}, Lcom/shopkick/app/more/MoreScreen;->setCustomViewMargin(Landroid/view/View;)V

    goto/16 :goto_0

    .line 573
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->flagsScreenButton:Landroid/view/View;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    .line 574
    const-class p1, Lcom/shopkick/app/debug/DebugFlagsScreen;

    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 575
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->resetAppButton:Landroid/view/View;

    if-ne p1, v0, :cond_3

    .line 576
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->clearAppPrefs()V

    .line 577
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/16 v0, 0xb

    invoke-virtual {p1, v0}, Lcom/shopkick/app/account/UserAccountDataSource;->resetCurrentUserWithReason(I)V

    .line 578
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->apiReqQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {p1}, Lcom/shopkick/app/queue/SKPersistentQueue;->clear()V

    .line 579
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    invoke-virtual {p1}, Lcom/shopkick/app/queue/SKPersistentQueue;->clear()V

    .line 580
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    invoke-virtual {p1}, Lcom/shopkick/app/SKPersistentCache/APICache;->clear()V

    .line 581
    invoke-static {}, Lcom/shopkick/comm/FetchersCommManagerAccessor;->getInstance()Lnet/toddm/comm/CommManager;

    move-result-object p1

    invoke-virtual {p1}, Lnet/toddm/comm/CommManager;->purgeCache()V

    goto/16 :goto_0

    .line 582
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->clearStoredTransmittersButton:Landroid/view/View;

    if-ne p1, v0, :cond_4

    .line 583
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->clearCategory(I)V

    .line 584
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->clearCategory(I)V

    .line 585
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;->clear()V

    goto/16 :goto_0

    .line 586
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->showClearWalkinHistoryButton:Landroid/view/View;

    if-ne p1, v0, :cond_5

    .line 588
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v0, "tagFilter"

    const-string/jumbo v1, "walkin"

    .line 589
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    const-class v0, Lcom/shopkick/app/debug/DebugLogScreen;

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 591
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->showClearPresenceEventsButton:Landroid/view/View;

    if-ne p1, v0, :cond_6

    .line 593
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v0, "tagFilter"

    const-string v1, "presence"

    .line 594
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    const-class v0, Lcom/shopkick/app/debug/DebugLogScreen;

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 596
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->showGeofencingLogsButton:Landroid/view/View;

    if-ne p1, v0, :cond_7

    .line 598
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v0, "tagFilter"

    const-string v1, "GEOFENCE2"

    .line 599
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    const-class v0, Lcom/shopkick/app/debug/DebugLogScreen;

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 601
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->logcatButton:Landroid/view/View;

    if-ne p1, v0, :cond_8

    .line 602
    const-class p1, Lcom/shopkick/app/debug/DebugLogScreen;

    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 603
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->presenceLocationsListButton:Landroid/view/View;

    if-ne p1, v0, :cond_9

    .line 604
    const-class p1, Lcom/shopkick/app/debug/PresenceLocationsListScreen;

    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 605
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->gpsCheckinLocationsListButton:Landroid/view/View;

    if-ne p1, v0, :cond_a

    .line 606
    const-class p1, Lcom/shopkick/app/debug/GPSCheckinDebugScreen;

    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 607
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->launchSKLinkButton:Landroid/view/View;

    if-ne p1, v0, :cond_b

    .line 608
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->showLaunchSKLinkDialog()V

    goto/16 :goto_0

    .line 609
    :cond_b
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->testSKLinksButton:Landroid/view/View;

    if-ne p1, v0, :cond_c

    .line 610
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "http://"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/application/SKApp;

    invoke-virtual {v0}, Lcom/shopkick/app/application/SKApp;->getAuthority()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/shopkick/v1/whatever/sk_link_testing?mode=app"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 612
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "url"

    .line 613
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    const-class p1, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 615
    :cond_c
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->requestOverlaysButton:Landroid/view/View;

    if-ne p1, v0, :cond_d

    .line 616
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->getSampleOverlays()V

    goto/16 :goto_0

    .line 617
    :cond_d
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->sdkSettingsButton:Landroid/view/View;

    if-ne p1, v0, :cond_e

    .line 618
    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/shopkick/sdk/core/SettingsActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 619
    invoke-virtual {p0, p1}, Lcom/shopkick/app/more/MoreScreen;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 620
    :cond_e
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToProductionButton:Landroid/view/View;

    if-ne p1, v0, :cond_f

    const-string p1, "production"

    const-string v0, "app.shopkick.com"

    .line 621
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 622
    :cond_f
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToQaButton:Landroid/view/View;

    if-ne p1, v0, :cond_10

    const-string p1, "qa"

    const-string v0, "beta.shopkick.com"

    .line 623
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 624
    :cond_10
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToAlphaButton:Landroid/view/View;

    if-ne p1, v0, :cond_11

    const-string p1, "alpha"

    const-string v0, "alpha.shopkick.com"

    .line 625
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 626
    :cond_11
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToContentPreviewButton:Landroid/view/View;

    if-ne p1, v0, :cond_12

    const-string p1, "contentpreview"

    const-string v0, "contentpreview.shopkick.com"

    .line 627
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 628
    :cond_12
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToGammaButton:Landroid/view/View;

    if-ne p1, v0, :cond_13

    const-string p1, "gamma"

    const-string v0, "gamma.shopkick.com"

    .line 629
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 630
    :cond_13
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToHogtownButton:Landroid/view/View;

    if-ne p1, v0, :cond_14

    const-string p1, "hogtown"

    const-string v0, "hogtown.shopkick.com"

    .line 631
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 632
    :cond_14
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToPartnerTestButton:Landroid/view/View;

    if-ne p1, v0, :cond_15

    const-string p1, "partnertest"

    const-string v0, "partnertestapp.shopkick.com"

    .line 633
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 634
    :cond_15
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToPodOGoldButton:Landroid/view/View;

    if-ne p1, v0, :cond_16

    const-string p1, "pod o gold"

    const-string/jumbo v0, "treatyourself.shopkick.com"

    .line 635
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 636
    :cond_16
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToPseudoLocButton:Landroid/view/View;

    if-ne p1, v0, :cond_17

    const-string p1, "pseudoloc"

    const-string v0, "pseudoloc.shopkick.com"

    .line 637
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 638
    :cond_17
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToShopportunityButton:Landroid/view/View;

    if-ne p1, v0, :cond_18

    const-string/jumbo p1, "shopportunity"

    const-string/jumbo v0, "shopportunity.shopkick.com"

    .line 639
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 640
    :cond_18
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToSimbaButton:Landroid/view/View;

    if-ne p1, v0, :cond_19

    const-string/jumbo p1, "simba"

    const-string/jumbo v0, "simba.shopkick.com"

    .line 641
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 642
    :cond_19
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->switchToLocalButton:Landroid/view/View;

    if-ne p1, v0, :cond_1a

    const-string p1, "localhost"

    const/high16 v0, 0x7f110000

    .line 643
    invoke-virtual {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1a
    :goto_0
    return-void
.end method

.method private handleLogoutRequestFailure()V
    .locals 2

    const/4 v0, 0x0

    .line 855
    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isLoggingOut:Z

    .line 856
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->resetLogoutState()V

    .line 857
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110142

    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private handleLogoutRequestSuccess()V
    .locals 3

    const/4 v0, 0x0

    .line 848
    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isLoggingOut:Z

    .line 849
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "CREDENTIAL_DISABLE_AUTO_SIGN_IN_SUCCESS"

    invoke-virtual {v1, p0, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 850
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "CREDENTIAL_DISABLE_AUTO_SIGN_IN_FAILURE"

    invoke-virtual {v1, p0, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 851
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/CredentialStorageController;->disableAutoSignInCredential(Landroid/app/Activity;)V

    return-void
.end method

.method private instantiateViewWithClickListener(I)Landroid/view/View;
    .locals 2

    .line 260
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09069e

    if-eq p1, v1, :cond_0

    const v1, 0x7f090717

    if-eq p1, v1, :cond_0

    .line 262
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object v0
.end method

.method private instantiateViews()V
    .locals 2

    const v0, 0x7f09048d

    .line 220
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->loginButton:Landroid/view/View;

    const v0, 0x7f09044f

    .line 221
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->logoutButton:Landroid/view/View;

    const v0, 0x7f090484

    .line 222
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->accountSettingsButton:Landroid/view/View;

    const v0, 0x7f090489

    .line 223
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->editProfileButton:Landroid/view/View;

    const v0, 0x7f090485

    .line 224
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->buyAndCollectButton:Landroid/view/View;

    const v0, 0x7f09049e

    .line 225
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mySavesButton:Landroid/view/View;

    const v0, 0x7f09049f

    .line 226
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->myShoppingListsButton:Landroid/view/View;

    const v0, 0x7f090033

    .line 227
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->addFriendCodeButton:Landroid/view/View;

    const v0, 0x7f090034

    .line 228
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->addPromoCodeButton:Landroid/view/View;

    const v0, 0x7f090584

    .line 231
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->questionsAndSupportButton:Landroid/view/View;

    const v0, 0x7f090490

    .line 232
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->rulesButton:Landroid/view/View;

    const v0, 0x7f090492

    .line 235
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->soundsButton:Landroid/view/ViewGroup;

    const v0, 0x7f09048e

    .line 237
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationChannelButton:Landroid/view/View;

    const v0, 0x7f09048c

    .line 238
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->geofencingButton:Landroid/view/ViewGroup;

    .line 241
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090051

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->autoplaySpinner:Landroid/widget/Spinner;

    const v0, 0x7f090687

    .line 244
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->shopBeaconSignalButton:Landroid/view/View;

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKSignalViewFactory;->createSignalView(Landroid/content/Context;)Lcom/shopkick/app/widget/SKSignalView;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->signalView:Lcom/shopkick/app/widget/SKSignalView;

    const v0, 0x7f090733

    .line 248
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->termOfServicesButton:Landroid/view/View;

    const v0, 0x7f09048f

    .line 249
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->privacyPolicyButton:Landroid/view/View;

    const v0, 0x7f09019f

    .line 250
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->copyRightButton:Landroid/view/View;

    const v0, 0x7f0907ed

    .line 253
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    const v0, 0x7f090483

    .line 256
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->aboutButton:Landroid/view/View;

    return-void
.end method

.method public static synthetic lambda$handleDebugSection$119(Lcom/shopkick/app/more/MoreScreen;Landroid/widget/EditText;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 561
    invoke-virtual {p1}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 562
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_0

    .line 563
    iget-object p3, p0, Lcom/shopkick/app/more/MoreScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/account/UserAccount;->setExperimentId(Ljava/lang/String;)V

    .line 565
    :cond_0
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method static synthetic lambda$handleDebugSection$120(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 567
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$prepareLogout$121(Lcom/shopkick/app/more/MoreScreen;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 822
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->logout()V

    .line 823
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$prepareLogout$122(Lcom/shopkick/app/more/MoreScreen;Ljava/lang/ref/WeakReference;)V
    .locals 1

    const/4 v0, 0x0

    .line 827
    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isLoggingOut:Z

    .line 828
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method private logMoreRowTap(Ljava/lang/String;)V
    .locals 2

    .line 867
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Unknown"

    :goto_0
    const-string v1, "RowName"

    .line 869
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    const-string v1, "More|RowTapped"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/application/SKLogger;->onEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private logout()V
    .locals 5

    .line 834
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "LogoutRequestSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 835
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "LogoutRequestFailure"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 836
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->makeUserLogoutRequest()V

    .line 837
    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    .line 839
    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const v3, 0x7f11073a

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 837
    invoke-static {v0, v1, v2, v4, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->logOutProgressDialog:Landroid/app/ProgressDialog;

    .line 842
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    if-eqz v0, :cond_0

    .line 843
    invoke-virtual {v0, v3}, Lcom/shopkick/app/application/ProfileInfo;->setUserFirstUse(Z)V

    :cond_0
    return-void
.end method

.method private populateDebugSection()V
    .locals 0

    return-void
.end method

.method private prepareLogout()V
    .locals 11

    .line 805
    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 811
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v0}, Lcom/shopkick/app/awards/AwardsManager;->getValidRequests()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    const v0, 0x7f110737

    .line 812
    invoke-virtual {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f11073b

    .line 813
    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v4, v0

    move-object v5, v1

    goto :goto_0

    :cond_1
    const v0, 0x7f110739

    .line 815
    invoke-virtual {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f110738

    .line 816
    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v4, v0

    move-object v5, v1

    .line 819
    :goto_0
    iget-object v2, p0, Lcom/shopkick/app/more/MoreScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v3, 0x1

    const v0, 0x7f1101a0

    .line 820
    invoke-virtual {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/shopkick/app/more/-$$Lambda$MoreScreen$8cN_WN9ijqOb0dvEAadnBQC9iP0;

    invoke-direct {v7, p0}, Lcom/shopkick/app/more/-$$Lambda$MoreScreen$8cN_WN9ijqOb0dvEAadnBQC9iP0;-><init>(Lcom/shopkick/app/more/MoreScreen;)V

    const v0, 0x7f110140

    .line 825
    invoke-virtual {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lcom/shopkick/app/more/-$$Lambda$MoreScreen$N6sZgxtYkgdi9QRPRNj7__L2nD0;

    invoke-direct {v9, p0}, Lcom/shopkick/app/more/-$$Lambda$MoreScreen$N6sZgxtYkgdi9QRPRNj7__L2nD0;-><init>(Lcom/shopkick/app/more/MoreScreen;)V

    const/4 v10, 0x0

    .line 819
    invoke-virtual/range {v2 .. v10}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private reloadData()V
    .locals 4

    .line 345
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 346
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->loginButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 347
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->logoutButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 348
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->editProfileButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 349
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->accountSettingsButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->buyAndCollectButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 351
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mySavesButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 352
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->myShoppingListsButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 353
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->addFriendCodeButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 354
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->addPromoCodeButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->loginButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 357
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->logoutButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->accountSettingsButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->editProfileButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 360
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mySavesButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 361
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->myShoppingListsButton:Landroid/view/View;

    iget-object v3, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 362
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->addFriendCodeButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 363
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->addPromoCodeButton:Landroid/view/View;

    iget-object v3, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v3}, Lcom/shopkick/app/util/FeatureFlagHelper;->areMarketingPromoCodesEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 364
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->buyAndCollectButton:Landroid/view/View;

    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->buyAndCollectEnabled()Z

    move-result v3

    if-eqz v3, :cond_3

    move v1, v2

    :cond_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 366
    :goto_2
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->setUserId()V

    .line 367
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->soundsButton:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->isSoundEnabled()Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/more/MoreScreen;->setChecked(Landroid/view/View;Z)V

    .line 368
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->updateNotificationStatus()V

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_4

    .line 371
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    iget-object v3, p0, Lcom/shopkick/app/more/MoreScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iget-object v3, v3, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->crashReportingDisabled:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    xor-int/2addr v3, v1

    invoke-virtual {v0, v3}, Lcom/shopkick/app/application/CrashlyticsWrapper;->recordUserPreference(Z)V

    .line 374
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnCellularEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isAutoplayVideoOnCellularEnabled:Z

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnWifiEnabled()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isAutoplayVideoOnWifiEnabled:Z

    .line 376
    iget-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isAutoplayVideoOnWifiEnabled:Z

    if-eqz v0, :cond_6

    .line 377
    iget-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isAutoplayVideoOnCellularEnabled:Z

    if-eqz v0, :cond_5

    .line 378
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->autoplaySpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, v2, v2}, Landroid/widget/Spinner;->setSelection(IZ)V

    goto :goto_3

    .line 380
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->autoplaySpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, v1, v2}, Landroid/widget/Spinner;->setSelection(IZ)V

    goto :goto_3

    .line 383
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->autoplaySpinner:Landroid/widget/Spinner;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/widget/Spinner;->setSelection(IZ)V

    :goto_3
    return-void
.end method

.method private resetLogoutState()V
    .locals 1

    .line 861
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 862
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->logOutProgressDialog:Landroid/app/ProgressDialog;

    invoke-static {v0}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    const/4 v0, 0x0

    .line 863
    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->logOutProgressDialog:Landroid/app/ProgressDialog;

    return-void
.end method

.method private setChecked(Landroid/view/View;Z)V
    .locals 1

    const v0, 0x7f090717

    .line 337
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/SwitchCompat;

    invoke-virtual {p1, p2}, Landroid/support/v7/widget/SwitchCompat;->setChecked(Z)V

    return-void
.end method

.method private static setCustomViewMargin(Landroid/view/View;)V
    .locals 5

    .line 899
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 902
    sget v1, Lcom/shopkick/app/more/MoreScreen;->ALERT_VIEW_MARGIN_LEFT:I

    invoke-static {v1, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    sget v2, Lcom/shopkick/app/more/MoreScreen;->ALERT_VIEW_MARGIN_TOP:I

    .line 903
    invoke-static {v2, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    sget v3, Lcom/shopkick/app/more/MoreScreen;->ALERT_VIEW_MARGIN_RIGHT:I

    .line 904
    invoke-static {v3, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v3

    const/4 v4, 0x0

    .line 905
    invoke-static {v4, p0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v4

    .line 902
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 906
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private setUserId()V
    .locals 5

    .line 341
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

    const v1, 0x7f0907ed

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f11067e

    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/shopkick/app/more/MoreScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v3}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setupObservers()V
    .locals 2

    .line 310
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "RegistrationRequestSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 311
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "LogoutRequestSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserAccountIdChangedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserAccountInfoUpdatedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ProfileInfoUpdatedEvent"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method private setupViews()V
    .locals 6

    .line 268
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/16 v3, 0x1a

    if-lt v0, v3, :cond_0

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationChannelButton:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->geofencingButton:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_0

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationChannelButton:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 273
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->geofencingButton:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 277
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030002

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    .line 278
    new-instance v1, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f0c01c3

    const v5, 0x7f0906c0

    invoke-direct {v1, v3, v4, v5, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    const v0, 0x7f0c01c2

    .line 282
    invoke-virtual {v1, v0}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 283
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->autoplaySpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 284
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->autoplaySpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, p0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v0, 0x7f09069e

    .line 287
    invoke-direct {p0, v0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViewWithClickListener(I)Landroid/view/View;

    .line 288
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->signalView:Lcom/shopkick/app/widget/SKSignalView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 289
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xf

    .line 293
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const/16 v1, 0xb

    .line 294
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 295
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->signalView:Lcom/shopkick/app/widget/SKSignalView;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKSignalView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 298
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->setUserId()V

    .line 302
    :try_start_0
    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->versionName:Ljava/lang/String;

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090483

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f110680

    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/more/MoreScreen;->versionName:Ljava/lang/String;

    aput-object v4, v3, v2

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 305
    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private showLaunchSKLinkDialog()V
    .locals 4

    .line 743
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "Type an sk link to execute"

    .line 744
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 746
    new-instance v1, Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 747
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const-string v2, "Yes"

    .line 748
    new-instance v3, Lcom/shopkick/app/more/MoreScreen$3;

    invoke-direct {v3, p0, v1}, Lcom/shopkick/app/more/MoreScreen$3;-><init>(Lcom/shopkick/app/more/MoreScreen;Landroid/widget/EditText;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const-string v2, "Cancel"

    .line 755
    new-instance v3, Lcom/shopkick/app/more/MoreScreen$4;

    invoke-direct {v3, p0}, Lcom/shopkick/app/more/MoreScreen$4;-><init>(Lcom/shopkick/app/more/MoreScreen;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 762
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 765
    invoke-static {v1}, Lcom/shopkick/app/more/MoreScreen;->setCustomViewMargin(Landroid/view/View;)V

    return-void
.end method

.method private showRevisionNumber()V
    .locals 3

    .line 691
    sget-object v0, Lcom/shopkick/app/application/SKApp;->gitRevision:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 692
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

    const v1, 0x7f0902ad

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 694
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SHA: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/shopkick/app/application/SKApp;->gitRevision:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 695
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private showServerUrl()V
    .locals 3

    .line 701
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

    const v1, 0x7f090672

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 703
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "URL: http://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/app/activities/BaseActivity;->getApplication()Landroid/app/Application;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/application/SKApp;

    invoke-virtual {v2}, Lcom/shopkick/app/application/SKApp;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 704
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private showSwitchEnvironmentDialog(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 709
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 710
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Are you sure you want to switch to: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 712
    new-instance v1, Landroid/widget/EditText;

    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 713
    invoke-virtual {v1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 715
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const-string p2, "Yes"

    .line 717
    new-instance v2, Lcom/shopkick/app/more/MoreScreen$1;

    invoke-direct {v2, p0, p1, v1}, Lcom/shopkick/app/more/MoreScreen$1;-><init>(Lcom/shopkick/app/more/MoreScreen;Ljava/lang/String;Landroid/widget/EditText;)V

    invoke-virtual {v0, p2, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    const-string p1, "Cancel"

    .line 729
    new-instance p2, Lcom/shopkick/app/more/MoreScreen$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/more/MoreScreen$2;-><init>(Lcom/shopkick/app/more/MoreScreen;)V

    invoke-virtual {v0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 736
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 739
    invoke-static {v1}, Lcom/shopkick/app/more/MoreScreen;->setCustomViewMargin(Landroid/view/View;)V

    return-void
.end method

.method private updateNotificationStatus()V
    .locals 3

    .line 319
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    .line 320
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->geofencingButton:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v2, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1, v2}, Lcom/shopkick/app/util/FeatureFlagHelper;->isNearOrInStoreNotificationEnabled(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/more/MoreScreen;->setChecked(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const p2, 0x7f0c011e

    const/4 p3, 0x0

    .line 203
    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

    const p1, 0x7f11067d

    .line 204
    invoke-virtual {p0, p1}, Lcom/shopkick/app/more/MoreScreen;->setAppScreenTitle(I)V

    .line 206
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->instantiateViews()V

    .line 207
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->setupViews()V

    .line 209
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->setupObservers()V

    .line 211
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->populateDebugSection()V

    .line 213
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->reloadData()V

    .line 215
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->mainView:Landroid/view/View;

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

    .line 178
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 179
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 180
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 181
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    .line 182
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 183
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 184
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiRequestQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->apiReqQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 185
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->apiAwardQueueController:Lcom/shopkick/app/queue/SKPersistentQueue;

    .line 186
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 187
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 188
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 189
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

    .line 190
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    .line 191
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->apiCache:Lcom/shopkick/app/SKPersistentCache/APICache;

    .line 192
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 193
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->urlDispatcherFactory:Lcom/shopkick/app/url/URLDispatcherFactory;

    invoke-virtual {p2}, Lcom/shopkick/app/url/URLDispatcherFactory;->dispatcher()Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 194
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 195
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    .line 196
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->transmittersDataSource:Lcom/shopkick/app/presence/UltrasonicTransmittersDataSource;

    .line 197
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    iput-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    .line 198
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    iput-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 389
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    .line 396
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V

    .line 398
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    sparse-switch v2, :sswitch_data_0

    .line 508
    invoke-direct {p0, p1}, Lcom/shopkick/app/more/MoreScreen;->handleDebugSection(Landroid/view/View;)V

    goto/16 :goto_0

    :sswitch_0
    const-string/jumbo p1, "url"

    .line 493
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->getTermsOfServiceURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "header_title"

    const v1, 0x7f11067c

    .line 494
    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    const-class p1, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 481
    :sswitch_1
    const-class p1, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-virtual {p0, p1, v4}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 467
    :sswitch_2
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->skDeskIntegrationController:Lcom/shopkick/app/controllers/SKDeskIntegrationController;

    if-eqz p1, :cond_3

    .line 468
    invoke-virtual {p1, p0}, Lcom/shopkick/app/controllers/SKDeskIntegrationController;->showSKDeskWebview(Lcom/shopkick/app/screens/AppScreen;)V

    goto/16 :goto_0

    :sswitch_3
    const-string p1, "MyShoppingLists"

    .line 433
    const-class v0, Lcom/shopkick/app/shoppinglists/ShoppingListsScreen;

    invoke-virtual {p0, v0, v4}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    move-object v4, p1

    goto/16 :goto_0

    :sswitch_4
    const-string p1, "MySaves"

    .line 429
    const-class v0, Lcom/shopkick/app/saves/SavesScreen;

    invoke-virtual {p0, v0, v4}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    move-object v4, p1

    goto/16 :goto_0

    :sswitch_5
    const-string v4, "Sounds"

    .line 445
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->isSoundEnabled()Z

    move-result p1

    xor-int/2addr p1, v3

    .line 446
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->soundsButton:Landroid/view/ViewGroup;

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/more/MoreScreen;->setChecked(Landroid/view/View;Z)V

    .line 447
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->gcmLifeCycle:Lcom/shopkick/app/gcm/GCMLifeCycle;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/gcm/GCMLifeCycle;->setSoundEnabled(Z)V

    .line 448
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/AppPreferences;->setSoundsEnabled(Z)V

    goto/16 :goto_0

    .line 472
    :sswitch_6
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->howItWorksUrls:Ljava/util/List;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->howItWorksUrls:Ljava/util/List;

    .line 473
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    const-string/jumbo p1, "url"

    .line 474
    iget-object v2, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->howItWorksUrls:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "header_title"

    const v1, 0x7f110687

    .line 475
    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    const-class p1, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    const-string v4, "Rules"

    goto/16 :goto_0

    :sswitch_7
    const-string/jumbo p1, "url"

    .line 498
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->getPrivacyPolicyURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "header_title"

    const v1, 0x7f110668

    .line 499
    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    const-class p1, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_0

    :sswitch_8
    const-string v4, "Notifications"

    .line 452
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.settings.APP_NOTIFICATION_SETTINGS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "android.provider.extra.APP_PACKAGE"

    .line 453
    invoke-virtual {p0}, Lcom/shopkick/app/more/MoreScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 454
    invoke-virtual {p0, p1}, Lcom/shopkick/app/more/MoreScreen;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 400
    :sswitch_9
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->params:Ljava/util/Map;

    const-string v0, "origin_screen"

    const/16 v1, 0x27

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    const-class p1, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v0, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->params:Ljava/util/Map;

    invoke-virtual {p0, p1, v0, v1}, Lcom/shopkick/app/more/MoreScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    const-string v4, "Login"

    goto/16 :goto_0

    :sswitch_a
    const-string v4, "Notifications Near/In Stores"

    .line 485
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1, v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isNearOrInStoreNotificationEnabled(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    xor-int/2addr p1, v3

    .line 486
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->geofencingButton:Landroid/view/ViewGroup;

    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/more/MoreScreen;->setChecked(Landroid/view/View;Z)V

    .line 490
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/AppPreferences;->setGeofencingNotificationEnabled(Z)V

    goto/16 :goto_0

    .line 418
    :sswitch_b
    const-class p1, Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->params:Ljava/util/Map;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    const-string v4, "AboutYou"

    goto/16 :goto_0

    .line 422
    :sswitch_c
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->buyAndCollectEnabled()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "BuyAndCollect"

    .line 424
    const-class v0, Lcom/shopkick/app/bnc/GenericCardLinkingScreen;

    invoke-virtual {p0, v0, v4}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    move-object v4, p1

    goto/16 :goto_0

    .line 414
    :sswitch_d
    const-class p1, Lcom/shopkick/app/account/UserAccountScreen;

    const-string v0, "register"

    invoke-virtual {p0, p1, v4, v0}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;Ljava/lang/String;)V

    const-string v4, "AccountSettings"

    goto/16 :goto_0

    .line 457
    :sswitch_e
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->aboutShopkickUrls:Ljava/util/List;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->aboutShopkickUrls:Ljava/util/List;

    .line 458
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_1

    const-string/jumbo p1, "url"

    .line 459
    iget-object v2, p0, Lcom/shopkick/app/more/MoreScreen;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->aboutShopkickUrls:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "header_title"

    const v2, 0x7f110686

    .line 460
    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/shopkick/app/more/MoreScreen;->versionName:Ljava/lang/String;

    aput-object v4, v3, v1

    .line 461
    invoke-virtual {p0, v2, v3}, Lcom/shopkick/app/more/MoreScreen;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 460
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    const-class p1, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_1
    const-string v4, "About"

    goto :goto_0

    .line 405
    :sswitch_f
    iget-boolean p1, p0, Lcom/shopkick/app/more/MoreScreen;->isLoggingOut:Z

    if-eqz p1, :cond_2

    return-void

    .line 408
    :cond_2
    iput-boolean v3, p0, Lcom/shopkick/app/more/MoreScreen;->isLoggingOut:Z

    const-string v4, "Logout"

    .line 411
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->prepareLogout()V

    goto :goto_0

    :sswitch_10
    const-string/jumbo p1, "url"

    .line 503
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->getCopyRightURL()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "header_title"

    const v1, 0x7f11065d

    .line 504
    invoke-virtual {p0, v1}, Lcom/shopkick/app/more/MoreScreen;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    const-class p1, Lcom/shopkick/app/webview/WebViewScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/more/MoreScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    :sswitch_11
    const-string p1, "AddMarketingPromoCode"

    .line 441
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const-string v1, "redeem_marketing_promo_code"

    invoke-static {v1, v4}, Lcom/shopkick/app/url/URLDispatcher;->createSkURL(Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    move-object v4, p1

    goto :goto_0

    :sswitch_12
    const-string p1, "AddFriendCode"

    .line 437
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    const-string v1, "redeem_promo_code"

    invoke-static {v1, v4}, Lcom/shopkick/app/url/URLDispatcher;->createSkURL(Ljava/lang/String;Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    move-object v4, p1

    .line 512
    :cond_3
    :goto_0
    invoke-direct {p0, v4}, Lcom/shopkick/app/more/MoreScreen;->logMoreRowTap(Ljava/lang/String;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x7f090033 -> :sswitch_12
        0x7f090034 -> :sswitch_11
        0x7f09019f -> :sswitch_10
        0x7f09044f -> :sswitch_f
        0x7f090483 -> :sswitch_e
        0x7f090484 -> :sswitch_d
        0x7f090485 -> :sswitch_c
        0x7f090489 -> :sswitch_b
        0x7f09048c -> :sswitch_a
        0x7f09048d -> :sswitch_9
        0x7f09048e -> :sswitch_8
        0x7f09048f -> :sswitch_7
        0x7f090490 -> :sswitch_6
        0x7f090492 -> :sswitch_5
        0x7f09049e -> :sswitch_4
        0x7f09049f -> :sswitch_3
        0x7f090584 -> :sswitch_2
        0x7f090687 -> :sswitch_1
        0x7f090733 -> :sswitch_0
    .end sparse-switch
.end method

.method public onDestroy()V
    .locals 2

    .line 326
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 327
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->signalView:Lcom/shopkick/app/widget/SKSignalView;

    if-eqz v0, :cond_0

    .line 328
    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->skSignalViewFactory:Lcom/shopkick/app/widget/SKSignalViewFactory;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKSignalViewFactory;->destroySignalView(Lcom/shopkick/app/widget/SKSignalView;)V

    .line 330
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->sampleOverlayDialogHandler:Lcom/shopkick/app/more/SampleOverlayDialogHandler;

    if-eqz v0, :cond_1

    .line 331
    invoke-virtual {v0}, Lcom/shopkick/app/more/SampleOverlayDialogHandler;->destroy()V

    .line 333
    :cond_1
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
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

    .line 777
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "CREDENTIAL_DISABLE_AUTO_SIGN_IN_FAILURE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto :goto_1

    :sswitch_1
    const-string p2, "CREDENTIAL_DISABLE_AUTO_SIGN_IN_SUCCESS"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_2
    const-string p2, "RegistrationRequestSuccess"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_3
    const-string p2, "ProfileInfoUpdatedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_4
    const-string p2, "UserAccountIdChangedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_5
    const-string p2, "LogoutRequestFailure"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_6
    const-string p2, "LogoutRequestSuccess"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_7
    const-string p2, "UserAccountInfoUpdatedEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 793
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->handleCredentialDisableAutoSignInDone()V

    goto :goto_2

    .line 789
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->handleLogoutRequestFailure()V

    goto :goto_2

    .line 785
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->handleLogoutRequestSuccess()V

    .line 786
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->reloadData()V

    goto :goto_2

    .line 782
    :pswitch_3
    invoke-direct {p0}, Lcom/shopkick/app/more/MoreScreen;->reloadData()V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x525069b1 -> :sswitch_7
        -0x494aad42 -> :sswitch_6
        -0x1ac3bbbb -> :sswitch_5
        0x44e6563 -> :sswitch_4
        0x37893616 -> :sswitch_3
        0x414ccfad -> :sswitch_2
        0x465aaffa -> :sswitch_1
        0x74e1a181 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 519
    iget-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->autoplaySpinner:Landroid/widget/Spinner;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    const/4 p2, 0x1

    packed-switch p3, :pswitch_data_0

    goto :goto_0

    .line 532
    :pswitch_0
    iget-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/AppPreferences;->setAutoplayVideoOnCellularEnabled(Z)V

    .line 533
    iget-object p2, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/AppPreferences;->setAutoplayVideoOnWifiEnable(Z)V

    goto :goto_0

    .line 527
    :pswitch_1
    iget-object p3, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/application/AppPreferences;->setAutoplayVideoOnCellularEnabled(Z)V

    .line 528
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->setAutoplayVideoOnWifiEnable(Z)V

    goto :goto_0

    .line 522
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->setAutoplayVideoOnCellularEnabled(Z)V

    .line 523
    iget-object p1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->setAutoplayVideoOnWifiEnable(Z)V

    :goto_0
    const-string p1, "Video settings"

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 540
    :goto_1
    invoke-direct {p0, p1}, Lcom/shopkick/app/more/MoreScreen;->logMoreRowTap(Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method public onScreenDidHide()V
    .locals 2

    .line 890
    iget-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isAutoplayVideoOnCellularEnabled:Z

    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnCellularEnabled()Z

    move-result v1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isAutoplayVideoOnWifiEnabled:Z

    iget-object v1, p0, Lcom/shopkick/app/more/MoreScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 891
    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->getAutoplayVideoOnWifiEnabled()Z

    move-result v1

    if-eq v0, v1, :cond_1

    .line 892
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventAutoplaySettingChanged"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_1
    return-void
.end method

.method public onScreenDidShow()V
    .locals 3

    const/4 v0, 0x0

    .line 879
    iput-boolean v0, p0, Lcom/shopkick/app/more/MoreScreen;->isLoggingOut:Z

    .line 881
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 882
    iget-object v0, p0, Lcom/shopkick/app/more/MoreScreen;->params:Ljava/util/Map;

    const-string v1, "origin_screen"

    const/16 v2, 0x27

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 883
    const-class v0, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v1, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    iget-object v2, p0, Lcom/shopkick/app/more/MoreScreen;->params:Ljava/util/Map;

    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/more/MoreScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

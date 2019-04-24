.class public Lcom/shopkick/app/store/MCommerceManager;
.super Ljava/lang/Object;
.source "MCommerceManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/overlays/interfaces/IOverlayListener;
.implements Lcom/usebutton/sdk/purchasepath/PurchasePathListener;


# static fields
.field private static final CLICK_TYPE_ONLINE_OFFER_CLICK:Ljava/lang/String; = "onlineOfferClick"

.field private static final CLICK_TYPE_ONLINE_STORE_CLICK:Ljava/lang/String; = "onlineStoreClick"

.field public static final EVENT_ONLINE_OFFER_CLICK_SUCCEEDED:Ljava/lang/String; = "eventOnlineOfferClickSucceeded"

.field public static final EVENT_ONLINE_STORE_CLICK_SUCCEEDED:Ljava/lang/String; = "eventOnlineStoreClickSucceeded"

.field private static final KICK_AMOUNT_REG_EXPRESSION:Ljava/lang/String; = "^\\D*(\\d+\\+?)[^\\d\\$]+(\\$?\\d+)\\D*"

.field private static final LANDING_OVERLAY_MAX_TIME_MS:J = 0x5265c00L

.field private static final LANDING_OVERLAY_MIN_TIME_MS:J = 0x7530L


# instance fields
.field private final LOADING_OVERLAY_MIN_WAIT_TIME_MS:I

.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private clickType:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private dataResponse:Lcom/shopkick/fetchers/DataResponse;

.field private dismissRunnable:Ljava/lang/Runnable;

.field private invokeWebviewSdkActionRunnable:Ljava/lang/Runnable;

.field private isAffiliateStore:Z

.field private landingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private loadingOverlayDisplayTimestampMs:J

.field private loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

.field private purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

.field private replaceBubbleRunnable:Ljava/lang/Runnable;

.field private request:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field private startPurchasePathRunnable:Ljava/lang/Runnable;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private timerHandler:Landroid/os/Handler;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private webviewAction:Lcom/shopkick/sdk/webviewsdk/WebviewAction;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;)V
    .locals 2

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 85
    new-instance v0, Lcom/shopkick/app/store/MCommerceManager$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/MCommerceManager$1;-><init>(Lcom/shopkick/app/store/MCommerceManager;)V

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->replaceBubbleRunnable:Ljava/lang/Runnable;

    const/16 v0, 0xbb8

    .line 107
    iput v0, p0, Lcom/shopkick/app/store/MCommerceManager;->LOADING_OVERLAY_MIN_WAIT_TIME_MS:I

    const-wide/high16 v0, -0x8000000000000000L

    .line 108
    iput-wide v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlayDisplayTimestampMs:J

    .line 110
    new-instance v0, Lcom/shopkick/app/store/MCommerceManager$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/MCommerceManager$2;-><init>(Lcom/shopkick/app/store/MCommerceManager;)V

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->startPurchasePathRunnable:Ljava/lang/Runnable;

    .line 128
    new-instance v0, Lcom/shopkick/app/store/MCommerceManager$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/MCommerceManager$3;-><init>(Lcom/shopkick/app/store/MCommerceManager;)V

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->invokeWebviewSdkActionRunnable:Ljava/lang/Runnable;

    .line 145
    new-instance v0, Lcom/shopkick/app/store/MCommerceManager$4;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/MCommerceManager$4;-><init>(Lcom/shopkick/app/store/MCommerceManager;)V

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->dismissRunnable:Ljava/lang/Runnable;

    .line 167
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    .line 168
    iput-object p3, p0, Lcom/shopkick/app/store/MCommerceManager;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 169
    iput-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 170
    iput-object p4, p0, Lcom/shopkick/app/store/MCommerceManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 171
    iput-object p5, p0, Lcom/shopkick/app/store/MCommerceManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 172
    iput-object p6, p0, Lcom/shopkick/app/store/MCommerceManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const-string p1, "eventMCommerceBubbleFinished"

    .line 174
    invoke-virtual {p5, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    return-object p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    return-object p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    return-object p0
.end method

.method static synthetic access$1002(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;)Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/shopkick/app/store/MCommerceManager;)Ljava/lang/Runnable;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->dismissRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/shopkick/app/store/MCommerceManager;)Landroid/os/Handler;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/application/dialog/DialogsManager;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/store/MCommerceManager;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->startPurchasePath()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object p0
.end method

.method static synthetic access$302(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    return-object p1
.end method

.method static synthetic access$400(Lcom/shopkick/app/store/MCommerceManager;)Lcom/usebutton/sdk/purchasepath/PurchasePath;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    return-object p0
.end method

.method static synthetic access$402(Lcom/shopkick/app/store/MCommerceManager;Lcom/usebutton/sdk/purchasepath/PurchasePath;)Lcom/usebutton/sdk/purchasepath/PurchasePath;
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    return-object p1
.end method

.method static synthetic access$500(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/application/AppPreferences;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-object p0
.end method

.method static synthetic access$600(Lcom/shopkick/app/store/MCommerceManager;)Landroid/content/Context;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/sdk/webviewsdk/WebviewAction;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->webviewAction:Lcom/shopkick/sdk/webviewsdk/WebviewAction;

    return-object p0
.end method

.method static synthetic access$702(Lcom/shopkick/app/store/MCommerceManager;Lcom/shopkick/sdk/webviewsdk/WebviewAction;)Lcom/shopkick/sdk/webviewsdk/WebviewAction;
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->webviewAction:Lcom/shopkick/sdk/webviewsdk/WebviewAction;

    return-object p1
.end method

.method static synthetic access$800(Lcom/shopkick/app/store/MCommerceManager;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->handleRewardResponse()V

    return-void
.end method

.method static synthetic access$900(Lcom/shopkick/app/store/MCommerceManager;)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 56
    iget-object p0, p0, Lcom/shopkick/app/store/MCommerceManager;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    return-object p0
.end method

.method private cancelOnlineStoreVisitRequest()V
    .locals 2

    .line 371
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    if-eqz v0, :cond_0

    .line 372
    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 373
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    :cond_0
    return-void
.end method

.method private getAction(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 384
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 385
    iput-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->dataResponse:Lcom/shopkick/fetchers/DataResponse;

    .line 386
    instance-of p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    if-eqz p1, :cond_e

    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_e

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_e

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    if-nez p1, :cond_0

    goto/16 :goto_5

    .line 395
    :cond_0
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;->mcommerceAffiliateDisplayConfiguration:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;

    .line 397
    iget-boolean p2, p0, Lcom/shopkick/app/store/MCommerceManager;->isAffiliateStore:Z

    if-eqz p2, :cond_5

    .line 399
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->webviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;

    if-eqz p2, :cond_c

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->webviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;->urlForWebview:Ljava/lang/String;

    .line 400
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_c

    .line 401
    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/shopkick/sdk/webviewsdk/WebviewController;->getInstance(Landroid/content/Context;)Lcom/shopkick/sdk/webviewsdk/WebviewController;

    move-result-object p2

    .line 402
    new-instance v0, Lcom/shopkick/app/webviewsdk/WebviewSdkEventsListener;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/shopkick/app/webviewsdk/WebviewSdkEventsListener;-><init>(Landroid/content/Context;)V

    .line 403
    invoke-virtual {p2, v0}, Lcom/shopkick/sdk/webviewsdk/WebviewController;->setWebviewEventListener(Lcom/shopkick/sdk/webviewsdk/IWebviewEventListener;)V

    const-string v0, ""

    const-string v1, ""

    const-string v2, ""

    .line 407
    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->webviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;

    if-eqz v3, :cond_3

    .line 408
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->webviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;->urlForWebview:Ljava/lang/String;

    .line 409
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->webviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;->headerTitleForWebview:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->webviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;->headerTitleForWebview:Ljava/lang/String;

    .line 411
    :goto_0
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->webviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;->headerSubtitleForWebview:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string p1, ""

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->webviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateWebviewDisplayDetails;->headerSubtitleForWebview:Ljava/lang/String;

    :goto_1
    move-object v2, p1

    .line 414
    :cond_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 415
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->onError()V

    return-void

    .line 418
    :cond_4
    new-instance p1, Lcom/shopkick/sdk/webviewsdk/WebviewParam;

    invoke-direct {p1, v0, v1, v2}, Lcom/shopkick/sdk/webviewsdk/WebviewParam;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    new-instance v0, Lcom/shopkick/app/store/MCommerceManager$5;

    invoke-direct {v0, p0}, Lcom/shopkick/app/store/MCommerceManager$5;-><init>(Lcom/shopkick/app/store/MCommerceManager;)V

    invoke-virtual {p2, p1, v0}, Lcom/shopkick/sdk/webviewsdk/WebviewController;->getAction(Lcom/shopkick/sdk/webviewsdk/WebviewParam;Lcom/shopkick/sdk/webviewsdk/WebviewController$ActionListener;)V

    goto :goto_3

    .line 446
    :cond_5
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object p2

    .line 447
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getStorage()Lcom/usebutton/sdk/internal/core/Storage;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getStorage()Lcom/usebutton/sdk/internal/core/Storage;

    move-result-object p2

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/core/Storage;->getUserIdentifier()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_6
    const/4 p2, 0x0

    .line 448
    :goto_2
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    .line 453
    invoke-static {p2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_4

    :cond_7
    const-string p2, ""

    const-string v0, ""

    .line 462
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->buttonWebviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/McommerceButtonWebviewDisplayDetails;

    if-eqz v1, :cond_8

    .line 463
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->buttonWebviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/McommerceButtonWebviewDisplayDetails;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/McommerceButtonWebviewDisplayDetails;->buttonUrl:Ljava/lang/String;

    .line 464
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/MCommerceAffiliateDisplayConfiguration;->buttonWebviewDisplayDetails:Lcom/shopkick/app/fetchers/api/skapi/McommerceButtonWebviewDisplayDetails;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/McommerceButtonWebviewDisplayDetails;->buttonVisitUuid:Ljava/lang/String;

    .line 468
    :cond_8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-static {p1}, Lcom/shopkick/app/util/Affiliate;->isOnlineOffer(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 469
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferMerchantUrl:Ljava/lang/String;

    .line 473
    :cond_9
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 474
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->onError()V

    return-void

    .line 479
    :cond_a
    new-instance p1, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;

    invoke-direct {p1, p2}, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;-><init>(Ljava/lang/String;)V

    .line 480
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_b

    .line 481
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;->setPubRef(Ljava/lang/String;)V

    .line 483
    :cond_b
    invoke-static {}, Lcom/usebutton/sdk/Button;->purchasePath()Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;

    move-result-object p2

    invoke-interface {p2, p1, p0}, Lcom/usebutton/sdk/purchasepath/PurchasePathInterface;->fetch(Lcom/usebutton/sdk/purchasepath/PurchasePathRequest;Lcom/usebutton/sdk/purchasepath/PurchasePathListener;)V

    :cond_c
    :goto_3
    return-void

    .line 454
    :cond_d
    :goto_4
    invoke-static {}, Lcom/usebutton/sdk/Button;->clearAllData()V

    .line 455
    invoke-static {}, Lcom/usebutton/sdk/Button;->user()Lcom/usebutton/sdk/user/User;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/usebutton/sdk/user/User;->setIdentifier(Ljava/lang/String;)V

    .line 456
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->onError()V

    return-void

    .line 391
    :cond_e
    :goto_5
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->onError()V

    return-void
.end method

.method private getKickAmountText(Ljava/lang/String;I)Ljava/lang/String;
    .locals 7

    .line 254
    invoke-static {p1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "^\\D*(\\d+\\+?)[^\\d\\$]+(\\$?\\d+)\\D*"

    .line 256
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 257
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    .line 258
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    .line 260
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "+"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    :goto_0
    if-lez v2, :cond_2

    .line 262
    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-virtual {p1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v0

    invoke-virtual {v1, p2, v2, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1
.end method

.method private handleBubbleOverlay()V
    .locals 6

    .line 519
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->replaceBubbleRunnable:Ljava/lang/Runnable;

    iget-wide v2, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlayDisplayTimestampMs:J

    const-wide/16 v4, 0xbb8

    add-long/2addr v2, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private handleRewardResponse()V
    .locals 1

    .line 488
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 489
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    .line 491
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->shouldShowBubbleOverlay()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 492
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->handleBubbleOverlay()V

    goto :goto_0

    .line 494
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->startPurchasePath()V

    :cond_1
    :goto_0
    return-void
.end method

.method private onError()V
    .locals 4

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->request:Lcom/shopkick/app/fetchers/api/IAPIObject;

    instance-of v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 302
    iput-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    .line 304
    :cond_0
    iput-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 305
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->dismissRunnable:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 306
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f110151

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    return-void
.end method

.method private requestOnlineStoreVisit(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 9

    .line 353
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    if-eqz v0, :cond_0

    .line 354
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->cancelOnlineStoreVisitRequest()V

    .line 357
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    .line 358
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;->chainId:Ljava/lang/String;

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;->productFamilyId:Ljava/lang/String;

    .line 360
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->retailerCategoryId:Ljava/lang/String;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;->retailerCategoryId:Ljava/lang/String;

    .line 362
    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v3, p0, Lcom/shopkick/app/store/MCommerceManager;->onlineStoreVisitRequest:Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitRequest;

    const/4 v5, 0x1

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private shouldShowBubbleOverlay()Z
    .locals 3

    .line 500
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->dataResponse:Lcom/shopkick/fetchers/DataResponse;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->dataResponse:Lcom/shopkick/fetchers/DataResponse;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->dataResponse:Lcom/shopkick/fetchers/DataResponse;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->overlaysResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->dataResponse:Lcom/shopkick/fetchers/DataResponse;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->overlaysResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;->overlays:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->dataResponse:Lcom/shopkick/fetchers/DataResponse;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->overlaysResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;->overlays:Ljava/util/List;

    .line 504
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 505
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->dataResponse:Lcom/shopkick/fetchers/DataResponse;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->overlaysResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;->overlays:Ljava/util/List;

    .line 506
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 507
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 508
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x12

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->pointsResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonPointsResponse;->coinsDeltaType:Ljava/lang/Integer;

    .line 509
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x13

    if-ne v0, v2, :cond_1

    .line 511
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->dataResponse:Lcom/shopkick/fetchers/DataResponse;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/OnlineStoreVisitResponse;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->overlaysResponse:Lcom/shopkick/app/fetchers/api/skapi/CommonOverlaysResponse;

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method

.method private startPurchasePath()V
    .locals 8

    .line 281
    iget-boolean v0, p0, Lcom/shopkick/app/store/MCommerceManager;->isAffiliateStore:Z

    const-wide/16 v1, 0xbb8

    const-wide/16 v3, 0x0

    if-eqz v0, :cond_1

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->webviewAction:Lcom/shopkick/sdk/webviewsdk/WebviewAction;

    if-nez v0, :cond_0

    return-void

    .line 283
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object v5, p0, Lcom/shopkick/app/store/MCommerceManager;->invokeWebviewSdkActionRunnable:Ljava/lang/Runnable;

    iget-wide v6, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlayDisplayTimestampMs:J

    add-long/2addr v6, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v6, v1

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 285
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    if-nez v0, :cond_2

    return-void

    .line 286
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object v5, p0, Lcom/shopkick/app/store/MCommerceManager;->startPurchasePathRunnable:Ljava/lang/Runnable;

    iget-wide v6, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlayDisplayTimestampMs:J

    add-long/2addr v6, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v6, v1

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    const-string p1, "onlineStoreClick"

    .line 525
    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->clickType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 526
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventOnlineStoreClickSucceeded"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    :cond_0
    const-string p1, "onlineOfferClick"

    .line 528
    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->clickType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 529
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "eventOnlineOfferClickSucceeded"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_1
    :goto_0
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 178
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->cancelOnlineStoreVisitRequest()V

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->startPurchasePathRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->invokeWebviewSdkActionRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->replaceBubbleRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->dismissRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public dismissOverlay()V
    .locals 3

    .line 269
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 270
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->removeOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 271
    iput-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_1

    .line 275
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->removeOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 276
    iput-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    :cond_1
    return-void
.end method

.method public loadOnlineOffer(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 6

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    .line 223
    invoke-virtual {p0}, Lcom/shopkick/app/store/MCommerceManager;->dismissOverlay()V

    .line 226
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v0, 0x0

    .line 227
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    .line 228
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 229
    invoke-static {p1}, Lcom/shopkick/app/util/Affiliate;->isAffiliateStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/store/MCommerceManager;->isAffiliateStore:Z

    const-string v0, "onlineOfferClick"

    .line 230
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->clickType:Ljava/lang/String;

    .line 233
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyId:Ljava/lang/String;

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productFamilyTitle:Ljava/lang/String;

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreAwardBackgroundColorRgb:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->mainImageUrl:Ljava/lang/String;

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    const v2, 0x7f1103dc

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    .line 242
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    const v2, 0x7f1103dd

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    .line 247
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineOfferPurchaseKickAmountText:Ljava/lang/String;

    const v1, 0x7f0f0013

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/store/MCommerceManager;->getKickAmountText(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    .line 250
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    return-void
.end method

.method public loadOnlineStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    if-eqz v0, :cond_0

    .line 192
    invoke-virtual {p0}, Lcom/shopkick/app/store/MCommerceManager;->dismissOverlay()V

    .line 195
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    const/4 v0, 0x0

    .line 196
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    .line 197
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 198
    invoke-static {p1}, Lcom/shopkick/app/util/Affiliate;->isAffiliateStore(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/store/MCommerceManager;->isAffiliateStore:Z

    const-string v0, "onlineStoreClick"

    .line 199
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->clickType:Ljava/lang/String;

    .line 202
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v1

    const-class v2, Lcom/shopkick/app/overlays/value/OnlineStoreLoadingOverlay;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainImageUrl:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainLogoUrl:Ljava/lang/String;

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStoreAwardBackgroundColorRgb:Ljava/lang/String;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->backgroundColor:Ljava/lang/String;

    .line 208
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 209
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    const v2, 0x7f1103dd

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->title:Ljava/lang/String;

    .line 211
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    const v2, 0x7f1103df

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->awardExtraMessage:Ljava/lang/String;

    .line 215
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->onlineStorePurchaseKickAmountText:Ljava/lang/String;

    const v1, 0x7f0f0028

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/store/MCommerceManager;->getKickAmountText(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    .line 218
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/interfaces/IOverlayListener;)V

    return-void
.end method

.method public maybeShowLandingOverlay()V
    .locals 11

    .line 552
    iget-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getLastOnlineStoreRedirectionChainId()Ljava/lang/String;

    move-result-object v0

    .line 553
    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->getLastOnlineStoreRedirectionChainName()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    .line 556
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/store/MCommerceManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppPreferences;->getLastOnlineStoreRedirectionChainLogoUrl()Ljava/lang/String;

    move-result-object v2

    .line 557
    iget-object v3, p0, Lcom/shopkick/app/store/MCommerceManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v3}, Lcom/shopkick/app/application/AppPreferences;->getLastOnlineStoreRedirectionTimestampMs()J

    move-result-wide v3

    .line 560
    iget-object v5, p0, Lcom/shopkick/app/store/MCommerceManager;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    invoke-virtual/range {v5 .. v10}, Lcom/shopkick/app/application/AppPreferences;->setLastOnlineStoreRedirectionInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    const-wide/16 v5, 0x7530

    add-long/2addr v5, v3

    .line 563
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    cmp-long v5, v5, v7

    if-gez v5, :cond_1

    const-wide/32 v5, 0x5265c00

    add-long/2addr v3, v5

    .line 564
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-lez v3, :cond_1

    .line 565
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;-><init>()V

    iput-object v3, p0, Lcom/shopkick/app/store/MCommerceManager;->landingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 566
    iget-object v3, p0, Lcom/shopkick/app/store/MCommerceManager;->landingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-static {}, Lcom/shopkick/app/overlays/OverlayInfo;->getInstance()Lcom/shopkick/app/overlays/OverlayInfo;

    move-result-object v4

    const-class v5, Lcom/shopkick/app/overlays/value/OnlineStoreLandingOverlay;

    invoke-virtual {v4, v5}, Lcom/shopkick/app/overlays/OverlayInfo;->keyForClass(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 567
    iget-object v3, p0, Lcom/shopkick/app/store/MCommerceManager;->landingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iget-object v4, p0, Lcom/shopkick/app/store/MCommerceManager;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f1103da

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    .line 568
    invoke-virtual {v4, v5, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->message:Ljava/lang/String;

    .line 569
    iget-object v3, p0, Lcom/shopkick/app/store/MCommerceManager;->landingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    iput-object v1, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->productName:Ljava/lang/String;

    .line 570
    iput-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainLogoUrl:Ljava/lang/String;

    .line 571
    iput-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->chainId:Ljava/lang/String;

    .line 573
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/store/MCommerceManager;->landingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public onComplete(Lcom/usebutton/sdk/purchasepath/PurchasePath;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Lcom/usebutton/sdk/purchasepath/PurchasePath;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 293
    iput-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->purchasePath:Lcom/usebutton/sdk/purchasepath/PurchasePath;

    .line 294
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->handleRewardResponse()V

    goto :goto_0

    .line 296
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->onError()V

    :goto_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    .line 539
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x1433adac

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "eventMCommerceBubbleFinished"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    .line 541
    :cond_2
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->startPurchasePath()V

    :goto_2
    return-void
.end method

.method public onOverlayDismissed(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 1

    .line 327
    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 328
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 329
    :cond_1
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 330
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 333
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-eqz p1, :cond_2

    .line 334
    invoke-direct {p0}, Lcom/shopkick/app/store/MCommerceManager;->cancelOnlineStoreVisitRequest()V

    .line 338
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->startPurchasePathRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 339
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->invokeWebviewSdkActionRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 340
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->replaceBubbleRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->timerHandler:Landroid/os/Handler;

    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->dismissRunnable:Ljava/lang/Runnable;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 343
    :cond_3
    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->landingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 344
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->landingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    :cond_4
    :goto_0
    return-void
.end method

.method public onOverlayShown(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;Lcom/shopkick/app/overlays/base/SKOverlay;)V
    .locals 0

    .line 315
    iget-object p2, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 316
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    if-nez p1, :cond_0

    .line 317
    invoke-virtual {p0}, Lcom/shopkick/app/store/MCommerceManager;->dismissOverlay()V

    return-void

    .line 320
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/shopkick/app/store/MCommerceManager;->loadingOverlayDisplayTimestampMs:J

    .line 321
    iget-object p1, p0, Lcom/shopkick/app/store/MCommerceManager;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-direct {p0, p1}, Lcom/shopkick/app/store/MCommerceManager;->requestOnlineStoreVisit(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    :cond_1
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    const/4 v0, 0x0

    .line 379
    iput-object v0, p0, Lcom/shopkick/app/store/MCommerceManager;->bubbleOverlaySpec:Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    .line 380
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/store/MCommerceManager;->getAction(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V

    return-void
.end method

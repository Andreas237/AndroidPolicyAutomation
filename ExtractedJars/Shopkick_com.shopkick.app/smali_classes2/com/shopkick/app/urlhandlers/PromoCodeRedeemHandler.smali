.class public Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "PromoCodeRedeemHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "redeem_promo_code"


# instance fields
.field private final appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private final logger:Lcom/shopkick/app/application/SKLogger;

.field private final overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

.field private final trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

.field private final userAccount:Lcom/shopkick/app/account/UserAccount;

.field private final userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/tracking/TrackingUrlManager;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    const-string v0, "appActivityManager should not be null."

    .line 44
    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "userAccountDataSource should not be null."

    .line 45
    invoke-static {p2, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "overlaysManager should not be null."

    .line 46
    invoke-static {p3, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "logger should not be null."

    .line 47
    invoke-static {p4, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "clientFlagsManager should not be null."

    .line 48
    invoke-static {p5, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "deviceInfo should not be null."

    .line 49
    invoke-static {p6, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "userAccount should not be null."

    .line 50
    invoke-static {p7, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v0, "trackingUrlManager should not be null."

    .line 51
    invoke-static {p8, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 55
    iput-object p2, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 56
    iput-object p3, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

    .line 57
    iput-object p4, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 58
    iput-object p5, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 59
    iput-object p6, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 60
    iput-object p7, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 61
    iput-object p8, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 8

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 71
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 73
    new-instance v1, Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v5, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iget-object v6, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/16 v2, 0x1b

    .line 77
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lcom/shopkick/app/logging/UserEventLogger;-><init>(Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/account/UserAccount;Ljava/lang/Integer;)V

    .line 78
    iget-object v2, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->trackingUrlManager:Lcom/shopkick/app/tracking/TrackingUrlManager;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventLogger;->setTrackingUrlManager(Lcom/shopkick/app/tracking/TrackingUrlManager;)V

    .line 79
    new-instance v2, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;

    invoke-direct {v2}, Lcom/shopkick/app/logging/SimpleUserEventCoordinator;-><init>()V

    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventLogger;->setSingleUserEventCoordinator(Lcom/shopkick/app/logging/IUserEventCoordinator;)V

    .line 81
    new-instance v2, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;

    iget-object v3, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->overlaysManager:Lcom/shopkick/app/overlays/base/OverlaysManager;

    iget-object v4, p0, Lcom/shopkick/app/urlhandlers/PromoCodeRedeemHandler;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-direct {v2, v0, v3, v1, v4}, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;-><init>(Landroid/content/Context;Lcom/shopkick/app/overlays/base/OverlaysManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/account/UserAccountDataSource;)V

    .line 85
    invoke-virtual {v1, v2}, Lcom/shopkick/app/logging/UserEventLogger;->setUiEventLogUpdateCallback(Lcom/shopkick/app/screens/UIEventLogUpdateCallback;)V

    .line 86
    invoke-virtual {v2}, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;->getWindow()Landroid/view/Window;

    move-result-object v0

    const-string v1, "RedeemPromoCodeOverlay must have a window"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-virtual {v2}, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 88
    invoke-virtual {v2}, Lcom/shopkick/app/overlays/value/RedeemPromoCodeOverlay;->show()V

    goto :goto_0

    .line 90
    :cond_1
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/LoginRegistrationActivity;

    const-class v3, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 93
    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    :goto_0
    return-void
.end method

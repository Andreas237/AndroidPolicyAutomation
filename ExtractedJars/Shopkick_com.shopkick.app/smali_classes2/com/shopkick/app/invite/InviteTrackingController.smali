.class public Lcom/shopkick/app/invite/InviteTrackingController;
.super Ljava/lang/Object;
.source "InviteTrackingController.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final BRANCH_CALLBACK_FINISHED:Ljava/lang/String; = "BRANCH_CALLBACK_FINISHED"

.field public static final INVITE_TRACKING_DONE:Ljava/lang/String; = "INVITE_TRACKING_DONE"


# instance fields
.field private final appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private branchCallbackFinished:Z

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private redeemPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

.field private final skLogger:Lcom/shopkick/app/application/SKLogger;

.field private final userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/shopkick/app/invite/InviteTrackingController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 36
    iput-object p2, p0, Lcom/shopkick/app/invite/InviteTrackingController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 37
    iput-object p3, p0, Lcom/shopkick/app/invite/InviteTrackingController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 38
    iput-object p4, p0, Lcom/shopkick/app/invite/InviteTrackingController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    const/4 p2, 0x0

    .line 39
    iput-boolean p2, p0, Lcom/shopkick/app/invite/InviteTrackingController;->branchCallbackFinished:Z

    const-string p3, "RegistrationRequestSuccess"

    .line 42
    invoke-virtual {p1, p0, p3, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    const-string p3, "BRANCH_CALLBACK_FINISHED"

    .line 43
    invoke-virtual {p1, p0, p3, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method private destroy()V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 75
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "INVITE_TRACKING_DONE"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method private handleRedeemPromoCodeRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 92
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const v1, 0xaae65

    if-eqz v0, :cond_1

    .line 93
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeResponse;

    .line 94
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeResponse;->redemptionStatus:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 95
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v0, 0xaae66

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_0

    .line 98
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 99
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeResponse;->redemptionStatus:Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setStatusCode(Ljava/lang/Integer;)V

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/invite/InviteTrackingController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_0

    .line 104
    :cond_1
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :goto_0
    return-void
.end method

.method private maybeMakeRedeemCall()V
    .locals 2

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getReferralPromoCode()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v1, p0, Lcom/shopkick/app/invite/InviteTrackingController;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/app/account/UserAccountDataSource;->makeRedeemPromoCodeRequest(Ljava/lang/String;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->redeemPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    .line 65
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->deleteReferralPromoCode()V

    .line 67
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->branchCallbackFinished:Z

    if-eqz v0, :cond_1

    .line 68
    invoke-direct {p0}, Lcom/shopkick/app/invite/InviteTrackingController;->destroy()V

    :cond_1
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteTrackingController;->redeemPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    if-ne p1, v0, :cond_0

    .line 86
    invoke-direct {p0, p2}, Lcom/shopkick/app/invite/InviteTrackingController;->handleRedeemPromoCodeRequest(Lcom/shopkick/fetchers/DataResponse;)V

    const/4 p1, 0x0

    .line 87
    iput-object p1, p0, Lcom/shopkick/app/invite/InviteTrackingController;->redeemPromoCodeRequest:Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    :cond_0
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

    const-string p2, "RegistrationRequestSuccess"

    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 49
    invoke-direct {p0}, Lcom/shopkick/app/invite/InviteTrackingController;->maybeMakeRedeemCall()V

    .line 50
    iget-object p2, p0, Lcom/shopkick/app/invite/InviteTrackingController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "RegistrationRequestSuccess"

    invoke-virtual {p2, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_0
    const-string p2, "BRANCH_CALLBACK_FINISHED"

    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Lcom/shopkick/app/invite/InviteTrackingController;->branchCallbackFinished:Z

    .line 54
    invoke-direct {p0}, Lcom/shopkick/app/invite/InviteTrackingController;->maybeMakeRedeemCall()V

    .line 55
    iget-object p1, p0, Lcom/shopkick/app/invite/InviteTrackingController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "BRANCH_CALLBACK_FINISHED"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

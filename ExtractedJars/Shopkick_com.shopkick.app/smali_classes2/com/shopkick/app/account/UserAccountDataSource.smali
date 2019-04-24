.class public Lcom/shopkick/app/account/UserAccountDataSource;
.super Ljava/lang/Object;
.source "UserAccountDataSource.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final CLIENT_ERROR_CODE:Ljava/lang/String; = "ClientErrorCode"

.field public static final CREATE_GUEST_REQUEST_FAILURE:Ljava/lang/String; = "CreateGuestRequestFailure"

.field public static final CREATE_GUEST_REQUEST_FAILURE_NO_COUNTRY:Ljava/lang/String; = "CreateGuestRequestFailureNoCountry"

.field public static final CREATE_GUEST_REQUEST_SUCCESS:Ljava/lang/String; = "CreateGuestRequestSuccess"

.field public static final DELETE_ACCOUNT_SUCCESS:Ljava/lang/String; = "DeleteAccountRequestSuccess"

.field public static final DISPLAY_NAME:Ljava/lang/String; = "DisplayName"

.field public static final ERROR_MSG:Ljava/lang/String; = "ErrorMsg"

.field public static final HTTP_CODE_NO_NETWORK:I = 0x0

.field public static final HTTP_STATUS_CODE:Ljava/lang/String; = "HttpStatusCode"

.field public static final LOGIN_REQUEST_FAILURE:Ljava/lang/String; = "LoginRequestFailure"

.field public static final LOGIN_REQUEST_SUCCESS:Ljava/lang/String; = "LoginRequestSuccess"

.field public static final LOGOUT_REQUEST_FAILURE:Ljava/lang/String; = "LogoutRequestFailure"

.field public static final LOGOUT_REQUEST_SUCCESS:Ljava/lang/String; = "LogoutRequestSuccess"

.field public static final REGISTRATION_REQUEST_FAILURE:Ljava/lang/String; = "RegistrationRequestFailure"

.field public static final REGISTRATION_REQUEST_SUCCESS:Ljava/lang/String; = "RegistrationRequestSuccess"

.field public static final STATUS:Ljava/lang/String; = "Status"

.field public static final USER_FACEBOOK_CONNECT_FAILURE:Ljava/lang/String; = "UserFacebookConnectFailure"

.field public static final USER_FACEBOOK_CONNECT_SUCCESS:Ljava/lang/String; = "UserFacebookConnectSuccess"

.field public static final WEB_REGISTRATION_FAILURE:Ljava/lang/String; = "WebRegistrationFailure"

.field public static final WEB_REGISTRATION_SUCCESS:Ljava/lang/String; = "WebRegistrationSuccess"


# instance fields
.field private apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

.field private userCreateGuestReason:I

.field private userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

.field private userFacebookConnectRequest:Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;

.field private userGetInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

.field private userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

.field private userLogoutRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;

.field private userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

.field public userSelectedCountry:Ljava/lang/Integer;

.field private userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/registration/GoogleSignInController;Lcom/shopkick/app/application/SKLogger;)V
    .locals 0
    .param p9    # Lcom/shopkick/app/application/SKLogger;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p3, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 114
    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    .line 115
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 116
    iput-object p4, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 117
    iput-object p5, p0, Lcom/shopkick/app/account/UserAccountDataSource;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 118
    iput-object p6, p0, Lcom/shopkick/app/account/UserAccountDataSource;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 119
    iput-object p7, p0, Lcom/shopkick/app/account/UserAccountDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 120
    iput-object p8, p0, Lcom/shopkick/app/account/UserAccountDataSource;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    if-nez p9, :cond_0

    const-string p1, "SKLogger is null!"

    .line 123
    invoke-static {p1}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    .line 125
    :cond_0
    iput-object p9, p0, Lcom/shopkick/app/account/UserAccountDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    return-void
.end method

.method private createNotificationParams(ILjava/lang/String;)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 695
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->createNotificationParams(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p2

    const-string v0, "Status"

    .line 696
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method private createNotificationParams(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 701
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "ErrorMsg"

    .line 702
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private getDeviceInfoSimCountry()Ljava/lang/String;
    .locals 2

    .line 357
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v0}, Lcom/shopkick/app/application/DeviceInfo;->getSimCountry()Ljava/lang/String;

    move-result-object v0

    .line 360
    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string/jumbo v0, "us"

    return-object v0

    :cond_0
    return-object v0
.end method

.method private getSKSimCountryCode()Ljava/lang/Integer;
    .locals 4

    .line 199
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "us"

    const/4 v2, 0x1

    .line 200
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "de"

    const/16 v3, 0x3a

    .line 201
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->getDeviceInfoSimCountry()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 211
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    .line 213
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private handleCompletedUserCreateGuestRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 386
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const p1, 0x77a14

    .line 387
    invoke-static {p1}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const p1, 0x77a16

    .line 388
    invoke-static {p1}, Lcom/shopkick/app/application/SIP;->onUserAction(I)V

    .line 389
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CreateGuestRequestSuccess"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    .line 391
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->generateHttpStatusCodeErrorMsg(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object v0

    .line 392
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/UserAccountDataSource;->createNotificationParams(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "HttpStatusCode"

    .line 393
    invoke-virtual {p1}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ClientErrorCode"

    .line 394
    iget p1, p1, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestFailure"

    invoke-virtual {p1, v1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :goto_0
    return-void
.end method

.method private handleCompletedUserFacebookConnectRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 603
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 604
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectResponse;

    .line 606
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserFacebookConnectSuccess"

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectResponse;->status:Ljava/lang/Integer;

    .line 607
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectResponse;->errorMsg:Ljava/lang/String;

    invoke-direct {p0, v2, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->createNotificationParams(ILjava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    .line 606
    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_0

    .line 609
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->generateHttpStatusCodeErrorMsg(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object p1

    .line 610
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserFacebookConnectFailure"

    invoke-direct {p0, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->createNotificationParams(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :goto_0
    return-void
.end method

.method private handleCompletedUserLoginRequest(Lcom/shopkick/fetchers/DataResponse;Ljava/lang/Integer;)V
    .locals 3

    .line 465
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 466
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;

    .line 467
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->errorMsg:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->createNotificationParams(ILjava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "DisplayName"

    .line 469
    iget-object v2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "LoginRequestSuccess"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 471
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    .line 472
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 473
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->userId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setUserId(Ljava/lang/String;)V

    .line 474
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLoginOrRegisterType(Ljava/lang/Integer;)V

    .line 475
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_0

    .line 478
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->generateHttpStatusCodeErrorMsg(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object p1

    .line 479
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "LoginRequestFailure"

    invoke-direct {p0, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->createNotificationParams(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_1
    :goto_0
    return-void
.end method

.method private handleCompletedUserLogoutRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 312
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    .line 313
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "LogoutRequestSuccess"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    .line 315
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "LogoutRequestFailure"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :goto_0
    return-void
.end method

.method private handleCompletedUserRegisterRequest(Lcom/shopkick/fetchers/DataResponse;Ljava/lang/Integer;)V
    .locals 3

    .line 553
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 554
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;

    .line 555
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->errorMsg:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->createNotificationParams(ILjava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "DisplayName"

    .line 557
    iget-object v2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "RegistrationRequestSuccess"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 559
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_2

    .line 560
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 561
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->userId:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setUserId(Ljava/lang/String;)V

    .line 562
    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLoginOrRegisterType(Ljava/lang/Integer;)V

    .line 563
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 566
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/account/UserAccount;->setNewUser(Z)V

    goto :goto_0

    .line 569
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->generateHttpStatusCodeErrorMsg(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object p2

    .line 570
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->createNotificationParams(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p2

    .line 571
    invoke-virtual {p1}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "HttpStatusCode"

    .line 573
    invoke-virtual {p1}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "RegistrationRequestFailure"

    invoke-virtual {p1, v0, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_2
    :goto_0
    return-void
.end method

.method private handleRefreshAccountInfo(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 230
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 231
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoResponse;

    .line 232
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/UserAccount;->setUserInfo(Lcom/shopkick/app/fetchers/api/skapi/UserInfo;)V

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    :cond_0
    return-void
.end method

.method private handleUserCreateGuestRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 368
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 369
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestResponse;

    .line 371
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestResponse;->userId:Ljava/lang/String;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestResponse;->sessionKeyBase64Enc:Ljava/lang/String;

    iget v3, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestReason:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/account/UserAccount;->resetUserIdAndSessionKeyWithReason(Ljava/lang/String;Ljava/lang/String;I)V

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestResponse;->country:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccount;->setCountry(Ljava/lang/Integer;)V

    .line 375
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/account/UserAccount;->setCreatedTsUTC(J)V

    .line 376
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->save()V

    const/4 v0, 0x0

    .line 379
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userSelectedCountry:Ljava/lang/Integer;

    .line 381
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestResponse;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/ClientFlagsManager;->setClientAppUIFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;)V

    :cond_0
    return-void
.end method

.method private handleUserFacebookConnectRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 591
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 592
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectResponse;

    .line 594
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 595
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccount;->setFacebookConnected(Z)V

    .line 596
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectResponse;->facebookAccessToken:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/UserAccount;->setFacebookAccessToken(Ljava/lang/String;)V

    .line 597
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    :cond_0
    return-void
.end method

.method private handleUserLoginRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 449
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 450
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;

    .line 451
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 452
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->userId:Ljava/lang/String;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->sessionKeyBase64Enc:Ljava/lang/String;

    const/4 v3, 0x5

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/account/UserAccount;->resetUserIdAndSessionKeyWithReason(Ljava/lang/String;Ljava/lang/String;I)V

    .line 455
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccount;->setUserInfo(Lcom/shopkick/app/fetchers/api/skapi/UserInfo;)V

    .line 456
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->facebookAccessToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccount;->setFacebookAccessToken(Ljava/lang/String;)V

    .line 457
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 459
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginResponse;->clientAppUiFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/ClientFlagsManager;->setClientAppUIFlags(Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;)V

    :cond_0
    return-void
.end method

.method private handleUserLogoutRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 306
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    .line 307
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->resetCurrentUserWithReason(I)V

    :cond_0
    return-void
.end method

.method private handleUserRegisterRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 539
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 540
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;

    .line 541
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 542
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->userId:Ljava/lang/String;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->sessionKeyBase64Enc:Ljava/lang/String;

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/app/account/UserAccount;->resetUserIdAndSessionKeyWithReason(Ljava/lang/String;Ljava/lang/String;I)V

    .line 545
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccount;->setUserInfo(Lcom/shopkick/app/fetchers/api/skapi/UserInfo;)V

    .line 546
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;->facebookAccessToken:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/UserAccount;->setFacebookAccessToken(Ljava/lang/String;)V

    .line 547
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    :cond_0
    return-void
.end method

.method private handleUserWebRegistrationRequest(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 287
    iget-boolean v0, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 288
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterResponse;

    .line 289
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "WebRegistrationSuccess"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_0

    .line 291
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "WebRegistrationFailure"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :goto_0
    return-void
.end method

.method private makeLoginRequest(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1

    .line 412
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    if-nez v0, :cond_2

    .line 413
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    if-eqz p1, :cond_0

    .line 415
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->facebookAccessToken:Ljava/lang/String;

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    .line 417
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    iput-object p6, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->googleIdToken:Ljava/lang/String;

    goto :goto_0

    .line 419
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    iput-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->email:Ljava/lang/String;

    .line 420
    iput-object p4, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->password:Ljava/lang/String;

    .line 422
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p2}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->deviceModel:Ljava/lang/String;

    .line 423
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p2}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->add:Ljava/lang/String;

    .line 424
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const p3, 0x7f10000a

    invoke-virtual {p2, p3}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->kcid:Ljava/lang/String;

    .line 425
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    invoke-virtual {p1, p2, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_2
    return-void
.end method


# virtual methods
.method public accountExists()Z
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    return v0
.end method

.method public cancelRefreshAccountInfoRequest()V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userGetInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 6

    .line 619
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 620
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleUserWebRegistrationRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 621
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    .line 623
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLogoutRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;

    if-ne p1, v0, :cond_1

    .line 624
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleCompletedUserLogoutRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 625
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLogoutRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;

    .line 627
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    if-ne p1, v0, :cond_2

    .line 628
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleCompletedUserCreateGuestRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 629
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    .line 631
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-eq p1, v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    if-ne p1, v0, :cond_7

    .line 633
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    if-ne p1, v0, :cond_6

    .line 634
    move-object v0, p1

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    iget-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->facebookAccessToken:Ljava/lang/String;

    if-eqz v5, :cond_4

    .line 635
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 636
    :cond_4
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;->googleIdToken:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 637
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 639
    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_6
    const/4 v0, 0x4

    .line 642
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 644
    :goto_0
    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/account/UserAccountDataSource;->handleCompletedUserLoginRequest(Lcom/shopkick/fetchers/DataResponse;Ljava/lang/Integer;)V

    .line 645
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    .line 646
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    .line 648
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    if-ne p1, v0, :cond_a

    .line 650
    move-object v0, p1

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    iget-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->facebookAccessToken:Ljava/lang/String;

    if-eqz v5, :cond_8

    .line 651
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    .line 652
    :cond_8
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->googleIdToken:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 653
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    .line 655
    :cond_9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 657
    :goto_1
    invoke-direct {p0, p2, v0}, Lcom/shopkick/app/account/UserAccountDataSource;->handleCompletedUserRegisterRequest(Lcom/shopkick/fetchers/DataResponse;Ljava/lang/Integer;)V

    .line 658
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    .line 660
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userFacebookConnectRequest:Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;

    if-ne p1, v0, :cond_b

    .line 661
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleCompletedUserFacebookConnectRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 662
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userFacebookConnectRequest:Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;

    .line 664
    :cond_b
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userGetInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

    if-ne p1, p2, :cond_c

    .line 665
    iput-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userGetInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

    :cond_c
    return-void
.end method

.method public generateHttpStatusCodeErrorMsg(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;
    .locals 2

    .line 707
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 710
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const v1, 0x7f110142

    invoke-virtual {v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 711
    invoke-virtual {p1}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v1

    if-nez v1, :cond_1

    .line 712
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    const v0, 0x7f11014d

    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 713
    :cond_1
    invoke-virtual {p1}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    const/16 v1, 0x190

    if-ne p1, v1, :cond_2

    .line 714
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    const v0, 0x7f110152

    invoke-virtual {p1, v0}, Lcom/shopkick/app/activities/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0

    :cond_3
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getCombinedPrivacyPolicyAndTermsOfServiceURL()Ljava/lang/String;
    .locals 2

    .line 183
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_0

    const-string v0, "http://shopkick.de/nutzungsbedingungen-datenschutzerklarung"

    return-object v0

    :cond_0
    const-string v0, "http://shopkick.com/privacy-and-tos"

    return-object v0
.end method

.method public getCopyRightURL()Ljava/lang/String;
    .locals 1

    const-string v0, "https://www.shopkick.com/copyright-policy"

    return-object v0
.end method

.method public getPrivacyPolicyURL()Ljava/lang/String;
    .locals 2

    .line 163
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_0

    const-string v0, "http://shopkick.de/datenschutzerklarung"

    return-object v0

    :cond_0
    const-string v0, "http://shopkick.com/privacy-policy"

    return-object v0
.end method

.method public getTermsOfServiceURL()Ljava/lang/String;
    .locals 2

    .line 175
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_0

    const-string v0, "http://shopkick.de/nutzungsbedingungen"

    return-object v0

    :cond_0
    const-string v0, "http://shopkick.com/terms-of-service"

    return-object v0
.end method

.method public getUserCountry()Ljava/lang/Integer;
    .locals 1

    .line 191
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userSelectedCountry:Ljava/lang/Integer;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->getSKSimCountryCode()Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isCountryAvailableToCreateGuestAccount()Z
    .locals 1

    .line 400
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->getSKSimCountryCode()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userSelectedCountry:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public makeAuthCodeLoginRequest(Ljava/lang/String;)V
    .locals 2

    .line 440
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    if-nez v0, :cond_0

    .line 441
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    .line 442
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;->authCode:Ljava/lang/String;

    .line 443
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const v1, 0x7f10000a

    invoke-virtual {p1, v1}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;->kcid:Ljava/lang/String;

    .line 444
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method

.method public makeLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 14

    if-eqz p3, :cond_0

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object/from16 v2, p3

    .line 431
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/account/UserAccountDataSource;->makeLoginRequest(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v7, p0

    move-object/from16 v13, p4

    .line 433
    invoke-direct/range {v7 .. v13}, Lcom/shopkick/app/account/UserAccountDataSource;->makeLoginRequest(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object/from16 v4, p2

    .line 435
    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/account/UserAccountDataSource;->makeLoginRequest(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public makeRedeemMarketingPromoCodeRequest(Ljava/lang/String;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;
    .locals 9

    .line 275
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;-><init>()V

    .line 277
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemMarketingPromoCodeRequest;->promoCode:Ljava/lang/String;

    .line 278
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v5, 0x0

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v3, v0

    move-object v4, p2

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public makeRedeemPromoCodeRequest(Ljava/lang/String;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;
    .locals 9

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;-><init>()V

    .line 265
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/RedeemPromoCodeRequest;->promoCode:Ljava/lang/String;

    .line 266
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    const/4 v5, 0x0

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->HIGH:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v3, v0

    move-object v4, p2

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public makeUserCreateGuestRequestWithReason(I)V
    .locals 4

    .line 323
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->isCountryAvailableToCreateGuestAccount()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 326
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    if-nez v0, :cond_2

    .line 327
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    .line 328
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->deviceModel:Ljava/lang/String;

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->add:Ljava/lang/String;

    .line 330
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    const v2, 0x7f10000a

    invoke-virtual {v1, v2}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->kcid:Ljava/lang/String;

    .line 331
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 333
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->lat:Ljava/lang/Double;

    .line 334
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->lng:Ljava/lang/Double;

    .line 335
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->accuracy:Ljava/lang/Double;

    .line 337
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getAndroidId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->androidId:Ljava/lang/String;

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountDataSource;->getDeviceInfoSimCountry()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->simCountry:Ljava/lang/String;

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userSelectedCountry:Ljava/lang/Integer;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;->userSelectedCountry:Ljava/lang/Integer;

    .line 340
    iput p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestReason:I

    .line 341
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_2
    return-void
.end method

.method public makeUserFacebookConnectRequest(Ljava/lang/String;)V
    .locals 1

    .line 583
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userFacebookConnectRequest:Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;

    if-nez v0, :cond_0

    .line 584
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userFacebookConnectRequest:Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;

    .line 585
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userFacebookConnectRequest:Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;->facebookAccessToken:Ljava/lang/String;

    .line 586
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method

.method public makeUserLogoutRequest()V
    .locals 2

    .line 299
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLogoutRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;

    if-nez v0, :cond_0

    .line 300
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLogoutRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;

    .line 301
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLogoutRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method

.method public makeUserRegisterRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 500
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    if-nez v0, :cond_5

    .line 501
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    .line 502
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->email:Ljava/lang/String;

    .line 503
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->password:Ljava/lang/String;

    .line 504
    iput-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->firstName:Ljava/lang/String;

    .line 505
    iput-object p4, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->lastName:Ljava/lang/String;

    .line 506
    iput-object p5, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->fullName:Ljava/lang/String;

    .line 507
    iput-object p6, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->facebookAccessToken:Ljava/lang/String;

    .line 508
    iput-object p7, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->googleIdToken:Ljava/lang/String;

    .line 509
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 510
    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 509
    invoke-static {p8, p1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFormattedForNetwork(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->phoneNumber:Ljava/lang/String;

    .line 511
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    iput-object p9, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->zipCode:Ljava/lang/String;

    .line 514
    invoke-static {p10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->makePublic:Ljava/lang/Boolean;

    .line 515
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p2}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->add:Ljava/lang/String;

    .line 516
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 518
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->lat:Ljava/lang/Double;

    .line 519
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    iput-object p3, p2, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->lng:Ljava/lang/Double;

    .line 520
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    float-to-double p3, p1

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->accuracy:Ljava/lang/Double;

    :cond_0
    if-eqz p11, :cond_1

    .line 523
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-static {p11}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->flowOriginScreen:Ljava/lang/Integer;

    :cond_1
    if-eqz p12, :cond_2

    .line 526
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-static {p12}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->flowOriginOverlay:Ljava/lang/Integer;

    :cond_2
    if-eqz p13, :cond_3

    .line 529
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-static {p13}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->flowOriginElement:Ljava/lang/Integer;

    :cond_3
    if-eqz p14, :cond_4

    .line 532
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-static {p14}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;->flowOriginElementId:Ljava/lang/Integer;

    .line 534
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    invoke-virtual {p1, p2, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_5
    return-void
.end method

.method public makeWebRegistrationRequest(Ljava/lang/String;)V
    .locals 3

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    if-eqz v0, :cond_0

    return-void

    .line 249
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    .line 250
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->webRegistrationId:Ljava/lang/String;

    .line 251
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 253
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->lat:Ljava/lang/Double;

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->lng:Ljava/lang/Double;

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result p1

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;->accuracy:Ljava/lang/Double;

    .line 257
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userWebRegistrationRequest:Lcom/shopkick/app/fetchers/api/skapi/UserWebRegistrationRequest;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_2
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 671
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLogoutRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLogoutRequest;

    if-ne p1, v0, :cond_0

    .line 672
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleUserLogoutRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 674
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userCreateGuestRequest:Lcom/shopkick/app/fetchers/api/skapi/UserCreateGuestRequest;

    if-ne p1, v0, :cond_1

    .line 675
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleUserCreateGuestRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 677
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserLoginRequest;

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAuthCodeLoginRequest:Lcom/shopkick/app/fetchers/api/skapi/UserAuthCodeLoginRequest;

    if-ne p1, v0, :cond_3

    .line 678
    :cond_2
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleUserLoginRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 680
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userRegisterRequest:Lcom/shopkick/app/fetchers/api/skapi/UserRegisterRequest;

    if-ne p1, v0, :cond_4

    .line 681
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleUserRegisterRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 683
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userFacebookConnectRequest:Lcom/shopkick/app/fetchers/api/skapi/UserFacebookConnectRequest;

    if-ne p1, v0, :cond_5

    .line 684
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleUserFacebookConnectRequest(Lcom/shopkick/fetchers/DataResponse;)V

    .line 686
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userGetInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

    if-ne p1, v0, :cond_6

    .line 687
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/UserAccountDataSource;->handleRefreshAccountInfo(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_6
    return-void
.end method

.method public refreshAccountInfo()V
    .locals 9

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userGetInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

    if-nez v0, :cond_0

    .line 223
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userGetInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

    .line 225
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v2, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v3, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userGetInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UserGetInfoRequest;

    const/4 v5, 0x0

    sget-object v6, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v7, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v8, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v4, p0

    invoke-virtual/range {v1 .. v8}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public resetCurrentUserWithReason(I)V
    .locals 3

    .line 132
    invoke-static {}, Lcom/shopkick/app/controllers/FBConnectController;->logout()V

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/shopkick/app/account/UserAccountDataSource;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v2}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/registration/GoogleSignInController;->logout(Landroid/app/Activity;)V

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, p1}, Lcom/shopkick/app/account/UserAccount;->resetUserIdAndSessionKeyWithReason(Ljava/lang/String;Ljava/lang/String;I)V

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setVerificationSMSSent(Z)V

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->save()V

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    .line 138
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "DeleteAccountRequestSuccess"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_0
    return-void
.end method

.method public userIsPhoneRegistered()Z
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public userIsPhoneVerified()Z
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified()Z

    move-result v0

    return v0
.end method

.method public userIsRegistered()Z
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    return v0
.end method

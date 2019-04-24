.class public Lcom/ibotta/android/async/device/DeviceRegistrationImpl;
.super Ljava/lang/Object;
.source "DeviceRegistrationImpl.java"

# interfaces
.implements Lcom/ibotta/android/async/device/DeviceRegistration;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

.field private final fcmTokenManager:Lcom/ibotta/android/async/device/FcmTokenManager;

.field private final googleAIDRetriever:Lcom/ibotta/android/async/device/GoogleAIDRetriever;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/security/DeviceSecurity;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->fcmTokenManager:Lcom/ibotta/android/async/device/FcmTokenManager;

    .line 38
    iput-object p4, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->googleAIDRetriever:Lcom/ibotta/android/async/device/GoogleAIDRetriever;

    .line 39
    iput-object p5, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    .line 40
    iput-object p6, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    return-void
.end method

.method private track(Ljava/lang/String;)V
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string v1, "fcm_registration"

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected alreadyRegistered()V
    .locals 2

    const-string v0, "Device registration already performed."

    const/4 v1, 0x0

    .line 81
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected createApiCall(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;
    .locals 0

    .line 113
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->createApiCallParams(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    move-result-object p1

    .line 114
    new-instance p2, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;

    invoke-direct {p2, p1}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;-><init>(Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;)V

    return-object p2
.end method

.method protected createApiCallParams(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;
    .locals 6

    .line 118
    new-instance v0, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;-><init>()V

    .line 119
    iget-object v1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->setCustomerId(I)V

    .line 120
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->setToken(Ljava/lang/String;)V

    .line 122
    sget-object v1, Lcom/ibotta/api/call/customer/device/DeviceType;->ANDROID:Lcom/ibotta/api/call/customer/device/DeviceType;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->setDeviceType(Lcom/ibotta/api/call/customer/device/DeviceType;)V

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->getDeviceUdid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->setDeviceUdid(Ljava/lang/String;)V

    .line 124
    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->setDeviceGlobalId(Ljava/lang/String;)V

    const-string v1, "Device Registration: customerId=%1$d"

    const/4 v2, 0x1

    .line 126
    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getCustomerId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "Device Registration: token=%1$s"

    .line 127
    new-array v3, v2, [Ljava/lang/Object;

    aput-object p1, v3, v5

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Device Registration: deviceType=%1$s"

    .line 128
    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getDeviceType()Lcom/ibotta/api/call/customer/device/DeviceType;

    move-result-object v3

    aput-object v3, v1, v5

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Device Registration: deviceUdid=%1$s"

    .line 129
    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall$CallParams;->getDeviceUdid()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v5

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "Device Registration: deviceGlobalId=%1$s"

    .line 130
    new-array v1, v2, [Ljava/lang/Object;

    aput-object p2, v1, v5

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected getDeviceUdid()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    invoke-interface {v0}, Lcom/ibotta/android/security/DeviceSecurity;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected hasDataChanged(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 64
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->hashGoogleIds(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 65
    iget-object p2, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {p2}, Lcom/ibotta/android/state/user/UserState;->getLastDeviceRegistrationHash()Ljava/lang/String;

    move-result-object p2

    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method protected hashGoogleIds(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    if-nez p2, :cond_1

    const-string p2, ""

    .line 77
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected onRegistrationFail()V
    .locals 2

    const-string v0, "Failed to perform device registration."

    const/4 v1, 0x0

    .line 146
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "gcm_ibotta_error"

    .line 147
    invoke-direct {p0, v0}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->track(Ljava/lang/String;)V

    return-void
.end method

.method protected onRegistrationSuccess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "Successfully performed device registration."

    const/4 v1, 0x0

    .line 140
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->hashGoogleIds(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->setLastDeviceRegistrationHash(Ljava/lang/String;)V

    const-string p1, "gcm_success"

    .line 142
    invoke-direct {p0, p1}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->track(Ljava/lang/String;)V

    return-void
.end method

.method public registerDevice()V
    .locals 3

    const-string v0, "registerDevice"

    const/4 v1, 0x0

    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->fcmTokenManager:Lcom/ibotta/android/async/device/FcmTokenManager;

    invoke-virtual {v0}, Lcom/ibotta/android/async/device/FcmTokenManager;->getFcmToken()Ljava/lang/String;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->googleAIDRetriever:Lcom/ibotta/android/async/device/GoogleAIDRetriever;

    invoke-interface {v1}, Lcom/ibotta/android/async/device/GoogleAIDRetriever;->getGoogleAID()Ljava/lang/String;

    move-result-object v1

    .line 51
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->hasDataChanged(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->alreadyRegistered()V

    return-void

    .line 56
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 57
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->registerForLoggedInUser(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->registerForLoggedOutUser()V

    :goto_0
    return-void
.end method

.method protected registerForLoggedInUser(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "Performing device registration."

    const/4 v1, 0x0

    .line 85
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->createApiCall(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;

    move-result-object v0

    .line 91
    :try_start_0
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/customer/device/CustomerDevicePostResponse;

    .line 92
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/device/CustomerDevicePostCall;->isSuccess()Z

    move-result v0
    :try_end_0
    .catch Lcom/ibotta/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    .line 98
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->onRegistrationSuccess(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 100
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->onRegistrationFail()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string p2, "Failed to call API to add device."

    .line 95
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return v1

    .line 100
    :goto_2
    invoke-virtual {p0}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;->onRegistrationFail()V

    throw p1
.end method

.method protected registerForLoggedOutUser()V
    .locals 2

    const-string v0, "Skipping device registration. User is not logged in."

    const/4 v1, 0x0

    .line 108
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

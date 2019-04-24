.class public abstract Lcom/ibotta/android/di/DeviceRegistrationModule;
.super Ljava/lang/Object;
.source "DeviceRegistrationModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideDeviceRegistration(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/security/DeviceSecurity;)Lcom/ibotta/android/async/device/DeviceRegistration;
    .locals 8
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 41
    new-instance v7, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/async/device/DeviceRegistrationImpl;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/async/device/FcmTokenManager;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/security/DeviceSecurity;)V

    return-object v7
.end method

.method public static provideDeviceRegistrationAsync(Lcom/ibotta/android/async/device/DeviceRegistration;)Lcom/ibotta/android/async/device/DeviceRegistrationAsync;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 30
    new-instance v0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;-><init>(Lcom/ibotta/android/async/device/DeviceRegistration;)V

    return-object v0
.end method

.method public static provideGoogleAIDRetriever(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/google/GoogleState;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/async/device/GoogleAIDRetriever;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 48
    new-instance v0, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/async/device/GoogleAIDRetrieverImpl;-><init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/app/google/GoogleState;Lcom/ibotta/android/tracking/Tracker;)V

    return-object v0
.end method

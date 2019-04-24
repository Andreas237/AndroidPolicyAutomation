.class public abstract Lcom/ibotta/android/di/BlacklistModule;
.super Ljava/lang/Object;
.source "BlacklistModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideAppVersionHelper()Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;

    invoke-direct {v0}, Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;-><init>()V

    return-object v0
.end method

.method public static provideBlacklistClassifierFactory(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;)Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;-><init>(Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/blacklist/device/classifiers/AppVersionHelper;)V

    return-object v0
.end method

.method public static provideBlacklistEngine(Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/blacklist/BlacklistEngine;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 34
    new-instance v0, Lcom/ibotta/android/blacklist/device/DeviceBlacklistEngine;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/blacklist/device/DeviceBlacklistEngine;-><init>(Lcom/ibotta/android/blacklist/BlacklistClassifierFactory;Lcom/ibotta/android/state/app/config/AppConfig;)V

    return-object v0
.end method

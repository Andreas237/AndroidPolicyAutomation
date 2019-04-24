.class public abstract Lcom/ibotta/android/di/AppsFlyerModule;
.super Ljava/lang/Object;
.source "AppsFlyerModule.java"


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

.method public static getAppsFlyerUID(Lcom/ibotta/android/App;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "AppsFlyerUid"
    .end annotation

    .line 28
    invoke-static {}, Lcom/appsflyer/AppsFlyerLib;->getInstance()Lcom/appsflyer/AppsFlyerLib;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/appsflyer/AppsFlyerLib;->getAppsFlyerUID(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static provideAppsFlyerState()Lcom/ibotta/android/state/app/pojo/AppsFlyerState;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 23
    new-instance v0, Lcom/ibotta/android/state/app/pojo/AppsFlyerStateImpl;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/pojo/AppsFlyerStateImpl;-><init>()V

    return-object v0
.end method

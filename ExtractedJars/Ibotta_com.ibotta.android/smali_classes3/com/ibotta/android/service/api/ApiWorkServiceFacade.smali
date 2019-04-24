.class public Lcom/ibotta/android/service/api/ApiWorkServiceFacade;
.super Ljava/lang/Object;
.source "ApiWorkServiceFacade.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static start(Landroid/content/Context;)V
    .locals 2

    .line 17
    invoke-static {}, Lcom/ibotta/android/App;->isInForeground()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    :try_start_0
    invoke-static {p0}, Lcom/ibotta/android/service/api/InForegroundApiWorkService;->start(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 24
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 26
    invoke-static {p0}, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->start(Landroid/content/Context;)V

    goto :goto_0

    .line 29
    :cond_0
    invoke-static {p0}, Lcom/ibotta/android/service/api/InBackgroundApiWorkService;->start(Landroid/content/Context;)V

    :goto_0
    return-void
.end method

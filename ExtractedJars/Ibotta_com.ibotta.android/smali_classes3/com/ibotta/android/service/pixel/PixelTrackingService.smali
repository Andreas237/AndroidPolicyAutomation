.class public Lcom/ibotta/android/service/pixel/PixelTrackingService;
.super Landroid/support/v4/app/JobIntentService;
.source "PixelTrackingService.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field protected pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Landroid/support/v4/app/JobIntentService;-><init>()V

    return-void
.end method

.method public static enqueueWork(Landroid/content/Context;)V
    .locals 3

    .line 38
    const-class v0, Lcom/ibotta/android/service/pixel/PixelTrackingService;

    sget-object v1, Lcom/ibotta/android/service/JobServiceId;->PIXEL_TRACKING:Lcom/ibotta/android/service/JobServiceId;

    invoke-virtual {v1}, Lcom/ibotta/android/service/JobServiceId;->ordinal()I

    move-result v1

    invoke-static {p0}, Lcom/ibotta/android/service/pixel/PixelTrackingService;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v2

    invoke-static {p0, v0, v1, v2}, Lcom/ibotta/android/service/pixel/PixelTrackingService;->enqueueWork(Landroid/content/Context;Ljava/lang/Class;ILandroid/content/Intent;)V

    return-void
.end method

.method private makeTrackingUrlCall(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 84
    :try_start_0
    new-instance v3, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    invoke-static {v3}, Lcom/newrelic/agent/android/instrumentation/URLConnectionInstrumentation;->openConnection(Ljava/net/URLConnection;)Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    :try_start_1
    new-instance v2, Ljava/io/BufferedInputStream;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 v4, 0x100

    .line 87
    new-array v4, v4, [B

    .line 88
    :goto_0
    invoke-virtual {v2, v4}, Ljava/io/InputStream;->read([B)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    goto :goto_0

    .line 92
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/service/pixel/PixelTrackingService;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {v2, p1, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->handlePixelTrackingOutcome(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_1

    .line 101
    :try_start_2
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v3, v2

    goto :goto_3

    :catch_1
    move-exception v3

    move-object v7, v3

    move-object v3, v2

    move-object v2, v7

    :goto_1
    :try_start_3
    const-string v4, "Failed to make pixel tracking URL call: %1$s"

    .line 94
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getUrl()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v1

    invoke-static {v2, v4, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/service/pixel/PixelTrackingService;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->handlePixelTrackingOutcome(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;Z)V

    .line 97
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v3, :cond_1

    .line 101
    :try_start_4
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    const-string v0, "Failed to disconnect URL Connection."

    .line 103
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    return-void

    :catchall_1
    move-exception p1

    :goto_3
    if-eqz v3, :cond_2

    .line 101
    :try_start_5
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    .line 103
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Failed to disconnect URL Connection."

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 105
    :cond_2
    :goto_4
    throw p1
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 42
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/ibotta/android/service/pixel/PixelTrackingService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 47
    invoke-super {p0}, Landroid/support/v4/app/JobIntentService;->onCreate()V

    .line 48
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/service/pixel/PixelTrackingService;)V

    return-void
.end method

.method protected onHandleWork(Landroid/content/Intent;)V
    .locals 3
    .param p1    # Landroid/content/Intent;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const-string p1, "doWakefulWork"

    const/4 v0, 0x0

    .line 57
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    const-string p1, "STARTING"

    .line 59
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object p1, p0, Lcom/ibotta/android/service/pixel/PixelTrackingService;->pixelTrackingManager:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    invoke-interface {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;->findPixelsToTrack()Ljava/util/List;

    move-result-object p1

    .line 62
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;

    .line 63
    invoke-direct {p0, v1}, Lcom/ibotta/android/service/pixel/PixelTrackingService;->makeTrackingUrlCall(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "Work failed."

    .line 68
    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    const-string p1, "STOPPING"

    .line 72
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :goto_1
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "STOPPING"

    invoke-static {v1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    throw p1
.end method

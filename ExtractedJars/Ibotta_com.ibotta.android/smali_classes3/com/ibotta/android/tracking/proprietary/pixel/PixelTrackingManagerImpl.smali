.class public Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;
.super Ljava/lang/Object;
.source "PixelTrackingManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;
    }
.end annotation


# static fields
.field private static final REGEX_DEVICE_ID:Ljava/lang/String; = ".*(?i)\\[DEVICE_ID\\].*"

.field private static final TOKEN_DEVICE_ID:Ljava/lang/String; = "[DEVICE_ID]"


# instance fields
.field private final context:Landroid/content/Context;

.field private final googleAidSupplier:Lcom/ibotta/android/abstractions/GoogleAidSupplier;

.field private final isDebugPixelTracking:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

.field private final maxRetrySupplier:Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;

.field private final networkConnectedSupplier:Lcom/ibotta/android/abstractions/NetworkConnectedSupplier;

.field private final pixelTrackingService:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingService;

.field private final pixelUrls:Ljava/util/concurrent/BlockingDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingDeque<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private runnable:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;

.field private thread:Ljava/lang/Thread;

.field private final threadExistenceLock:Ljava/util/concurrent/locks/Lock;

.field private final tracker:Lcom/ibotta/android/tracking/Tracker;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/tracking/DebugTrackingSupplier;Landroid/content/Context;Lcom/ibotta/android/abstractions/GoogleAidSupplier;Lcom/ibotta/android/abstractions/NetworkConnectedSupplier;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingService;Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->pixelUrls:Ljava/util/concurrent/BlockingDeque;

    .line 56
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->threadExistenceLock:Ljava/util/concurrent/locks/Lock;

    .line 73
    iput-object p7, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->maxRetrySupplier:Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->isDebugPixelTracking:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    .line 75
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->context:Landroid/content/Context;

    .line 76
    iput-object p3, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->googleAidSupplier:Lcom/ibotta/android/abstractions/GoogleAidSupplier;

    .line 77
    iput-object p4, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->networkConnectedSupplier:Lcom/ibotta/android/abstractions/NetworkConnectedSupplier;

    .line 78
    iput-object p5, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    .line 79
    iput-object p6, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->pixelTrackingService:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingService;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->openPixelDatabase()Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)Ljava/util/concurrent/BlockingDeque;
    .locals 0

    .line 40
    iget-object p0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->pixelUrls:Ljava/util/concurrent/BlockingDeque;

    return-object p0
.end method

.method static synthetic access$300(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->createAndSavePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->closePixelDatabase(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    return-void
.end method

.method static synthetic access$500(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->stopThread()V

    return-void
.end method

.method private closePixelDatabase(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V
    .locals 3

    const-string v0, "closePixelDatabase"

    const/4 v1, 0x0

    .line 367
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return-void

    .line 374
    :cond_0
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;->release()V
    :try_end_0
    .catch Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to release pixel database."

    .line 377
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private createAndSavePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;Ljava/lang/String;)V
    .locals 4

    const-string v0, "Saving pixel URL: %1$s"

    const/4 v1, 0x1

    .line 323
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;

    invoke-direct {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;-><init>()V

    .line 326
    invoke-virtual {v0, p2}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->setUrl(Ljava/lang/String;)V

    .line 327
    invoke-virtual {v0, v3}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->setAttempts(S)V

    .line 330
    :try_start_0
    invoke-interface {p1, v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;->savePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V

    const-string p1, "Saved pixel URL to database: %1$s"

    .line 332
    new-array v0, v1, [Ljava/lang/Object;

    aput-object p2, v0, v3

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to save pixel tracking URL: %1$s"

    .line 335
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p2, v1, v3

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private logAndTrackOutcome(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;ZZI)V
    .locals 2

    .line 262
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->isDebugPixelTracking:Lcom/ibotta/android/tracking/DebugTrackingSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/DebugTrackingSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    const-string p2, "Successfully tracked pixel URL: %1$s"

    .line 267
    new-array p3, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getUrl()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p4, :cond_1

    .line 270
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "pixel_tracking_first_attempt"

    const-string p3, "success"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 273
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "pixel_tracking_retry"

    const-string p3, "success"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    const-string p2, "Giving up on pixel URL, too many attempts: %1$s"

    .line 279
    new-array p3, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getUrl()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "pixel_tracking_give_up"

    iget-object p3, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->maxRetrySupplier:Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;

    invoke-interface {p3}, Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;I)V

    goto :goto_0

    :cond_3
    const-string p2, "Will retry pixel URL call later: %1$s"

    .line 282
    new-array p3, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getUrl()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p3, v0

    invoke-static {p2, p3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p4, :cond_4

    .line 285
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "pixel_tracking_first_attempt"

    const-string p3, "fail"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 288
    :cond_4
    iget-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->tracker:Lcom/ibotta/android/tracking/Tracker;

    const-string p2, "pixel_tracking_retry"

    const-string p3, "fail"

    invoke-interface {p1, p2, p3}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private openPixelDatabase()Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;
    .locals 3

    const-string v0, "openPixelDatabase"

    const/4 v1, 0x0

    .line 347
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/database/SQLitePixelDatabase;->open(Landroid/content/Context;)Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to open pixel database."

    .line 353
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 355
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private startThreadIfNeeded()V
    .locals 3

    const-string v0, "startThreadIfNeeded"

    const/4 v1, 0x0

    .line 298
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->thread:Ljava/lang/Thread;

    if-nez v0, :cond_1

    .line 301
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->threadExistenceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 303
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->thread:Ljava/lang/Thread;

    if-nez v0, :cond_0

    const-string v0, "Starting new thread to save pixel URLs."

    .line 304
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;-><init>(Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$1;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->runnable:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;

    .line 307
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->runnable:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->thread:Ljava/lang/Thread;

    .line 308
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->thread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->threadExistenceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->threadExistenceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method private stopThread()V
    .locals 2

    const-string v0, "stopThread"

    const/4 v1, 0x0

    .line 387
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->threadExistenceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 391
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->runnable:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->runnable:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;

    invoke-virtual {v0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;->cancel()V

    .line 393
    iput-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->runnable:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl$SavingRunnable;

    .line 395
    :cond_0
    iput-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->thread:Ljava/lang/Thread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 397
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->threadExistenceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->threadExistenceLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method private trackUrl(Ljava/lang/String;)V
    .locals 3
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 153
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string p1, "Null/empty tracking pixel URL provided, ignoring."

    .line 154
    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->googleAidSupplier:Lcom/ibotta/android/abstractions/GoogleAidSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/abstractions/GoogleAidSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".*(?i)\\[DEVICE_ID\\].*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->googleAidSupplier:Lcom/ibotta/android/abstractions/GoogleAidSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/abstractions/GoogleAidSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_0
    const-string v2, "UTF-8"

    .line 163
    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "[DEVICE_ID]"

    .line 165
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Pixel URL updated to include Android Advertising ID: %1$s"

    const/4 v2, 0x1

    .line 167
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v1

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Failed to encode Google AID for pixel URL"

    .line 169
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->pixelUrls:Ljava/util/concurrent/BlockingDeque;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingDeque;->addLast(Ljava/lang/Object;)V

    .line 174
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->startThreadIfNeeded()V

    return-void
.end method


# virtual methods
.method public findPixelsToTrack()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 188
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->openPixelDatabase()Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    move-result-object v2
    :try_end_0
    .catch Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 190
    :try_start_1
    invoke-interface {v2}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;->findPixelsToTrack()Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v3

    goto :goto_1

    .line 198
    :cond_0
    :goto_0
    invoke-direct {p0, v2}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->closePixelDatabase(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    goto :goto_2

    :catchall_0
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_3

    :catch_1
    move-exception v3

    move-object v2, v0

    :goto_1
    :try_start_2
    const-string v4, "Failed to query for pixel URLs."

    .line 194
    new-array v5, v1, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v4

    invoke-interface {v4, v3}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :goto_2
    if-nez v0, :cond_1

    .line 203
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    :cond_1
    const-string v2, "%1$d pixel URLs found to track."

    const/4 v3, 0x1

    .line 206
    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v2, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    .line 198
    :goto_3
    invoke-direct {p0, v2}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->closePixelDatabase(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    throw v0
.end method

.method public handlePixelTrackingOutcome(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;Z)V
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "Null pixel provided to handlePixelTrackingOutcome. Ignoring."

    .line 221
    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v1, "handlePixelTrackingOutcome: success=%1$b, %2$s"

    const/4 v2, 0x2

    .line 224
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getUrl()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getAttempts()S

    move-result v1

    .line 228
    invoke-virtual {p1, v5}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->addAttempts(I)V

    const/4 v3, 0x0

    .line 232
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->openPixelDatabase()Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 234
    iget-object v4, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->maxRetrySupplier:Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;

    invoke-interface {v4}, Lcom/ibotta/android/tracking/proprietary/pixel/MaxRetrySupplier;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const-string v6, "Max attempts configured to be: %1$d"

    .line 235
    new-array v7, v5, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v0

    invoke-static {v6, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getAttempts()S

    move-result v6

    if-lt v6, v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 238
    :goto_0
    invoke-direct {p0, p1, p2, v4, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->logAndTrackOutcome(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;ZZI)V

    if-nez p2, :cond_3

    if-eqz v4, :cond_2

    goto :goto_1

    .line 245
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getAttempts()S

    move-result p2

    .line 246
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getUrl()Ljava/lang/String;

    move-result-object v1

    const-string v4, "Updating pixel URL with number of attempts: attempts=%1$s, URL=%2$s"

    .line 247
    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v0

    aput-object v1, v2, v5

    invoke-static {v4, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-interface {v3, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;->savePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V

    goto :goto_2

    .line 242
    :cond_3
    :goto_1
    invoke-interface {v3, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;->deletePixel(Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;)V
    :try_end_0
    .catch Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    :cond_4
    :goto_2
    invoke-direct {p0, v3}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->closePixelDatabase(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p2

    :try_start_1
    const-string v1, "Failed to process pixel tracking outcome: %1$s"

    .line 253
    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/Pixel;->getUrl()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v0

    invoke-static {p2, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_3
    return-void

    .line 257
    :goto_4
    invoke-direct {p0, v3}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->closePixelDatabase(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    throw p1
.end method

.method public hasPixelsToTrack()Z
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 129
    :try_start_0
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->openPixelDatabase()Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 131
    invoke-interface {v1}, Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;->getPixelRowCount()J

    move-result-wide v2
    :try_end_0
    .catch Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    const/4 v0, 0x1

    .line 139
    :cond_0
    :goto_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->closePixelDatabase(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    const-string v3, "Failed to query for pixel row count."

    .line 135
    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-static {}, Lcom/ibotta/android/tracking/IbottaTracking;->getExceptionReporter()Lcom/ibotta/android/abstractions/ExceptionReporter;

    move-result-object v3

    invoke-interface {v3, v2}, Lcom/ibotta/android/abstractions/ExceptionReporter;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return v0

    .line 139
    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->closePixelDatabase(Lcom/ibotta/android/tracking/proprietary/pixel/database/PixelDatabase;)V

    throw v0
.end method

.method public startIfWorkToDo()V
    .locals 3

    const-string v0, "startIfWorkToDo"

    const/4 v1, 0x0

    .line 109
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->networkConnectedSupplier:Lcom/ibotta/android/abstractions/NetworkConnectedSupplier;

    invoke-interface {v0}, Lcom/ibotta/android/abstractions/NetworkConnectedSupplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->hasPixelsToTrack()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Found pixel tracking work to do. Starting service."

    .line 111
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->pixelTrackingService:Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingService;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->context:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingService;->enqueueWork(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const-string v0, "No pixel tracking work to do at this time."

    .line 114
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public trackClick(Ljava/lang/String;)V
    .locals 3
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    const-string v0, "trackClick: %1$s"

    const/4 v1, 0x1

    .line 99
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->trackUrl(Ljava/lang/String;)V

    return-void
.end method

.method public trackImpression(Ljava/lang/String;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 89
    invoke-direct {p0, p1}, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManagerImpl;->trackUrl(Ljava/lang/String;)V

    return-void
.end method

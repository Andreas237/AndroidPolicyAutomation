.class Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/leakcanary/internal/DisplayLeakActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LoadLeaks"
.end annotation


# static fields
.field static final backgroundExecutor:Ljava/util/concurrent/Executor;

.field static final inFlight:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;>;"
        }
    .end annotation
.end field


# instance fields
.field activityOrNull:Lcom/squareup/leakcanary/internal/DisplayLeakActivity;

.field private final leakDirectoryProvider:Lcom/squareup/leakcanary/LeakDirectoryProvider;

.field private final mainHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 426
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->inFlight:Ljava/util/List;

    .line 428
    const-string v0, "LoadLeaks"

    invoke-static {v0}, Lcom/squareup/leakcanary/internal/LeakCanaryInternals;->newSingleThreadExecutor(Ljava/lang/String;)Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->backgroundExecutor:Ljava/util/concurrent/Executor;

    return-void
.end method

.method constructor <init>(Lcom/squareup/leakcanary/internal/DisplayLeakActivity;Lcom/squareup/leakcanary/LeakDirectoryProvider;)V
    .locals 2

    .line 447
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 448
    iput-object p1, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->activityOrNull:Lcom/squareup/leakcanary/internal/DisplayLeakActivity;

    .line 449
    iput-object p2, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->leakDirectoryProvider:Lcom/squareup/leakcanary/LeakDirectoryProvider;

    .line 450
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->mainHandler:Landroid/os/Handler;

    .line 451
    return-void
.end method

.method static forgetActivity()V
    .locals 3

    .line 437
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->inFlight:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;

    .line 438
    const/4 v0, 0x0

    iput-object v0, v2, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->activityOrNull:Lcom/squareup/leakcanary/internal/DisplayLeakActivity;

    .line 439
    goto :goto_0

    .line 440
    :cond_0
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->inFlight:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 441
    return-void
.end method

.method static load(Lcom/squareup/leakcanary/internal/DisplayLeakActivity;Lcom/squareup/leakcanary/LeakDirectoryProvider;)V
    .locals 2

    .line 431
    new-instance v1, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;

    invoke-direct {v1, p0, p1}, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;-><init>(Lcom/squareup/leakcanary/internal/DisplayLeakActivity;Lcom/squareup/leakcanary/LeakDirectoryProvider;)V

    .line 432
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->inFlight:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 433
    sget-object v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->backgroundExecutor:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 434
    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    .line 454
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 455
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->leakDirectoryProvider:Lcom/squareup/leakcanary/LeakDirectoryProvider;

    new-instance v1, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$1;

    invoke-direct {v1, p0}, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$1;-><init>(Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;)V

    invoke-interface {v0, v1}, Lcom/squareup/leakcanary/LeakDirectoryProvider;->listFiles(Ljava/io/FilenameFilter;)Ljava/util/List;

    move-result-object v4

    .line 460
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/io/File;

    .line 461
    const/4 v7, 0x0

    .line 463
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v7, v0

    .line 464
    new-instance v8, Ljava/io/ObjectInputStream;

    invoke-direct {v8, v7}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 465
    invoke-virtual {v8}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/squareup/leakcanary/HeapDump;

    .line 466
    invoke-virtual {v8}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/squareup/leakcanary/AnalysisResult;

    .line 467
    new-instance v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$Leak;

    invoke-direct {v0, v9, v10, v6}, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$Leak;-><init>(Lcom/squareup/leakcanary/HeapDump;Lcom/squareup/leakcanary/AnalysisResult;Ljava/io/File;)V

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 479
    if-eqz v7, :cond_2

    .line 481
    :try_start_1
    invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 483
    goto :goto_3

    .line 482
    :catch_0
    move-exception v8

    .line 483
    goto :goto_3

    .line 468
    :catch_1
    move-exception v8

    .line 471
    :try_start_2
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v9

    .line 472
    if-eqz v9, :cond_0

    .line 473
    const-string v0, "Could not read result file %s, deleted it."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v8, v0, v1}, Lcom/squareup/leakcanary/CanaryLog;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 475
    :cond_0
    const-string v0, "Could not read result file %s, could not delete it either."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v8, v0, v1}, Lcom/squareup/leakcanary/CanaryLog;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 479
    :goto_1
    if-eqz v7, :cond_2

    .line 481
    :try_start_3
    invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 483
    goto :goto_3

    .line 482
    :catch_2
    move-exception v8

    .line 483
    goto :goto_3

    .line 479
    :catchall_0
    move-exception v11

    if-eqz v7, :cond_1

    .line 481
    :try_start_4
    invoke-virtual {v7}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 483
    goto :goto_2

    .line 482
    :catch_3
    move-exception v12

    .line 483
    :cond_1
    :goto_2
    throw v11

    .line 486
    :cond_2
    :goto_3
    goto/16 :goto_0

    .line 487
    :cond_3
    new-instance v0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$2;

    invoke-direct {v0, p0}, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$2;-><init>(Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;)V

    invoke-static {v3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 493
    iget-object v0, p0, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;

    invoke-direct {v1, p0, v3}, Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks$3;-><init>(Lcom/squareup/leakcanary/internal/DisplayLeakActivity$LoadLeaks;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 502
    return-void
.end method

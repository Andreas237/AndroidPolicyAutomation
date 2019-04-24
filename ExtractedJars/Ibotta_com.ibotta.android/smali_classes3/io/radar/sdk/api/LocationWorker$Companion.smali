.class public final Lio/radar/sdk/api/LocationWorker$Companion;
.super Ljava/lang/Object;
.source "LocationWorker.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/api/LocationWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLocationWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationWorker.kt\nio/radar/sdk/api/LocationWorker$Companion\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,48:1\n29#2:49\n*E\n*S KotlinDebug\n*F\n+ 1 LocationWorker.kt\nio/radar/sdk/api/LocationWorker$Companion\n*L\n25#1:49\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u0007J\r\u0010\u0008\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/radar/sdk/api/LocationWorker$Companion;",
        "",
        "()V",
        "WORK_TAG",
        "",
        "cancelWork",
        "",
        "cancelWork$sdk_release",
        "scheduleWork",
        "scheduleWork$sdk_release",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lio/radar/sdk/api/LocationWorker$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancelWork$sdk_release()V
    .locals 2

    .line 34
    invoke-static {}, Landroidx/work/WorkManager;->getInstance()Landroidx/work/WorkManager;

    move-result-object v0

    const-string v1, "radar_work_tag"

    invoke-virtual {v0, v1}, Landroidx/work/WorkManager;->cancelAllWorkByTag(Ljava/lang/String;)Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

.method public final scheduleWork$sdk_release()V
    .locals 4

    .line 22
    new-instance v0, Landroidx/work/Constraints$Builder;

    invoke-direct {v0}, Landroidx/work/Constraints$Builder;-><init>()V

    .line 23
    sget-object v1, Landroidx/work/NetworkType;->CONNECTED:Landroidx/work/NetworkType;

    invoke-virtual {v0, v1}, Landroidx/work/Constraints$Builder;->setRequiredNetworkType(Landroidx/work/NetworkType;)Landroidx/work/Constraints$Builder;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroidx/work/Constraints$Builder;->build()Landroidx/work/Constraints;

    move-result-object v0

    .line 49
    new-instance v1, Landroidx/work/OneTimeWorkRequest$Builder;

    const-class v2, Lio/radar/sdk/api/LocationWorker;

    invoke-direct {v1, v2}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 26
    invoke-virtual {v1, v0}, Landroidx/work/OneTimeWorkRequest$Builder;->setConstraints(Landroidx/work/Constraints;)Landroidx/work/WorkRequest$Builder;

    move-result-object v0

    check-cast v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 27
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Landroidx/work/OneTimeWorkRequest$Builder;->setInitialDelay(JLjava/util/concurrent/TimeUnit;)Landroidx/work/OneTimeWorkRequest$Builder;

    move-result-object v0

    const-string v1, "radar_work_tag"

    .line 28
    invoke-virtual {v0, v1}, Landroidx/work/OneTimeWorkRequest$Builder;->addTag(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;

    move-result-object v0

    check-cast v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 29
    invoke-virtual {v0}, Landroidx/work/OneTimeWorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    move-result-object v0

    .line 25
    check-cast v0, Landroidx/work/OneTimeWorkRequest;

    .line 30
    invoke-static {}, Landroidx/work/WorkManager;->getInstance()Landroidx/work/WorkManager;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Landroidx/work/WorkRequest;

    check-cast v0, Landroidx/work/WorkRequest;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Landroidx/work/WorkManager;->enqueue([Landroidx/work/WorkRequest;)Lcom/google/common/util/concurrent/ListenableFuture;

    return-void
.end method

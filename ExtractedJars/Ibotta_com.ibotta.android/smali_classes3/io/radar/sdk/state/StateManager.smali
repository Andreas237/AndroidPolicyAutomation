.class public final Lio/radar/sdk/state/StateManager;
.super Ljava/lang/Object;
.source "StateManager.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateManager.kt\nio/radar/sdk/state/StateManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n1491#2,2:108\n*E\n*S KotlinDebug\n*F\n+ 1 StateManager.kt\nio/radar/sdk/state/StateManager\n*L\n63#1,2:108\n*E\n"
.end annotation

.annotation runtime Lio/radar/shadow/javax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000c\u001a\u00020\rH\u0000\u00a2\u0006\u0002\u0008\u0014J\u001b\u0010\u0012\u001a\u00020\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0016H\u0000\u00a2\u0006\u0002\u0008\u0014R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/radar/sdk/state/StateManager;",
        "",
        "context",
        "Landroid/content/Context;",
        "stateManagerRepository",
        "Lio/radar/sdk/state/StateManagerRepository;",
        "(Landroid/content/Context;Lio/radar/sdk/state/StateManagerRepository;)V",
        "THRESHOLD_DISTANCE",
        "",
        "THRESHOLD_TIME",
        "isStopped",
        "",
        "location",
        "Landroid/location/Location;",
        "saveLocation",
        "",
        "sendLocationUpdate",
        "stopped",
        "updateState",
        "Lio/radar/sdk/internal/RadarState;",
        "updateState$sdk_release",
        "locations",
        "",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field private final THRESHOLD_DISTANCE:I

.field private final THRESHOLD_TIME:I

.field private final context:Landroid/content/Context;

.field private final stateManagerRepository:Lio/radar/sdk/state/StateManagerRepository;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/radar/sdk/state/StateManagerRepository;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/state/StateManagerRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lio/radar/shadow/javax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateManagerRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/state/StateManager;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/radar/sdk/state/StateManager;->stateManagerRepository:Lio/radar/sdk/state/StateManagerRepository;

    const/16 p1, 0x46

    .line 21
    iput p1, p0, Lio/radar/sdk/state/StateManager;->THRESHOLD_DISTANCE:I

    const p1, 0x222e0

    .line 22
    iput p1, p0, Lio/radar/sdk/state/StateManager;->THRESHOLD_TIME:I

    return-void
.end method

.method private final isStopped(Landroid/location/Location;)Z
    .locals 7

    .line 73
    iget-object v0, p0, Lio/radar/sdk/state/StateManager;->stateManagerRepository:Lio/radar/sdk/state/StateManagerRepository;

    invoke-virtual {v0}, Lio/radar/sdk/state/StateManagerRepository;->getLastMovingLocation$sdk_release()Landroid/location/Location;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 74
    invoke-virtual {p1, v0}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v2

    .line 75
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    .line 76
    iget p1, p0, Lio/radar/sdk/state/StateManager;->THRESHOLD_DISTANCE:I

    int-to-float p1, p1

    cmpg-float p1, v2, p1

    if-gtz p1, :cond_0

    iget p1, p0, Lio/radar/sdk/state/StateManager;->THRESHOLD_TIME:I

    int-to-long v5, p1

    cmp-long p1, v3, v5

    if-ltz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method private final saveLocation(Landroid/location/Location;)V
    .locals 2

    .line 82
    iget-object v0, p0, Lio/radar/sdk/state/StateManager;->stateManagerRepository:Lio/radar/sdk/state/StateManagerRepository;

    invoke-virtual {v0}, Lio/radar/sdk/state/StateManagerRepository;->getLastMovingLocation$sdk_release()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {p1, v0}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result v0

    iget v1, p0, Lio/radar/sdk/state/StateManager;->THRESHOLD_DISTANCE:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 85
    :cond_0
    iget-object v0, p0, Lio/radar/sdk/state/StateManager;->stateManagerRepository:Lio/radar/sdk/state/StateManagerRepository;

    invoke-virtual {v0, p1}, Lio/radar/sdk/state/StateManagerRepository;->setLastMovingLocation$sdk_release(Landroid/location/Location;)V

    :cond_1
    return-void
.end method

.method private final sendLocationUpdate(Landroid/location/Location;Z)V
    .locals 4

    .line 90
    sget-object v0, Lio/radar/sdk/RadarReceiver;->Companion:Lio/radar/sdk/RadarReceiver$Companion;

    invoke-virtual {v0, p1, p2}, Lio/radar/sdk/RadarReceiver$Companion;->createLocationIntent$sdk_release(Landroid/location/Location;Z)Landroid/content/Intent;

    move-result-object p1

    .line 92
    iget-object p2, p0, Lio/radar/sdk/state/StateManager;->context:Landroid/content/Context;

    invoke-static {p2}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 94
    iget-object p2, p0, Lio/radar/sdk/state/StateManager;->context:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p2

    .line 95
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 96
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 97
    iget-object v2, p0, Lio/radar/sdk/state/StateManager;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 98
    new-instance v2, Landroid/content/ComponentName;

    iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 99
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 98
    invoke-direct {v2, v3, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 102
    iget-object v0, p0, Lio/radar/sdk/state/StateManager;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final updateState$sdk_release(Landroid/location/Location;)Lio/radar/sdk/internal/RadarState;
    .locals 8
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0, p1}, Lio/radar/sdk/state/StateManager;->isStopped(Landroid/location/Location;)Z

    move-result v0

    .line 27
    invoke-direct {p0, p1, v0}, Lio/radar/sdk/state/StateManager;->sendLocationUpdate(Landroid/location/Location;Z)V

    .line 29
    iget-object v1, p0, Lio/radar/sdk/state/StateManager;->stateManagerRepository:Lio/radar/sdk/state/StateManagerRepository;

    invoke-virtual {v1}, Lio/radar/sdk/state/StateManagerRepository;->getCurrentState$sdk_release()Lio/radar/sdk/internal/RadarState;

    move-result-object v1

    .line 31
    instance-of v2, v1, Lio/radar/sdk/internal/Moving;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-eqz v0, :cond_0

    .line 33
    new-instance v0, Lio/radar/sdk/internal/Stopped;

    invoke-direct {v0, p1, v3}, Lio/radar/sdk/internal/Stopped;-><init>(Landroid/location/Location;Z)V

    check-cast v0, Lio/radar/sdk/internal/RadarState;

    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, Lio/radar/sdk/internal/Moving;

    invoke-direct {v0, p1}, Lio/radar/sdk/internal/Moving;-><init>(Landroid/location/Location;)V

    check-cast v0, Lio/radar/sdk/internal/RadarState;

    goto :goto_0

    .line 38
    :cond_1
    instance-of v2, v1, Lio/radar/sdk/internal/Stopped;

    if-eqz v2, :cond_3

    if-eqz v0, :cond_2

    .line 41
    check-cast v1, Lio/radar/sdk/internal/Stopped;

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2, v0, v3, v2}, Lio/radar/sdk/internal/Stopped;->copy$default(Lio/radar/sdk/internal/Stopped;Landroid/location/Location;ZILjava/lang/Object;)Lio/radar/sdk/internal/Stopped;

    move-result-object v0

    check-cast v0, Lio/radar/sdk/internal/RadarState;

    goto :goto_0

    .line 43
    :cond_2
    new-instance v0, Lio/radar/sdk/internal/Moving;

    invoke-direct {v0, p1}, Lio/radar/sdk/internal/Moving;-><init>(Landroid/location/Location;)V

    check-cast v0, Lio/radar/sdk/internal/RadarState;

    goto :goto_0

    .line 46
    :cond_3
    new-instance v0, Lio/radar/sdk/internal/Moving;

    invoke-direct {v0, p1}, Lio/radar/sdk/internal/Moving;-><init>(Landroid/location/Location;)V

    check-cast v0, Lio/radar/sdk/internal/RadarState;

    .line 49
    :goto_0
    invoke-direct {p0, p1}, Lio/radar/sdk/state/StateManager;->saveLocation(Landroid/location/Location;)V

    .line 50
    iget-object v1, p0, Lio/radar/sdk/state/StateManager;->stateManagerRepository:Lio/radar/sdk/state/StateManagerRepository;

    invoke-virtual {v1, v0}, Lio/radar/sdk/state/StateManagerRepository;->setCurrentState$sdk_release(Lio/radar/sdk/internal/RadarState;)V

    .line 52
    instance-of v1, v0, Lio/radar/sdk/internal/Stopped;

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Stopped(justStopped="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, v0

    check-cast v2, Lio/radar/sdk/internal/Stopped;

    invoke-virtual {v2}, Lio/radar/sdk/internal/Stopped;->getJustStopped()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    const-string v1, "Moving"

    .line 53
    :goto_1
    sget-object v2, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    iget-object v3, p0, Lio/radar/sdk/state/StateManager;->context:Landroid/content/Context;

    .line 54
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "State Updated: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 55
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "State: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nTriggered by "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 53
    invoke-virtual {v2, v3, v4, p1}, Lio/radar/sdk/internal/RadarLogger;->notify(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final updateState$sdk_release(Ljava/util/List;)Lio/radar/sdk/internal/RadarState;
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/location/Location;",
            ">;)",
            "Lio/radar/sdk/internal/RadarState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 62
    check-cast v0, Lio/radar/sdk/internal/Stopped;

    .line 63
    check-cast p1, Ljava/lang/Iterable;

    .line 108
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    .line 64
    invoke-virtual {p0, v1}, Lio/radar/sdk/state/StateManager;->updateState$sdk_release(Landroid/location/Location;)Lio/radar/sdk/internal/RadarState;

    move-result-object v1

    .line 65
    instance-of v2, v1, Lio/radar/sdk/internal/Stopped;

    if-eqz v2, :cond_0

    check-cast v1, Lio/radar/sdk/internal/Stopped;

    invoke-virtual {v1}, Lio/radar/sdk/internal/Stopped;->getJustStopped()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 69
    check-cast v0, Lio/radar/sdk/internal/RadarState;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lio/radar/sdk/state/StateManager;->stateManagerRepository:Lio/radar/sdk/state/StateManagerRepository;

    invoke-virtual {p1}, Lio/radar/sdk/state/StateManagerRepository;->getCurrentState$sdk_release()Lio/radar/sdk/internal/RadarState;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_3
    :goto_1
    return-object v0
.end method

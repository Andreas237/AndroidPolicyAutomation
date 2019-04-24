.class public final Lio/radar/sdk/RadarTrackingOptions$Builder;
.super Ljava/lang/Object;
.source "RadarTrackingOptions.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/RadarTrackingOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadarTrackingOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadarTrackingOptions.kt\nio/radar/sdk/RadarTrackingOptions$Builder\n*L\n1#1,51:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/radar/sdk/RadarTrackingOptions$Builder;",
        "",
        "()V",
        "offline",
        "Lio/radar/sdk/Radar$RadarTrackingOffline;",
        "priority",
        "Lio/radar/sdk/Radar$RadarTrackingPriority;",
        "sync",
        "Lio/radar/sdk/Radar$RadarTrackingSync;",
        "build",
        "Lio/radar/sdk/RadarTrackingOptions;",
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
.field private offline:Lio/radar/sdk/Radar$RadarTrackingOffline;

.field private priority:Lio/radar/sdk/Radar$RadarTrackingPriority;

.field private sync:Lio/radar/sdk/Radar$RadarTrackingSync;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget-object v0, Lio/radar/sdk/Radar$RadarTrackingOffline;->REPLAY_STOPPED:Lio/radar/sdk/Radar$RadarTrackingOffline;

    iput-object v0, p0, Lio/radar/sdk/RadarTrackingOptions$Builder;->offline:Lio/radar/sdk/Radar$RadarTrackingOffline;

    .line 33
    sget-object v0, Lio/radar/sdk/Radar$RadarTrackingPriority;->RESPONSIVENESS:Lio/radar/sdk/Radar$RadarTrackingPriority;

    iput-object v0, p0, Lio/radar/sdk/RadarTrackingOptions$Builder;->priority:Lio/radar/sdk/Radar$RadarTrackingPriority;

    .line 34
    sget-object v0, Lio/radar/sdk/Radar$RadarTrackingSync;->POSSIBLE_STATE_CHANGES:Lio/radar/sdk/Radar$RadarTrackingSync;

    iput-object v0, p0, Lio/radar/sdk/RadarTrackingOptions$Builder;->sync:Lio/radar/sdk/Radar$RadarTrackingSync;

    return-void
.end method


# virtual methods
.method public final build()Lio/radar/sdk/RadarTrackingOptions;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 45
    new-instance v0, Lio/radar/sdk/RadarTrackingOptions;

    .line 46
    iget-object v1, p0, Lio/radar/sdk/RadarTrackingOptions$Builder;->offline:Lio/radar/sdk/Radar$RadarTrackingOffline;

    .line 47
    iget-object v2, p0, Lio/radar/sdk/RadarTrackingOptions$Builder;->priority:Lio/radar/sdk/Radar$RadarTrackingPriority;

    .line 48
    iget-object v3, p0, Lio/radar/sdk/RadarTrackingOptions$Builder;->sync:Lio/radar/sdk/Radar$RadarTrackingSync;

    const/4 v4, 0x0

    .line 45
    invoke-direct {v0, v1, v2, v3, v4}, Lio/radar/sdk/RadarTrackingOptions;-><init>(Lio/radar/sdk/Radar$RadarTrackingOffline;Lio/radar/sdk/Radar$RadarTrackingPriority;Lio/radar/sdk/Radar$RadarTrackingSync;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final offline(Lio/radar/sdk/Radar$RadarTrackingOffline;)Lio/radar/sdk/RadarTrackingOptions$Builder;
    .locals 1
    .param p1    # Lio/radar/sdk/Radar$RadarTrackingOffline;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "offline"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    move-object v0, p0

    check-cast v0, Lio/radar/sdk/RadarTrackingOptions$Builder;

    iput-object p1, v0, Lio/radar/sdk/RadarTrackingOptions$Builder;->offline:Lio/radar/sdk/Radar$RadarTrackingOffline;

    return-object v0
.end method

.method public final priority(Lio/radar/sdk/Radar$RadarTrackingPriority;)Lio/radar/sdk/RadarTrackingOptions$Builder;
    .locals 1
    .param p1    # Lio/radar/sdk/Radar$RadarTrackingPriority;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    move-object v0, p0

    check-cast v0, Lio/radar/sdk/RadarTrackingOptions$Builder;

    iput-object p1, v0, Lio/radar/sdk/RadarTrackingOptions$Builder;->priority:Lio/radar/sdk/Radar$RadarTrackingPriority;

    return-object v0
.end method

.method public final sync(Lio/radar/sdk/Radar$RadarTrackingSync;)Lio/radar/sdk/RadarTrackingOptions$Builder;
    .locals 1
    .param p1    # Lio/radar/sdk/Radar$RadarTrackingSync;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "sync"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    move-object v0, p0

    check-cast v0, Lio/radar/sdk/RadarTrackingOptions$Builder;

    iput-object p1, v0, Lio/radar/sdk/RadarTrackingOptions$Builder;->sync:Lio/radar/sdk/Radar$RadarTrackingSync;

    return-object v0
.end method

.class public final Lio/radar/sdk/RadarTrackingOptions;
.super Ljava/lang/Object;
.source "RadarTrackingOptions.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/RadarTrackingOptions$Builder;,
        Lio/radar/sdk/RadarTrackingOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u001f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/radar/sdk/RadarTrackingOptions;",
        "",
        "offline",
        "Lio/radar/sdk/Radar$RadarTrackingOffline;",
        "priority",
        "Lio/radar/sdk/Radar$RadarTrackingPriority;",
        "sync",
        "Lio/radar/sdk/Radar$RadarTrackingSync;",
        "(Lio/radar/sdk/Radar$RadarTrackingOffline;Lio/radar/sdk/Radar$RadarTrackingPriority;Lio/radar/sdk/Radar$RadarTrackingSync;)V",
        "getOffline",
        "()Lio/radar/sdk/Radar$RadarTrackingOffline;",
        "getPriority",
        "()Lio/radar/sdk/Radar$RadarTrackingPriority;",
        "getSync",
        "()Lio/radar/sdk/Radar$RadarTrackingSync;",
        "Builder",
        "Companion",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field public static final Companion:Lio/radar/sdk/RadarTrackingOptions$Companion;

.field private static final DEFAULT$delegate:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final offline:Lio/radar/sdk/Radar$RadarTrackingOffline;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final priority:Lio/radar/sdk/Radar$RadarTrackingPriority;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sync:Lio/radar/sdk/Radar$RadarTrackingSync;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/RadarTrackingOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/RadarTrackingOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/RadarTrackingOptions;->Companion:Lio/radar/sdk/RadarTrackingOptions$Companion;

    .line 25
    sget-object v0, Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;->INSTANCE:Lio/radar/sdk/RadarTrackingOptions$Companion$DEFAULT$2;

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lio/radar/sdk/RadarTrackingOptions;->DEFAULT$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Lio/radar/sdk/Radar$RadarTrackingOffline;Lio/radar/sdk/Radar$RadarTrackingPriority;Lio/radar/sdk/Radar$RadarTrackingSync;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/RadarTrackingOptions;->offline:Lio/radar/sdk/Radar$RadarTrackingOffline;

    iput-object p2, p0, Lio/radar/sdk/RadarTrackingOptions;->priority:Lio/radar/sdk/Radar$RadarTrackingPriority;

    iput-object p3, p0, Lio/radar/sdk/RadarTrackingOptions;->sync:Lio/radar/sdk/Radar$RadarTrackingSync;

    return-void
.end method

.method public synthetic constructor <init>(Lio/radar/sdk/Radar$RadarTrackingOffline;Lio/radar/sdk/Radar$RadarTrackingPriority;Lio/radar/sdk/Radar$RadarTrackingSync;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .param p1    # Lio/radar/sdk/Radar$RadarTrackingOffline;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/Radar$RadarTrackingPriority;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/Radar$RadarTrackingSync;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lio/radar/sdk/RadarTrackingOptions;-><init>(Lio/radar/sdk/Radar$RadarTrackingOffline;Lio/radar/sdk/Radar$RadarTrackingPriority;Lio/radar/sdk/Radar$RadarTrackingSync;)V

    return-void
.end method


# virtual methods
.method public final getOffline()Lio/radar/sdk/Radar$RadarTrackingOffline;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lio/radar/sdk/RadarTrackingOptions;->offline:Lio/radar/sdk/Radar$RadarTrackingOffline;

    return-object v0
.end method

.method public final getPriority()Lio/radar/sdk/Radar$RadarTrackingPriority;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 20
    iget-object v0, p0, Lio/radar/sdk/RadarTrackingOptions;->priority:Lio/radar/sdk/Radar$RadarTrackingPriority;

    return-object v0
.end method

.method public final getSync()Lio/radar/sdk/Radar$RadarTrackingSync;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 21
    iget-object v0, p0, Lio/radar/sdk/RadarTrackingOptions;->sync:Lio/radar/sdk/Radar$RadarTrackingSync;

    return-object v0
.end method

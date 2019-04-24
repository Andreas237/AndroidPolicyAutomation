.class public final Lio/radar/sdk/model/RadarUserInsights;
.super Ljava/lang/Object;
.source "RadarUserInsights.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/model/RadarUserInsights$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarUserInsights;",
        "",
        "homeLocation",
        "Lio/radar/sdk/model/RadarUserInsightsLocation;",
        "officeLocation",
        "state",
        "Lio/radar/sdk/model/RadarUserInsightsState;",
        "(Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsState;)V",
        "getHomeLocation",
        "()Lio/radar/sdk/model/RadarUserInsightsLocation;",
        "getOfficeLocation",
        "getState",
        "()Lio/radar/sdk/model/RadarUserInsightsState;",
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
.field public static final Companion:Lio/radar/sdk/model/RadarUserInsights$Companion;


# instance fields
.field private final homeLocation:Lio/radar/sdk/model/RadarUserInsightsLocation;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final officeLocation:Lio/radar/sdk/model/RadarUserInsightsLocation;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final state:Lio/radar/sdk/model/RadarUserInsightsState;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/model/RadarUserInsights$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/model/RadarUserInsights$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/model/RadarUserInsights;->Companion:Lio/radar/sdk/model/RadarUserInsights$Companion;

    return-void
.end method

.method private constructor <init>(Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsState;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/radar/sdk/model/RadarUserInsights;->homeLocation:Lio/radar/sdk/model/RadarUserInsightsLocation;

    iput-object p2, p0, Lio/radar/sdk/model/RadarUserInsights;->officeLocation:Lio/radar/sdk/model/RadarUserInsightsLocation;

    iput-object p3, p0, Lio/radar/sdk/model/RadarUserInsights;->state:Lio/radar/sdk/model/RadarUserInsightsState;

    return-void
.end method

.method public synthetic constructor <init>(Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .param p1    # Lio/radar/sdk/model/RadarUserInsightsLocation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/model/RadarUserInsightsLocation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/model/RadarUserInsightsState;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 14
    invoke-direct {p0, p1, p2, p3}, Lio/radar/sdk/model/RadarUserInsights;-><init>(Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsLocation;Lio/radar/sdk/model/RadarUserInsightsState;)V

    return-void
.end method


# virtual methods
.method public final getState()Lio/radar/sdk/model/RadarUserInsightsState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 28
    iget-object v0, p0, Lio/radar/sdk/model/RadarUserInsights;->state:Lio/radar/sdk/model/RadarUserInsightsState;

    return-object v0
.end method

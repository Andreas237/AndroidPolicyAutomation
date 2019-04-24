.class public final Lio/radar/sdk/model/RadarUserInsightsState;
.super Ljava/lang/Object;
.source "RadarUserInsightsState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/model/RadarUserInsightsState$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarUserInsightsState;",
        "",
        "home",
        "",
        "office",
        "traveling",
        "(ZZZ)V",
        "getHome",
        "()Z",
        "getOffice",
        "getTraveling",
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
.field public static final Companion:Lio/radar/sdk/model/RadarUserInsightsState$Companion;


# instance fields
.field private final home:Z

.field private final office:Z

.field private final traveling:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/radar/sdk/model/RadarUserInsightsState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/radar/sdk/model/RadarUserInsightsState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/radar/sdk/model/RadarUserInsightsState;->Companion:Lio/radar/sdk/model/RadarUserInsightsState$Companion;

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lio/radar/sdk/model/RadarUserInsightsState;->home:Z

    iput-boolean p2, p0, Lio/radar/sdk/model/RadarUserInsightsState;->office:Z

    iput-boolean p3, p0, Lio/radar/sdk/model/RadarUserInsightsState;->traveling:Z

    return-void
.end method


# virtual methods
.method public final getHome()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lio/radar/sdk/model/RadarUserInsightsState;->home:Z

    return v0
.end method

.method public final getOffice()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lio/radar/sdk/model/RadarUserInsightsState;->office:Z

    return v0
.end method

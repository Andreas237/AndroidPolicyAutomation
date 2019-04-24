.class public final enum Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;
.super Ljava/lang/Enum;
.source "RadarUserInsightsLocation.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarUserInsightsLocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RadarUserInsightsLocationType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;",
        "",
        "(Ljava/lang/String;I)V",
        "UNKNOWN",
        "HOME",
        "OFFICE",
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
.field private static final synthetic $VALUES:[Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

.field public static final enum HOME:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

.field public static final enum OFFICE:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

.field public static final enum UNKNOWN:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    new-instance v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->UNKNOWN:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    const-string v2, "HOME"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->HOME:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    const-string v2, "OFFICE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->OFFICE:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    aput-object v1, v0, v3

    sput-object v0, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->$VALUES:[Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;
    .locals 1

    const-class v0, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    return-object p0
.end method

.method public static values()[Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;
    .locals 1

    sget-object v0, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->$VALUES:[Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    invoke-virtual {v0}, [Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    return-object v0
.end method

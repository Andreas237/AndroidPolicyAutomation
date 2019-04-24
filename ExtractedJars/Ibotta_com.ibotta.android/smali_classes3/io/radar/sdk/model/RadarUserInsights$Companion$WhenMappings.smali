.class public final synthetic Lio/radar/sdk/model/RadarUserInsights$Companion$WhenMappings;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    invoke-static {}, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->values()[Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/radar/sdk/model/RadarUserInsights$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lio/radar/sdk/model/RadarUserInsights$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->HOME:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    invoke-virtual {v1}, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v0, Lio/radar/sdk/model/RadarUserInsights$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->OFFICE:Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;

    invoke-virtual {v1}, Lio/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    return-void
.end method

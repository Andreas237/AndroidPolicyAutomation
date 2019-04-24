.class public final synthetic Lio/radar/sdk/Radar$WhenMappings;
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

    invoke-static {}, Lio/radar/sdk/Radar$RadarTrackingPriority;->values()[Lio/radar/sdk/Radar$RadarTrackingPriority;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/radar/sdk/Radar$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lio/radar/sdk/Radar$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/radar/sdk/Radar$RadarTrackingPriority;->RESPONSIVENESS:Lio/radar/sdk/Radar$RadarTrackingPriority;

    invoke-virtual {v1}, Lio/radar/sdk/Radar$RadarTrackingPriority;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1

    sget-object v0, Lio/radar/sdk/Radar$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lio/radar/sdk/Radar$RadarTrackingPriority;->EFFICIENCY:Lio/radar/sdk/Radar$RadarTrackingPriority;

    invoke-virtual {v1}, Lio/radar/sdk/Radar$RadarTrackingPriority;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1

    return-void
.end method

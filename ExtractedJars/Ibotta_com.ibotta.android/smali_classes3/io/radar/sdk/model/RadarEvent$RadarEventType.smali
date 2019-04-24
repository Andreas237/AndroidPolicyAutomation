.class public final enum Lio/radar/sdk/model/RadarEvent$RadarEventType;
.super Ljava/lang/Enum;
.source "RadarEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RadarEventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/radar/sdk/model/RadarEvent$RadarEventType;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000e\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarEvent$RadarEventType;",
        "",
        "(Ljava/lang/String;I)V",
        "UNKNOWN",
        "USER_ENTERED_GEOFENCE",
        "USER_EXITED_GEOFENCE",
        "USER_ENTERED_HOME",
        "USER_EXITED_HOME",
        "USER_ENTERED_OFFICE",
        "USER_EXITED_OFFICE",
        "USER_STARTED_TRAVELING",
        "USER_STOPPED_TRAVELING",
        "USER_ENTERED_PLACE",
        "USER_EXITED_PLACE",
        "USER_NEARBY_PLACE_CHAIN",
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
.field private static final synthetic $VALUES:[Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum UNKNOWN:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_ENTERED_GEOFENCE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_ENTERED_HOME:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_ENTERED_OFFICE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_ENTERED_PLACE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_EXITED_GEOFENCE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_EXITED_HOME:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_EXITED_OFFICE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_EXITED_PLACE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_NEARBY_PLACE_CHAIN:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_STARTED_TRAVELING:Lio/radar/sdk/model/RadarEvent$RadarEventType;

.field public static final enum USER_STOPPED_TRAVELING:Lio/radar/sdk/model/RadarEvent$RadarEventType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xc

    new-array v0, v0, [Lio/radar/sdk/model/RadarEvent$RadarEventType;

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->UNKNOWN:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_ENTERED_GEOFENCE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_GEOFENCE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_EXITED_GEOFENCE"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_GEOFENCE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_ENTERED_HOME"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_HOME:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_EXITED_HOME"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_HOME:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_ENTERED_OFFICE"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_OFFICE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_EXITED_OFFICE"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_OFFICE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_STARTED_TRAVELING"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_STARTED_TRAVELING:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_STOPPED_TRAVELING"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_STOPPED_TRAVELING:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_ENTERED_PLACE"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_ENTERED_PLACE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_EXITED_PLACE"

    const/16 v3, 0xa

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_EXITED_PLACE:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    const-string v2, "USER_NEARBY_PLACE_CHAIN"

    const/16 v3, 0xb

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventType;->USER_NEARBY_PLACE_CHAIN:Lio/radar/sdk/model/RadarEvent$RadarEventType;

    aput-object v1, v0, v3

    sput-object v0, Lio/radar/sdk/model/RadarEvent$RadarEventType;->$VALUES:[Lio/radar/sdk/model/RadarEvent$RadarEventType;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 86
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/radar/sdk/model/RadarEvent$RadarEventType;
    .locals 1

    const-class v0, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/radar/sdk/model/RadarEvent$RadarEventType;

    return-object p0
.end method

.method public static values()[Lio/radar/sdk/model/RadarEvent$RadarEventType;
    .locals 1

    sget-object v0, Lio/radar/sdk/model/RadarEvent$RadarEventType;->$VALUES:[Lio/radar/sdk/model/RadarEvent$RadarEventType;

    invoke-virtual {v0}, [Lio/radar/sdk/model/RadarEvent$RadarEventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/radar/sdk/model/RadarEvent$RadarEventType;

    return-object v0
.end method

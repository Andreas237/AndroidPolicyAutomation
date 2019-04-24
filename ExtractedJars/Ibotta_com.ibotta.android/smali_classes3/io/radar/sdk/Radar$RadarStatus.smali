.class public final enum Lio/radar/sdk/Radar$RadarStatus;
.super Ljava/lang/Enum;
.source "Radar.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/Radar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RadarStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/radar/sdk/Radar$RadarStatus;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/radar/sdk/Radar$RadarStatus;",
        "",
        "(Ljava/lang/String;I)V",
        "SUCCESS",
        "ERROR_PUBLISHABLE_KEY",
        "ERROR_PERMISSIONS",
        "ERROR_LOCATION",
        "ERROR_NETWORK",
        "ERROR_UNAUTHORIZED",
        "ERROR_SERVER",
        "ERROR_RATE_LIMIT",
        "ERROR_UNKNOWN",
        "UNKNOWN",
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
.field private static final synthetic $VALUES:[Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum ERROR_NETWORK:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum ERROR_PERMISSIONS:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum ERROR_PUBLISHABLE_KEY:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum ERROR_RATE_LIMIT:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum ERROR_SERVER:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum ERROR_UNAUTHORIZED:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum ERROR_UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum SUCCESS:Lio/radar/sdk/Radar$RadarStatus;

.field public static final enum UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xa

    new-array v0, v0, [Lio/radar/sdk/Radar$RadarStatus;

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "SUCCESS"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->SUCCESS:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "ERROR_PUBLISHABLE_KEY"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PUBLISHABLE_KEY:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "ERROR_PERMISSIONS"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PERMISSIONS:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "ERROR_LOCATION"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "ERROR_NETWORK"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_NETWORK:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "ERROR_UNAUTHORIZED"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_UNAUTHORIZED:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "ERROR_SERVER"

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_SERVER:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "ERROR_RATE_LIMIT"

    const/4 v3, 0x7

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_RATE_LIMIT:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "ERROR_UNKNOWN"

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/Radar$RadarStatus;

    const-string v2, "UNKNOWN"

    const/16 v3, 0x9

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/Radar$RadarStatus;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/Radar$RadarStatus;->UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

    aput-object v1, v0, v3

    sput-object v0, Lio/radar/sdk/Radar$RadarStatus;->$VALUES:[Lio/radar/sdk/Radar$RadarStatus;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 63
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/radar/sdk/Radar$RadarStatus;
    .locals 1

    const-class v0, Lio/radar/sdk/Radar$RadarStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/radar/sdk/Radar$RadarStatus;

    return-object p0
.end method

.method public static values()[Lio/radar/sdk/Radar$RadarStatus;
    .locals 1

    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->$VALUES:[Lio/radar/sdk/Radar$RadarStatus;

    invoke-virtual {v0}, [Lio/radar/sdk/Radar$RadarStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/radar/sdk/Radar$RadarStatus;

    return-object v0
.end method

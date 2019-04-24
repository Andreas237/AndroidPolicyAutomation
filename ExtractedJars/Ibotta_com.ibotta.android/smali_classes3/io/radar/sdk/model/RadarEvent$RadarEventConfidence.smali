.class public final enum Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;
.super Ljava/lang/Enum;
.source "RadarEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/radar/sdk/model/RadarEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RadarEventConfidence"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;",
        "",
        "(Ljava/lang/String;I)V",
        "NONE",
        "LOW",
        "MEDIUM",
        "HIGH",
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
.field private static final synthetic $VALUES:[Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

.field public static final enum HIGH:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

.field public static final enum LOW:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

.field public static final enum MEDIUM:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

.field public static final enum NONE:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    const-string v2, "NONE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->NONE:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    const-string v2, "LOW"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->LOW:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    const-string v2, "MEDIUM"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->MEDIUM:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    aput-object v1, v0, v3

    new-instance v1, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    const-string v2, "HIGH"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->HIGH:Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    aput-object v1, v0, v3

    sput-object v0, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->$VALUES:[Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 116
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;
    .locals 1

    const-class v0, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    return-object p0
.end method

.method public static values()[Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;
    .locals 1

    sget-object v0, Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->$VALUES:[Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    invoke-virtual {v0}, [Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/radar/sdk/model/RadarEvent$RadarEventConfidence;

    return-object v0
.end method

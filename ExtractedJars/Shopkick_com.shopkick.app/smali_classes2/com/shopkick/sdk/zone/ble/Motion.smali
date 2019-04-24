.class public final enum Lcom/shopkick/sdk/zone/ble/Motion;
.super Ljava/lang/Enum;
.source "Motion.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/zone/ble/Motion;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/zone/ble/Motion;

.field public static final enum MovingAway:Lcom/shopkick/sdk/zone/ble/Motion;

.field public static final enum MovingToward:Lcom/shopkick/sdk/zone/ble/Motion;

.field public static final enum Stationary:Lcom/shopkick/sdk/zone/ble/Motion;

.field public static final enum Unknown:Lcom/shopkick/sdk/zone/ble/Motion;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 14
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Motion;

    const-string v1, "Unknown"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/zone/ble/Motion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Motion;->Unknown:Lcom/shopkick/sdk/zone/ble/Motion;

    .line 20
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Motion;

    const-string v1, "MovingAway"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/zone/ble/Motion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Motion;->MovingAway:Lcom/shopkick/sdk/zone/ble/Motion;

    .line 26
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Motion;

    const-string v1, "MovingToward"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/zone/ble/Motion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Motion;->MovingToward:Lcom/shopkick/sdk/zone/ble/Motion;

    .line 32
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Motion;

    const-string v1, "Stationary"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/sdk/zone/ble/Motion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Motion;->Stationary:Lcom/shopkick/sdk/zone/ble/Motion;

    const/4 v0, 0x4

    .line 7
    new-array v0, v0, [Lcom/shopkick/sdk/zone/ble/Motion;

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Motion;->Unknown:Lcom/shopkick/sdk/zone/ble/Motion;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Motion;->MovingAway:Lcom/shopkick/sdk/zone/ble/Motion;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Motion;->MovingToward:Lcom/shopkick/sdk/zone/ble/Motion;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Motion;->Stationary:Lcom/shopkick/sdk/zone/ble/Motion;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Motion;->$VALUES:[Lcom/shopkick/sdk/zone/ble/Motion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/zone/ble/Motion;
    .locals 1

    .line 7
    const-class v0, Lcom/shopkick/sdk/zone/ble/Motion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/zone/ble/Motion;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/zone/ble/Motion;
    .locals 1

    .line 7
    sget-object v0, Lcom/shopkick/sdk/zone/ble/Motion;->$VALUES:[Lcom/shopkick/sdk/zone/ble/Motion;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/zone/ble/Motion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/zone/ble/Motion;

    return-object v0
.end method

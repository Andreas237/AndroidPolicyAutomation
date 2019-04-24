.class final enum Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;
.super Ljava/lang/Enum;
.source "SensorBase.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/sensor/SensorBase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "SensorWrapperStatus"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

.field public static final enum CLOSED:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

.field public static final enum CLOSING:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

.field public static final enum OPEN:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

.field public static final enum OPENING:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 15
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    const-string v1, "OPENING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPENING:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    .line 17
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    const-string v1, "OPEN"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPEN:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    .line 19
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    const-string v1, "CLOSING"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->CLOSING:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    .line 21
    new-instance v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    const-string v1, "CLOSED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->CLOSED:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    const/4 v0, 0x4

    .line 13
    new-array v0, v0, [Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    sget-object v1, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPENING:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->OPEN:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->CLOSING:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->CLOSED:Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    aput-object v1, v0, v5

    sput-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->$VALUES:[Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;
    .locals 1

    .line 13
    const-class v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;
    .locals 1

    .line 13
    sget-object v0, Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->$VALUES:[Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/sensor/SensorBase$SensorWrapperStatus;

    return-object v0
.end method

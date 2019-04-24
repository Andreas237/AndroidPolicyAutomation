.class public final enum Lcom/shopkick/sdk/sensor/Status;
.super Ljava/lang/Enum;
.source "Status.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/sensor/Status;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/sensor/Status;

.field public static final enum BLE_SCAN_START:Lcom/shopkick/sdk/sensor/Status;

.field public static final enum BLE_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

.field public static final enum BLUETOOTH_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

.field public static final enum BLUETOOTH_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;

.field public static final enum WIFI_SCAN_START:Lcom/shopkick/sdk/sensor/Status;

.field public static final enum WIFI_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

.field public static final enum WIFI_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

.field public static final enum WIFI_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 12
    new-instance v0, Lcom/shopkick/sdk/sensor/Status;

    const-string v1, "BLE_SCAN_START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/shopkick/sdk/sensor/Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->BLE_SCAN_START:Lcom/shopkick/sdk/sensor/Status;

    .line 18
    new-instance v0, Lcom/shopkick/sdk/sensor/Status;

    const-string v1, "BLE_SCAN_STOP"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/shopkick/sdk/sensor/Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->BLE_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

    .line 26
    new-instance v0, Lcom/shopkick/sdk/sensor/Status;

    const-string v1, "BLUETOOTH_TURNED_ON"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/shopkick/sdk/sensor/Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->BLUETOOTH_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;

    .line 33
    new-instance v0, Lcom/shopkick/sdk/sensor/Status;

    const-string v1, "BLUETOOTH_TURNED_OFF"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/shopkick/sdk/sensor/Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->BLUETOOTH_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

    .line 39
    new-instance v0, Lcom/shopkick/sdk/sensor/Status;

    const-string v1, "WIFI_SCAN_START"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/shopkick/sdk/sensor/Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->WIFI_SCAN_START:Lcom/shopkick/sdk/sensor/Status;

    .line 45
    new-instance v0, Lcom/shopkick/sdk/sensor/Status;

    const-string v1, "WIFI_SCAN_STOP"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/shopkick/sdk/sensor/Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->WIFI_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

    .line 53
    new-instance v0, Lcom/shopkick/sdk/sensor/Status;

    const-string v1, "WIFI_TURNED_ON"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/shopkick/sdk/sensor/Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->WIFI_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;

    .line 60
    new-instance v0, Lcom/shopkick/sdk/sensor/Status;

    const-string v1, "WIFI_TURNED_OFF"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/shopkick/sdk/sensor/Status;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->WIFI_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

    const/16 v0, 0x8

    .line 6
    new-array v0, v0, [Lcom/shopkick/sdk/sensor/Status;

    sget-object v1, Lcom/shopkick/sdk/sensor/Status;->BLE_SCAN_START:Lcom/shopkick/sdk/sensor/Status;

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/sensor/Status;->BLE_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

    aput-object v1, v0, v3

    sget-object v1, Lcom/shopkick/sdk/sensor/Status;->BLUETOOTH_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;

    aput-object v1, v0, v4

    sget-object v1, Lcom/shopkick/sdk/sensor/Status;->BLUETOOTH_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

    aput-object v1, v0, v5

    sget-object v1, Lcom/shopkick/sdk/sensor/Status;->WIFI_SCAN_START:Lcom/shopkick/sdk/sensor/Status;

    aput-object v1, v0, v6

    sget-object v1, Lcom/shopkick/sdk/sensor/Status;->WIFI_SCAN_STOP:Lcom/shopkick/sdk/sensor/Status;

    aput-object v1, v0, v7

    sget-object v1, Lcom/shopkick/sdk/sensor/Status;->WIFI_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;

    aput-object v1, v0, v8

    sget-object v1, Lcom/shopkick/sdk/sensor/Status;->WIFI_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

    aput-object v1, v0, v9

    sput-object v0, Lcom/shopkick/sdk/sensor/Status;->$VALUES:[Lcom/shopkick/sdk/sensor/Status;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/sensor/Status;
    .locals 1

    .line 6
    const-class v0, Lcom/shopkick/sdk/sensor/Status;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/sensor/Status;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/sensor/Status;
    .locals 1

    .line 6
    sget-object v0, Lcom/shopkick/sdk/sensor/Status;->$VALUES:[Lcom/shopkick/sdk/sensor/Status;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/sensor/Status;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/sensor/Status;

    return-object v0
.end method

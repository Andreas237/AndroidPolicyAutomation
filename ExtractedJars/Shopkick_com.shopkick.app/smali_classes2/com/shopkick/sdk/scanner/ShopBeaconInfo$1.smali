.class synthetic Lcom/shopkick/sdk/scanner/ShopBeaconInfo$1;
.super Ljava/lang/Object;
.source "ShopBeaconInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/scanner/ShopBeaconInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$shopkick$sdk$zone$ble$Proximity:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 163
    invoke-static {}, Lcom/shopkick/sdk/zone/ble/Proximity;->values()[Lcom/shopkick/sdk/zone/ble/Proximity;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$1;->$SwitchMap$com$shopkick$sdk$zone$ble$Proximity:[I

    :try_start_0
    sget-object v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$1;->$SwitchMap$com$shopkick$sdk$zone$ble$Proximity:[I

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Unknown:Lcom/shopkick/sdk/zone/ble/Proximity;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ble/Proximity;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$1;->$SwitchMap$com$shopkick$sdk$zone$ble$Proximity:[I

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Expired:Lcom/shopkick/sdk/zone/ble/Proximity;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ble/Proximity;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/shopkick/sdk/scanner/ShopBeaconInfo$1;->$SwitchMap$com$shopkick$sdk$zone$ble$Proximity:[I

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Combined:Lcom/shopkick/sdk/zone/ble/Proximity;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/ble/Proximity;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method

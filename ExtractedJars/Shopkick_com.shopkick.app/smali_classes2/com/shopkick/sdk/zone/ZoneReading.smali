.class public interface abstract Lcom/shopkick/sdk/zone/ZoneReading;
.super Ljava/lang/Object;
.source "ZoneReading.java"


# static fields
.field public static final KEY_BLE_ADDRESS:Ljava/lang/String; = "ble-address"

.field public static final KEY_BLE_DATA:Ljava/lang/String; = "ble-data"

.field public static final KEY_BLE_ID:Ljava/lang/String; = "ble-id"

.field public static final KEY_BLE_PROXIMITY:Ljava/lang/String; = "ble-proximity"

.field public static final KEY_GEO_FENCE:Ljava/lang/String; = "geo-fence"

.field public static final TRIGGER_DWELL:I = 0x4

.field public static final TRIGGER_ENTER:I = 0x1

.field public static final TRIGGER_EXIT:I = 0x2


# virtual methods
.method public abstract getConfidence()I
.end method

.method public abstract getEnteredTimestamp()J
.end method

.method public abstract getProximity()I
.end method

.method public abstract getSensorData()Ljava/util/Map;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getZone()Lcom/shopkick/sdk/zone/Zone;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.class public interface abstract Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEVICE_UNKNOWN:I = 0x0

.field public static final STATUS_BT_ERROR:I = 0x9

.field public static final STATUS_CONNECTED:I = 0x2

.field public static final STATUS_CONNECTING:I = 0x1

.field public static final STATUS_CONNECT_FAILED:I = 0x5

.field public static final STATUS_DISCONNECTED:I = 0x3

.field public static final STATUS_DISCONNECTED_AFTER_TRANSFER:I = 0xc

.field public static final STATUS_DISCONNECTING:I = 0x4

.field public static final STATUS_DISCONNECT_FAILED:I = 0x6

.field public static final STATUS_MEASUREMENT_TIMEOUT:I = 0x7

.field public static final STATUS_PAIRING:I = 0xb

.field public static final STATUS_PAIRING_FAILED:I = 0xa

.field public static final STATUS_SERVICESDISCOVERED_FAILED:I = 0x8


# virtual methods
.method public abstract onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
.end method

.method public abstract onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
.end method

.method public abstract onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
.end method

.method public abstract onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
.end method

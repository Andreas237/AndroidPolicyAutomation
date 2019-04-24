.class public interface abstract Lcom/huawei/hihealth/device/open/IDeviceEventHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PAIRING_FAILED:I = 0x8

.field public static final PAIRING_PASSED:I = 0x7

.field public static final PAIRING_STATE_OK:I = 0xa

.field public static final SCAN_BT_DISABLED:I = 0x3

.field public static final SCAN_IS_BUSY:I = 0x2

.field public static final SCAN_TIMEOUT:I = 0x1

.field public static final SCAN_WIFI_DISABLED:I = 0x4


# virtual methods
.method public abstract onDeviceFound(Lcom/huawei/hihealth/device/open/HealthDevice;)V
.end method

.method public abstract onScanFailed(I)V
.end method

.method public abstract onStateChanged(I)V
.end method

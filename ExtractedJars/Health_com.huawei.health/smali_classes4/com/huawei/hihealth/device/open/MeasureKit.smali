.class public abstract Lcom/huawei/hihealth/device/open/MeasureKit;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBackgroundController()Lcom/huawei/hihealth/device/open/MeasureController;
    .locals 1

    .line 36
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDeviceProvider()Lcom/huawei/hihealth/device/open/DeviceProvider;
    .locals 1

    .line 43
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getHealthDataKind()Lcom/huawei/hihealth/device/open/HealthDevice$HEALTH_DEVICE_KIND;
.end method

.method public getMeasureController()Lcom/huawei/hihealth/device/open/MeasureController;
    .locals 1

    .line 28
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getUuid()Ljava/lang/String;
.end method

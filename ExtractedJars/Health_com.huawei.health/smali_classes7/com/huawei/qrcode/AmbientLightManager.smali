.class final Lcom/huawei/qrcode/AmbientLightManager;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/SensorEventListener;


# static fields
.field private static final BRIGHT_ENOUGH_LUX:F = 450.0f

.field private static final TOO_DARK_LUX:F = 45.0f


# instance fields
.field private cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

.field private final context:Landroid/content/Context;

.field private lightSensor:Landroid/hardware/Sensor;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/AmbientLightManager;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 3

    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v2, v0, v1

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    if-eqz v0, :cond_1

    const/high16 v0, 0x42340000    # 45.0f

    cmpg-float v0, v2, v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/camera/CameraManager;->setTorch(Z)V

    goto :goto_0

    :cond_0
    const/high16 v0, 0x43e10000    # 450.0f

    cmpl-float v0, v2, v0

    if-ltz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/camera/CameraManager;->setTorch(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method start(Lcom/huawei/qrcode/camera/CameraManager;)V
    .locals 4

    iput-object p1, p0, Lcom/huawei/qrcode/AmbientLightManager;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/qrcode/camera/FrontLightMode;->readPref(Landroid/content/SharedPreferences;)Lcom/huawei/qrcode/camera/FrontLightMode;

    move-result-object v0

    sget-object v1, Lcom/huawei/qrcode/camera/FrontLightMode;->AUTO:Lcom/huawei/qrcode/camera/FrontLightMode;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->context:Landroid/content/Context;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/hardware/SensorManager;

    const/4 v0, 0x5

    invoke-virtual {v3, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    const/4 v1, 0x3

    invoke-virtual {v3, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_0
    return-void
.end method

.method stop()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->context:Landroid/content/Context;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/hardware/SensorManager;

    invoke-virtual {v2, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/AmbientLightManager;->lightSensor:Landroid/hardware/Sensor;

    :cond_0
    return-void
.end method

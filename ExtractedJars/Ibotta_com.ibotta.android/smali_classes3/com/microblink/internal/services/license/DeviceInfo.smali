.class public Lcom/microblink/internal/services/license/DeviceInfo;
.super Ljava/lang/Object;


# instance fields
.field private androidRelease:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "androidRelease"
    .end annotation
.end field

.field private apiLevel:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "apiLevel"
    .end annotation
.end field

.field private autofocusSupported:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "autofocusSupported"
    .end annotation
.end field

.field private camera2NativelySupported:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "camera2NativelySupported"
    .end annotation
.end field

.field private cameraHasFlash:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cameraHasFlash"
    .end annotation
.end field

.field private chosenCameraStrategy:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "chosenCameraStrategy"
    .end annotation
.end field

.field private deviceModel:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deviceModel"
    .end annotation
.end field

.field private deviceName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deviceName"
    .end annotation
.end field

.field private manufacturer:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manufacturer"
    .end annotation
.end field

.field private maxCPUFrequency:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "maxCPUFrequency"
    .end annotation
.end field

.field private numberOfCores:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "numberOfCores"
    .end annotation
.end field

.field private preparedCameraParameters:Landroid/hardware/Camera$Parameters;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "preparedCameraParameters"
    .end annotation
.end field

.field private processorABI:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "processorABI"
    .end annotation
.end field

.field private processorCompatible:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "processorCompatible"
    .end annotation
.end field

.field private screenHeight:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "screenHeight"
    .end annotation
.end field

.field private screenWidth:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "screenWidth"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/microblink/camera/util/DeviceInformation;)V
    .locals 1
    .param p1    # Lcom/microblink/camera/util/DeviceInformation;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->camera2NativelySupported:Z

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->deviceModel:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getManufacturer()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->manufacturer:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getAndroidRelease()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->androidRelease:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getApiLevel()I

    move-result v0

    iput v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->apiLevel:I

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->isAutofocusSupported()Z

    move-result v0

    iput-boolean v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->autofocusSupported:Z

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->isCameraHasFlash()Z

    move-result v0

    iput-boolean v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->cameraHasFlash:Z

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getChosenCameraStrategy()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->chosenCameraStrategy:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getScreenHeight()I

    move-result v0

    iput v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->screenHeight:I

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getScreenWidth()I

    move-result v0

    iput v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->screenWidth:I

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->isCamera2NativelySupported()Z

    move-result v0

    iput-boolean v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->camera2NativelySupported:Z

    invoke-virtual {p1}, Lcom/microblink/camera/util/DeviceInformation;->getPreparedCameraParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->preparedCameraParameters:Landroid/hardware/Camera$Parameters;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_18

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_6

    :cond_1
    check-cast p1, Lcom/microblink/internal/services/license/DeviceInfo;

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->apiLevel:I

    iget v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->apiLevel:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->autofocusSupported:Z

    iget-boolean v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->autofocusSupported:Z

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->cameraHasFlash:Z

    iget-boolean v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->cameraHasFlash:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->screenWidth:I

    iget v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->screenWidth:I

    if-eq v2, v3, :cond_5

    return v1

    :cond_5
    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->screenHeight:I

    iget v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->screenHeight:I

    if-eq v2, v3, :cond_6

    return v1

    :cond_6
    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->camera2NativelySupported:Z

    iget-boolean v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->camera2NativelySupported:Z

    if-eq v2, v3, :cond_7

    return v1

    :cond_7
    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->numberOfCores:I

    iget v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->numberOfCores:I

    if-eq v2, v3, :cond_8

    return v1

    :cond_8
    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->maxCPUFrequency:I

    iget v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->maxCPUFrequency:I

    if-eq v2, v3, :cond_9

    return v1

    :cond_9
    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->processorCompatible:Z

    iget-boolean v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->processorCompatible:Z

    if-eq v2, v3, :cond_a

    return v1

    :cond_a
    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->deviceModel:Ljava/lang/String;

    if-eqz v2, :cond_b

    iget-object v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->deviceModel:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_0

    :cond_b
    iget-object v2, p1, Lcom/microblink/internal/services/license/DeviceInfo;->deviceModel:Ljava/lang/String;

    if-eqz v2, :cond_c

    :goto_0
    return v1

    :cond_c
    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->deviceName:Ljava/lang/String;

    if-eqz v2, :cond_d

    iget-object v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_1

    :cond_d
    iget-object v2, p1, Lcom/microblink/internal/services/license/DeviceInfo;->deviceName:Ljava/lang/String;

    if-eqz v2, :cond_e

    :goto_1
    return v1

    :cond_e
    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->manufacturer:Ljava/lang/String;

    if-eqz v2, :cond_f

    iget-object v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->manufacturer:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_2

    :cond_f
    iget-object v2, p1, Lcom/microblink/internal/services/license/DeviceInfo;->manufacturer:Ljava/lang/String;

    if-eqz v2, :cond_10

    :goto_2
    return v1

    :cond_10
    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->androidRelease:Ljava/lang/String;

    if-eqz v2, :cond_11

    iget-object v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->androidRelease:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_3

    :cond_11
    iget-object v2, p1, Lcom/microblink/internal/services/license/DeviceInfo;->androidRelease:Ljava/lang/String;

    if-eqz v2, :cond_12

    :goto_3
    return v1

    :cond_12
    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->chosenCameraStrategy:Ljava/lang/String;

    if-eqz v2, :cond_13

    iget-object v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->chosenCameraStrategy:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_4

    :cond_13
    iget-object v2, p1, Lcom/microblink/internal/services/license/DeviceInfo;->chosenCameraStrategy:Ljava/lang/String;

    if-eqz v2, :cond_14

    :goto_4
    return v1

    :cond_14
    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->processorABI:Ljava/lang/String;

    if-eqz v2, :cond_15

    iget-object v3, p1, Lcom/microblink/internal/services/license/DeviceInfo;->processorABI:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_5

    :cond_15
    iget-object v2, p1, Lcom/microblink/internal/services/license/DeviceInfo;->processorABI:Ljava/lang/String;

    if-eqz v2, :cond_16

    :goto_5
    return v1

    :cond_16
    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->preparedCameraParameters:Landroid/hardware/Camera$Parameters;

    if-eqz v2, :cond_17

    iget-object p1, p1, Lcom/microblink/internal/services/license/DeviceInfo;->preparedCameraParameters:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_17
    iget-object p1, p1, Lcom/microblink/internal/services/license/DeviceInfo;->preparedCameraParameters:Landroid/hardware/Camera$Parameters;

    if-nez p1, :cond_18

    return v0

    :cond_18
    :goto_6
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/microblink/internal/services/license/DeviceInfo;->deviceModel:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->deviceName:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->manufacturer:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->androidRelease:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->apiLevel:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->autofocusSupported:Z

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->cameraHasFlash:Z

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->chosenCameraStrategy:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->screenWidth:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->screenHeight:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->camera2NativelySupported:Z

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->processorABI:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->numberOfCores:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->maxCPUFrequency:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->processorCompatible:Z

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->preparedCameraParameters:Landroid/hardware/Camera$Parameters;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_6
    add-int/2addr v0, v1

    return v0
.end method

.method public maxCPUFrequency(I)Lcom/microblink/internal/services/license/DeviceInfo;
    .locals 0

    iput p1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->maxCPUFrequency:I

    return-object p0
.end method

.method public numberOfCores(I)Lcom/microblink/internal/services/license/DeviceInfo;
    .locals 0

    iput p1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->numberOfCores:I

    return-object p0
.end method

.method public processorABI(Ljava/lang/String;)Lcom/microblink/internal/services/license/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->processorABI:Ljava/lang/String;

    return-object p0
.end method

.method public processorCompatible(Z)Lcom/microblink/internal/services/license/DeviceInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->processorCompatible:Z

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DeviceInfo{deviceModel=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->deviceModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", deviceName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->deviceName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", manufacturer=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->manufacturer:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", androidRelease=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->androidRelease:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", apiLevel="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->apiLevel:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", autofocusSupported="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->autofocusSupported:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", cameraHasFlash="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->cameraHasFlash:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", chosenCameraStrategy=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->chosenCameraStrategy:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", screenWidth="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->screenWidth:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", screenHeight="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->screenHeight:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", camera2NativelySupported="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->camera2NativelySupported:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", processorABI=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/license/DeviceInfo;->processorABI:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", numberOfCores="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->numberOfCores:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxCPUFrequency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->maxCPUFrequency:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", processorCompatible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->processorCompatible:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", preparedCameraParameters="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/license/DeviceInfo;->preparedCameraParameters:Landroid/hardware/Camera$Parameters;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

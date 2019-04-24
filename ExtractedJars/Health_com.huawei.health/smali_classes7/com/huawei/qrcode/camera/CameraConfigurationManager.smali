.class final Lcom/huawei/qrcode/camera/CameraConfigurationManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/camera/CameraConfigurationManager$SizeComparator;
    }
.end annotation


# static fields
.field private static final MAX_PREVIEW_PIXELS:I = 0xfa000

.field private static final MIN_PREVIEW_PIXELS:I = 0x24b80

.field private static final TAG:Ljava/lang/String; = "CameraConfiguration"


# instance fields
.field private cameraPictureSize:Landroid/graphics/Point;

.field private cameraResolution:Landroid/graphics/Point;

.field private final context:Landroid/content/Context;

.field private screenResolution:Landroid/graphics/Point;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->context:Landroid/content/Context;

    return-void
.end method

.method private doSetTorch(Landroid/hardware/Camera$Parameters;ZZ)V
    .locals 5

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "torch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "on"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {p1, v4}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private findBestPreviewSizeValue(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 18

    if-nez p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_2

    const-string v0, "CameraConfiguration"

    const-string v1, "Device returned no supported preview sizes; using default"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v5, Landroid/graphics/Point;

    iget v0, v4, Landroid/hardware/Camera$Size;->width:I

    iget v1, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v5, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    return-object v5

    :cond_1
    const/4 v0, 0x0

    return-object v0

    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Lcom/huawei/qrcode/camera/CameraConfigurationManager$SizeComparator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager$SizeComparator;-><init>(Lcom/huawei/qrcode/camera/CameraConfigurationManager$1;)V

    invoke-static {v4, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v5, 0x0

    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/Point;->x:I

    int-to-float v0, v0

    move-object/from16 v1, p2

    iget v1, v1, Landroid/graphics/Point;->y:I

    int-to-float v1, v1

    div-float v6, v0, v1

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/hardware/Camera$Size;

    iget v10, v9, Landroid/hardware/Camera$Size;->width:I

    iget v11, v9, Landroid/hardware/Camera$Size;->height:I

    mul-int v12, v10, v11

    const v0, 0x24b80

    if-lt v12, v0, :cond_3

    const v0, 0xfa000

    if-le v12, v0, :cond_4

    goto :goto_0

    :cond_4
    if-ge v10, v11, :cond_5

    const/4 v13, 0x1

    goto :goto_1

    :cond_5
    const/4 v13, 0x0

    :goto_1
    if-eqz v13, :cond_6

    move v14, v11

    goto :goto_2

    :cond_6
    move v14, v10

    :goto_2
    if-eqz v13, :cond_7

    move v15, v10

    goto :goto_3

    :cond_7
    move v15, v11

    :goto_3
    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/Point;->x:I

    if-ne v14, v0, :cond_8

    move-object/from16 v0, p2

    iget v0, v0, Landroid/graphics/Point;->y:I

    if-ne v15, v0, :cond_8

    new-instance v0, Landroid/graphics/Point;

    move v1, v10

    move v2, v11

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    move-object/from16 v16, v0

    const-string v0, "CameraConfiguration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Found preview size exactly matching screen size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v16

    :cond_8
    int-to-float v0, v14

    int-to-float v1, v15

    div-float v16, v0, v1

    sub-float v0, v16, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v17

    cmpg-float v0, v17, v7

    if-gez v0, :cond_9

    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5, v10, v11}, Landroid/graphics/Point;-><init>(II)V

    move/from16 v7, v17

    :cond_9
    goto/16 :goto_0

    :cond_a
    if-nez v5, :cond_c

    invoke-virtual/range {p1 .. p1}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object v8

    if-eqz v8, :cond_b

    new-instance v5, Landroid/graphics/Point;

    iget v0, v8, Landroid/hardware/Camera$Size;->width:I

    iget v1, v8, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v5, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    :cond_b
    const-string v0, "CameraConfiguration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No suitable preview sizes, using default: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    const-string v0, "CameraConfiguration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Found best approximate preview size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v5
.end method

.method private static varargs findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Collection<Ljava/lang/String;>;[Ljava/lang/String;)Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "CameraConfiguration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Supported values: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    if-eqz p0, :cond_1

    move-object v4, p1

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-interface {p0, v7}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v3, v7

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const-string v0, "CameraConfiguration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Settable value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3
.end method

.method private findSuitablePictureSize(Landroid/hardware/Camera$Parameters;)Landroid/graphics/Point;
    .locals 5

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v2

    new-instance v0, Lcom/huawei/qrcode/camera/CameraConfigurationManager$SizeComparator;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager$SizeComparator;-><init>(Lcom/huawei/qrcode/camera/CameraConfigurationManager$1;)V

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/hardware/Camera$Size;

    new-instance v4, Landroid/graphics/Point;

    iget v0, v3, Landroid/hardware/Camera$Size;->width:I

    iget v1, v3, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v4, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    return-object v4

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private initializeTorch(Landroid/hardware/Camera$Parameters;Landroid/content/SharedPreferences;Z)V
    .locals 3

    invoke-static {p2}, Lcom/huawei/qrcode/camera/FrontLightMode;->readPref(Landroid/content/SharedPreferences;)Lcom/huawei/qrcode/camera/FrontLightMode;

    move-result-object v0

    sget-object v1, Lcom/huawei/qrcode/camera/FrontLightMode;->ON:Lcom/huawei/qrcode/camera/FrontLightMode;

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-direct {p0, p1, v2, p3}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->doSetTorch(Landroid/hardware/Camera$Parameters;ZZ)V

    return-void
.end method


# virtual methods
.method getCameraResolution()Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    return-object v0
.end method

.method getScreenResolution()Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    return-object v0
.end method

.method public getScreenSize()V
    .locals 7

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->context:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/WindowManager;

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/Display;->getWidth()I

    move-result v5

    invoke-virtual {v4}, Landroid/view/Display;->getHeight()I

    move-result v6

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, v5, v6}, Landroid/graphics/Point;-><init>(II)V

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    const-string v0, "CameraConfiguration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Screen resolution: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method getTorchState(Landroid/hardware/Camera;)Z
    .locals 3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v0, "on"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "torch"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method initFromCameraParameters(Landroid/hardware/Camera;)V
    .locals 5

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getScreenSize()V

    new-instance v4, Landroid/graphics/Point;

    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iput v0, v4, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    iput v0, v4, Landroid/graphics/Point;->y:I

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    iput v0, v4, Landroid/graphics/Point;->x:I

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->screenResolution:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iput v0, v4, Landroid/graphics/Point;->y:I

    :cond_0
    invoke-direct {p0, v3, v4}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->findBestPreviewSizeValue(Landroid/hardware/Camera$Parameters;Landroid/graphics/Point;)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    invoke-direct {p0, v3}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->findSuitablePictureSize(Landroid/hardware/Camera$Parameters;)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraPictureSize:Landroid/graphics/Point;

    const-string v0, "CameraConfiguration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Camera resolution: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method setDesiredCameraParameters(Landroid/hardware/Camera;Z)V
    .locals 8

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v4

    if-nez v4, :cond_0

    const-string v0, "CameraConfiguration"

    const-string v1, "Device error: no camera parameters are available. Proceeding without configuration."

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "CameraConfiguration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Initial camera parameters: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    const-string v0, "CameraConfiguration"

    const-string v1, "In camera config safe mode -- most settings will not be honored"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-direct {p0, v4, v5, p2}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->initializeTorch(Landroid/hardware/Camera$Parameters;Landroid/content/SharedPreferences;Z)V

    const/4 v6, 0x0

    const-string v0, "preferences_auto_focus"

    const/4 v1, 0x1

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p2, :cond_2

    const-string v0, "preferences_disable_continuous_focus"

    const/4 v1, 0x0

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "auto"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_3
    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "continuous-picture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "continuous-video"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "auto"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_4
    :goto_0
    if-nez p2, :cond_5

    if-nez v6, :cond_5

    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "macro"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "edof"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_5
    if-eqz v6, :cond_6

    invoke-virtual {v4, v6}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    :cond_6
    const-string v0, "preferences_invert_scan"

    const/4 v1, 0x0

    invoke-interface {v5, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->getSupportedColorEffects()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "negative"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->findSettableValue(Ljava/util/Collection;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_7

    invoke-virtual {v4, v7}, Landroid/hardware/Camera$Parameters;->setColorEffect(Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraResolution:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v4, v0, v1}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    :cond_8
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraPictureSize:Landroid/graphics/Point;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraPictureSize:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->cameraPictureSize:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v4, v0, v1}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    :cond_9
    const/16 v0, 0x5a

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    invoke-virtual {p1, v4}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    return-void
.end method

.method setTorch(Landroid/hardware/Camera;Z)V
    .locals 2

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v1

    const/4 v0, 0x0

    invoke-direct {p0, v1, p2, v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->doSetTorch(Landroid/hardware/Camera$Parameters;ZZ)V

    invoke-virtual {p1, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    return-void
.end method

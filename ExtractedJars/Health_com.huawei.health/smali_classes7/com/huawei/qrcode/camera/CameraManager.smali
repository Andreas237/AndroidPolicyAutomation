.class public final Lcom/huawei/qrcode/camera/CameraManager;
.super Ljava/lang/Object;


# static fields
.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String;

.field private static cameraManager:Lcom/huawei/qrcode/camera/CameraManager;


# instance fields
.field private autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

.field private camera:Landroid/hardware/Camera;

.field private final configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

.field private final context:Landroid/content/Context;

.field private framingRect:Landroid/graphics/Rect;

.field private framingRectInPreview:Landroid/graphics/Rect;

.field private initialized:Z

.field private isSupportFlash:Z

.field private final previewCallback:Lcom/huawei/qrcode/camera/PreviewCallback;

.field private previewing:Z

.field private requestedFramingRectHeight:I

.field private requestedFramingRectWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/qrcode/camera/CameraManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/qrcode/camera/CameraManager;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->isSupportFlash:Z

    iput-object p1, p0, Lcom/huawei/qrcode/camera/CameraManager;->context:Landroid/content/Context;

    new-instance v0, Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-direct {v0, p1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    new-instance v0, Lcom/huawei/qrcode/camera/PreviewCallback;

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-direct {v0, v1}, Lcom/huawei/qrcode/camera/PreviewCallback;-><init>(Lcom/huawei/qrcode/camera/CameraConfigurationManager;)V

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewCallback:Lcom/huawei/qrcode/camera/PreviewCallback;

    return-void
.end method

.method public static getDisplayMetrics(Landroid/content/Context;)I
    .locals 4

    const/16 v2, 0x12c

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v0, v3, Landroid/util/DisplayMetrics;->heightPixels:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    const-string v1, "getDisplayMetrics wrong:"

    invoke-static {v0, v1, v3}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return v2
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/camera/CameraManager;
    .locals 4

    sget-object v2, Lcom/huawei/qrcode/camera/CameraManager;->SYNC_LOCK:[B

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/qrcode/camera/CameraManager;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Lcom/huawei/qrcode/camera/CameraManager;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/camera/CameraManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/qrcode/camera/CameraManager;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;

    :cond_0
    sget-object v0, Lcom/huawei/qrcode/camera/CameraManager;->cameraManager:Lcom/huawei/qrcode/camera/CameraManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private isSupportFlash(Landroid/hardware/Camera;)Z
    .locals 4

    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    const-string v0, "CameraManager isSupportFlash parameters is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    const-string v0, "CameraManager isSupportFlash flashModes is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public buildLuminanceSource([BII)Lo/on;
    .locals 10

    invoke-virtual {p0}, Lcom/huawei/qrcode/camera/CameraManager;->getFramingRectInPreview()Landroid/graphics/Rect;

    move-result-object v9

    if-nez v9, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Lo/on;

    iget v4, v9, Landroid/graphics/Rect;->left:I

    iget v5, v9, Landroid/graphics/Rect;->top:I

    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    move-result v7

    move-object v1, p1

    move v2, p2

    move v3, p3

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lo/on;-><init>([BIIIIIIZ)V

    return-object v0
.end method

.method public closeDriver()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRect:Landroid/graphics/Rect;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    :cond_0
    return-void
.end method

.method public getFramingRect()Landroid/graphics/Rect;
    .locals 8

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRect:Landroid/graphics/Rect;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " getFramingRect camera is null."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getScreenResolution()Landroid/graphics/Point;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " getFramingRect screenResolution is null."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->context:Landroid/content/Context;

    const/high16 v1, 0x43480000    # 200.0f

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/Util;->dp2px(Landroid/content/Context;F)I

    move-result v4

    move v5, v4

    iget v0, v3, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, v4

    div-int/lit8 v6, v0, 0x2

    iget v0, v3, Landroid/graphics/Point;->y:I

    div-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraManager;->context:Landroid/content/Context;

    const/high16 v2, 0x41200000    # 10.0f

    invoke-static {v1, v2}, Lcom/huawei/qrcode/util/Util;->dp2px(Landroid/content/Context;F)I

    move-result v1

    add-int v7, v0, v1

    new-instance v0, Landroid/graphics/Rect;

    add-int v1, v6, v4

    add-int v2, v7, v5

    invoke-direct {v0, v6, v7, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRect:Landroid/graphics/Rect;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " getFramingRect Calculated framing rect: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRect:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getFramingRectInPreview()Landroid/graphics/Rect;
    .locals 7

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/huawei/qrcode/camera/CameraManager;->getFramingRect()Landroid/graphics/Rect;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4, v3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getCameraResolution()Landroid/graphics/Point;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getScreenResolution()Landroid/graphics/Point;

    move-result-object v6

    if-eqz v5, :cond_1

    if-nez v6, :cond_2

    :cond_1
    const/4 v0, 0x0

    return-object v0

    :cond_2
    iget v0, v4, Landroid/graphics/Rect;->left:I

    iget v1, v5, Landroid/graphics/Point;->y:I

    mul-int/2addr v0, v1

    iget v1, v6, Landroid/graphics/Point;->x:I

    div-int/2addr v0, v1

    iput v0, v4, Landroid/graphics/Rect;->left:I

    iget v0, v4, Landroid/graphics/Rect;->right:I

    iget v1, v5, Landroid/graphics/Point;->y:I

    mul-int/2addr v0, v1

    iget v1, v6, Landroid/graphics/Point;->x:I

    div-int/2addr v0, v1

    iput v0, v4, Landroid/graphics/Rect;->right:I

    iget v0, v4, Landroid/graphics/Rect;->top:I

    iget v1, v5, Landroid/graphics/Point;->x:I

    mul-int/2addr v0, v1

    iget v1, v6, Landroid/graphics/Point;->y:I

    div-int/2addr v0, v1

    iput v0, v4, Landroid/graphics/Rect;->top:I

    iget v0, v4, Landroid/graphics/Rect;->bottom:I

    iget v1, v5, Landroid/graphics/Point;->x:I

    mul-int/2addr v0, v1

    iget v1, v6, Landroid/graphics/Point;->y:I

    div-int/2addr v0, v1

    iput v0, v4, Landroid/graphics/Rect;->bottom:I

    iput-object v4, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    :cond_3
    sget-object v0, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calculated framingRectInPreview: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getVerticalFramingRectInPreview()Landroid/graphics/Rect;
    .locals 6

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/qrcode/camera/CameraManager;->getFramingRect()Landroid/graphics/Rect;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v2}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getCameraResolution()Landroid/graphics/Point;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getScreenResolution()Landroid/graphics/Point;

    move-result-object v5

    iget v0, v3, Landroid/graphics/Rect;->left:I

    iget v1, v4, Landroid/graphics/Point;->y:I

    mul-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Point;->x:I

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->left:I

    iget v0, v3, Landroid/graphics/Rect;->right:I

    iget v1, v4, Landroid/graphics/Point;->y:I

    mul-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Point;->x:I

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->right:I

    iget v0, v3, Landroid/graphics/Rect;->top:I

    iget v1, v4, Landroid/graphics/Point;->x:I

    mul-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Point;->y:I

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->top:I

    iget v0, v3, Landroid/graphics/Rect;->bottom:I

    iget v1, v4, Landroid/graphics/Point;->x:I

    mul-int/2addr v0, v1

    iget v1, v5, Landroid/graphics/Point;->y:I

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    iput-object v3, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    return-object v0
.end method

.method public isFlashOn()Z
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "CameraManager camera is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    const-string v0, "torch"

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isOpen()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isSupportFlash()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->isSupportFlash:Z

    return v0
.end method

.method public openDriver(Landroid/view/SurfaceHolder;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v3, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    if-nez v3, :cond_1

    new-instance v0, Lcom/huawei/qrcode/camera/open/OpenCameraManager;

    invoke-direct {v0}, Lcom/huawei/qrcode/camera/open/OpenCameraManager;-><init>()V

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/open/OpenCameraManager;->build()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/camera/open/OpenCameraInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/camera/open/OpenCameraInterface;->open()Landroid/hardware/Camera;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    :cond_0
    iput-object v3, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    :cond_1
    invoke-virtual {v3, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0, v3}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->initFromCameraParameters(Landroid/hardware/Camera;)V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/camera/CameraManager;->isSupportFlash(Landroid/hardware/Camera;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->isSupportFlash:Z

    invoke-virtual {v3}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v4

    if-nez v4, :cond_2

    const/4 v5, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Landroid/hardware/Camera$Parameters;->flatten()Ljava/lang/String;

    move-result-object v5

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->setDesiredCameraParameters(Landroid/hardware/Camera;Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v6

    sget-object v0, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    const-string v1, "Camera rejected parameters. Setting only minimal safe-mode parameters"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Resetting to saved camera params: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v5, :cond_3

    invoke-virtual {v3}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/hardware/Camera$Parameters;->unflatten(Ljava/lang/String;)V

    :try_start_1
    invoke-virtual {v3, v4}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->setDesiredCameraParameters(Landroid/hardware/Camera;Z)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v7

    sget-object v0, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    const-string v1, "Camera rejected even safe-mode parameters! No configuration"

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public refreshCameraParameters()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getScreenSize()V

    return-void
.end method

.method public requestPreviewFrame(Landroid/os/Handler;I)V
    .locals 2

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    if-eqz v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewing:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewCallback:Lcom/huawei/qrcode/camera/PreviewCallback;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/qrcode/camera/PreviewCallback;->setHandler(Landroid/os/Handler;I)V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewCallback:Lcom/huawei/qrcode/camera/PreviewCallback;

    invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setOneShotPreviewCallback(Landroid/hardware/Camera$PreviewCallback;)V

    :cond_0
    return-void
.end method

.method public setManualFramingRect(II)V
    .locals 6

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->initialized:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getScreenResolution()Landroid/graphics/Point;

    move-result-object v3

    iget v0, v3, Landroid/graphics/Point;->x:I

    if-le p1, v0, :cond_0

    iget p1, v3, Landroid/graphics/Point;->x:I

    :cond_0
    iget v0, v3, Landroid/graphics/Point;->y:I

    if-le p2, v0, :cond_1

    iget p2, v3, Landroid/graphics/Point;->y:I

    :cond_1
    iget v0, v3, Landroid/graphics/Point;->x:I

    sub-int/2addr v0, p1

    div-int/lit8 v4, v0, 0x2

    iget v0, v3, Landroid/graphics/Point;->y:I

    sub-int/2addr v0, p2

    div-int/lit8 v5, v0, 0x2

    new-instance v0, Landroid/graphics/Rect;

    add-int v1, v4, p1

    add-int v2, v5, p2

    invoke-direct {v0, v4, v5, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRect:Landroid/graphics/Rect;

    sget-object v0, Lcom/huawei/qrcode/camera/CameraManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Calculated manual framing rect: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRect:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->framingRectInPreview:Landroid/graphics/Rect;

    goto :goto_0

    :cond_2
    iput p1, p0, Lcom/huawei/qrcode/camera/CameraManager;->requestedFramingRectWidth:I

    iput p2, p0, Lcom/huawei/qrcode/camera/CameraManager;->requestedFramingRectHeight:I

    :goto_0
    return-void
.end method

.method public setTorch(Z)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->getTorchState(Landroid/hardware/Camera;)Z

    move-result v0

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/AutoFocusManager;->stop()V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->configManager:Lcom/huawei/qrcode/camera/CameraConfigurationManager;

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0, v1, p1}, Lcom/huawei/qrcode/camera/CameraConfigurationManager;->setTorch(Landroid/hardware/Camera;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/AutoFocusManager;->start()V

    goto :goto_0

    :cond_1
    const-string v0, "CameraManager setTorch configManager is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public startPreview()V
    .locals 4

    iget-object v3, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    if-eqz v3, :cond_0

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewing:Z

    if-nez v0, :cond_0

    invoke-virtual {v3}, Landroid/hardware/Camera;->startPreview()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewing:Z

    new-instance v0, Lcom/huawei/qrcode/camera/AutoFocusManager;

    iget-object v1, p0, Lcom/huawei/qrcode/camera/CameraManager;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    invoke-direct {v0, v1, v2}, Lcom/huawei/qrcode/camera/AutoFocusManager;-><init>(Landroid/content/Context;Landroid/hardware/Camera;)V

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

    :cond_0
    return-void
.end method

.method public stopPreview()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

    invoke-virtual {v0}, Lcom/huawei/qrcode/camera/AutoFocusManager;->stop()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->autoFocusManager:Lcom/huawei/qrcode/camera/AutoFocusManager;

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewing:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    iget-object v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewCallback:Lcom/huawei/qrcode/camera/PreviewCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/camera/PreviewCallback;->setHandler(Landroid/os/Handler;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/qrcode/camera/CameraManager;->previewing:Z

    :cond_1
    return-void
.end method

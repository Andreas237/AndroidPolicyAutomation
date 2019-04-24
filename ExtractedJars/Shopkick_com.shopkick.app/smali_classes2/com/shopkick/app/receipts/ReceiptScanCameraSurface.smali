.class public Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;
.super Landroid/view/SurfaceView;
.source "ReceiptScanCameraSurface.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "ReceiptScanCameraSurface"

.field private static final NoOpShutterCallback:Landroid/hardware/Camera$ShutterCallback;

.field private static final PREVIEW_ROTATION_DEGREES:I = 0x5a

.field private static final maxAutoFocusCount:I = 0x32


# instance fields
.field private autoFocusCallback:Landroid/hardware/Camera$AutoFocusCallback;

.field private autoFocusCount:I

.field private camera:Landroid/hardware/Camera;

.field cameraInfo:Landroid/hardware/Camera$CameraInfo;

.field private jpegCallback:Landroid/hardware/Camera$PictureCallback;

.field private requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

.field private shutterCallback:Landroid/hardware/Camera$ShutterCallback;

.field private final surfaceHolder:Landroid/view/SurfaceHolder;

.field private useNormalSize:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 386
    new-instance v0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$4;

    invoke-direct {v0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$4;-><init>()V

    sput-object v0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->NoOpShutterCallback:Landroid/hardware/Camera$ShutterCallback;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->useNormalSize:Z

    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->autoFocusCount:I

    .line 47
    new-instance p1, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;-><init>(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)V

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->autoFocusCallback:Landroid/hardware/Camera$AutoFocusCallback;

    .line 38
    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->surfaceHolder:Landroid/view/SurfaceHolder;

    .line 39
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->surfaceHolder:Landroid/view/SurfaceHolder;

    invoke-interface {p1, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 40
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->surfaceHolder:Landroid/view/SurfaceHolder;

    const/4 p2, 0x3

    invoke-interface {p1, p2}, Landroid/view/SurfaceHolder;->setType(I)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)I
    .locals 0

    .line 24
    iget p0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->autoFocusCount:I

    return p0
.end method

.method static synthetic access$002(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;I)I
    .locals 0

    .line 24
    iput p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->autoFocusCount:I

    return p1
.end method

.method static synthetic access$008(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)I
    .locals 2

    .line 24
    iget v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->autoFocusCount:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->autoFocusCount:I

    return v0
.end method

.method static synthetic access$100(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)Landroid/hardware/Camera$ShutterCallback;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->shutterCallback:Landroid/hardware/Camera$ShutterCallback;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)Landroid/hardware/Camera$PictureCallback;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->jpegCallback:Landroid/hardware/Camera$PictureCallback;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)Landroid/hardware/Camera;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    return-object p0
.end method

.method static synthetic access$400()Ljava/lang/String;
    .locals 1

    .line 24
    sget-object v0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$500(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->showCameraError()V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->tryToAutoFocus()V

    return-void
.end method

.method private adjustPreviewSurfaceSize(IIII)V
    .locals 4

    if-ge p4, p3, :cond_0

    move v3, p4

    move p4, p3

    move p3, v3

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p2

    div-float v0, p1, p2

    int-to-float p3, p3

    int-to-float p4, p4

    div-float v1, p3, p4

    cmpl-float v2, v0, v1

    if-eqz v2, :cond_2

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    div-float/2addr p1, p3

    div-float/2addr p2, p4

    .line 412
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    goto :goto_0

    :cond_1
    div-float/2addr p1, p3

    div-float/2addr p2, p4

    .line 414
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    :goto_0
    mul-float/2addr p3, p1

    float-to-int p2, p3

    mul-float/2addr p4, p1

    float-to-int p1, p4

    .line 421
    new-instance p3, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p3, p2, p1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 p1, 0xd

    const/4 p2, -0x1

    .line 422
    invoke-virtual {p3, p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 423
    invoke-virtual {p0, p3}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    return-void
.end method

.method private getBestPreviewSize(IILandroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;
    .locals 5

    .line 199
    invoke-virtual {p3}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    move v0, p2

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/Camera$Size;

    if-nez p3, :cond_1

    .line 203
    iget p3, v1, Landroid/hardware/Camera$Size;->width:I

    iget v0, v1, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr p3, v0

    move v0, p3

    move-object p3, v1

    goto :goto_0

    .line 205
    :cond_1
    iget v2, v1, Landroid/hardware/Camera$Size;->width:I

    iget v3, v1, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr v2, v3

    if-le v2, v0, :cond_0

    .line 208
    iget p3, v1, Landroid/hardware/Camera$Size;->width:I

    iget v0, v1, Landroid/hardware/Camera$Size;->height:I

    mul-int/2addr p3, v0

    move v0, p3

    move-object p3, v1

    goto :goto_0

    .line 212
    :cond_2
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    sget-object v0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "SIZES: Selected preview size [%1$dx%2$d]"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p3, Landroid/hardware/Camera$Size;->width:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, p2

    const/4 p2, 0x1

    iget v4, p3, Landroid/hardware/Camera$Size;->height:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, p2

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    return-object p3
.end method

.method private openCamera()V
    .locals 5

    .line 230
    :try_start_0
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->cameraInfo:Landroid/hardware/Camera$CameraInfo;

    const/4 v0, 0x0

    .line 231
    :goto_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 232
    invoke-static {v0}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v1

    iput-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    .line 233
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    new-instance v2, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$3;

    invoke-direct {v2, p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$3;-><init>(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)V

    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setErrorCallback(Landroid/hardware/Camera$ErrorCallback;)V

    .line 242
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    if-eqz v1, :cond_0

    .line 243
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->cameraInfo:Landroid/hardware/Camera$CameraInfo;

    invoke-static {v0, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 244
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->cameraInfo:Landroid/hardware/Camera$CameraInfo;

    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 252
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    const/16 v1, 0x5a

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setDisplayOrientation(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 255
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v1

    sget-object v2, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Camera.startPreview() failed."

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    if-eqz v1, :cond_2

    .line 257
    :try_start_1
    invoke-virtual {v1}, Landroid/hardware/Camera;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 258
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v2

    sget-object v3, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v4, "Couldn\'t release camera."

    invoke-virtual {v2, v3, v4}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    invoke-static {v1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 262
    :cond_2
    :goto_2
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method private showCameraError()V
    .locals 3

    .line 161
    new-instance v0, Landroid/support/v7/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f110155

    .line 162
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setTitle(I)Landroid/support/v7/app/AlertDialog$Builder;

    const v1, 0x7f110529

    .line 163
    invoke-virtual {v0, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(I)Landroid/support/v7/app/AlertDialog$Builder;

    .line 164
    new-instance v1, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$2;-><init>(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)V

    const v2, 0x7f11014f

    invoke-virtual {v0, v2, v1}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 172
    invoke-virtual {v0}, Landroid/support/v7/app/AlertDialog$Builder;->show()Landroid/support/v7/app/AlertDialog;

    return-void
.end method

.method private tryToAutoFocus()V
    .locals 4

    .line 143
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->autoFocusCallback:Landroid/hardware/Camera$AutoFocusCallback;

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 147
    sget-object v1, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v2, "autoFocus() failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 148
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Camera.autoFocus() failed."

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :try_start_1
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->shutterCallback:Landroid/hardware/Camera$ShutterCallback;

    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->jpegCallback:Landroid/hardware/Camera$PictureCallback;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v3, v2}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 153
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->showCameraError()V

    .line 154
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v1

    sget-object v2, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Camera.takePicture failed."

    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected restartPreview()V
    .locals 3

    .line 178
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 181
    sget-object v1, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string/jumbo v2, "startPreview() failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 182
    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method protected setRequestedImageSize(Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 78
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    .line 79
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    .line 81
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    .line 84
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    return-void

    .line 82
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'requestedImageSize\' must have valid image dimensions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 76
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'requestedImageSize\' can not be NULL"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setUseNormalSize(Z)V
    .locals 3

    .line 88
    iput-boolean p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->useNormalSize:Z

    .line 89
    sget-object v0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "called normalsize set with = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 7

    .line 271
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->surfaceHolder:Landroid/view/SurfaceHolder;

    if-eqz p2, :cond_d

    invoke-interface {p2}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p2

    if-nez p2, :cond_0

    goto/16 :goto_6

    .line 275
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    if-nez p2, :cond_1

    .line 276
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->openCamera()V

    .line 279
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    if-nez p2, :cond_2

    return-void

    .line 286
    :cond_2
    :try_start_0
    invoke-virtual {p2}, Landroid/hardware/Camera;->stopPreview()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    :catch_0
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    .line 292
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v0

    .line 293
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/hardware/Camera$Size;

    if-nez v2, :cond_4

    move-object v2, v3

    .line 299
    :cond_4
    iget v4, v3, Landroid/hardware/Camera$Size;->width:I

    iget-object v5, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gt v4, v5, :cond_3

    iget v4, v3, Landroid/hardware/Camera$Size;->height:I

    iget-object v5, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gt v4, v5, :cond_3

    .line 300
    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    iget-object v5, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->width:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gt v4, v5, :cond_6

    iget v4, v2, Landroid/hardware/Camera$Size;->height:I

    iget-object v5, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->requestedImageSize:Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;

    iget-object v5, v5, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;->height:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v4, v5, :cond_5

    goto :goto_1

    .line 304
    :cond_5
    iget v4, v2, Landroid/hardware/Camera$Size;->width:I

    iget v5, v3, Landroid/hardware/Camera$Size;->width:I

    if-gt v4, v5, :cond_3

    iget v4, v2, Landroid/hardware/Camera$Size;->height:I

    iget v5, v3, Landroid/hardware/Camera$Size;->height:I

    if-gt v4, v5, :cond_3

    :cond_6
    :goto_1
    move-object v2, v3

    goto :goto_0

    .line 311
    :cond_7
    iget v0, v2, Landroid/hardware/Camera$Size;->width:I

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {p2, v0, v2}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->cameraInfo:Landroid/hardware/Camera$CameraInfo;

    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->orientation:I

    invoke-virtual {p2, v0}, Landroid/hardware/Camera$Parameters;->setRotation(I)V

    .line 319
    invoke-direct {p0, p3, p4, p2}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->getBestPreviewSize(IILandroid/hardware/Camera$Parameters;)Landroid/hardware/Camera$Size;

    move-result-object v0

    .line 320
    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    iget v3, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {p2, v2, v3}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 321
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPictureFormat()I

    move-result v2

    .line 322
    iget-boolean v3, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->useNormalSize:Z

    const/16 v4, 0x29

    const/4 v5, 0x4

    if-nez v3, :cond_9

    .line 323
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getSupportedPictureFormats()Ljava/util/List;

    move-result-object v3

    .line 324
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    move v2, v5

    goto :goto_2

    .line 326
    :cond_8
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    move v2, v4

    .line 331
    :cond_9
    :goto_2
    invoke-virtual {p2, v2}, Landroid/hardware/Camera$Parameters;->setPictureFormat(I)V

    .line 335
    iget v2, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {p0, p3, p4, v2, v0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->adjustPreviewSurfaceSize(IIII)V

    .line 338
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object p3

    const-string p4, "continuous-picture"

    .line 339
    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_a

    const-string p3, "continuous-picture"

    .line 340
    invoke-virtual {p2, p3}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    const-string p4, "auto"

    .line 341
    invoke-interface {p3, p4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_b

    const-string p3, "auto"

    .line 342
    invoke-virtual {p2, p3}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 347
    :cond_b
    :goto_3
    :try_start_1
    iget-object p3, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {p3, p2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 348
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {p2, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V

    .line 349
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    move-exception p1

    .line 352
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    if-eqz p2, :cond_c

    .line 354
    :try_start_2
    invoke-virtual {p2}, Landroid/hardware/Camera;->stopPreview()V

    .line 355
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {p2}, Landroid/hardware/Camera;->release()V

    .line 356
    iput-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    move-exception p2

    .line 358
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p3

    sget-object p4, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v0, "Camera.startPreview() failed."

    invoke-virtual {p3, p4, v0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    invoke-static {p2}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 362
    :cond_c
    :goto_4
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p2

    sget-object p3, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string p4, "Camera.startPreview() failed."

    invoke-virtual {p2, p3, p4}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    :goto_5
    return-void

    :cond_d
    :goto_6
    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0

    .line 220
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->openCamera()V

    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 370
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    if-eqz p1, :cond_0

    .line 372
    :try_start_0
    invoke-virtual {p1}, Landroid/hardware/Camera;->stopPreview()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->release()V

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    throw p1

    :cond_0
    :goto_0
    return-void
.end method

.method protected takePhoto(Landroid/hardware/Camera$PictureCallback;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 2

    .line 97
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->jpegCallback:Landroid/hardware/Camera$PictureCallback;

    .line 100
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    if-nez p1, :cond_0

    .line 101
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->openCamera()V

    .line 104
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    if-nez p1, :cond_1

    .line 105
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    sget-object v0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v1, "StartPreview failed. This is a problem."

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    sget-object v0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v1, "StartPreview failed pre picture capture. This could cause an app crash."

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    :cond_1
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 121
    :catch_0
    sget-object p1, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v0, "StartPreview failed. This is a problem."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    sget-object v0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v1, "StartPreview failed pre picture capture. This could cause an app crash."

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->camera:Landroid/hardware/Camera;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->isSoundEnabled()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->enableShutterSound(Z)Z

    .line 131
    invoke-virtual {p2}, Lcom/shopkick/app/application/AppPreferences;->isSoundEnabled()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 132
    sget-object p1, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->NoOpShutterCallback:Landroid/hardware/Camera$ShutterCallback;

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->shutterCallback:Landroid/hardware/Camera$ShutterCallback;

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 134
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->shutterCallback:Landroid/hardware/Camera$ShutterCallback;

    .line 137
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->tryToAutoFocus()V

    return-void

    .line 115
    :catch_1
    sget-object p1, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string p2, "Runtime Exception thrown. Odds are that the camera has closed."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    sget-object p2, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->LOG_TAG:Ljava/lang/String;

    const-string v0, "The user appears to have closed the camera but we were able to get to this point anyway."

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    invoke-direct {p0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->showCameraError()V

    return-void
.end method

.class public abstract Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;
.super Ljava/lang/Object;
.source "AbstractScanningController.java"

# interfaces
.implements Lcom/craftar/CraftARSearchResponseHandler;


# static fields
.field public static final EVENT_SCAN_IR_SUCCESS:Ljava/lang/String; = "Event2DIRScanSuccess"

.field public static final SCANNING_HOT_SPOT_X:F = 0.5f

.field public static final SCANNING_HOT_SPOT_Y:F = 0.5f

.field public static final VIEW_FINDER_HEIGHT:F = 0.43f

.field public static final VIEW_FINDER_WIDTH:F = 0.93f

.field public static sessionScanCount:I


# instance fields
.field private final IR_PROCESS_INTERVAL_MS:I

.field private final IR_TIMEOUT_MS:I

.field protected allocationIn:Landroid/renderscript/Allocation;

.field protected allocationOut:Landroid/renderscript/Allocation;

.field protected bcLastFrameTime:J

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field protected context:Landroid/content/Context;

.field protected deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field protected dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field protected eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field protected irIsEnabled:Z

.field protected irIsRecognizing:Z

.field protected irLastFrameTime:J

.field protected isTimeoutDialogShowing:Z

.field protected lastUpdatedFrame:[B

.field protected lastUpdatedFrameHeight:I

.field protected lastUpdatedFrameWidth:I

.field protected mainHandler:Landroid/os/Handler;

.field protected onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

.field protected parentView:Landroid/view/ViewGroup;

.field protected renderScript:Landroid/renderscript/RenderScript;

.field protected scanBCListener:Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;

.field protected scanIRListener:Lcom/shopkick/app/products/scanning/interfaces/ScanIRListener;

.field protected scanInitListener:Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;

.field protected scanningHotSpotX:F

.field protected scanningHotSpotY:F

.field protected tempBitmap:Landroid/graphics/Bitmap;

.field protected yuvToRgbIntrinsic:Landroid/renderscript/ScriptIntrinsicYuvToRGB;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/DeviceInfo;)V
    .locals 3

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x64

    .line 54
    iput v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->IR_PROCESS_INTERVAL_MS:I

    const/16 v0, 0x4e20

    .line 55
    iput v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->IR_TIMEOUT_MS:I

    const/high16 v0, 0x3f000000    # 0.5f

    .line 82
    iput v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->scanningHotSpotX:F

    .line 83
    iput v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->scanningHotSpotY:F

    const/4 v0, 0x1

    .line 94
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsEnabled:Z

    const/4 v0, 0x0

    .line 95
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsRecognizing:Z

    const-wide/high16 v0, -0x8000000000000000L

    .line 96
    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->bcLastFrameTime:J

    const-wide/16 v0, -0x1

    .line 103
    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    const-string v2, "clientFlagsManager cannot be null"

    .line 111
    invoke-static {p2, v2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "eventLogger cannot be null"

    .line 112
    invoke-static {p4, v2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "deviceInfo cannot be null"

    .line 113
    invoke-static {p5, v2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->context:Landroid/content/Context;

    .line 116
    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 117
    iput-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 118
    iput-object p5, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 119
    iput-object p4, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 121
    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    .line 123
    iget-object p1, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageRecognitionScans:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->enableIR(Z)V

    return-void
.end method

.method private destroyIR()V
    .locals 2

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 199
    invoke-virtual {v0, v1}, Lcom/craftar/CraftAROnDeviceIR;->setCraftARSearchResponseHandler(Lcom/craftar/CraftARSearchResponseHandler;)V

    .line 200
    iput-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    .line 203
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationIn:Landroid/renderscript/Allocation;

    if-eqz v0, :cond_1

    .line 204
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->destroy()V

    .line 207
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationOut:Landroid/renderscript/Allocation;

    if-eqz v0, :cond_2

    .line 208
    invoke-virtual {v0}, Landroid/renderscript/Allocation;->destroy()V

    .line 211
    :cond_2
    iput-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->tempBitmap:Landroid/graphics/Bitmap;

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->renderScript:Landroid/renderscript/RenderScript;

    if-eqz v0, :cond_3

    .line 214
    invoke-virtual {v0}, Landroid/renderscript/RenderScript;->destroy()V

    .line 217
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->yuvToRgbIntrinsic:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    if-eqz v0, :cond_4

    .line 218
    invoke-virtual {v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->destroy()V

    .line 221
    :cond_4
    iput-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->lastUpdatedFrame:[B

    return-void
.end method

.method public static synthetic lambda$null$195(Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;)V
    .locals 2

    .line 315
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->parentView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->parentView:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    .line 319
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 320
    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->onBackPressed()V

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic lambda$processFrameIR$193(Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;Ljava/lang/ref/WeakReference;)V
    .locals 2

    .line 300
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->stopIRScanning()V

    const-wide/16 v0, 0x0

    .line 301
    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    .line 302
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$processFrameIR$194(Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;Ljava/lang/ref/WeakReference;)V
    .locals 2

    const-wide/16 v0, -0x2

    .line 306
    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    .line 307
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    return-void
.end method

.method public static synthetic lambda$processFrameIR$196(Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;)V
    .locals 4

    .line 312
    iget-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 313
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->mainHandler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/products/scanning/controllers/-$$Lambda$AbstractScanningController$Tf4wcljNg3RATOO3UM2p0Bdsaac;

    invoke-direct {v1, p0}, Lcom/shopkick/app/products/scanning/controllers/-$$Lambda$AbstractScanningController$Tf4wcljNg3RATOO3UM2p0Bdsaac;-><init>(Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 324
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->resumeIRScanning()V

    :goto_0
    return-void
.end method


# virtual methods
.method public areWeDoingIR()Z
    .locals 1

    .line 257
    iget-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsEnabled:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsRecognizing:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public enableIR(Z)V
    .locals 0

    .line 265
    iput-boolean p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsEnabled:Z

    return-void
.end method

.method protected getCameraInfo()Landroid/hardware/Camera$CameraInfo;
    .locals 4

    .line 232
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 234
    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 235
    invoke-static {v1, v2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 236
    iget v3, v2, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-nez v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getTimeOfLastFrame()J
    .locals 2

    .line 269
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->areWeDoingIR()Z

    move-result v0

    if-nez v0, :cond_0

    .line 270
    iget-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->bcLastFrameTime:J

    return-wide v0

    .line 272
    :cond_0
    iget-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    return-wide v0
.end method

.method public initAndStartScanning(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 0
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 177
    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->parentView:Landroid/view/ViewGroup;

    .line 178
    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->mainHandler:Landroid/os/Handler;

    .line 181
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->context:Landroid/content/Context;

    .line 182
    invoke-static {}, Lcom/craftar/CraftAROnDeviceIR;->Instance()Lcom/craftar/CraftAROnDeviceIR;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    .line 185
    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->renderScript:Landroid/renderscript/RenderScript;

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->renderScript:Landroid/renderscript/RenderScript;

    invoke-static {p1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->yuvToRgbIntrinsic:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    return-void
.end method

.method public isIREnabled()Z
    .locals 1

    .line 261
    iget-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsEnabled:Z

    return v0
.end method

.method protected logScanImageProcessingError(I)V
    .locals 2

    .line 244
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 245
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDeviceModel(Ljava/lang/String;)V

    .line 246
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanImageFailureType(Ljava/lang/Integer;)V

    .line 247
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method protected logTorchButtonTapped()V
    .locals 3

    .line 252
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x16a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 253
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->mainHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 192
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 194
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->destroyIR()V

    return-void
.end method

.method public abstract pauseBCScanning()V
.end method

.method public pauseIRScanning()V
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 151
    invoke-virtual {v0, v1}, Lcom/craftar/CraftAROnDeviceIR;->setCraftARSearchResponseHandler(Lcom/craftar/CraftARSearchResponseHandler;)V

    :cond_0
    const/4 v0, 0x0

    .line 153
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsRecognizing:Z

    return-void
.end method

.method public processFrameIR([BII)V
    .locals 9

    .line 279
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->areWeDoingIR()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 284
    :cond_0
    iget-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 285
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    .line 289
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x4e20

    cmp-long v0, v0, v4

    if-ltz v0, :cond_3

    .line 292
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->pauseIRScanning()V

    const-wide/16 p1, -0x2

    .line 293
    iput-wide p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    .line 294
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 295
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x1

    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->context:Landroid/content/Context;

    const p2, 0x7f11061d

    .line 296
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->context:Landroid/content/Context;

    const p2, 0x7f11061c

    .line 297
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->context:Landroid/content/Context;

    const p2, 0x7f110627

    .line 298
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/products/scanning/controllers/-$$Lambda$AbstractScanningController$AGgdoB--aOK4IpvEk8kv76icIRg;

    invoke-direct {v5, p0}, Lcom/shopkick/app/products/scanning/controllers/-$$Lambda$AbstractScanningController$AGgdoB--aOK4IpvEk8kv76icIRg;-><init>(Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;)V

    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->context:Landroid/content/Context;

    const p2, 0x7f110157

    .line 304
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/shopkick/app/products/scanning/controllers/-$$Lambda$AbstractScanningController$3nPKl15Pp2pEtyyLbtwmI06d-J0;

    invoke-direct {v7, p0}, Lcom/shopkick/app/products/scanning/controllers/-$$Lambda$AbstractScanningController$3nPKl15Pp2pEtyyLbtwmI06d-J0;-><init>(Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;)V

    new-instance v8, Lcom/shopkick/app/products/scanning/controllers/-$$Lambda$AbstractScanningController$WRGDsZqSnmgtXd8LoYA5nPBqfkM;

    invoke-direct {v8, p0}, Lcom/shopkick/app/products/scanning/controllers/-$$Lambda$AbstractScanningController$WRGDsZqSnmgtXd8LoYA5nPBqfkM;-><init>(Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;)V

    .line 295
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_2
    return-void

    .line 333
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 334
    iget-wide v4, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    cmp-long v2, v4, v2

    if-lez v2, :cond_4

    sub-long v2, v0, v4

    const-wide/16 v4, 0x64

    cmp-long v2, v2, v4

    if-gez v2, :cond_4

    return-void

    .line 339
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationIn:Landroid/renderscript/Allocation;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationOut:Landroid/renderscript/Allocation;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->tempBitmap:Landroid/graphics/Bitmap;

    if-nez v2, :cond_6

    :cond_5
    mul-int v2, p2, p3

    mul-int/lit8 v2, v2, 0x3

    .line 341
    div-int/lit8 v2, v2, 0x2

    .line 342
    iget-object v3, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->renderScript:Landroid/renderscript/RenderScript;

    invoke-static {v3}, Landroid/renderscript/Element;->U8(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v4

    invoke-static {v3, v4, v2}, Landroid/renderscript/Allocation;->createSized(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;I)Landroid/renderscript/Allocation;

    move-result-object v2

    iput-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationIn:Landroid/renderscript/Allocation;

    .line 343
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, p3, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->tempBitmap:Landroid/graphics/Bitmap;

    .line 346
    iget-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->renderScript:Landroid/renderscript/RenderScript;

    iget-object v3, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->tempBitmap:Landroid/graphics/Bitmap;

    invoke-static {v2, v3}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    move-result-object v2

    iput-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationOut:Landroid/renderscript/Allocation;

    .line 349
    iget-object v2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->yuvToRgbIntrinsic:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    iget-object v3, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationIn:Landroid/renderscript/Allocation;

    invoke-virtual {v2, v3}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->setInput(Landroid/renderscript/Allocation;)V

    .line 352
    :cond_6
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->lastUpdatedFrame:[B

    .line 353
    iput p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->lastUpdatedFrameWidth:I

    .line 354
    iput p3, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->lastUpdatedFrameHeight:I

    .line 355
    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irLastFrameTime:J

    .line 358
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationIn:Landroid/renderscript/Allocation;

    invoke-virtual {p2, p1}, Landroid/renderscript/Allocation;->copyFrom([B)V

    .line 359
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->yuvToRgbIntrinsic:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    iget-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationOut:Landroid/renderscript/Allocation;

    invoke-virtual {p1, p2}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->forEach(Landroid/renderscript/Allocation;)V

    .line 360
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->allocationOut:Landroid/renderscript/Allocation;

    iget-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->tempBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1, p2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    new-instance p2, Lcom/craftar/CraftARQueryImage;

    iget-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->tempBitmap:Landroid/graphics/Bitmap;

    invoke-direct {p2, p3}, Lcom/craftar/CraftARQueryImage;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, p2}, Lcom/craftar/CraftAROnDeviceIR;->search(Lcom/craftar/CraftARQueryImage;)V

    return-void
.end method

.method public abstract resumeBCScanning()V
.end method

.method public resumeIRScanning()V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    if-eqz v0, :cond_0

    .line 144
    invoke-virtual {v0, p0}, Lcom/craftar/CraftAROnDeviceIR;->setCraftARSearchResponseHandler(Lcom/craftar/CraftARSearchResponseHandler;)V

    :cond_0
    const/4 v0, 0x1

    .line 146
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsRecognizing:Z

    return-void
.end method

.method public searchFailed(Lcom/craftar/CraftARError;I)V
    .locals 0

    return-void
.end method

.method public searchResults(Ljava/util/ArrayList;JI)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/craftar/CraftARResult;",
            ">;JI)V"
        }
    .end annotation

    .line 368
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->lastUpdatedFrame:[B

    const/4 p3, 0x0

    .line 369
    iput-object p3, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->lastUpdatedFrame:[B

    .line 371
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->areWeDoingIR()Z

    move-result p3

    if-eqz p3, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_2

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    .line 372
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/craftar/CraftARResult;

    .line 373
    invoke-virtual {p4}, Lcom/craftar/CraftARResult;->getScore()I

    move-result p4

    const/16 v0, 0x1e

    if-ge p4, v0, :cond_0

    return-void

    .line 376
    :cond_0
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/craftar/CraftARResult;

    invoke-virtual {p1}, Lcom/craftar/CraftARResult;->getItem()Lcom/craftar/CraftARItem;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 380
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->context:Landroid/content/Context;

    const-string/jumbo p3, "vibrator"

    invoke-virtual {p1, p3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Vibrator;

    if-eqz p1, :cond_1

    const-wide/16 v0, 0x12c

    .line 382
    invoke-virtual {p1, v0, v1}, Landroid/os/Vibrator;->vibrate(J)V

    .line 385
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->stopIRScanning()V

    .line 388
    iget p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->lastUpdatedFrameWidth:I

    iget p3, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->lastUpdatedFrameHeight:I

    invoke-static {p2, p1, p3}, Lcom/shopkick/app/util/TileUtils;->compressImage([BII)[B

    move-result-object p1

    .line 391
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->scanIRListener:Lcom/shopkick/app/products/scanning/interfaces/ScanIRListener;

    if-eqz p2, :cond_2

    .line 392
    invoke-interface {p2, p4, p1}, Lcom/shopkick/app/products/scanning/interfaces/ScanIRListener;->tryRequestValidateIR(I[B)V

    :cond_2
    return-void
.end method

.method public setScanBarcodeListener(Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->scanBCListener:Lcom/shopkick/app/products/scanning/interfaces/ScanBCListener;

    return-void
.end method

.method public setScanIRListener(Lcom/shopkick/app/products/scanning/interfaces/ScanIRListener;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->scanIRListener:Lcom/shopkick/app/products/scanning/interfaces/ScanIRListener;

    return-void
.end method

.method public setScanInitListener(Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->scanInitListener:Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;

    return-void
.end method

.method public setScanningHotSpot(FF)V
    .locals 0

    .line 227
    iput p1, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->scanningHotSpotX:F

    .line 228
    iput p2, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->scanningHotSpotY:F

    return-void
.end method

.method public abstract startBCScanning()V
.end method

.method public startIRScanning()V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    if-eqz v0, :cond_0

    .line 136
    invoke-virtual {v0, p0}, Lcom/craftar/CraftAROnDeviceIR;->setCraftARSearchResponseHandler(Lcom/craftar/CraftARSearchResponseHandler;)V

    :cond_0
    const/4 v0, 0x1

    .line 139
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsRecognizing:Z

    return-void
.end method

.method public abstract stopBCScanning()V
.end method

.method public stopIRScanning()V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->onDeviceIR:Lcom/craftar/CraftAROnDeviceIR;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 158
    invoke-virtual {v0, v1}, Lcom/craftar/CraftAROnDeviceIR;->setCraftARSearchResponseHandler(Lcom/craftar/CraftARSearchResponseHandler;)V

    :cond_0
    const/4 v0, 0x0

    .line 160
    iput-boolean v0, p0, Lcom/shopkick/app/products/scanning/controllers/AbstractScanningController;->irIsRecognizing:Z

    return-void
.end method

.method public abstract switchTorchOn(Z)V
.end method

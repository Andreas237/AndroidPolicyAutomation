.class public Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;
.super Ljava/lang/Object;
.source "BarcodePickerInternal.java"

# interfaces
.implements Lcom/scandit/barcodepicker/internal/BarcodePickerInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;,
        Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;,
        Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;,
        Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;,
        Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;
    }
.end annotation


# instance fields
.field private mCameraListener:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;

.field private final mContainer:Landroid/widget/RelativeLayout;

.field private mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

.field private mErrorIndicator:Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;

.field private mOnScanListener:Lcom/scandit/barcodepicker/OnScanListener;

.field private mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

.field private mPreviewCallback:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;

.field private mPreviewHeight:I

.field private mPreviewWidth:I

.field private mProcessFrameListener:Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

.field private mRunning:Z

.field private mScanStateListener:Lcom/scandit/barcodepicker/PropertyChangeListener;

.field private mScanStateUpdate:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;

.field private mTextRecognitionListener:Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;

.field private mUIHandler:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

.field private mVideoPreview:Lcom/scandit/base/camera/SbIVideoPreview;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;)V
    .locals 1

    .line 170
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;Landroid/widget/RelativeLayout;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;Landroid/widget/RelativeLayout;)V
    .locals 9
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HardwareIds"
        }
    .end annotation

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 48
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOnScanListener:Lcom/scandit/barcodepicker/OnScanListener;

    .line 49
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mProcessFrameListener:Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    .line 50
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mTextRecognitionListener:Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;

    .line 52
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    .line 53
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    .line 54
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mErrorIndicator:Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;

    .line 55
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mVideoPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    .line 56
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewCallback:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;

    .line 58
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mScanStateUpdate:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;

    const/4 v1, 0x0

    .line 60
    iput v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewWidth:I

    .line 61
    iput v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewHeight:I

    .line 64
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mRunning:Z

    .line 166
    new-instance v2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mUIHandler:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    .line 186
    iput-object p3, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    .line 188
    invoke-static {}, Lcom/scandit/barcodepicker/BarcodePicker;->canRunPortraitPicker()Z

    move-result p3

    const/4 v2, 0x1

    xor-int/lit8 v7, p3, 0x1

    .line 189
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->getScanSettings()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p3

    const-string v3, "forceTextureView"

    invoke-virtual {p3, v3}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p3

    if-lez p3, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    sput-boolean p3, Lcom/scandit/base/camera/profiles/DeviceProfile;->FORCE_TEXTURE_VIEW:Z

    .line 190
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->getScanSettings()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p3

    const-string v3, "forceSurfaceView"

    invoke-virtual {p3, v3}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p3

    if-lez p3, :cond_1

    move v1, v2

    :cond_1
    sput-boolean v1, Lcom/scandit/base/camera/profiles/DeviceProfile;->FORCE_SURFACE_VIEW:Z

    .line 191
    new-instance p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;

    invoke-direct {p3}, Lcom/scandit/barcodepicker/internal/EngineSetupParams;-><init>()V

    .line 192
    invoke-static {}, Lcom/scandit/barcodepicker/ScanditLicense;->getAppKey()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, ""

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/scandit/barcodepicker/ScanditLicense;->getAppKey()Ljava/lang/String;

    move-result-object v1

    :goto_1
    iput-object v1, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->appKey:Ljava/lang/String;

    .line 193
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->packageName:Ljava/lang/String;

    .line 195
    iget-object v1, p2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {v1}, Lcom/scandit/barcodepicker/ScanSettings;->clone()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v1

    iput-object v1, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->scanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    .line 196
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->getWorkingDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->workingDirectory:Ljava/io/File;

    .line 197
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->create(Landroid/content/Context;Ljava/lang/String;)Lcom/scandit/base/camera/profiles/DeviceProfile;

    move-result-object v1

    iput-object v1, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->deviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 198
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v3, "android_id"

    invoke-static {v1, v3}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->deviceId:Ljava/lang/String;

    .line 200
    iput-boolean v7, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->isLegacy:Z

    .line 201
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->context:Ljava/lang/ref/WeakReference;

    .line 203
    iget-object v1, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->deviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    iget-object v3, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->scanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {v1, v3}, Lcom/scandit/base/camera/profiles/DeviceProfile;->adjustSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 205
    invoke-static {}, Lcom/scandit/barcodepicker/internal/EngineThread;->getInstance()Lcom/scandit/barcodepicker/internal/EngineThread;

    move-result-object v1

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    .line 206
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v1, p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->initializeAsync(Lcom/scandit/barcodepicker/internal/EngineSetupParams;)V

    .line 208
    new-instance v1, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;

    iget-object v3, p2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mCameraListener:Lcom/scandit/base/camera/SbCameraListener;

    invoke-direct {v1, p0, v3}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;-><init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;Lcom/scandit/base/camera/SbCameraListener;)V

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mCameraListener:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;

    .line 209
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mCameraListener:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$CameraListener;

    invoke-virtual {v1, v3}, Lcom/scandit/barcodepicker/internal/EngineThread;->addCameraListenerAsync(Lcom/scandit/base/camera/SbCameraListener;)V

    .line 211
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->getScanSettings()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v1

    const-string v3, "location_highlighting_only"

    invoke-virtual {v1, v3}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result v1

    if-ne v1, v2, :cond_3

    .line 212
    new-instance v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v6, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->deviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 215
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->getScanSettings()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v8

    move-object v3, v1

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayAlwaysHighlighting;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/base/camera/profiles/DeviceProfile;ZLcom/scandit/barcodepicker/ScanSettings;)V

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    goto :goto_3

    .line 217
    :cond_3
    iget-object v1, p2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    if-eqz v1, :cond_4

    iget-object v1, p2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    goto :goto_2

    :cond_4
    new-instance v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v6, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->deviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 220
    invoke-virtual {p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->getScanSettings()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v8

    move-object v3, v1

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/base/camera/profiles/DeviceProfile;ZLcom/scandit/barcodepicker/ScanSettings;)V

    :goto_2
    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    .line 222
    :goto_3
    new-instance v1, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;

    invoke-direct {v1, p1}, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mErrorIndicator:Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;

    .line 223
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mErrorIndicator:Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;->setVisibility(I)V

    .line 224
    new-instance v1, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;

    invoke-direct {v1, p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;-><init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)V

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mScanStateUpdate:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;

    .line 226
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    iget-object v2, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->scanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {v2}, Lcom/scandit/barcodepicker/ScanSettings;->getScanningHotSpot()Landroid/graphics/PointF;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setViewfinderCenter(Landroid/graphics/PointF;)V

    .line 227
    new-instance v1, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;

    invoke-direct {v1, p0, v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;-><init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$1;)V

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewCallback:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;

    .line 228
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewCallback:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;

    iget-object p3, p3, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->deviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    iget-object p2, p2, Lcom/scandit/barcodepicker/internal/BarcodePickerInternalSettings;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-static {p1, v0, p3, p2}, Lcom/scandit/base/camera/SbICamera;->createPreviewSurface(Landroid/content/Context;Lcom/scandit/base/camera/SbIVideoPreview$Callback;Lcom/scandit/base/camera/profiles/DeviceProfile;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/base/camera/SbIVideoPreview;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mVideoPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    .line 232
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 p2, -0x1

    invoke-direct {p1, p2, p2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 234
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mVideoPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    invoke-interface {p3}, Lcom/scandit/base/camera/SbIVideoPreview;->getView()Landroid/view/View;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 235
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    invoke-virtual {p2, p3, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 236
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mErrorIndicator:Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;

    invoke-virtual {p2, p3, p1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 238
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    const/high16 p2, -0x1000000

    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    return-void
.end method

.method static synthetic access$000(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)I
    .locals 0

    .line 46
    iget p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewWidth:I

    return p0
.end method

.method static synthetic access$002(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;I)I
    .locals 0

    .line 46
    iput p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewWidth:I

    return p1
.end method

.method static synthetic access$100(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)I
    .locals 0

    .line 46
    iget p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewHeight:I

    return p0
.end method

.method static synthetic access$102(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;I)I
    .locals 0

    .line 46
    iput p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewHeight:I

    return p1
.end method

.method static synthetic access$1100(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;II)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->adjustSubviewDimensions(II)V

    return-void
.end method

.method static synthetic access$200(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mUIHandler:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$UIHandler;

    return-object p0
.end method

.method static synthetic access$400(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Z
    .locals 0

    .line 46
    iget-boolean p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mRunning:Z

    return p0
.end method

.method static synthetic access$500(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/EngineThread;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    return-object p0
.end method

.method static synthetic access$600(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Landroid/widget/RelativeLayout;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic access$700(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/base/camera/SbIVideoPreview;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mVideoPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    return-object p0
.end method

.method static synthetic access$800(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mErrorIndicator:Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;

    return-object p0
.end method

.method static synthetic access$900(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;
    .locals 0

    .line 46
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    return-object p0
.end method

.method private addAllListeners()V
    .locals 2

    .line 300
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOnScanListener:Lcom/scandit/barcodepicker/OnScanListener;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->addOnScanListenerAsync(Lcom/scandit/barcodepicker/OnScanListener;)V

    .line 301
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mProcessFrameListener:Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->addExternalProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V

    return-void
.end method

.method private adjustSubviewDimensions(II)V
    .locals 6

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_1

    .line 317
    :cond_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Glass 2 (OEM)"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v5, p2

    move p2, p1

    move p1, v5

    .line 322
    :cond_1
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "S1000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v5, p2

    move p2, p1

    move p1, v5

    .line 327
    :cond_2
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    .line 328
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v1

    .line 330
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/scandit/base/system/SbSystemUtils;->getDisplaySize(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v2

    .line 335
    iget v3, v2, Landroid/graphics/Point;->y:I

    iget v2, v2, Landroid/graphics/Point;->x:I

    if-le v3, v2, :cond_3

    move v5, p2

    move p2, p1

    move p1, v5

    :cond_3
    int-to-float v2, v0

    int-to-float v3, p1

    div-float/2addr v2, v3

    int-to-float v3, v1

    int-to-float v4, p2

    div-float/2addr v3, v4

    cmpg-float v2, v2, v3

    if-gez v2, :cond_4

    mul-int/2addr p1, v1

    .line 349
    div-int/2addr p1, p2

    .line 350
    rem-int/lit8 p2, p1, 0x8

    sub-int/2addr p1, p2

    move p2, v1

    goto :goto_0

    :cond_4
    mul-int/2addr p2, v0

    .line 354
    div-int/2addr p2, p1

    .line 355
    rem-int/lit8 p1, p2, 0x8

    sub-int p1, p2, p1

    move p2, p1

    move p1, v0

    .line 358
    :goto_0
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, p1, p2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    sub-int/2addr v0, p1

    .line 359
    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v1, p2

    .line 360
    div-int/lit8 v1, v1, 0x2

    .line 361
    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 362
    iput v0, v2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 363
    iput v1, v2, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 364
    iput v1, v2, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    .line 365
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mVideoPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    invoke-interface {p1}, Lcom/scandit/base/camera/SbIVideoPreview;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 366
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    invoke-virtual {p1, v0, v1}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setPreviewMargins(II)V

    return-void

    :cond_5
    :goto_1
    return-void
.end method

.method private removeAllListeners()V
    .locals 2

    .line 273
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOnScanListener:Lcom/scandit/barcodepicker/OnScanListener;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->removeOnScanListenerAsync(Lcom/scandit/barcodepicker/OnScanListener;)V

    .line 274
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mProcessFrameListener:Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->removeExternalProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V

    .line 275
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mScanStateListener:Lcom/scandit/barcodepicker/PropertyChangeListener;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->removePropertyChangeListenerAsync(Lcom/scandit/barcodepicker/PropertyChangeListener;)V

    return-void
.end method


# virtual methods
.method public applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V
    .locals 2

    .line 243
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getScanningHotSpot()Landroid/graphics/PointF;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setViewfinderCenter(Landroid/graphics/PointF;)V

    .line 244
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->clone()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->applyScanSettingsAsync(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V

    return-void
.end method

.method public convertPointToPickerCoordinates(Landroid/graphics/Point;)Landroid/graphics/Point;
    .locals 5

    .line 537
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;

    move-result-object v0

    .line 538
    instance-of v1, v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    if-eqz v1, :cond_0

    .line 539
    check-cast v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    const/4 v1, 0x2

    .line 540
    new-array v2, v1, [F

    fill-array-data v2, :array_0

    .line 541
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getLandscapeToViewTransform()Landroid/graphics/Matrix;

    move-result-object v0

    new-array v1, v1, [F

    iget v3, p1, Landroid/graphics/Point;->x:I

    int-to-float v3, v3

    const/4 v4, 0x0

    aput v3, v1, v4

    iget p1, p1, Landroid/graphics/Point;->y:I

    int-to-float p1, p1

    const/4 v3, 0x1

    aput p1, v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 543
    new-instance p1, Landroid/graphics/Point;

    aget v0, v2, v4

    float-to-int v0, v0

    aget v1, v2, v3

    float-to-int v1, v1

    invoke-direct {p1, v0, v1}, Landroid/graphics/Point;-><init>(II)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public getEngine()Lcom/scandit/barcodepicker/internal/EngineThread;
    .locals 1

    .line 573
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    return-object v0
.end method

.method public getOverlayView()Lcom/scandit/barcodepicker/ScanOverlay;
    .locals 1

    .line 373
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 577
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method getWorkingDirectory(Landroid/content/Context;)Ljava/io/File;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 177
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 178
    invoke-virtual {p1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object p1

    return-object p1

    .line 180
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public pauseScanning(Ljava/lang/Runnable;)V
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->pauseScanningAsync(Ljava/lang/Runnable;)V

    return-void
.end method

.method public resumeScanning(Ljava/lang/Runnable;)V
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->resumeScanningAsync(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setAutoFocusOnTapEnabled(Z)V
    .locals 1

    .line 569
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setAutoFocusOnTapEnabled(Z)V

    return-void
.end method

.method public setOnScanListener(Lcom/scandit/barcodepicker/OnScanListener;)V
    .locals 1

    .line 259
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOnScanListener:Lcom/scandit/barcodepicker/OnScanListener;

    .line 260
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->addOnScanListenerAsync(Lcom/scandit/barcodepicker/OnScanListener;)V

    return-void
.end method

.method public setPinchToZoomEnabled(Z)V
    .locals 1

    .line 551
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setPinchToZoomEnabled(Z)V

    return-void
.end method

.method public setProcessFrameListener(Lcom/scandit/barcodepicker/ProcessFrameListener;)V
    .locals 2

    .line 378
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mProcessFrameListener:Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    if-eqz v0, :cond_0

    .line 379
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->removeExternalProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V

    .line 381
    :cond_0
    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;->create(Lcom/scandit/barcodepicker/ProcessFrameListener;)Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ProcessFrameListenerWrapper;

    move-result-object p1

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mProcessFrameListener:Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    .line 382
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mProcessFrameListener:Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->addExternalProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V

    return-void
.end method

.method public setPropertyChangeListener(Lcom/scandit/barcodepicker/PropertyChangeListener;)V
    .locals 2

    .line 555
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mScanStateListener:Lcom/scandit/barcodepicker/PropertyChangeListener;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->removePropertyChangeListenerAsync(Lcom/scandit/barcodepicker/PropertyChangeListener;)V

    .line 556
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mScanStateListener:Lcom/scandit/barcodepicker/PropertyChangeListener;

    .line 557
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->addPropertyChangeListenerAsync(Lcom/scandit/barcodepicker/PropertyChangeListener;)V

    return-void
.end method

.method public setTextRecognitionListener(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V
    .locals 2

    .line 562
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mTextRecognitionListener:Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->removeTextRecognitionListenerAsync(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V

    .line 563
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mTextRecognitionListener:Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;

    .line 564
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->addTextRecognitionListenerAsync(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V

    return-void
.end method

.method public startScanning(ZLjava/lang/Runnable;)V
    .locals 2

    const/4 v0, 0x1

    .line 280
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mRunning:Z

    .line 284
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->addAllListeners()V

    .line 286
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mScanStateUpdate:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setScanStateUpdateCallbackAsync(Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;)V

    .line 287
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->startScanningAsync(ZLjava/lang/Runnable;)V

    .line 293
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mPreviewCallback:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$PreviewCallback;->isSurfaceCreated()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 294
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mVideoPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewSurfaceAsync(Lcom/scandit/base/camera/SbIVideoPreview;)V

    .line 296
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewRotationAsync(Landroid/content/Context;)V

    return-void
.end method

.method public stopScanning(Ljava/lang/Runnable;)V
    .locals 3

    const/4 v0, 0x0

    .line 265
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mRunning:Z

    .line 266
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->removeAllListeners()V

    .line 267
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/scandit/barcodepicker/internal/EngineThread;->setScanStateUpdateCallbackAsync(Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;)V

    .line 268
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mOverlay:Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    invoke-virtual {v1, v0}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setScanningActive(Z)V

    .line 269
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->blockUntilCameraClosed(Ljava/lang/Runnable;)V

    return-void
.end method

.method public switchTorchOn(Z)V
    .locals 1

    .line 306
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->mEngine:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->switchTorchOnAsync(Z)V

    return-void
.end method

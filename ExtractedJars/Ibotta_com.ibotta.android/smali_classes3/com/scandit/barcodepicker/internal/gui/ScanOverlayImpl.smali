.class public Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;
.super Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;
.source "ScanOverlayImpl.java"

# interfaces
.implements Lcom/scandit/base/camera/SbCameraListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;,
        Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$OCRSwitchButtonListener;,
        Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;,
        Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;,
        Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$BarcodeOverlayMessageHandler;,
        Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchObserver;,
        Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;
    }
.end annotation


# instance fields
.field private mAutoFocusOnTapEnabled:Z

.field private final mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

.field protected mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

.field private final mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

.field private final mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

.field private mGuiStyle:I

.field private final mHandler:Landroid/os/Handler;

.field private final mHighlightingColors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mIsLegacy:Z

.field protected final mLandscapeToViewTransform:Landroid/graphics/Matrix;

.field private mLastRotation:I

.field private mLogoVisible:Z

.field private mMirrorHorizontally:Z

.field private mMirrorVertically:Z

.field private mMissingCameraPermissionInfoText:Ljava/lang/String;

.field private final mOcrButton:Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;

.field private mPreviewHeight:I

.field private mPreviewMarginHorizontal:I

.field private mPreviewMarginVertical:I

.field private mPreviewWidth:I

.field private final mScanFeedback:Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

.field private mSearchBar:Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;

.field private mShowBarcodeLocations:Z

.field private final mStateListener:Lcom/scandit/barcodepicker/PropertyChangeListener;

.field private final mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

.field private mTorchObserver:Lcom/scandit/base/util/Observer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/scandit/base/util/Observer<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mTrackingHighlightingColors:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

.field private final mViewToLandscapeTransform:Landroid/graphics/Matrix;

.field private final mZoomDetector:Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/base/camera/profiles/DeviceProfile;ZLcom/scandit/barcodepicker/ScanSettings;)V
    .locals 4

    .line 141
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 89
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mSearchBar:Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;

    .line 91
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    .line 92
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    const/4 v1, 0x0

    .line 94
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMirrorHorizontally:Z

    .line 95
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMirrorVertically:Z

    .line 96
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    .line 97
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewToLandscapeTransform:Landroid/graphics/Matrix;

    .line 99
    iput v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewWidth:I

    .line 100
    iput v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewHeight:I

    const/4 v2, -0x1

    .line 101
    iput v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLastRotation:I

    const/4 v2, 0x1

    .line 102
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mShowBarcodeLocations:Z

    .line 103
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLogoVisible:Z

    .line 104
    iput v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginVertical:I

    .line 105
    iput v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginHorizontal:I

    .line 109
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mAutoFocusOnTapEnabled:Z

    const-string v3, "The Barcode Picker was unable to access the device\'s camera.\n\nGo to the App\'s Settings check that it has permission to use the camera."

    .line 110
    iput-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMissingCameraPermissionInfoText:Ljava/lang/String;

    .line 135
    new-instance v3, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchObserver;

    invoke-direct {v3, p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchObserver;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V

    iput-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchObserver:Lcom/scandit/base/util/Observer;

    const-string v3, "mirror_preview_vertically"

    .line 143
    invoke-virtual {p5, v3}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result p5

    if-lez p5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMirrorVertically:Z

    .line 145
    new-instance p5, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$BarcodeOverlayMessageHandler;

    invoke-direct {p5, p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$BarcodeOverlayMessageHandler;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V

    iput-object p5, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    .line 146
    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    .line 147
    iput-boolean p4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mIsLegacy:Z

    .line 148
    iput-object p3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 150
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHighlightingColors:Ljava/util/Map;

    .line 151
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTrackingHighlightingColors:Ljava/util/Map;

    .line 153
    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;

    invoke-direct {p2, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    .line 154
    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;

    invoke-direct {p2, p1, p4, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;-><init>(Landroid/content/Context;ZI)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    .line 155
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-virtual {p2, v1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setVisible(Z)V

    .line 156
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {p2, p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->addCameraListenerAsync(Lcom/scandit/base/camera/SbCameraListener;)V

    .line 157
    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    invoke-direct {p2, p1, p4}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;-><init>(Landroid/content/Context;Z)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    .line 159
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    new-instance p3, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;

    invoke-direct {p3, p0, v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$TorchSwitchButtonListener;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;)V

    instance-of p5, p2, Landroid/view/View;

    if-nez p5, :cond_1

    invoke-virtual {p2, p3}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p2, Landroid/view/View;

    invoke-static {p2, p3}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 160
    :goto_1
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    invoke-virtual {p0, p2}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->addView(Landroid/view/View;)V

    .line 162
    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-direct {p2, p1, p4}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;-><init>(Landroid/content/Context;Z)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    .line 164
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    new-instance p3, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;

    invoke-direct {p3, p0, v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$CameraSwitchButtonListener;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;)V

    instance-of p4, p2, Landroid/view/View;

    if-nez p4, :cond_2

    invoke-virtual {p2, p3}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast p2, Landroid/view/View;

    invoke-static {p2, p3}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 165
    :goto_2
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-virtual {p0, p2}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->addView(Landroid/view/View;)V

    .line 166
    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;

    invoke-direct {p2, p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mStateListener:Lcom/scandit/barcodepicker/PropertyChangeListener;

    .line 189
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mOcrButton:Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;

    .line 192
    invoke-virtual {p0, v1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setWillNotDraw(Z)V

    .line 193
    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    invoke-direct {p2, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mScanFeedback:Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    .line 194
    new-instance p2, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;

    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-direct {p2, p1, p3}, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/EngineThread;)V

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mZoomDetector:Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;

    return-void
.end method

.method static synthetic access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Landroid/os/Handler;
    .locals 0

    .line 70
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;
    .locals 0

    .line 70
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/EngineThread;
    .locals 0

    .line 70
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Z
    .locals 0

    .line 70
    iget-boolean p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMirrorHorizontally:Z

    return p0
.end method

.method static synthetic access$1202(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;Z)Z
    .locals 0

    .line 70
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMirrorHorizontally:Z

    return p1
.end method

.method static synthetic access$1300(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;
    .locals 0

    .line 70
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mSearchBar:Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;
    .locals 0

    .line 70
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mOcrButton:Lcom/scandit/barcodepicker/internal/gui/view/OCRButton;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;
    .locals 0

    .line 70
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    return-object p0
.end method

.method static synthetic access$300(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I
    .locals 0

    .line 70
    iget p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewWidth:I

    return p0
.end method

.method static synthetic access$302(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;I)I
    .locals 0

    .line 70
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewWidth:I

    return p1
.end method

.method static synthetic access$400(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I
    .locals 0

    .line 70
    iget p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewHeight:I

    return p0
.end method

.method static synthetic access$402(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;I)I
    .locals 0

    .line 70
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewHeight:I

    return p1
.end method

.method static synthetic access$500(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)I
    .locals 0

    .line 70
    iget p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLastRotation:I

    return p0
.end method

.method static synthetic access$502(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;I)I
    .locals 0

    .line 70
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLastRotation:I

    return p1
.end method

.method static synthetic access$600(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;IIIII)V
    .locals 0

    .line 70
    invoke-direct/range {p0 .. p5}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->updateTransform(IIIII)V

    return-void
.end method

.method static synthetic access$700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;
    .locals 0

    .line 70
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mScanFeedback:Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    return-object p0
.end method

.method static synthetic access$800(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->hideIndicator()V

    return-void
.end method

.method static synthetic access$900(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 0

    .line 70
    invoke-static {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->showTestLicenseBanner(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V

    return-void
.end method

.method private hideIndicator()V
    .locals 4

    .line 833
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setVisible(Z)V

    .line 834
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    iget-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mShowBarcodeLocations:Z

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mGuiStyle:I

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 836
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    iget-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLogoVisible:Z

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawLogo(Z)V

    .line 837
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method private shouldDisplayCameraSwitchButton()Z
    .locals 5

    .line 266
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->getVisibilityIfAvailable()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 267
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isTablet()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    .line 270
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->getVisibilityIfAvailable()I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 273
    :goto_0
    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v3}, Lcom/scandit/base/camera/profiles/DeviceProfile;->hasBackCamera()Z

    move-result v3

    .line 274
    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v4}, Lcom/scandit/base/camera/profiles/DeviceProfile;->hasFrontCamera()Z

    move-result v4

    if-eqz v0, :cond_2

    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method private static showTestLicenseBanner(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 2

    .line 736
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->requiresInternetAccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 739
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "Scandit SDK test license. Requires internet access."

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    .line 740
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method private updateTransform(IIIII)V
    .locals 3

    .line 215
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 216
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewToLandscapeTransform:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    if-eqz p4, :cond_3

    if-nez p5, :cond_0

    goto :goto_0

    .line 220
    :cond_0
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginHorizontal:I

    mul-int/lit8 v0, v0, 0x2

    sub-int/2addr p2, v0

    int-to-float p2, p2

    .line 221
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginVertical:I

    mul-int/lit8 v0, v0, 0x2

    sub-int v0, p3, v0

    int-to-float v0, v0

    .line 224
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    int-to-float p4, p4

    const/high16 v2, 0x3f800000    # 1.0f

    div-float p4, v2, p4

    int-to-float p5, p5

    div-float p5, v2, p5

    invoke-virtual {v1, p4, p5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 225
    iget-boolean p4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMirrorHorizontally:Z

    const/high16 p5, -0x40800000    # -1.0f

    const/high16 v1, 0x3f000000    # 0.5f

    if-eqz p4, :cond_1

    .line 226
    iget-object p4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    invoke-virtual {p4, p5, v2, v1, v1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 228
    :cond_1
    iget-object p4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    int-to-float p1, p1

    invoke-virtual {p4, p1, v1, v1}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 229
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 230
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    iget p4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginHorizontal:I

    int-to-float p4, p4

    iget v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginVertical:I

    int-to-float v1, v1

    invoke-virtual {p1, p4, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 232
    iget-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMirrorVertically:Z

    if-eqz p1, :cond_2

    .line 233
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    invoke-virtual {p1, v2, p5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 234
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    const/4 p4, 0x0

    int-to-float p3, p3

    invoke-virtual {p1, p4, p3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 239
    :cond_2
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewToLandscapeTransform:Landroid/graphics/Matrix;

    iget p3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginHorizontal:I

    neg-int p3, p3

    int-to-float p3, p3

    iget p4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginVertical:I

    neg-int p4, p4

    int-to-float p4, p4

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 240
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewToLandscapeTransform:Landroid/graphics/Matrix;

    div-float p2, v2, p2

    div-float/2addr v2, v0

    invoke-virtual {p1, p2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    return-void

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public didCloseCamera(Lcom/scandit/base/camera/SbICamera;)V
    .locals 2

    .line 254
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 255
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchObserver:Lcom/scandit/base/util/Observer;

    invoke-virtual {p1, v0}, Lcom/scandit/base/camera/SbICamera;->stopObservingTorch(Lcom/scandit/base/util/Observer;)V

    return-void
.end method

.method public didFail(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public didInitializeCamera(Lcom/scandit/base/camera/SbICamera;Lcom/scandit/base/camera/SbICamera$CameraFacing;II)V
    .locals 1

    .line 247
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x3

    invoke-virtual {p2, v0, p3, p4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 249
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchObserver:Lcom/scandit/base/util/Observer;

    invoke-virtual {p1, p2}, Lcom/scandit/base/camera/SbICamera;->observeTorch(Lcom/scandit/base/util/Observer;)V

    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 281
    invoke-super {p0, p1}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 284
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->shouldDisplayCameraSwitchButton()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setVisibility(I)V

    .line 287
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mSearchBar:Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;

    if-eqz p1, :cond_1

    .line 288
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/gui/view/SearchBar;->getHeight()I

    move-result v1

    .line 292
    :cond_1
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getHeight()I

    move-result v2

    invoke-virtual {p1, v0, v2, v1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->adjustPlacement(III)V

    .line 293
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getHeight()I

    move-result v2

    invoke-virtual {p1, v0, v2, v1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->adjustPlacement(III)V

    return-void
.end method

.method public drawViewfinder(Z)V
    .locals 2

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    .line 457
    iget v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mGuiStyle:I

    if-ne v1, v0, :cond_0

    const/4 p1, 0x0

    .line 458
    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setGuiStyle(I)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 460
    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setGuiStyle(I)V

    .line 463
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public frameCompleted(Lcom/scandit/barcodepicker/internal/ScanSessionImpl;)V
    .locals 5

    .line 327
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getAllNonRejectedCodesAndClearRejectionStatus()Ljava/util/List;

    move-result-object v0

    .line 328
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 329
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x2

    .line 330
    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    .line 329
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 333
    :cond_0
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getNewlyRecognizedText()Lcom/scandit/barcodepicker/ocr/RecognizedText;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 334
    invoke-virtual {v1}, Lcom/scandit/barcodepicker/ocr/RecognizedText;->isRejected()Z

    move-result v1

    if-nez v1, :cond_1

    .line 335
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    const/16 v2, 0xa

    .line 336
    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 335
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 338
    :cond_1
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getSensorToScreenAngle()I

    move-result v1

    iget v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLastRotation:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    .line 339
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    const/16 v2, 0x8

    .line 341
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getSensorToScreenAngle()I

    move-result v4

    .line 340
    invoke-virtual {v1, v2, v4, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v2

    .line 339
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 344
    :cond_2
    new-instance v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;

    .line 345
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->isTrackingEnabled()Z

    move-result v2

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->didSeeNewTrack()Z

    move-result v4

    invoke-direct {v1, p0, v0, v2, v4}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;-><init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;Ljava/util/List;ZZ)V

    .line 349
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    .line 350
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getPreviewWidth()I

    move-result v2

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getPreviewHeight()I

    move-result p1

    .line 349
    invoke-virtual {v0, v3, v2, p1, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public getLandscapeToViewTransform()Landroid/graphics/Matrix;
    .locals 1

    .line 198
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public getMissingCameraPermissionInfoText()Ljava/lang/String;
    .locals 1

    .line 628
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMissingCameraPermissionInfoText:Ljava/lang/String;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->draw(Landroid/graphics/Canvas;)V

    .line 314
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 315
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLandscapeToViewTransform:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 316
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->draw(Landroid/graphics/Canvas;)V

    .line 317
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 6

    .line 203
    invoke-super {p0, p1, p2, p3, p4}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->onSizeChanged(IIII)V

    .line 205
    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p3, p1, p2}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->onSizeChanged(II)V

    .line 207
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3}, Lcom/scandit/base/system/SbSystemUtils;->getDisplayRotation(Landroid/content/Context;)I

    move-result v1

    .line 208
    iget v4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewWidth:I

    iget v5, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewHeight:I

    move-object v0, p0

    move v2, p1

    move v3, p2

    invoke-direct/range {v0 .. v5}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->updateTransform(IIIII)V

    .line 209
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v0, 0x2

    .line 301
    new-array v0, v0, [F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    const/4 v3, 0x1

    aput v1, v0, v3

    .line 302
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewToLandscapeTransform:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 303
    iget-boolean v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mAutoFocusOnTapEnabled:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-ne v1, v3, :cond_0

    .line 304
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x64

    cmp-long v1, v4, v6

    if-gez v1, :cond_0

    .line 305
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    new-instance v4, Landroid/graphics/PointF;

    aget v2, v0, v2

    aget v0, v0, v3

    invoke-direct {v4, v2, v0}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v1, v4}, Lcom/scandit/barcodepicker/internal/EngineThread;->autoFocusAtPointAsync(Landroid/graphics/PointF;)V

    .line 307
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mZoomDetector:Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)V

    return v3
.end method

.method public setAutoFocusOnTapEnabled(Z)V
    .locals 0

    .line 510
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mAutoFocusOnTapEnabled:Z

    return-void
.end method

.method public setBeepEnabled(Z)V
    .locals 1

    .line 515
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mScanFeedback:Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->setBeepEnabled(Z)V

    return-void
.end method

.method public setCameraSwitchBackContentDescription(Ljava/lang/String;)V
    .locals 1

    .line 594
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setContentDescriptionWhenBack(Ljava/lang/String;)V

    return-void
.end method

.method public setCameraSwitchButtonMarginsAndSize(IIII)V
    .locals 2

    .line 589
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    new-instance v1, Lcom/scandit/base/geometry/SbRectangle;

    int-to-float p1, p1

    int-to-float p2, p2

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setRect(Lcom/scandit/base/geometry/SbRectangle;)V

    return-void
.end method

.method public setCameraSwitchFrontContentDescription(Ljava/lang/String;)V
    .locals 1

    .line 599
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setContentDescriptionWhenFront(Ljava/lang/String;)V

    return-void
.end method

.method public setCameraSwitchImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 583
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    const-string v1, "normal"

    invoke-virtual {v0, v1, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setBitmapForState(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 584
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    const-string v0, "pressed"

    invoke-virtual {p1, v0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setBitmapForState(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setCameraSwitchVisibility(I)V
    .locals 2

    .line 574
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "GT-P1000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 577
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCameraButton:Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/CameraButton;->setVisibilityIfAvailable(I)V

    .line 578
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public setGuiStyle(I)V
    .locals 6

    .line 355
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mGuiStyle:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 358
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-ge v1, v2, :cond_1

    const-string p1, "ScanditSDK"

    const-string v0, "The MatrixScan GUI is not available for Android versions below 11"

    .line 359
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 363
    :cond_1
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 366
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    instance-of v3, v1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    if-eqz v3, :cond_2

    .line 367
    check-cast v1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    .line 369
    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v3, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->removeProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V

    .line 372
    :cond_2
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mGuiStyle:I

    if-ne p1, v2, :cond_3

    .line 375
    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-boolean v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mIsLegacy:Z

    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-direct {v0, v1, v3, v4, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/LaserLine;-><init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    .line 376
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p1, v2}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 377
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mShowBarcodeLocations:Z

    goto/16 :goto_0

    :cond_3
    if-nez p1, :cond_4

    .line 380
    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-boolean v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mIsLegacy:Z

    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-direct {v0, v1, v3, v4, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;-><init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    .line 381
    new-instance p1, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    .line 382
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p1, v2}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 383
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mShowBarcodeLocations:Z

    goto :goto_0

    :cond_4
    const/4 v1, 0x2

    const/4 v3, 0x0

    if-ne p1, v1, :cond_5

    .line 386
    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-boolean v4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mIsLegacy:Z

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-direct {v0, v1, v4, v5, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;-><init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    .line 387
    iput-boolean v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mShowBarcodeLocations:Z

    .line 388
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p1, v3}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    goto :goto_0

    :cond_5
    if-ne p1, v0, :cond_6

    .line 391
    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-boolean v4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mIsLegacy:Z

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-direct {v0, v1, v4, v5, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;-><init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    .line 392
    new-instance p1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    .line 393
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 394
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTrackingHighlightingColors:Ljava/util/Map;

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->setColors(Ljava/util/Map;)V

    .line 395
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mEngineThread:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->addProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V

    .line 396
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    .line 397
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p1, v3}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 398
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mShowBarcodeLocations:Z

    goto :goto_0

    :cond_6
    const/4 v0, 0x4

    if-ne p1, v0, :cond_7

    .line 400
    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-boolean v4, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mIsLegacy:Z

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-direct {v0, v1, v4, v5, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinder;-><init>(Landroid/content/Context;ZLcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;I)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    .line 401
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mShowBarcodeLocations:Z

    .line 402
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p1, v3}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 405
    :cond_7
    :goto_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->getHeight()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->onSizeChanged(II)V

    .line 406
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLogoVisible:Z

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawLogo(Z)V

    .line 407
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHighlightingColors:Ljava/util/Map;

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setColors(Ljava/util/Map;)V

    .line 409
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHighlightingColors:Ljava/util/Map;

    sget-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 410
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHighlightingColors:Ljava/util/Map;

    sget-object v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setColor(I)V

    .line 412
    :cond_8
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-virtual {p1, v2}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setVisible(Z)V

    .line 414
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public setMatrixScanHighlightingColor(II)V
    .locals 1

    .line 638
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTrackingHighlightingColors:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    instance-of p2, p1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    if-eqz p2, :cond_0

    .line 640
    check-cast p1, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTrackingHighlightingColors:Ljava/util/Map;

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/gui/indicator/TrackedBarcodeIndicatorCoordinator;->setColors(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public setMissingCameraPermissionInfoText(Ljava/lang/String;)V
    .locals 0

    .line 633
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mMissingCameraPermissionInfoText:Ljava/lang/String;

    return-void
.end method

.method public setPinchToZoomEnabled(Z)V
    .locals 1

    .line 505
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mZoomDetector:Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/ZoomGestureDetector;->setEnabled(Z)V

    return-void
.end method

.method public setPreviewMargins(II)V
    .locals 0

    .line 499
    iput p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginHorizontal:I

    .line 500
    iput p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mPreviewMarginVertical:I

    return-void
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "drawLogo"

    .line 485
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 486
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLogoVisible:Z

    .line 487
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    iget-boolean p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLogoVisible:Z

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawLogo(Z)V

    goto :goto_0

    :cond_0
    const-string v0, "viewfinderLineWidth"

    .line 488
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 489
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setViewfinderLineWidth(I)V

    goto :goto_0

    :cond_1
    const-string v0, "viewfinderDecodedLineWidth"

    .line 490
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 491
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setViewfinderDecodedLineWidth(I)V

    goto :goto_0

    :cond_2
    const-string v0, "viewfinderCornerRadius"

    .line 492
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    instance-of p1, p2, Ljava/lang/Integer;

    if-eqz p1, :cond_3

    .line 493
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setViewfinderCornerRadius(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public setScanningActive(Z)V
    .locals 2

    .line 418
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 419
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setActive(Z)V

    .line 420
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setActive(Z)V

    .line 421
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    goto :goto_0

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x7

    .line 424
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 423
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :goto_0
    return-void
.end method

.method public setTextRecognitionSwitchVisible(Z)V
    .locals 0

    return-void
.end method

.method public setTorchButtonMarginsAndSize(IIII)V
    .locals 2

    .line 556
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    new-instance v1, Lcom/scandit/base/geometry/SbRectangle;

    int-to-float p1, p1

    int-to-float p2, p2

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/scandit/base/geometry/SbRectangle;-><init>(FFII)V

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setRect(Lcom/scandit/base/geometry/SbRectangle;)V

    .line 557
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public setTorchEnabled(Z)V
    .locals 1

    .line 525
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setVisibleIfTorchAvailable(Z)V

    return-void
.end method

.method public setTorchOffContentDescription(Ljava/lang/String;)V
    .locals 1

    .line 562
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setContentDescriptionWhenOff(Ljava/lang/String;)V

    return-void
.end method

.method public setTorchOffImage(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "ScanditSDK"

    const-string v1, "The function \'setTorchOffImage(Bitmap)\' is deprecated. Use setTorchOffImage(Bitmap,Bitmap) instead."

    .line 543
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 545
    invoke-virtual {p0, p1, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setTorchOffImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setTorchOffImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 550
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    const-string v1, "off"

    invoke-virtual {v0, v1, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setBitmapForState(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 551
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    const-string v0, "off_pressed"

    invoke-virtual {p1, v0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setBitmapForState(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setTorchOnContentDescription(Ljava/lang/String;)V
    .locals 1

    .line 567
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setContentDescriptionWhenOn(Ljava/lang/String;)V

    return-void
.end method

.method public setTorchOnImage(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "ScanditSDK"

    const-string v1, "The function \'setTorchOnImage(Bitmap)\' is deprecated. Use setTorchOnImage(Bitmap,Bitmap) instead."

    .line 530
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 532
    invoke-virtual {p0, p1, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setTorchOnImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setTorchOnImage(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 537
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    const-string v1, "on"

    invoke-virtual {v0, v1, p1}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setBitmapForState(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 538
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mTorchButton:Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;

    const-string v0, "on_pressed"

    invoke-virtual {p1, v0, p2}, Lcom/scandit/barcodepicker/internal/gui/view/TorchButton;->setBitmapForState(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setVibrateEnabled(Z)V
    .locals 1

    .line 520
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mScanFeedback:Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->setVibrateEnabled(Z)V

    return-void
.end method

.method public setViewfinderCenter(Landroid/graphics/PointF;)V
    .locals 2

    .line 429
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->getPortraitRect()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/scandit/base/geometry/SbRectFUtils;->rectWithUpdatedCenter(Landroid/graphics/RectF;Landroid/graphics/PointF;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setPortraitRect(Landroid/graphics/RectF;)V

    .line 430
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->getLandscapeRect()Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/scandit/base/geometry/SbRectFUtils;->rectWithUpdatedCenter(Landroid/graphics/RectF;Landroid/graphics/PointF;)Landroid/graphics/RectF;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setLandscapeRect(Landroid/graphics/RectF;)V

    .line 431
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public setViewfinderColor(FFF)V
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    mul-float p2, p2, v0

    float-to-int p2, p2

    mul-float p3, p3, v0

    float-to-int p3, p3

    .line 611
    invoke-static {p1, p2, p3}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    .line 612
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHighlightingColors:Ljava/util/Map;

    sget-object p3, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->DEFAULT:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHighlightingColors:Ljava/util/Map;

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setColors(Ljava/util/Map;)V

    .line 614
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public setViewfinderCornerRadius(I)V
    .locals 1

    .line 479
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setCornerRadius(I)V

    .line 480
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public setViewfinderDecodedColor(FFF)V
    .locals 1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    mul-float p2, p2, v0

    float-to-int p2, p2

    mul-float p3, p3, v0

    float-to-int p3, p3

    .line 619
    invoke-static {p1, p2, p3}, Landroid/graphics/Color;->rgb(III)I

    move-result p1

    .line 620
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHighlightingColors:Ljava/util/Map;

    sget-object p3, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    iget-object p3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHighlightingColors:Ljava/util/Map;

    invoke-virtual {p2, p3}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setColors(Ljava/util/Map;)V

    .line 622
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-virtual {p2, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setColor(I)V

    .line 623
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public setViewfinderDecodedLineWidth(I)V
    .locals 2

    .line 472
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    instance-of v1, v0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;

    if-eqz v1, :cond_0

    .line 473
    check-cast v0, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BarcodeIndicator;->setLineWidth(I)V

    .line 474
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    :cond_0
    return-void
.end method

.method public setViewfinderDimension(FFFF)V
    .locals 0

    .line 437
    invoke-virtual {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setViewfinderPortraitDimension(FF)V

    .line 438
    invoke-virtual {p0, p3, p4}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->setViewfinderLandscapeDimension(FF)V

    return-void
.end method

.method public setViewfinderLandscapeDimension(FF)V
    .locals 1

    .line 450
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->getLandscapeRect()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/scandit/base/geometry/SbRectFUtils;->rectWithSameCenter(Landroid/graphics/RectF;FF)Landroid/graphics/RectF;

    move-result-object p1

    .line 452
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p2, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setLandscapeRect(Landroid/graphics/RectF;)V

    return-void
.end method

.method public setViewfinderLineWidth(I)V
    .locals 1

    .line 467
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setLineWidth(I)V

    .line 468
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

.method public setViewfinderPortraitDimension(FF)V
    .locals 1

    .line 443
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->getPortraitRect()Landroid/graphics/RectF;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/scandit/base/geometry/SbRectFUtils;->rectWithSameCenter(Landroid/graphics/RectF;FF)Landroid/graphics/RectF;

    move-result-object p1

    .line 445
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p2, p1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setPortraitRect(Landroid/graphics/RectF;)V

    return-void
.end method

.method protected updateIndicator(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)V
    .locals 5

    .line 789
    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->access$1600(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 790
    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->access$1700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Lcom/scandit/recognition/Barcode;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 791
    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->access$1700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Lcom/scandit/recognition/Barcode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->isRecognized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 792
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mScanFeedback:Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->handleSuccessfulScan()V

    goto :goto_0

    .line 794
    :cond_0
    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->access$1600(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->access$1800(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 795
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mScanFeedback:Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanFeedback;->handleNewTrack()V

    .line 798
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mShowBarcodeLocations:Z

    if-nez v0, :cond_2

    return-void

    .line 802
    :cond_2
    iget v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mGuiStyle:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    .line 805
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p1, v2}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 806
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-virtual {p1, v1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setVisible(Z)V

    goto :goto_1

    :cond_3
    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    .line 809
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {p1, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 810
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-virtual {p1, v2}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setVisible(Z)V

    goto :goto_1

    .line 814
    :cond_4
    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->access$1700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Lcom/scandit/recognition/Barcode;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 815
    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->access$1700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Lcom/scandit/recognition/Barcode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/scandit/recognition/Barcode;->isRecognized()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 816
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawIndicator(Z)V

    .line 817
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mViewFinder:Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;

    iget-boolean v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mLogoVisible:Z

    if-eqz v3, :cond_5

    iget v3, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mGuiStyle:I

    const/4 v4, 0x4

    if-ne v3, v4, :cond_5

    const/4 v1, 0x1

    :cond_5
    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/viewfinder/ViewFinderBase;->setShouldDrawLogo(Z)V

    .line 821
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "Glass 2 (OEM)"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "S1000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 822
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-virtual {v0, v2}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setVisible(Z)V

    .line 823
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mCodeIndicator:Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;->access$1700(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$FrameCompletedContainer;)Lcom/scandit/recognition/Barcode;

    move-result-object p1

    invoke-virtual {p1}, Lcom/scandit/recognition/Barcode;->getLocation()Lcom/scandit/recognition/Quadrilateral;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/gui/indicator/BaseBarcodeIndicator;->setLocation(Lcom/scandit/recognition/Quadrilateral;)V

    .line 825
    :cond_6
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 826
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->mHandler:Landroid/os/Handler;

    const-wide/16 v0, 0x3e8

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 829
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->invalidate()V

    return-void
.end method

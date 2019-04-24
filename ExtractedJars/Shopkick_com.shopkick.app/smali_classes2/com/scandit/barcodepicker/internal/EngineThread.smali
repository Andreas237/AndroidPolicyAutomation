.class public Lcom/scandit/barcodepicker/internal/EngineThread;
.super Landroid/os/HandlerThread;
.source "EngineThread.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;,
        Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;,
        Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;,
        Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;
    }
.end annotation


# static fields
.field public static final PAUSE:I = 0x0

.field public static final RESUME:I = 0x4

.field public static final START:I = 0x1

.field public static final START_PAUSED:I = 0x2

.field public static final STOP:I = 0x3

.field private static sInstanceReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/scandit/barcodepicker/internal/EngineThread;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mBarcodeScanner:Lcom/scandit/recognition/BarcodeScanner;

.field private mBufferToNaturalOrientationRotation:I

.field private mCamera:Lcom/scandit/base/camera/SbICamera;

.field private mCameraEventListener:Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;

.field private mContext:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private mCurrentlyProcessingFrame:Z

.field private mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

.field private mExternalProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/scandit/barcodepicker/ListenerList<",
            "Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;",
            ">;"
        }
    .end annotation
.end field

.field private mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

.field private mFrameToggleForCombinedOCRAndBarcodeMode:Z

.field private mHandler:Landroid/os/Handler;

.field private mInformScanListeners:Z

.field private mIsLegacy:Z

.field private mLastLocationPoll:J

.field private mLastRotation:I

.field private mLocationGathering:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

.field private mOnScanListeners:Lcom/scandit/barcodepicker/ListenerList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/scandit/barcodepicker/ListenerList<",
            "Lcom/scandit/barcodepicker/OnScanListener;",
            ">;"
        }
    .end annotation
.end field

.field private mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

.field private mPreviewCallback:Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;

.field private mProcessFrames:Z

.field private mProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/scandit/barcodepicker/ListenerList<",
            "Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;",
            ">;"
        }
    .end annotation
.end field

.field private mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

.field private mRecognitionMode:I

.field private mRunnablesToBeInvokedOnApplySettings:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private mRunnablesToBeInvokedOnNexFrame:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

.field private mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

.field private mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

.field private mScannerSettingsModified:Z

.field private mSendToEngineAndLocation:Z

.field private mStateChangeListeners:Lcom/scandit/barcodepicker/ListenerList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/scandit/barcodepicker/ListenerList<",
            "Lcom/scandit/barcodepicker/PropertyChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field private mTextRecognitionListeners:Lcom/scandit/barcodepicker/ListenerList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/scandit/barcodepicker/ListenerList<",
            "Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;",
            ">;"
        }
    .end annotation
.end field

.field private mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

.field private mWorkingRange:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    const-string v0, "engine thread"

    .line 596
    invoke-direct {p0, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    .line 67
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    .line 69
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    .line 70
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mBarcodeScanner:Lcom/scandit/recognition/BarcodeScanner;

    const/4 v1, 0x0

    .line 72
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScannerSettingsModified:Z

    .line 74
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    .line 77
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    .line 78
    new-instance v2, Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;

    invoke-direct {v2, p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;-><init>(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/EngineThread$1;)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mPreviewCallback:Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;

    .line 79
    new-instance v2, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;

    invoke-direct {v2, p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;-><init>(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/EngineThread$1;)V

    iput-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCameraEventListener:Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;

    .line 80
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessFrames:Z

    const/4 v2, 0x1

    .line 81
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mSendToEngineAndLocation:Z

    .line 82
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    .line 83
    new-instance v3, Lcom/scandit/barcodepicker/ListenerList;

    invoke-direct {v3}, Lcom/scandit/barcodepicker/ListenerList;-><init>()V

    iput-object v3, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mOnScanListeners:Lcom/scandit/barcodepicker/ListenerList;

    .line 84
    new-instance v3, Lcom/scandit/barcodepicker/ListenerList;

    invoke-direct {v3}, Lcom/scandit/barcodepicker/ListenerList;-><init>()V

    iput-object v3, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mExternalProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;

    .line 85
    new-instance v3, Lcom/scandit/barcodepicker/ListenerList;

    invoke-direct {v3}, Lcom/scandit/barcodepicker/ListenerList;-><init>()V

    iput-object v3, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;

    .line 86
    new-instance v3, Lcom/scandit/barcodepicker/ListenerList;

    invoke-direct {v3}, Lcom/scandit/barcodepicker/ListenerList;-><init>()V

    iput-object v3, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mStateChangeListeners:Lcom/scandit/barcodepicker/ListenerList;

    .line 87
    new-instance v3, Lcom/scandit/barcodepicker/ListenerList;

    invoke-direct {v3}, Lcom/scandit/barcodepicker/ListenerList;-><init>()V

    iput-object v3, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextRecognitionListeners:Lcom/scandit/barcodepicker/ListenerList;

    .line 88
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    .line 89
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 90
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mIsLegacy:Z

    const/4 v3, -0x1

    .line 91
    iput v3, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLastRotation:I

    .line 92
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    .line 93
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    .line 94
    sget-object v4, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->NO:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    iput-object v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLocationGathering:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    const-wide/16 v4, 0x0

    .line 95
    iput-wide v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLastLocationPoll:J

    .line 96
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCurrentlyProcessingFrame:Z

    .line 97
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mInformScanListeners:Z

    .line 102
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    const/4 v2, 0x2

    .line 103
    iput v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionMode:I

    .line 104
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFrameToggleForCombinedOCRAndBarcodeMode:Z

    .line 106
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnNexFrame:Ljava/util/ArrayList;

    .line 107
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnApplySettings:Ljava/util/ArrayList;

    .line 597
    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->start()V

    .line 598
    new-instance v1, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;

    invoke-virtual {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/scandit/barcodepicker/internal/EngineThread$EngineHandler;-><init>(Lcom/scandit/barcodepicker/internal/EngineThread;Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    .line 601
    iput v3, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLastRotation:I

    .line 602
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    .line 606
    sget-object v0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->IF_AVAILABLE:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLocationGathering:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    return-void
.end method

.method static synthetic access$1000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/SbICamera;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    return-object p0
.end method

.method static synthetic access$1102(Lcom/scandit/barcodepicker/internal/EngineThread;Z)Z
    .locals 0

    .line 64
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScannerSettingsModified:Z

    return p1
.end method

.method static synthetic access$1200(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/internal/FocusStateMachine;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    return-object p0
.end method

.method static synthetic access$1202(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/FocusStateMachine;)Lcom/scandit/barcodepicker/internal/FocusStateMachine;
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    return-object p1
.end method

.method static synthetic access$1300(Lcom/scandit/barcodepicker/internal/EngineThread;)I
    .locals 0

    .line 64
    iget p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mWorkingRange:I

    return p0
.end method

.method static synthetic access$1400(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/EngineSetupParams;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->initializeReader(Lcom/scandit/barcodepicker/internal/EngineSetupParams;)V

    return-void
.end method

.method static synthetic access$1600(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/base/camera/SbIVideoPreview;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewSurface(Lcom/scandit/base/camera/SbIVideoPreview;)V

    return-void
.end method

.method static synthetic access$1700(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->processFrame(Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;)V

    return-void
.end method

.method static synthetic access$1800(Lcom/scandit/barcodepicker/internal/EngineThread;ILjava/lang/Runnable;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1, p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->changeScanState(ILjava/lang/Runnable;)V

    return-void
.end method

.method static synthetic access$1900(Lcom/scandit/barcodepicker/internal/EngineThread;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setCameraFacing(I)V

    return-void
.end method

.method static synthetic access$200(Lcom/scandit/barcodepicker/internal/EngineThread;)Landroid/os/Handler;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic access$2000(Lcom/scandit/barcodepicker/internal/EngineThread;Landroid/graphics/PointF;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->focusAtPoint(Landroid/graphics/PointF;)V

    return-void
.end method

.method static synthetic access$2100(Lcom/scandit/barcodepicker/internal/EngineThread;Z)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->switchTorchOn(Z)V

    return-void
.end method

.method static synthetic access$2200(Lcom/scandit/barcodepicker/internal/EngineThread;F)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setRelativeZoom(F)V

    return-void
.end method

.method static synthetic access$2300(Lcom/scandit/barcodepicker/internal/EngineThread;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setAbsoluteZoom(I)V

    return-void
.end method

.method static synthetic access$2400(Lcom/scandit/barcodepicker/internal/EngineThread;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->resetEngine()V

    return-void
.end method

.method static synthetic access$2500(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mOnScanListeners:Lcom/scandit/barcodepicker/ListenerList;

    return-object p0
.end method

.method static synthetic access$2600(Lcom/scandit/barcodepicker/internal/EngineThread;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->checkOrientation()V

    return-void
.end method

.method static synthetic access$2700(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setScanSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    return-void
.end method

.method static synthetic access$2800(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setProcessFrameCallback(Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;)V

    return-void
.end method

.method static synthetic access$2900(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mExternalProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;

    return-object p0
.end method

.method static synthetic access$300(Lcom/scandit/barcodepicker/internal/EngineThread;)Z
    .locals 0

    .line 64
    iget-boolean p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessFrames:Z

    return p0
.end method

.method static synthetic access$3000(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;

    return-object p0
.end method

.method static synthetic access$3100(Lcom/scandit/barcodepicker/internal/EngineThread;)Z
    .locals 0

    .line 64
    iget-boolean p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCurrentlyProcessingFrame:Z

    return p0
.end method

.method static synthetic access$3200(Lcom/scandit/barcodepicker/internal/EngineThread;I)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setRecognitionMode(I)V

    return-void
.end method

.method static synthetic access$3300(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mStateChangeListeners:Lcom/scandit/barcodepicker/ListenerList;

    return-object p0
.end method

.method static synthetic access$3400(Lcom/scandit/barcodepicker/internal/EngineThread;)Ljava/util/ArrayList;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnApplySettings:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$3500(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ListenerList;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextRecognitionListeners:Lcom/scandit/barcodepicker/ListenerList;

    return-object p0
.end method

.method static synthetic access$400(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/internal/ScanSessionImpl;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    return-object p0
.end method

.method static synthetic access$500(Lcom/scandit/barcodepicker/internal/EngineThread;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$600(Lcom/scandit/barcodepicker/internal/EngineThread;Landroid/content/Context;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewRotation(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic access$700(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/recognition/RecognitionContext;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    return-object p0
.end method

.method static synthetic access$800(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/barcodepicker/ScanSettings;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    return-object p0
.end method

.method static synthetic access$900(Lcom/scandit/barcodepicker/internal/EngineThread;)Lcom/scandit/base/camera/profiles/DeviceProfile;
    .locals 0

    .line 64
    iget-object p0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    return-object p0
.end method

.method private applyHiddenScanSettings(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 4

    .line 719
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getProperties()Ljava/util/Map;

    move-result-object p1

    .line 721
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 722
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "exposureTargetBias"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 723
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    goto :goto_0

    .line 724
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "sendFramesToEngineAndLocation"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 725
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mSendToEngineAndLocation:Z

    goto :goto_0

    .line 726
    :cond_2
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "location_highlighting_only"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 727
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mInformScanListeners:Z

    goto :goto_0

    .line 728
    :cond_3
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "overrideResolution"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 729
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setResolutionMode(I)V

    goto :goto_0

    .line 732
    :cond_4
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {p1, v0}, Lcom/scandit/base/camera/SbICamera;->setExposureTargetBias(Ljava/lang/Float;)V

    return-void
.end method

.method private applyScanAreaToSettings(Lcom/scandit/barcodepicker/ScanAreaSettings;Lcom/scandit/recognition/BarcodeScannerSettings;)V
    .locals 1

    .line 738
    iget v0, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationConstraint:I

    invoke-virtual {p2, v0}, Lcom/scandit/recognition/BarcodeScannerSettings;->setCodeLocationConstraint1d(I)V

    .line 739
    iget v0, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationConstraint:I

    invoke-virtual {p2, v0}, Lcom/scandit/recognition/BarcodeScannerSettings;->setCodeLocationConstraint2d(I)V

    .line 740
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->searchArea:Landroid/graphics/RectF;

    invoke-virtual {p2, v0}, Lcom/scandit/recognition/BarcodeScannerSettings;->setSearchArea(Landroid/graphics/RectF;)V

    .line 741
    iget-object v0, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->wideCodeLocationArea:Landroid/graphics/RectF;

    invoke-virtual {p2, v0}, Lcom/scandit/recognition/BarcodeScannerSettings;->setCodeLocationArea1d(Landroid/graphics/RectF;)V

    .line 742
    iget-object p1, p1, Lcom/scandit/barcodepicker/ScanAreaSettings;->squareCodeLocationArea:Landroid/graphics/RectF;

    invoke-virtual {p2, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setCodeLocationArea2d(Landroid/graphics/RectF;)V

    return-void
.end method

.method private applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 4

    .line 693
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getCameraFacingPreference()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setCameraFacing(I)V

    .line 694
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getWorkingRange()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setWorkingRange(I)V

    .line 695
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getScanningHotSpot()Landroid/graphics/PointF;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setHotSpot(Landroid/graphics/PointF;)V

    .line 696
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getRelativeZoom()F

    move-result v0

    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setRelativeZoom(F)V

    .line 698
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->isHighDensityModeEnabled()Z

    move-result v0

    .line 700
    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setResolutionMode(I)V

    .line 701
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setActiveScanningAreaAndHotSpot(Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 703
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 704
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setDeviceName(Ljava/lang/String;)V

    .line 706
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getTextRecognitionSettings()Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/ocr/TextScanner;->setSettings(Lcom/scandit/barcodepicker/ocr/TextRecognitionSettings;)V

    .line 707
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getRecognitionMode()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setRecognitionMode(I)V

    .line 708
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->applyHiddenScanSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    const/4 v0, 0x1

    .line 709
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScannerSettingsModified:Z

    .line 710
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    const-string v2, "sensor_orientation_override_back"

    .line 711
    invoke-virtual {p1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result v2

    const-string v3, "sensor_orientation_override_front"

    .line 712
    invoke-virtual {p1, v3}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result v3

    .line 710
    invoke-virtual {v1, v2, v3}, Lcom/scandit/base/camera/SbICamera;->setSensorOrientationOverride(II)V

    .line 713
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    const-string v2, "disable_auto_focus"

    invoke-virtual {p1, v2}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Lcom/scandit/base/camera/SbICamera;->setDisableAutoFocus(Z)V

    .line 715
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->isMatrixScanEnabled()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setTrackingEnabled(Z)V

    return-void
.end method

.method private changeScanState(ILjava/lang/Runnable;)V
    .locals 2

    .line 357
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    if-eqz v0, :cond_0

    .line 358
    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;->onScanStateChanged(I)V

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    .line 382
    :pswitch_0
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessFrames:Z

    .line 383
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-virtual {p1}, Lcom/scandit/recognition/RecognitionContext;->startNewFrameSequence()V

    .line 390
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mOnScanListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ListenerList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 391
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->clear()V

    goto :goto_0

    .line 393
    :cond_1
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->partialClear()V

    :goto_0
    if-eqz p2, :cond_2

    .line 396
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    .line 378
    :pswitch_1
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->doStopScanning()V

    .line 379
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->doCloseCamera()V

    goto :goto_1

    .line 373
    :pswitch_2
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnNexFrame:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-virtual {p1}, Lcom/scandit/recognition/RecognitionContext;->startNewFrameSequence()V

    .line 375
    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->doStartScanning(Z)V

    goto :goto_1

    .line 368
    :pswitch_3
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnNexFrame:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-virtual {p1}, Lcom/scandit/recognition/RecognitionContext;->startNewFrameSequence()V

    .line 370
    invoke-direct {p0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->doStartScanning(Z)V

    goto :goto_1

    .line 362
    :pswitch_4
    iput-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessFrames:Z

    if-eqz p2, :cond_2

    .line 364
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private checkOrientation()V
    .locals 4

    .line 1059
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_1

    .line 1061
    invoke-static {v0}, Lcom/scandit/base/system/SbSystemUtils;->getDisplayRotation(Landroid/content/Context;)I

    move-result v1

    .line 1062
    iget v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLastRotation:I

    if-eq v1, v2, :cond_0

    .line 1063
    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewRotation(Landroid/content/Context;)V

    .line 1064
    iput v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLastRotation:I

    .line 1065
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    if-eqz v0, :cond_0

    .line 1066
    invoke-interface {v0}, Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;->onOrientationChange()V

    .line 1069
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x20

    const-wide/16 v2, 0x3c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    return-void
.end method

.method private convertAngleToCodeDirectionHint(IZ)I
    .locals 2

    .line 1149
    rem-int/lit8 v0, p1, 0x5a

    if-nez v0, :cond_a

    if-ltz p1, :cond_a

    const/16 v0, 0xb4

    if-eqz p2, :cond_2

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1156
    :cond_0
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_VERTICAL:I

    return p1

    .line 1154
    :cond_1
    :goto_0
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_HORIZONTAL:I

    return p1

    .line 1158
    :cond_2
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {p2}, Lcom/scandit/base/camera/SbICamera;->getCameraFacing()Lcom/scandit/base/camera/SbICamera$CameraFacing;

    move-result-object p2

    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    if-ne p2, v1, :cond_3

    const/4 p2, 0x1

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    if-eqz p1, :cond_9

    const/16 v1, 0x5a

    if-eq p1, v1, :cond_7

    if-eq p1, v0, :cond_6

    const/16 v0, 0x10e

    if-eq p1, v0, :cond_4

    .line 1174
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_NONE:I

    return p1

    :cond_4
    if-eqz p2, :cond_5

    .line 1170
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_BOTTOM_TO_TOP:I

    goto :goto_2

    :cond_5
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_TOP_TO_BOTTOM:I

    :goto_2
    return p1

    .line 1168
    :cond_6
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_RIGHT_TO_LEFT:I

    return p1

    :cond_7
    if-eqz p2, :cond_8

    .line 1164
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_TOP_TO_BOTTOM:I

    goto :goto_3

    :cond_8
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_BOTTOM_TO_TOP:I

    :goto_3
    return p1

    .line 1162
    :cond_9
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_LEFT_TO_RIGHT:I

    return p1

    .line 1150
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "rotation must be a multiple of 90 and larger or equal to zero"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private convertAngleToDeviceOrientation(I)I
    .locals 2

    .line 1179
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->getCameraFacing()Lcom/scandit/base/camera/SbICamera$CameraFacing;

    move-result-object v0

    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_6

    const/16 v1, 0x5a

    if-eq p1, v1, :cond_4

    const/16 v1, 0xb4

    if-eq p1, v1, :cond_3

    const/16 v1, 0x10e

    if-eq p1, v1, :cond_1

    .line 1194
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_DEVICE_ORIENTATION_UNKNOWN_get()I

    move-result p1

    return p1

    :cond_1
    if-eqz v0, :cond_2

    .line 1191
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_DEVICE_ORIENTATION_PORTRAIT_get()I

    move-result p1

    goto :goto_1

    .line 1192
    :cond_2
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_DEVICE_ORIENTATION_PORTRAIT_UPSIDE_DOWN_get()I

    move-result p1

    :goto_1
    return p1

    .line 1188
    :cond_3
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_DEVICE_ORIENTATION_LANDSCAPE_LEFT_get()I

    move-result p1

    return p1

    :cond_4
    if-eqz v0, :cond_5

    .line 1185
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_DEVICE_ORIENTATION_PORTRAIT_UPSIDE_DOWN_get()I

    move-result p1

    goto :goto_2

    .line 1186
    :cond_5
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_DEVICE_ORIENTATION_PORTRAIT_get()I

    move-result p1

    :goto_2
    return p1

    .line 1182
    :cond_6
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_DEVICE_ORIENTATION_LANDSCAPE_RIGHT_get()I

    move-result p1

    return p1
.end method

.method private doCloseCamera()V
    .locals 1

    .line 403
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->close()V

    return-void
.end method

.method private doStartScanning(Z)V
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->reset()V

    .line 418
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->startCamera()V

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 420
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessFrames:Z

    :cond_0
    return-void
.end method

.method private doStopScanning()V
    .locals 2

    const/4 v0, 0x0

    .line 407
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessFrames:Z

    .line 408
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->stop()V

    .line 409
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-virtual {v0}, Lcom/scandit/recognition/RecognitionContext;->endFrameSequence()V

    .line 413
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method private focusAtPoint(Landroid/graphics/PointF;)V
    .locals 2

    .line 1079
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    if-eqz v0, :cond_0

    .line 1080
    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, p1}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->manualFocusAtPoint(FF)V

    :cond_0
    return-void
.end method

.method public static getInstance()Lcom/scandit/barcodepicker/internal/EngineThread;
    .locals 2

    .line 111
    sget-object v0, Lcom/scandit/barcodepicker/internal/EngineThread;->sInstanceReference:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 112
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/EngineThread;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 115
    new-instance v0, Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;-><init>()V

    .line 116
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Lcom/scandit/barcodepicker/internal/EngineThread;->sInstanceReference:Ljava/lang/ref/WeakReference;

    :cond_1
    return-object v0
.end method

.method private handlePauseStopByUser()Z
    .locals 4

    .line 566
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->hasUserRequestedStop()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 567
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->clear()V

    const/4 v0, 0x3

    .line 568
    invoke-direct {p0, v0, v2}, Lcom/scandit/barcodepicker/internal/EngineThread;->changeScanState(ILjava/lang/Runnable;)V

    return v1

    .line 571
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->hasUserRequestedPause()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    .line 572
    invoke-direct {p0, v3, v2}, Lcom/scandit/barcodepicker/internal/EngineThread;->changeScanState(ILjava/lang/Runnable;)V

    .line 573
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->resetUserRequests()V

    return v1

    :cond_1
    return v3
.end method

.method private informOnScanListeners()V
    .locals 3

    .line 580
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mInformScanListeners:Z

    if-nez v0, :cond_0

    return-void

    .line 584
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->hasNewlyDecodedCodes()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 587
    :cond_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setRejectionEnabled(Z)V

    .line 588
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mOnScanListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ListenerList;->getNonNullList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/barcodepicker/OnScanListener;

    .line 589
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-interface {v1, v2}, Lcom/scandit/barcodepicker/OnScanListener;->didScan(Lcom/scandit/barcodepicker/ScanSession;)V

    .line 590
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->handlePauseStopByUser()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 592
    :cond_3
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setRejectionEnabled(Z)V

    return-void
.end method

.method private informProcessingListeners(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;)V
    .locals 2

    .line 548
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ListenerList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mExternalProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ListenerList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 551
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setTrackingRejectionEnabled(Z)V

    .line 552
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mExternalProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-direct {p0, p1, p2, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->informProcessingListeners(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;Lcom/scandit/barcodepicker/ListenerList;)V

    .line 553
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessingListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-direct {p0, p1, p2, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->informProcessingListeners(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;Lcom/scandit/barcodepicker/ListenerList;)V

    .line 554
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setTrackingRejectionEnabled(Z)V

    return-void
.end method

.method private informProcessingListeners(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;Lcom/scandit/barcodepicker/ListenerList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/scandit/base/camera/capturedImage/ImageBuffer;",
            "Lcom/scandit/base/camera/capturedImage/ImageMetadata;",
            "Lcom/scandit/barcodepicker/ListenerList<",
            "Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;",
            ">;)V"
        }
    .end annotation

    .line 559
    invoke-virtual {p3}, Lcom/scandit/barcodepicker/ListenerList;->getNonNullList()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;

    .line 560
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-interface {v0, p1, p2, v1}, Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;->didProcess(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;Lcom/scandit/barcodepicker/ScanSession;)V

    .line 561
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->handlePauseStopByUser()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method

.method private informPropertyChangeListeners(II)V
    .locals 2

    .line 1269
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mStateChangeListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ListenerList;->getNonNullList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scandit/barcodepicker/PropertyChangeListener;

    .line 1270
    invoke-interface {v1, p1, p2}, Lcom/scandit/barcodepicker/PropertyChangeListener;->onPropertyChange(II)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private informUpdateCallback(Lcom/scandit/recognition/ContextStatusException;)V
    .locals 1

    .line 538
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    .line 540
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;->onFrameCompleted(Lcom/scandit/barcodepicker/ScanSession;)V

    goto :goto_0

    .line 542
    :cond_0
    invoke-interface {v0, p1}, Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;->onError(Lcom/scandit/recognition/ContextStatusException;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private initializeReader(Lcom/scandit/barcodepicker/internal/EngineSetupParams;)V
    .locals 7

    .line 643
    iget-object v0, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->context:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    .line 644
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    .line 645
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mOnScanListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-virtual {v1}, Lcom/scandit/barcodepicker/ListenerList;->clear()V

    const/4 v1, -0x1

    .line 646
    iput v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLastRotation:I

    .line 647
    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    .line 649
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->scanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-static {v0, v1}, Lcom/scandit/base/camera/SbICamera;->create(Landroid/content/Context;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/base/camera/SbICamera;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    .line 650
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCameraEventListener:Lcom/scandit/barcodepicker/internal/EngineThread$CameraEventListener;

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/SbICamera;->addListener(Lcom/scandit/base/camera/SbCameraListener;)V

    .line 651
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    iget-object v1, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->deviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mPreviewCallback:Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;

    invoke-virtual {v0, v1, v2}, Lcom/scandit/base/camera/SbICamera;->initialize(Lcom/scandit/base/camera/profiles/DeviceProfile;Lcom/scandit/base/camera/SbPreviewCallback;)V

    .line 652
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/SbICamera;->setTorchState(I)V

    .line 654
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    .line 655
    iget-object v2, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->scanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {v2}, Lcom/scandit/barcodepicker/ScanSettings;->getCameraFacingPreference()I

    move-result v2

    if-ne v2, v1, :cond_0

    .line 656
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    .line 658
    :cond_0
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v1, v0}, Lcom/scandit/base/camera/SbICamera;->setCameraFacing(Lcom/scandit/base/camera/SbICamera$CameraFacing;)V

    .line 660
    iget-object v0, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->deviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 661
    iget-boolean v0, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->isLegacy:Z

    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mIsLegacy:Z

    .line 662
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    if-nez v0, :cond_1

    .line 663
    sget-object v0, Lcom/scandit/barcodepicker/internal/ScanditSDKGlobals;->usedFramework:Ljava/lang/String;

    invoke-static {v0}, Lcom/scandit/recognition/RecognitionContext;->setFrameworkName(Ljava/lang/String;)V

    .line 664
    iget-object v0, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->context:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->appKey:Ljava/lang/String;

    iget-object v2, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->workingDirectory:Ljava/io/File;

    invoke-static {v0, v1, v2}, Lcom/scandit/recognition/RecognitionContext;->create(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Lcom/scandit/recognition/RecognitionContext;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    .line 666
    invoke-static {}, Lcom/scandit/barcodepicker/ScanSettings;->create()Lcom/scandit/barcodepicker/ScanSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    .line 668
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    .line 669
    invoke-virtual {v1}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object v1

    .line 668
    invoke-static {v0, v1}, Lcom/scandit/recognition/BarcodeScanner;->create(Lcom/scandit/recognition/RecognitionContext;Lcom/scandit/recognition/BarcodeScannerSettings;)Lcom/scandit/recognition/BarcodeScanner;

    move-result-object v0

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mBarcodeScanner:Lcom/scandit/recognition/BarcodeScanner;

    .line 670
    new-instance v0, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mBarcodeScanner:Lcom/scandit/recognition/BarcodeScanner;

    invoke-virtual {v1}, Lcom/scandit/recognition/BarcodeScanner;->getSession()Lcom/scandit/recognition/BarcodeScannerSession;

    move-result-object v1

    new-instance v2, Lcom/scandit/recognition/ObjectTracker;

    iget-object v3, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-direct {v2, v3}, Lcom/scandit/recognition/ObjectTracker;-><init>(Lcom/scandit/recognition/RecognitionContext;)V

    invoke-direct {v0, v1, v2}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;-><init>(Lcom/scandit/recognition/BarcodeScannerSession;Lcom/scandit/recognition/ObjectTracker;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    .line 673
    :cond_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    if-nez v0, :cond_2

    .line 674
    new-instance v0, Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    iget-object v2, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->context:Ljava/lang/ref/WeakReference;

    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    iget-object v5, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    new-instance v6, Lcom/scandit/barcodepicker/internal/EngineThread$1;

    invoke-direct {v6, p0}, Lcom/scandit/barcodepicker/internal/EngineThread$1;-><init>(Lcom/scandit/barcodepicker/internal/EngineThread;)V

    move-object v1, v0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/scandit/barcodepicker/internal/ocr/TextScanner;-><init>(Ljava/lang/ref/WeakReference;Lcom/scandit/barcodepicker/internal/EngineSetupParams;Lcom/scandit/recognition/RecognitionContext;Lcom/scandit/barcodepicker/internal/ScanSessionImpl;Lcom/scandit/barcodepicker/internal/Scanner$ProcessingCallback;)V

    iput-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    .line 682
    :try_start_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ocr/TextScanner;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 684
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const/4 v0, 0x2

    .line 686
    iput v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionMode:I

    .line 688
    :cond_2
    iget-object p1, p1, Lcom/scandit/barcodepicker/internal/EngineSetupParams;->scanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setScanSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    return-void
.end method

.method private processFrame(Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;)V
    .locals 7

    .line 427
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    if-nez v0, :cond_0

    return-void

    .line 430
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnNexFrame:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    if-eqz v1, :cond_1

    .line 432
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 435
    :cond_2
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnNexFrame:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 436
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScannerSettingsModified:Z

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    .line 437
    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScannerSettingsModified:Z

    .line 438
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mBarcodeScanner:Lcom/scandit/recognition/BarcodeScanner;

    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {v1}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/recognition/BarcodeScanner;->applySettings(Lcom/scandit/recognition/BarcodeScannerSettings;)V

    .line 439
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnApplySettings:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    if-eqz v1, :cond_3

    .line 441
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_1

    .line 444
    :cond_4
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRunnablesToBeInvokedOnApplySettings:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 452
    :cond_5
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessFrames:Z

    if-nez v0, :cond_6

    .line 453
    iget-object p1, p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->buffer:Lcom/scandit/base/camera/capturedImage/ImageBuffer;

    invoke-interface {p1}, Lcom/scandit/base/camera/capturedImage/ImageBuffer;->release()V

    return-void

    .line 456
    :cond_6
    iget v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionMode:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-ne v0, v1, :cond_8

    .line 459
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFrameToggleForCombinedOCRAndBarcodeMode:Z

    xor-int/2addr v0, v2

    iput-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFrameToggleForCombinedOCRAndBarcodeMode:Z

    .line 460
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFrameToggleForCombinedOCRAndBarcodeMode:Z

    if-eqz v0, :cond_7

    move v0, v2

    goto :goto_2

    :cond_7
    const/4 v0, 0x2

    .line 463
    :cond_8
    :goto_2
    iget-object v1, p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->buffer:Lcom/scandit/base/camera/capturedImage/ImageBuffer;

    invoke-interface {v1}, Lcom/scandit/base/camera/capturedImage/ImageBuffer;->getLegacyRepresentation()Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;

    move-result-object v1

    const/4 v3, 0x0

    .line 466
    :try_start_0
    iget-boolean v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mSendToEngineAndLocation:Z

    if-eqz v4, :cond_a

    .line 467
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->updateLocation()V

    if-ne v0, v2, :cond_9

    .line 469
    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    if-eqz v4, :cond_a

    .line 470
    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    iget v5, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mBufferToNaturalOrientationRotation:I

    invoke-virtual {v4, p1, v5}, Lcom/scandit/barcodepicker/internal/ocr/TextScanner;->processFrameAsync(Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;I)V

    .line 471
    iget-object v4, p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->buffer:Lcom/scandit/base/camera/capturedImage/ImageBuffer;

    invoke-interface {v4}, Lcom/scandit/base/camera/capturedImage/ImageBuffer;->isReleased()Z

    move-result v4

    iput-boolean v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCurrentlyProcessingFrame:Z

    goto :goto_3

    .line 474
    :cond_9
    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v4, v3}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setNewlyRecognizedText(Lcom/scandit/barcodepicker/ocr/RecognizedText;)V

    .line 476
    iget-object v4, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    iget-object v5, v1, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->description:Lcom/scandit/recognition/ImageDescription;

    iget-object v6, v1, Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;->buffer:[B

    invoke-virtual {v4, v5, v6}, Lcom/scandit/recognition/RecognitionContext;->processFrame(Lcom/scandit/recognition/ImageDescription;[B)V
    :try_end_0
    .catch Lcom/scandit/recognition/ContextStatusException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v3

    :cond_a
    :goto_3
    if-eq v0, v2, :cond_b

    .line 484
    invoke-virtual {p0, p1, v1, v3}, Lcom/scandit/barcodepicker/internal/EngineThread;->finishedProcessingFrame(Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;Lcom/scandit/recognition/ContextStatusException;)V

    goto :goto_4

    :cond_b
    if-eqz v3, :cond_c

    .line 486
    invoke-direct {p0, v3}, Lcom/scandit/barcodepicker/internal/EngineThread;->informUpdateCallback(Lcom/scandit/recognition/ContextStatusException;)V

    :cond_c
    :goto_4
    return-void
.end method

.method private readdPendingCallbackBuffersAsync()V
    .locals 2

    .line 284
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x1b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method private removePendingFramesAsync()V
    .locals 2

    .line 279
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method private resetEngine()V
    .locals 1

    .line 1075
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-virtual {v0}, Lcom/scandit/recognition/RecognitionContext;->startNewFrameSequence()V

    return-void
.end method

.method private setAbsoluteZoom(I)V
    .locals 1

    .line 1284
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/SbICamera;->setAbsoluteZoom(I)V

    return-void
.end method

.method private setActiveScanningAreaAndHotSpot(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 5

    .line 748
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 749
    iget-boolean v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mIsLegacy:Z

    if-nez v1, :cond_0

    .line 750
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v1, v0}, Lcom/scandit/base/camera/SbICamera;->getBufferToSurfaceOrientation(Landroid/content/Context;)I

    move-result v1

    goto :goto_0

    :cond_0
    const/16 v1, 0x5a

    .line 752
    :goto_0
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    neg-int v1, v1

    int-to-float v1, v1

    const/high16 v3, 0x3f000000    # 0.5f

    .line 753
    invoke-virtual {v2, v1, v3, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 754
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v1}, Lcom/scandit/base/camera/SbICamera;->getCameraFacing()Lcom/scandit/base/camera/SbICamera$CameraFacing;

    move-result-object v1

    sget-object v4, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    if-ne v1, v4, :cond_1

    const/high16 v1, -0x40800000    # -1.0f

    const/high16 v4, 0x3f800000    # 1.0f

    .line 755
    invoke-virtual {v2, v1, v4, v3, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 759
    :cond_1
    invoke-static {v0, v2, p1}, Lcom/scandit/barcodepicker/internal/ScanAreaSetup;->getTransformedScanAreaSettings(Landroid/content/Context;Landroid/graphics/Matrix;Lcom/scandit/barcodepicker/ScanSettings;)Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    .line 760
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->applyScanAreaToSettings(Lcom/scandit/barcodepicker/ScanAreaSettings;Lcom/scandit/recognition/BarcodeScannerSettings;)V

    .line 762
    invoke-virtual {p1}, Lcom/scandit/barcodepicker/ScanSettings;->getScanningHotSpot()Landroid/graphics/PointF;

    move-result-object p1

    const/4 v0, 0x2

    .line 763
    new-array v0, v0, [F

    const/4 v1, 0x0

    iget v3, p1, Landroid/graphics/PointF;->x:F

    aput v3, v0, v1

    const/4 v1, 0x1

    iget v3, p1, Landroid/graphics/PointF;->y:F

    aput v3, v0, v1

    .line 764
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 765
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextScanner:Lcom/scandit/barcodepicker/internal/ocr/TextScanner;

    if-eqz v0, :cond_2

    .line 766
    invoke-virtual {v0, v2}, Lcom/scandit/barcodepicker/internal/ocr/TextScanner;->setRelativeViewToImageTransform(Landroid/graphics/Matrix;)V

    .line 768
    :cond_2
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    if-eqz v0, :cond_3

    .line 769
    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, p1}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->setHotSpot(FF)V

    :cond_3
    return-void
.end method

.method private setCameraFacing(I)V
    .locals 3

    .line 1252
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->BACK:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 1254
    sget-object v0, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    .line 1256
    :cond_0
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v2}, Lcom/scandit/base/camera/SbICamera;->getCameraFacing()Lcom/scandit/base/camera/SbICamera$CameraFacing;

    move-result-object v2

    if-ne v0, v2, :cond_1

    return-void

    .line 1259
    :cond_1
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v2, v0}, Lcom/scandit/base/camera/SbICamera;->setCameraFacing(Lcom/scandit/base/camera/SbICamera$CameraFacing;)V

    .line 1261
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 1263
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v2, v0}, Lcom/scandit/base/camera/SbICamera;->restart(Landroid/content/Context;)V

    .line 1265
    :cond_2
    invoke-direct {p0, v1, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->informPropertyChangeListeners(II)V

    return-void
.end method

.method private setCodeDirectionHint(I)V
    .locals 1

    .line 1204
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanSettings;->getBarcodeScannerSettings()Lcom/scandit/recognition/BarcodeScannerSettings;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/scandit/recognition/BarcodeScannerSettings;->setCodeDirectionHint(I)V

    const/4 p1, 0x1

    .line 1205
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScannerSettingsModified:Z

    return-void
.end method

.method private setDeviceName(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 1123
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-virtual {v0}, Lcom/scandit/recognition/RecognitionContext;->getHandle()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_recognition_context_set_device_name(JLjava/lang/String;)V

    :cond_0
    return-void
.end method

.method private setDisplayOrientation(I)V
    .locals 2

    .line 1199
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-virtual {v0}, Lcom/scandit/recognition/RecognitionContext;->getHandle()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/scandit/recognition/Native;->sc_recognition_context_report_device_orientation(JI)V

    return-void
.end method

.method private setForce2dRecognition(Z)V
    .locals 2

    .line 774
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    const-string v1, "force_2d_recognition"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/scandit/barcodepicker/ScanSettings;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 775
    iput-boolean p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScannerSettingsModified:Z

    return-void
.end method

.method private setPreviewRotation(Landroid/content/Context;)V
    .locals 3

    .line 1209
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mIsLegacy:Z

    if-eqz v0, :cond_0

    .line 1213
    sget p1, Lcom/scandit/recognition/BarcodeScanner;->CODE_DIRECTION_BOTTOM_TO_TOP:I

    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setCodeDirectionHint(I)V

    .line 1214
    invoke-static {}, Lcom/scandit/recognition/Native;->SC_DEVICE_ORIENTATION_PORTRAIT_get()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setDisplayOrientation(I)V

    .line 1215
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setActiveScanningAreaAndHotSpot(Lcom/scandit/barcodepicker/ScanSettings;)V

    return-void

    .line 1218
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/SbICamera;->setDisplayOrientation(Landroid/content/Context;)V

    .line 1219
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    const-string v1, "reverseBlurryEnabled"

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/ScanSettings;->getProperty(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 1221
    :goto_0
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v2}, Lcom/scandit/base/camera/SbICamera;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1222
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v2, p1}, Lcom/scandit/base/camera/SbICamera;->getBufferToSurfaceOrientation(Landroid/content/Context;)I

    move-result p1

    .line 1224
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->useVerticalDirection()Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v0, p1, 0x5a

    .line 1225
    rem-int/lit16 v0, v0, 0x168

    goto :goto_1

    :cond_2
    move v1, v0

    move v0, p1

    .line 1229
    :goto_1
    invoke-direct {p0, v0, v1}, Lcom/scandit/barcodepicker/internal/EngineThread;->convertAngleToCodeDirectionHint(IZ)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setCodeDirectionHint(I)V

    .line 1231
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->convertAngleToDeviceOrientation(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->setDisplayOrientation(I)V

    .line 1232
    iput p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mBufferToNaturalOrientationRotation:I

    .line 1233
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0, p1}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setSensorToScreenAngle(I)V

    .line 1236
    :cond_3
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setActiveScanningAreaAndHotSpot(Lcom/scandit/barcodepicker/ScanSettings;)V

    return-void
.end method

.method private setPreviewSurface(Lcom/scandit/base/camera/SbIVideoPreview;)V
    .locals 1

    .line 1130
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    .line 1134
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mPreview:Lcom/scandit/base/camera/SbIVideoPreview;

    if-eqz p1, :cond_1

    .line 1135
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/SbICamera;->setPreviewSurface(Lcom/scandit/base/camera/SbIVideoPreview;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 1138
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->doStopScanning()V

    .line 1140
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    if-eqz p1, :cond_0

    .line 1141
    invoke-interface {p1}, Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;->onNoCameraAccess()V

    :cond_0
    return-void

    .line 1146
    :cond_1
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->doStopScanning()V

    return-void
.end method

.method private setProcessFrameCallback(Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    return-void
.end method

.method private setRecognitionMode(I)V
    .locals 1

    .line 1040
    iget v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionMode:I

    if-eq v0, p1, :cond_0

    .line 1041
    iput p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionMode:I

    .line 1042
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->clear()V

    const/4 v0, 0x2

    .line 1043
    invoke-direct {p0, v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->informPropertyChangeListeners(II)V

    :cond_0
    return-void
.end method

.method private setRelativeZoom(F)V
    .locals 2

    .line 1275
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    if-nez v0, :cond_0

    return-void

    .line 1278
    :cond_0
    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/SbICamera;->setRelativeZoom(F)V

    const/4 v0, 0x3

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr p1, v1

    .line 1280
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    .line 1279
    invoke-direct {p0, v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->informPropertyChangeListeners(II)V

    return-void
.end method

.method private setResolutionMode(I)V
    .locals 1

    .line 1113
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 1115
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/SbICamera;->setResolutionMode(I)V

    .line 1116
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 1117
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbICamera;->resetCallbackBuffers()V

    :cond_0
    return-void
.end method

.method private setScanLocation(Landroid/location/Location;)V
    .locals 4

    .line 1328
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLocationGathering:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    sget-object v1, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->IF_AVAILABLE:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    if-ne v0, v1, :cond_0

    if-eqz p1, :cond_0

    .line 1329
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    double-to-float v1, v1

    .line 1330
    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    double-to-float p1, v2

    .line 1329
    invoke-virtual {v0, v1, p1}, Lcom/scandit/recognition/RecognitionContext;->setGeographicalLocation(FF)V

    :cond_0
    return-void
.end method

.method private setScanSettings(Lcom/scandit/barcodepicker/ScanSettings;)V
    .locals 0

    .line 1048
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    .line 1050
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->applyScanSettings(Lcom/scandit/barcodepicker/ScanSettings;)V

    .line 1052
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    if-eqz p1, :cond_0

    .line 1054
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setPreviewRotation(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private startCamera()V
    .locals 2

    .line 780
    :try_start_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 782
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v1, v0}, Lcom/scandit/base/camera/SbICamera;->start(Landroid/content/Context;)V

    .line 783
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mIsLegacy:Z

    if-nez v0, :cond_0

    .line 784
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->checkOrientation()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-wide/16 v0, 0x1f4

    .line 789
    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 791
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 794
    :goto_0
    :try_start_2
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 796
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v1, v0}, Lcom/scandit/base/camera/SbICamera;->start(Landroid/content/Context;)V

    .line 797
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mIsLegacy:Z

    if-nez v0, :cond_0

    .line 798
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->checkOrientation()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception v0

    .line 802
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 803
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanStateUpdateCallback:Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;

    if-eqz v0, :cond_0

    .line 804
    invoke-interface {v0}, Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;->onNoCameraAccess()V

    :cond_0
    :goto_1
    return-void
.end method

.method private switchTorchOn(Z)V
    .locals 3

    .line 1289
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->isRunning()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-nez v0, :cond_1

    .line 1290
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/SbICamera;->setTorchState(I)V

    return-void

    :cond_1
    if-eqz p1, :cond_2

    .line 1294
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->getTorchState()I

    move-result v0

    if-ne v0, v2, :cond_3

    :cond_2
    if-nez p1, :cond_4

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    .line 1295
    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->getTorchState()I

    move-result v0

    if-eq v0, v1, :cond_4

    :cond_3
    return-void

    :cond_4
    if-eqz p1, :cond_5

    .line 1300
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0, v1}, Lcom/scandit/base/camera/SbICamera;->setTorchState(I)V

    goto :goto_1

    .line 1302
    :cond_5
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0, v2}, Lcom/scandit/base/camera/SbICamera;->setTorchState(I)V

    .line 1304
    :goto_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->requiresRestartOnTorchSwitch()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1305
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->removePendingFramesAsync()V

    .line 1308
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_6

    .line 1310
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v1, v0}, Lcom/scandit/base/camera/SbICamera;->restart(Landroid/content/Context;)V

    :cond_6
    const/4 v0, 0x0

    .line 1314
    invoke-direct {p0, v0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->informPropertyChangeListeners(II)V

    .line 1315
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbICamera;->requiresRestartOnTorchSwitch()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1316
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {p1}, Lcom/scandit/base/camera/SbICamera;->resetCallbackBuffers()V

    :cond_7
    return-void
.end method

.method private updateLocation()V
    .locals 6

    .line 614
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLocationGathering:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    sget-object v1, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->NO:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    if-ne v0, v1, :cond_0

    return-void

    .line 618
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 619
    iget-wide v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLastLocationPoll:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x2710

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    .line 621
    iget-object v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    if-eqz v2, :cond_1

    .line 623
    invoke-static {v2}, Lcom/scandit/barcodepicker/internal/location/LocationHub;->getLastKnownLocation(Landroid/content/Context;)Landroid/location/Location;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/scandit/barcodepicker/internal/EngineThread;->setScanLocation(Landroid/location/Location;)V

    .line 624
    iput-wide v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mLastLocationPoll:J

    :cond_1
    return-void
.end method

.method private useVerticalDirection()Z
    .locals 3

    .line 1240
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsLandscape()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    .line 1241
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsPortrait()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    if-nez v0, :cond_0

    return v1

    .line 1244
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mContext:Ljava/lang/ref/WeakReference;

    .line 1245
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/scandit/base/system/SbSystemUtils;->isDisplayLandscape(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    .line 1246
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsLandscape()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    .line 1247
    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanSettings;->getAreaSettingsPortrait()Lcom/scandit/barcodepicker/ScanAreaSettings;

    move-result-object v0

    :goto_0
    const/4 v2, 0x1

    if-eqz v0, :cond_2

    .line 1248
    iget v0, v0, Lcom/scandit/barcodepicker/ScanAreaSettings;->primaryDirection:I

    if-ne v0, v2, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method


# virtual methods
.method public addCameraListenerAsync(Lcom/scandit/base/camera/SbCameraListener;)V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x22

    .line 148
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 147
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public addExternalProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V
    .locals 2

    .line 175
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x29

    .line 176
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 175
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public addOnScanListenerAsync(Lcom/scandit/barcodepicker/OnScanListener;)V
    .locals 2

    .line 134
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x1e

    .line 135
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 134
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public addProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x2b

    .line 194
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 193
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public addPropertyChangeListenerAsync(Lcom/scandit/barcodepicker/PropertyChangeListener;)V
    .locals 2

    .line 230
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x31

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public addTextRecognitionListenerAsync(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V
    .locals 2

    .line 248
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x35

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public applyScanSettingsAsync(Lcom/scandit/barcodepicker/ScanSettings;Ljava/lang/Runnable;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 160
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x33

    invoke-virtual {v0, v1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 164
    :cond_0
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v0, 0x24

    .line 165
    invoke-virtual {p2, v0, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 164
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public autoFocusAtPointAsync(Landroid/graphics/PointF;)V
    .locals 2

    .line 327
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x16

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    return-void
.end method

.method public blockUntilCameraClosed(Ljava/lang/Runnable;)V
    .locals 3

    .line 201
    new-instance v0, Ljava/util/concurrent/CyclicBarrier;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/CyclicBarrier;-><init>(I)V

    .line 202
    iget-object v1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v2, 0x2e

    .line 203
    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    .line 202
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 207
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/CyclicBarrier;->await()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-eqz p1, :cond_0

    .line 212
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public finishedProcessingFrame(Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;Lcom/scandit/base/camera/capturedImage/ImageBuffer$LegacyRepresentation;Lcom/scandit/recognition/ContextStatusException;)V
    .locals 7

    .line 493
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->hasMacroMode()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    .line 494
    invoke-virtual {v0}, Lcom/scandit/base/camera/profiles/DeviceProfile;->isMacroDisabled()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 493
    :goto_0
    invoke-virtual {p2, v0}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->update(Z)Lcom/scandit/base/camera/SbFocusEvent;

    move-result-object p2

    .line 495
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0, p2}, Lcom/scandit/base/camera/SbICamera;->handleAutoFocusEvent(Lcom/scandit/base/camera/SbFocusEvent;)V

    .line 497
    iget-object p2, p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->metadata:Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    iget v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mBufferToNaturalOrientationRotation:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;->setBufferToNaturalOrientation(Ljava/lang/Integer;)V

    .line 498
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {p2}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->rememberRecognizedCodesForRejection()V

    .line 499
    iget-boolean p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mInformScanListeners:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {p2}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getNewlyRecognizedText()Lcom/scandit/barcodepicker/ocr/RecognizedText;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 502
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mTextRecognitionListeners:Lcom/scandit/barcodepicker/ListenerList;

    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ListenerList;->getNonNullList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move v3, v2

    move v4, v3

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;

    .line 503
    iget-object v6, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {v6}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->getNewlyRecognizedText()Lcom/scandit/barcodepicker/ocr/RecognizedText;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;->didRecognizeText(Lcom/scandit/barcodepicker/ocr/RecognizedText;)I

    move-result v5

    if-ne v5, v1, :cond_2

    move v3, v1

    :cond_2
    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    move v4, v1

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    .line 512
    invoke-direct {p0, v2, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->changeScanState(ILjava/lang/Runnable;)V

    :cond_4
    if-eqz v4, :cond_5

    const/4 p2, 0x3

    .line 515
    invoke-direct {p0, p2, v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->changeScanState(ILjava/lang/Runnable;)V

    .line 519
    :cond_5
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->isCodeRejectionEnabled()Z

    move-result p2

    if-nez p2, :cond_6

    .line 520
    invoke-direct {p0, p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->informUpdateCallback(Lcom/scandit/recognition/ContextStatusException;)V

    .line 522
    :cond_6
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->informOnScanListeners()V

    .line 523
    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {p2}, Lcom/scandit/barcodepicker/ScanSettings;->isCodeRejectionEnabled()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 528
    invoke-direct {p0, p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->informUpdateCallback(Lcom/scandit/recognition/ContextStatusException;)V

    .line 531
    :cond_7
    iget-object p2, p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->buffer:Lcom/scandit/base/camera/capturedImage/ImageBuffer;

    iget-object p3, p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->metadata:Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    invoke-direct {p0, p2, p3}, Lcom/scandit/barcodepicker/internal/EngineThread;->informProcessingListeners(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;)V

    .line 532
    iget-object p1, p1, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->buffer:Lcom/scandit/base/camera/capturedImage/ImageBuffer;

    invoke-interface {p1}, Lcom/scandit/base/camera/capturedImage/ImageBuffer;->release()V

    .line 533
    iput-boolean v2, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCurrentlyProcessingFrame:Z

    .line 534
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSession:Lcom/scandit/barcodepicker/internal/ScanSessionImpl;

    invoke-virtual {p1, v0}, Lcom/scandit/barcodepicker/internal/ScanSessionImpl;->setNewlyRecognizedText(Lcom/scandit/barcodepicker/ocr/RecognizedText;)V

    return-void
.end method

.method public getCameraFacingDirection()I
    .locals 2

    .line 289
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->getCameraFacing()Lcom/scandit/base/camera/SbICamera$CameraFacing;

    move-result-object v0

    sget-object v1, Lcom/scandit/base/camera/SbICamera$CameraFacing;->FRONT:Lcom/scandit/base/camera/SbICamera$CameraFacing;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getCurrentZoomFactor()F
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 225
    :cond_0
    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->getRelativeZoom()F

    move-result v0

    return v0
.end method

.method public getRecognitionMode()I
    .locals 1

    .line 218
    iget v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionMode:I

    return v0
.end method

.method public getTorchState()I
    .locals 1

    .line 296
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mCamera:Lcom/scandit/base/camera/SbICamera;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 299
    :cond_0
    invoke-virtual {v0}, Lcom/scandit/base/camera/SbICamera;->getTorchState()I

    move-result v0

    return v0
.end method

.method public initializeAsync(Lcom/scandit/barcodepicker/internal/EngineSetupParams;)V
    .locals 2

    .line 637
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->removePendingFramesAsync()V

    .line 638
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 639
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->readdPendingCallbackBuffersAsync()V

    return-void
.end method

.method public isLegacy()Z
    .locals 1

    .line 257
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mIsLegacy:Z

    return v0
.end method

.method public isScanning()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mProcessFrames:Z

    return v0
.end method

.method public pauseScanningAsync(Ljava/lang/Runnable;)V
    .locals 3

    .line 343
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->removePendingFramesAsync()V

    .line 344
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 346
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->readdPendingCallbackBuffersAsync()V

    return-void
.end method

.method public removeExternalProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V
    .locals 2

    .line 181
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x2a

    .line 182
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 181
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public removeOnScanListenerAsync(Lcom/scandit/barcodepicker/OnScanListener;)V
    .locals 2

    .line 169
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x26

    .line 170
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 169
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public removeProcessingListenerAsync(Lcom/scandit/barcodepicker/internal/InternalProcessFrameListener;)V
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x2c

    .line 188
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 187
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public removePropertyChangeListenerAsync(Lcom/scandit/barcodepicker/PropertyChangeListener;)V
    .locals 2

    .line 234
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x32

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public removeTextRecognitionListenerAsync(Lcom/scandit/barcodepicker/ocr/TextRecognitionListener;)V
    .locals 2

    .line 244
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x34

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public requiresInternetAccess()Z
    .locals 3

    .line 128
    invoke-static {}, Lcom/scandit/recognition/Native;->sc_license_name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Test"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mRecognitionContext:Lcom/scandit/recognition/RecognitionContext;

    .line 130
    invoke-virtual {v0}, Lcom/scandit/recognition/RecognitionContext;->getHandle()J

    move-result-wide v0

    invoke-static {}, Lcom/scandit/recognition/Native;->SC_SDK_FEATURE_ONLINE_VERIFICATION_get()I

    move-result v2

    .line 129
    invoke-static {v0, v1, v2}, Lcom/scandit/recognition/Native;->sc_recognition_context_has_feature(JI)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public resumeScanningAsync(Ljava/lang/Runnable;)V
    .locals 3

    .line 350
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->removePendingFramesAsync()V

    .line 351
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v1, v2, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 353
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->readdPendingCallbackBuffersAsync()V

    return-void
.end method

.method public setCameraFacingDirectionAsync(I)Z
    .locals 2

    .line 265
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mDeviceProfile:Lcom/scandit/base/camera/profiles/DeviceProfile;

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/profiles/DeviceProfile;->hasCamera(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 268
    :cond_0
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->removePendingFramesAsync()V

    .line 269
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x10

    .line 270
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 269
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 271
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->readdPendingCallbackBuffersAsync()V

    const/4 p1, 0x1

    return p1
.end method

.method public setHotSpot(Landroid/graphics/PointF;)V
    .locals 2

    .line 1085
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-virtual {v0}, Lcom/scandit/barcodepicker/ScanSettings;->getScanningHotSpot()Landroid/graphics/PointF;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1088
    :cond_0
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {v0, v1, p1}, Lcom/scandit/barcodepicker/ScanSettings;->setScanningHotSpot(FF)V

    .line 1090
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mScanSettings:Lcom/scandit/barcodepicker/ScanSettings;

    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->setActiveScanningAreaAndHotSpot(Lcom/scandit/barcodepicker/ScanSettings;)V

    return-void
.end method

.method public setPreviewRotationAsync(Landroid/content/Context;)V
    .locals 2

    .line 321
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 322
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 323
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public setPreviewSurfaceAsync(Lcom/scandit/base/camera/SbIVideoPreview;)V
    .locals 2

    .line 316
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 317
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public setRecognitionModeAsync(I)V
    .locals 3

    .line 141
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x30

    const/4 v2, 0x0

    .line 142
    invoke-virtual {v0, v1, p1, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    .line 141
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public setRelativeZoomAsync(F)V
    .locals 2

    .line 312
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/16 v1, 0x18

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public setScanStateUpdateCallbackAsync(Lcom/scandit/barcodepicker/internal/ScanStateUpdateCallback;)V
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x23

    .line 154
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 153
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public setWorkingRange(I)V
    .locals 3

    .line 1094
    iput p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mWorkingRange:I

    .line 1095
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    .line 1099
    sget v1, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_FAR:I

    sget v2, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_FULL:I

    invoke-virtual {v0, v1, v2}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->setFocusRange(II)V

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 1102
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mFocusStateMachine:Lcom/scandit/barcodepicker/internal/FocusStateMachine;

    sget v0, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_NEAR:I

    sget v1, Lcom/scandit/barcodepicker/internal/FocusOptions;->RANGE_FULL:I

    invoke-virtual {p1, v0, v1}, Lcom/scandit/barcodepicker/internal/FocusStateMachine;->setFocusRange(II)V

    :cond_2
    return-void
.end method

.method public startScanningAsync(ZLjava/lang/Runnable;)V
    .locals 3

    .line 331
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->removePendingFramesAsync()V

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-nez p1, :cond_0

    .line 333
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2, v0, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 336
    :cond_0
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {p1, v1, v2, v0, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 339
    :goto_0
    invoke-direct {p0}, Lcom/scandit/barcodepicker/internal/EngineThread;->readdPendingCallbackBuffersAsync()V

    return-void
.end method

.method public switchTorchOnAsync(Z)V
    .locals 2

    .line 308
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread;->mHandler:Landroid/os/Handler;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/16 v1, 0x17

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

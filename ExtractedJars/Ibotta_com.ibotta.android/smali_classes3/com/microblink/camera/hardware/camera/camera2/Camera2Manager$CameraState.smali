.class Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CameraState"
.end annotation


# instance fields
.field private mCanCloseImageReader:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mClosingCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public mContinuousAutofocusEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public mFrameGrabbingPaused:Z

.field public mLastFocusState:I

.field private mOpeningCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mPreviewActive:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public mResponsesSinceLastTorchRequest:Ljava/util/concurrent/atomic/AtomicInteger;

.field public mShouldImmediatelyCloseCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mStartingPreview:Z

.field public mTorchOn:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->this$0:Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->reset()V

    return-void
.end method

.method static synthetic access$1500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mClosingCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$1700(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mCanCloseImageReader:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mOpeningCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$2000(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mPreviewActive:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic access$500(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mStartingPreview:Z

    return p0
.end method

.method static synthetic access$502(Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mStartingPreview:Z

    return p1
.end method


# virtual methods
.method public reset()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mPreviewActive:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mOpeningCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mCanCloseImageReader:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mStartingPreview:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mTorchOn:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mContinuousAutofocusEnabled:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput v1, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mLastFocusState:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mResponsesSinceLastTorchRequest:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mShouldImmediatelyCloseCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/Camera2Manager$CameraState;->mClosingCamera:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

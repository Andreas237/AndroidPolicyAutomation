.class Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/util/pool/PoolObjectFactory;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

.field final synthetic val$bufferSize:I

.field final synthetic val$camera1Manager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

.field final synthetic val$frameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

.field final synthetic val$frameHeight:I

.field final synthetic val$frameWidth:I


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;Lcom/microblink/camera/hardware/camera/CameraFrameFactory;IIILcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$frameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    iput p3, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$frameWidth:I

    iput p4, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$frameHeight:I

    iput p5, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$bufferSize:I

    iput-object p6, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$camera1Manager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createPoolObject()Lcom/microblink/camera/util/pool/PoolObject;
    .locals 6

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$frameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    iget v1, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$frameWidth:I

    iget v2, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$frameHeight:I

    iget v3, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$bufferSize:I

    iget-object v4, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->this$0:Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;

    iget-object v5, p0, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool$1;->val$camera1Manager:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-virtual/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/CameraFrameFactory;->createCamera1Frame(IIILcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    move-result-object v0

    return-object v0
.end method

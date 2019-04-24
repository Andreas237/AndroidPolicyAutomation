.class Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/util/pool/PoolObjectFactory;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

.field final synthetic val$frameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;Lcom/microblink/camera/hardware/camera/CameraFrameFactory;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool$1;->this$0:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool$1;->val$frameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createPoolObject()Lcom/microblink/camera/util/pool/PoolObject;
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool$1;->val$frameFactory:Lcom/microblink/camera/hardware/camera/CameraFrameFactory;

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool$1;->this$0:Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;

    invoke-virtual {v0, v1}, Lcom/microblink/camera/hardware/camera/CameraFrameFactory;->createCamera2Frame(Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;)Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;

    move-result-object v0

    return-object v0
.end method

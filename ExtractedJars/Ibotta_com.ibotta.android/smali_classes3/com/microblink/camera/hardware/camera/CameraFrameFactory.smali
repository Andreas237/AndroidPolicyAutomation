.class public Lcom/microblink/camera/hardware/camera/CameraFrameFactory;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createCamera1Frame(IIILcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;
    .locals 7

    new-instance v6, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;

    move-object v0, v6

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFrame;-><init>(IIILcom/microblink/camera/hardware/camera/camera1/frame/Camera1PreviewFramePool;Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    return-object v6
.end method

.method public createCamera2Frame(Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;)Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;
    .locals 1

    new-instance v0, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;

    invoke-direct {v0, p1}, Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2Frame;-><init>(Lcom/microblink/camera/hardware/camera/camera2/frame/Camera2FramePool;)V

    return-object v0
.end method

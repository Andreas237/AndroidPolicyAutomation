.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

.field final synthetic val$height:I

.field final synthetic val$surface:Landroid/graphics/SurfaceTexture;

.field final synthetic val$width:I


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->val$surface:Landroid/graphics/SurfaceTexture;

    iput p3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->val$width:I

    iput p4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->val$height:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    new-instance v1, Lcom/microblink/camera/hardware/camera/CameraSurface;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->val$surface:Landroid/graphics/SurfaceTexture;

    iget v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->val$width:I

    iget v4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->val$height:I

    invoke-direct {v1, v2, v3, v4}, Lcom/microblink/camera/hardware/camera/CameraSurface;-><init>(Landroid/graphics/SurfaceTexture;II)V

    iput-object v1, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13$2;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$13;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    return-void
.end method

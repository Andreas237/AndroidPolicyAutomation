.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;

.field final synthetic val$h:I

.field final synthetic val$holder:Landroid/view/SurfaceHolder;

.field final synthetic val$w:I


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;Landroid/view/SurfaceHolder;II)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;

    iput-object p2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->val$holder:Landroid/view/SurfaceHolder;

    iput p3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->val$w:I

    iput p4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->val$h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    new-instance v1, Lcom/microblink/camera/hardware/camera/CameraSurface;

    iget-object v2, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->val$holder:Landroid/view/SurfaceHolder;

    iget v3, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->val$w:I

    iget v4, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->val$h:I

    invoke-direct {v1, v2, v3, v4}, Lcom/microblink/camera/hardware/camera/CameraSurface;-><init>(Landroid/view/SurfaceHolder;II)V

    iput-object v1, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mCameraSurface:Lcom/microblink/camera/hardware/camera/CameraSurface;

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12$1;->this$1:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$12;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->access$800(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V

    return-void
.end method

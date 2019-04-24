.class Lcom/microblink/camera/view/surface/CameraTextureView$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/view/surface/CameraTextureView;


# direct methods
.method constructor <init>(Lcom/microblink/camera/view/surface/CameraTextureView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraTextureView$3;->this$0:Lcom/microblink/camera/view/surface/CameraTextureView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraTextureView$3;->this$0:Lcom/microblink/camera/view/surface/CameraTextureView;

    invoke-virtual {v0}, Lcom/microblink/camera/view/surface/CameraTextureView;->requestLayout()V

    return-void
.end method

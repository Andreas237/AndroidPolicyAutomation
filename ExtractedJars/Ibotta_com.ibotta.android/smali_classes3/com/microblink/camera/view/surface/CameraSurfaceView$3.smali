.class Lcom/microblink/camera/view/surface/CameraSurfaceView$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;


# direct methods
.method constructor <init>(Lcom/microblink/camera/view/surface/CameraSurfaceView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$3;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/surface/CameraSurfaceView$3;->this$0:Lcom/microblink/camera/view/surface/CameraSurfaceView;

    invoke-virtual {v0}, Lcom/microblink/camera/view/surface/CameraSurfaceView;->requestLayout()V

    return-void
.end method

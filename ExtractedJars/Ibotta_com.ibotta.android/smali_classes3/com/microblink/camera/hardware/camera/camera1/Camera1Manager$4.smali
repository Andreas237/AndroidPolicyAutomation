.class Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager$4;->this$0:Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;

    iget-object v0, v0, Lcom/microblink/camera/hardware/camera/camera1/Camera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->startAccelerometer()V

    :cond_0
    return-void
.end method

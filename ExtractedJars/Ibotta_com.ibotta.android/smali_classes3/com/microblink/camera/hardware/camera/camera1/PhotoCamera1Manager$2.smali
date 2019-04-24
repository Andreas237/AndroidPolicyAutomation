.class Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->getFocusManager()Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager$2;->this$0:Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;

    iget-object v1, v1, Lcom/microblink/camera/hardware/camera/camera1/PhotoCamera1Manager;->mAccelManager:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/camera/hardware/camera/camera1/focus/IFocusManager;->resumeFocusing()V

    :cond_0
    return-void
.end method

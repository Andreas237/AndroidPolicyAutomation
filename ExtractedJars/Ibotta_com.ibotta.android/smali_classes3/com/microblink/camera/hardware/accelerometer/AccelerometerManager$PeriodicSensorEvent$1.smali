.class Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic this$1:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;


# direct methods
.method constructor <init>(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent$1;->this$1:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent$1;->this$1:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;

    iget-object v0, v0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;->this$0:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    iget-object v1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent$1;->this$1:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;

    invoke-static {v1}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;->access$000(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;)[F

    move-result-object v1

    invoke-static {v0, v1}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->access$100(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;[F)V

    return-void
.end method

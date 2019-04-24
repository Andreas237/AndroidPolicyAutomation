.class Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PeriodicSensorEvent"
.end annotation


# instance fields
.field private mNoAcc:[F

.field final synthetic this$0:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;


# direct methods
.method public constructor <init>(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;)V
    .locals 2

    iput-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;->this$0:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    const/4 p1, 0x3

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;->mNoAcc:[F

    iget-object p1, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;->mNoAcc:[F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, p1, v1

    const/4 v1, 0x1

    aput v0, p1, v1

    const/4 v1, 0x2

    aput v0, p1, v1

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;)[F
    .locals 0

    iget-object p0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;->mNoAcc:[F

    return-object p0
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;->this$0:Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;

    invoke-static {v0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;->access$200(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent$1;

    invoke-direct {v1, p0}, Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent$1;-><init>(Lcom/microblink/camera/hardware/accelerometer/AccelerometerManager$PeriodicSensorEvent;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

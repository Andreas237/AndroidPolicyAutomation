.class Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V
    .locals 1

    .line 212
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$a;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$a;->b:Ljava/lang/ref/WeakReference;

    .line 214
    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .line 218
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 6

    .line 221
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MySensorEventListener onSensorChanged"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    .line 223
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 224
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MySensorEventListener onSensorChanged activity null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    return-void

    .line 227
    :cond_0
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    .line 228
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v1, 0x0

    aget v0, v0, v1

    float-to-int v5, v0

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$a;->c:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I

    .line 230
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v4, v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;ILjava/lang/Object;)V

    .line 232
    :cond_1
    return-void
.end method

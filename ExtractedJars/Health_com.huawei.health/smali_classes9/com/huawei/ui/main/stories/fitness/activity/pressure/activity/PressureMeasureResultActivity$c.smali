.class Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)V
    .locals 1

    .line 385
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 386
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 387
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 390
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 391
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;

    .line 392
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 394
    :sswitch_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "200"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)V

    .line 396
    goto :goto_0

    .line 398
    :sswitch_1
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "100"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)V

    .line 400
    goto :goto_0

    .line 402
    :sswitch_2
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "1000"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/pressure/activity/PressureMeasureResultActivity;)V

    .line 404
    .line 408
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_1
        0xc8 -> :sswitch_0
        0x3e8 -> :sswitch_2
    .end sparse-switch
.end method

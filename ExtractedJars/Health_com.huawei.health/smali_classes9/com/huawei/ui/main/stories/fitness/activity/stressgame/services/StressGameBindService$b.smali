.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V
    .locals 1

    .line 142
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 143
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;->e:Ljava/lang/ref/WeakReference;

    .line 144
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;)V
    .locals 0

    .line 136
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    .line 148
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 149
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mConnectStateChangedReceiver : intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 151
    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 153
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/exb;->d(F)V

    .line 154
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 155
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u84dd\u7259\u65ad\u5f00 200"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 157
    :cond_0
    const-string v0, "com.huawei.bone.action.REQUEST_BIND_DEVICE"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 159
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-interface {v0, v1}, Lo/exb;->e(F)V

    goto :goto_0

    .line 162
    :cond_1
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BluetoothConnect mStressGameBindService == null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :cond_2
    :goto_0
    return-void
.end method

.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 1

    .line 1140
    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 1138
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;->d:Ljava/lang/ref/WeakReference;

    .line 1141
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;->d:Ljava/lang/ref/WeakReference;

    .line 1142
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 5

    .line 1157
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 1158
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1159
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CollectUICallback onSuccess null == mTrainDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1160
    return-void

    .line 1162
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1163
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bsp;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;

    invoke-direct {v3, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1164
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 5

    .line 1146
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 1147
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1148
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CollectUICallback onFailure null == mTrainDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    return-void

    .line 1151
    :cond_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1152
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bsp;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;

    invoke-direct {v3, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    invoke-interface {v0, v1, v2, v3}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1153
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 1136
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$b;->a(Ljava/lang/Boolean;)V

    return-void
.end method

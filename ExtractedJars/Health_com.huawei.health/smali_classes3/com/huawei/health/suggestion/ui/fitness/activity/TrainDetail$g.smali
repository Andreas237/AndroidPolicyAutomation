.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
    }
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V
    .locals 1

    .line 1171
    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 1169
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;->e:Ljava/lang/ref/WeakReference;

    .line 1172
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;->e:Ljava/lang/ref/WeakReference;

    .line 1173
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 7

    .line 1177
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1178
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 1179
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1180
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WorkoutUICallback onFailure null == mTrainDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1181
    return-void

    .line 1183
    :cond_0
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1184
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 1185
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 1187
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v5

    .line 1188
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "R011R"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1189
    if-eqz v5, :cond_2

    .line 1190
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1191
    const/4 v0, 0x1

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 1192
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1193
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1194
    goto :goto_0

    .line 1196
    :cond_1
    if-eqz v5, :cond_2

    .line 1197
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1198
    const/4 v0, 0x0

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 1199
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1200
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1203
    :cond_2
    :goto_0
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have local data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1204
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->F(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 1205
    goto :goto_1

    .line 1206
    :cond_3
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v5

    .line 1207
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->E(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 1208
    if-eqz v5, :cond_4

    .line 1209
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1210
    const/4 v0, 0x0

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 1211
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1212
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1215
    :cond_4
    :goto_1
    return-void
.end method

.method public b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 7

    .line 1220
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    .line 1221
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1222
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WorkoutUICallback onSuccess null == mTrainDetail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1223
    return-void

    .line 1226
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1227
    invoke-static {v4, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 1228
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 1229
    invoke-static {v4, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 1231
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v5

    .line 1232
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "R011R"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1233
    if-eqz v5, :cond_2

    .line 1234
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1235
    const/4 v0, 0x1

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 1236
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1237
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1238
    goto :goto_0

    .line 1240
    :cond_1
    if-eqz v5, :cond_2

    .line 1241
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1242
    const/4 v0, 0x0

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 1243
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1244
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1248
    :cond_2
    :goto_0
    goto :goto_1

    .line 1249
    :cond_3
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "---onSuccess FitWorkout==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1250
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->E(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)V

    .line 1251
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Landroid/os/Handler;

    move-result-object v5

    .line 1252
    if-eqz v5, :cond_4

    .line 1253
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1254
    const/4 v0, 0x0

    iput v0, v6, Landroid/os/Message;->arg1:I

    .line 1255
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1256
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1259
    :cond_4
    :goto_1
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 1167
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$g;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    return-void
.end method

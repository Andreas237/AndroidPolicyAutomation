.class Lo/bsq$3;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->a(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bui;

.field final synthetic c:Lo/bsq;

.field final synthetic d:Lcom/huawei/health/suggestion/model/WorkoutRecord;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 0

    .line 1254
    iput-object p1, p0, Lo/bsq$3;->c:Lo/bsq;

    iput-object p2, p0, Lo/bsq$3;->b:Lo/bui;

    iput-object p3, p0, Lo/bsq$3;->d:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 10

    .line 1263
    iget-object v0, p0, Lo/bsq$3;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$3;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1264
    iget-object v0, p0, Lo/bsq$3;->d:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v6

    .line 1265
    const-wide/16 v0, 0x3e8

    div-long v8, v6, v0

    .line 1266
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    const-wide/16 v1, 0x1

    sub-long v1, v8, v1

    const-wide/16 v3, 0x1

    add-long/2addr v3, v8

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->postFitnessHistoryRequest(JJI)V

    .line 1267
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1257
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postPlanProgress(String exerciseTime, final UICallback<String> callback):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1258
    iget-object v0, p0, Lo/bsq$3;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$3;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1259
    return-void
.end method

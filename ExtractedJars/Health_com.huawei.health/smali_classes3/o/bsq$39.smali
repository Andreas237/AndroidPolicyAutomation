.class Lo/bsq$39;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bui;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/bui;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/up/model/UserInfomation;

.field final synthetic e:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

.field final synthetic f:Ljava/lang/String;

.field final synthetic i:Ljava/lang/String;

.field final synthetic k:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bui;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/up/model/UserInfomation;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 3410
    iput-object p1, p0, Lo/bsq$39;->k:Lo/bsq;

    iput-object p2, p0, Lo/bsq$39;->e:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    iput-object p3, p0, Lo/bsq$39;->b:Lo/bui;

    iput-object p4, p0, Lo/bsq$39;->c:Ljava/lang/String;

    iput-object p5, p0, Lo/bsq$39;->a:Ljava/lang/String;

    iput-object p6, p0, Lo/bsq$39;->d:Lcom/huawei/up/model/UserInfomation;

    iput-object p7, p0, Lo/bsq$39;->f:Ljava/lang/String;

    iput-object p8, p0, Lo/bsq$39;->i:Ljava/lang/String;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 6

    .line 3425
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3426
    invoke-static {p1}, Lo/bso;->b(Lorg/json/JSONObject;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v5

    .line 3427
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 3428
    invoke-static {}, Lo/bse;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$39;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3430
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$39;->a:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$39;->d:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v2

    invoke-static {v2}, Lo/bsu;->e(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/bsq$39;->f:Ljava/lang/String;

    iget-object v4, p0, Lo/bsq$39;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bta;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3431
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->f()Lo/btg;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$39;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Lo/btg;->c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 3433
    :cond_0
    iget-object v0, p0, Lo/bsq$39;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$39;->k:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 3435
    :cond_1
    iget-object v0, p0, Lo/bsq$39;->e:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    if-eqz v0, :cond_2

    .line 3436
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess, workout from db is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3437
    iget-object v0, p0, Lo/bsq$39;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$39;->k:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$39;->e:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 3439
    :cond_2
    iget-object v0, p0, Lo/bsq$39;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$39;->k:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x270f

    invoke-static {v2}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x270f

    invoke-virtual {v0, v1, v3, v2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 3442
    :goto_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 3413
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkout(final String workoutId, final String version, final UICallback<FitWorkout> callback):"

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

    .line 3414
    iget-object v0, p0, Lo/bsq$39;->e:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    if-eqz v0, :cond_0

    .line 3415
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkout workout from db is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3416
    iget-object v0, p0, Lo/bsq$39;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$39;->k:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$39;->e:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 3418
    :cond_0
    iget-object v0, p0, Lo/bsq$39;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$39;->k:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 3421
    :goto_0
    return-void
.end method

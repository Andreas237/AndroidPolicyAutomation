.class Lo/bsq$33;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->a(Lcom/huawei/health/suggestion/model/RunPlanParams;Ljava/util/Map;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsq;

.field final synthetic c:Lo/bui;

.field final synthetic d:Lcom/huawei/health/suggestion/model/Plan;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 0

    .line 505
    iput-object p1, p0, Lo/bsq$33;->a:Lo/bsq;

    iput-object p2, p0, Lo/bsq$33;->c:Lo/bui;

    iput-object p3, p0, Lo/bsq$33;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 3

    .line 518
    iget-object v0, p0, Lo/bsq$33;->a:Lo/bsq;

    iget-object v1, p0, Lo/bsq$33;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-static {v0, v1}, Lo/bsq;->d(Lo/bsq;Lcom/huawei/health/suggestion/model/Plan;)V

    .line 519
    iget-object v0, p0, Lo/bsq$33;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$33;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$33;->d:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 520
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 508
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createRunPlan(final RunPlanParams planParams, final UICallback<Plan> callback):"

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

    .line 509
    const v0, 0x30d4a

    if-ne p1, v0, :cond_0

    .line 511
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->g()V

    .line 513
    :cond_0
    iget-object v0, p0, Lo/bsq$33;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$33;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 514
    return-void
.end method

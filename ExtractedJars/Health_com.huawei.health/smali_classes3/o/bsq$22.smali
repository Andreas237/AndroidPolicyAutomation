.class Lo/bsq$22;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->a(Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bui;

.field final synthetic c:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic d:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;)V
    .locals 0

    .line 2424
    iput-object p1, p0, Lo/bsq$22;->d:Lo/bsq;

    iput-object p2, p0, Lo/bsq$22;->b:Lo/bui;

    iput-object p3, p0, Lo/bsq$22;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 2434
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->i()V

    .line 2436
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$22;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "userBestRecords"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Lo/bsy;->d(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bsj;->e(Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanStat;)V

    .line 2437
    iget-object v0, p0, Lo/bsq$22;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$22;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v2

    iget-object v3, p0, Lo/bsq$22;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/bsj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2438
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 2427
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserBestRecords:"

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

    .line 2428
    iget-object v0, p0, Lo/bsq$22;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$22;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v2

    iget-object v3, p0, Lo/bsq$22;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lo/bsj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2429
    return-void
.end method

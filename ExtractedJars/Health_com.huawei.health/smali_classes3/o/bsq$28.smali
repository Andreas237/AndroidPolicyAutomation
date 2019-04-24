.class Lo/bsq$28;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->d(ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bui;

.field final synthetic c:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic d:I

.field final synthetic e:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;I)V
    .locals 0

    .line 2981
    iput-object p1, p0, Lo/bsq$28;->e:Lo/bsq;

    iput-object p2, p0, Lo/bsq$28;->a:Lo/bui;

    iput-object p3, p0, Lo/bsq$28;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput p4, p0, Lo/bsq$28;->d:I

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 5

    .line 2990
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryPlanStatistics success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2991
    iget-object v0, p0, Lo/bsq$28;->a:Lo/bui;

    iget-object v1, p0, Lo/bsq$28;->e:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$28;->e:Lo/bsq;

    iget-object v3, p0, Lo/bsq$28;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    iget v4, p0, Lo/bsq$28;->d:I

    invoke-static {v2, p1, v3, v4}, Lo/bsq;->d(Lo/bsq;Lorg/json/JSONObject;Lcom/huawei/health/suggestion/model/AccountInfo;I)Lcom/huawei/health/suggestion/model/PlanStatistics;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2992
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 2984
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryPlanStatistics fail errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2985
    iget-object v0, p0, Lo/bsq$28;->a:Lo/bui;

    iget-object v1, p0, Lo/bsq$28;->e:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$28;->e:Lo/bsq;

    iget-object v3, p0, Lo/bsq$28;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    iget v4, p0, Lo/bsq$28;->d:I

    invoke-static {v2, v3, v4}, Lo/bsq;->c(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;I)Lcom/huawei/health/suggestion/model/PlanStatistics;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2986
    return-void
.end method

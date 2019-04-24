.class Lo/bsq$20;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->g(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic c:Lo/bsq;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/bui;


# direct methods
.method constructor <init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;Lo/bui;)V
    .locals 0

    .line 2387
    iput-object p1, p0, Lo/bsq$20;->c:Lo/bsq;

    iput-object p2, p0, Lo/bsq$20;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p3, p0, Lo/bsq$20;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/bsq$20;->e:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 2397
    const-string v0, "count"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    .line 2398
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->q()Lo/btt;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$20;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$20;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lo/btt;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 2399
    iget-object v0, p0, Lo/bsq$20;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$20;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2400
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 2390
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryTrainCountByWorkoutId:"

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

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2391
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->q()Lo/btt;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$20;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$20;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/btt;->b(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 2392
    iget-object v0, p0, Lo/bsq$20;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$20;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2393
    return-void
.end method

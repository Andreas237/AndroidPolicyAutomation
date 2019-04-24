.class Lo/bsq$24;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->c(Ljava/lang/String;ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bui;

.field final synthetic b:Lo/bsq;

.field final synthetic c:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic d:I

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;ILo/bui;)V
    .locals 0

    .line 2456
    iput-object p1, p0, Lo/bsq$24;->b:Lo/bsq;

    iput-object p2, p0, Lo/bsq$24;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p3, p0, Lo/bsq$24;->e:Ljava/lang/String;

    iput p4, p0, Lo/bsq$24;->d:I

    iput-object p5, p0, Lo/bsq$24;->a:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 6

    .line 2466
    const-string v0, "userTrainBestRecords"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lo/bsy;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v4

    .line 2467
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->t()Lo/bss;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$24;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bss;->c(Ljava/lang/String;Ljava/util/List;)V

    .line 2468
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->o()V

    .line 2469
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->t()Lo/bss;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$24;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$24;->e:Ljava/lang/String;

    iget v3, p0, Lo/bsq$24;->d:I

    invoke-virtual {v0, v1, v2, v3}, Lo/bss;->e(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    .line 2470
    iget-object v0, p0, Lo/bsq$24;->a:Lo/bui;

    iget-object v1, p0, Lo/bsq$24;->b:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2471
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 2459
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTrainBestRecords:"

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

    .line 2460
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->t()Lo/bss;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$24;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$24;->e:Ljava/lang/String;

    iget v3, p0, Lo/bsq$24;->d:I

    invoke-virtual {v0, v1, v2, v3}, Lo/bss;->e(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 2461
    iget-object v0, p0, Lo/bsq$24;->a:Lo/bui;

    iget-object v1, p0, Lo/bsq$24;->b:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2462
    return-void
.end method

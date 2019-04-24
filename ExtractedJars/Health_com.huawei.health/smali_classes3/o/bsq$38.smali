.class Lo/bsq$38;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->d(Ljava/util/List;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lo/bui;

.field final synthetic d:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Ljava/util/List;Lo/bui;Ljava/lang/String;)V
    .locals 0

    .line 3475
    iput-object p1, p0, Lo/bsq$38;->d:Lo/bsq;

    iput-object p2, p0, Lo/bsq$38;->b:Ljava/util/List;

    iput-object p3, p0, Lo/bsq$38;->c:Lo/bui;

    iput-object p4, p0, Lo/bsq$38;->a:Ljava/lang/String;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 5

    .line 3498
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3499
    if-nez p1, :cond_1

    .line 3500
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3502
    iget-object v0, p0, Lo/bsq$38;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bsq$38;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3503
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess return data is null return local data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3504
    iget-object v0, p0, Lo/bsq$38;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$38;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$38;->b:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 3506
    :cond_0
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3507
    iget-object v0, p0, Lo/bsq$38;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$38;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x270f

    invoke-static {v2}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x270f

    invoke-virtual {v0, v1, v3, v2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 3509
    :goto_0
    return-void

    .line 3511
    :cond_1
    iget-object v0, p0, Lo/bsq$38;->a:Ljava/lang/String;

    const-string v1, "actionInfoList"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bso;->b(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v4

    .line 3512
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 3514
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->s()Lo/bto;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$38;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v4}, Lo/bto;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 3515
    iget-object v0, p0, Lo/bsq$38;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$38;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_1

    .line 3517
    :cond_2
    iget-object v0, p0, Lo/bsq$38;->b:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lo/bsq$38;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 3518
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess return local data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3519
    iget-object v0, p0, Lo/bsq$38;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$38;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    goto :goto_1

    .line 3521
    :cond_3
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess parse data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3522
    iget-object v0, p0, Lo/bsq$38;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$38;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x270f

    invoke-static {v2}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x270f

    invoke-virtual {v0, v1, v3, v2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 3526
    :goto_1
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 3478
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActions(final List<String> actionIds, final UICallback<List<TrainAction>> callback) :"

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

    .line 3480
    iget-object v0, p0, Lo/bsq$38;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bsq$38;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3481
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure return local data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3482
    iget-object v0, p0, Lo/bsq$38;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$38;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$38;->b:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    goto :goto_0

    .line 3484
    :cond_0
    iget-object v0, p0, Lo/bsq$38;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$38;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 3486
    :goto_0
    return-void
.end method

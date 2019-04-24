.class Lo/bsq$13;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->l(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsq;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lo/bui;

.field final synthetic e:Lcom/huawei/health/suggestion/model/AccountInfo;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;)V
    .locals 0

    .line 1836
    iput-object p1, p0, Lo/bsq$13;->a:Lo/bsq;

    iput-object p2, p0, Lo/bsq$13;->c:Lo/bui;

    iput-object p3, p0, Lo/bsq$13;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p4, p0, Lo/bsq$13;->b:Ljava/lang/String;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 1846
    iget-object v0, p0, Lo/bsq$13;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$13;->b:Ljava/lang/String;

    const-string v2, "progress"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-static {v1, v2}, Lo/bsx;->a(Ljava/lang/String;Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/btw;->b(Ljava/lang/String;Ljava/util/List;)V

    .line 1847
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->a()Lo/bsj;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$13;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$13;->b:Ljava/lang/String;

    const-string v3, "bestRecords"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lo/bsy;->c(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/PlanStat;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanStat;)V

    .line 1849
    iget-object v0, p0, Lo/bsq$13;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/bsu;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1850
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$13;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$13;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/bsq$13;->b:Ljava/lang/String;

    invoke-static {v2, v3}, Lo/bts;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/btq;->e(Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanRecord;)V

    goto :goto_0

    .line 1852
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$13;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$13;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/btq;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1854
    :goto_0
    iget-object v0, p0, Lo/bsq$13;->c:Lo/bui;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 1855
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1839
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateWorkoutRecords(final String planId, final UICallback<String> callback):"

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

    .line 1840
    iget-object v0, p0, Lo/bsq$13;->c:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 1841
    return-void
.end method

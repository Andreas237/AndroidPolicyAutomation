.class Lo/bsq$1;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->b(IILo/bui;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsq;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic e:Lo/bui;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;IILcom/huawei/health/suggestion/model/AccountInfo;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lo/bsq$1;->a:Lo/bsq;

    iput-object p2, p0, Lo/bsq$1;->e:Lo/bui;

    iput p3, p0, Lo/bsq$1;->b:I

    iput p4, p0, Lo/bsq$1;->c:I

    iput-object p5, p0, Lo/bsq$1;->d:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 5

    .line 181
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    iget v1, p0, Lo/bsq$1;->b:I

    iget v2, p0, Lo/bsq$1;->c:I

    invoke-virtual {v0, v1, v2}, Lo/bta;->b(II)V

    .line 184
    const-string v0, "total"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "totalCalorie"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "totalTrainingDays"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lo/bsu;->d(III)V

    .line 186
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$1;->d:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "planRecords"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-static {v2}, Lo/bsx;->e(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/btq;->d(Ljava/lang/String;Ljava/util/List;)V

    .line 188
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->d()Lo/btq;

    move-result-object v0

    iget v1, p0, Lo/bsq$1;->b:I

    iget v2, p0, Lo/bsq$1;->c:I

    iget-object v3, p0, Lo/bsq$1;->d:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/btq;->b(IILjava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 189
    iget-object v0, p0, Lo/bsq$1;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$1;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 190
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 174
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getJoinedPlans:"

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

    .line 175
    iget-object v0, p0, Lo/bsq$1;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$1;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 176
    return-void
.end method

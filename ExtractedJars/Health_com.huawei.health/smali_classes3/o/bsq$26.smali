.class Lo/bsq$26;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->e(ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic c:Lo/bsq;

.field final synthetic e:Lo/bui;


# direct methods
.method constructor <init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;ILo/bui;)V
    .locals 0

    .line 2852
    iput-object p1, p0, Lo/bsq$26;->c:Lo/bsq;

    iput-object p2, p0, Lo/bsq$26;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput p3, p0, Lo/bsq$26;->a:I

    iput-object p4, p0, Lo/bsq$26;->e:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 6

    .line 2867
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOperationPage():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2868
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    iget v1, p0, Lo/bsq$26;->a:I

    invoke-virtual {v0, v1}, Lo/bta;->g(I)V

    .line 2869
    const-string v0, "pageList"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 2870
    invoke-static {v4}, Lo/bso;->b(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v5

    .line 2871
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->k()Lo/bti;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$26;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/bsq$26;->a:I

    invoke-virtual {v0, v1, v5, v2}, Lo/bti;->a(Ljava/lang/String;Ljava/util/List;I)V

    .line 2873
    invoke-static {v5}, Lo/bsq;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 2874
    iget-object v0, p0, Lo/bsq$26;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$26;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2875
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 6

    .line 2855
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFitnessCourseTopicList:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2856
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->k()Lo/bti;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$26;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/bsq$26;->a:I

    invoke-virtual {v0, v1, v2}, Lo/bti;->b(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v4

    .line 2857
    invoke-static {v4}, Lo/bsq;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 2858
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2859
    iget-object v0, p0, Lo/bsq$26;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$26;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    goto :goto_0

    .line 2861
    :cond_0
    iget-object v0, p0, Lo/bsq$26;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$26;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2863
    :goto_0
    return-void
.end method

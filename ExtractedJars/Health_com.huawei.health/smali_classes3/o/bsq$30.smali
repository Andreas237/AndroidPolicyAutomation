.class Lo/bsq$30;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->c(ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic c:Lo/bsq;

.field final synthetic d:Lo/bui;


# direct methods
.method constructor <init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;ILo/bui;)V
    .locals 0

    .line 2758
    iput-object p1, p0, Lo/bsq$30;->c:Lo/bsq;

    iput-object p2, p0, Lo/bsq$30;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput p3, p0, Lo/bsq$30;->a:I

    iput-object p4, p0, Lo/bsq$30;->d:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 7

    .line 2772
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryTopicList():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2773
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    iget v1, p0, Lo/bsq$30;->a:I

    invoke-virtual {v0, v1}, Lo/bta;->h(I)V

    .line 2774
    invoke-static {p1}, Lo/bso;->d(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v4

    .line 2775
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->h()Lo/btp;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$30;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/bsq$30;->a:I

    invoke-virtual {v0, v1, v4, v2}, Lo/btp;->b(Ljava/lang/String;Ljava/util/List;I)V

    .line 2776
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/Topic;

    .line 2777
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Topic;->acquireId()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bta;->f(I)V

    .line 2778
    goto :goto_0

    .line 2779
    :cond_0
    iget-object v0, p0, Lo/bsq$30;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$30;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2780
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 2761
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

    .line 2762
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->h()Lo/btp;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$30;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/bsq$30;->a:I

    invoke-virtual {v0, v1, v2}, Lo/btp;->c(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v4

    .line 2763
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2764
    iget-object v0, p0, Lo/bsq$30;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$30;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    goto :goto_0

    .line 2766
    :cond_0
    iget-object v0, p0, Lo/bsq$30;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$30;->c:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2768
    :goto_0
    return-void
.end method

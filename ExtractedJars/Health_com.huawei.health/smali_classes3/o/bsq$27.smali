.class Lo/bsq$27;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->c(IILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsq;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lo/bui;

.field final synthetic e:Lcom/huawei/health/suggestion/model/AccountInfo;


# direct methods
.method constructor <init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;IILo/bui;)V
    .locals 0

    .line 2807
    iput-object p1, p0, Lo/bsq$27;->a:Lo/bsq;

    iput-object p2, p0, Lo/bsq$27;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput p3, p0, Lo/bsq$27;->b:I

    iput p4, p0, Lo/bsq$27;->c:I

    iput-object p5, p0, Lo/bsq$27;->d:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 5

    .line 2821
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutsByTopicId():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2822
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    iget v1, p0, Lo/bsq$27;->c:I

    iget v2, p0, Lo/bsq$27;->b:I

    invoke-virtual {v0, v1, v2}, Lo/bta;->a(II)V

    .line 2823
    invoke-static {p1}, Lo/bso;->a(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v4

    .line 2824
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->h()Lo/btp;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$27;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/bsq$27;->b:I

    iget v3, p0, Lo/bsq$27;->c:I

    invoke-virtual {v0, v1, v2, v4, v3}, Lo/btp;->c(Ljava/lang/String;ILjava/util/List;I)V

    .line 2825
    iget-object v0, p0, Lo/bsq$27;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$27;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2826
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 5

    .line 2810
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutsByTopicId:"

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

    .line 2811
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->h()Lo/btp;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$27;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lo/bsq$27;->b:I

    iget v3, p0, Lo/bsq$27;->c:I

    invoke-virtual {v0, v1, v2, v3}, Lo/btp;->d(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v4

    .line 2812
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2813
    iget-object v0, p0, Lo/bsq$27;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$27;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    goto :goto_0

    .line 2815
    :cond_0
    iget-object v0, p0, Lo/bsq$27;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$27;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2817
    :goto_0
    return-void
.end method

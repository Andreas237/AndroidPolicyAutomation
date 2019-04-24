.class Lo/bsq$9;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->b(IIILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lo/bui;

.field final synthetic e:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic f:Ljava/util/ArrayList;

.field final synthetic i:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;IIILcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;Ljava/util/ArrayList;)V
    .locals 0

    .line 1643
    iput-object p1, p0, Lo/bsq$9;->i:Lo/bsq;

    iput p2, p0, Lo/bsq$9;->c:I

    iput p3, p0, Lo/bsq$9;->b:I

    iput p4, p0, Lo/bsq$9;->a:I

    iput-object p5, p0, Lo/bsq$9;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p6, p0, Lo/bsq$9;->d:Lo/bui;

    iput-object p7, p0, Lo/bsq$9;->f:Ljava/util/ArrayList;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 6

    .line 1656
    iget-object v0, p0, Lo/bsq$9;->i:Lo/bsq;

    iget-object v1, p0, Lo/bsq$9;->f:Ljava/util/ArrayList;

    iget v2, p0, Lo/bsq$9;->a:I

    iget v3, p0, Lo/bsq$9;->c:I

    iget-object v4, p0, Lo/bsq$9;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Lo/bsq$9;->b:I

    invoke-static/range {v0 .. v5}, Lo/bsq;->d(Lo/bsq;Ljava/util/ArrayList;IILjava/lang/String;I)V

    .line 1657
    iget-object v0, p0, Lo/bsq$9;->f:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1658
    iget-object v0, p0, Lo/bsq$9;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$9;->i:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$9;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1659
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 6

    .line 1646
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBehaviorListCloud:"

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

    .line 1647
    iget-object v0, p0, Lo/bsq$9;->i:Lo/bsq;

    iget v1, p0, Lo/bsq$9;->c:I

    iget v2, p0, Lo/bsq$9;->b:I

    iget v3, p0, Lo/bsq$9;->a:I

    iget-object v4, p0, Lo/bsq$9;->e:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/bsq;->a(Lo/bsq;IIILjava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 1648
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1649
    invoke-static {v5}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 1651
    :cond_0
    iget-object v0, p0, Lo/bsq$9;->d:Lo/bui;

    iget-object v1, p0, Lo/bsq$9;->i:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1652
    return-void
.end method

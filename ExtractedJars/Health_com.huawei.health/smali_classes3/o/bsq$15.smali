.class Lo/bsq$15;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->i(Ljava/lang/String;Lo/bui;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/bui;

.field final synthetic c:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Ljava/lang/String;Lcom/huawei/health/suggestion/model/AccountInfo;)V
    .locals 0

    .line 1745
    iput-object p1, p0, Lo/bsq$15;->e:Lo/bsq;

    iput-object p2, p0, Lo/bsq$15;->b:Lo/bui;

    iput-object p3, p0, Lo/bsq$15;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/bsq$15;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 1748
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutRecords:"

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

    .line 1749
    iget-object v0, p0, Lo/bsq$15;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$15;->e:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1750
    return-void
.end method

.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 1745
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/bsq$15;->d(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 4

    .line 1755
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$15;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bta;->d(Ljava/lang/String;)V

    .line 1758
    iget-object v0, p0, Lo/bsq$15;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$15;->e:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$15;->c:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/bsq$15;->d:Ljava/lang/String;

    invoke-static {v2, v3}, Lo/bts;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1759
    return-void
.end method

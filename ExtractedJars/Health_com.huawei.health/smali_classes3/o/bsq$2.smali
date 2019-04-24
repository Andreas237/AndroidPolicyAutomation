.class Lo/bsq$2;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->c(Ljava/lang/String;Lo/bui;)V
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
.field final synthetic a:Lo/bsq;

.field final synthetic b:Lo/bui;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Ljava/lang/String;)V
    .locals 0

    .line 1311
    iput-object p1, p0, Lo/bsq$2;->a:Lo/bsq;

    iput-object p2, p0, Lo/bsq$2;->b:Lo/bui;

    iput-object p3, p0, Lo/bsq$2;->d:Ljava/lang/String;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 1314
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanProgress:"

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

    const-string v2, " errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1315
    iget-object v0, p0, Lo/bsq$2;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$2;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$2;->a:Lo/bsq;

    iget-object v3, p0, Lo/bsq$2;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lo/bsq;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1316
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 1321
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$2;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bta;->d(Ljava/lang/String;)V

    .line 1323
    iget-object v0, p0, Lo/bsq$2;->b:Lo/bui;

    iget-object v1, p0, Lo/bsq$2;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$2;->a:Lo/bsq;

    iget-object v3, p0, Lo/bsq$2;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lo/bsq;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanRecord;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1324
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 1311
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/bsq$2;->b(Ljava/lang/String;)V

    return-void
.end method

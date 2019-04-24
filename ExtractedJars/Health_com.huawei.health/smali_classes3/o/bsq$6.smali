.class Lo/bsq$6;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->d(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lo/bsq;

.field final synthetic d:Lo/bui;


# direct methods
.method constructor <init>(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
    .locals 0

    .line 1565
    iput-object p1, p0, Lo/bsq$6;->c:Lo/bsq;

    iput-object p2, p0, Lo/bsq$6;->b:Ljava/lang/String;

    iput-object p3, p0, Lo/bsq$6;->a:Ljava/lang/String;

    iput-object p4, p0, Lo/bsq$6;->d:Lo/bui;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 1568
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCollectBehavior:"

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

    .line 1569
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->m()Lo/btf;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$6;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$6;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/btf;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    .line 1570
    iget-object v0, p0, Lo/bsq$6;->d:Lo/bui;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 1571
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 1575
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->m()Lo/btf;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$6;->b:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$6;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/btf;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    .line 1576
    iget-object v0, p0, Lo/bsq$6;->d:Lo/bui;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 1577
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 1565
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/bsq$6;->c(Ljava/util/List;)V

    return-void
.end method

.class Lo/bsq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/suggestion/data/DataSyncService$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->e(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsq;

.field final synthetic c:Lo/bui;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Ljava/lang/String;)V
    .locals 0

    .line 1397
    iput-object p1, p0, Lo/bsq$5;->a:Lo/bsq;

    iput-object p2, p0, Lo/bsq$5;->c:Lo/bui;

    iput-object p3, p0, Lo/bsq$5;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 1401
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishPlan:"

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

    .line 1402
    iget-object v0, p0, Lo/bsq$5;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$5;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1403
    return-void
.end method

.method public c()V
    .locals 4

    .line 1407
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishPlan:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\u6570\u636e\u540c\u6b65\u5b8c\u6210"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1409
    iget-object v0, p0, Lo/bsq$5;->a:Lo/bsq;

    iget-object v1, p0, Lo/bsq$5;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$5;->c:Lo/bui;

    invoke-static {v0, v1, v2}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;Lo/bui;)V

    .line 1410
    return-void
.end method

.class Lo/bsq$4;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->m(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bui;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Ljava/lang/String;J)V
    .locals 0

    .line 1441
    iput-object p1, p0, Lo/bsq$4;->e:Lo/bsq;

    iput-object p2, p0, Lo/bsq$4;->a:Lo/bui;

    iput-object p3, p0, Lo/bsq$4;->b:Ljava/lang/String;

    iput-wide p4, p0, Lo/bsq$4;->d:J

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 1454
    iget-object v0, p0, Lo/bsq$4;->e:Lo/bsq;

    iget-object v1, p0, Lo/bsq$4;->b:Ljava/lang/String;

    iget-wide v2, p0, Lo/bsq$4;->d:J

    invoke-static {v0, v1, v2, v3}, Lo/bsq;->d(Lo/bsq;Ljava/lang/String;J)V

    .line 1455
    iget-object v0, p0, Lo/bsq$4;->a:Lo/bui;

    iget-object v1, p0, Lo/bsq$4;->e:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1456
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1444
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postFinishPlan:"

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

    .line 1445
    const v0, 0x30d53

    if-ne p1, v0, :cond_0

    .line 1446
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bsq$4;->b(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 1448
    :cond_0
    iget-object v0, p0, Lo/bsq$4;->a:Lo/bui;

    iget-object v1, p0, Lo/bsq$4;->e:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1450
    :goto_0
    return-void
.end method

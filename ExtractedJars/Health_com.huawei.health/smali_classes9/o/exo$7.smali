.class Lo/exo$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->b(JILo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic c:Lo/exo;

.field final synthetic d:Lo/exn$d;


# direct methods
.method constructor <init>(Lo/exo;Lo/egg;Lo/exn$d;)V
    .locals 0

    .line 971
    iput-object p1, p0, Lo/exo$7;->c:Lo/exo;

    iput-object p2, p0, Lo/exo$7;->b:Lo/egg;

    iput-object p3, p0, Lo/exo$7;->d:Lo/exn$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 974
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requsetGetFitnessDataDetailBySportType return code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 975
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 976
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 977
    iget-object v0, p0, Lo/exo$7;->c:Lo/exo;

    iget-object v1, p0, Lo/exo$7;->b:Lo/egg;

    iget-object v2, p0, Lo/exo$7;->d:Lo/exn$d;

    invoke-static {v0, v1, v4, v2}, Lo/exo;->b(Lo/exo;Lo/egg;Ljava/util/List;Lo/exn$d;)V

    .line 978
    goto :goto_0

    .line 979
    :cond_0
    iget-object v0, p0, Lo/exo$7;->b:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 981
    :goto_0
    return-void
.end method

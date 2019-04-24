.class Lo/exo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->c(JILo/exn$d;Lo/egg;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exn$d;

.field final synthetic c:Lo/egg;

.field final synthetic d:I

.field final synthetic e:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/egg;ILo/exn$d;)V
    .locals 0

    .line 868
    iput-object p1, p0, Lo/exo$1;->e:Lo/exo;

    iput-object p2, p0, Lo/exo$1;->c:Lo/egg;

    iput p3, p0, Lo/exo$1;->d:I

    iput-object p4, p0, Lo/exo$1;->a:Lo/exn$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 871
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType 000002 onResponse start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 873
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType statistic sucess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 874
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 875
    iget-object v0, p0, Lo/exo$1;->e:Lo/exo;

    iget-object v1, p0, Lo/exo$1;->c:Lo/egg;

    iget v2, p0, Lo/exo$1;->d:I

    iget-object v3, p0, Lo/exo$1;->a:Lo/exn$d;

    invoke-static {v0, v1, v4, v2, v3}, Lo/exo;->b(Lo/exo;Lo/egg;Ljava/util/List;ILo/exn$d;)V

    .line 876
    goto :goto_0

    .line 877
    :cond_0
    iget-object v0, p0, Lo/exo$1;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 878
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType statistic fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 879
    iget-object v0, p0, Lo/exo$1;->c:Lo/egg;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 882
    :cond_1
    :goto_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType 000002 onResponse over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 883
    return-void
.end method

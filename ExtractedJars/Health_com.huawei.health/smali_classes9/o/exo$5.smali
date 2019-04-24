.class Lo/exo$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->e(JILo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/egg;

.field final synthetic e:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/egg;I)V
    .locals 0

    .line 777
    iput-object p1, p0, Lo/exo$5;->e:Lo/exo;

    iput-object p2, p0, Lo/exo$5;->b:Lo/egg;

    iput p3, p0, Lo/exo$5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 780
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType 000001 onResponse start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 781
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 782
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType HISTOGRAM sucess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 783
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 784
    iget-object v0, p0, Lo/exo$5;->e:Lo/exo;

    iget-object v1, p0, Lo/exo$5;->b:Lo/egg;

    iget v2, p0, Lo/exo$5;->a:I

    invoke-static {v0, v1, v4, v2}, Lo/exo;->c(Lo/exo;Lo/egg;Ljava/util/List;I)V

    .line 785
    goto :goto_0

    .line 786
    :cond_0
    iget-object v0, p0, Lo/exo$5;->b:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 787
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType HISTOGRAM fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    iget-object v0, p0, Lo/exo$5;->b:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 791
    :cond_1
    :goto_0
    return-void
.end method

.class Lo/exo$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->a(IILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exo;

.field final synthetic b:I

.field final synthetic c:Lo/egg;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/exo;IILo/egg;)V
    .locals 0

    .line 1186
    iput-object p1, p0, Lo/exo$10;->a:Lo/exo;

    iput p2, p0, Lo/exo$10;->b:I

    iput p3, p0, Lo/exo$10;->e:I

    iput-object p4, p0, Lo/exo$10;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 1189
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setFitnessGoal result code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",  objData =  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1190
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1191
    iget-object v0, p0, Lo/exo$10;->a:Lo/exo;

    iget v1, p0, Lo/exo$10;->b:I

    invoke-static {v0, v1}, Lo/exo;->o(Lo/exo;I)I

    .line 1192
    iget-object v0, p0, Lo/exo$10;->a:Lo/exo;

    iget v1, p0, Lo/exo$10;->e:I

    invoke-static {v0, v1}, Lo/exo;->g(Lo/exo;I)I

    .line 1195
    :cond_0
    iget-object v0, p0, Lo/exo$10;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1196
    iget-object v0, p0, Lo/exo$10;->c:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1198
    :cond_1
    return-void
.end method

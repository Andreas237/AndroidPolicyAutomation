.class Lo/exo$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->b(JILo/egg;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic c:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/egg;)V
    .locals 0

    .line 845
    iput-object p1, p0, Lo/exo$4;->c:Lo/exo;

    iput-object p2, p0, Lo/exo$4;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 848
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType 000003 onResponse start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    iget-object v0, p0, Lo/exo$4;->b:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 850
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType statistic detail !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 851
    iget-object v0, p0, Lo/exo$4;->b:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 853
    :cond_0
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requsetGetFitnessDataDetailByDataType 000003 onResponse over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    return-void
.end method

.class Lo/eye$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eye;->b(Lo/eho;Lo/eic;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eye;

.field final synthetic c:Lo/eho;


# direct methods
.method constructor <init>(Lo/eye;Lo/eho;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/eye$2;->b:Lo/eye;

    iput-object p2, p0, Lo/eye$2;->c:Lo/eho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 96
    const-string v0, "StepModuleBarChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGoal fectch failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 7

    .line 75
    const/4 v5, 0x0

    .line 77
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v0

    .line 80
    goto :goto_0

    .line 78
    :catch_0
    move-exception v6

    .line 79
    const-string v0, "StepModuleBarChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    :goto_0
    if-eqz v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 83
    :cond_0
    const-string v0, "StepModuleBarChartHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Step Goal fectch failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void

    .line 87
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    double-to-int v6, v0

    .line 89
    iget-object v0, p0, Lo/eye$2;->c:Lo/eho;

    const/16 v1, 0xff

    const/4 v2, 0x0

    const/16 v3, 0x7d

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v6, v1}, Lo/eho;->d(II)V

    .line 90
    iget-object v0, p0, Lo/eye$2;->c:Lo/eho;

    invoke-virtual {v0}, Lo/eho;->ak()V

    .line 91
    iget-object v0, p0, Lo/eye$2;->c:Lo/eho;

    invoke-virtual {v0}, Lo/eho;->c()V

    .line 92
    return-void
.end method

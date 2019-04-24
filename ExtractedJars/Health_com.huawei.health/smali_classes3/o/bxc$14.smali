.class Lo/bxc$14;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxc;->e(Lo/bxc$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Lcom/huawei/health/suggestion/model/PlanRecord;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/bxc;

.field final synthetic e:Lo/bxc$a;


# direct methods
.method constructor <init>(Lo/bxc;Lo/bxc$a;)V
    .locals 0

    .line 362
    iput-object p1, p0, Lo/bxc$14;->d:Lo/bxc;

    iput-object p2, p0, Lo/bxc$14;->e:Lo/bxc$a;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/PlanRecord;)V
    .locals 9

    .line 370
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 371
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    return-void

    .line 374
    :cond_0
    const-string v0, "Suggestion_MyPlanInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 376
    iget-object v0, p0, Lo/bxc$14;->e:Lo/bxc$a;

    iget-object v0, v0, Lo/bxc$a;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v8}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 377
    iget-object v0, p0, Lo/bxc$14;->e:Lo/bxc$a;

    iget-object v0, v0, Lo/bxc$a;->e:Lo/efy;

    iget-object v1, p0, Lo/bxc$14;->d:Lo/bxc;

    invoke-static {v1}, Lo/bxc;->c(Lo/bxc;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_home_finishpercent:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanRecord;->acquireFinishRate()F

    move-result v4

    float-to-double v4, v4

    const/4 v6, 0x2

    const/4 v7, 0x1

    invoke-static {v4, v5, v6, v7}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Lo/buk;->a(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 378
    return-void
.end method

.method public b(ILjava/lang/String;)V
    .locals 0

    .line 366
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 362
    move-object v0, p1

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanRecord;

    invoke-virtual {p0, v0}, Lo/bxc$14;->a(Lcom/huawei/health/suggestion/model/PlanRecord;)V

    return-void
.end method

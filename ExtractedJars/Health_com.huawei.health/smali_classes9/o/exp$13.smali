.class Lo/exp$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exp;->c(Ljava/util/Date;ILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exp;

.field final synthetic d:Lo/egg;


# direct methods
.method constructor <init>(Lo/exp;Lo/egg;)V
    .locals 0

    .line 990
    iput-object p1, p0, Lo/exp$13;->a:Lo/exp;

    iput-object p2, p0, Lo/exp$13;->d:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 993
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepAdvice back..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 994
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 995
    move-object v4, p2

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;

    .line 996
    iget-object v0, p0, Lo/exp$13;->a:Lo/exp;

    iget-object v1, p0, Lo/exp$13;->a:Lo/exp;

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;->getAd_num_0()I

    move-result v2

    invoke-static {v1, v2, v4}, Lo/exp;->b(Lo/exp;ILcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/exp;->a(Lo/exp;Ljava/lang/String;)V

    .line 997
    iget-object v0, p0, Lo/exp$13;->a:Lo/exp;

    iget-object v1, p0, Lo/exp$13;->a:Lo/exp;

    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData;->getAd_num_1()I

    move-result v2

    invoke-static {v1, v2}, Lo/exp;->p(Lo/exp;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/exp;->c(Lo/exp;Ljava/lang/String;)Ljava/lang/String;

    .line 998
    goto :goto_0

    .line 999
    :cond_0
    iget-object v0, p0, Lo/exp$13;->a:Lo/exp;

    const-string v1, ""

    invoke-static {v0, v1}, Lo/exp;->a(Lo/exp;Ljava/lang/String;)V

    .line 1000
    iget-object v0, p0, Lo/exp$13;->a:Lo/exp;

    const-string v1, ""

    invoke-static {v0, v1}, Lo/exp;->c(Lo/exp;Ljava/lang/String;)Ljava/lang/String;

    .line 1002
    :goto_0
    iget-object v0, p0, Lo/exp$13;->d:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1003
    iget-object v0, p0, Lo/exp$13;->d:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1005
    :cond_1
    return-void
.end method

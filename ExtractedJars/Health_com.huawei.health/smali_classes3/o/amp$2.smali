.class Lo/amp$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/amp;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/amp;


# direct methods
.method constructor <init>(Lo/amp;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lo/amp$2;->a:Lo/amp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 73
    iget-object v0, p0, Lo/amp$2;->a:Lo/amp;

    const/16 v1, 0x2710

    invoke-static {v0, v1}, Lo/amp;->b(Lo/amp;I)I

    .line 74
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGoal fectch failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Lo/amp$2;->a:Lo/amp;

    invoke-static {v0}, Lo/amp;->a(Lo/amp;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 76
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 52
    const/4 v4, 0x0

    .line 54
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 57
    goto :goto_0

    .line 55
    :catch_0
    move-exception v5

    .line 56
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    :goto_0
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 59
    iget-object v0, p0, Lo/amp$2;->a:Lo/amp;

    const/4 v1, 0x0

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lo/amp;->b(Lo/amp;I)I

    .line 60
    iget-object v0, p0, Lo/amp$2;->a:Lo/amp;

    invoke-static {v0}, Lo/amp;->d(Lo/amp;)Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 61
    iget-object v0, p0, Lo/amp$2;->a:Lo/amp;

    invoke-static {v0}, Lo/amp;->d(Lo/amp;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/amp$2;->a:Lo/amp;

    invoke-static {v1}, Lo/amp;->c(Lo/amp;)I

    move-result v1

    invoke-static {v0, v1}, Lo/amy;->d(Landroid/content/Context;I)V

    goto :goto_1

    .line 64
    :cond_0
    iget-object v0, p0, Lo/amp$2;->a:Lo/amp;

    const/16 v1, 0x2710

    invoke-static {v0, v1}, Lo/amp;->b(Lo/amp;I)I

    .line 65
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mGoal fectch failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    :cond_1
    :goto_1
    iget-object v0, p0, Lo/amp$2;->a:Lo/amp;

    invoke-static {v0}, Lo/amp;->a(Lo/amp;)Ljava/util/concurrent/Semaphore;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 68
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetch unlock"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    return-void
.end method

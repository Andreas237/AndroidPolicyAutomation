.class Lo/bxa$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxa;->e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bxa;

.field final synthetic b:Lcom/huawei/health/suggestion/model/WorkoutRecord;


# direct methods
.method constructor <init>(Lo/bxa;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 0

    .line 329
    iput-object p1, p0, Lo/bxa$4;->a:Lo/bxa;

    iput-object p2, p0, Lo/bxa$4;->b:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 332
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 333
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->r()Lo/btc;

    move-result-object v0

    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v1

    invoke-interface {v1}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bxa$4;->b:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v2

    iget-object v4, p0, Lo/bxa$4;->b:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v4

    iget-object v5, p0, Lo/bxa$4;->b:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v5

    iget-object v6, p0, Lo/bxa$4;->b:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/btc;->c(Ljava/lang/String;JFILjava/lang/String;Z)V

    .line 335
    :cond_0
    return-void
.end method

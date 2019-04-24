.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecord(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

.field final synthetic val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic val$endTime:J

.field final synthetic val$sql:Ljava/lang/String;

.field final synthetic val$startTime:J


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 574
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    iput-object p2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->val$sql:Ljava/lang/String;

    iput-wide p3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->val$startTime:J

    iput-wide p5, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->val$endTime:J

    iput-object p7, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 577
    new-instance v5, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;-><init>()V

    .line 578
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->val$sql:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "[A-Z][0-9][0-9][0-9]*"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    .line 581
    invoke-static {v3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1100(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 578
    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 582
    if-eqz v6, :cond_1

    .line 583
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 584
    const-string v0, "sumCalorie"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v7

    .line 585
    const-string v0, "sumDuring"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    int-to-long v8, v0

    .line 586
    const-string v0, "sumCount"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    .line 587
    invoke-virtual {v5, v7}, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->saveRecordsSumCal(F)V

    .line 588
    invoke-virtual {v5, v8, v9}, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->saveRecordsSumTime(J)V

    .line 589
    int-to-long v0, v10

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->saveRecordsCount(J)V

    .line 590
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->val$startTime:J

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->saveRecordsStartTime(J)V

    .line 591
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->val$endTime:J

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->saveRecordsEndTime(J)V

    .line 592
    const/16 v0, 0x2711

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessSummaryRecord;->saveRecordType(I)V

    .line 593
    goto :goto_0

    .line 594
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 597
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$5;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 598
    return-void
.end method

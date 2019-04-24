.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireSummaryFitnessRecordByMonth(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
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
.method constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;JJLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 403
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    iput-wide p2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->val$startTime:J

    iput-wide p4, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->val$endTime:J

    iput-object p6, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->val$sql:Ljava/lang/String;

    iput-object p7, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 16

    .line 406
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMM"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 407
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->val$startTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 408
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->val$endTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 409
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 410
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->val$sql:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "[A-Z][0-9][0-9][0-9]*"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    .line 413
    invoke-static {v3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1100(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 410
    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 414
    if-eqz v9, :cond_1

    .line 415
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    const-string v0, "monthDate"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 417
    const-string v0, "monthCalorie"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v11

    .line 418
    const-string v0, "monthDuring"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 419
    const-string v0, "monthTimes"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    .line 420
    new-instance v14, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    invoke-direct {v14}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;-><init>()V

    .line 421
    invoke-virtual {v14, v10}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveMonthDate(Ljava/lang/String;)V

    .line 423
    :try_start_0
    invoke-virtual {v5, v10}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v15

    .line 424
    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v14, v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveMonthZeroTime(J)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 427
    goto :goto_1

    .line 425
    :catch_0
    move-exception v15

    .line 426
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireSummaryFitnessRecordByMonth e "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    :goto_1
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v11

    invoke-virtual {v14, v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumCalorie(F)V

    .line 429
    int-to-long v0, v12

    invoke-virtual {v14, v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumExerciseTime(J)V

    .line 430
    invoke-virtual {v14, v13}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumExerciseTimes(I)V

    .line 431
    const/16 v0, 0x2711

    invoke-virtual {v14, v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveRecordType(I)V

    .line 432
    invoke-interface {v8, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 433
    goto/16 :goto_0

    .line 434
    :cond_0
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 436
    :cond_1
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDate:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const-string v2, "-endDate:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    invoke-static {v0, v6, v7, v8}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1200(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 438
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$3;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v8}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 439
    return-void
.end method

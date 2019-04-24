.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getData(Lcom/huawei/hwbasemgr/IBaseResponseCallback;JJLjava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

.field final synthetic val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic val$endTime:J

.field final synthetic val$format:Ljava/lang/String;

.field final synthetic val$sql:Ljava/lang/String;

.field final synthetic val$startTime:J

.field final synthetic val$type:I


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;JJLjava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 313
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    iput-object p2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$format:Ljava/lang/String;

    iput-wide p3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$startTime:J

    iput-wide p5, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$endTime:J

    iput-object p7, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$sql:Ljava/lang/String;

    iput p8, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$type:I

    iput-object p9, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    .line 316
    new-instance v5, Ljava/text/SimpleDateFormat;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$format:Ljava/lang/String;

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 317
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$startTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 318
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$endTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 319
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData startDate:"

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

    .line 320
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 321
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$sql:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "[A-Z][0-9][0-9][0-9]*"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    .line 324
    invoke-static {v3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1100(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 321
    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 325
    if-eqz v9, :cond_2

    .line 326
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 327
    const-string v0, "date"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 328
    const-string v0, "calorie"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v11

    .line 329
    const-string v0, "during"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 330
    const-string v0, "times"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    .line 331
    new-instance v14, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    invoke-direct {v14}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;-><init>()V

    .line 332
    invoke-virtual {v14, v10}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveMonthDate(Ljava/lang/String;)V

    .line 333
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData dateString:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, "calorie:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "-during:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, "-count:"

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    :try_start_0
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 337
    invoke-virtual {v5, v10}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v15

    goto :goto_1

    .line 339
    :cond_0
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData dateString == null error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    new-instance v15, Ljava/util/Date;

    invoke-direct {v15}, Ljava/util/Date;-><init>()V

    .line 342
    :goto_1
    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v14, v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveMonthZeroTime(J)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    goto :goto_2

    .line 343
    :catch_0
    move-exception v15

    .line 344
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getData e "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v15}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    :goto_2
    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v11

    invoke-virtual {v14, v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumCalorie(F)V

    .line 347
    int-to-long v0, v12

    invoke-virtual {v14, v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumExerciseTime(J)V

    .line 348
    invoke-virtual {v14, v13}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumExerciseTimes(I)V

    .line 349
    const/16 v0, 0x2711

    invoke-virtual {v14, v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveRecordType(I)V

    .line 350
    invoke-interface {v8, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 351
    goto/16 :goto_0

    .line 352
    :cond_1
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 355
    :cond_2
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$type:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 356
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 357
    new-instance v11, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    invoke-direct {v11}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;-><init>()V

    .line 358
    const/4 v12, 0x0

    .line 359
    const-wide/16 v13, 0x0

    .line 360
    const/4 v15, 0x0

    .line 361
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    .line 362
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumExerciseTimes()I

    move-result v0

    add-int/2addr v12, v0

    .line 363
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumExerciseTime()J

    move-result-wide v0

    add-long/2addr v13, v0

    .line 364
    invoke-virtual/range {v17 .. v17}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumCalorie()F

    move-result v0

    add-float/2addr v15, v0

    .line 365
    goto :goto_3

    .line 366
    :cond_3
    invoke-virtual {v11, v12}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumExerciseTimes(I)V

    .line 367
    invoke-virtual {v11, v13, v14}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumExerciseTime(J)V

    .line 368
    invoke-virtual {v11, v15}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->saveSumCalorie(F)V

    .line 369
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 370
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v10}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 371
    goto :goto_4

    .line 372
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$2;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v8}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 374
    :goto_4
    return-void
.end method

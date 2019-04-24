.class public Lo/abt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/abt$b;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/content/Context;

.field private f:I

.field private g:J

.field private h:Z

.field private i:J

.field private k:Lo/abt$b;

.field private m:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->c:I

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->d:I

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->a:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->b:I

    .line 26
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/abt;->i:J

    .line 27
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/abt;->g:J

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/abt;->h:Z

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->f:I

    .line 39
    new-instance v0, Lo/abt$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/abt$b;-><init>(Lo/abt$5;)V

    iput-object v0, p0, Lo/abt;->k:Lo/abt$b;

    .line 178
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/abt;->m:J

    .line 42
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    if-nez p1, :cond_0

    .line 44
    return-void

    .line 46
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/abt;->g:J

    .line 48
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/abt;->h:Z

    .line 51
    :cond_1
    invoke-direct {p0}, Lo/abt;->i()V

    .line 54
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->h(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v5

    .line 55
    if-eqz v5, :cond_2

    .line 57
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/abt;->i:J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    goto :goto_0

    .line 58
    :catch_0
    move-exception v6

    .line 59
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StandStepDataManager(context) "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    :cond_2
    :goto_0
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the first init mLastReportTimeStamp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/abt;->i:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    return-void
.end method

.method private a(I)V
    .locals 8

    .line 282
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBasicRestartStepsInfo  restartStep="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    const/4 v5, 0x0

    .line 284
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->g(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v6

    .line 287
    if-eqz v6, :cond_2

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    aget-object v2, v6, v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 289
    array-length v0, v6

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 290
    const/4 v0, 0x3

    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 291
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    const/4 v1, 0x0

    aget-object v1, v6, v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x3

    aget-object v3, v6, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/amy;->c(Landroid/content/Context;JI)V

    .line 293
    :cond_0
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBasicRestartStepsInfo restart but same day"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->k(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v7

    .line 295
    if-eqz v7, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    aget-object v2, v7, v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 296
    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 298
    :cond_1
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-int v3, p1, v5

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lo/amy;->c(Landroid/content/Context;JII)V

    .line 299
    iput p1, p0, Lo/abt;->c:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 303
    :cond_2
    goto :goto_0

    .line 301
    :catch_0
    move-exception v7

    .line 302
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBasicRestartStepsInfo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    :goto_0
    return-void
.end method

.method private c(I)V
    .locals 4

    .line 313
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateBasicDiffFromDBStepsInfo  diffStepsFromDB="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lo/amy;->c(Landroid/content/Context;JI)V

    .line 317
    return-void
.end method

.method private d(JI)Z
    .locals 8

    .line 362
    const/4 v4, 0x0

    .line 364
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->g(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v5

    .line 366
    if-eqz v5, :cond_1

    const/4 v0, 0x1

    :try_start_0
    aget-object v0, v5, v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lt p3, v0, :cond_1

    .line 368
    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lo/amz;->c(JJ)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v4, v0

    goto :goto_1

    .line 371
    :cond_1
    const/4 v4, 0x1

    .line 375
    :goto_1
    goto :goto_2

    .line 373
    :catch_0
    move-exception v6

    .line 374
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tryToRecordAsBasicStepData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    :goto_2
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "tryToRecordAsBasicStepData bWrite "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    if-eqz v4, :cond_3

    .line 380
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->k(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v6

    .line 382
    const/4 v0, 0x0

    :try_start_1
    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 383
    const/4 v0, 0x1

    aget-object v0, v6, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/abt;->b:I

    goto :goto_3

    .line 385
    :cond_2
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->b:I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 389
    :goto_3
    goto :goto_4

    .line 387
    :catch_1
    move-exception v7

    .line 388
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tryToRecordAsBasicStepData ex1="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    :goto_4
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, p3, v1}, Lo/amy;->c(Landroid/content/Context;JII)V

    .line 391
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget v3, p0, Lo/abt;->b:I

    invoke-static {v0, v1, v2, v3}, Lo/amy;->c(Landroid/content/Context;JI)V

    .line 392
    const/4 v0, 0x1

    return v0

    .line 394
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private f()Z
    .locals 6

    .line 325
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->g(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v4

    .line 328
    if-eqz v4, :cond_2

    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 330
    array-length v0, v4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 331
    const/4 v0, 0x3

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/abt;->b:I

    .line 332
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    const/4 v1, 0x0

    aget-object v1, v4, v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x3

    aget-object v3, v4, v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/amy;->c(Landroid/content/Context;JI)V

    .line 334
    :cond_0
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    if-eqz v0, :cond_2

    .line 335
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    const/4 v1, 0x0

    aget-object v1, v4, v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/abt$b;->c(Lo/abt$b;J)J

    .line 336
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    const/4 v1, 0x1

    aget-object v1, v4, v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/abt$b;->a(Lo/abt$b;I)I

    .line 337
    const/4 v0, 0x2

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/abt;->a:I

    .line 339
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->k(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v5

    .line 340
    if-eqz v5, :cond_1

    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 341
    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/abt;->b:I

    .line 343
    :cond_1
    const-string v0, "Step_StandStepDataManager"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tryToReloadTodayBasicSteps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v2}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "|"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abt;->k:Lo/abt$b;

    .line 344
    invoke-static {v2}, Lo/abt$b;->d(Lo/abt$b;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "|"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/abt;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "|"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lo/abt;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    .line 343
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    const/4 v0, 0x1

    return v0

    .line 350
    :cond_2
    goto :goto_0

    .line 348
    :catch_0
    move-exception v5

    .line 349
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tryToReloadTodayBasicSteps "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private g()V
    .locals 12

    .line 232
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->h(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v9

    .line 234
    if-eqz v9, :cond_1

    .line 236
    const/4 v0, 0x0

    :try_start_0
    aget-object v0, v9, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 238
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, v10, v11}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    const/4 v0, 0x1

    aget-object v0, v9, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/abt;->c:I

    .line 243
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SystemClock.elapsedRealtime(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const/4 v2, 0x5

    aget-object v2, v9, v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 246
    const/4 v0, 0x1

    aget-object v0, v9, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {p0, v0}, Lo/abt;->a(I)V

    .line 249
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    const/4 v1, 0x0

    aget-object v1, v9, v1

    .line 250
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    const/4 v3, 0x1

    aget-object v3, v9, v3

    .line 251
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x2

    aget-object v4, v9, v4

    .line 252
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x3

    aget-object v5, v9, v5

    .line 253
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x4

    aget-object v6, v9, v6

    .line 254
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 255
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    .line 249
    invoke-static/range {v0 .. v8}, Lo/amy;->e(Landroid/content/Context;JIIIIJ)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    :cond_0
    goto :goto_0

    .line 258
    :catch_0
    move-exception v10

    .line 259
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadBasicStepDataAndTotalStaps "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    :cond_1
    :goto_0
    invoke-direct {p0}, Lo/abt;->f()Z

    move-result v0

    if-nez v0, :cond_2

    .line 266
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    const-wide/16 v1, -0x1

    invoke-static {v0, v1, v2}, Lo/abt$b;->c(Lo/abt$b;J)J

    .line 267
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/abt$b;->a(Lo/abt$b;I)I

    .line 268
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->a:I

    .line 269
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->b:I

    .line 270
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reloadBasicStepDataAndTotalStaps no record..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :cond_2
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reload : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v2}, Lo/abt$b;->d(Lo/abt$b;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " restar "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/abt;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 274
    return-void
.end method

.method private i()V
    .locals 4

    .line 94
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initDataManager enter..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-direct {p0}, Lo/abt;->g()V

    .line 96
    return-void
.end method

.method private k()V
    .locals 4

    .line 212
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initEnviroument"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    const-wide/16 v1, -0x1

    invoke-static {v0, v1, v2}, Lo/abt$b;->c(Lo/abt$b;J)J

    .line 216
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/abt$b;->a(Lo/abt$b;I)I

    .line 219
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->c:I

    .line 220
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->d:I

    .line 221
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->a:I

    .line 222
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->b:I

    .line 223
    const/4 v0, 0x0

    iput v0, p0, Lo/abt;->f:I

    .line 224
    return-void
.end method


# virtual methods
.method public a(IJII)V
    .locals 5

    .line 112
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    if-nez v0, :cond_0

    .line 113
    return-void

    .line 115
    :cond_0
    iput-wide p2, p0, Lo/abt;->i:J

    .line 116
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mPreSteps:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/abt;->f:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->d(Lo/abt$b;)I

    move-result v0

    if-lt p4, v0, :cond_1

    .line 119
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->d(Lo/abt$b;)I

    move-result v0

    sub-int v0, p4, v0

    iget v1, p0, Lo/abt;->a:I

    add-int/2addr v0, v1

    iget v1, p0, Lo/abt;->b:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/abt;->c:I

    .line 120
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->d(Lo/abt$b;)I

    move-result v0

    sub-int v0, p4, v0

    iget v1, p0, Lo/abt;->a:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/abt;->d:I

    goto :goto_0

    .line 121
    :cond_1
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v0

    invoke-static {v0, v1, p2, p3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->d(Lo/abt$b;)I

    move-result v0

    if-ge p4, v0, :cond_2

    .line 135
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0, p4}, Lo/abt$b;->a(Lo/abt$b;I)I

    .line 136
    iget v0, p0, Lo/abt;->c:I

    iget v1, p0, Lo/abt;->b:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/abt;->a:I

    .line 137
    iget v0, p0, Lo/abt;->c:I

    iget v1, p0, Lo/abt;->b:I

    sub-int/2addr v0, v1

    iput v0, p0, Lo/abt;->d:I

    .line 139
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v1}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v1

    iget-object v3, p0, Lo/abt;->k:Lo/abt$b;

    .line 140
    invoke-static {v3}, Lo/abt$b;->d(Lo/abt$b;)I

    move-result v3

    iget v4, p0, Lo/abt;->a:I

    .line 139
    invoke-static {v0, v1, v2, v3, v4}, Lo/amy;->c(Landroid/content/Context;JII)V

    goto :goto_0

    .line 144
    :cond_2
    invoke-virtual {p0}, Lo/abt;->d()I

    move-result v0

    sub-int v0, p4, v0

    invoke-direct {p0, p2, p3, v0}, Lo/abt;->d(JI)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v2, v0

    if-nez v0, :cond_4

    .line 145
    :cond_3
    invoke-direct {p0}, Lo/abt;->g()V

    .line 148
    :cond_4
    :goto_0
    return-void
.end method

.method public a()Z
    .locals 4

    .line 103
    iget-wide v0, p0, Lo/abt;->i:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()I
    .locals 1

    .line 99
    iget v0, p0, Lo/abt;->c:I

    return v0
.end method

.method public b(I)Z
    .locals 6

    .line 152
    const/4 v4, 0x0

    .line 154
    iget v0, p0, Lo/abt;->c:I

    if-le p1, v0, :cond_0

    .line 156
    iget v5, p0, Lo/abt;->b:I

    .line 157
    iget v0, p0, Lo/abt;->c:I

    sub-int v0, p1, v0

    iput v0, p0, Lo/abt;->b:I

    .line 158
    iget v0, p0, Lo/abt;->b:I

    add-int/2addr v0, v5

    iput v0, p0, Lo/abt;->b:I

    .line 159
    iput p1, p0, Lo/abt;->c:I

    .line 160
    iget v0, p0, Lo/abt;->b:I

    invoke-direct {p0, v0}, Lo/abt;->c(I)V

    .line 161
    const/4 v4, 0x1

    .line 163
    :cond_0
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncWithHiHealth total "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mDiff "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/abt;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    return v4
.end method

.method public c()J
    .locals 2

    .line 181
    iget-wide v0, p0, Lo/abt;->m:J

    return-wide v0
.end method

.method public c(III)V
    .locals 9

    .line 172
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recordStepsBeforeShutdown "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/abt;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget-object v0, p0, Lo/abt;->e:Landroid/content/Context;

    iget-wide v1, p0, Lo/abt;->i:J

    iget v3, p0, Lo/abt;->c:I

    move v4, p1

    move v5, p2

    move v6, p3

    .line 175
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    .line 174
    invoke-static/range {v0 .. v8}, Lo/amy;->e(Landroid/content/Context;JIIIIJ)V

    .line 176
    return-void
.end method

.method public c(JZ)Z
    .locals 4

    .line 190
    iget-boolean v0, p0, Lo/abt;->h:Z

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    iget-wide v1, p0, Lo/abt;->g:J

    invoke-static {v0, v1, v2}, Lo/abt$b;->c(Lo/abt$b;J)J

    .line 192
    iput-wide p1, p0, Lo/abt;->g:J

    .line 194
    :cond_0
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    if-eqz p3, :cond_2

    .line 195
    :cond_1
    const-string v0, "Step_StandStepDataManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "theDayChanged mTodayStandardBase.timeStamp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v2}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "timeStamp "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v0

    invoke-static {p1, p2, v0, v1}, Lo/amz;->c(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 197
    iget-object v0, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v0}, Lo/abt$b;->b(Lo/abt$b;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/abt;->m:J

    .line 198
    invoke-direct {p0}, Lo/abt;->k()V

    .line 199
    const/4 v0, 0x1

    return v0

    .line 202
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 1

    .line 90
    iget v0, p0, Lo/abt;->f:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 86
    iput p1, p0, Lo/abt;->f:I

    .line 87
    return-void
.end method

.method public e()I
    .locals 1

    .line 107
    iget v0, p0, Lo/abt;->d:I

    return v0
.end method

.method public h()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 398
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 399
    const-string v0, "standardBase"

    iget-object v1, p0, Lo/abt;->k:Lo/abt$b;

    invoke-static {v1}, Lo/abt$b;->d(Lo/abt$b;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    const-string v0, "restartSteps"

    iget v1, p0, Lo/abt;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    const-string v0, "otherSteps"

    iget v1, p0, Lo/abt;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    const-string v0, "UIShowSteps"

    iget v1, p0, Lo/abt;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    return-object v2
.end method

.class public Lo/bsj;
.super Lo/bsk;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bsj$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lo/bsk;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 2

    .line 489
    invoke-static {p1}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {p2}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b(Lcom/huawei/health/suggestion/model/PlanStat;Landroid/database/Cursor;)V
    .locals 3

    .line 416
    :goto_0
    invoke-interface {p2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 417
    const-string v0, "type"

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 418
    const-string v0, "value"

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 419
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 420
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/huawei/health/suggestion/model/PlanStat;->setValue(Ljava/lang/String;ILjava/lang/String;)V

    .line 422
    :cond_0
    goto :goto_0

    .line 423
    :cond_1
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    .line 424
    return-void
.end method

.method private c(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 2

    .line 493
    invoke-static {p1}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 2

    .line 497
    invoke-static {p1}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v1

    .line 498
    if-eqz v1, :cond_0

    invoke-static {p2}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    if-ge v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 215
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 216
    const-string v0, "status"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 222
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "best_record"

    move-object v3, v7

    const-string v4, "( planId=? OR planId=\'\' ) AND userId=?"

    const/4 v2, 0x2

    new-array v5, v2, [Ljava/lang/String;

    .line 227
    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x1

    aput-object v2, v5, v6

    .line 222
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/data/DBFactory;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 228
    const-string v0, "BestRecordDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u66f4\u65b0\u6700\u4f73\u8bb0\u5f55\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 7

    .line 306
    const/4 v3, 0x0

    .line 307
    const/4 v0, 0x4

    if-eq p3, v0, :cond_0

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    if-eq p3, v0, :cond_0

    const/4 v0, 0x2

    if-eq p3, v0, :cond_0

    const/4 v0, 0x3

    if-ne p3, v0, :cond_2

    .line 310
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select value from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "best_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "planId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 312
    const/4 v0, 0x3

    new-array v5, v0, [Ljava/lang/String;

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    .line 314
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 318
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 319
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 320
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v3

    .line 322
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 325
    :cond_2
    return v3
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I
    .locals 8

    .line 87
    const/4 v6, -0x1

    .line 88
    invoke-virtual {p0, p4}, Lo/bsj;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    invoke-virtual {p0, p1, p2, p3}, Lo/bsj;->c(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v7

    .line 90
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 91
    invoke-virtual/range {p0 .. p5}, Lo/bsj;->c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I

    move-result v6

    .line 92
    const-string v0, "BestRecordDao"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63d2\u5165\u6700\u4f73\u8bb0\u5f55\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 93
    :cond_0
    invoke-virtual {p0, p3, p4, v7}, Lo/bsj;->d(ILjava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-static {p4}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)I

    move-result v6

    .line 95
    const-string v0, "BestRecordDao"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u66f4\u65b0\u6700\u4f73\u8bb0\u5f55\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    :cond_1
    :goto_0
    return v6
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;
    .locals 10

    .line 370
    new-instance v3, Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/PlanStat;-><init>()V

    .line 371
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select planId,type,value from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 372
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "best_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "planId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 373
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 375
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 379
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 380
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 381
    const-string v0, "planId"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 382
    const-string v0, "type"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 383
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 384
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 385
    invoke-virtual {v3, v7, v8, v9}, Lcom/huawei/health/suggestion/model/PlanStat;->setValue(Ljava/lang/String;ILjava/lang/String;)V

    .line 387
    :cond_0
    goto :goto_0

    .line 388
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 390
    :cond_2
    return-object v3
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanStat;)V
    .locals 8

    .line 153
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->c()V

    .line 154
    const/4 v6, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v6, v0, :cond_2

    .line 155
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, v6

    invoke-virtual {p3, p2, v6}, Lcom/huawei/health/suggestion/model/PlanStat;->getValue(Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I

    move-result v7

    .line 156
    if-ltz v7, :cond_1

    const/16 v0, 0xb

    if-ne v6, v0, :cond_1

    .line 157
    if-nez v7, :cond_0

    .line 158
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const/16 v3, 0xc

    invoke-virtual {p3, p2, v3}, Lcom/huawei/health/suggestion/model/PlanStat;->getValue(Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/16 v3, 0xc

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I

    goto :goto_1

    .line 160
    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const/16 v3, 0xc

    invoke-virtual {p3, p2, v3}, Lcom/huawei/health/suggestion/model/PlanStat;->getValue(Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/16 v3, 0xc

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)I

    .line 154
    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 164
    :cond_2
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->e()V

    .line 165
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;II)Z
    .locals 8

    .line 136
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I

    move-result v6

    .line 137
    if-ltz v6, :cond_1

    .line 138
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p3}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v7

    .line 139
    if-eqz p4, :cond_1

    if-eqz v7, :cond_0

    if-ge p4, v7, :cond_1

    .line 140
    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v3, p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I

    .line 143
    :cond_1
    if-ltz v6, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I
    .locals 5

    .line 257
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 258
    const-string v0, "planId"

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const-string v0, "userId"

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const-string v0, "type"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 261
    const-string v0, "value"

    invoke-static {p4}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    const-string v0, "status"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 264
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "best_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v4}, Lcom/huawei/health/suggestion/data/DBFactory;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    .line 268
    const-string v0, "BestRecordDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6dfb\u52a0\u6700\u4f73\u8bb0\u5f55\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)I
    .locals 8

    .line 110
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    .line 111
    const-string v0, "value"

    invoke-virtual {v7, v0, p4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string v0, "status"

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 118
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "best_record"

    move-object v3, v7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "planId=? and userId=? and type="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x2

    new-array v5, v2, [Ljava/lang/String;

    .line 123
    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v5, v6

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x1

    aput-object v2, v5, v6

    .line 118
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/suggestion/data/DBFactory;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 124
    const-string v0, "BestRecordDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u66f4\u65b0\u6700\u4f73\u8bb0\u5f55\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    const/4 v0, 0x1

    return v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 7

    .line 280
    const/4 v3, 0x0

    .line 281
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select value from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 282
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "best_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "planId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 283
    const/4 v0, 0x3

    new-array v5, v0, [Ljava/lang/String;

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    .line 285
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 289
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 290
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 293
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 295
    :cond_1
    return-object v3
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 196
    const-string v0, "BestRecordDao"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "del\u6700\u4f73\u7eaa\u5f55\uff1auserId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " planId:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "best_record"

    const-string v2, "planId=? and userId=?"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    .line 205
    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 201
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    .line 206
    return-void
.end method

.method public d(ILjava/lang/Object;Ljava/lang/String;)Z
    .locals 5

    .line 463
    invoke-static {}, Lo/bsj$a;->d()[I

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v1, v3

    .line 464
    if-ne p1, v4, :cond_0

    .line 465
    invoke-direct {p0, p2, p3}, Lo/bsj;->d(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 463
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 471
    :cond_1
    invoke-static {}, Lo/bsj$a;->a()[I

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    aget v4, v1, v3

    .line 472
    if-ne p1, v4, :cond_2

    .line 473
    invoke-direct {p0, p2, p3}, Lo/bsj;->c(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 471
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 479
    :cond_3
    invoke-static {}, Lo/bsj$a;->e()[I

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_5

    aget v4, v1, v3

    .line 480
    if-ne p1, v4, :cond_4

    .line 481
    invoke-direct {p0, p2, p3}, Lo/bsj;->a(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 479
    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 485
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public d(Ljava/lang/Object;)Z
    .locals 2

    .line 508
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 509
    invoke-static {p1}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 511
    :cond_1
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_2

    invoke-static {p1}, Lo/caj;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 433
    const/4 v3, 0x0

    .line 434
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select type from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 435
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "best_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where ( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "planId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? OR "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "planId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'\' ) AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 437
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 439
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 443
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 444
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    .line 445
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 447
    :cond_0
    return v3
.end method

.method public e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;
    .locals 7

    .line 399
    new-instance v3, Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/PlanStat;-><init>()V

    .line 401
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select type,value from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 402
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "best_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "planId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'\' and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 403
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 405
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 409
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 410
    invoke-direct {p0, v3, v6}, Lo/bsj;->b(Lcom/huawei/health/suggestion/model/PlanStat;Landroid/database/Cursor;)V

    .line 412
    :cond_0
    return-object v3
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/PlanStat;
    .locals 10

    .line 335
    const/4 v3, 0x0

    .line 337
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT planId,type,value FROM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 338
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    const-string v2, "best_record"

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " WHERE ( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "planId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? OR "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "planId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'\' ) AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "status"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 340
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 342
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 346
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 347
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 348
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 349
    new-instance v3, Lcom/huawei/health/suggestion/model/PlanStat;

    invoke-direct {v3}, Lcom/huawei/health/suggestion/model/PlanStat;-><init>()V

    .line 351
    :cond_0
    const-string v0, "planId"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 352
    const-string v0, "type"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 353
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 354
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 355
    invoke-virtual {v3, v7, v8, v9}, Lcom/huawei/health/suggestion/model/PlanStat;->setValue(Ljava/lang/String;ILjava/lang/String;)V

    .line 357
    :cond_1
    goto :goto_0

    .line 358
    :cond_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 360
    :cond_3
    return-object v3
.end method

.method public e(Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanStat;)V
    .locals 7

    .line 238
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 239
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->c()V

    .line 240
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x3

    if-gt v6, v0, :cond_0

    .line 241
    move-object v0, p0

    move-object v1, p1

    move v3, v6

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v6}, Lcom/huawei/health/suggestion/model/PlanStat;->getValue(Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v4

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I

    .line 240
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 243
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->e()V

    .line 245
    :cond_1
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/health/suggestion/model/PlanStat;)V
    .locals 8

    .line 174
    const-string v0, "BestRecordDao"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u66f4\u65b0\u6700\u4f73\u7eaa\u5f55\uff1auserId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " planId:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->c()V

    .line 176
    const/4 v6, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v6, v0, :cond_2

    .line 177
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, v6

    invoke-virtual {p3, p2, v6}, Lcom/huawei/health/suggestion/model/PlanStat;->getValue(Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I

    move-result v7

    .line 178
    if-ltz v7, :cond_1

    const/16 v0, 0xb

    if-ne v6, v0, :cond_1

    .line 179
    if-nez v7, :cond_0

    .line 180
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const/16 v3, 0xc

    invoke-virtual {p3, p2, v3}, Lcom/huawei/health/suggestion/model/PlanStat;->getValue(Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/16 v3, 0xc

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;I)I

    goto :goto_1

    .line 182
    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    const/16 v3, 0xc

    invoke-virtual {p3, p2, v3}, Lcom/huawei/health/suggestion/model/PlanStat;->getValue(Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/16 v3, 0xc

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/bsj;->c(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)I

    .line 176
    :cond_1
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 186
    :cond_2
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->e()V

    .line 187
    return-void
.end method

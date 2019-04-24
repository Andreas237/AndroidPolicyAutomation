.class public Lo/dvc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lo/dvc;->e:Landroid/content/Context;

    .line 54
    return-void
.end method

.method private b(Lo/dwh;ID)J
    .locals 6

    .line 166
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 167
    invoke-direct {p0, v3, p1}, Lo/dvc;->c(Landroid/content/ContentValues;Lo/dwh;)V

    .line 168
    const-string v0, "value"

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 169
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 170
    iget-object v0, p0, Lo/dvc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "recent"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 171
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    return-wide v4
.end method

.method private c(Landroid/content/ContentValues;Lo/dwh;)V
    .locals 3

    .line 276
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 277
    return-void

    .line 279
    :cond_0
    const-string v0, "huid"

    invoke-virtual {p2}, Lo/dwh;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    const-string v0, "recentType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 281
    const-string v0, "firstDate"

    invoke-virtual {p2}, Lo/dwh;->o()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 282
    const-string v0, "endDate"

    invoke-virtual {p2}, Lo/dwh;->l()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 283
    const-string v0, "reportNo"

    invoke-virtual {p2}, Lo/dwh;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 284
    const-string v0, "kakaNum"

    invoke-virtual {p2}, Lo/dwh;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 285
    const-string v0, "price"

    invoke-virtual {p2}, Lo/dwh;->k()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 286
    const-string v0, "medal_id"

    invoke-virtual {p2}, Lo/dwh;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "comments1_id"

    invoke-virtual {p2}, Lo/dwh;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "commentS2_id"

    invoke-virtual {p2}, Lo/dwh;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "stepsRanking"

    invoke-virtual {p2}, Lo/dwh;->d()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 290
    const-string v0, "distanceRanking"

    invoke-virtual {p2}, Lo/dwh;->c()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 291
    const-string v0, "minReportNo"

    invoke-virtual {p2}, Lo/dwh;->n()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 292
    return-void
.end method

.method private d(Lo/dwh;)I
    .locals 4

    .line 244
    invoke-virtual {p1}, Lo/dwh;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 245
    const/4 v0, -0x1

    return v0

    .line 247
    :cond_0
    invoke-virtual {p1}, Lo/dwh;->acquireDataType()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 248
    const/4 v0, -0x1

    return v0

    .line 250
    :cond_1
    invoke-virtual {p1}, Lo/dwh;->h()D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_2

    .line 251
    const/4 v0, -0x1

    return v0

    .line 253
    :cond_2
    invoke-virtual {p1}, Lo/dwh;->a()D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_3

    .line 254
    const/4 v0, -0x1

    return v0

    .line 256
    :cond_3
    invoke-virtual {p1}, Lo/dwh;->b()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 257
    const/4 v0, -0x1

    return v0

    .line 259
    :cond_4
    invoke-virtual {p1}, Lo/dwh;->e()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_5

    .line 260
    const/4 v0, -0x1

    return v0

    .line 262
    :cond_5
    invoke-virtual {p1}, Lo/dwh;->k()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_6

    .line 263
    const/4 v0, -0x1

    return v0

    .line 266
    :cond_6
    invoke-virtual {p1}, Lo/dwh;->o()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_7

    .line 267
    const/4 v0, -0x1

    return v0

    .line 269
    :cond_7
    invoke-virtual {p1}, Lo/dwh;->l()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_8

    .line 270
    const/4 v0, -0x1

    return v0

    .line 272
    :cond_8
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lo/dwh;ID)I
    .locals 6

    .line 223
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 224
    invoke-direct {p0, v3, p1}, Lo/dvc;->c(Landroid/content/ContentValues;Lo/dwh;)V

    .line 225
    const-string v0, "value"

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 226
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwh;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recentType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "dataType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "reportNo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 230
    invoke-virtual {p1}, Lo/dwh;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 231
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    iget-object v0, p0, Lo/dvc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "recent"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v5

    .line 233
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    return v5
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;
    .locals 16

    .line 67
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 68
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    const-string v1, "RecentWeekRecordDBMgr, query ,id is null!return null."

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const/4 v0, 0x0

    return-object v0

    .line 72
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dvc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "recent"

    invoke-virtual {v0, v1}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recentType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "reportNo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 76
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    .line 77
    invoke-static/range {p1 .. p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 78
    invoke-static/range {p2 .. p2}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 82
    const-string v0, "0"

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    :cond_1
    const/4 v0, 0x1

    new-array v5, v0, [Ljava/lang/String;

    .line 84
    invoke-static/range {p1 .. p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = ? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recentType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "reportNo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = (select "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "reportNo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recentType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " order by  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "reportNo"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " desc limit 1)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 91
    :cond_2
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dvc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 94
    const/4 v7, 0x0

    .line 96
    if-eqz v6, :cond_7

    .line 97
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 98
    const/4 v0, 0x0

    if-ne v0, v7, :cond_3

    .line 99
    new-instance v7, Lo/dwh;

    invoke-direct {v7}, Lo/dwh;-><init>()V

    .line 101
    :cond_3
    const-string v0, "huid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dwh;->setHuid(Ljava/lang/String;)V

    .line 102
    const-string v0, "firstDate"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 103
    const-string v0, "endDate"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 104
    invoke-static {v9}, Lo/duf;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/dwh;->c(J)V

    .line 105
    invoke-static {v10}, Lo/duf;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/dwh;->e(J)V

    .line 106
    const-string v0, "dataType"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 107
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 108
    invoke-static {v11}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v12

    .line 109
    const/4 v0, 0x1

    if-ne v8, v0, :cond_4

    .line 110
    invoke-virtual {v7, v12, v13}, Lo/dwh;->a(D)V

    goto :goto_1

    .line 111
    :cond_4
    const/4 v0, 0x2

    if-ne v8, v0, :cond_5

    .line 112
    invoke-virtual {v7, v12, v13}, Lo/dwh;->b(D)V

    .line 115
    :cond_5
    :goto_1
    const-string v0, "reportNo"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/dwh;->c(I)V

    .line 116
    const-string v0, "kakaNum"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/dwh;->d(I)V

    .line 117
    const-string v0, "price"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/dwh;->b(I)V

    .line 118
    const-string v0, "medal_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dwh;->b(Ljava/lang/String;)V

    .line 119
    const-string v0, "comments1_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dwh;->c(Ljava/lang/String;)V

    .line 120
    const-string v0, "commentS2_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dwh;->a(Ljava/lang/String;)V

    .line 121
    const-string v0, "stepsRanking"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 122
    const-string v0, "distanceRanking"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 123
    invoke-static {v14}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/dwh;->e(D)V

    .line 124
    invoke-static {v15}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/dwh;->c(D)V

    .line 125
    const-string v0, "minReportNo"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/dwh;->a(I)V

    .line 126
    goto/16 :goto_0

    .line 127
    :cond_6
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 129
    :cond_7
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query weekRecord="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v7, :cond_8

    const-string v2, "null"

    goto :goto_2

    :cond_8
    move-object v2, v7

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    return-object v7
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 6

    .line 177
    const/4 v3, -0x1

    .line 178
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 179
    return v3

    .line 182
    :cond_0
    const/4 v4, 0x0

    .line 183
    instance-of v0, p1, Lo/dwh;

    if-eqz v0, :cond_1

    .line 184
    move-object v4, p1

    check-cast v4, Lo/dwh;

    .line 186
    :cond_1
    if-nez v4, :cond_2

    .line 187
    return v3

    .line 190
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dwh;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "recentType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 191
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    iget-object v0, p0, Lo/dvc;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "recent"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v5}, Lo/duk;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 193
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "delete result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    return v3
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 62
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "reportNo"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/dvc;->e(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/dvf;)I
    .locals 5

    .line 199
    const/4 v3, -0x1

    .line 200
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 201
    return v3

    .line 204
    :cond_0
    const/4 v4, 0x0

    .line 205
    instance-of v0, p1, Lo/dwh;

    if-eqz v0, :cond_1

    .line 206
    move-object v4, p1

    check-cast v4, Lo/dwh;

    .line 208
    :cond_1
    if-nez v4, :cond_2

    .line 209
    return v3

    .line 212
    :cond_2
    invoke-direct {p0, v4}, Lo/dvc;->d(Lo/dwh;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 213
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    const-string v1, "update Column check not pass"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    const/4 v0, -0x1

    return v0

    .line 217
    :cond_3
    invoke-virtual {v4}, Lo/dwh;->h()D

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v4, v2, v0, v1}, Lo/dvc;->d(Lo/dwh;ID)I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    .line 218
    invoke-virtual {v4}, Lo/dwh;->a()D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-direct {p0, v4, v2, v0, v1}, Lo/dvc;->d(Lo/dwh;ID)I

    move-result v0

    add-int/2addr v3, v0

    .line 219
    return v3
.end method

.method public e(Lo/dvf;)J
    .locals 7

    .line 135
    const-wide/16 v3, -0x1

    .line 136
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 137
    return-wide v3

    .line 140
    :cond_0
    const/4 v5, 0x0

    .line 141
    instance-of v0, p1, Lo/dwh;

    if-eqz v0, :cond_1

    .line 142
    move-object v5, p1

    check-cast v5, Lo/dwh;

    .line 144
    :cond_1
    if-nez v5, :cond_2

    .line 145
    return-wide v3

    .line 149
    :cond_2
    invoke-virtual {v5}, Lo/dwh;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lo/dwh;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/dvc;->e(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v6

    .line 150
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 151
    invoke-virtual {p0, p1}, Lo/dvc;->b(Lo/dvf;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 155
    :cond_3
    invoke-direct {p0, v5}, Lo/dvc;->d(Lo/dwh;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 156
    const-string v0, "PLGACHIEVE_RecentWeekRecordDBMgr"

    const-string v1, "insert Column check not pass"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const-wide/16 v0, -0x1

    return-wide v0

    .line 160
    :cond_4
    invoke-virtual {v5}, Lo/dwh;->h()D

    move-result-wide v0

    const/4 v2, 0x1

    invoke-direct {p0, v5, v2, v0, v1}, Lo/dvc;->b(Lo/dwh;ID)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 161
    invoke-virtual {v5}, Lo/dwh;->a()D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-direct {p0, v5, v2, v0, v1}, Lo/dvc;->b(Lo/dwh;ID)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 162
    return-wide v3
.end method

.method public e(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 57
    const/4 v0, 0x0

    return-object v0
.end method

.class public final Lcom/huawei/feedback/a/a/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/provider/BaseColumns;


# static fields
.field public static final a:Ljava/lang/String; = "t_feedback_advanced"

.field public static final b:Ljava/lang/String; = "questionId"

.field public static final c:Ljava/lang/String; = "questionType"

.field public static final d:Ljava/lang/String; = "recordType"

.field public static final e:Ljava/lang/String; = "content"

.field public static final f:Ljava/lang/String; = "questionDate"

.field public static final g:Ljava/lang/String; = "picUrl"

.field public static final h:Ljava/lang/String; = "picType"

.field public static final i:Ljava/lang/String; = "pQuestionId"

.field public static final j:Ljava/lang/String; = "col1"

.field public static final k:Ljava/lang/String; = "col2"

.field public static final l:Ljava/lang/String; = "col3"

.field public static final m:Ljava/lang/String; = "col4"

.field public static final n:Ljava/lang/String; = "col5"

.field public static final o:Ljava/lang/String; = "taskID"

.field public static final p:Ljava/lang/String; = "filePath"

.field public static final q:Ljava/lang/String; = "taskStatus"

.field public static final r:Ljava/lang/String; = "isLogcat"

.field public static final s:Ljava/lang/String; = "isReport"

.field public static final t:Ljava/lang/String; = "email"

.field private static final u:Ljava/lang/String; = "NewFeedbackTableAdvanced"

.field private static final v:I = 0xe


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    return-void
.end method

.method private static a(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/f;)J
    .locals 5

    .line 283
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 284
    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0

    .line 287
    :cond_1
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 288
    const-string v0, "questionId"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "questionType"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string v0, "content"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    const-string v0, "recordType"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 292
    const-string v0, "questionDate"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const-string v0, "picUrl"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const-string v0, "picType"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string v0, "pQuestionId"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 297
    const-string v0, "col1"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    const-string v0, "col2"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    const-string v0, "col4"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    const-string v0, "taskID"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const-string v0, "filePath"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const-string v0, "taskStatus"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 305
    const-string v0, "col5"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 309
    const-string v0, "isReport"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    .line 311
    :cond_2
    const-string v0, "isReport"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 314
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 315
    const-string v0, "isLogcat"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    .line 317
    :cond_3
    const-string v0, "isLogcat"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 320
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 321
    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/huawei/feedback/bean/f;->b(Ljava/lang/String;)V

    .line 323
    :cond_4
    const-string v0, "email"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    const-string v0, "t_feedback_advanced"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v3

    .line 325
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v3

    if-nez v0, :cond_5

    .line 327
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "insert error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    :cond_5
    return-wide v3
.end method

.method public static a(Lcom/huawei/feedback/a/a/c;Lcom/huawei/feedback/bean/f;)J
    .locals 8

    .line 256
    const/4 v3, 0x0

    .line 257
    const-wide/16 v4, -0x1

    .line 259
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v3, v0

    .line 262
    invoke-static {v3, p1}, Lcom/huawei/feedback/a/a/e;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/f;)J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    move-wide v4, v0

    .line 267
    if-eqz v3, :cond_1

    .line 269
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 264
    :catch_0
    move-exception v6

    .line 265
    const-string v0, "NewFeedbackTableAdvanced"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert table t_feedback_advanced Error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 267
    if-eqz v3, :cond_1

    .line 269
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 267
    :catchall_0
    move-exception v7

    if-eqz v3, :cond_0

    .line 269
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v7

    .line 272
    :cond_1
    :goto_0
    return-wide v4
.end method

.method private static a(Landroid/database/Cursor;)Lcom/huawei/feedback/bean/f;
    .locals 19

    .line 1269
    const/4 v2, 0x0

    .line 1270
    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-eq v0, v1, :cond_2

    .line 1273
    const-string v0, "questionId"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 1274
    const-string v0, "questionType"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 1275
    const-string v0, "recordType"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    .line 1276
    const-string v0, "content"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 1277
    const-string v0, "questionDate"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 1278
    const-string v0, "pQuestionId"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 1279
    const-string v0, "picUrl"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 1280
    const-string v0, "picType"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 1282
    const-string v0, "col1"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 1283
    const-string v0, "col2"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 1284
    const-string v0, "col3"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 1285
    const-string v0, "col4"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 1287
    const-string v0, "taskID"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 1288
    const-string v0, "filePath"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 1289
    const-string v0, "taskStatus"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 1293
    const-string v0, "col5"

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 1298
    const/4 v0, -0x1

    if-eq v0, v3, :cond_0

    const/4 v0, -0x1

    if-eq v0, v4, :cond_0

    const/4 v0, -0x1

    if-eq v0, v5, :cond_0

    const/4 v0, -0x1

    if-eq v0, v6, :cond_0

    const/4 v0, -0x1

    if-eq v0, v7, :cond_0

    const/4 v0, -0x1

    if-eq v0, v8, :cond_0

    const/4 v0, -0x1

    if-eq v0, v9, :cond_0

    const/4 v0, -0x1

    if-eq v0, v10, :cond_0

    const/4 v0, -0x1

    if-eq v0, v11, :cond_0

    const/4 v0, -0x1

    if-eq v0, v12, :cond_0

    const/4 v0, -0x1

    if-eq v0, v13, :cond_0

    const/4 v0, -0x1

    if-ne v0, v14, :cond_1

    .line 1302
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 1305
    :cond_1
    invoke-interface/range {p0 .. p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1307
    new-instance v2, Lcom/huawei/feedback/bean/f;

    invoke-direct {v2}, Lcom/huawei/feedback/bean/f;-><init>()V

    .line 1308
    move-object/from16 v0, p0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->i(Ljava/lang/String;)V

    .line 1309
    move-object/from16 v0, p0

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 1310
    move-object/from16 v0, p0

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 1311
    move-object/from16 v0, p0

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 1312
    move-object/from16 v0, p0

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V

    .line 1313
    move-object/from16 v0, p0

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 1314
    move-object/from16 v0, p0

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 1315
    move-object/from16 v0, p0

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 1317
    move-object/from16 v0, p0

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->p(Ljava/lang/String;)V

    .line 1318
    move-object/from16 v0, p0

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->q(Ljava/lang/String;)V

    .line 1319
    move-object/from16 v0, p0

    invoke-interface {v0, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->f(I)V

    .line 1320
    move-object/from16 v0, p0

    invoke-interface {v0, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->g(Ljava/lang/String;)V

    .line 1322
    move-object/from16 v0, p0

    invoke-interface {v0, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->f(Ljava/lang/String;)V

    .line 1323
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->e(Ljava/lang/String;)V

    .line 1324
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 1328
    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->a(Ljava/lang/String;)V

    .line 1335
    :cond_2
    return-object v2
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .line 140
    const-string v2, "CREATE TABLE IF NOT EXISTS t_feedback_advanced(_id INTEGER PRIMARY KEY AUTOINCREMENT, questionId varchar(256), questionType varchar(256), recordType integer, content varchar(4000), questionDate varchar(256), picUrl varchar(256), picType varchar(256), pQuestionId varchar(256),col1 varchar(256),col2 varchar(256),col3 varchar(256),col4 varchar(4000),taskID varchar(256),filePath varchar(256),taskStatus varchar(256),col5 varchar(256)isLogcat Integer(1),isReport Integer(1),email varchar(256))"

    .line 152
    if-eqz p0, :cond_0

    .line 153
    const-string v0, "CREATE TABLE IF NOT EXISTS t_feedback_advanced(_id INTEGER PRIMARY KEY AUTOINCREMENT, questionId varchar(256), questionType varchar(256), recordType integer, content varchar(4000), questionDate varchar(256), picUrl varchar(256), picType varchar(256), pQuestionId varchar(256),col1 varchar(256),col2 varchar(256),col3 varchar(256),col4 varchar(4000),taskID varchar(256),filePath varchar(256),taskStatus varchar(256),col5 varchar(256)isLogcat Integer(1),isReport Integer(1),email varchar(256))"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :cond_0
    goto :goto_0

    .line 155
    :catch_0
    move-exception v3

    .line 156
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "createTable(SQLiteDatabase db):create table t_feedback_advanced SQLException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    :goto_0
    return-void
.end method

.method private static a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;I)V
    .locals 6

    .line 505
    const-string v0, "NewFeedbackTableAdvanced"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "id"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    const-string v0, "NewFeedbackTableAdvanced"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "type"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    if-eqz p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 508
    :cond_0
    return-void

    .line 511
    :cond_1
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 513
    const-string v0, "taskID"

    invoke-virtual {v3, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    const-string v0, "taskStatus"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 516
    const-string v4, "taskID=?"

    .line 517
    const-string v0, "t_feedback_advanced"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v3, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 519
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 521
    const-string v0, "TASK_ID = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    const-string v0, "NewFeedbackTableAdvanced"

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    :cond_2
    return-void
.end method

.method public static a(Lcom/huawei/feedback/a/a/c;)V
    .locals 5

    .line 167
    const/4 v2, 0x0

    .line 170
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 173
    const-string v3, "CREATE TABLE IF NOT EXISTS t_feedback_advanced(_id INTEGER PRIMARY KEY AUTOINCREMENT, questionId varchar(256), questionType varchar(256), recordType integer, content varchar(4000), questionDate varchar(256), picUrl varchar(256), picType varchar(256), pQuestionId varchar(256),col1 varchar(256),col2 varchar(256),col3 varchar(256),col4 varchar(4000),taskID varchar(256),filePath varchar(256),taskStatus varchar(256),col5 varchar(256),isLogcat Integer(1),isReport Integer(1),email varchar(256))"

    .line 184
    if-eqz v2, :cond_0

    .line 185
    const-string v0, "CREATE TABLE IF NOT EXISTS t_feedback_advanced(_id INTEGER PRIMARY KEY AUTOINCREMENT, questionId varchar(256), questionType varchar(256), recordType integer, content varchar(4000), questionDate varchar(256), picUrl varchar(256), picType varchar(256), pQuestionId varchar(256),col1 varchar(256),col2 varchar(256),col3 varchar(256),col4 varchar(4000),taskID varchar(256),filePath varchar(256),taskStatus varchar(256),col5 varchar(256),isLogcat Integer(1),isReport Integer(1),email varchar(256))"

    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 193
    :cond_0
    if-eqz v2, :cond_2

    .line 195
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 188
    :catch_0
    move-exception v3

    .line 189
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "createTable(DatabaseHelper dbHelper):create table t_feedback_advanced SQLiteException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    if-eqz v2, :cond_2

    .line 195
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 190
    :catch_1
    move-exception v3

    .line 191
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "create table t_feedback_advanced SQLException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    if-eqz v2, :cond_2

    .line 195
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 193
    :catchall_0
    move-exception v4

    if-eqz v2, :cond_1

    .line 195
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_1
    throw v4

    .line 199
    :cond_2
    :goto_0
    return-void
.end method

.method public static a(Lcom/huawei/feedback/a/a/c;I)V
    .locals 8

    .line 1093
    const/4 v5, 0x0

    .line 1095
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v5, v0

    .line 1096
    const-string v0, "t_feedback_advanced"

    const-string v1, "_id=?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v5, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1100
    if-eqz v5, :cond_1

    .line 1102
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1097
    :catch_0
    move-exception v6

    .line 1098
    const-string v0, "NewFeedbackTableAdvanced"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[delete] delete feedback  Error, feedback dbId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1100
    if-eqz v5, :cond_1

    .line 1102
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1100
    :catchall_0
    move-exception v7

    if-eqz v5, :cond_0

    .line 1102
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v7

    .line 1106
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;I)V
    .locals 5

    .line 530
    const/4 v2, 0x0

    .line 533
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 536
    invoke-static {v2, p1, p2}, Lcom/huawei/feedback/a/a/e;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 541
    if-eqz v2, :cond_1

    .line 543
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 538
    :catch_0
    move-exception v3

    .line 539
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "updateTypeById:update table t_feedback_advanced Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 541
    if-eqz v2, :cond_1

    .line 543
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 541
    :catchall_0
    move-exception v4

    if-eqz v2, :cond_0

    .line 543
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v4

    .line 546
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Z
    .locals 8

    .line 445
    const/4 v3, 0x0

    .line 447
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v3, v0

    .line 448
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 449
    const-string v0, "email"

    invoke-virtual {v4, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    const-string v0, "t_feedback_advanced"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v4, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 451
    const/4 v0, -0x1

    if-ne v0, v5, :cond_1

    .line 453
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "updateAllEmailRows error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 454
    const/4 v6, 0x0

    .line 461
    if-eqz v3, :cond_0

    .line 463
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return v6

    .line 456
    :cond_1
    const/4 v6, 0x1

    .line 461
    if-eqz v3, :cond_2

    .line 463
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_2
    return v6

    .line 457
    :catch_0
    move-exception v4

    .line 458
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "update: update table t_feedback_advanced row email Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 459
    const/4 v5, 0x0

    .line 461
    if-eqz v3, :cond_3

    .line 463
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_3
    return v5

    .line 461
    :catchall_0
    move-exception v7

    if-eqz v3, :cond_4

    .line 463
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_4
    throw v7
.end method

.method public static b(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Ljava/util/List;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation

    .line 718
    const/4 v8, 0x0

    .line 719
    const/4 v9, 0x0

    .line 720
    new-instance v10, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 723
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/a/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 725
    if-nez v8, :cond_1

    .line 726
    move-object v11, v10

    .line 816
    nop

    .line 817
    .line 820
    if-eqz v8, :cond_0

    .line 822
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-object v11

    .line 741
    :cond_1
    const/16 v0, 0xd

    :try_start_1
    new-array v11, v0, [Ljava/lang/String;

    const-string v0, "questionId"

    const/4 v1, 0x0

    aput-object v0, v11, v1

    const-string v0, "taskID"

    const/4 v1, 0x1

    aput-object v0, v11, v1

    const-string v0, "filePath"

    const/4 v1, 0x2

    aput-object v0, v11, v1

    const-string v0, "taskStatus"

    const/4 v1, 0x3

    aput-object v0, v11, v1

    const-string v0, "pQuestionId"

    const/4 v1, 0x4

    aput-object v0, v11, v1

    const-string v0, "questionType"

    const/4 v1, 0x5

    aput-object v0, v11, v1

    const-string v0, "recordType"

    const/4 v1, 0x6

    aput-object v0, v11, v1

    const-string v0, "content"

    const/4 v1, 0x7

    aput-object v0, v11, v1

    const-string v0, "questionDate"

    const/16 v1, 0x8

    aput-object v0, v11, v1

    const-string v0, "isLogcat"

    const/16 v1, 0x9

    aput-object v0, v11, v1

    const-string v0, "isReport"

    const/16 v1, 0xa

    aput-object v0, v11, v1

    const-string v0, "email"

    const/16 v1, 0xb

    aput-object v0, v11, v1

    const-string v0, "col5"

    const/16 v1, 0xc

    aput-object v0, v11, v1

    .line 744
    move-object v0, v8

    const-string v1, "t_feedback_advanced"

    move-object v2, v11

    const-string v3, "pQuestionId = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 747
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 750
    const-string v0, "questionId"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 751
    const-string v0, "questionType"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 752
    const-string v0, "recordType"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 753
    const-string v0, "content"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 754
    const-string v0, "questionDate"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 755
    const-string v0, "pQuestionId"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 756
    const-string v0, "taskID"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 757
    const-string v0, "filePath"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 758
    const-string v0, "taskStatus"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 759
    const-string v0, "isLogcat"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 760
    const-string v0, "isReport"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 761
    const-string v0, "email"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v23

    .line 765
    const-string v0, "col5"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v24

    .line 782
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v10, v0

    .line 784
    const/16 v25, 0x0

    .line 786
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v26

    :goto_0
    if-eqz v26, :cond_4

    .line 787
    new-instance v25, Lcom/huawei/feedback/bean/f;

    invoke-direct/range {v25 .. v25}, Lcom/huawei/feedback/bean/f;-><init>()V

    .line 788
    invoke-interface {v9, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->i(Ljava/lang/String;)V

    .line 789
    invoke-interface {v9, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 790
    invoke-interface {v9, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 791
    invoke-interface {v9, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 792
    move/from16 v0, v16

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V

    .line 793
    move/from16 v0, v17

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 795
    move/from16 v0, v18

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->f(Ljava/lang/String;)V

    .line 796
    move/from16 v0, v19

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(Ljava/lang/String;)V

    .line 797
    move/from16 v0, v20

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 799
    move/from16 v0, v21

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->a(Z)V

    .line 800
    move/from16 v0, v22

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(Z)V

    .line 801
    move/from16 v0, v23

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(Ljava/lang/String;)V

    .line 805
    move/from16 v0, v24

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->a(Ljava/lang/String;)V

    .line 809
    move-object/from16 v0, v25

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 786
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v26

    goto/16 :goto_0

    .line 816
    :cond_4
    if-eqz v9, :cond_5

    .line 817
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 820
    :cond_5
    if-eqz v8, :cond_9

    .line 822
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_3

    .line 813
    :catch_0
    move-exception v11

    .line 814
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "search1:query table t_feedback_new all cols Error"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 816
    if-eqz v9, :cond_6

    .line 817
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 820
    :cond_6
    if-eqz v8, :cond_9

    .line 822
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_3

    .line 816
    :catchall_0
    move-exception v27

    if-eqz v9, :cond_7

    .line 817
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 820
    :cond_7
    if-eqz v8, :cond_8

    .line 822
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_8
    throw v27

    .line 826
    :cond_9
    :goto_3
    return-object v10
.end method

.method private static b(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/f;)V
    .locals 6

    .line 388
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 389
    :cond_0
    return-void

    .line 392
    :cond_1
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 399
    const-string v0, "questionId"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    const-string v0, "questionType"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    const-string v0, "recordType"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 402
    const-string v0, "pQuestionId"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    const-string v0, "col1"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    const-string v0, "col2"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    const-string v0, "content"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 408
    const-string v0, "questionDate"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    const-string v0, "picUrl"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    const-string v0, "picType"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    const-string v0, "col3"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->A()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 412
    const-string v0, "col4"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    const-string v0, "taskID"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 414
    const-string v0, "filePath"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    const-string v0, "taskStatus"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 418
    const-string v0, "col5"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 422
    const-string v0, "isLogcat"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    .line 424
    :cond_2
    const-string v0, "isLogcat"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 426
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 427
    const-string v0, "isReport"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_1

    .line 429
    :cond_3
    const-string v0, "isReport"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 432
    :goto_1
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 433
    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/huawei/feedback/bean/f;->b(Ljava/lang/String;)V

    .line 435
    :cond_4
    const-string v0, "email"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    const-string v5, "_id=?"

    .line 437
    const-string v0, "t_feedback_advanced"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    .line 438
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->v()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 437
    invoke-virtual {p0, v0, v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_5

    .line 440
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "updateNew error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    :cond_5
    return-void
.end method

.method public static b(Lcom/huawei/feedback/a/a/c;)V
    .locals 5

    .line 207
    const/4 v2, 0x0

    .line 210
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 227
    const-string v3, "insert into t_feedback_advanced(questionId,questionType,recordType,content,questionDate,picUrl,picType,pQuestionId,col1,col2,col3,col4,taskStatus,col5) select questionId ,questionType,recordType,content,questionDate,picUrl,picType,pQuestionId,col1,col2,col3,col4,3 as taskStatus,col5 from t_feedback_new"

    .line 234
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    if-eqz v2, :cond_1

    .line 243
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 236
    :catch_0
    move-exception v3

    .line 237
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "copy from old  table to t_feedback_advanced Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 241
    if-eqz v2, :cond_1

    .line 243
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 241
    :catchall_0
    move-exception v4

    if-eqz v2, :cond_0

    .line 243
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v4

    .line 246
    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Lcom/huawei/feedback/a/a/c;Lcom/huawei/feedback/bean/f;)V
    .locals 5

    .line 336
    const/4 v2, 0x0

    .line 339
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 342
    invoke-static {v2, p1}, Lcom/huawei/feedback/a/a/e;->b(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/f;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 347
    if-eqz v2, :cond_1

    .line 349
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 344
    :catch_0
    move-exception v3

    .line 345
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "updateNew :update table t_feedback_advanced Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 347
    if-eqz v2, :cond_1

    .line 349
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 347
    :catchall_0
    move-exception v4

    if-eqz v2, :cond_0

    .line 349
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v4

    .line 352
    :cond_1
    :goto_0
    return-void
.end method

.method public static c(Lcom/huawei/feedback/a/a/c;)Ljava/util/List;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/feedback/a/a/c;)Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation

    .line 554
    const/4 v2, 0x0

    .line 555
    const/4 v3, 0x0

    .line 556
    new-instance v4, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 559
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/a/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    .line 561
    if-nez v2, :cond_1

    .line 562
    move-object v5, v4

    .line 703
    nop

    .line 704
    .line 707
    if-eqz v2, :cond_0

    .line 709
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-object v5

    .line 567
    :cond_1
    const-string v5, "select _id ,lastid,questionId,taskID,filePath,taskStatus,questionType,recordType,content,questionDate,tablea.pQuestionId,replyCount,isLogcat,isReport,email,col5,evaluationCount,commitRecordType from (select _id ,max(_id) as lastId ,questionId,taskID,filePath,taskStatus,questionType ,recordType,content,questionDate,pQuestionId,isLogcat,isReport,email,col5 from  t_feedback_advanced  group by pQuestionId ) tablea left outer join (select count(_id) as replyCount ,pQuestionId from t_feedback_advanced  where recordType = \'2\' group by pQuestionId ) tableb on tablea.pQuestionId = tableb.pQuestionId left outer join (select count(_id) as evaluationCount ,pQuestionId from t_feedback_advanced  where recordType = \'2\' and (col3 = \'-1\' or col3 =\'1\') group by pQuestionId ) tablec on tablea.pQuestionId = tablec.pQuestionId left outer join (select recordType as commitRecordType ,pQuestionId from t_feedback_advanced where taskStatus != \'4\' and (recordType = \'2\' or recordType = \'1\') group by pQuestionId order by max(_id) desc) tabled on tablea.pQuestionId = tabled.pQuestionId where tablea.taskStatus != \'4\' order by lastid desc"

    .line 591
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v2, v5, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v3, v0

    .line 593
    const/4 v0, 0x0

    if-eq v0, v3, :cond_f

    .line 596
    const-string v0, "questionId"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    .line 597
    const-string v0, "_id"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 598
    const-string v0, "questionType"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 599
    const-string v0, "recordType"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 600
    const-string v0, "content"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v10

    .line 601
    const-string v0, "questionDate"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 602
    const-string v0, "pQuestionId"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 603
    const-string v0, "replyCount"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 604
    const-string v0, "taskID"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 605
    const-string v0, "filePath"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 606
    const-string v0, "taskStatus"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 607
    const-string v0, "isLogcat"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 608
    const-string v0, "isReport"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 609
    const-string v0, "email"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 610
    const-string v0, "evaluationCount"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 611
    const-string v0, "commitRecordType"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 616
    const-string v0, "col5"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v22

    .line 622
    const/4 v0, -0x1

    if-eq v0, v6, :cond_2

    const/4 v0, -0x1

    if-eq v0, v8, :cond_2

    const/4 v0, -0x1

    if-eq v0, v9, :cond_2

    const/4 v0, -0x1

    if-eq v0, v10, :cond_2

    const/4 v0, -0x1

    if-eq v0, v11, :cond_2

    const/4 v0, -0x1

    if-eq v0, v12, :cond_2

    const/4 v0, -0x1

    if-ne v0, v13, :cond_5

    .line 624
    :cond_2
    move-object/from16 v23, v4

    .line 703
    if-eqz v3, :cond_3

    .line 704
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 707
    :cond_3
    if-eqz v2, :cond_4

    .line 709
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_4
    return-object v23

    .line 627
    :cond_5
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v4, v0

    .line 629
    const/16 v23, 0x0

    .line 630
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v24

    :goto_0
    if-eqz v24, :cond_f

    .line 631
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 632
    goto/16 :goto_7

    .line 635
    :cond_6
    new-instance v23, Lcom/huawei/feedback/bean/f;

    invoke-direct/range {v23 .. v23}, Lcom/huawei/feedback/bean/f;-><init>()V

    .line 636
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(I)V

    .line 637
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->i(Ljava/lang/String;)V

    .line 638
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 639
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 640
    invoke-interface {v3, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 641
    invoke-interface {v3, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V

    .line 642
    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 644
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/feedback/bean/f;->n()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 645
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_7

    .line 646
    invoke-interface {v3, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->f(Ljava/lang/String;)V

    .line 647
    invoke-interface {v3, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(Ljava/lang/String;)V

    .line 648
    move/from16 v0, v16

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    goto :goto_2

    .line 650
    :cond_7
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lcom/huawei/feedback/a/a/e;->b(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Ljava/util/List;

    move-result-object v25

    .line 651
    invoke-interface/range {v25 .. v25}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_1
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v0

    check-cast v27, Lcom/huawei/feedback/bean/f;

    .line 652
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 653
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->f(Ljava/lang/String;)V

    .line 654
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 655
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(Ljava/lang/String;)V

    .line 656
    goto :goto_2

    .line 658
    :cond_8
    move-object/from16 v0, v23

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 662
    goto :goto_1

    .line 665
    :cond_9
    :goto_2
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->d(I)V

    .line 666
    move/from16 v0, v17

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    const/4 v0, 0x1

    goto :goto_3

    :cond_a
    const/4 v0, 0x0

    :goto_3
    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->a(Z)V

    .line 667
    move/from16 v0, v18

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    const/4 v0, 0x1

    goto :goto_4

    :cond_b
    const/4 v0, 0x0

    :goto_4
    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(Z)V

    .line 668
    move/from16 v0, v19

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(Ljava/lang/String;)V

    .line 672
    move/from16 v0, v22

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->a(Ljava/lang/String;)V

    .line 677
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v25

    .line 678
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_c

    .line 679
    move/from16 v0, v21

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v25

    .line 681
    :cond_c
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/feedback/bean/f;->u()I

    move-result v0

    if-lez v0, :cond_e

    move/from16 v0, v25

    const/4 v1, 0x2

    if-ne v0, v1, :cond_e

    .line 682
    move-object/from16 v0, v23

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->a(I)V

    .line 683
    move/from16 v0, v20

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v26

    .line 684
    invoke-virtual/range {v23 .. v23}, Lcom/huawei/feedback/bean/f;->u()I

    move-result v0

    move/from16 v1, v26

    if-ne v1, v0, :cond_d

    .line 686
    move-object/from16 v0, v23

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->a(I)V

    goto :goto_5

    .line 689
    :cond_d
    move-object/from16 v0, v23

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->a(I)V

    .line 691
    :goto_5
    goto :goto_6

    .line 693
    :cond_e
    move-object/from16 v0, v23

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->a(I)V

    .line 696
    :goto_6
    move-object/from16 v0, v23

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 630
    :goto_7
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v24

    goto/16 :goto_0

    .line 703
    :cond_f
    if-eqz v3, :cond_10

    .line 704
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 707
    :cond_10
    if-eqz v2, :cond_14

    .line 709
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_8

    .line 700
    :catch_0
    move-exception v5

    .line 701
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "search:query table t_feedback_new all cols Error"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 703
    if-eqz v3, :cond_11

    .line 704
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 707
    :cond_11
    if-eqz v2, :cond_14

    .line 709
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_8

    .line 703
    :catchall_0
    move-exception v28

    if-eqz v3, :cond_12

    .line 704
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 707
    :cond_12
    if-eqz v2, :cond_13

    .line 709
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_13
    throw v28

    .line 713
    :cond_14
    :goto_8
    return-object v4
.end method

.method public static c(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation

    .line 834
    const/4 v8, 0x0

    .line 835
    const/4 v9, 0x0

    .line 836
    new-instance v10, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 839
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/a/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 840
    if-nez v8, :cond_1

    .line 841
    move-object v11, v10

    .line 914
    nop

    .line 915
    .line 918
    if-eqz v8, :cond_0

    .line 920
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-object v11

    .line 845
    :cond_1
    move-object v0, v8

    const-string v1, "t_feedback_advanced"

    const/16 v2, 0x10

    :try_start_1
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_id"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "questionId"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "questionType"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "recordType"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "content"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "questionDate"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    const-string v3, "pQuestionId"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "picUrl"

    const/4 v4, 0x7

    aput-object v3, v2, v4

    const-string v3, "picType"

    const/16 v4, 0x8

    aput-object v3, v2, v4

    const-string v3, "col1"

    const/16 v4, 0x9

    aput-object v3, v2, v4

    const-string v3, "col2"

    const/16 v4, 0xa

    aput-object v3, v2, v4

    const-string v3, "col3"

    const/16 v4, 0xb

    aput-object v3, v2, v4

    const-string v3, "col4"

    const/16 v4, 0xc

    aput-object v3, v2, v4

    const-string v3, "taskID"

    const/16 v4, 0xd

    aput-object v3, v2, v4

    const-string v3, "taskStatus"

    const/16 v4, 0xe

    aput-object v3, v2, v4

    const-string v3, "filePath"

    const/16 v4, 0xf

    aput-object v3, v2, v4

    const-string v3, "pQuestionId=?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const-string v7, "_id"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    .line 851
    const/4 v0, 0x0

    if-eq v0, v9, :cond_6

    .line 854
    const-string v0, "_id"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v11

    .line 855
    const-string v0, "questionId"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 856
    const-string v0, "questionType"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 857
    const-string v0, "recordType"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 858
    const-string v0, "content"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 859
    const-string v0, "questionDate"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 860
    const-string v0, "pQuestionId"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v17

    .line 861
    const-string v0, "picUrl"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v18

    .line 862
    const-string v0, "picType"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v19

    .line 864
    const-string v0, "col1"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v20

    .line 865
    const-string v0, "col2"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v21

    .line 866
    const-string v0, "col3"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v22

    .line 867
    const-string v0, "col4"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v23

    .line 868
    const-string v0, "taskID"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v24

    .line 869
    const-string v0, "filePath"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v25

    .line 870
    const-string v0, "taskStatus"

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v26

    .line 872
    const/4 v0, -0x1

    if-eq v0, v12, :cond_2

    const/4 v0, -0x1

    if-eq v0, v11, :cond_2

    const/4 v0, -0x1

    if-eq v0, v13, :cond_2

    const/4 v0, -0x1

    if-eq v0, v14, :cond_2

    const/4 v0, -0x1

    if-eq v0, v15, :cond_2

    const/4 v0, -0x1

    move/from16 v1, v16

    if-eq v0, v1, :cond_2

    const/4 v0, -0x1

    move/from16 v1, v17

    if-eq v0, v1, :cond_2

    const/4 v0, -0x1

    move/from16 v1, v19

    if-eq v0, v1, :cond_2

    const/4 v0, -0x1

    move/from16 v1, v18

    if-eq v0, v1, :cond_2

    const/4 v0, -0x1

    move/from16 v1, v20

    if-eq v0, v1, :cond_2

    const/4 v0, -0x1

    move/from16 v1, v21

    if-eq v0, v1, :cond_2

    const/4 v0, -0x1

    move/from16 v1, v22

    if-eq v0, v1, :cond_2

    const/4 v0, -0x1

    move/from16 v1, v23

    if-ne v0, v1, :cond_5

    .line 877
    :cond_2
    move-object/from16 v27, v10

    .line 914
    if-eqz v9, :cond_3

    .line 915
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 918
    :cond_3
    if-eqz v8, :cond_4

    .line 920
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_4
    return-object v27

    .line 880
    :cond_5
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v10, v0

    .line 882
    const/16 v27, 0x0

    .line 884
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v28

    :goto_0
    if-eqz v28, :cond_6

    .line 885
    new-instance v27, Lcom/huawei/feedback/bean/f;

    invoke-direct/range {v27 .. v27}, Lcom/huawei/feedback/bean/f;-><init>()V

    .line 886
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(I)V

    .line 887
    invoke-interface {v9, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->i(Ljava/lang/String;)V

    .line 888
    invoke-interface {v9, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 889
    invoke-interface {v9, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 890
    invoke-interface {v9, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 891
    move/from16 v0, v16

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V

    .line 892
    move/from16 v0, v17

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 894
    move/from16 v0, v18

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 895
    move/from16 v0, v19

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 896
    invoke-virtual/range {v27 .. v27}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/phoneserviceuni/common/e/f;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->a(Landroid/graphics/Bitmap;)V

    .line 898
    move/from16 v0, v20

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->p(Ljava/lang/String;)V

    .line 899
    move/from16 v0, v21

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->q(Ljava/lang/String;)V

    .line 900
    move/from16 v0, v22

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->f(I)V

    .line 901
    move/from16 v0, v23

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->g(Ljava/lang/String;)V

    .line 903
    move/from16 v0, v24

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->f(Ljava/lang/String;)V

    .line 904
    move/from16 v0, v25

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->e(Ljava/lang/String;)V

    .line 905
    move/from16 v0, v26

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    move-object/from16 v1, v27

    invoke-virtual {v1, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 907
    move-object/from16 v0, v27

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 884
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v28

    goto/16 :goto_0

    .line 914
    :cond_6
    if-eqz v9, :cond_7

    .line 915
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 918
    :cond_7
    if-eqz v8, :cond_b

    .line 920
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 911
    :catch_0
    move-exception v11

    .line 912
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "[queryById] query table t_feedback_advanced  Error"

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 914
    if-eqz v9, :cond_8

    .line 915
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 918
    :cond_8
    if-eqz v8, :cond_b

    .line 920
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_1

    .line 914
    :catchall_0
    move-exception v29

    if-eqz v9, :cond_9

    .line 915
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 918
    :cond_9
    if-eqz v8, :cond_a

    .line 920
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_a
    throw v29

    .line 924
    :cond_b
    :goto_1
    return-object v10
.end method

.method private static c(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/f;)V
    .locals 6

    .line 475
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 476
    :cond_0
    return-void

    .line 479
    :cond_1
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 481
    const-string v0, "content"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    const-string v0, "questionDate"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    const-string v0, "picUrl"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 484
    const-string v0, "picType"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    const-string v0, "col3"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->A()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 486
    const-string v0, "col4"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    const-string v0, "taskID"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    const-string v0, "filePath"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 489
    const-string v0, "taskStatus"

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 490
    const-string v5, "_id=?"

    .line 491
    const-string v0, "t_feedback_advanced"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    .line 492
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->v()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 491
    invoke-virtual {p0, v0, v4, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_2

    .line 494
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "update error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 496
    :cond_2
    return-void
.end method

.method public static c(Lcom/huawei/feedback/a/a/c;Lcom/huawei/feedback/bean/f;)V
    .locals 5

    .line 362
    const/4 v2, 0x0

    .line 365
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 368
    invoke-static {v2, p1}, Lcom/huawei/feedback/a/a/e;->c(Landroid/database/sqlite/SQLiteDatabase;Lcom/huawei/feedback/bean/f;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 373
    if-eqz v2, :cond_1

    .line 375
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 370
    :catch_0
    move-exception v3

    .line 371
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "update: update table t_feedback_advanced Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 373
    if-eqz v2, :cond_1

    .line 375
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 373
    :catchall_0
    move-exception v4

    if-eqz v2, :cond_0

    .line 375
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v4

    .line 379
    :cond_1
    :goto_0
    return-void
.end method

.method public static d(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Lcom/huawei/feedback/bean/f;
    .locals 13

    .line 932
    const/4 v8, 0x0

    .line 933
    const/4 v9, 0x0

    .line 934
    const/4 v10, 0x0

    .line 936
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 937
    if-nez v8, :cond_1

    .line 938
    const/4 v11, 0x0

    .line 959
    nop

    .line 960
    .line 963
    if-eqz v8, :cond_0

    .line 965
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-object v11

    .line 945
    :cond_1
    move-object v0, v8

    const-string v1, "t_feedback_advanced"

    const/16 v2, 0x10

    :try_start_1
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "questionId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "questionType"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "recordType"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "content"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "questionDate"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "pQuestionId"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    const-string v3, "picUrl"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "picType"

    const/4 v4, 0x7

    aput-object v3, v2, v4

    const-string v3, "col1"

    const/16 v4, 0x8

    aput-object v3, v2, v4

    const-string v3, "col2"

    const/16 v4, 0x9

    aput-object v3, v2, v4

    const-string v3, "col3"

    const/16 v4, 0xa

    aput-object v3, v2, v4

    const-string v3, "col4"

    const/16 v4, 0xb

    aput-object v3, v2, v4

    const-string v3, "taskID"

    const/16 v4, 0xc

    aput-object v3, v2, v4

    const-string v3, "taskStatus"

    const/16 v4, 0xd

    aput-object v3, v2, v4

    const-string v3, "filePath"

    const/16 v4, 0xe

    aput-object v3, v2, v4

    const-string v3, "col5"

    const/16 v4, 0xf

    aput-object v3, v2, v4

    const-string v3, "questionId=? and recordType=1"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 955
    invoke-static {v10}, Lcom/huawei/feedback/a/a/e;->a(Landroid/database/Cursor;)Lcom/huawei/feedback/bean/f;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v9, v0

    .line 959
    if-eqz v10, :cond_2

    .line 960
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 963
    :cond_2
    if-eqz v8, :cond_6

    .line 965
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 956
    :catch_0
    move-exception v11

    .line 957
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "[queryById] query table t_feedback_new  Error"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 959
    if-eqz v10, :cond_3

    .line 960
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 963
    :cond_3
    if-eqz v8, :cond_6

    .line 965
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 959
    :catchall_0
    move-exception v12

    if-eqz v10, :cond_4

    .line 960
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 963
    :cond_4
    if-eqz v8, :cond_5

    .line 965
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_5
    throw v12

    .line 969
    :cond_6
    :goto_0
    return-object v9
.end method

.method public static d(Lcom/huawei/feedback/a/a/c;)V
    .locals 6

    .line 1133
    const/4 v3, 0x0

    .line 1135
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v3, v0

    .line 1136
    const-string v0, "t_feedback_advanced"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1140
    if-eqz v3, :cond_1

    .line 1142
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1137
    :catch_0
    move-exception v4

    .line 1138
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "[delete] delete table t_feedback_new  Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1140
    if-eqz v3, :cond_1

    .line 1142
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1140
    :catchall_0
    move-exception v5

    if-eqz v3, :cond_0

    .line 1142
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v5

    .line 1146
    :cond_1
    :goto_0
    return-void
.end method

.method public static e(Lcom/huawei/feedback/a/a/c;)V
    .locals 6

    .line 1153
    const/4 v2, 0x0

    .line 1155
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 1157
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 1158
    const-string v0, "t_feedback_advanced"

    const-string v1, "taskStatus=?"

    invoke-virtual {v2, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 1160
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 1161
    const-string v0, "t_feedback_advanced"

    const-string v1, "taskStatus=?"

    invoke-virtual {v2, v0, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1166
    if-eqz v2, :cond_1

    .line 1168
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1163
    :catch_0
    move-exception v3

    .line 1164
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "[delete] deleteFeedbackSuccess:delete table t_feedback_new  Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1166
    if-eqz v2, :cond_1

    .line 1168
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1166
    :catchall_0
    move-exception v5

    if-eqz v2, :cond_0

    .line 1168
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v5

    .line 1172
    :cond_1
    :goto_0
    return-void
.end method

.method public static e(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)V
    .locals 7

    .line 1113
    const/4 v4, 0x0

    .line 1115
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v4, v0

    .line 1116
    const-string v0, "t_feedback_advanced"

    const-string v1, "pQuestionId=?"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v4, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1120
    if-eqz v4, :cond_1

    .line 1122
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1117
    :catch_0
    move-exception v5

    .line 1118
    const-string v0, "NewFeedbackTableAdvanced"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[delete] delete feedback  Error, feedback pquestionId = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1120
    if-eqz v4, :cond_1

    .line 1122
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1120
    :catchall_0
    move-exception v6

    if-eqz v4, :cond_0

    .line 1122
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v6

    .line 1126
    :cond_1
    :goto_0
    return-void
.end method

.method public static f(Lcom/huawei/feedback/a/a/c;Ljava/lang/String;)Lcom/huawei/feedback/bean/f;
    .locals 13

    .line 1228
    const/4 v8, 0x0

    .line 1229
    const/4 v9, 0x0

    .line 1230
    const/4 v10, 0x0

    .line 1232
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 1233
    if-nez v8, :cond_1

    .line 1234
    const/4 v11, 0x0

    .line 1255
    nop

    .line 1256
    .line 1259
    if-eqz v8, :cond_0

    .line 1261
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-object v11

    .line 1241
    :cond_1
    move-object v0, v8

    const-string v1, "t_feedback_advanced"

    const/16 v2, 0x10

    :try_start_1
    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "questionId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "questionType"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "recordType"

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-string v3, "content"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const-string v3, "questionDate"

    const/4 v4, 0x4

    aput-object v3, v2, v4

    const-string v3, "pQuestionId"

    const/4 v4, 0x5

    aput-object v3, v2, v4

    const-string v3, "picUrl"

    const/4 v4, 0x6

    aput-object v3, v2, v4

    const-string v3, "picType"

    const/4 v4, 0x7

    aput-object v3, v2, v4

    const-string v3, "col1"

    const/16 v4, 0x8

    aput-object v3, v2, v4

    const-string v3, "col2"

    const/16 v4, 0x9

    aput-object v3, v2, v4

    const-string v3, "col3"

    const/16 v4, 0xa

    aput-object v3, v2, v4

    const-string v3, "col4"

    const/16 v4, 0xb

    aput-object v3, v2, v4

    const-string v3, "taskID"

    const/16 v4, 0xc

    aput-object v3, v2, v4

    const-string v3, "taskStatus"

    const/16 v4, 0xd

    aput-object v3, v2, v4

    const-string v3, "filePath"

    const/16 v4, 0xe

    aput-object v3, v2, v4

    const-string v3, "col5"

    const/16 v4, 0xf

    aput-object v3, v2, v4

    const-string v3, "questionId=? and recordType=2"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 1251
    invoke-static {v10}, Lcom/huawei/feedback/a/a/e;->a(Landroid/database/Cursor;)Lcom/huawei/feedback/bean/f;
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v9, v0

    .line 1255
    if-eqz v10, :cond_2

    .line 1256
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1259
    :cond_2
    if-eqz v8, :cond_6

    .line 1261
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1252
    :catch_0
    move-exception v11

    .line 1253
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "[queryById] query table t_feedback_new  Error"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1255
    if-eqz v10, :cond_3

    .line 1256
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1259
    :cond_3
    if-eqz v8, :cond_6

    .line 1261
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 1255
    :catchall_0
    move-exception v12

    if-eqz v10, :cond_4

    .line 1256
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 1259
    :cond_4
    if-eqz v8, :cond_5

    .line 1261
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_5
    throw v12

    .line 1265
    :cond_6
    :goto_0
    return-object v9
.end method

.method public static f(Lcom/huawei/feedback/a/a/c;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/feedback/a/a/c;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 1179
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "queryBatchQuestionIds start"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1181
    const/4 v3, 0x0

    .line 1183
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1185
    const/4 v5, 0x0

    .line 1187
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v3, v0

    .line 1188
    const-string v6, "select questionId from t_feedback_advanced where questionId not in (select questionId from t_feedback_advanced where recordType = 2) order by _id desc limit 0,30"

    .line 1190
    const/4 v0, 0x0

    invoke-virtual {v3, v6, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v5, v0

    .line 1192
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1195
    const-string v0, "questionId"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 1197
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    :goto_0
    if-eqz v8, :cond_0

    .line 1198
    invoke-interface {v5, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1197
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v8

    goto :goto_0

    .line 1206
    :cond_0
    if-eqz v5, :cond_1

    .line 1207
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 1209
    :cond_1
    if-eqz v3, :cond_2

    .line 1211
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 1214
    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 1215
    const-string v0, "NewFeedbackTableAdvanced"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "questionIds = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 1217
    :cond_3
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "queryBatchQuestionIds over"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1218
    goto/16 :goto_4

    .line 1202
    :catch_0
    move-exception v6

    .line 1203
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "[delete] queryBatchQuestionIds:delete table t_feedback_new  Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1206
    if-eqz v5, :cond_4

    .line 1207
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 1209
    :cond_4
    if-eqz v3, :cond_5

    .line 1211
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 1214
    :cond_5
    const/4 v6, 0x0

    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_6

    .line 1215
    const-string v0, "NewFeedbackTableAdvanced"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "questionIds = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 1217
    :cond_6
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "queryBatchQuestionIds over"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1218
    goto :goto_4

    .line 1206
    :catchall_0
    move-exception v9

    if-eqz v5, :cond_7

    .line 1207
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 1209
    :cond_7
    if-eqz v3, :cond_8

    .line 1211
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 1214
    :cond_8
    const/4 v10, 0x0

    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_9

    .line 1215
    const-string v0, "NewFeedbackTableAdvanced"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "questionIds = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 1217
    :cond_9
    const-string v0, "NewFeedbackTableAdvanced"

    const-string v1, "queryBatchQuestionIds over"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    throw v9

    .line 1219
    :goto_4
    return-object v4
.end method

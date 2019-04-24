.class public final Lcom/huawei/feedback/a/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/provider/BaseColumns;


# static fields
.field public static final a:Ljava/lang/String; = "t_feedback_new"

.field public static final b:Ljava/lang/String; = "questionId"

.field public static final c:Ljava/lang/String; = "recordType"

.field public static final d:Ljava/lang/String; = "questionType"

.field public static final e:Ljava/lang/String; = "content"

.field public static final f:Ljava/lang/String; = "picUrl"

.field public static final g:Ljava/lang/String; = "questionDate"

.field public static final h:Ljava/lang/String; = "picType"

.field public static final i:Ljava/lang/String; = "pQuestionId"

.field public static final j:Ljava/lang/String; = "col1"

.field public static final k:Ljava/lang/String; = "col2"

.field public static final l:Ljava/lang/String; = "col3"

.field public static final m:Ljava/lang/String; = "col4"

.field public static final n:Ljava/lang/String; = "col5"

.field private static final o:Ljava/lang/String; = "NewFeedbackTable"

.field private static final p:Ljava/lang/String; = "CREATE TABLE IF NOT EXISTS t_feedback_new(_id INTEGER PRIMARY KEY AUTOINCREMENT, questionId varchar(256), questionType varchar(256), recordType integer, content varchar(4000), questionDate varchar(256), picUrl varchar(256), picType varchar(256), pQuestionId varchar(256),col1 varchar(256),col2 varchar(256),col3 varchar(256),col4 varchar(4000),col5 varchar(256))"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    return-void
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 3

    .line 110
    if-eqz p0, :cond_0

    .line 111
    const-string v0, "CREATE TABLE IF NOT EXISTS t_feedback_new(_id INTEGER PRIMARY KEY AUTOINCREMENT, questionId varchar(256), questionType varchar(256), recordType integer, content varchar(4000), questionDate varchar(256), picUrl varchar(256), picType varchar(256), pQuestionId varchar(256),col1 varchar(256),col2 varchar(256),col3 varchar(256),col4 varchar(4000),col5 varchar(256))"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    :cond_0
    goto :goto_0

    .line 113
    :catch_0
    move-exception v2

    .line 114
    const-string v0, "NewFeedbackTable"

    const-string v1, "create table t_feedback_new Error"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :goto_0
    return-void
.end method

.method public static a(Lcom/huawei/feedback/a/a/c;)V
    .locals 5

    .line 125
    const/4 v2, 0x0

    .line 128
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 130
    if-eqz v2, :cond_0

    .line 131
    const-string v0, "CREATE TABLE IF NOT EXISTS t_feedback_new(_id INTEGER PRIMARY KEY AUTOINCREMENT, questionId varchar(256), questionType varchar(256), recordType integer, content varchar(4000), questionDate varchar(256), picUrl varchar(256), picType varchar(256), pQuestionId varchar(256),col1 varchar(256),col2 varchar(256),col3 varchar(256),col4 varchar(4000),col5 varchar(256))"

    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    :cond_0
    if-eqz v2, :cond_2

    .line 141
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 134
    :catch_0
    move-exception v3

    .line 135
    const-string v0, "NewFeedbackTable"

    const-string v1, "create table t_feedback SQLiteException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    if-eqz v2, :cond_2

    .line 141
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 136
    :catch_1
    move-exception v3

    .line 137
    const-string v0, "NewFeedbackTable"

    const-string v1, "create table t_feedback SQLException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    if-eqz v2, :cond_2

    .line 141
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 139
    :catchall_0
    move-exception v4

    if-eqz v2, :cond_1

    .line 141
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_1
    throw v4

    .line 144
    :cond_2
    :goto_0
    return-void
.end method

.method public static b(Lcom/huawei/feedback/a/a/c;)V
    .locals 5

    .line 152
    const/4 v2, 0x0

    .line 155
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/feedback/a/a/c;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    move-object v2, v0

    .line 157
    const-string v3, "insert into t_feedback_new(questionId,questionType,content,questionDate,recordType,pQuestionId) select * from  (select questionId ,questionType,question as content,questionDate as questionDate,1 as recordType,questionId as pQuestionId  from t_feedback  union all select questionId,questionType,answer as content,answerDate as questionDate ,2 as recordType,questionId as pQuestionId from t_feedback where answer != \'\')"

    .line 164
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    if-eqz v2, :cond_1

    .line 171
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 166
    :catch_0
    move-exception v3

    .line 167
    const-string v0, "NewFeedbackTable"

    const-string v1, "copy from old  table to t_feedback_new Error"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    if-eqz v2, :cond_1

    .line 171
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    goto :goto_0

    .line 169
    :catchall_0
    move-exception v4

    if-eqz v2, :cond_0

    .line 171
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    throw v4

    .line 174
    :cond_1
    :goto_0
    return-void
.end method

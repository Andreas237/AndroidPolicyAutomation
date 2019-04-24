.class public Lo/dut;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lo/dut;->b:Landroid/content/Context;

    .line 78
    return-void
.end method

.method private static a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 285
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 286
    const/4 v0, -0x1

    if-eq v0, v3, :cond_0

    .line 287
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 289
    :cond_0
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStringColumn wrong columnName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string v0, "1"

    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 128
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "queryAllKakaInfo, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const/4 v0, 0x0

    return-object v0

    .line 132
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dut;->b:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "kaka_task_record"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 135
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v3, v0}, Lo/dut;->e(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private b(Lo/dvq;)J
    .locals 7

    .line 202
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 203
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dvq;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    invoke-direct {p0, v3, p1}, Lo/dut;->d(Landroid/content/ContentValues;Lo/dvq;)Z

    move-result v4

    .line 205
    if-nez v4, :cond_0

    .line 206
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "insert result is Invalid=-1"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-wide/16 v0, -0x1

    return-wide v0

    .line 209
    :cond_0
    iget-object v0, p0, Lo/dut;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "kaka_task_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v5

    .line 210
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    return-wide v5
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;
    .locals 7

    .line 95
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    :cond_0
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "KakaTaskRecordDBMgr, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_1
    const/4 v4, 0x0

    .line 101
    const/4 v5, 0x0

    .line 103
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dut;->b:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "kaka_task_record"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "taskId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 105
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    iget-object v0, p0, Lo/dut;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 107
    invoke-static {p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 106
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v6, v1}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 110
    goto :goto_0

    .line 108
    :catch_0
    move-exception v6

    .line 109
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "KakaTaskRecordDBMgr, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :goto_0
    if-eqz v5, :cond_4

    .line 112
    :goto_1
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 113
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 114
    new-instance v4, Lo/dvq;

    invoke-direct {v4}, Lo/dvq;-><init>()V

    .line 116
    :cond_2
    invoke-virtual {v4, p1}, Lo/dvq;->e(Ljava/lang/String;)V

    .line 117
    invoke-direct {p0, v5, v4}, Lo/dut;->e(Landroid/database/Cursor;Lo/dvq;)Lo/dvq;

    goto :goto_1

    .line 119
    :cond_3
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 121
    :cond_4
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query kakaTaskInfo="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_5

    const-string v2, "null"

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, Lo/dvq;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    return-object v4
.end method

.method private static d(Landroid/database/Cursor;Ljava/lang/String;)I
    .locals 4

    .line 319
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 320
    const/4 v0, -0x1

    if-eq v0, v3, :cond_0

    .line 321
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    return v0

    .line 323
    :cond_0
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStringColumn wrong columnName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lo/dvq;Lo/dvq;)I
    .locals 7

    .line 260
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 261
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dvq;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    invoke-direct {p0, v3, p1, p2}, Lo/dut;->d(Landroid/content/ContentValues;Lo/dvq;Lo/dvq;)Z

    move-result v4

    .line 265
    if-nez v4, :cond_0

    .line 266
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "update status error"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    const/4 v0, -0x1

    return v0

    .line 269
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "taskId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\' and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dvq;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 270
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    iget-object v0, p0, Lo/dut;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "kaka_task_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v5}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v6

    .line 272
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    return v6
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 140
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 141
    :cond_0
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "queryAllKakaInfo, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const/4 v0, 0x0

    return-object v0

    .line 144
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dut;->b:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "kaka_task_record"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "taskStatus"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 147
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-direct {p0, v3, v0}, Lo/dut;->e(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/content/ContentValues;Lo/dvq;)Z
    .locals 3

    .line 354
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 355
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 358
    :cond_1
    const-string v0, "taskId"

    invoke-virtual {p2}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    const-string v0, "taskName"

    invoke-virtual {p2}, Lo/dvq;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    const-string v0, "taskStatus"

    invoke-virtual {p2}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 362
    const-string v0, "taskDes"

    invoke-virtual {p2}, Lo/dvq;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    const-string v0, "taskSpecification"

    invoke-virtual {p2}, Lo/dvq;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    const-string v0, "taskDetailUrl"

    invoke-virtual {p2}, Lo/dvq;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    const-string v0, "taskStartTime"

    invoke-virtual {p2}, Lo/dvq;->m()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 366
    const-string v0, "taskEndTime"

    invoke-virtual {p2}, Lo/dvq;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 367
    const-string v0, "lastTimeStamp"

    invoke-virtual {p2}, Lo/dvq;->u()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 368
    const-string v0, "taskConditions"

    invoke-virtual {p2}, Lo/dvq;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    const-string v0, "taskFrequency"

    invoke-virtual {p2}, Lo/dvq;->k()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 371
    const-string v0, "taskRewardKaKa"

    invoke-virtual {p2}, Lo/dvq;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 372
    const-string v0, "taskRewardExperience"

    invoke-virtual {p2}, Lo/dvq;->i()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 373
    const-string v0, "taskTypes"

    invoke-virtual {p2}, Lo/dvq;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 375
    const-string v0, "eventTimeStamp"

    invoke-virtual {p2}, Lo/dvq;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 376
    const-string v0, "taskSyncTimeStamp"

    invoke-virtual {p2}, Lo/dvq;->o()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 378
    const-string v0, "taskPriority"

    invoke-virtual {p2}, Lo/dvq;->n()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 380
    const-string v0, "taskIcon"

    invoke-virtual {p2}, Lo/dvq;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    const-string v0, "taskSyncStatus"

    invoke-virtual {p2}, Lo/dvq;->r()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 384
    const-string v0, "taskIsShow"

    invoke-virtual {p2}, Lo/dvq;->q()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 386
    const/4 v0, 0x1

    return v0
.end method

.method private d(Landroid/content/ContentValues;Lo/dvq;Lo/dvq;)Z
    .locals 4

    .line 390
    invoke-virtual {p2}, Lo/dvq;->s()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 391
    invoke-virtual {p3}, Lo/dvq;->p()J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lo/dvq;->c(J)V

    .line 392
    const v0, 0x1fbda

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 393
    invoke-virtual {p2}, Lo/dvq;->k()I

    move-result v0

    if-lez v0, :cond_0

    .line 394
    invoke-direct {p0, p1, p2}, Lo/dut;->d(Landroid/content/ContentValues;Lo/dvq;)Z

    .line 395
    const/4 v0, 0x1

    return v0

    .line 398
    :cond_0
    invoke-virtual {p2}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    .line 399
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "The cloud state is smaller than the app"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    const/4 v0, 0x0

    return v0

    .line 403
    :cond_1
    invoke-virtual {p2}, Lo/dvq;->u()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dzo;->b(JJ)Z

    move-result v0

    if-nez v0, :cond_2

    .line 404
    invoke-virtual {p3}, Lo/dvq;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->b(Ljava/lang/String;)V

    .line 406
    :cond_2
    invoke-direct {p0, p1, p2}, Lo/dut;->d(Landroid/content/ContentValues;Lo/dvq;)Z

    .line 407
    const/4 v0, 0x1

    return v0
.end method

.method private static e(Landroid/database/Cursor;Ljava/lang/String;)J
    .locals 4

    .line 302
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 303
    const/4 v0, -0x1

    if-eq v0, v3, :cond_0

    .line 304
    invoke-interface {p0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0

    .line 306
    :cond_0
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getStringColumn wrong columnName = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private e(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 151
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 152
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "queryKakaInfoList, query ,param is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const/4 v0, 0x0

    return-object v0

    .line 155
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 156
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lo/dut;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, p2}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 160
    if-eqz v4, :cond_2

    .line 161
    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    new-instance v5, Lo/dvq;

    invoke-direct {v5}, Lo/dvq;-><init>()V

    .line 163
    const-string v0, "taskId"

    invoke-static {v4, v0}, Lo/dut;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dvq;->e(Ljava/lang/String;)V

    .line 164
    invoke-direct {p0, v4, v5}, Lo/dut;->e(Landroid/database/Cursor;Lo/dvq;)Lo/dvq;

    .line 165
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    goto :goto_0

    .line 167
    :cond_1
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 169
    :cond_2
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "queryAllKakaInfo kakaTaskInfoList="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    return-object v3
.end method

.method private e(Landroid/database/Cursor;Lo/dvq;)Lo/dvq;
    .locals 2

    .line 329
    const-string v0, "huid"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->setHuid(Ljava/lang/String;)V

    .line 331
    const-string v0, "taskStatus"

    invoke-static {p1, v0}, Lo/dut;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 332
    const-string v0, "taskName"

    invoke-static {p1, v0}, Lo/dut;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->b(Ljava/lang/String;)V

    .line 333
    const-string v0, "taskDes"

    invoke-static {p1, v0}, Lo/dut;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->d(Ljava/lang/String;)V

    .line 334
    const-string v0, "taskSpecification"

    invoke-static {p1, v0}, Lo/dut;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->c(Ljava/lang/String;)V

    .line 335
    const-string v0, "taskDetailUrl"

    invoke-static {p1, v0}, Lo/dut;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->a(Ljava/lang/String;)V

    .line 336
    const-string v0, "taskFrequency"

    invoke-static {p1, v0}, Lo/dut;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/dvq;->b(I)V

    .line 337
    const-string v0, "taskRewardKaKa"

    invoke-static {p1, v0}, Lo/dut;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/dvq;->e(I)V

    .line 338
    const-string v0, "taskRewardExperience"

    invoke-static {p1, v0}, Lo/dut;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/dvq;->d(I)V

    .line 339
    const-string v0, "taskTypes"

    invoke-static {p1, v0}, Lo/dut;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/dvq;->c(I)V

    .line 340
    const-string v0, "taskConditions"

    invoke-static {p1, v0}, Lo/dut;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->k(Ljava/lang/String;)V

    .line 341
    const-string v0, "eventTimeStamp"

    invoke-static {p1, v0}, Lo/dut;->e(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lo/dvq;->c(J)V

    .line 342
    const-string v0, "taskSyncTimeStamp"

    invoke-static {p1, v0}, Lo/dut;->e(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lo/dvq;->b(J)V

    .line 343
    const-string v0, "lastTimeStamp"

    invoke-static {p1, v0}, Lo/dut;->e(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lo/dvq;->a(J)V

    .line 344
    const-string v0, "taskStartTime"

    invoke-static {p1, v0}, Lo/dut;->e(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lo/dvq;->d(J)V

    .line 345
    const-string v0, "taskEndTime"

    invoke-static {p1, v0}, Lo/dut;->e(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lo/dvq;->e(J)V

    .line 346
    const-string v0, "taskPriority"

    invoke-static {p1, v0}, Lo/dut;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/dvq;->a(I)V

    .line 347
    const-string v0, "taskIcon"

    invoke-static {p1, v0}, Lo/dut;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/dvq;->g(Ljava/lang/String;)V

    .line 348
    const-string v0, "taskSyncStatus"

    invoke-static {p1, v0}, Lo/dut;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/dvq;->h(I)V

    .line 349
    const-string v0, "taskIsShow"

    invoke-static {p1, v0}, Lo/dut;->d(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/dvq;->k(I)V

    .line 350
    return-object p2
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 6

    .line 216
    const/4 v3, -0x1

    .line 217
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 218
    return v3

    .line 221
    :cond_0
    const/4 v4, 0x0

    .line 222
    instance-of v0, p1, Lo/dvq;

    if-eqz v0, :cond_1

    .line 223
    move-object v4, p1

    check-cast v4, Lo/dvq;

    .line 225
    :cond_1
    if-nez v4, :cond_2

    .line 226
    return v3

    .line 229
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "taskId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 230
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

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

    .line 231
    iget-object v0, p0, Lo/dut;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "kaka_task_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v5}, Lo/duk;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 232
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

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

    .line 233
    return v3
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 90
    const-string v0, "taskId"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "huid"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/dut;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/dvf;)I
    .locals 5

    .line 238
    const/4 v2, -0x1

    .line 239
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 240
    return v2

    .line 243
    :cond_0
    const/4 v3, 0x0

    .line 244
    instance-of v0, p1, Lo/dvq;

    if-eqz v0, :cond_1

    .line 245
    move-object v3, p1

    check-cast v3, Lo/dvq;

    .line 247
    :cond_1
    if-nez v3, :cond_2

    .line 248
    return v2

    .line 251
    :cond_2
    invoke-virtual {v3}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lo/dvq;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/dut;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v4

    .line 252
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    instance-of v0, v4, Lo/dvq;

    if-eqz v0, :cond_3

    .line 253
    move-object v0, v4

    check-cast v0, Lo/dvq;

    invoke-direct {p0, v3, v0}, Lo/dut;->d(Lo/dvq;Lo/dvq;)I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    .line 255
    :cond_3
    return v2
.end method

.method public e(Lo/dvf;)J
    .locals 6

    .line 175
    const-wide/16 v2, -0x1

    .line 176
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 177
    return-wide v2

    .line 180
    :cond_0
    const/4 v4, 0x0

    .line 181
    instance-of v0, p1, Lo/dvq;

    if-eqz v0, :cond_1

    .line 182
    move-object v4, p1

    check-cast v4, Lo/dvq;

    .line 184
    :cond_1
    if-nez v4, :cond_2

    .line 185
    return-wide v2

    .line 189
    :cond_2
    invoke-virtual {v4}, Lo/dvq;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvq;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/dut;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v5

    .line 190
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 191
    const-string v0, "PLGACHIEVE_KakaTaskRecordDBMgr"

    const-string v1, "mData is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 194
    move-object v0, v5

    check-cast v0, Lo/dvq;

    invoke-direct {p0, v4, v0}, Lo/dut;->d(Lo/dvq;Lo/dvq;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 196
    :cond_4
    invoke-direct {p0, v4}, Lo/dut;->b(Lo/dvq;)J

    move-result-wide v0

    add-long/2addr v2, v0

    .line 197
    return-wide v2
.end method

.method public e(Ljava/util/Map;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 81
    const-string v0, "taskStatus"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 82
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "taskStatus"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/dut;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 84
    :cond_0
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/dut;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

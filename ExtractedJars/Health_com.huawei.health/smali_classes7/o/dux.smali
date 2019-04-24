.class public Lo/dux;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lo/dux;->c:Landroid/content/Context;

    .line 49
    return-void
.end method

.method private b(Lo/dvs;)J
    .locals 6

    .line 183
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 184
    invoke-direct {p0, v3, p1}, Lo/dux;->b(Landroid/content/ContentValues;Lo/dvs;)V

    .line 185
    iget-object v0, p0, Lo/dux;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_event_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 186
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

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

    .line 187
    return-wide v4
.end method

.method private b(Landroid/content/ContentValues;Lo/dvs;)V
    .locals 3

    .line 246
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 247
    return-void

    .line 249
    :cond_0
    const-string v0, "huid"

    invoke-virtual {p2}, Lo/dvs;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    const-string v0, "eventType"

    invoke-virtual {p2}, Lo/dvs;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 251
    const-string v0, "medalID"

    invoke-virtual {p2}, Lo/dvs;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    const-string v0, "medalName"

    invoke-virtual {p2}, Lo/dvs;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const-string v0, "timeZone"

    invoke-virtual {p2}, Lo/dvs;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string v0, "key"

    invoke-virtual {p2}, Lo/dvs;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    const-string v0, "keyType"

    invoke-virtual {p2}, Lo/dvs;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const-string v0, "value"

    invoke-virtual {p2}, Lo/dvs;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    const-string v0, "startTime"

    invoke-virtual {p2}, Lo/dvs;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    const-string v0, "endTime"

    invoke-virtual {p2}, Lo/dvs;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const-string v0, "eventStatus"

    invoke-virtual {p2}, Lo/dvs;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string v0, "timestamp"

    invoke-virtual {p2}, Lo/dvs;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 262
    return-void
.end method

.method private c(Lo/dvs;)I
    .locals 6

    .line 235
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 236
    invoke-direct {p0, v3, p1}, Lo/dux;->b(Landroid/content/ContentValues;Lo/dvs;)V

    .line 238
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "medalID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dvs;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "huid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dvs;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 239
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

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

    .line 240
    iget-object v0, p0, Lo/dux;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_event_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v5

    .line 241
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

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

    .line 242
    return v5
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;
    .locals 16

    .line 62
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 63
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

    const-string v1, "MedalEventDBMgr, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x0

    return-object v0

    .line 67
    :cond_0
    const/4 v4, 0x0

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dux;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "medal_event_record"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "medalID"

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

    move-result-object v5

    .line 70
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dux;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 72
    invoke-static/range {p1 .. p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 71
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v5, v1}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 74
    if-eqz v6, :cond_3

    .line 75
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 76
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 77
    new-instance v4, Lo/dvs;

    invoke-direct {v4}, Lo/dvs;-><init>()V

    .line 79
    :cond_1
    const-string v0, "huid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dvs;->setHuid(Ljava/lang/String;)V

    .line 80
    const-string v0, "eventType"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    .line 81
    const-string v0, "medalID"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 82
    const-string v0, "medalName"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 83
    const-string v0, "timeZone"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 84
    const-string v0, "key"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 85
    const-string v0, "keyType"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 86
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 87
    const-string v0, "timestamp"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    .line 89
    invoke-virtual {v4, v7}, Lo/dvs;->a(I)V

    .line 90
    invoke-virtual {v4, v8}, Lo/dvs;->d(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v4, v14, v15}, Lo/dvs;->a(J)V

    .line 92
    invoke-virtual {v4, v11}, Lo/dvs;->a(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v4, v12}, Lo/dvs;->e(Ljava/lang/String;)V

    .line 94
    invoke-virtual {v4, v10}, Lo/dvs;->c(Ljava/lang/String;)V

    .line 95
    invoke-virtual {v4, v13}, Lo/dvs;->b(Ljava/lang/String;)V

    .line 96
    invoke-virtual {v4, v14, v15}, Lo/dvs;->a(J)V

    .line 97
    invoke-virtual {v4, v9}, Lo/dvs;->g(Ljava/lang/String;)V

    .line 98
    goto/16 :goto_0

    .line 99
    :cond_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 101
    :cond_3
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query MedalEventDBMgr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_4

    const-string v2, "null"

    goto :goto_1

    :cond_4
    move-object v2, v4

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-object v4
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 107
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 108
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

    const-string v1, "MedalEventDBMgr, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const/4 v0, 0x0

    return-object v0

    .line 112
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 113
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dux;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "medal_event_record"

    invoke-virtual {v1, v2}, Lo/duk;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "eventStatus"

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

    move-result-object v5

    .line 115
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query selection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dux;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 117
    invoke-static/range {p2 .. p2}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 116
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v5, v1}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 119
    if-eqz v6, :cond_2

    .line 120
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    new-instance v7, Lo/dvs;

    invoke-direct {v7}, Lo/dvs;-><init>()V

    .line 123
    const-string v0, "huid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvs;->setHuid(Ljava/lang/String;)V

    .line 124
    const-string v0, "eventType"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 125
    const-string v0, "medalID"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 126
    const-string v0, "medalName"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 127
    const-string v0, "timeZone"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 128
    const-string v0, "key"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 129
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 130
    const-string v0, "keyType"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 131
    const-string v0, "timestamp"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v15

    .line 133
    invoke-virtual {v7, v8}, Lo/dvs;->a(I)V

    .line 134
    invoke-virtual {v7, v9}, Lo/dvs;->d(Ljava/lang/String;)V

    .line 135
    move-wide v0, v15

    invoke-virtual {v7, v0, v1}, Lo/dvs;->a(J)V

    .line 136
    invoke-virtual {v7, v12}, Lo/dvs;->a(Ljava/lang/String;)V

    .line 137
    invoke-virtual {v7, v13}, Lo/dvs;->b(Ljava/lang/String;)V

    .line 138
    invoke-virtual {v7, v14}, Lo/dvs;->e(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v7, v11}, Lo/dvs;->c(Ljava/lang/String;)V

    .line 140
    move-wide v0, v15

    invoke-virtual {v7, v0, v1}, Lo/dvs;->a(J)V

    .line 141
    invoke-virtual {v7, v10}, Lo/dvs;->g(Ljava/lang/String;)V

    .line 142
    const-string v0, "startTime"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvs;->k(Ljava/lang/String;)V

    .line 143
    const-string v0, "endTime"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvs;->i(Ljava/lang/String;)V

    .line 144
    const-string v0, "eventStatus"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvs;->h(Ljava/lang/String;)V

    .line 145
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    goto/16 :goto_0

    .line 147
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 149
    :cond_2
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query MedalEventDBMgr list="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    return-object v4
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 6

    .line 192
    const/4 v3, -0x1

    .line 193
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 194
    return v3

    .line 197
    :cond_0
    const/4 v4, 0x0

    .line 198
    instance-of v0, p1, Lo/dvs;

    if-eqz v0, :cond_1

    .line 199
    move-object v4, p1

    check-cast v4, Lo/dvs;

    .line 201
    :cond_1
    if-nez v4, :cond_2

    .line 202
    return v3

    .line 205
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "medalID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvs;->c()Ljava/lang/String;

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

    invoke-virtual {v4}, Lo/dvs;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 206
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

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

    .line 207
    iget-object v0, p0, Lo/dux;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_event_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v5}, Lo/duk;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 208
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

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

    .line 209
    return v3
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 53
    const-string v0, "medalID"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "huid"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/dux;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/dvf;)I
    .locals 3

    .line 214
    const/4 v1, -0x1

    .line 215
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 216
    return v1

    .line 219
    :cond_0
    const/4 v2, 0x0

    .line 220
    instance-of v0, p1, Lo/dvs;

    if-eqz v0, :cond_1

    .line 221
    move-object v2, p1

    check-cast v2, Lo/dvs;

    .line 223
    :cond_1
    if-nez v2, :cond_2

    .line 224
    return v1

    .line 227
    :cond_2
    invoke-direct {p0, v2}, Lo/dux;->c(Lo/dvs;)I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 230
    return v1
.end method

.method public e(Lo/dvf;)J
    .locals 7

    .line 155
    const-wide/16 v3, -0x1

    .line 156
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 157
    return-wide v3

    .line 160
    :cond_0
    const/4 v5, 0x0

    .line 161
    instance-of v0, p1, Lo/dvs;

    if-eqz v0, :cond_1

    .line 162
    move-object v5, p1

    check-cast v5, Lo/dvs;

    .line 165
    :cond_1
    const-string v0, "PLGACHIEVE_MedalEventDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert MedalEventDBMgr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v5, :cond_2

    const-string v2, "null"

    goto :goto_0

    :cond_2
    invoke-virtual {v5}, Lo/dvs;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    if-nez v5, :cond_3

    .line 167
    return-wide v3

    .line 171
    :cond_3
    invoke-virtual {v5}, Lo/dvs;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lo/dvs;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/dux;->c(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v6

    .line 172
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 173
    invoke-virtual {p0, p1}, Lo/dux;->b(Lo/dvf;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 176
    :cond_4
    invoke-direct {p0, v5}, Lo/dux;->b(Lo/dvs;)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 178
    return-wide v3
.end method

.method public e(Ljava/util/Map;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 57
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "eventStatus"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/dux;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

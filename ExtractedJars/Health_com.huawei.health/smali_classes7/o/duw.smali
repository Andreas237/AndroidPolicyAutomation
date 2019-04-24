.class public Lo/duw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lo/duw;->e:Landroid/content/Context;

    .line 45
    return-void
.end method

.method private static a(II)I
    .locals 1

    .line 324
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 325
    return p0

    .line 327
    :cond_0
    return p1
.end method

.method private a(Ljava/lang/String;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 107
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 108
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

    const-string v1, "MedalLocationDBMgr, query ,id is null!return"

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

    iget-object v1, v1, Lo/duw;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "medal_location_record"

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

    move-result-object v5

    .line 115
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

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

    iget-object v0, v0, Lo/duw;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    .line 117
    invoke-static/range {p1 .. p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

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
    new-instance v7, Lo/dvy;

    invoke-direct {v7}, Lo/dvy;-><init>()V

    .line 123
    const-string v0, "huid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/dvy;->setHuid(Ljava/lang/String;)V

    .line 124
    const-string v0, "medalName"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 125
    const-string v0, "medalID"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 126
    const-string v0, "firstTabPriority"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    .line 127
    const-string v0, "firstTabDesc"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 128
    const-string v0, "secondTabPriority"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 129
    const-string v0, "secondTabDesc"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 130
    const-string v0, "medalWeight"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v14

    .line 131
    const-string v0, "medalGainedTime"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 132
    const-string v0, "gainedCount"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    .line 133
    const-string v0, "timestamp"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v17

    .line 135
    invoke-virtual {v7, v8}, Lo/dvy;->c(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v7, v9}, Lo/dvy;->b(Ljava/lang/String;)V

    .line 137
    invoke-virtual {v7, v10}, Lo/dvy;->c(I)V

    .line 138
    invoke-virtual {v7, v11}, Lo/dvy;->e(Ljava/lang/String;)V

    .line 139
    invoke-virtual {v7, v13}, Lo/dvy;->a(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v7, v12}, Lo/dvy;->b(I)V

    .line 141
    invoke-virtual {v7, v14}, Lo/dvy;->d(I)V

    .line 142
    move-wide/from16 v0, v17

    invoke-virtual {v7, v0, v1}, Lo/dvy;->a(J)V

    .line 143
    invoke-virtual {v7, v15}, Lo/dvy;->d(Ljava/lang/String;)V

    .line 144
    move/from16 v0, v16

    invoke-virtual {v7, v0}, Lo/dvy;->a(I)V

    .line 145
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalLocation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Lo/dvy;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    goto/16 :goto_0

    .line 148
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 150
    :cond_2
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query MedalLocationDBMgr="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    return-object v4
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;
    .locals 18

    .line 58
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 59
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

    const-string v1, "MedalLocationDBMgr, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const/4 v0, 0x0

    return-object v0

    .line 63
    :cond_0
    const/4 v4, 0x0

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/duw;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "medal_location_record"

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

    .line 66
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

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

    .line 67
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/duw;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 68
    invoke-static/range {p1 .. p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p2}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 67
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v5, v1}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 70
    if-eqz v6, :cond_3

    .line 71
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 72
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 73
    new-instance v4, Lo/dvy;

    invoke-direct {v4}, Lo/dvy;-><init>()V

    .line 75
    :cond_1
    const-string v0, "huid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dvy;->setHuid(Ljava/lang/String;)V

    .line 76
    const-string v0, "medalName"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 77
    const-string v0, "medalID"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 78
    const-string v0, "firstTabPriority"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    .line 79
    const-string v0, "firstTabDesc"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 80
    const-string v0, "secondTabPriority"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v11

    .line 81
    const-string v0, "medalWeight"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 82
    const-string v0, "secondTabDesc"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 83
    const-string v0, "medalGainedTime"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 84
    const-string v0, "timestamp"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v15

    .line 85
    const-string v0, "gainedCount"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v17

    .line 88
    invoke-virtual {v4, v7}, Lo/dvy;->c(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v4, v8}, Lo/dvy;->b(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v4, v9}, Lo/dvy;->c(I)V

    .line 91
    invoke-virtual {v4, v10}, Lo/dvy;->e(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v4, v13}, Lo/dvy;->a(Ljava/lang/String;)V

    .line 93
    invoke-virtual {v4, v11}, Lo/dvy;->b(I)V

    .line 94
    invoke-virtual {v4, v12}, Lo/dvy;->d(I)V

    .line 95
    move-wide v0, v15

    invoke-virtual {v4, v0, v1}, Lo/dvy;->a(J)V

    .line 96
    invoke-virtual {v4, v14}, Lo/dvy;->d(Ljava/lang/String;)V

    .line 97
    move/from16 v0, v17

    invoke-virtual {v4, v0}, Lo/dvy;->a(I)V

    .line 98
    goto/16 :goto_0

    .line 99
    :cond_2
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 101
    :cond_3
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query MedalLocationDBMgr="

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

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 342
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 347
    invoke-static {p1}, Lo/duf;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 348
    return-object p0

    .line 350
    :cond_0
    invoke-static {p0}, Lo/duf;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 352
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 353
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v4

    .line 354
    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    .line 355
    return-object p0

    .line 359
    :cond_1
    goto :goto_0

    .line 357
    :catch_0
    move-exception v2

    .line 358
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

    const-string v1, "dealGainTimeAttr NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    :cond_2
    :goto_0
    return-object p1
.end method

.method private b(Landroid/content/ContentValues;Lo/dvy;)Z
    .locals 3

    .line 305
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-virtual {p2}, Lo/dvy;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 306
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 308
    :cond_1
    const-string v0, "huid"

    invoke-virtual {p2}, Lo/dvy;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    const-string v0, "medalName"

    invoke-virtual {p2}, Lo/dvy;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/duw;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    const-string v0, "medalID"

    invoke-virtual {p2}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const-string v0, "firstTabPriority"

    invoke-virtual {p2}, Lo/dvy;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 312
    const-string v0, "firstTabDesc"

    invoke-virtual {p2}, Lo/dvy;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/duw;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    const-string v0, "secondTabPriority"

    invoke-virtual {p2}, Lo/dvy;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 314
    const-string v0, "secondTabDesc"

    invoke-virtual {p2}, Lo/dvy;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/duw;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    const-string v0, "medalWeight"

    invoke-virtual {p2}, Lo/dvy;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 316
    const-string v0, "medalGainedTime"

    invoke-virtual {p2}, Lo/dvy;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/duw;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    const-string v0, "gainedCount"

    invoke-virtual {p2}, Lo/dvy;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 318
    const-string v0, "timestamp"

    invoke-virtual {p2}, Lo/dvy;->k()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 319
    const/4 v0, 0x1

    return v0
.end method

.method private c(Lo/dvy;)J
    .locals 7

    .line 183
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 184
    invoke-direct {p0, v3, p1}, Lo/duw;->b(Landroid/content/ContentValues;Lo/dvy;)Z

    move-result v4

    .line 185
    if-nez v4, :cond_0

    .line 186
    const-wide/16 v0, -0x1

    return-wide v0

    .line 188
    :cond_0
    iget-object v0, p0, Lo/duw;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_location_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v5

    .line 189
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

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

    .line 190
    return-wide v5
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 333
    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 334
    :cond_0
    return-object p0

    .line 336
    :cond_1
    return-object p1
.end method

.method private d(Lo/dvf;Lo/dvy;)I
    .locals 7

    .line 261
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 262
    invoke-direct {p0, v3, p2, p1}, Lo/duw;->e(Landroid/content/ContentValues;Lo/dvy;Lo/dvf;)Z

    move-result v4

    .line 263
    if-nez v4, :cond_0

    .line 264
    const/4 v0, -0x1

    return v0

    .line 266
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "medalID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lo/dvy;->b()Ljava/lang/String;

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

    invoke-virtual {p2}, Lo/dvy;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 267
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

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

    .line 268
    iget-object v0, p0, Lo/duw;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_location_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v5}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v6

    .line 269
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

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

    .line 270
    return v6
.end method

.method private e(Landroid/content/ContentValues;Lo/dvy;Lo/dvf;)Z
    .locals 5

    .line 274
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 275
    const/4 v0, 0x0

    return v0

    .line 277
    :cond_0
    const/4 v3, 0x0

    .line 278
    instance-of v0, p3, Lo/dvy;

    if-eqz v0, :cond_1

    .line 279
    move-object v3, p3

    check-cast v3, Lo/dvy;

    .line 281
    :cond_1
    if-nez v3, :cond_2

    .line 282
    const/4 v0, 0x0

    return v0

    .line 284
    :cond_2
    invoke-virtual {p2}, Lo/dvy;->e()Ljava/lang/String;

    move-result-object v4

    .line 285
    const-string v0, "huid"

    invoke-virtual {v3}, Lo/dvy;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const-string v0, "medalName"

    invoke-virtual {v3}, Lo/dvy;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/duw;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "medalID"

    invoke-virtual {v3}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "firstTabPriority"

    invoke-virtual {v3}, Lo/dvy;->d()I

    move-result v1

    invoke-virtual {p2}, Lo/dvy;->d()I

    move-result v2

    invoke-static {v1, v2}, Lo/duw;->a(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 289
    const-string v0, "firstTabDesc"

    invoke-virtual {v3}, Lo/dvy;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lo/duw;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string v0, "secondTabPriority"

    invoke-virtual {v3}, Lo/dvy;->c()I

    move-result v1

    invoke-virtual {p2}, Lo/dvy;->c()I

    move-result v2

    invoke-static {v1, v2}, Lo/duw;->a(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 291
    const-string v0, "secondTabDesc"

    invoke-virtual {v3}, Lo/dvy;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvy;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duw;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const-string v0, "medalWeight"

    invoke-virtual {v3}, Lo/dvy;->f()I

    move-result v1

    invoke-virtual {p2}, Lo/dvy;->f()I

    move-result v2

    invoke-static {v1, v2}, Lo/duw;->a(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 293
    const-string v0, "medalGainedTime"

    invoke-virtual {v3}, Lo/dvy;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lo/dvy;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lo/duw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const-string v0, "gainedCount"

    invoke-virtual {v3}, Lo/dvy;->g()I

    move-result v1

    invoke-virtual {p2}, Lo/dvy;->g()I

    move-result v2

    invoke-static {v1, v2}, Lo/duw;->a(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 295
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 296
    const-string v0, "timestamp"

    invoke-virtual {p2}, Lo/dvy;->k()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    .line 298
    :cond_3
    const-string v0, "timestamp"

    invoke-virtual {v3}, Lo/dvy;->k()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 300
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 6

    .line 195
    const/4 v3, -0x1

    .line 196
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 197
    return v3

    .line 200
    :cond_0
    const/4 v4, 0x0

    .line 201
    instance-of v0, p1, Lo/dvy;

    if-eqz v0, :cond_1

    .line 202
    move-object v4, p1

    check-cast v4, Lo/dvy;

    .line 204
    :cond_1
    if-nez v4, :cond_2

    .line 205
    return v3

    .line 208
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "medalID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvy;->b()Ljava/lang/String;

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

    invoke-virtual {v4}, Lo/dvy;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 209
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

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

    .line 210
    iget-object v0, p0, Lo/duw;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "medal_location_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v5}, Lo/duk;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 211
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

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

    .line 212
    return v3
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 49
    const-string v0, "medalID"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "huid"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/duw;->a(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/dvf;)I
    .locals 6

    .line 217
    const/4 v3, -0x1

    .line 218
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 219
    return v3

    .line 222
    :cond_0
    const/4 v4, 0x0

    .line 223
    instance-of v0, p1, Lo/dvy;

    if-eqz v0, :cond_1

    .line 224
    move-object v4, p1

    check-cast v4, Lo/dvy;

    .line 227
    :cond_1
    if-nez v4, :cond_2

    .line 228
    return v3

    .line 230
    :cond_2
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalLocation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lo/dvy;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    invoke-virtual {v4}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lo/dvy;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/duw;->a(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v5

    .line 233
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 234
    invoke-virtual {p0, v5, p1}, Lo/duw;->d(Lo/dvf;Lo/dvf;)I

    move-result v0

    return v0

    .line 236
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method public d(Lo/dvf;Lo/dvf;)I
    .locals 3

    .line 240
    const/4 v1, -0x1

    .line 241
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 242
    return v1

    .line 245
    :cond_0
    const/4 v2, 0x0

    .line 246
    instance-of v0, p2, Lo/dvy;

    if-eqz v0, :cond_1

    .line 247
    move-object v2, p2

    check-cast v2, Lo/dvy;

    .line 249
    :cond_1
    if-nez v2, :cond_2

    .line 250
    return v1

    .line 253
    :cond_2
    invoke-direct {p0, p1, v2}, Lo/duw;->d(Lo/dvf;Lo/dvy;)I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 256
    return v1
.end method

.method public e(Lo/dvf;)J
    .locals 7

    .line 156
    const-wide/16 v3, -0x1

    .line 157
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 158
    return-wide v3

    .line 161
    :cond_0
    const/4 v5, 0x0

    .line 162
    instance-of v0, p1, Lo/dvy;

    if-eqz v0, :cond_1

    .line 163
    move-object v5, p1

    check-cast v5, Lo/dvy;

    .line 165
    :cond_1
    const-string v0, "PLGACHIEVE_MedalLocationDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalLocation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    if-eq v2, v5, :cond_2

    invoke-virtual {v5}, Lo/dvy;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v2, "null"

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
    invoke-virtual {v5}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lo/dvy;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/duw;->a(Ljava/lang/String;Ljava/lang/String;)Lo/dvf;

    move-result-object v6

    .line 172
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 173
    invoke-virtual {p0, v6, p1}, Lo/duw;->d(Lo/dvf;Lo/dvf;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 176
    :cond_4
    invoke-direct {p0, v5}, Lo/duw;->c(Lo/dvy;)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 178
    return-wide v3
.end method

.method public e(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 53
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/duw;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

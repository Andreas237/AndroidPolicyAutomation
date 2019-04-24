.class public Lo/dva;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lo/dva;->a:Landroid/content/Context;

    .line 50
    return-void
.end method

.method private b(Lo/dwj;ID)J
    .locals 6

    .line 158
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 159
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "startDate"

    invoke-virtual {p1}, Lo/dwj;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 161
    const-string v0, "endDate"

    invoke-virtual {p1}, Lo/dwj;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 162
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 163
    const-string v0, "value"

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 164
    const-string v0, "stepsRanking"

    invoke-virtual {p1}, Lo/dwj;->f()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 166
    iget-object v0, p0, Lo/dva;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "total_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 167
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 168
    return-wide v4
.end method

.method private b(Ljava/lang/String;)Lo/dvf;
    .locals 12

    .line 62
    const/4 v3, 0x0

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 64
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 65
    iget-object v0, p0, Lo/dva;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "total_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v4}, Lo/duk;->queryStorageData(Ljava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 69
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 70
    new-instance v3, Lo/dwj;

    invoke-direct {v3}, Lo/dwj;-><init>()V

    .line 72
    :cond_0
    const-string v0, "huid"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/dwj;->setHuid(Ljava/lang/String;)V

    .line 73
    const-string v0, "startDate"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 74
    invoke-static {v7}, Lo/duf;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwj;->c(J)V

    .line 75
    const-string v0, "endDate"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 76
    invoke-static {v8}, Lo/duf;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwj;->b(J)V

    .line 78
    const-string v0, "dataType"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    .line 79
    const-string v0, "value"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 80
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    .line 82
    :pswitch_0
    invoke-static {v9}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v10

    .line 83
    double-to-int v0, v10

    invoke-virtual {v3, v0}, Lo/dwj;->b(I)V

    .line 84
    goto :goto_1

    .line 86
    :pswitch_1
    invoke-static {v9}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwj;->b(D)V

    .line 87
    goto :goto_1

    .line 89
    :pswitch_2
    invoke-static {v9}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwj;->e(D)V

    .line 90
    goto :goto_1

    .line 92
    :pswitch_3
    invoke-static {v9}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwj;->d(D)V

    .line 93
    goto :goto_1

    .line 95
    :pswitch_4
    invoke-virtual {v3, v9}, Lo/dwj;->c(Ljava/lang/String;)V

    .line 96
    goto :goto_1

    .line 98
    :pswitch_5
    invoke-virtual {v3, v9}, Lo/dwj;->a(Ljava/lang/String;)V

    .line 99
    goto :goto_1

    .line 101
    :pswitch_6
    invoke-virtual {v3, v9}, Lo/dwj;->b(Ljava/lang/String;)V

    .line 102
    goto :goto_1

    .line 104
    :pswitch_7
    invoke-virtual {v3, v9}, Lo/dwj;->e(Ljava/lang/String;)V

    .line 105
    .line 109
    :goto_1
    const-string v0, "stepsRanking"

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 110
    invoke-static {v10}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lo/dwj;->c(D)V

    .line 111
    goto/16 :goto_0

    .line 112
    :cond_1
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 114
    :cond_2
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query totalRecord="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v3, :cond_3

    const-string v2, "null"

    goto :goto_2

    :cond_3
    move-object v2, v3

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
        :pswitch_7
    .end packed-switch
.end method

.method private c(Lo/dwj;ILjava/lang/String;)I
    .locals 6

    .line 255
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 256
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    const-string v0, "startDate"

    invoke-virtual {p1}, Lo/dwj;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 258
    const-string v0, "endDate"

    invoke-virtual {p1}, Lo/dwj;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 259
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 260
    const-string v0, "value"

    invoke-virtual {v3, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string v0, "stepsRanking"

    invoke-virtual {p1}, Lo/dwj;->f()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 262
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 263
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 264
    iget-object v0, p0, Lo/dva;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "total_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v5

    .line 265
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 266
    return v5
.end method

.method private d(Lo/dwj;ID)I
    .locals 6

    .line 240
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 241
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    const-string v0, "startDate"

    invoke-virtual {p1}, Lo/dwj;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 243
    const-string v0, "endDate"

    invoke-virtual {p1}, Lo/dwj;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 244
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 245
    const-string v0, "value"

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 246
    const-string v0, "stepsRanking"

    invoke-virtual {p1}, Lo/dwj;->f()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 247
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 248
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 249
    iget-object v0, p0, Lo/dva;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "total_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v5

    .line 250
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 251
    return v5
.end method

.method private d(Lo/dwj;ILjava/lang/String;)J
    .locals 6

    .line 172
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 173
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const-string v0, "startDate"

    invoke-virtual {p1}, Lo/dwj;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 175
    const-string v0, "endDate"

    invoke-virtual {p1}, Lo/dwj;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 176
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 177
    const-string v0, "value"

    invoke-virtual {v3, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const-string v0, "stepsRanking"

    invoke-virtual {p1}, Lo/dwj;->f()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 180
    iget-object v0, p0, Lo/dva;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "total_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 181
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 182
    return-wide v4
.end method

.method private e(Lo/dwj;)I
    .locals 4

    .line 276
    invoke-virtual {p1}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    const/4 v0, -0x1

    return v0

    .line 279
    :cond_0
    invoke-virtual {p1}, Lo/dwj;->acquireDataType()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 280
    const/4 v0, -0x1

    return v0

    .line 282
    :cond_1
    invoke-virtual {p1}, Lo/dwj;->a()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 283
    const/4 v0, -0x1

    return v0

    .line 285
    :cond_2
    invoke-virtual {p1}, Lo/dwj;->b()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 286
    const/4 v0, -0x1

    return v0

    .line 288
    :cond_3
    invoke-virtual {p1}, Lo/dwj;->d()D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_4

    .line 289
    const/4 v0, -0x1

    return v0

    .line 291
    :cond_4
    invoke-virtual {p1}, Lo/dwj;->e()D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_5

    .line 292
    const/4 v0, -0x1

    return v0

    .line 294
    :cond_5
    invoke-virtual {p1}, Lo/dwj;->c()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_6

    .line 295
    const/4 v0, -0x1

    return v0

    .line 297
    :cond_6
    invoke-virtual {p1}, Lo/dwj;->g()D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_7

    .line 298
    const/4 v0, -0x1

    return v0

    .line 300
    :cond_7
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 6

    .line 187
    const/4 v3, -0x1

    .line 188
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 189
    return v3

    .line 192
    :cond_0
    const/4 v4, 0x0

    .line 193
    instance-of v0, p1, Lo/dwj;

    if-eqz v0, :cond_1

    .line 194
    move-object v4, p1

    check-cast v4, Lo/dwj;

    .line 196
    :cond_1
    if-nez v4, :cond_2

    .line 197
    return v3

    .line 200
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid = \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 201
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 202
    iget-object v0, p0, Lo/dva;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "total_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v5}, Lo/duk;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 203
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

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

    .line 204
    return v3
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 58
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/dva;->b(Ljava/lang/String;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/dvf;)I
    .locals 5

    .line 209
    const/4 v3, -0x1

    .line 210
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 211
    return v3

    .line 214
    :cond_0
    const/4 v4, 0x0

    .line 215
    instance-of v0, p1, Lo/dwj;

    if-eqz v0, :cond_1

    .line 216
    move-object v4, p1

    check-cast v4, Lo/dwj;

    .line 218
    :cond_1
    if-nez v4, :cond_2

    .line 219
    return v3

    .line 222
    :cond_2
    invoke-direct {p0, v4}, Lo/dva;->e(Lo/dwj;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 223
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

    const-string v1, "update Column check not pass"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    const/4 v0, -0x1

    return v0

    .line 227
    :cond_3
    invoke-virtual {v4}, Lo/dwj;->c()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    invoke-direct {p0, v4, v2, v0, v1}, Lo/dva;->d(Lo/dwj;ID)I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    .line 228
    invoke-virtual {v4}, Lo/dwj;->d()D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-direct {p0, v4, v2, v0, v1}, Lo/dva;->d(Lo/dwj;ID)I

    move-result v0

    add-int/2addr v3, v0

    .line 229
    invoke-virtual {v4}, Lo/dwj;->e()D

    move-result-wide v0

    const/4 v2, 0x3

    invoke-direct {p0, v4, v2, v0, v1}, Lo/dva;->d(Lo/dwj;ID)I

    move-result v0

    add-int/2addr v3, v0

    .line 230
    invoke-virtual {v4}, Lo/dwj;->g()D

    move-result-wide v0

    const/4 v2, 0x4

    invoke-direct {p0, v4, v2, v0, v1}, Lo/dva;->d(Lo/dwj;ID)I

    move-result v0

    add-int/2addr v3, v0

    .line 232
    invoke-virtual {v4}, Lo/dwj;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {p0, v4, v1, v0}, Lo/dva;->c(Lo/dwj;ILjava/lang/String;)I

    move-result v0

    add-int/2addr v3, v0

    .line 233
    invoke-virtual {v4}, Lo/dwj;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-direct {p0, v4, v1, v0}, Lo/dva;->c(Lo/dwj;ILjava/lang/String;)I

    move-result v0

    add-int/2addr v3, v0

    .line 234
    invoke-virtual {v4}, Lo/dwj;->n()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    invoke-direct {p0, v4, v1, v0}, Lo/dva;->c(Lo/dwj;ILjava/lang/String;)I

    move-result v0

    add-int/2addr v3, v0

    .line 235
    invoke-virtual {v4}, Lo/dwj;->k()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    invoke-direct {p0, v4, v1, v0}, Lo/dva;->c(Lo/dwj;ILjava/lang/String;)I

    move-result v0

    add-int/2addr v3, v0

    .line 236
    return v3
.end method

.method public e(Lo/dvf;)J
    .locals 7

    .line 120
    const-wide/16 v3, -0x1

    .line 121
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 122
    return-wide v3

    .line 125
    :cond_0
    const/4 v5, 0x0

    .line 126
    instance-of v0, p1, Lo/dwj;

    if-eqz v0, :cond_1

    .line 127
    move-object v5, p1

    check-cast v5, Lo/dwj;

    .line 129
    :cond_1
    if-nez v5, :cond_2

    .line 130
    return-wide v3

    .line 134
    :cond_2
    invoke-virtual {v5}, Lo/dwj;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dva;->b(Ljava/lang/String;)Lo/dvf;

    move-result-object v6

    .line 135
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    .line 136
    invoke-virtual {p0, p1}, Lo/dva;->b(Lo/dvf;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 140
    :cond_3
    invoke-direct {p0, v5}, Lo/dva;->e(Lo/dwj;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 141
    const-string v0, "PLGACHIEVE_TotalRecordDBMgr"

    const-string v1, "insert Column check not pass"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-wide/16 v0, -0x1

    return-wide v0

    .line 145
    :cond_4
    invoke-virtual {v5}, Lo/dwj;->c()I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    invoke-direct {p0, v5, v2, v0, v1}, Lo/dva;->b(Lo/dwj;ID)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 146
    invoke-virtual {v5}, Lo/dwj;->d()D

    move-result-wide v0

    const/4 v2, 0x2

    invoke-direct {p0, v5, v2, v0, v1}, Lo/dva;->b(Lo/dwj;ID)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 147
    invoke-virtual {v5}, Lo/dwj;->e()D

    move-result-wide v0

    const/4 v2, 0x3

    invoke-direct {p0, v5, v2, v0, v1}, Lo/dva;->b(Lo/dwj;ID)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 148
    invoke-virtual {v5}, Lo/dwj;->g()D

    move-result-wide v0

    const/4 v2, 0x4

    invoke-direct {p0, v5, v2, v0, v1}, Lo/dva;->b(Lo/dwj;ID)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 150
    invoke-virtual {v5}, Lo/dwj;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {p0, v5, v1, v0}, Lo/dva;->d(Lo/dwj;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 151
    invoke-virtual {v5}, Lo/dwj;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-direct {p0, v5, v1, v0}, Lo/dva;->d(Lo/dwj;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 152
    invoke-virtual {v5}, Lo/dwj;->n()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    invoke-direct {p0, v5, v1, v0}, Lo/dva;->d(Lo/dwj;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 153
    invoke-virtual {v5}, Lo/dwj;->k()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    invoke-direct {p0, v5, v1, v0}, Lo/dva;->d(Lo/dwj;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v3, v0

    .line 154
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
    const/4 v0, 0x0

    return-object v0
.end method

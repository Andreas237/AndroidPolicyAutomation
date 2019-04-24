.class public Lo/dvd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dup;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lo/dvd;->c:Landroid/content/Context;

    .line 59
    return-void
.end method

.method private b(Lo/dwm;IDJ)I
    .locals 6

    .line 277
    invoke-direct {p0, p1, p5, p6}, Lo/dvd;->c(Lo/dwm;J)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 278
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

    const-string v1, "update Column check not pass"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const/4 v0, -0x1

    return v0

    .line 282
    :cond_0
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 283
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dwm;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 285
    const-string v0, "value"

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 286
    const-string v0, "date"

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 287
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwm;->getHuid()Ljava/lang/String;

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

    .line 288
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 289
    iget-object v0, p0, Lo/dvd;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "single_day_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v5

    .line 290
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 291
    return v5
.end method

.method private b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 383
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 384
    const/4 v0, 0x0

    return v0

    .line 386
    :cond_0
    const/4 v1, -0x1

    .line 387
    invoke-virtual {p1}, Lo/dwm;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 388
    invoke-direct {p0, p1, p2, p4}, Lo/dvd;->c(Lo/dwm;ILjava/lang/String;)I

    move-result v1

    goto :goto_0

    .line 390
    :cond_1
    invoke-static {p3, p4, p5}, Lo/duf;->a(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lo/dvd;->c(Lo/dwm;ILjava/lang/String;)I

    move-result v1

    .line 392
    :goto_0
    return v1
.end method

.method private b(Lo/dwm;ILjava/lang/String;)J
    .locals 6

    .line 203
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 204
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dwm;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 206
    const-string v0, "value"

    invoke-virtual {v3, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-string v0, "date"

    const-string v1, ""

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    iget-object v0, p0, Lo/dvd;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "single_day_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 209
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 210
    return-wide v4
.end method

.method private b(Ljava/lang/String;)Lo/dvf;
    .locals 13

    .line 72
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 73
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

    const-string v1, "SingleDayRecordDBMgr, query ,id is null!return"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    const/4 v0, 0x0

    return-object v0

    .line 77
    :cond_0
    const/4 v4, 0x0

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select *  from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dvd;->c:Landroid/content/Context;

    invoke-static {v1}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v1

    const-string v2, "single_day_record"

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

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 80
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 81
    iget-object v0, p0, Lo/dvd;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    .line 82
    invoke-static {p1}, Lo/duf;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 81
    const/4 v2, 0x1

    invoke-virtual {v0, v2, v5, v1}, Lo/duk;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 85
    if-eqz v6, :cond_4

    .line 86
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 88
    new-instance v4, Lo/dwm;

    invoke-direct {v4}, Lo/dwm;-><init>()V

    .line 90
    :cond_1
    const-string v0, "huid"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/dwm;->setHuid(Ljava/lang/String;)V

    .line 91
    const-string v0, "dataType"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    .line 92
    const-string v0, "value"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 93
    const-string v0, "date"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 95
    packed-switch v7, :pswitch_data_0

    goto/16 :goto_1

    .line 97
    :pswitch_0
    invoke-virtual {v4, v8}, Lo/dwm;->i(Ljava/lang/String;)V

    .line 98
    invoke-static {v8}, Lo/dzr;->c(Ljava/lang/String;)Lo/dyz;

    move-result-object v12

    .line 99
    const/4 v0, 0x0

    if-eq v0, v12, :cond_2

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 100
    invoke-virtual {v12}, Lo/dyz;->d()I

    move-result v0

    invoke-virtual {v4, v0}, Lo/dwm;->c(I)V

    .line 101
    invoke-virtual {v12}, Lo/dyz;->b()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v4, v0, v1}, Lo/dwm;->d(J)V

    goto/16 :goto_1

    .line 105
    :pswitch_1
    invoke-virtual {v4, v8}, Lo/dwm;->f(Ljava/lang/String;)V

    .line 106
    goto/16 :goto_1

    .line 108
    :pswitch_2
    invoke-virtual {v4, v8}, Lo/dwm;->o(Ljava/lang/String;)V

    .line 109
    goto/16 :goto_1

    .line 111
    :pswitch_3
    invoke-virtual {v4, v8}, Lo/dwm;->e(Ljava/lang/String;)V

    .line 112
    goto/16 :goto_1

    .line 114
    :pswitch_4
    invoke-virtual {v4, v8}, Lo/dwm;->a(Ljava/lang/String;)V

    .line 115
    goto/16 :goto_1

    .line 117
    :pswitch_5
    invoke-virtual {v4, v8}, Lo/dwm;->c(Ljava/lang/String;)V

    .line 118
    goto :goto_1

    .line 120
    :pswitch_6
    invoke-virtual {v4, v8}, Lo/dwm;->d(Ljava/lang/String;)V

    .line 121
    goto :goto_1

    .line 123
    :pswitch_7
    invoke-virtual {v4, v8}, Lo/dwm;->b(Ljava/lang/String;)V

    .line 124
    goto :goto_1

    .line 126
    :pswitch_8
    invoke-virtual {v4, v8}, Lo/dwm;->k(Ljava/lang/String;)V

    .line 127
    goto :goto_1

    .line 129
    :pswitch_9
    invoke-virtual {v4, v8}, Lo/dwm;->h(Ljava/lang/String;)V

    .line 130
    goto :goto_1

    .line 132
    :pswitch_a
    invoke-virtual {v4, v8}, Lo/dwm;->g(Ljava/lang/String;)V

    .line 133
    goto :goto_1

    .line 135
    :pswitch_b
    invoke-static {v9}, Lo/duf;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/dwm;->d(J)V

    .line 136
    invoke-static {v8}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v10

    .line 137
    double-to-int v0, v10

    invoke-virtual {v4, v0}, Lo/dwm;->c(I)V

    .line 138
    goto :goto_1

    .line 140
    :pswitch_c
    invoke-static {v9}, Lo/duf;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/dwm;->a(J)V

    .line 141
    invoke-static {v8}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v10

    .line 142
    invoke-virtual {v4, v10, v11}, Lo/dwm;->a(D)V

    .line 143
    goto :goto_1

    .line 145
    :pswitch_d
    invoke-static {v9}, Lo/duf;->b(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/dwm;->e(J)V

    .line 146
    invoke-static {v8}, Lo/duf;->d(Ljava/lang/String;)D

    move-result-wide v10

    .line 147
    double-to-int v0, v10

    invoke-virtual {v4, v0}, Lo/dwm;->e(I)V

    .line 148
    .line 152
    :cond_2
    :goto_1
    goto/16 :goto_0

    .line 153
    :cond_3
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 155
    :cond_4
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query singleRecord="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-nez v4, :cond_5

    const-string v2, "null"

    goto :goto_2

    :cond_5
    move-object v2, v4

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    return-object v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
    .end packed-switch
.end method

.method private c(Lo/dvf;Lo/dvf;)I
    .locals 10

    .line 295
    const/4 v7, -0x1

    .line 296
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 297
    return v7

    .line 300
    :cond_0
    const/4 v8, 0x0

    .line 301
    instance-of v0, p1, Lo/dwm;

    if-eqz v0, :cond_1

    .line 302
    move-object v8, p1

    check-cast v8, Lo/dwm;

    .line 304
    :cond_1
    if-nez v8, :cond_2

    .line 305
    return v7

    .line 308
    :cond_2
    const/4 v9, 0x0

    .line 309
    instance-of v0, p1, Lo/dwm;

    if-eqz v0, :cond_3

    .line 310
    move-object v9, p2

    check-cast v9, Lo/dwm;

    .line 312
    :cond_3
    if-nez v9, :cond_4

    .line 313
    return v7

    .line 316
    :cond_4
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v8}, Lo/dwm;->e()I

    move-result v2

    int-to-double v3, v2

    invoke-virtual {v8}, Lo/dwm;->d()J

    move-result-wide v5

    const/16 v2, 0xc

    invoke-direct/range {v0 .. v6}, Lo/dvd;->b(Lo/dwm;IDJ)I

    move-result v0

    add-int/lit8 v7, v0, -0x1

    .line 317
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v8}, Lo/dwm;->b()D

    move-result-wide v3

    invoke-virtual {v8}, Lo/dwm;->c()J

    move-result-wide v5

    const/16 v2, 0xd

    invoke-direct/range {v0 .. v6}, Lo/dvd;->b(Lo/dwm;IDJ)I

    move-result v0

    add-int/2addr v7, v0

    .line 318
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v8}, Lo/dwm;->a()I

    move-result v2

    int-to-double v3, v2

    invoke-virtual {v8}, Lo/dwm;->k()J

    move-result-wide v5

    const/16 v2, 0xe

    invoke-direct/range {v0 .. v6}, Lo/dvd;->b(Lo/dwm;IDJ)I

    move-result v0

    add-int/2addr v7, v0

    .line 320
    invoke-virtual {v8}, Lo/dwm;->m()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v8, v1, v0}, Lo/dvd;->c(Lo/dwm;ILjava/lang/String;)I

    move-result v0

    add-int/2addr v7, v0

    .line 321
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->u()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->u()Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x2

    const/4 v5, 0x3

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 322
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->t()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->t()Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x3

    const/4 v5, 0x4

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 325
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->g()Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x4

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 326
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->f()Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x5

    const/16 v5, 0xa

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 327
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->i()Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x6

    const/16 v5, 0xb

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 329
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->h()Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x7

    const/4 v5, 0x5

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 330
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->p()Ljava/lang/String;

    move-result-object v4

    const/16 v2, 0x8

    const/4 v5, 0x6

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 331
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->n()Ljava/lang/String;

    move-result-object v4

    const/16 v2, 0x9

    const/4 v5, 0x7

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 332
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->l()Ljava/lang/String;

    move-result-object v4

    const/16 v2, 0xa

    const/16 v5, 0x8

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 333
    move-object v0, p0

    move-object v1, v8

    invoke-virtual {v9}, Lo/dwm;->o()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lo/dwm;->o()Ljava/lang/String;

    move-result-object v4

    const/16 v2, 0xb

    const/16 v5, 0x9

    invoke-direct/range {v0 .. v5}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;Ljava/lang/String;I)I

    move-result v0

    add-int/2addr v7, v0

    .line 334
    return v7
.end method

.method private c(Lo/dwm;ILjava/lang/String;)I
    .locals 6

    .line 340
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 341
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dwm;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 343
    const-string v0, "value"

    invoke-virtual {v3, v0, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    const-string v0, "date"

    const-string v1, ""

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lo/dwm;->getHuid()Ljava/lang/String;

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

    .line 346
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 347
    iget-object v0, p0, Lo/dvd;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "single_day_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/duk;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;)I

    move-result v5

    .line 348
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 349
    return v5
.end method

.method private c(Lo/dwm;J)I
    .locals 4

    .line 361
    invoke-virtual {p1}, Lo/dwm;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 362
    const/4 v0, -0x1

    return v0

    .line 364
    :cond_0
    invoke-virtual {p1}, Lo/dwm;->acquireDataType()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 365
    const/4 v0, -0x1

    return v0

    .line 367
    :cond_1
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-nez v0, :cond_2

    .line 368
    const/4 v0, -0x1

    return v0

    .line 370
    :cond_2
    invoke-virtual {p1}, Lo/dwm;->e()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 371
    const/4 v0, -0x1

    return v0

    .line 373
    :cond_3
    invoke-virtual {p1}, Lo/dwm;->b()D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_4

    .line 374
    const/4 v0, -0x1

    return v0

    .line 376
    :cond_4
    invoke-virtual {p1}, Lo/dwm;->a()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_5

    .line 377
    const/4 v0, -0x1

    return v0

    .line 379
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method private c(Lo/dwm;IDJ)J
    .locals 6

    .line 215
    invoke-direct {p0, p1, p5, p6}, Lo/dvd;->c(Lo/dwm;J)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 216
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

    const-string v1, "insert Column check not pass"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    const-wide/16 v0, -0x1

    return-wide v0

    .line 220
    :cond_0
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 221
    const-string v0, "huid"

    invoke-virtual {p1}, Lo/dwm;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    const-string v0, "dataType"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 223
    const-string v0, "value"

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 224
    const-string v0, "date"

    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 225
    iget-object v0, p0, Lo/dvd;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "single_day_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/duk;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 226
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 227
    return-wide v4
.end method


# virtual methods
.method public a(Lo/dvf;)I
    .locals 6

    .line 232
    const/4 v3, -0x1

    .line 233
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 234
    return v3

    .line 237
    :cond_0
    const/4 v4, 0x0

    .line 238
    instance-of v0, p1, Lo/dwm;

    if-eqz v0, :cond_1

    .line 239
    move-object v4, p1

    check-cast v4, Lo/dwm;

    .line 241
    :cond_1
    if-nez v4, :cond_2

    .line 242
    return v3

    .line 245
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Lo/dwm;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 246
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 247
    iget-object v0, p0, Lo/dvd;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/duk;->c(Landroid/content/Context;)Lo/duk;

    move-result-object v0

    const-string v1, "single_day_record"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v5}, Lo/duk;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 248
    const-string v0, "PLGACHIEVE_SingleDayRecordDBMgr"

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

    .line 249
    return v3
.end method

.method public a(Ljava/util/Map;)Lo/dvf;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lo/dvf;"
        }
    .end annotation

    .line 67
    const-string v0, "huid"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/dvd;->b(Ljava/lang/String;)Lo/dvf;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/dvf;)I
    .locals 4

    .line 254
    const/4 v1, -0x1

    .line 255
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 256
    return v1

    .line 259
    :cond_0
    const/4 v2, 0x0

    .line 260
    instance-of v0, p1, Lo/dwm;

    if-eqz v0, :cond_1

    .line 261
    move-object v2, p1

    check-cast v2, Lo/dwm;

    .line 263
    :cond_1
    if-nez v2, :cond_2

    .line 264
    return v1

    .line 268
    :cond_2
    invoke-virtual {v2}, Lo/dwm;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dvd;->b(Ljava/lang/String;)Lo/dvf;

    move-result-object v3

    .line 269
    const/4 v0, 0x0

    if-eq v0, v3, :cond_3

    .line 270
    invoke-direct {p0, p1, v3}, Lo/dvd;->c(Lo/dvf;Lo/dvf;)I

    move-result v0

    return v0

    .line 273
    :cond_3
    return v1
.end method

.method public e(Lo/dvf;)J
    .locals 11

    .line 161
    const-wide/16 v7, -0x1

    .line 162
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 163
    return-wide v7

    .line 166
    :cond_0
    const/4 v9, 0x0

    .line 167
    instance-of v0, p1, Lo/dwm;

    if-eqz v0, :cond_1

    .line 168
    move-object v9, p1

    check-cast v9, Lo/dwm;

    .line 170
    :cond_1
    if-nez v9, :cond_2

    .line 171
    return-wide v7

    .line 175
    :cond_2
    invoke-virtual {v9}, Lo/dwm;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dvd;->b(Ljava/lang/String;)Lo/dvf;

    move-result-object v10

    .line 176
    const/4 v0, 0x0

    if-eq v0, v10, :cond_3

    .line 177
    invoke-direct {p0, p1, v10}, Lo/dvd;->c(Lo/dvf;Lo/dvf;)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 179
    :cond_3
    move-object v0, p0

    move-object v1, v9

    invoke-virtual {v9}, Lo/dwm;->e()I

    move-result v2

    int-to-double v3, v2

    invoke-virtual {v9}, Lo/dwm;->d()J

    move-result-wide v5

    const/16 v2, 0xc

    invoke-direct/range {v0 .. v6}, Lo/dvd;->c(Lo/dwm;IDJ)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 180
    move-object v0, p0

    move-object v1, v9

    invoke-virtual {v9}, Lo/dwm;->b()D

    move-result-wide v3

    invoke-virtual {v9}, Lo/dwm;->c()J

    move-result-wide v5

    const/16 v2, 0xd

    invoke-direct/range {v0 .. v6}, Lo/dvd;->c(Lo/dwm;IDJ)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 181
    move-object v0, p0

    move-object v1, v9

    invoke-virtual {v9}, Lo/dwm;->a()I

    move-result v2

    int-to-double v3, v2

    invoke-virtual {v9}, Lo/dwm;->k()J

    move-result-wide v5

    const/16 v2, 0xe

    invoke-direct/range {v0 .. v6}, Lo/dvd;->c(Lo/dwm;IDJ)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 183
    invoke-virtual {v9}, Lo/dwm;->m()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 184
    invoke-virtual {v9}, Lo/dwm;->u()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 185
    invoke-virtual {v9}, Lo/dwm;->t()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 187
    invoke-virtual {v9}, Lo/dwm;->g()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 188
    invoke-virtual {v9}, Lo/dwm;->f()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 189
    invoke-virtual {v9}, Lo/dwm;->i()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 191
    invoke-virtual {v9}, Lo/dwm;->h()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 192
    invoke-virtual {v9}, Lo/dwm;->p()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 193
    invoke-virtual {v9}, Lo/dwm;->n()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 194
    invoke-virtual {v9}, Lo/dwm;->l()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 195
    invoke-virtual {v9}, Lo/dwm;->o()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    invoke-direct {p0, v9, v1, v0}, Lo/dvd;->b(Lo/dwm;ILjava/lang/String;)J

    move-result-wide v0

    add-long/2addr v7, v0

    .line 196
    return-wide v7
.end method

.method public e(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lo/dvf;>;"
        }
    .end annotation

    .line 62
    const/4 v0, 0x0

    return-object v0
.end method

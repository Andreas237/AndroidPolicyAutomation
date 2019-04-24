.class public Lo/ffk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(J)J
    .locals 3

    .line 236
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 237
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 238
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 239
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 240
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 241
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 242
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static a(JI)J
    .locals 5

    .line 213
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    const-wide/16 v2, 0x3e8

    mul-long p0, v0, v2

    .line 214
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 215
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 216
    const/4 v0, 0x1

    invoke-virtual {v4, v0, p2}, Ljava/util/Calendar;->add(II)V

    .line 217
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 218
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 219
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 220
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 221
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 222
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ffe;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;>;)Ljava/util/List<Lo/fff;>;"
        }
    .end annotation

    .line 362
    const/4 v4, 0x0

    .line 363
    if-eqz p0, :cond_0

    .line 364
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    .line 365
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackListLength is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 367
    :cond_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackListLength is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    :goto_0
    const/4 v5, 0x0

    .line 370
    if-eqz p1, :cond_1

    .line 371
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    .line 372
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessList is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 374
    :cond_1
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    :goto_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 378
    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 379
    :cond_2
    :goto_2
    if-eqz p0, :cond_4

    if-eqz p1, :cond_4

    if-le v4, v7, :cond_4

    if-le v5, v8, :cond_4

    .line 380
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 381
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->i()J

    move-result-wide v0

    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireExerciseStartTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 382
    new-instance v9, Lo/fff;

    .line 383
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v9, v1, v0}, Lo/fff;-><init>(ILjava/lang/Object;)V

    .line 384
    add-int v0, v7, v8

    invoke-interface {v6, v0, v9}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 385
    add-int/lit8 v8, v8, 0x1

    .line 386
    goto :goto_2

    .line 387
    :cond_3
    new-instance v9, Lo/fff;

    .line 388
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v9, v1, v0}, Lo/fff;-><init>(ILjava/lang/Object;)V

    .line 389
    add-int v0, v7, v8

    invoke-interface {v6, v0, v9}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 390
    add-int/lit8 v7, v7, 0x1

    .line 391
    goto/16 :goto_2

    .line 395
    :cond_4
    :goto_3
    if-le v4, v7, :cond_5

    .line 396
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 397
    new-instance v9, Lo/fff;

    .line 398
    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v9, v1, v0}, Lo/fff;-><init>(ILjava/lang/Object;)V

    .line 399
    add-int v0, v7, v8

    invoke-interface {v6, v0, v9}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 400
    add-int/lit8 v7, v7, 0x1

    .line 401
    goto :goto_3

    .line 404
    :cond_5
    :goto_4
    if-le v5, v8, :cond_6

    .line 405
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 406
    new-instance v9, Lo/fff;

    .line 407
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v9, v1, v0}, Lo/fff;-><init>(ILjava/lang/Object;)V

    .line 408
    add-int v0, v7, v8

    invoke-interface {v6, v0, v9}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 409
    add-int/lit8 v8, v8, 0x1

    .line 410
    goto :goto_4

    .line 412
    :cond_6
    return-object v6
.end method

.method public static b(J)J
    .locals 5

    .line 200
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    const-wide/16 v2, 0x3e8

    mul-long p0, v0, v2

    .line 201
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 202
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 203
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 204
    const/4 v0, 0x6

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 205
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 206
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 207
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 208
    const/16 v0, 0xd

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 209
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static b(JI)J
    .locals 5

    .line 107
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    const-wide/16 v2, 0x3e8

    mul-long p0, v0, v2

    .line 108
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 109
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 110
    const/4 v0, 0x2

    invoke-virtual {v4, v0, p2}, Ljava/util/Calendar;->add(II)V

    .line 111
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 112
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 113
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 114
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 115
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(J)J
    .locals 5

    .line 119
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    const-wide/16 v2, 0x3e8

    mul-long p0, v0, v2

    .line 120
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 121
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 122
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 123
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 124
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 125
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 126
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 127
    const/16 v0, 0xd

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 128
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(JI)J
    .locals 3

    .line 225
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 226
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 227
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 228
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 229
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 230
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 231
    const/4 v0, 0x5

    invoke-virtual {v2, v0, p2}, Ljava/util/Calendar;->add(II)V

    .line 232
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(J)J
    .locals 5

    .line 174
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    const-wide/16 v2, 0x3e8

    mul-long p0, v0, v2

    .line 175
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 176
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 177
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    .line 178
    const/4 v1, 0x7

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 180
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 181
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 182
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 183
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(JI)J
    .locals 3

    .line 269
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 270
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 271
    const/4 v0, 0x2

    invoke-virtual {v2, v0, p2}, Ljava/util/Calendar;->add(II)V

    .line 272
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ffd;>;Ljava/util/List<Lo/ffd;>;)Ljava/util/List<Lo/ffd;>;"
        }
    .end annotation

    .line 417
    const/16 v16, 0x0

    .line 418
    if-eqz p0, :cond_0

    .line 419
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v16

    .line 420
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tempTrackMonthDataLength is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 422
    :cond_0
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tempTrackMonthDataLength is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    :goto_0
    const/16 v17, 0x0

    .line 425
    if-eqz p1, :cond_1

    .line 426
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v17

    .line 427
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tempFitnessMonthLength is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 429
    :cond_1
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tempFitnessMonthLength is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 431
    :goto_1
    new-instance v18, Ljava/util/ArrayList;

    invoke-direct/range {v18 .. v18}, Ljava/util/ArrayList;-><init>()V

    .line 432
    const/16 v19, 0x0

    .line 434
    const/16 v20, 0x0

    const/16 v21, 0x0

    .line 435
    :goto_2
    if-eqz p0, :cond_4

    if-eqz p1, :cond_4

    move/from16 v0, v16

    move/from16 v1, v20

    if-le v0, v1, :cond_4

    move/from16 v0, v17

    move/from16 v1, v21

    if-le v0, v1, :cond_4

    .line 437
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->i:J

    move-object/from16 v2, p1

    move/from16 v3, v21

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ffd;

    iget-wide v2, v2, Lo/ffd;->i:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 439
    move-object/from16 v0, p1

    move/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v18

    move/from16 v2, v19

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 440
    add-int/lit8 v19, v19, 0x1

    .line 441
    add-int/lit8 v21, v21, 0x1

    goto :goto_2

    .line 442
    :cond_2
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->i:J

    move-object/from16 v2, p1

    move/from16 v3, v21

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/ffd;

    iget-wide v2, v2, Lo/ffd;->i:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    .line 443
    new-instance v0, Lo/ffd;

    move-object/from16 v1, p0

    move/from16 v2, v20

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/ffd;

    iget-wide v1, v1, Lo/ffd;->e:D

    .line 444
    move-object/from16 v3, p0

    move/from16 v4, v20

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/ffd;

    iget-wide v3, v3, Lo/ffd;->c:D

    move-object/from16 v5, p0

    move/from16 v6, v20

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo/ffd;

    iget-wide v5, v5, Lo/ffd;->d:D

    .line 445
    move-object/from16 v7, p1

    move/from16 v8, v21

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo/ffd;

    iget-wide v7, v7, Lo/ffd;->a:J

    .line 446
    move-object/from16 v9, p0

    move/from16 v10, v20

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lo/ffd;

    iget v9, v9, Lo/ffd;->k:I

    move-object/from16 v10, p1

    move/from16 v11, v21

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/ffd;

    iget v10, v10, Lo/ffd;->k:I

    add-int/2addr v9, v10

    .line 447
    move-object/from16 v10, p0

    move/from16 v11, v20

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lo/ffd;

    iget-wide v10, v10, Lo/ffd;->i:J

    move-object/from16 v12, p0

    move/from16 v13, v20

    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/ffd;

    iget-wide v12, v12, Lo/ffd;->b:D

    move-object/from16 v14, p1

    move/from16 v15, v21

    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lo/ffd;

    iget-wide v14, v14, Lo/ffd;->b:D

    add-double/2addr v12, v14

    invoke-direct/range {v0 .. v13}, Lo/ffd;-><init>(DDDJIJD)V

    move-object/from16 v22, v0

    .line 449
    move-object/from16 v0, v18

    move/from16 v1, v19

    move-object/from16 v2, v22

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 450
    add-int/lit8 v20, v20, 0x1

    .line 451
    add-int/lit8 v21, v21, 0x1

    .line 452
    add-int/lit8 v19, v19, 0x1

    .line 455
    goto/16 :goto_2

    .line 456
    :cond_3
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v18

    move/from16 v2, v19

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 457
    add-int/lit8 v20, v20, 0x1

    .line 458
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_2

    .line 462
    :cond_4
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "temp allMonthData is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface/range {v18 .. v18}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    if-eqz p0, :cond_5

    .line 465
    :goto_3
    move/from16 v0, v16

    move/from16 v1, v20

    if-le v0, v1, :cond_5

    .line 466
    move-object/from16 v0, p0

    move/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v18

    move/from16 v2, v19

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 467
    add-int/lit8 v20, v20, 0x1

    .line 468
    add-int/lit8 v19, v19, 0x1

    goto :goto_3

    .line 472
    :cond_5
    if-eqz p1, :cond_6

    .line 473
    :goto_4
    move/from16 v0, v17

    move/from16 v1, v21

    if-le v0, v1, :cond_6

    .line 474
    move-object/from16 v0, p1

    move/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v18

    move/from16 v2, v19

    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 475
    add-int/lit8 v21, v21, 0x1

    .line 476
    add-int/lit8 v19, v19, 0x1

    goto :goto_4

    .line 479
    :cond_6
    return-object v18
.end method

.method public static final e(I)I
    .locals 1

    .line 31
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 36
    :pswitch_0
    const/16 v0, 0xc7

    return v0

    .line 42
    :pswitch_1
    const/4 v0, 0x0

    return v0

    .line 64
    :pswitch_2
    const/4 v0, 0x4

    return v0

    .line 83
    :pswitch_3
    const/4 v0, 0x5

    return v0

    .line 89
    :pswitch_4
    const/4 v0, 0x6

    return v0

    .line 92
    :goto_0
    :pswitch_5
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_2
    .end packed-switch
.end method

.method public static e(J)J
    .locals 5

    .line 160
    const-wide/16 v0, 0x3e8

    div-long v0, p0, v0

    const-wide/16 v2, 0x3e8

    mul-long p0, v0, v2

    .line 161
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 162
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 163
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v0

    .line 164
    const/4 v1, 0x7

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 166
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 167
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 168
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 169
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static e(JI)J
    .locals 4

    .line 265
    int-to-long v0, p2

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    add-long/2addr v0, p0

    return-wide v0
.end method

.method public static f(J)Z
    .locals 5

    .line 334
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 335
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 336
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 337
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 338
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 339
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 340
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 341
    if-ne v3, v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static h(JI)I
    .locals 3

    .line 352
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 353
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 354
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 355
    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x2

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 356
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 357
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    return v0
.end method

.method public static k(J)Z
    .locals 3

    .line 345
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 346
    invoke-virtual {v1, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 347
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 348
    const/16 v0, 0xb

    if-ne v2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

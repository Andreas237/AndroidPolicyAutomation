.class public Lo/fec;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;Ljava/util/Date;II)F
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acn;>;Ljava/util/Date;II)F"
        }
    .end annotation

    .line 131
    const-wide/16 v4, 0x0

    .line 132
    const-wide/16 v6, 0x0

    .line 133
    const/4 v8, 0x0

    .line 134
    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-eq v0, v1, :cond_0

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 135
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 137
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    .line 138
    move-object/from16 v0, p1

    invoke-virtual {v9, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 139
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 140
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 141
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 142
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 143
    const/4 v0, 0x6

    move/from16 v1, p2

    if-ne v0, v1, :cond_2

    .line 144
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 145
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 147
    :cond_2
    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    .line 149
    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 150
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 151
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 152
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 153
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 154
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 156
    :pswitch_0
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 157
    goto :goto_0

    .line 159
    :pswitch_1
    const/4 v0, 0x5

    const/4 v1, -0x6

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 160
    goto :goto_0

    .line 162
    :pswitch_2
    const/4 v0, 0x5

    const/16 v1, -0x1d

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 163
    goto :goto_0

    .line 165
    :pswitch_3
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 166
    const/4 v0, 0x2

    const/16 v1, -0xb

    invoke-virtual {v9, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 167
    .line 171
    :goto_0
    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v12

    .line 174
    const/16 v16, 0x0

    :goto_1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_4

    .line 175
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v14

    .line 176
    const-wide/16 v17, 0x0

    .line 177
    const/16 v19, 0x0

    .line 178
    cmp-long v0, v14, v12

    if-lez v0, :cond_3

    cmp-long v0, v14, v10

    if-gez v0, :cond_3

    .line 179
    packed-switch p3, :pswitch_data_1

    goto :goto_2

    .line 181
    :pswitch_4
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    add-double v17, v17, v0

    .line 182
    const/16 v19, 0xfa

    .line 183
    goto :goto_2

    .line 185
    :pswitch_5
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    add-double v17, v17, v0

    .line 186
    const/16 v19, 0x32

    .line 187
    goto :goto_2

    .line 189
    :pswitch_6
    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    add-double v17, v17, v0

    .line 190
    const/16 v19, 0x96

    .line 191
    .line 195
    :goto_2
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v17

    if-eqz v0, :cond_3

    move/from16 v0, v19

    int-to-double v0, v0

    cmpl-double v0, v0, v17

    if-ltz v0, :cond_3

    .line 196
    add-double v4, v4, v17

    .line 197
    add-int/lit8 v8, v8, 0x1

    .line 174
    :cond_3
    add-int/lit8 v16, v16, 0x1

    goto/16 :goto_1

    .line 202
    :cond_4
    if-eqz v8, :cond_5

    .line 203
    int-to-double v0, v8

    div-double v6, v4, v0

    .line 204
    const-string v0, "ProcceedDataForDateUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "week,avg=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    :cond_5
    double-to-float v0, v6

    return v0

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xc8
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static a(Ljava/util/List;Ljava/util/Date;IILo/acu;)F
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acn;>;Ljava/util/Date;IILo/acu;)F"
        }
    .end annotation

    .line 284
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 285
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 286
    :cond_0
    return v4

    .line 288
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 289
    invoke-virtual {v5, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 290
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 291
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 292
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 293
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 294
    const/4 v0, 0x6

    if-ne v0, p2, :cond_2

    .line 295
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 296
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 298
    :cond_2
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    .line 300
    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 301
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 302
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 303
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 304
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 305
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 307
    :pswitch_0
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 308
    goto :goto_0

    .line 310
    :pswitch_1
    const/4 v0, 0x5

    const/4 v1, -0x6

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 311
    goto :goto_0

    .line 313
    :pswitch_2
    const/4 v0, 0x5

    const/16 v1, -0x1d

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 314
    goto :goto_0

    .line 316
    :pswitch_3
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 317
    const/4 v0, 0x2

    const/16 v1, -0xb

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 318
    .line 322
    :goto_0
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    .line 325
    const/4 v12, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_4

    .line 326
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v10

    .line 327
    cmp-long v0, v10, v8

    if-lez v0, :cond_3

    cmp-long v0, v10, v6

    if-gez v0, :cond_3

    .line 328
    packed-switch p3, :pswitch_data_1

    goto/16 :goto_2

    .line 330
    :pswitch_4
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    float-to-double v2, v4

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    .line 331
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    double-to-float v4, v0

    goto :goto_2

    .line 335
    :pswitch_5
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    float-to-double v2, v4

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 336
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    double-to-float v4, v0

    goto :goto_2

    .line 343
    :pswitch_6
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    float-to-double v2, v4

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_3

    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    .line 344
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    double-to-float v4, v0

    .line 325
    :cond_3
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 353
    :cond_4
    const/high16 v0, 0x447a0000    # 1000.0f

    cmpl-float v0, v4, v0

    if-nez v0, :cond_5

    .line 354
    const/4 v0, 0x0

    return v0

    .line 356
    :cond_5
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xc8
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static c(Ljava/util/List;Ljava/util/Date;IILo/acu;)F
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/acn;>;Ljava/util/Date;IILo/acu;)F"
        }
    .end annotation

    .line 210
    const/4 v4, 0x0

    .line 211
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 212
    :cond_0
    return v4

    .line 214
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 215
    invoke-virtual {v5, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 216
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 217
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 218
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 219
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 220
    const/4 v0, 0x6

    if-ne v0, p2, :cond_2

    .line 221
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 222
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 224
    :cond_2
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    .line 226
    const/16 v0, 0xa

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 227
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 228
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 229
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 230
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 231
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 233
    :pswitch_0
    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 234
    goto :goto_0

    .line 236
    :pswitch_1
    const/4 v0, 0x5

    const/4 v1, -0x6

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 237
    goto :goto_0

    .line 239
    :pswitch_2
    const/4 v0, 0x5

    const/16 v1, -0x1d

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 240
    goto :goto_0

    .line 242
    :pswitch_3
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 243
    const/4 v0, 0x2

    const/16 v1, -0xb

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 244
    .line 248
    :goto_0
    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    .line 251
    const/4 v12, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_4

    .line 252
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->p()J

    move-result-wide v10

    .line 253
    cmp-long v0, v10, v8

    if-lez v0, :cond_3

    cmp-long v0, v10, v6

    if-gez v0, :cond_3

    .line 254
    packed-switch p3, :pswitch_data_1

    goto/16 :goto_2

    .line 256
    :pswitch_4
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    float-to-double v2, v4

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_3

    .line 257
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->d()D

    move-result-wide v0

    double-to-float v4, v0

    goto :goto_2

    .line 261
    :pswitch_5
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    float-to-double v2, v4

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_3

    .line 262
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->b()D

    move-result-wide v0

    double-to-float v4, v0

    goto :goto_2

    .line 269
    :pswitch_6
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    float-to-double v2, v4

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_3

    .line 270
    invoke-interface {p0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/acn;

    invoke-virtual {v0}, Lo/acn;->g()D

    move-result-wide v0

    double-to-float v4, v0

    .line 251
    :cond_3
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 280
    :cond_4
    return v4

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xc8
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static c(Ljava/util/Date;)Ljava/util/Date;
    .locals 6

    .line 381
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 382
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 383
    const/4 v0, 0x2

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 384
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    .line 385
    const-string v0, "ProcceedDataForDateUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "date=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "<--->previousMonth=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    return-object v5
.end method

.method public static d(F)F
    .locals 4

    .line 419
    new-instance v3, Ljava/math/BigDecimal;

    float-to-double v0, p0

    invoke-direct {v3, v0, v1}, Ljava/math/BigDecimal;-><init>(D)V

    .line 420
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-virtual {v3, v0, v1}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->floatValue()F

    move-result v2

    .line 421
    return v2
.end method

.method public static d(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 8

    .line 399
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 400
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    .line 402
    invoke-virtual {v2, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 403
    invoke-virtual {v3, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 405
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 406
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 408
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    .line 409
    const/4 v0, 0x2

    invoke-virtual {v3, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v7, v0, 0x1

    .line 411
    if-ne v4, v5, :cond_0

    if-ne v6, v7, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Ljava/util/List;I)F
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fel;>;I)F"
        }
    .end annotation

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 45
    :cond_0
    return v4

    .line 47
    :cond_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_9

    .line 49
    :pswitch_0
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_4

    .line 53
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    .line 54
    add-int/lit8 v7, v7, 0x1

    .line 55
    const/4 v0, 0x1

    if-ne v7, v0, :cond_2

    .line 56
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->e()F

    move-result v5

    goto :goto_1

    .line 57
    :cond_2
    const/4 v0, 0x2

    if-ne v7, v0, :cond_3

    .line 58
    invoke-interface {p0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->e()F

    move-result v6

    .line 59
    goto :goto_2

    .line 52
    :cond_3
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 64
    :cond_4
    :goto_2
    const/4 v0, 0x0

    cmpl-float v0, v5, v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    cmpl-float v0, v6, v0

    if-nez v0, :cond_6

    .line 65
    :cond_5
    const/4 v4, 0x0

    goto/16 :goto_9

    .line 67
    :cond_6
    sub-float v0, v5, v6

    invoke-static {v0}, Lo/fec;->d(F)F

    move-result v4

    .line 70
    goto/16 :goto_9

    .line 72
    :pswitch_1
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v10, 0x0

    .line 75
    const/4 v11, 0x0

    :goto_3
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_9

    .line 76
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->d()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_8

    .line 77
    add-int/lit8 v10, v10, 0x1

    .line 78
    const/4 v0, 0x1

    if-ne v10, v0, :cond_7

    .line 79
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->d()F

    move-result v8

    goto :goto_4

    .line 80
    :cond_7
    const/4 v0, 0x2

    if-ne v10, v0, :cond_8

    .line 81
    invoke-interface {p0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->d()F

    move-result v9

    .line 82
    goto :goto_5

    .line 75
    :cond_8
    :goto_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 89
    :cond_9
    :goto_5
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    const/4 v0, 0x0

    cmpl-float v0, v8, v0

    if-eqz v0, :cond_a

    const/4 v0, 0x0

    cmpl-float v0, v9, v0

    if-nez v0, :cond_b

    .line 90
    :cond_a
    const/4 v4, 0x0

    goto/16 :goto_9

    .line 92
    :cond_b
    sub-float v0, v8, v9

    invoke-static {v0}, Lo/fec;->d(F)F

    move-result v4

    .line 95
    goto/16 :goto_9

    .line 97
    :pswitch_2
    const/4 v11, 0x0

    .line 98
    const/4 v12, 0x0

    .line 99
    const/4 v13, 0x0

    .line 100
    const/4 v14, 0x0

    :goto_6
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_e

    .line 101
    invoke-interface {p0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_d

    .line 102
    add-int/lit8 v13, v13, 0x1

    .line 103
    const/4 v0, 0x1

    if-ne v13, v0, :cond_c

    .line 104
    invoke-interface {p0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->c()F

    move-result v11

    goto :goto_7

    .line 105
    :cond_c
    const/4 v0, 0x2

    if-ne v13, v0, :cond_d

    .line 106
    invoke-interface {p0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fel;

    invoke-virtual {v0}, Lo/fel;->c()F

    move-result v12

    .line 107
    goto :goto_8

    .line 100
    :cond_d
    :goto_7
    add-int/lit8 v14, v14, 0x1

    goto :goto_6

    .line 114
    :cond_e
    :goto_8
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_f

    const/4 v0, 0x0

    cmpl-float v0, v11, v0

    if-eqz v0, :cond_f

    const/4 v0, 0x0

    cmpl-float v0, v12, v0

    if-nez v0, :cond_10

    .line 115
    :cond_f
    const/4 v4, 0x0

    goto :goto_9

    .line 117
    :cond_10
    sub-float v0, v11, v12

    invoke-static {v0}, Lo/fec;->d(F)F

    move-result v4

    .line 121
    .line 125
    :goto_9
    const-string v0, "ProcceedDataForDateUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataChange=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

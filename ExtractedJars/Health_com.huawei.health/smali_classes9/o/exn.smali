.class public Lo/exn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/exn$a;,
        Lo/exn$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/exn$d;)I
    .locals 3

    .line 287
    const/4 v2, 0x1

    .line 288
    sget-object v0, Lo/exn$2;->a:[I

    invoke-virtual {p0}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 292
    :pswitch_0
    const/4 v2, 0x1

    .line 293
    goto :goto_1

    .line 296
    :pswitch_1
    const/4 v2, 0x3

    .line 297
    goto :goto_1

    .line 300
    :pswitch_2
    const/4 v2, 0x3

    .line 301
    goto :goto_1

    .line 306
    :pswitch_3
    const/4 v2, 0x5

    .line 307
    goto :goto_1

    .line 314
    :pswitch_4
    const/4 v2, 0x3

    .line 315
    goto :goto_1

    .line 317
    :goto_0
    :pswitch_5
    const/4 v2, 0x1

    .line 320
    :goto_1
    return v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
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
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public static b(J)I
    .locals 10

    .line 259
    const/4 v0, 0x7

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "1"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "3"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const-string v0, "5"

    const/4 v1, 0x2

    aput-object v0, v2, v1

    const-string v0, "7"

    const/4 v1, 0x3

    aput-object v0, v2, v1

    const-string v0, "8"

    const/4 v1, 0x4

    aput-object v0, v2, v1

    const-string v0, "10"

    const/4 v1, 0x5

    aput-object v0, v2, v1

    const-string v0, "12"

    const/4 v1, 0x6

    aput-object v0, v2, v1

    .line 260
    const/4 v0, 0x4

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "4"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "6"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "9"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    const-string v0, "11"

    const/4 v1, 0x3

    aput-object v0, v3, v1

    .line 261
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 262
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 263
    const/4 v6, 0x0

    .line 264
    new-instance v7, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p0

    invoke-direct {v7, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 265
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v8

    .line 266
    invoke-virtual {v8, v7}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 268
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    const/16 v6, 0x1f

    goto :goto_0

    .line 271
    :cond_0
    const/4 v0, 0x2

    invoke-virtual {v8, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 272
    const/16 v6, 0x1e

    goto :goto_0

    .line 275
    :cond_1
    invoke-virtual {v7}, Ljava/util/Date;->getYear()I

    move-result v9

    .line 276
    rem-int/lit8 v0, v9, 0x4

    if-nez v0, :cond_2

    rem-int/lit8 v0, v9, 0x64

    if-nez v0, :cond_3

    :cond_2
    rem-int/lit16 v0, v9, 0x190

    if-nez v0, :cond_4

    .line 277
    :cond_3
    const/16 v6, 0x1d

    goto :goto_0

    .line 280
    :cond_4
    const/16 v6, 0x1c

    .line 283
    :goto_0
    return v6
.end method

.method public static b(JLo/exn$d;)I
    .locals 10

    .line 135
    const/4 v2, 0x0

    .line 136
    sget-object v0, Lo/exn$2;->a:[I

    invoke-virtual {p2}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 138
    :pswitch_0
    const/16 v2, 0x3c

    .line 139
    goto/16 :goto_1

    .line 141
    :pswitch_1
    const/16 v2, 0x1e

    .line 142
    goto/16 :goto_1

    .line 145
    :pswitch_2
    const/16 v2, 0x5a0

    .line 146
    goto/16 :goto_1

    .line 149
    :pswitch_3
    const/16 v2, 0x5a0

    .line 150
    goto/16 :goto_1

    .line 152
    :pswitch_4
    const v2, 0xab18

    .line 153
    goto/16 :goto_1

    .line 155
    :pswitch_5
    invoke-static {p0, p1}, Lo/exn;->b(J)I

    move-result v3

    .line 156
    mul-int/lit16 v2, v3, 0x5a0

    .line 157
    goto :goto_1

    .line 163
    :pswitch_6
    const/4 v2, 0x1

    .line 164
    goto :goto_1

    .line 167
    :pswitch_7
    const/16 v2, 0x5a0

    .line 168
    goto :goto_1

    .line 172
    :pswitch_8
    const/16 v2, 0x2760

    .line 173
    goto :goto_1

    .line 177
    :pswitch_9
    const v2, 0xa8c0

    .line 178
    goto :goto_1

    .line 183
    :pswitch_a
    const-wide/16 v4, 0x0

    .line 184
    new-instance v6, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p0

    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 186
    const/4 v7, 0x0

    :goto_0
    const/16 v0, 0xc

    if-ge v7, v0, :cond_0

    .line 187
    invoke-static {v6, v7}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v8

    .line 188
    invoke-static {v8}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v4

    .line 190
    invoke-static {v4, v5}, Lo/exn;->b(J)I

    move-result v9

    .line 191
    mul-int/lit16 v0, v9, 0x5a0

    add-int/2addr v2, v0

    .line 186
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 194
    :cond_0
    goto :goto_1

    .line 196
    :pswitch_b
    const/4 v2, 0x1

    .line 197
    goto :goto_1

    .line 199
    :pswitch_c
    const/16 v2, 0x5a0

    .line 200
    goto :goto_1

    .line 202
    :pswitch_d
    const/4 v2, 0x1

    .line 203
    .line 209
    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
    .end packed-switch
.end method

.method public static d(JLo/exn$d;)J
    .locals 9

    .line 324
    const-wide/16 v3, 0x0

    .line 325
    sget-object v0, Lo/exn$2;->a:[I

    invoke-virtual {p2}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 328
    :pswitch_0
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, p0

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->o(Ljava/util/Date;)J

    move-result-wide v3

    .line 329
    goto :goto_1

    .line 331
    :pswitch_1
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, p0

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->u(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    .line 332
    const/4 v0, 0x7

    invoke-static {v5, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v6

    .line 333
    const/4 v0, -0x1

    invoke-static {v6, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v6

    .line 334
    invoke-static {v6}, Lo/dbu;->o(Ljava/util/Date;)J

    move-result-wide v3

    .line 335
    goto :goto_1

    .line 337
    :pswitch_2
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, p0

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v7

    .line 338
    const/4 v0, -0x1

    invoke-static {v7, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v7

    .line 339
    invoke-static {v7}, Lo/dbu;->o(Ljava/util/Date;)J

    move-result-wide v3

    .line 340
    goto :goto_1

    .line 342
    :pswitch_3
    invoke-static {}, Lo/dbu;->c()Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->q(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v8

    .line 343
    invoke-static {v8}, Lo/dbu;->o(Ljava/util/Date;)J

    move-result-wide v3

    .line 344
    goto :goto_1

    .line 346
    :goto_0
    :pswitch_4
    const-wide/16 v3, 0x1

    .line 350
    :goto_1
    return-wide v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public static e(JLo/exn$d;)I
    .locals 3

    .line 213
    const/4 v2, 0x0

    .line 214
    sget-object v0, Lo/exn$2;->a:[I

    invoke-virtual {p2}, Lo/exn$d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 216
    :pswitch_0
    const/16 v2, 0x18

    .line 217
    goto :goto_1

    .line 219
    :pswitch_1
    const/16 v2, 0x30

    .line 220
    goto :goto_1

    .line 223
    :pswitch_2
    const/4 v2, 0x7

    .line 224
    goto :goto_1

    .line 228
    :pswitch_3
    const/16 v2, 0x1e

    .line 229
    goto :goto_1

    .line 232
    :pswitch_4
    const/16 v2, 0xc

    .line 233
    goto :goto_1

    .line 235
    :pswitch_5
    const/16 v2, 0x5a0

    .line 236
    goto :goto_1

    .line 242
    :pswitch_6
    const/16 v2, 0x5a0

    .line 243
    goto :goto_1

    .line 245
    :pswitch_7
    const/4 v2, 0x1

    .line 246
    goto :goto_1

    .line 248
    :pswitch_8
    const/16 v2, 0x5a0

    .line 249
    goto :goto_1

    .line 251
    :goto_0
    :pswitch_9
    const/4 v2, 0x1

    .line 255
    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_5
    .end packed-switch
.end method

.class public Lo/bzt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(III)I
    .locals 3

    .line 16
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 17
    add-int/lit8 v0, p1, -0x1

    invoke-virtual {v2, p0, v0, p2}, Ljava/util/Calendar;->set(III)V

    .line 18
    const/4 v0, 0x7

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public static a(Ljava/util/Date;)Ljava/util/Date;
    .locals 9

    .line 242
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 243
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 244
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 245
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 246
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 247
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 248
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 250
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    .line 251
    const-wide/16 v0, 0x3e8

    div-long v0, v5, v0

    const-wide/16 v2, 0x3e8

    mul-long v7, v0, v2

    .line 252
    invoke-virtual {v4, v7, v8}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 254
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static b(II)I
    .locals 4

    .line 23
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 24
    const/4 v0, 0x1

    invoke-virtual {v2, v0, p0}, Ljava/util/Calendar;->set(II)V

    .line 25
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x2

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 26
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 27
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->roll(II)V

    .line 28
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 29
    return v3
.end method

.method public static b(IIII)Ljava/util/Date;
    .locals 8

    .line 288
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 289
    move-object v0, v7

    move v1, p0

    add-int/lit8 v2, p1, -0x1

    move v3, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 290
    const/4 v0, 0x2

    invoke-virtual {v7, v0, p3}, Ljava/util/Calendar;->add(II)V

    .line 291
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/util/Date;)Ljava/util/Date;
    .locals 10

    .line 195
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 196
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 197
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 198
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 199
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 200
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 201
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 204
    neg-int v0, v5

    const/4 v1, 0x5

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 206
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    .line 207
    const-wide/16 v0, 0x3e8

    div-long v0, v6, v0

    const-wide/16 v2, 0x3e8

    mul-long v8, v0, v2

    .line 208
    invoke-virtual {v4, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 210
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static b(III)[I
    .locals 7

    .line 44
    invoke-static {p0, p1}, Lo/bzt;->b(II)I

    move-result v1

    .line 45
    invoke-static {p0, p1, p2}, Lo/bzt;->a(III)I

    move-result v2

    .line 47
    const/4 v0, 0x7

    new-array v3, v0, [I

    .line 49
    move v4, p2

    .line 50
    move v5, v2

    :goto_0
    if-ltz v5, :cond_1

    .line 52
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    aput v0, v3, v5

    .line 53
    const/4 v0, 0x1

    if-ge v4, v0, :cond_0

    .line 54
    add-int/lit8 v0, p1, -0x1

    invoke-static {p0, v0}, Lo/bzt;->b(II)I

    move-result v6

    .line 55
    move v4, v6

    .line 50
    :cond_0
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 59
    :cond_1
    add-int/lit8 v4, p2, 0x1

    .line 60
    add-int/lit8 v5, v2, 0x1

    :goto_1
    array-length v0, v3

    const/4 v0, 0x7

    if-ge v5, v0, :cond_3

    .line 61
    if-le v4, v1, :cond_2

    .line 62
    const/4 v4, 0x1

    .line 64
    :cond_2
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    aput v0, v3, v5

    .line 60
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 67
    :cond_3
    return-object v3
.end method

.method public static c(Ljava/util/Date;)Ljava/util/Date;
    .locals 10

    .line 220
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 221
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 222
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 224
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 225
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 226
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 228
    const/4 v0, 0x7

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 231
    rsub-int/lit8 v0, v5, 0x6

    const/4 v1, 0x5

    invoke-virtual {v4, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 233
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    .line 234
    const-wide/16 v0, 0x3e8

    div-long v0, v6, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e7

    add-long v8, v0, v2

    .line 235
    invoke-virtual {v4, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 237
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static c(II)[[I
    .locals 13

    .line 106
    invoke-static {p0, p1}, Lo/bzt;->b(II)I

    move-result v4

    .line 107
    add-int/lit8 v0, p1, -0x1

    invoke-static {p0, v0}, Lo/bzt;->b(II)I

    move-result v5

    .line 108
    invoke-static {p0, p1}, Lo/bzt;->e(II)I

    move-result v6

    .line 110
    const/16 v0, 0x2a

    new-array v7, v0, [I

    .line 111
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [[I

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 115
    const/4 v6, 0x7

    .line 118
    :cond_0
    sub-int v0, v5, v6

    add-int/lit8 v10, v0, 0x1

    .line 120
    :goto_0
    if-ge v9, v6, :cond_1

    .line 121
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    aput v0, v7, v9

    .line 120
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 124
    :cond_1
    const/4 v11, 0x1

    :goto_1
    if-gt v11, v4, :cond_2

    .line 125
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    aput v11, v7, v0

    .line 124
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 128
    :cond_2
    const/4 v11, 0x1

    :goto_2
    array-length v0, v7

    const/16 v0, 0x2a

    if-ge v9, v0, :cond_3

    .line 129
    move v0, v9

    add-int/lit8 v9, v9, 0x1

    aput v11, v7, v0

    .line 128
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 133
    :cond_3
    const/4 v11, 0x0

    :goto_3
    array-length v0, v8

    if-ge v11, v0, :cond_5

    .line 134
    const/4 v12, 0x0

    :goto_4
    const/4 v0, 0x0

    aget-object v0, v8, v0

    array-length v0, v0

    if-ge v12, v0, :cond_4

    .line 135
    aget-object v0, v8, v11

    const/4 v1, 0x0

    aget-object v1, v8, v1

    array-length v1, v1

    mul-int/2addr v1, v11

    add-int/2addr v1, v12

    aget v1, v7, v1

    aput v1, v0, v12

    .line 134
    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    .line 133
    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 139
    :cond_5
    return-object v8
.end method

.method public static c(III)[[I
    .locals 14

    .line 145
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 146
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x1

    invoke-virtual {v4, p0, v0, v1}, Ljava/util/Calendar;->set(III)V

    .line 147
    const/4 v0, 0x2

    move/from16 v1, p2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 148
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result p0

    .line 149
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 p1, v0, 0x1

    .line 151
    invoke-static {p0, p1}, Lo/bzt;->b(II)I

    move-result v5

    .line 152
    add-int/lit8 v0, p1, -0x1

    invoke-static {p0, v0}, Lo/bzt;->b(II)I

    move-result v6

    .line 153
    invoke-static {p0, p1}, Lo/bzt;->e(II)I

    move-result v7

    .line 155
    const/16 v0, 0x2a

    new-array v8, v0, [I

    .line 156
    const/4 v0, 0x6

    const/4 v1, 0x7

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [[I

    .line 158
    const/4 v10, 0x0

    .line 159
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 160
    const/4 v7, 0x7

    .line 163
    :cond_0
    sub-int v0, v6, v7

    add-int/lit8 v11, v0, 0x1

    .line 165
    :goto_0
    if-ge v10, v7, :cond_1

    .line 166
    move v0, v11

    add-int/lit8 v11, v11, 0x1

    aput v0, v8, v10

    .line 165
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 169
    :cond_1
    const/4 v12, 0x1

    :goto_1
    if-gt v12, v5, :cond_2

    .line 170
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    aput v12, v8, v0

    .line 169
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 173
    :cond_2
    const/4 v12, 0x1

    :goto_2
    array-length v0, v8

    const/16 v0, 0x2a

    if-ge v10, v0, :cond_3

    .line 174
    move v0, v10

    add-int/lit8 v10, v10, 0x1

    aput v12, v8, v0

    .line 173
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 178
    :cond_3
    const/4 v12, 0x0

    :goto_3
    array-length v0, v9

    if-ge v12, v0, :cond_5

    .line 179
    const/4 v13, 0x0

    :goto_4
    const/4 v0, 0x0

    aget-object v0, v9, v0

    array-length v0, v0

    if-ge v13, v0, :cond_4

    .line 180
    aget-object v0, v9, v12

    const/4 v1, 0x0

    aget-object v1, v9, v1

    array-length v1, v1

    mul-int/2addr v1, v12

    add-int/2addr v1, v13

    aget v1, v8, v1

    aput v1, v0, v13

    .line 179
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    .line 178
    :cond_4
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 184
    :cond_5
    return-object v9
.end method

.method public static d(IIII)[I
    .locals 9

    .line 72
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 73
    add-int/lit8 v0, p1, -0x1

    invoke-virtual {v2, p0, v0, p2}, Ljava/util/Calendar;->set(III)V

    .line 74
    mul-int/lit8 v0, p3, 0x7

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 75
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p0

    .line 76
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 p1, v0, 0x1

    .line 77
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p2

    .line 79
    invoke-static {p0, p1}, Lo/bzt;->b(II)I

    move-result v3

    .line 80
    invoke-static {p0, p1, p2}, Lo/bzt;->a(III)I

    move-result v4

    .line 82
    const/4 v0, 0x7

    new-array v5, v0, [I

    .line 84
    move v6, p2

    .line 85
    move v7, v4

    :goto_0
    if-ltz v7, :cond_1

    .line 87
    move v0, v6

    add-int/lit8 v6, v6, -0x1

    aput v0, v5, v7

    .line 88
    const/4 v0, 0x1

    if-ge v6, v0, :cond_0

    .line 89
    add-int/lit8 v0, p1, -0x1

    invoke-static {p0, v0}, Lo/bzt;->b(II)I

    move-result v8

    .line 90
    move v6, v8

    .line 85
    :cond_0
    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    .line 94
    :cond_1
    add-int/lit8 v6, p2, 0x1

    .line 95
    add-int/lit8 v7, v4, 0x1

    :goto_1
    array-length v0, v5

    const/4 v0, 0x7

    if-ge v7, v0, :cond_3

    .line 96
    if-le v6, v3, :cond_2

    .line 97
    const/4 v6, 0x1

    .line 99
    :cond_2
    move v0, v6

    add-int/lit8 v6, v6, 0x1

    aput v0, v5, v7

    .line 95
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 102
    :cond_3
    return-object v5
.end method

.method public static e(II)I
    .locals 3

    .line 9
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 10
    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x1

    invoke-virtual {v2, p0, v0, v1}, Ljava/util/Calendar;->set(III)V

    .line 11
    const/4 v0, 0x7

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public static e(J)I
    .locals 2

    .line 301
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 302
    invoke-virtual {v1, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 303
    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    return v0
.end method

.method public static e(IIII)Ljava/util/Date;
    .locals 8

    .line 281
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 282
    move-object v0, v7

    move v1, p0

    add-int/lit8 v2, p1, -0x1

    move v3, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Ljava/util/Calendar;->set(IIIIII)V

    .line 283
    mul-int/lit8 v0, p3, 0x7

    const/4 v1, 0x5

    invoke-virtual {v7, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 284
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/util/Date;)Ljava/util/Date;
    .locals 9

    .line 259
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 260
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 261
    invoke-virtual {v4, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 262
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 263
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 264
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 265
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 267
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 268
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 272
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    .line 273
    const-wide/16 v0, 0x3e8

    div-long v0, v5, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e7

    add-long v7, v0, v2

    .line 274
    invoke-virtual {v4, v7, v8}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 276
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

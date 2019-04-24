.class public Lo/cml;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Z
    .locals 1

    .line 123
    if-lez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static b(I)I
    .locals 1

    .line 191
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 193
    :pswitch_0
    const/16 v0, 0xa

    return v0

    .line 195
    :pswitch_1
    const/16 v0, 0x9

    return v0

    .line 197
    :pswitch_2
    const/16 v0, 0xc

    return v0

    .line 199
    :pswitch_3
    const/4 v0, 0x7

    return v0

    .line 201
    :goto_0
    :pswitch_4
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2711
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method private static c(I)I
    .locals 1

    .line 206
    const/16 v0, 0x5208

    if-gt p0, v0, :cond_0

    .line 207
    const/4 v0, 0x1

    return v0

    .line 209
    :cond_0
    const/16 v0, 0x5653

    if-gt p0, v0, :cond_1

    .line 210
    const/4 v0, 0x2

    return v0

    .line 212
    :cond_1
    const/16 v0, 0x56b7

    if-gt p0, v0, :cond_2

    .line 213
    const/4 v0, 0x3

    return v0

    .line 215
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private static d(I)I
    .locals 1

    .line 150
    const/16 v0, 0x3e8

    if-ge p0, v0, :cond_0

    .line 151
    const/4 v0, 0x1

    return v0

    .line 153
    :cond_0
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 155
    :pswitch_0
    const/4 v0, 0x5

    return v0

    .line 157
    :pswitch_1
    const/4 v0, 0x6

    return v0

    .line 159
    :pswitch_2
    const/16 v0, 0x8

    return v0

    .line 161
    :pswitch_3
    const/4 v0, 0x7

    return v0

    .line 163
    :pswitch_4
    const/16 v0, 0xb

    return v0

    .line 166
    :pswitch_5
    const/16 v0, 0x9

    return v0

    .line 170
    :pswitch_6
    const/16 v0, 0xc

    return v0

    .line 179
    :pswitch_7
    const/16 v0, 0xa

    return v0

    .line 184
    :pswitch_8
    const/16 v0, 0xe

    return v0

    .line 186
    :goto_0
    :pswitch_9
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x7d1
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_1
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
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method

.method public static e(I)I
    .locals 3

    .line 130
    invoke-static {p0}, Lo/cmk;->d(I)Lo/cmk$b;

    move-result-object v2

    .line 131
    sget-object v0, Lo/cml$1;->b:[I

    invoke-virtual {v2}, Lo/cmk$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 133
    :pswitch_0
    invoke-static {p0}, Lo/cml;->d(I)I

    move-result v0

    return v0

    .line 135
    :pswitch_1
    invoke-static {p0}, Lo/cml;->b(I)I

    move-result v0

    return v0

    .line 137
    :pswitch_2
    invoke-static {p0}, Lo/cml;->c(I)I

    move-result v0

    return v0

    .line 139
    :pswitch_3
    invoke-static {p0}, Lo/cml;->k(I)I

    move-result v0

    return v0

    .line 141
    :pswitch_4
    invoke-static {p0}, Lo/cml;->f(I)I

    move-result v0

    return v0

    .line 143
    :pswitch_5
    invoke-static {p0}, Lo/cml;->i(I)I

    move-result v0

    return v0

    .line 145
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static f(I)I
    .locals 1

    .line 226
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 228
    :pswitch_0
    const/16 v0, 0xd

    return v0

    .line 230
    :pswitch_1
    const/16 v0, 0xf

    return v0

    .line 232
    :pswitch_2
    const/16 v0, 0x10

    return v0

    .line 234
    :goto_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0xc351
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static i(I)I
    .locals 1

    .line 239
    const v0, 0xa028

    if-gt p0, v0, :cond_0

    .line 240
    const/4 v0, 0x1

    return v0

    .line 242
    :cond_0
    const v0, 0xab7c

    if-gt p0, v0, :cond_1

    .line 243
    const/4 v0, 0x4

    return v0

    .line 245
    :cond_1
    const v0, 0xac43

    if-gt p0, v0, :cond_2

    .line 246
    const/4 v0, 0x2

    return v0

    .line 248
    :cond_2
    const v0, 0xad0b

    if-gt p0, v0, :cond_3

    .line 249
    const/4 v0, 0x3

    return v0

    .line 251
    :cond_3
    const v0, 0xb3ba

    if-gt p0, v0, :cond_4

    .line 252
    const/4 v0, 0x5

    return v0

    .line 254
    :cond_4
    const v0, 0xb798

    if-gt p0, v0, :cond_5

    .line 255
    const/4 v0, 0x5

    return v0

    .line 258
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method private static k(I)I
    .locals 1

    .line 219
    const/16 v0, 0x7918

    if-gt p0, v0, :cond_0

    .line 220
    const/4 v0, 0x4

    return v0

    .line 222
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.class public Lo/cmm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(II)I
    .locals 1

    .line 110
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 112
    :pswitch_0
    return p0

    .line 114
    :pswitch_1
    add-int/lit8 v0, p0, 0xa

    return v0

    .line 116
    :pswitch_2
    add-int/lit8 v0, p0, 0x14

    return v0

    .line 118
    :pswitch_3
    add-int/lit8 v0, p0, 0x1e

    return v0

    .line 120
    :pswitch_4
    add-int/lit8 v0, p0, 0x28

    return v0

    .line 122
    :goto_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static e(I)I
    .locals 1

    .line 128
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 135
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 143
    :pswitch_1
    const/4 v0, 0x2

    return v0

    .line 151
    :pswitch_2
    const/4 v0, 0x3

    return v0

    .line 159
    :pswitch_3
    const/4 v0, 0x4

    return v0

    .line 167
    :pswitch_4
    const/4 v0, 0x5

    return v0

    .line 170
    :goto_0
    :pswitch_5
    const/4 v0, -0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public static e(II)I
    .locals 1

    .line 175
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 177
    :pswitch_0
    return p0

    .line 179
    :pswitch_1
    add-int/lit8 v0, p0, -0xa

    return v0

    .line 181
    :pswitch_2
    add-int/lit8 v0, p0, -0x14

    return v0

    .line 183
    :pswitch_3
    add-int/lit8 v0, p0, -0x1e

    return v0

    .line 185
    :pswitch_4
    add-int/lit8 v0, p0, -0x28

    return v0

    .line 187
    :goto_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

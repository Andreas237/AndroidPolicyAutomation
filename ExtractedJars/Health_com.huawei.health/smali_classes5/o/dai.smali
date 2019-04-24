.class public Lo/dai;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 1

    .line 185
    const-string v0, ""

    .line 186
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 188
    :sswitch_0
    const-string v0, "SUCCESS"

    .line 189
    goto :goto_0

    .line 191
    :sswitch_1
    const-string v0, "UNKNOW ERROR"

    .line 192
    goto :goto_0

    .line 194
    :sswitch_2
    const-string v0, "NOT SUPPORT THIS REQUEST"

    .line 195
    goto :goto_0

    .line 197
    :sswitch_3
    const-string v0, "NO PERMISSION"

    .line 198
    goto :goto_0

    .line 200
    :sswitch_4
    const-string v0, "SYSTEM BUSY"

    .line 201
    goto :goto_0

    .line 203
    :sswitch_5
    const-string v0, "REQUEST FORMAT ERROR"

    .line 204
    goto :goto_0

    .line 206
    :sswitch_6
    const-string v0, "REQUEST PARAMETER ERROR"

    .line 207
    goto :goto_0

    .line 209
    :sswitch_7
    const-string v0, "MEMORY ERROR"

    .line 210
    goto :goto_0

    .line 213
    :sswitch_8
    const-string v0, "RESPONSE TIMEOUT"

    .line 214
    goto :goto_0

    .line 216
    :sswitch_9
    const-string v0, "\u4f4e\u7535\u91cf "

    .line 217
    goto :goto_0

    .line 219
    :sswitch_a
    const-string v0, "\u5355\u677f\u4e0d\u652f\u6301OTA\u5347\u7ea7"

    .line 220
    .line 224
    :goto_0
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x186a0 -> :sswitch_0
        0x186a1 -> :sswitch_1
        0x186a2 -> :sswitch_2
        0x186a3 -> :sswitch_3
        0x186a4 -> :sswitch_4
        0x186a5 -> :sswitch_5
        0x186a6 -> :sswitch_6
        0x186a7 -> :sswitch_7
        0x186a8 -> :sswitch_8
        0x186a9 -> :sswitch_8
        0x19641 -> :sswitch_a
        0x19642 -> :sswitch_9
    .end sparse-switch
.end method

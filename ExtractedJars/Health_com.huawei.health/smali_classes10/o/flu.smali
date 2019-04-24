.class public final Lo/flu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/flu$e;
    }
.end annotation


# direct methods
.method public static d(I)Lo/flu$e;
    .locals 1

    .line 112
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 123
    :pswitch_0
    sget-object v0, Lo/flu$e;->a:Lo/flu$e;

    return-object v0

    .line 131
    :pswitch_1
    sget-object v0, Lo/flu$e;->c:Lo/flu$e;

    return-object v0

    .line 134
    :pswitch_2
    sget-object v0, Lo/flu$e;->b:Lo/flu$e;

    return-object v0

    .line 136
    :goto_0
    :pswitch_3
    sget-object v0, Lo/flu$e;->e:Lo/flu$e;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public static e(I)Ljava/lang/String;
    .locals 4

    .line 262
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 268
    :sswitch_0
    const-string v0, "Reserved"

    return-object v0

    .line 270
    :sswitch_1
    const-string v0, "If-Match"

    return-object v0

    .line 272
    :sswitch_2
    const-string v0, "Uri-Host"

    return-object v0

    .line 274
    :sswitch_3
    const-string v0, "ETag"

    return-object v0

    .line 276
    :sswitch_4
    const-string v0, "If-None-Match"

    return-object v0

    .line 278
    :sswitch_5
    const-string v0, "Uri-Port"

    return-object v0

    .line 280
    :sswitch_6
    const-string v0, "Location-Path"

    return-object v0

    .line 282
    :sswitch_7
    const-string v0, "Uri-Path"

    return-object v0

    .line 284
    :sswitch_8
    const-string v0, "Content-Format"

    return-object v0

    .line 286
    :sswitch_9
    const-string v0, "Max-Age"

    return-object v0

    .line 288
    :sswitch_a
    const-string v0, "Uri-Query"

    return-object v0

    .line 290
    :sswitch_b
    const-string v0, "Accept"

    return-object v0

    .line 292
    :sswitch_c
    const-string v0, "Location-Query"

    return-object v0

    .line 294
    :sswitch_d
    const-string v0, "Proxy-Uri"

    return-object v0

    .line 296
    :sswitch_e
    const-string v0, "Proxy-Scheme"

    return-object v0

    .line 298
    :sswitch_f
    const-string v0, "Observe"

    return-object v0

    .line 300
    :sswitch_10
    const-string v0, "Block2"

    return-object v0

    .line 302
    :sswitch_11
    const-string v0, "Block1"

    return-object v0

    .line 304
    :sswitch_12
    const-string v0, "Size2"

    return-object v0

    .line 306
    :sswitch_13
    const-string v0, "Size1"

    return-object v0

    .line 308
    :goto_0
    const-string v0, "Unknown (%d)"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x6 -> :sswitch_f
        0x7 -> :sswitch_5
        0x8 -> :sswitch_6
        0xb -> :sswitch_7
        0xc -> :sswitch_8
        0xe -> :sswitch_9
        0xf -> :sswitch_a
        0x11 -> :sswitch_b
        0x14 -> :sswitch_c
        0x17 -> :sswitch_10
        0x1b -> :sswitch_11
        0x1c -> :sswitch_12
        0x23 -> :sswitch_d
        0x27 -> :sswitch_e
        0x3c -> :sswitch_13
        0x80 -> :sswitch_0
        0x84 -> :sswitch_0
        0x88 -> :sswitch_0
        0x8c -> :sswitch_0
    .end sparse-switch
.end method

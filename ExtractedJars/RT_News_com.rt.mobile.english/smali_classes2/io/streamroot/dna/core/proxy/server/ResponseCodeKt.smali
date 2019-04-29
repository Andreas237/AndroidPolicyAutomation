.class public final Lio/streamroot/dna/core/proxy/server/ResponseCodeKt;
.super Ljava/lang/Object;
.source "ResponseCode.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "codeDescription",
        "",
        "code",
        "",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final codeDescription(I)Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    packed-switch p0, :pswitch_data_3

    packed-switch p0, :pswitch_data_4

    packed-switch p0, :pswitch_data_5

    packed-switch p0, :pswitch_data_6

    packed-switch p0, :pswitch_data_7

    sparse-switch p0, :sswitch_data_0

    const-string v0, ""

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "Too Many Requests"

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "Temporary Redirect"

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "No Content"

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "Switching Protocols"

    goto/16 :goto_0

    :pswitch_0
    const-string v0, "HTTP Version Not Supported"

    goto/16 :goto_0

    :pswitch_1
    const-string v0, "Gateway Timeout"

    goto/16 :goto_0

    :pswitch_2
    const-string v0, "Service Unavailable"

    goto/16 :goto_0

    :pswitch_3
    const-string v0, "Bad Gateway"

    goto/16 :goto_0

    :pswitch_4
    const-string v0, "Not Implemented"

    goto :goto_0

    :pswitch_5
    const-string v0, "Internal Server Error"

    goto :goto_0

    :pswitch_6
    const-string v0, "Expectation Failed"

    goto :goto_0

    :pswitch_7
    const-string v0, "Requested Range Not Satisfiable"

    goto :goto_0

    :pswitch_8
    const-string v0, "Unsupported Media Type"

    goto :goto_0

    :pswitch_9
    const-string v0, "Payload Too Large"

    goto :goto_0

    :pswitch_a
    const-string v0, "Precondition Failed"

    goto :goto_0

    :pswitch_b
    const-string v0, "Length Required"

    goto :goto_0

    :pswitch_c
    const-string v0, "Gone"

    goto :goto_0

    :pswitch_d
    const-string v0, "Conflict"

    goto :goto_0

    :pswitch_e
    const-string v0, "Request Timeout"

    goto :goto_0

    :pswitch_f
    const-string v0, "Not Acceptable"

    goto :goto_0

    :pswitch_10
    const-string v0, "Method Not Allowed"

    goto :goto_0

    :pswitch_11
    const-string v0, "Not Found"

    goto :goto_0

    :pswitch_12
    const-string v0, "Forbidden"

    goto :goto_0

    :pswitch_13
    const-string v0, "Unauthorized"

    goto :goto_0

    :pswitch_14
    const-string v0, "Bad Request"

    goto :goto_0

    :pswitch_15
    const-string v0, "Not Modified"

    goto :goto_0

    :pswitch_16
    const-string v0, "See Other"

    goto :goto_0

    :pswitch_17
    const-string v0, "Found"

    goto :goto_0

    :pswitch_18
    const-string v0, "Moved Permanently"

    goto :goto_0

    :pswitch_19
    const-string v0, "Multi-Status"

    goto :goto_0

    :pswitch_1a
    const-string v0, "Partial Content"

    goto :goto_0

    :pswitch_1b
    const-string v0, "Accepted"

    goto :goto_0

    :pswitch_1c
    const-string v0, "Created"

    goto :goto_0

    :pswitch_1d
    const-string v0, "OK"

    .line 41
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x20

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xce
        :pswitch_1a
        :pswitch_19
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x12d
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x190
        :pswitch_14
        :pswitch_13
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x193
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x198
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x19f
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x1f4
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_3
        0xcc -> :sswitch_2
        0x133 -> :sswitch_1
        0x1ad -> :sswitch_0
    .end sparse-switch
.end method

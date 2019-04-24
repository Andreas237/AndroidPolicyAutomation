.class public Lo/dhc;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(I)I
    .locals 2

    .line 18
    const/4 v1, 0x1

    .line 19
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 21
    :pswitch_0
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 26
    :pswitch_1
    const/4 v1, 0x2

    .line 27
    goto :goto_0

    .line 31
    :pswitch_2
    const/4 v1, 0x4

    .line 32
    goto :goto_0

    .line 36
    :pswitch_3
    const/4 v1, 0x3

    .line 37
    goto :goto_0

    .line 41
    :pswitch_4
    const/4 v1, 0x5

    .line 42
    .line 48
    :goto_0
    :pswitch_5
    return v1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_0
        :pswitch_5
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

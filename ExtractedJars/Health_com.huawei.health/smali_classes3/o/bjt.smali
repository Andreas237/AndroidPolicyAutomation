.class public Lo/bjt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(I)Lo/bjq;
    .locals 2

    .line 32
    const/4 v1, 0x0

    .line 33
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 36
    :pswitch_0
    new-instance v1, Lo/bjo;

    invoke-direct {v1}, Lo/bjo;-><init>()V

    .line 37
    goto :goto_1

    .line 39
    :pswitch_1
    new-instance v1, Lo/bjr;

    invoke-direct {v1}, Lo/bjr;-><init>()V

    .line 40
    goto :goto_1

    .line 43
    :goto_0
    :pswitch_2
    new-instance v1, Lo/bjv;

    invoke-direct {v1}, Lo/bjv;-><init>()V

    .line 46
    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

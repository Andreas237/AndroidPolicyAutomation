.class public Lo/bhy;
.super Lo/bfn;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lo/bfn;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;I)Lo/bfk;
    .locals 2

    .line 23
    const/4 v1, 0x0

    .line 24
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 27
    :pswitch_0
    new-instance v1, Lo/bhv;

    invoke-direct {v1, p1}, Lo/bhv;-><init>(Landroid/content/Context;)V

    .line 28
    goto :goto_0

    .line 30
    :pswitch_1
    new-instance v1, Lo/bhw;

    invoke-direct {v1, p1}, Lo/bhw;-><init>(Landroid/content/Context;)V

    .line 31
    goto :goto_0

    .line 33
    :pswitch_2
    new-instance v1, Lo/bhx;

    invoke-direct {v1, p1}, Lo/bhx;-><init>(Landroid/content/Context;)V

    .line 34
    goto :goto_0

    .line 36
    :pswitch_3
    new-instance v1, Lo/bhu;

    invoke-direct {v1, p1}, Lo/bhu;-><init>(Landroid/content/Context;)V

    .line 37
    goto :goto_0

    .line 39
    :pswitch_4
    new-instance v1, Lo/bib;

    invoke-direct {v1, p1}, Lo/bib;-><init>(Landroid/content/Context;)V

    .line 40
    goto :goto_0

    .line 42
    :pswitch_5
    new-instance v1, Lo/bhz;

    invoke-direct {v1, p1}, Lo/bhz;-><init>(Landroid/content/Context;)V

    .line 43
    goto :goto_0

    .line 47
    :pswitch_6
    new-instance v1, Lo/bih;

    invoke-direct {v1, p1, p2}, Lo/bih;-><init>(Landroid/content/Context;I)V

    .line 48
    goto :goto_0

    .line 50
    :pswitch_7
    new-instance v1, Lo/bid;

    invoke-direct {v1, p1}, Lo/bid;-><init>(Landroid/content/Context;)V

    .line 51
    goto :goto_0

    .line 56
    :pswitch_8
    new-instance v1, Lo/bia;

    invoke-direct {v1, p1, p2}, Lo/bia;-><init>(Landroid/content/Context;I)V

    .line 57
    goto :goto_0

    .line 62
    :pswitch_9
    new-instance v1, Lo/big;

    invoke-direct {v1, p1, p2}, Lo/big;-><init>(Landroid/content/Context;I)V

    .line 63
    goto :goto_0

    .line 65
    :pswitch_a
    new-instance v1, Lo/bic;

    invoke-direct {v1, p1}, Lo/bic;-><init>(Landroid/content/Context;)V

    .line 66
    .line 70
    :goto_0
    :pswitch_b
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1f
        :pswitch_0
        :pswitch_1
        :pswitch_b
        :pswitch_2
        :pswitch_3
        :pswitch_b
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_9
        :pswitch_6
        :pswitch_9
    .end packed-switch
.end method

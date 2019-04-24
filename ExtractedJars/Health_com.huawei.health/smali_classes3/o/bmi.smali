.class public Lo/bmi;
.super Lo/bfn;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lo/bfn;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;I)Lo/bfk;
    .locals 4

    .line 20
    const/4 v3, 0x0

    .line 21
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 25
    :pswitch_0
    new-instance v3, Lo/bmf;

    invoke-direct {v3, p1}, Lo/bmf;-><init>(Landroid/content/Context;)V

    .line 26
    goto/16 :goto_1

    .line 30
    :pswitch_1
    new-instance v3, Lo/bmb;

    invoke-direct {v3, p1}, Lo/bmb;-><init>(Landroid/content/Context;)V

    .line 31
    goto/16 :goto_1

    .line 35
    :pswitch_2
    new-instance v3, Lo/bma;

    invoke-direct {v3, p1}, Lo/bma;-><init>(Landroid/content/Context;)V

    .line 36
    goto :goto_1

    .line 40
    :pswitch_3
    new-instance v3, Lo/blv;

    invoke-direct {v3, p1}, Lo/blv;-><init>(Landroid/content/Context;)V

    .line 41
    goto :goto_1

    .line 45
    :pswitch_4
    new-instance v3, Lo/blx;

    invoke-direct {v3, p1}, Lo/blx;-><init>(Landroid/content/Context;)V

    .line 46
    goto :goto_1

    .line 50
    :pswitch_5
    new-instance v3, Lo/blz;

    invoke-direct {v3, p1}, Lo/blz;-><init>(Landroid/content/Context;)V

    .line 51
    goto :goto_1

    .line 55
    :pswitch_6
    new-instance v3, Lo/bmh;

    invoke-direct {v3, p1}, Lo/bmh;-><init>(Landroid/content/Context;)V

    .line 56
    goto :goto_1

    .line 60
    :pswitch_7
    new-instance v3, Lo/bme;

    invoke-direct {v3, p1}, Lo/bme;-><init>(Landroid/content/Context;)V

    .line 61
    goto :goto_1

    .line 65
    :pswitch_8
    new-instance v3, Lo/bmd;

    invoke-direct {v3, p1}, Lo/bmd;-><init>(Landroid/content/Context;)V

    .line 66
    goto :goto_1

    .line 70
    :pswitch_9
    new-instance v3, Lo/bmc;

    invoke-direct {v3, p1}, Lo/bmc;-><init>(Landroid/content/Context;)V

    .line 71
    goto :goto_1

    .line 75
    :pswitch_a
    new-instance v3, Lo/blw;

    invoke-direct {v3, p1}, Lo/blw;-><init>(Landroid/content/Context;)V

    .line 76
    goto :goto_1

    .line 80
    :goto_0
    :pswitch_b
    const-string v0, "UserNodeFactory"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Don\'t support card type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :goto_1
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_b
        :pswitch_9
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_2
        :pswitch_b
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

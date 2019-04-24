.class public Lo/aul;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILo/aud;)V
    .locals 5

    .line 107
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    const-string v0, "LoginRequestFactory"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    return-void

    .line 111
    :cond_0
    invoke-static {p0}, Lo/aul;->b(I)Lo/aue;

    move-result-object v4

    .line 112
    if-nez v4, :cond_1

    .line 114
    const-string v0, "LoginRequestFactory"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doRequestSync loginType error! ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    return-void

    .line 118
    :cond_1
    invoke-interface {v4, p1}, Lo/aue;->a(Lo/aud;)V

    .line 119
    return-void
.end method

.method private static b(I)Lo/aue;
    .locals 2

    .line 49
    const/4 v1, 0x0

    .line 50
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 53
    :pswitch_0
    invoke-static {}, Lo/auj;->b()Lo/auj;

    move-result-object v1

    .line 54
    goto :goto_0

    .line 56
    :pswitch_1
    new-instance v1, Lo/auh;

    invoke-direct {v1}, Lo/auh;-><init>()V

    .line 57
    goto :goto_0

    .line 59
    :pswitch_2
    new-instance v1, Lo/auf;

    invoke-direct {v1}, Lo/auf;-><init>()V

    .line 60
    goto :goto_0

    .line 62
    :pswitch_3
    invoke-static {}, Lo/auk;->a()Lo/auk;

    move-result-object v1

    .line 63
    .line 67
    :goto_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static d(ILo/aud;Ljava/lang/String;)V
    .locals 5

    .line 79
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    const-string v0, "LoginRequestFactory"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    return-void

    .line 83
    :cond_0
    invoke-static {p0}, Lo/aul;->b(I)Lo/aue;

    move-result-object v4

    .line 84
    if-nez v4, :cond_1

    .line 86
    const-string v0, "LoginRequestFactory"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "doRequest loginType error! ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    return-void

    .line 90
    :cond_1
    instance-of v0, v4, Lo/auj;

    if-eqz v0, :cond_2

    .line 92
    move-object v0, v4

    check-cast v0, Lo/auj;

    invoke-virtual {v0, p2}, Lo/auj;->e(Ljava/lang/String;)V

    .line 95
    :cond_2
    invoke-interface {v4, p1}, Lo/aue;->c(Lo/aud;)V

    .line 96
    return-void
.end method

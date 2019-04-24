.class public Lo/dsa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-class v0, Lo/dsa;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dsa;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(I)Ljava/lang/String;
    .locals 2

    .line 276
    const/4 v1, 0x0

    .line 277
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 279
    :sswitch_0
    const-string v1, "Multi-SIM"

    .line 280
    goto :goto_1

    .line 282
    :sswitch_1
    const-string v1, "eSIM Profile"

    .line 283
    goto :goto_1

    .line 285
    :goto_0
    const-string v1, "Multi-SIM"

    .line 288
    :goto_1
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private e(I)Ljava/lang/String;
    .locals 2

    .line 250
    const/4 v1, 0x0

    .line 251
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 253
    :pswitch_0
    const-string v1, "IMSI"

    .line 254
    goto :goto_0

    .line 256
    :pswitch_1
    const-string v1, "MSISDN"

    .line 257
    goto :goto_0

    .line 259
    :pswitch_2
    const-string v1, "ICCID"

    .line 260
    goto :goto_0

    .line 262
    :pswitch_3
    const-string v1, "EID"

    .line 266
    :goto_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private e(Lo/dqv;Lo/dqt;Landroid/os/Message;Landroid/os/Message;I)V
    .locals 11

    .line 192
    const/4 v3, 0x0

    .line 193
    const/4 v4, 0x0

    .line 194
    const/4 v5, 0x0

    .line 195
    const/4 v6, 0x0

    .line 196
    invoke-static {}, Lo/drs;->b()Lo/drs;

    move-result-object v7

    .line 197
    invoke-virtual {v7}, Lo/drs;->a()Lo/drs$e;

    move-result-object v8

    .line 198
    new-instance v9, Lo/dre;

    invoke-direct {v9}, Lo/dre;-><init>()V

    .line 199
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 200
    invoke-virtual {p1}, Lo/dqv;->d()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dsa;->b(I)Ljava/lang/String;

    move-result-object v6

    .line 201
    invoke-virtual {p1}, Lo/dqv;->a()Ljava/lang/String;

    move-result-object v3

    .line 202
    invoke-virtual {p1}, Lo/dqv;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dsa;->e(I)Ljava/lang/String;

    move-result-object v4

    .line 210
    invoke-virtual {v9, v3}, Lo/dre;->e(Ljava/lang/String;)V

    .line 211
    invoke-virtual {v9, v4}, Lo/dre;->k(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v9, v6}, Lo/dre;->a(Ljava/lang/String;)V

    .line 213
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    sget-object v0, Lo/dsa;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "progressData.getPrimary():"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Lo/dre;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    sget-object v0, Lo/dsa;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "progressData.primarytype:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 218
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 219
    invoke-virtual {p2}, Lo/dqt;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/dre;->d(Ljava/lang/String;)V

    .line 220
    invoke-virtual {p2}, Lo/dqt;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dsa;->e(I)Ljava/lang/String;

    move-result-object v5

    .line 221
    invoke-virtual {v9, v5}, Lo/dre;->b(Ljava/lang/String;)V

    .line 222
    invoke-virtual {p2}, Lo/dqt;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/dre;->c(Ljava/lang/String;)V

    .line 223
    invoke-virtual {p2}, Lo/dqt;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/dre;->h(Ljava/lang/String;)V

    .line 224
    invoke-virtual {p2}, Lo/dqt;->d()Lo/drc;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/dre;->d(Lo/drc;)V

    .line 225
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 226
    sget-object v0, Lo/dsa;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SecondaryType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Lo/dre;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 227
    sget-object v0, Lo/dsa;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SecondaryID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v9}, Lo/dre;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 231
    invoke-virtual {v9, p3}, Lo/dre;->e(Landroid/os/Message;)V

    .line 233
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p4, :cond_3

    .line 234
    invoke-virtual {v9, p4}, Lo/dre;->c(Landroid/os/Message;)V

    .line 236
    :cond_3
    move/from16 v0, p5

    invoke-virtual {v9, v0}, Lo/dre;->a(I)V

    .line 237
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 238
    move/from16 v0, p5

    invoke-virtual {v8, v0, v9}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v10

    .line 239
    invoke-virtual {v8, v10}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 241
    :cond_4
    return-void
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 2

    .line 35
    if-nez p1, :cond_0

    .line 36
    sget-object v0, Lo/dsa;->a:Ljava/lang/String;

    const-string v1, "HwMultiDeviceManager init failed, context is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    return-void

    .line 39
    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lo/dsa;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    return-void
.end method

.method public b(Lo/dqv;Lo/dqt;Landroid/os/Message;)V
    .locals 6

    .line 81
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    const/4 v4, 0x0

    const/16 v5, 0x64

    invoke-direct/range {v0 .. v5}, Lo/dsa;->e(Lo/dqv;Lo/dqt;Landroid/os/Message;Landroid/os/Message;I)V

    .line 82
    return-void
.end method

.method public c()V
    .locals 2

    .line 65
    invoke-static {}, Lo/drs;->b()Lo/drs;

    move-result-object v0

    invoke-virtual {v0}, Lo/drs;->c()V

    .line 66
    invoke-static {}, Lo/dqs;->c()Lo/dqs;

    move-result-object v0

    invoke-virtual {v0}, Lo/dqs;->d()V

    .line 67
    sget-object v0, Lo/dsa;->a:Ljava/lang/String;

    const-string v1, "Finish HwMultiSIMSdk exit"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    return-void
.end method

.method public c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 48
    if-nez p1, :cond_0

    .line 49
    sget-object v0, Lo/dsa;->a:Ljava/lang/String;

    const-string v1, "HwMultiDeviceManager init failed, context is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    return-void

    .line 52
    :cond_0
    iput-object p1, p0, Lo/dsa;->b:Landroid/content/Context;

    .line 53
    invoke-static {}, Lo/drx;->e()Lo/drx;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/drx;->b(Landroid/content/Context;)V

    .line 54
    invoke-static {}, Lo/drs;->b()Lo/drs;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/drs;->c(Landroid/content/Context;)V

    .line 55
    invoke-static {}, Lo/dqs;->c()Lo/dqs;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dqs;->c(Landroid/content/Context;)I

    .line 56
    invoke-static {p2, p3}, Lo/dru;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-static {}, Lo/drz;->e()Lo/drz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/drz;->d(Landroid/content/Context;)V

    .line 58
    sget-object v0, Lo/dsa;->a:Ljava/lang/String;

    const-string v1, "Start init HwMultiSIMSdk"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    return-void
.end method

.method public d(Lo/dqv;Lo/dqt;Landroid/os/Message;)V
    .locals 6

    .line 100
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    const/4 v4, 0x0

    const/16 v5, 0x66

    invoke-direct/range {v0 .. v5}, Lo/dsa;->e(Lo/dqv;Lo/dqt;Landroid/os/Message;Landroid/os/Message;I)V

    .line 101
    return-void
.end method

.method public e(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)Z
    .locals 1

    .line 146
    invoke-static {p1, p2, p3}, Lo/dru;->d(Landroid/content/Context;Lo/dqz;Landroid/os/Message;)Z

    move-result v0

    return v0
.end method

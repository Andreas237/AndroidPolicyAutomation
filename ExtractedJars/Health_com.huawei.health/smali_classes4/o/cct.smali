.class public Lo/cct;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ccr;


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field private a:Z

.field private b:I

.field private d:Lo/ccp;

.field e:Landroid/os/Handler;

.field private h:Lo/ccf;

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const/4 v0, 0x0

    sput-object v0, Lo/cct;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lo/ccp;Lo/ccf;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/cct;->b:I

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cct;->a:Z

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cct;->i:Z

    .line 116
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lo/cct$1;

    invoke-direct {v1, p0}, Lo/cct$1;-><init>(Lo/cct;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    .line 40
    iput-object p1, p0, Lo/cct;->d:Lo/ccp;

    .line 41
    iput-object p2, p0, Lo/cct;->h:Lo/ccf;

    .line 42
    return-void
.end method

.method static synthetic b()Ljava/lang/String;
    .locals 1

    .line 22
    sget-object v0, Lo/cct;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lo/cct;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/cct;->e()V

    return-void
.end method

.method private d()V
    .locals 4

    .line 53
    iget-object v0, p0, Lo/cct;->d:Lo/ccp;

    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lo/cct;->d:Lo/ccp;

    invoke-interface {v0}, Lo/ccp;->X()V

    .line 55
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerGps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 57
    :cond_0
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerGps GpsControler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/cct;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/cct;->d()V

    return-void
.end method

.method private e()V
    .locals 5

    .line 63
    iget-object v0, p0, Lo/cct;->d:Lo/ccp;

    if-eqz v0, :cond_2

    .line 64
    iget-object v0, p0, Lo/cct;->h:Lo/ccf;

    if-eqz v0, :cond_1

    .line 65
    iget-object v0, p0, Lo/cct;->h:Lo/ccf;

    invoke-interface {v0}, Lo/ccf;->c()Ljava/lang/String;

    move-result-object v4

    .line 66
    iget-object v0, p0, Lo/cct;->h:Lo/ccf;

    invoke-interface {v0}, Lo/ccf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lo/cct;->d:Lo/ccp;

    invoke-interface {v0}, Lo/ccp;->W()V

    .line 68
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterGpsand CurState is still"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 70
    :cond_0
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " CurState is not still and CurState  is"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    :goto_0
    goto :goto_1

    .line 73
    :cond_1
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterGps mIARStateListener is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 76
    :cond_2
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterGps GpsControler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/cct;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/cct;->a:Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cct;->d:Lo/ccp;

    .line 84
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    sget-object v1, Lo/cct;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 86
    return-void
.end method

.method public c()V
    .locals 4

    .line 47
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    return-void
.end method

.method public c(I)V
    .locals 7

    .line 143
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 144
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dispatchPhoneCurrentState handler null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return-void

    .line 147
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 149
    :pswitch_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cct;->b:I

    .line 150
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    iget v1, p0, Lo/cct;->b:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 151
    goto/16 :goto_0

    .line 153
    :cond_1
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    iget v1, p0, Lo/cct;->b:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 154
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 155
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cct;->i:Z

    .line 156
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPhoneCurrentState is ENTER_STATE_STILL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    goto :goto_0

    .line 163
    :pswitch_1
    const/16 v0, 0x64

    iput v0, p0, Lo/cct;->b:I

    .line 164
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    iget v1, p0, Lo/cct;->b:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    goto :goto_0

    .line 167
    :cond_2
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    iget v1, p0, Lo/cct;->b:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 168
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    move-result v5

    .line 170
    if-nez v5, :cond_3

    .line 171
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    iget v1, p0, Lo/cct;->b:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 173
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 175
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cct;->i:Z

    .line 176
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPhoneCurrentState not still"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    .line 181
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public e(I)V
    .locals 5

    .line 90
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 91
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyUserOperateSportState  mHandler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 94
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 96
    :pswitch_0
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    sget-object v1, Lo/cct;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 98
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cct;->a:Z

    .line 99
    goto :goto_0

    .line 101
    :pswitch_1
    const-string v0, "Track_PowerSaveStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is sporting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    iget-boolean v0, p0, Lo/cct;->i:Z

    if-eqz v0, :cond_1

    .line 103
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 104
    iget-object v0, p0, Lo/cct;->e:Landroid/os/Handler;

    const-wide/32 v1, 0x1d4c0

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 106
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cct;->a:Z

    .line 107
    nop

    .line 109
    .line 113
    :goto_0
    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

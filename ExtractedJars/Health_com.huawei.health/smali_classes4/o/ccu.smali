.class public Lo/ccu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ccr;


# static fields
.field private static final d:Ljava/lang/String;


# instance fields
.field private a:I

.field private b:Z

.field private c:Z

.field private e:Z

.field private h:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const/4 v0, 0x0

    sput-object v0, Lo/ccu;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance v0, Landroid/os/Handler;

    new-instance v1, Lo/ccu$2;

    invoke-direct {v1, p0}, Lo/ccu$2;-><init>(Lo/ccu;)V

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    .line 38
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AutoPauseResumeStrategy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    return-void
.end method

.method static synthetic a(Lo/ccu;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/ccu;->c:Z

    return v0
.end method

.method static synthetic b(Lo/ccu;)Landroid/os/Handler;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 4

    .line 48
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoPauseSport at "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccu;->c:Z

    .line 50
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->d()I

    .line 51
    return-void
.end method

.method static synthetic c(Lo/ccu;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/ccu;->e()V

    return-void
.end method

.method static synthetic d()Ljava/lang/String;
    .locals 1

    .line 22
    sget-object v0, Lo/ccu;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/ccu;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/ccu;->b:Z

    return v0
.end method

.method private e()V
    .locals 4

    .line 54
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoResumeSport at "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccu;->c:Z

    .line 56
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->h()I

    .line 57
    return-void
.end method

.method static synthetic e(Lo/ccu;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/ccu;->b()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 166
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    sget-object v1, Lo/ccu;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 167
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    .line 168
    return-void
.end method

.method public c()V
    .locals 4

    .line 44
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start AutoPauseResumeStrategy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    return-void
.end method

.method public c(I)V
    .locals 5

    .line 129
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 130
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dispatchPhoneCurrentState handler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    return-void

    .line 133
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 135
    :pswitch_0
    const/4 v0, 0x0

    iput v0, p0, Lo/ccu;->a:I

    .line 136
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    iget v1, p0, Lo/ccu;->a:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    return-void

    .line 139
    :cond_1
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    iget v1, p0, Lo/ccu;->a:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 140
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 141
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccu;->e:Z

    .line 142
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPhoneCurrentState is ENTER_STATE_STILL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    goto :goto_0

    .line 149
    :pswitch_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccu;->e:Z

    .line 150
    const/16 v0, 0x64

    iput v0, p0, Lo/ccu;->a:I

    .line 151
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    iget v1, p0, Lo/ccu;->a:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    return-void

    .line 154
    :cond_2
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    iget v1, p0, Lo/ccu;->a:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 155
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 156
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPhoneCurrentState is AUTO_RESUME_SPORT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    .line 161
    :goto_0
    return-void

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

    .line 66
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 67
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyUserOperateSportState handler is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    return-void

    .line 70
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 72
    :pswitch_0
    iget-boolean v0, p0, Lo/ccu;->c:Z

    if-nez v0, :cond_1

    .line 73
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ccu;->b:Z

    .line 74
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IS isPauseByUser"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 76
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccu;->b:Z

    .line 77
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IS  isPauseByAuto"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    :goto_0
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    sget-object v1, Lo/ccu;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 81
    goto :goto_1

    .line 83
    :pswitch_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccu;->c:Z

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ccu;->b:Z

    .line 85
    iget-boolean v0, p0, Lo/ccu;->e:Z

    if-eqz v0, :cond_2

    .line 86
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IS isIndoorSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 88
    iget-object v0, p0, Lo/ccu;->h:Landroid/os/Handler;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 90
    :cond_2
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IS SPORT_STATUS_SPORTING"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    goto :goto_1

    .line 93
    :pswitch_2
    const-string v0, "Track_AutoPauseResumeStrategy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyUserOperateSportState  is SPORT_STATUS_STOP_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    .line 98
    :goto_1
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

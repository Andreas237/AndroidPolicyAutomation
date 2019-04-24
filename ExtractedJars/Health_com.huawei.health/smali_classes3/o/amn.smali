.class public Lo/amn;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/amn$e;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/content/Context;

.field private c:Landroid/app/AlarmManager;

.field private d:Landroid/app/PendingIntent;

.field private e:Landroid/app/PendingIntent;

.field private f:J

.field private g:J

.field private h:I

.field private i:Lo/amn$e;

.field private k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amn;->c:Landroid/app/AlarmManager;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amn;->b:Landroid/content/Context;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amn;->d:Landroid/app/PendingIntent;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amn;->e:Landroid/app/PendingIntent;

    .line 29
    const/16 v0, 0x28

    iput v0, p0, Lo/amn;->a:I

    .line 30
    const/16 v0, 0x258

    iput v0, p0, Lo/amn;->h:I

    .line 32
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amn;->f:J

    .line 33
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amn;->g:J

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/amn;->k:Z

    .line 38
    sget-object v0, Lo/amn$e;->c:Lo/amn$e;

    iput-object v0, p0, Lo/amn;->i:Lo/amn$e;

    .line 54
    if-eqz p1, :cond_0

    .line 56
    iput-object p1, p0, Lo/amn;->b:Landroid/content/Context;

    .line 57
    iget-object v0, p0, Lo/amn;->b:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lo/amn;->c:Landroid/app/AlarmManager;

    .line 58
    iget-object v0, p0, Lo/amn;->b:Landroid/content/Context;

    const-string v1, "SEND_START_BROCAST"

    invoke-direct {p0, v0, v1}, Lo/amn;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lo/amn;->d:Landroid/app/PendingIntent;

    .line 59
    iget-object v0, p0, Lo/amn;->b:Landroid/content/Context;

    const-string v1, "SEND_STOP_BROCAST"

    invoke-direct {p0, v0, v1}, Lo/amn;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lo/amn;->e:Landroid/app/PendingIntent;

    .line 62
    :cond_0
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;
    .locals 4

    .line 189
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 190
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 191
    const-class v0, Lcom/huawei/health/manager/DaemonService;

    invoke-virtual {v1, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 192
    invoke-virtual {v1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 194
    const/4 v2, 0x0

    .line 195
    const/high16 v0, 0x8000000

    invoke-static {p1, v2, v1, v0}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 197
    return-object v3
.end method

.method private a()V
    .locals 2

    .line 288
    iget-object v0, p0, Lo/amn;->c:Landroid/app/AlarmManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/amn;->d:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lo/amn;->c:Landroid/app/AlarmManager;

    iget-object v1, p0, Lo/amn;->d:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 291
    :cond_0
    return-void
.end method

.method private c()V
    .locals 2

    .line 279
    iget-object v0, p0, Lo/amn;->c:Landroid/app/AlarmManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/amn;->e:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    .line 280
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/amn;->k:Z

    .line 281
    iget-object v0, p0, Lo/amn;->c:Landroid/app/AlarmManager;

    iget-object v1, p0, Lo/amn;->e:Landroid/app/PendingIntent;

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 284
    :cond_0
    return-void
.end method

.method private c(Lo/amn$e;)Z
    .locals 4

    .line 108
    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->a:Lo/amn$e;

    if-ne v0, v1, :cond_0

    .line 110
    sget-object v0, Lo/amn$e;->b:Lo/amn$e;

    if-eq p1, v0, :cond_0

    .line 111
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "running now only support exit running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const/4 v0, 0x1

    return v0

    .line 125
    :cond_0
    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->d:Lo/amn$e;

    if-ne v0, v1, :cond_1

    .line 127
    sget-object v0, Lo/amn$e;->e:Lo/amn$e;

    if-eq p1, v0, :cond_1

    .line 128
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bicycle new support exit bicycle only"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v0, 0x1

    return v0

    .line 143
    :cond_1
    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->b:Lo/amn$e;

    if-ne v0, v1, :cond_2

    .line 144
    sget-object v0, Lo/amn$e;->a:Lo/amn$e;

    if-eq p1, v0, :cond_2

    .line 145
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit running now only support enter running"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const/4 v0, 0x1

    return v0

    .line 150
    :cond_2
    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->e:Lo/amn$e;

    if-ne v0, v1, :cond_3

    .line 151
    sget-object v0, Lo/amn$e;->d:Lo/amn$e;

    if-eq p1, v0, :cond_3

    .line 152
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit bicycle now only support enter bicycle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const/4 v0, 0x1

    return v0

    .line 156
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private d(I)V
    .locals 9

    .line 209
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 211
    const/4 v6, 0x0

    .line 213
    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->b:Lo/amn$e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->e:Lo/amn$e;

    if-ne v0, v1, :cond_2

    .line 217
    :cond_0
    iget-wide v0, p0, Lo/amn;->f:J

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    .line 219
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel stop "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/amn;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " current "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    invoke-direct {p0}, Lo/amn;->c()V

    .line 221
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amn;->f:J

    goto :goto_0

    .line 224
    :cond_1
    const/4 v6, 0x1

    goto :goto_0

    .line 227
    :cond_2
    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->c:Lo/amn$e;

    if-ne v0, v1, :cond_3

    .line 228
    const/4 v6, 0x1

    .line 231
    :cond_3
    :goto_0
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendStartBrocast needSetAlarm "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    if-eqz v6, :cond_4

    .line 234
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/amn;->k:Z

    .line 235
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    int-to-long v2, p1

    add-long v7, v0, v2

    .line 236
    iget-object v0, p0, Lo/amn;->c:Landroid/app/AlarmManager;

    iget-object v1, p0, Lo/amn;->d:Landroid/app/PendingIntent;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v7, v8, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 237
    iput-wide v7, p0, Lo/amn;->g:J

    .line 239
    :cond_4
    return-void
.end method

.method private e(I)V
    .locals 8

    .line 248
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 250
    iget-wide v0, p0, Lo/amn;->g:J

    cmp-long v0, v4, v0

    if-gez v0, :cond_0

    .line 252
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel start dest:  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/amn;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " curr: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    invoke-direct {p0}, Lo/amn;->a()V

    goto :goto_0

    .line 255
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/amn;->k:Z

    .line 256
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    int-to-long v2, p1

    add-long v6, v0, v2

    .line 257
    iget-object v0, p0, Lo/amn;->c:Landroid/app/AlarmManager;

    iget-object v1, p0, Lo/amn;->e:Landroid/app/PendingIntent;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v6, v7, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 258
    iput-wide v6, p0, Lo/amn;->f:J

    .line 260
    :goto_0
    return-void
.end method

.method private e(Lo/amn$e;)V
    .locals 2

    .line 160
    sget-object v0, Lo/amn$e;->a:Lo/amn$e;

    if-eq p1, v0, :cond_0

    sget-object v0, Lo/amn$e;->d:Lo/amn$e;

    if-ne p1, v0, :cond_1

    .line 163
    :cond_0
    iget v0, p0, Lo/amn;->a:I

    mul-int/lit16 v0, v0, 0x3e8

    invoke-direct {p0, v0}, Lo/amn;->d(I)V

    goto :goto_0

    .line 165
    :cond_1
    sget-object v0, Lo/amn$e;->b:Lo/amn$e;

    if-eq p1, v0, :cond_2

    sget-object v0, Lo/amn$e;->e:Lo/amn$e;

    if-ne p1, v0, :cond_3

    .line 168
    :cond_2
    iget v0, p0, Lo/amn;->h:I

    mul-int/lit16 v0, v0, 0x3e8

    invoke-direct {p0, v0}, Lo/amn;->e(I)V

    .line 172
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Lo/amn$e;)V
    .locals 6

    .line 72
    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->b:Lo/amn$e;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->e:Lo/amn$e;

    if-ne v0, v1, :cond_1

    .line 75
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 78
    iget-wide v0, p0, Lo/amn;->f:J

    cmp-long v0, v0, v4

    if-gez v0, :cond_1

    .line 79
    sget-object v0, Lo/amn$e;->c:Lo/amn$e;

    iput-object v0, p0, Lo/amn;->i:Lo/amn$e;

    .line 80
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "I have deal exit cmd, enter idle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :cond_1
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setmCurrentSportType cur "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/amn;->i:Lo/amn$e;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " new "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    iget-object v0, p0, Lo/amn;->i:Lo/amn$e;

    sget-object v1, Lo/amn$e;->c:Lo/amn$e;

    if-ne v0, v1, :cond_2

    .line 89
    sget-object v0, Lo/amn$e;->a:Lo/amn$e;

    if-eq p1, v0, :cond_2

    sget-object v0, Lo/amn$e;->d:Lo/amn$e;

    if-eq p1, v0, :cond_2

    .line 91
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "idle now only support runing or bicycle"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 96
    :cond_2
    invoke-direct {p0, p1}, Lo/amn;->c(Lo/amn$e;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 97
    return-void

    .line 100
    :cond_3
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deal new state "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    invoke-direct {p0, p1}, Lo/amn;->e(Lo/amn$e;)V

    .line 103
    iput-object p1, p0, Lo/amn;->i:Lo/amn$e;

    .line 104
    return-void
.end method

.method public e()V
    .locals 4

    .line 267
    iget-boolean v0, p0, Lo/amn;->k:Z

    if-nez v0, :cond_0

    .line 268
    const-string v0, "Track_AlarManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "heartBeatSendStopBrocast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    iget v0, p0, Lo/amn;->h:I

    mul-int/lit16 v0, v0, 0x3e8

    invoke-direct {p0, v0}, Lo/amn;->e(I)V

    .line 271
    :cond_0
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 176
    iput p1, p0, Lo/amn;->a:I

    .line 177
    iput p2, p0, Lo/amn;->h:I

    .line 178
    return-void
.end method

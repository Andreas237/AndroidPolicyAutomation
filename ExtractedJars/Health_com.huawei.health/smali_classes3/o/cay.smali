.class public Lo/cay;
.super Lo/cao;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private c:Z

.field private d:I

.field private f:Landroid/app/Notification$Builder;

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 120
    invoke-direct {p0}, Lo/cao;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cay;->c:Z

    .line 27
    const/4 v0, -0x1

    iput v0, p0, Lo/cay;->d:I

    .line 116
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    .line 118
    const/4 v0, -0x1

    iput v0, p0, Lo/cay;->g:I

    .line 121
    iput-object p1, p0, Lo/cay;->a:Landroid/content/Context;

    .line 122
    return-void
.end method

.method private e()V
    .locals 4

    .line 130
    const-string v0, "Step_HGNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startNotification..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-direct {p0}, Lo/cay;->h()Landroid/app/Notification;

    move-result-object v1

    const/16 v2, 0x271b

    invoke-virtual {v0, v2, v1}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 134
    return-void
.end method

.method private f()Ljava/lang/String;
    .locals 6

    .line 222
    const/4 v4, 0x0

    .line 224
    :try_start_0
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindaemon/R$string;->IDS_plugindameon_hw_show_goal_completed_string:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 227
    goto :goto_0

    .line 225
    :catch_0
    move-exception v5

    .line 226
    const-string v0, "Step_HGNH"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadDayData() Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/content/res/Resources$NotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :goto_0
    return-object v4
.end method

.method private h()Landroid/app/Notification;
    .locals 6

    .line 152
    const-string v0, "Step_HGNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createHealthNotification()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    iget-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    if-nez v0, :cond_0

    .line 154
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v0

    iput-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    .line 158
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    iget-object v1, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    invoke-static {v0, v1}, Lo/cbb;->b(Landroid/content/Context;Landroid/app/Notification$Builder;)V

    .line 159
    iget-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 160
    iget-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    iget-object v1, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-static {v1}, Lo/cbh;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 161
    iget-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 163
    :cond_0
    iget-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 164
    iget-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v4

    .line 165
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cbh;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v4, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 166
    new-instance v5, Landroid/content/Intent;

    const-string v0, "goal_notify_delete"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 167
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 168
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    const/16 v1, 0x271b

    const/high16 v2, 0x8000000

    invoke-static {v0, v1, v5, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v4, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 170
    const/4 v0, 0x0

    iput v0, v4, Landroid/app/Notification;->priority:I

    .line 171
    iget v0, v4, Landroid/app/Notification;->flags:I

    or-int/lit8 v0, v0, 0x10

    iput v0, v4, Landroid/app/Notification;->flags:I

    .line 173
    return-object v4
.end method

.method private i()V
    .locals 4

    .line 141
    const-string v0, "Step_HGNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeNotification..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    const/4 v0, -0x1

    iput v0, p0, Lo/cay;->g:I

    .line 145
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    const/16 v1, 0x271b

    invoke-static {v0, v1}, Lo/cbh;->d(Landroid/content/Context;I)V

    .line 146
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    .line 108
    invoke-direct {p0}, Lo/cay;->i()V

    .line 109
    return-void
.end method

.method public b()V
    .locals 2

    .line 100
    invoke-super {p0}, Lo/cao;->b()V

    .line 101
    invoke-direct {p0}, Lo/cay;->i()V

    .line 102
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/amy;->b(Landroid/content/Context;Z)V

    .line 103
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .line 31
    invoke-super {p0, p1}, Lo/cao;->b(Landroid/os/Bundle;)V

    .line 34
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/amy;->b(Landroid/content/Context;Z)V

    .line 37
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->r(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v4

    .line 38
    if-eqz v4, :cond_0

    const/4 v0, 0x0

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/amz;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lo/cay;->c:Z

    goto :goto_0

    .line 41
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cay;->c:Z

    .line 42
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/amy;->e(Landroid/content/Context;JZ)V

    .line 44
    :goto_0
    iget-boolean v0, p0, Lo/cay;->c:Z

    if-nez v0, :cond_1

    .line 45
    invoke-direct {p0}, Lo/cay;->i()V

    .line 47
    :cond_1
    return-void
.end method

.method public c(IIII)V
    .locals 6

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 209
    int-to-float v0, p2

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "###.##"

    invoke-static {v0, v1}, Lo/cbh;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 210
    int-to-float v0, p3

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "###"

    invoke-static {v0, v1}, Lo/cbh;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 211
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "###"

    invoke-static {v0, v1}, Lo/cbh;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 214
    invoke-virtual {p0, v2, v3, v4, v5}, Lo/cay;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    return-void
.end method

.method protected c(Lo/ald;)V
    .locals 4

    .line 52
    if-nez p1, :cond_0

    .line 53
    const-string v0, "Step_HGNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Invalied param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    return-void

    .line 57
    :cond_0
    iget v0, p1, Lo/ald;->c:I

    if-gtz v0, :cond_1

    .line 58
    const-string v0, "Step_HGNH"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Refresh failed,invalidate target:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    return-void

    .line 63
    :cond_1
    iget v0, p0, Lo/cay;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 64
    const-string v0, "Step_HGNH"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "target init: target"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    iget v0, p1, Lo/ald;->c:I

    iput v0, p0, Lo/cay;->d:I

    goto :goto_0

    .line 68
    :cond_2
    iget v0, p1, Lo/ald;->c:I

    iget v1, p0, Lo/cay;->d:I

    if-eq v0, v1, :cond_3

    .line 70
    const-string v0, "Step_HGNH"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "target changed: target"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "mTarget"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/cay;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget v0, p1, Lo/ald;->c:I

    iput v0, p0, Lo/cay;->d:I

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cay;->c:Z

    .line 73
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/amy;->e(Landroid/content/Context;JZ)V

    .line 74
    invoke-direct {p0}, Lo/cay;->i()V

    .line 80
    :cond_3
    :goto_0
    iget v0, p1, Lo/ald;->a:I

    iget v1, p0, Lo/cay;->g:I

    if-ge v0, v1, :cond_4

    .line 81
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cay;->c:Z

    .line 82
    const-string v0, "Step_HGNH"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "next day:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "steps"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p1, Lo/ald;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "mLastReport"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget v2, p0, Lo/cay;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/amy;->e(Landroid/content/Context;JZ)V

    .line 84
    invoke-direct {p0}, Lo/cay;->i()V

    .line 86
    :cond_4
    iget v0, p1, Lo/ald;->a:I

    iput v0, p0, Lo/cay;->g:I

    .line 89
    iget v0, p1, Lo/ald;->a:I

    iget v1, p1, Lo/ald;->c:I

    if-lt v0, v1, :cond_5

    iget-boolean v0, p0, Lo/cay;->c:Z

    if-nez v0, :cond_5

    .line 90
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cay;->c:Z

    .line 91
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/amy;->e(Landroid/content/Context;JZ)V

    .line 92
    invoke-direct {p0}, Lo/cay;->e()V

    .line 93
    iget v0, p1, Lo/ald;->a:I

    iget v1, p1, Lo/ald;->b:I

    iget v2, p1, Lo/ald;->d:I

    iget v3, p1, Lo/ald;->c:I

    invoke-virtual {p0, v0, v1, v2, v3}, Lo/cay;->c(IIII)V

    .line 96
    :cond_5
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 185
    const-string v0, "Step_HGNH"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upDateHealthNotification()|"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const-string v2, "|"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, "|"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iget-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    if-nez v0, :cond_0

    .line 187
    const-string v0, "Step_HGNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upDateHealthNotification builder null,not update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    return-void

    .line 190
    :cond_0
    iget-object v0, p0, Lo/cay;->a:Landroid/content/Context;

    invoke-static {v0, p4}, Lo/cbh;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 191
    invoke-direct {p0}, Lo/cay;->f()Ljava/lang/String;

    move-result-object v5

    .line 193
    iget-object v0, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 195
    const-string v0, "Step_HGNH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rebuild notification"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    iget-object v1, p0, Lo/cay;->f:Landroid/app/Notification$Builder;

    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v1

    const/16 v2, 0x271b

    invoke-virtual {v0, v2, v1}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 198
    return-void
.end method

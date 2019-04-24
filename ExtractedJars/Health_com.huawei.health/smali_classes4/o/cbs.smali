.class public Lo/cbs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Z

.field private c:Z

.field private d:Landroid/content/Context;

.field private e:Z

.field private f:J

.field private g:I

.field private h:I

.field private i:F

.field private k:Lo/cfd;

.field private l:Z

.field private o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cbs;->a:J

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbs;->b:Z

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbs;->e:Z

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbs;->c:Z

    .line 42
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cbs;->f:J

    .line 43
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->g:I

    .line 44
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->i:F

    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->h:I

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->o:I

    .line 47
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbs;->l:Z

    .line 70
    iput-object p1, p0, Lo/cbs;->d:Landroid/content/Context;

    .line 71
    iput-boolean p2, p0, Lo/cbs;->l:Z

    .line 72
    return-void
.end method

.method private b(Landroid/content/Context;JJ)Landroid/content/Intent;
    .locals 6

    .line 248
    const/4 v4, 0x0

    .line 250
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.health.receiver.MainProcessHelperService"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v4, v0

    .line 251
    const-string v0, "startTime"

    invoke-virtual {v4, v0, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 252
    const-string v0, "endTime"

    invoke-virtual {v4, v0, p4, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 253
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 254
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 258
    goto :goto_0

    .line 256
    :catch_0
    move-exception v5

    .line 257
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAutoTrackNotificationServiceIntent() AutoTrackNotificationService not found"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    :goto_0
    return-object v4
.end method

.method private b()V
    .locals 5

    .line 76
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0}, Lo/cbl;->c()Lo/cbp;

    move-result-object v4

    .line 77
    if-nez v4, :cond_0

    .line 78
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentStep() mPluginTrackAdapter is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    return-void

    .line 81
    :cond_0
    new-instance v0, Lo/cbs$1;

    invoke-direct {v0, p0}, Lo/cbs$1;-><init>(Lo/cbs;)V

    invoke-interface {v4, v0}, Lo/cbp;->e(Lo/ces;)V

    .line 93
    return-void
.end method

.method private c(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification;
    .locals 2

    .line 231
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    invoke-virtual {v0}, Lo/dbc;->e()Landroid/app/Notification$Builder;

    move-result-object v1

    .line 232
    invoke-static {p1, v1}, Lo/ene;->c(Landroid/content/Context;Landroid/app/Notification$Builder;)V

    .line 233
    invoke-virtual {v1, p2}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 234
    invoke-virtual {v1, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 235
    invoke-virtual {v1, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 236
    invoke-virtual {v1, p5}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 237
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 238
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 239
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 240
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 241
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 243
    invoke-virtual {v1}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/content/Context;JJF)V
    .locals 13

    .line 205
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createNotification() startTime: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ;endTime: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ;totalSportDistance: "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    invoke-direct/range {p0 .. p5}, Lo/cbs;->b(Landroid/content/Context;JJ)Landroid/content/Intent;

    move-result-object v10

    .line 207
    if-eqz v10, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p4, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    cmpl-float v0, p6, v0

    if-nez v0, :cond_1

    .line 208
    :cond_0
    const-string v0, "Track_AutoTrackManager"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    const-string v2, " ;startTime: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " ;endTime: "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " ;totalSportDistance: "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    return-void

    .line 211
    :cond_1
    const/4 v0, 0x0

    const/high16 v1, 0x8000000

    invoke-static {p1, v0, v10, v1}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v11

    .line 214
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 215
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hw_show_motiontrack_autotrack_finish:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 216
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hw_show_sport_kms_string_en:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/high16 v6, 0x42c80000    # 100.0f

    mul-float v6, v6, p6

    .line 217
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-double v6, v6

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    div-double/2addr v6, v8

    const/4 v8, 0x1

    const/4 v9, 0x2

    invoke-static {v6, v7, v8, v9}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 216
    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 215
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    goto :goto_0

    .line 220
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hw_show_motiontrack_autotrack_finish:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 221
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/huawei/healthcloud/plugintrack/R$string;->IDS_hw_show_sport_kms_string:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/high16 v6, 0x42c80000    # 100.0f

    mul-float v6, v6, p6

    .line 222
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-double v6, v6

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    div-double/2addr v6, v8

    const/4 v8, 0x1

    const/4 v9, 0x2

    invoke-static {v6, v7, v8, v9}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 221
    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 220
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 225
    :goto_0
    invoke-static {}, Lo/dbc;->d()Lo/dbc;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move-object v3, v12

    .line 226
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->labelRes:I

    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object v5, v12

    move-object v6, v11

    .line 225
    invoke-direct/range {v1 .. v6}, Lo/cbs;->c(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification;

    move-result-object v1

    const/16 v2, 0x2775

    invoke-virtual {v0, v2, v1}, Lo/dbc;->b(ILandroid/app/Notification;)V

    .line 227
    return-void
.end method

.method static synthetic e(Lo/cbs;Lo/cfd;)Lo/cfd;
    .locals 0

    .line 25
    iput-object p1, p0, Lo/cbs;->k:Lo/cfd;

    return-object p1
.end method

.method private f()V
    .locals 4

    .line 139
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "removeSnapShot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    iget-boolean v0, p0, Lo/cbs;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo/cbs;->e:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lo/cbs;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 141
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbs;->b:Z

    .line 142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbs;->e:Z

    .line 143
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbs;->c:Z

    .line 144
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cbs;->a:J

    .line 145
    iget-object v0, p0, Lo/cbs;->d:Landroid/content/Context;

    const-string v1, "simplemotionbuffer.txt"

    invoke-static {v0, v1}, Lo/cdy;->d(Landroid/content/Context;Ljava/lang/String;)Z

    .line 147
    :cond_1
    return-void
.end method

.method private i()V
    .locals 4

    .line 126
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSnapshot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbs;->k:Lo/cfd;

    .line 128
    invoke-direct {p0}, Lo/cbs;->b()V

    .line 130
    iget-object v0, p0, Lo/cbs;->d:Landroid/content/Context;

    const-string v1, "simplemotion.txt"

    const-string v2, "simplemotionbuffer.txt"

    invoke-static {v0, v1, v2}, Lo/cdy;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lo/cbs;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cdy;->c(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/cbs;->a:J

    .line 132
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSnapshot MotionTrackFileLine: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/cbs;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", copySimpleFile: SIMPLE_MOTION_FILE_NAME"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cbs;->e:Z

    .line 134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cbs;->b:Z

    .line 136
    :cond_0
    return-void
.end method

.method private k()V
    .locals 5

    .line 150
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryAutoTrakSnapshotInfo start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    :try_start_0
    iget-wide v0, p0, Lo/cbs;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lo/cbs;->d:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/cdy;->a(Ljava/lang/Long;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cbs;->d:Landroid/content/Context;

    const-string v1, "simplemotionbuffer.txt"

    const-string v2, "simplemotion.txt"

    .line 154
    invoke-static {v0, v1, v2}, Lo/cdy;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lo/cbs;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v4

    .line 156
    invoke-virtual {v4}, Lo/cbu;->al()V

    .line 157
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/cbu;->a(Z)Lo/cew;

    .line 171
    iget-object v0, p0, Lo/cbs;->k:Lo/cfd;

    invoke-virtual {v4, v0}, Lo/cbu;->d(Lo/cfd;)V

    .line 172
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryAutoTrakSnapshotInfo success recoveryMotionPathFile:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/cbs;->a:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " copySimpleFile: SIMPLE_MOTION_FILE_NAME_BUFFER"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 176
    :cond_0
    goto :goto_0

    .line 174
    :catch_0
    move-exception v4

    .line 175
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryAutoTrakSnapshotInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 180
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-direct {p0}, Lo/cbs;->f()V

    .line 182
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbs;->d:Landroid/content/Context;

    .line 183
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->o:I

    .line 184
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->i:F

    .line 185
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->g:I

    .line 186
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->h:I

    .line 187
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cbs;->f:J

    .line 188
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 60
    iput-boolean p1, p0, Lo/cbs;->c:Z

    .line 61
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 57
    iput-boolean p1, p0, Lo/cbs;->b:Z

    .line 58
    return-void
.end method

.method public c()Z
    .locals 4

    .line 103
    iget-boolean v0, p0, Lo/cbs;->e:Z

    if-eqz v0, :cond_1

    .line 104
    iget-wide v0, p0, Lo/cbs;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 105
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "needSaveAutoTrack(), mMotionTrackFileLine is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v0, 0x0

    return v0

    .line 109
    :cond_0
    invoke-direct {p0}, Lo/cbs;->k()V

    .line 110
    const/4 v0, 0x1

    return v0

    .line 113
    :cond_1
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recoveryAutoTrakSnapshotInfo() mEndSnapshot is false,"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 1

    .line 118
    iget-boolean v0, p0, Lo/cbs;->b:Z

    if-eqz v0, :cond_0

    .line 119
    invoke-direct {p0}, Lo/cbs;->i()V

    .line 121
    :cond_0
    return-void
.end method

.method public d(FI)Z
    .locals 6

    .line 264
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 265
    iget-wide v0, p0, Lo/cbs;->f:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x7530

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 266
    iget v0, p0, Lo/cbs;->i:F

    sub-float v0, p1, v0

    const/high16 v1, 0x42480000    # 50.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 267
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->g:I

    goto :goto_0

    .line 269
    :cond_0
    iget v0, p0, Lo/cbs;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cbs;->g:I

    .line 272
    :goto_0
    iget-boolean v0, p0, Lo/cbs;->l:Z

    if-eqz v0, :cond_2

    .line 273
    iget v0, p0, Lo/cbs;->o:I

    sub-int v0, p2, v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_1

    .line 274
    const/4 v0, 0x0

    iput v0, p0, Lo/cbs;->h:I

    goto :goto_1

    .line 276
    :cond_1
    iget v0, p0, Lo/cbs;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cbs;->h:I

    .line 280
    :cond_2
    :goto_1
    iput p1, p0, Lo/cbs;->i:F

    .line 281
    iput p2, p0, Lo/cbs;->o:I

    .line 282
    iput-wide v4, p0, Lo/cbs;->f:J

    .line 283
    const-string v0, "Track_AutoTrackManager"

    const/16 v1, 0xa

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isStopAutoTrack(), distance: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " mTimesForLostGpsDistance: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/cbs;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " Time: "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/cbs;->f:J

    .line 284
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " , mLowSteps: "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    iget v2, p0, Lo/cbs;->o:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " mTimesForLowSteps: "

    const/16 v3, 0x8

    aput-object v2, v1, v3

    iget v2, p0, Lo/cbs;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    .line 283
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    :cond_3
    iget v0, p0, Lo/cbs;->g:I

    const/4 v1, 0x4

    if-ge v0, v1, :cond_4

    iget v0, p0, Lo/cbs;->h:I

    const/4 v1, 0x6

    if-lt v0, v1, :cond_5

    :cond_4
    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method public e(ZJJF)V
    .locals 8

    .line 192
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendNotification, toSaveData: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ; mEndSnapshot: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/cbs;->e:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget-boolean v0, p0, Lo/cbs;->e:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 194
    iget-object v0, p0, Lo/cbs;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_msg_switch_noticebar"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 196
    const-string v0, "Track_AutoTrackManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showNotification() noticebarRecommend"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 198
    move-object v0, p0

    iget-object v1, p0, Lo/cbs;->d:Landroid/content/Context;

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lo/cbs;->d(Landroid/content/Context;JJF)V

    .line 201
    :cond_0
    return-void
.end method

.method public e()Z
    .locals 1

    .line 66
    iget-boolean v0, p0, Lo/cbs;->e:Z

    return v0
.end method

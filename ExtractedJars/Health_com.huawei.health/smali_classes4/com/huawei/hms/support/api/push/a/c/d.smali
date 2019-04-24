.class public Lcom/huawei/hms/support/api/push/a/c/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    sput v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;III)Landroid/app/Notification;
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    .line 177
    new-instance v2, Landroid/app/Notification$Builder;

    invoke-direct {v2, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 178
    invoke-static {p0, v2, p1}, Lcom/huawei/hms/support/api/push/a/c/b;->a(Landroid/content/Context;Landroid/app/Notification$Builder;Lcom/huawei/hms/support/api/push/a/b/a;)V

    .line 179
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v3, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 180
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 182
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 183
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 185
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->n()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    goto :goto_0

    .line 188
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 191
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 193
    invoke-static {p0, p1, p2, p3, p4}, Lcom/huawei/hms/support/api/push/a/c/d;->a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;II)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 194
    invoke-static {p0, p1, p2, p3, p5}, Lcom/huawei/hms/support/api/push/a/c/d;->b(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;II)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 195
    invoke-static {p0, p1}, Lcom/huawei/hms/support/api/push/a/c/b;->b(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 196
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 197
    invoke-virtual {v2, v4}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 200
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_3

    .line 201
    const-string v0, "HwPushChannelID"

    invoke-virtual {v2, v0}, Landroid/app/Notification$Builder;->setChannelId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 204
    :cond_3
    invoke-static {p0, v2, p1}, Lcom/huawei/hms/support/api/push/a/c/d;->a(Landroid/content/Context;Landroid/app/Notification$Builder;Lcom/huawei/hms/support/api/push/a/b/a;)V

    .line 205
    invoke-static {p0, v2, p1}, Lcom/huawei/hms/support/api/push/a/c/d;->b(Landroid/content/Context;Landroid/app/Notification$Builder;Lcom/huawei/hms/support/api/push/a/b/a;)V

    .line 207
    invoke-static {p0, v2, p3, p1, v4}, Lcom/huawei/hms/support/api/push/a/c/f;->a(Landroid/content/Context;Landroid/app/Notification$Builder;ILcom/huawei/hms/support/api/push/a/b/a;Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v5

    .line 208
    const/4 v0, 0x0

    if-ne v0, v5, :cond_4

    .line 209
    const-string v0, "PushSelfShowLog"

    const-string v1, "builder is null after add style."

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    const/4 v0, 0x0

    return-object v0

    .line 212
    :cond_4
    invoke-virtual {v2}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;II)Landroid/app/PendingIntent;
    .locals 5

    .line 129
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.intent.action.PUSH"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 131
    const-string v0, "selfshow_info"

    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->c()[B

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_token"

    .line 132
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->d()[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_event_id"

    const-string v2, "1"

    .line 133
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "extra_encrypt_data"

    .line 134
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_notify_id"

    .line 135
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    .line 136
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 138
    const/high16 v0, 0x8000000

    invoke-static {p0, p4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 141
    return-object v4
.end method

.method private static a(Landroid/content/Context;Landroid/app/Notification$Builder;Lcom/huawei/hms/support/api/push/a/b/a;)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 217
    const-string v0, "com.huawei.android.pushagent"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 220
    invoke-virtual {p2}, Lcom/huawei/hms/support/api/push/a/b/a;->i()Ljava/lang/String;

    move-result-object v3

    .line 221
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 222
    const-string v0, "hw_origin_sender_package_name"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    invoke-virtual {p1, v2}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 226
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;JI)V
    .locals 5

    .line 267
    const-string v0, "PushSelfShowLog"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enter setDelayAlarm(intent:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Intent;->toURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " interval:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ms, context:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/app/AlarmManager;

    .line 272
    const/high16 v0, 0x8000000

    invoke-static {p0, p4, p1, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 275
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    add-long/2addr v0, p2

    const/4 v2, 0x0

    invoke-virtual {v3, v2, v0, v1, v4}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 280
    goto :goto_0

    .line 276
    :catch_0
    move-exception v3

    .line 277
    const-string v0, "PushSelfShowLog"

    const-string v1, "set DelayAlarm error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    goto :goto_0

    .line 278
    :catch_1
    move-exception v3

    .line 279
    const-string v0, "PushSelfShowLog"

    const-string v1, "set DelayAlarm error"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    :goto_0
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;)V
    .locals 16
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    const-class v15, Lcom/huawei/hms/support/api/push/a/c/d;

    monitor-enter v15

    .line 51
    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 52
    :cond_0
    monitor-exit v15

    return-void

    .line 55
    :cond_1
    const-string v0, "PushSelfShowLog"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " showNotification , the msg id = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hms/support/api/push/a/b/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    const/4 v0, 0x2

    const/16 v1, 0xb4

    invoke-static {v0, v1}, Lcom/huawei/hms/support/api/push/a/d/a;->a(II)I

    .line 60
    sget v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sput v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    .line 68
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hms/support/api/push/a/b/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 69
    sget v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    add-int/lit8 v6, v0, 0x1

    sput v6, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    .line 70
    sget v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    add-int/lit8 v7, v0, 0x1

    sput v7, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    .line 71
    sget v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    add-int/lit8 v8, v0, 0x1

    sput v8, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    .line 72
    sget v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    add-int/lit8 v9, v0, 0x1

    sput v9, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    goto :goto_0

    .line 74
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hms/support/api/push/a/b/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hms/support/api/push/a/b/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    .line 75
    sget v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    add-int/lit8 v7, v0, 0x1

    sput v7, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    .line 76
    sget v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    add-int/lit8 v8, v0, 0x1

    sput v8, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    .line 77
    sget v0, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    add-int/lit8 v9, v0, 0x1

    sput v9, Lcom/huawei/hms/support/api/push/a/c/d;->a:I

    .line 80
    :goto_0
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notifyId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",openNotifyId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",delNotifyId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",alarmNotifyId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const/4 v10, 0x0

    .line 85
    invoke-static {}, Lcom/huawei/hms/support/api/push/a/d/a;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 86
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v3, v6

    move v4, v7

    move v5, v8

    invoke-static/range {v0 .. v5}, Lcom/huawei/hms/support/api/push/a/c/d;->a(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;III)Landroid/app/Notification;

    move-result-object v10

    .line 89
    :cond_4
    const-string v0, "notification"

    .line 90
    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/app/NotificationManager;

    .line 92
    if-eqz v11, :cond_7

    if-eqz v10, :cond_7

    .line 94
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_5

    .line 95
    const-string v0, "hms_push_channel"

    invoke-static {v0}, Lcom/huawei/hms/c/h;->d(Ljava/lang/String;)I

    move-result v12

    .line 96
    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 97
    new-instance v14, Landroid/app/NotificationChannel;

    const-string v0, "HwPushChannelID"

    const/4 v1, 0x3

    invoke-direct {v14, v0, v13, v1}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 99
    invoke-virtual {v11, v14}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 102
    :cond_5
    invoke-virtual {v11, v6, v10}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 105
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hms/support/api/push/a/b/a;->f()I

    move-result v0

    if-lez v0, :cond_6

    .line 107
    new-instance v12, Landroid/content/Intent;

    const-string v0, "com.huawei.intent.action.PUSH"

    invoke-direct {v12, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 108
    const-string v0, "selfshow_info"

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hms/support/api/push/a/b/a;->c()[B

    move-result-object v1

    invoke-virtual {v12, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_token"

    .line 109
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hms/support/api/push/a/b/a;->d()[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_event_id"

    const-string v2, "-1"

    .line 110
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "extra_encrypt_data"

    .line 112
    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_notify_id"

    .line 113
    invoke-virtual {v0, v1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    .line 114
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 116
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hms/support/api/push/a/b/a;->f()I

    move-result v0

    int-to-long v0, v0

    move-object/from16 v2, p0

    invoke-static {v2, v12, v0, v1, v9}, Lcom/huawei/hms/support/api/push/a/c/d;->a(Landroid/content/Context;Landroid/content/Intent;JI)V

    .line 118
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setDelayAlarm alarmNotityId"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " and intent is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v12}, Landroid/content/Intent;->toURI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_6
    const-string v0, "0"

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-static {v1, v0, v2, v6}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/hms/support/api/push/a/b/a;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    :cond_7
    monitor-exit v15

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v15

    throw p0
.end method

.method private static b(Landroid/content/Context;Lcom/huawei/hms/support/api/push/a/b/a;Ljava/lang/String;II)Landroid/app/PendingIntent;
    .locals 5

    .line 147
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.huawei.intent.action.PUSH"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 149
    const-string v0, "selfshow_info"

    .line 150
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->c()[B

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_token"

    .line 151
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/push/a/b/a;->d()[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_event_id"

    const-string v2, "2"

    .line 152
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "selfshow_notify_id"

    .line 153
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    .line 154
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "extra_encrypt_data"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 155
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 157
    const/high16 v0, 0x8000000

    invoke-static {p0, p4, v3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 159
    return-object v4
.end method

.method private static b(Landroid/content/Context;Landroid/app/Notification$Builder;Lcom/huawei/hms/support/api/push/a/b/a;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 233
    invoke-static {}, Lcom/huawei/hms/support/api/push/b/a/a/a;->a()I

    move-result v0

    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Lcom/huawei/hms/support/api/push/a/d/a;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 235
    invoke-virtual {p2}, Lcom/huawei/hms/support/api/push/a/b/a;->i()Ljava/lang/String;

    move-result-object v4

    .line 236
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the package name of notification is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    invoke-static {p0, v4}, Lcom/huawei/hms/support/api/push/a/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 241
    const-string v0, "PushSelfShowLog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "the app name is:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    if-eqz v5, :cond_0

    .line 244
    const-string v0, "android.extraAppName"

    invoke-virtual {v3, v0, v5}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 248
    :cond_0
    invoke-virtual {p1, v3}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 250
    :cond_1
    return-void
.end method

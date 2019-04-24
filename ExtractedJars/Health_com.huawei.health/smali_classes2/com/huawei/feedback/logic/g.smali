.class public final Lcom/huawei/feedback/logic/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x4

.field public static final d:I = 0x5

.field public static final e:I = 0x6

.field public static final f:I = 0x3e9

.field public static final g:I = 0x3ea

.field public static final h:I = 0x3eb

.field public static final i:I = 0x3ec

.field public static final j:I = 0x3ed

.field public static final k:I = 0x3ee

.field public static final l:I = 0x3ef


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    return-void
.end method

.method public static a()Landroid/app/NotificationManager;
    .locals 3

    .line 264
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    .line 265
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/NotificationManager;

    .line 267
    const/16 v0, 0x3e9

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 268
    const/16 v0, 0x3ea

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 269
    const/16 v0, 0x3eb

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 270
    const/16 v0, 0x3ec

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 271
    const/16 v0, 0x3ed

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 272
    const/16 v0, 0x3ee

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 273
    const/16 v0, 0x3ef

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 274
    return-object v2
.end method

.method public static a(Landroid/content/Context;ILandroid/app/PendingIntent;)V
    .locals 8

    .line 137
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 140
    :pswitch_0
    const-string v0, "feedback_sending_your_feedback"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 141
    const-string v0, "feedback_sending"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 142
    const/16 v4, 0x3e9

    .line 143
    goto :goto_1

    .line 147
    :pswitch_1
    const-string v0, "feedback_send_withlog_successfully"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 148
    const-string v0, "feedback_success"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 149
    const/16 v4, 0x3ea

    .line 174
    goto :goto_1

    .line 178
    :pswitch_2
    const-string v0, "feedback_send_nolog_successfully"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 179
    const-string v0, "feedback_success"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 180
    const/16 v4, 0x3ef

    .line 181
    goto :goto_1

    .line 225
    :pswitch_3
    const-string v0, "feedback_send__feedback_failed"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 226
    const-string v0, "feedback_send_failed"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 227
    const/16 v4, 0x3ed

    .line 228
    goto :goto_1

    .line 232
    :pswitch_4
    const-string v0, "feedback_send_nolog_successfully"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 233
    const-string v0, "feedback_success"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->f(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    .line 234
    const/16 v4, 0x3ee

    .line 235
    goto :goto_1

    .line 238
    :goto_0
    :pswitch_5
    return-void

    .line 241
    :goto_1
    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "feedback_dialog_title"

    .line 242
    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 243
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 244
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v6

    .line 248
    iget v0, v6, Landroid/app/Notification;->flags:I

    or-int/lit8 v0, v0, 0x10

    iput v0, v6, Landroid/app/Notification;->flags:I

    .line 257
    invoke-static {}, Lcom/huawei/feedback/logic/g;->a()Landroid/app/NotificationManager;

    move-result-object v7

    .line 260
    invoke-virtual {v7, v4, v6}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 261
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_4
        :pswitch_2
    .end packed-switch
.end method

.method public static a(Landroid/content/Context;ILandroid/content/ContentValues;)V
    .locals 4

    .line 82
    const/4 v2, 0x0

    .line 93
    const/4 v0, 0x1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x6

    if-ne v0, p1, :cond_1

    .line 96
    :cond_0
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 97
    const/high16 v0, 0x14000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_0

    .line 99
    :cond_1
    const/4 v0, 0x4

    if-ne v0, p1, :cond_3

    .line 101
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 103
    if-eqz p2, :cond_2

    .line 105
    const-string v0, "pQuestionId"

    invoke-virtual {p2, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 106
    const-string v0, "pQuestionId"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 108
    :cond_2
    const/high16 v0, 0x14000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_0

    .line 110
    :cond_3
    const/4 v0, 0x5

    if-ne v0, p1, :cond_5

    .line 112
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 114
    if-eqz p2, :cond_4

    .line 116
    const-string v0, "pQuestionId"

    invoke-virtual {p2, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 117
    const-string v0, "pQuestionId"

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 119
    :cond_4
    const/high16 v0, 0x14000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 124
    :cond_5
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_6

    .line 127
    const/4 v0, 0x0

    const/high16 v1, 0x8000000

    invoke-static {p0, v0, v2, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 129
    invoke-static {p0, p1, v3}, Lcom/huawei/feedback/logic/g;->a(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 131
    :cond_6
    return-void
.end method

.method public static b()V
    .locals 3

    .line 278
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    .line 279
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/NotificationManager;

    .line 280
    const/16 v0, 0x3ea

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 281
    const/16 v0, 0x3ef

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 282
    return-void
.end method

.method public static c()V
    .locals 3

    .line 285
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    .line 286
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/NotificationManager;

    .line 287
    const/16 v0, 0x3ed

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 288
    const/16 v0, 0x3ee

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 289
    return-void
.end method

.method public static d()V
    .locals 3

    .line 292
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "notification"

    .line 293
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/NotificationManager;

    .line 294
    const/16 v0, 0x3eb

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 295
    const/16 v0, 0x3ec

    invoke-virtual {v2, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 296
    return-void
.end method

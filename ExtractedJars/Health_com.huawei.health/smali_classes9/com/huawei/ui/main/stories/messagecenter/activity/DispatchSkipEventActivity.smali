.class public Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# static fields
.field private static final ACTIVITY_ID:Ljava/lang/String; = "activityId"

.field private static final BROWSER:Ljava/lang/String; = "BROWSER"

.field private static final DATA_SHARE_EXPIRED_MESSAGE:Ljava/lang/String; = "dataShare"

.field private static final DETAIL_URI:Ljava/lang/String; = "detailUri"

.field private static final EXTRA_MAX_REPORT_NO:Ljava/lang/String; = "max_report_no"

.field private static final EXTRA_MIN_REPORT_NO:Ljava/lang/String; = "min_report_no"

.field private static final EXTRA_REPORT_STYPE:Ljava/lang/String; = "report_stype"

.field private static final HEALTH_APP_PACKAGE:Ljava/lang/String; = "com.huawei.health"

.field private static final HISTORY_BEST_MESSAGE:Ljava/lang/String; = "historyBestMessage"

.field private static final HTTP:Ljava/lang/String; = "http"

.field private static final HTTPS:Ljava/lang/String; = "https"

.field private static final IS_PUSH_NOTIFICATION:Ljava/lang/String; = "isPushNotification"

.field private static final KA_KA_MESSAGE:Ljava/lang/String; = "kakaMessage"

.field private static final MSG_ID:Ljava/lang/String; = "msgId"

.field private static final NATIVE_DEVICE:Ljava/lang/String; = "nativeDevice"

.field private static final NOTIFI_URI:Ljava/lang/String; = "notifiUri"

.field private static final OPEN_STYLE:Ljava/lang/String; = "OPEN_STYLE"

.field private static final PUSH_NOTIFI_INTENT:Ljava/lang/String; = "pushNotificationIntent"

.field private static final SCHEME_MESSAGE_CENTER:Ljava/lang/String; = "messagecenter"

.field private static final TAG:Ljava/lang/String; = "UIDV_DispatchSkipEventActivity"

.field private static final WEB_URL:Ljava/lang/String; = "webUrl"

.field private static final WEEK_MONTH_REPORT:Ljava/lang/String; = "sportReport"

.field private static final WEEK_MONTH_REPORT_URI:Ljava/lang/String; = "weekMonthReportUri"


# instance fields
.field private msgId:Ljava/lang/String;

.field private notifi_uri:Ljava/lang/String;

.field private openStyle:Ljava/lang/String;

.field private showTime:Ljava/lang/String;

.field private source:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private handleDetailUri(Ljava/lang/String;)V
    .locals 12

    .line 132
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 133
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 134
    return-void

    .line 137
    :cond_0
    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v5

    .line 138
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 139
    return-void

    .line 142
    :cond_1
    invoke-virtual {v4}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v6

    .line 143
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 144
    return-void

    .line 147
    :cond_2
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleDetailUri scheme = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->notifi_uri:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 150
    invoke-direct {p0, v5, v6}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->setNotifiBIAnalyticsEvent(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    :cond_3
    invoke-direct {p0, v5, p1}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->webJump(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    invoke-direct {p0, v6, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->otherJump(Ljava/lang/String;Landroid/net/Uri;)V

    .line 159
    const-string v0, "nativeDevice"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 160
    const-string v0, "action"

    invoke-virtual {v4, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 161
    const-string v0, "arg1"

    invoke-virtual {v4, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 162
    const-string v0, "arg2"

    invoke-virtual {v4, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 163
    new-instance v10, Landroid/content/Intent;

    invoke-direct {v10}, Landroid/content/Intent;-><init>()V

    .line 164
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 165
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    const-string v0, ""

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 166
    invoke-virtual {v10, v7}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 168
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    const-string v0, ""

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 169
    const-string v0, "arg1"

    invoke-virtual {v11, v0, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v9, :cond_6

    const-string v0, ""

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 172
    const-string v0, "arg2"

    invoke-virtual {v11, v0, v9}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    :cond_6
    const-string v0, "SWITCH_PLUGINDEVICE"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 175
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "goto device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const-string v0, "com.huaei.health"

    invoke-virtual {v10, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v10, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    invoke-virtual {v10, v11}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 179
    invoke-virtual {p0, v10}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 181
    :cond_7
    return-void

    .line 183
    :cond_8
    return-void
.end method

.method private otherJump(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 10

    .line 267
    const-string v0, "kakaMessage"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/dth;->e(Landroid/content/Context;)V

    .line 269
    return-void

    .line 272
    :cond_0
    const-string v0, "historyBestMessage"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/dth;->h(Landroid/content/Context;)V

    .line 274
    return-void

    .line 278
    :cond_1
    const-string v0, "dataShare"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 279
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.ui.thirdpartservice.activity.ThirdPartServiceActivity"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 280
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 284
    :cond_2
    const-string v0, "sportReport"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 285
    invoke-static {p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v4

    .line 286
    invoke-virtual {v4}, Lo/dth;->d()Lo/dti;

    move-result-object v5

    .line 288
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v6

    .line 289
    invoke-virtual {v6}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_3

    .line 290
    const/4 v0, 0x0

    invoke-direct {p0, p0, v0, p2}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startHealthApp(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V

    .line 291
    return-void

    .line 294
    :cond_3
    if-nez v5, :cond_4

    .line 295
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginAchieveAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    const/4 v0, 0x0

    invoke-direct {p0, p0, v0, p2}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startHealthApp(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    .line 299
    :cond_4
    const-string v0, "max_report_no"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 300
    const-string v0, "min_report_no"

    invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 301
    const-string v0, "report_stype"

    invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    .line 302
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleDetailUri==>max-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":min-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":reportType-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0, p0, v8, v7, v9}, Lo/dth;->d(Landroid/content/Context;III)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    goto :goto_0

    .line 305
    :catch_0
    move-exception v7

    .line 306
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    :goto_0
    return-void

    .line 314
    :cond_5
    const-string v0, "nps_question"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 315
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 316
    const-class v0, Lcom/huawei/ui/main/stories/nps/activity/QuestionMainActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 317
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 318
    return-void

    .line 322
    :cond_6
    const-string v0, "device_guide"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 323
    invoke-static {}, Lo/etu;->b()Lo/etu;

    move-result-object v4

    .line 324
    const/4 v0, 0x0

    if-eq v0, v4, :cond_7

    .line 325
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 326
    const-class v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {v5, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 327
    const-string v0, "url"

    invoke-virtual {v4, p0}, Lo/etu;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 328
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 329
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 331
    :cond_7
    return-void

    .line 335
    :cond_8
    const-string v0, "aw70_device_guide"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 336
    invoke-static {}, Lo/etu;->b()Lo/etu;

    move-result-object v4

    .line 337
    const/4 v0, 0x0

    if-eq v0, v4, :cond_9

    .line 338
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 339
    const-class v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-virtual {v5, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 340
    const-string v0, "key"

    invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 341
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleDetailUri productType "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    const-string v0, "url"

    :try_start_1
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v1, p0}, Lo/etu;->b(ILandroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 344
    const-string v0, "WebViewActivity.JUMP_MODE_KEY"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 345
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 348
    goto :goto_1

    .line 346
    :catch_1
    move-exception v7

    .line 347
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleDetailUri NumberFormatException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    :cond_9
    :goto_1
    return-void

    .line 354
    :cond_a
    const-string v0, "device_app_update_health"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 355
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 356
    const-class v0, Lcom/huawei/ui/main/stories/about/activity/update/AppUpdateDialogActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 357
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start AppUpdateDialogActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 359
    return-void

    .line 363
    :cond_b
    const-string v0, "device_ota"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 364
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 365
    const-string v0, "device_id"

    const-string v1, "key"

    invoke-virtual {p2, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 366
    const-string v0, "com.huawei.ui.device.activity.update.UpdateVersionActivity"

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 367
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 368
    return-void

    .line 372
    :cond_c
    const-string v0, "device_ota1"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 373
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 374
    const-string v0, "device_id"

    const-string v1, "key"

    invoke-virtual {p2, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 375
    const-string v0, "com.huawei.ui.device.activity.update.UpdateVersionActivity"

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 376
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 377
    return-void

    .line 381
    :cond_d
    const-string v0, "device_scale_ota"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 382
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 383
    const-string v0, "productId"

    const-string v1, "key"

    invoke-virtual {p2, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 384
    const-string v0, "com.huawei.ui.device.activity.update.WeightUpdateVersionActivity"

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 385
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 386
    return-void

    .line 391
    :cond_e
    const-string v0, "HuaweiCloudServiceActivity"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 392
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 393
    const-class v0, Lcom/huawei/ui/main/stories/about/activity/cloudservice/HuaweiCloudServiceActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 394
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 395
    return-void

    .line 399
    :cond_f
    const-string v0, "special_person_setting"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 400
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 401
    const-class v0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 402
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 403
    return-void

    .line 407
    :cond_10
    const-string v0, "userinfo_weight"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 408
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 409
    const-class v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BaseHealthDataActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 410
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 411
    const-string v0, "weight_user_id"

    const-string v1, "key"

    invoke-virtual {p2, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 412
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 413
    return-void

    .line 417
    :cond_11
    const-string v0, "claim_weight"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 418
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 419
    const-class v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 420
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 421
    return-void

    .line 424
    :cond_12
    return-void
.end method

.method private setNotifiBIAnalyticsEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 431
    sget-object v0, Lo/dae;->gX:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v4

    .line 432
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 433
    const-string v0, "click"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->notifi_uri:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 435
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 436
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 437
    return-void

    .line 439
    :cond_1
    const-string v0, "activityId"

    invoke-virtual {v6, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 440
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 441
    const-string v7, "noActivity"

    .line 443
    :cond_2
    const-string v0, "type"

    invoke-interface {v5, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    goto/16 :goto_1

    :cond_3
    const-string v0, "messagecenter"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 446
    const-string v0, "sportReport"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 447
    const-string v0, "report_stype"

    invoke-virtual {v6, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 448
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    const-string v0, "1"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 449
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 450
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 451
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 453
    :cond_5
    const-string v0, "type"

    const-string v1, "WEEK_MONTH_REPORT"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 457
    :cond_6
    :goto_0
    const-string v0, "kakaMessage"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 458
    const-string v0, "type"

    const-string v1, "3"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    :cond_7
    const-string v0, "historyBestMessage"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 462
    const-string v0, "type"

    const-string v1, "4"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    :cond_8
    :goto_1
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNotifiBIAnalyticsEvent type = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "type"

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 467
    return-void
.end method

.method private startHealthApp(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V
    .locals 7

    .line 241
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 242
    if-eqz p1, :cond_0

    .line 243
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 245
    const-string v0, "com.huawei.health"

    :try_start_0
    invoke-virtual {v5, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    .line 246
    new-instance v0, Landroid/content/ComponentName;

    const-string v1, "com.huawei.health"

    invoke-virtual {v6}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 247
    const-string v0, "android.intent.action.MAIN"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 248
    const-string v0, "android.intent.category.LAUNCHER"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 249
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 250
    const-string v0, "webUrl"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 251
    const-string v0, "weekMonthReportUri"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 253
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 256
    goto :goto_0

    .line 254
    :catch_0
    move-exception v6

    .line 255
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthAPPIntent()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    :cond_0
    :goto_0
    return-void
.end method

.method private webJump(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 190
    const-string v0, "http"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->openStyle:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, "BROWSER"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->openStyle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 192
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 193
    new-instance v5, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v5, v0, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 194
    invoke-virtual {p0, v5}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 195
    goto/16 :goto_1

    .line 196
    :cond_1
    invoke-static {p0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v4

    .line 197
    invoke-virtual {v4}, Lcom/huawei/operation/operation/PluginOperation;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/operation/adapter/PluginOperationAdapter;

    .line 199
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v6

    .line 201
    invoke-virtual {v6}, Lcom/huawei/login/ui/login/LoginInit;->getIsLogined()Z

    move-result v0

    if-nez v0, :cond_2

    .line 202
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not login!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x0

    invoke-direct {p0, p0, p2, v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startHealthApp(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V

    .line 204
    return-void

    .line 206
    :cond_2
    if-eqz v5, :cond_4

    .line 207
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter ready jump to h5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const-string v0, "pushNotificationIntent"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    .line 209
    const-string v0, "isPushNotification"

    const/4 v1, 0x1

    invoke-interface {v7, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 210
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 212
    const-string v8, "SHOW_TIME_BI"

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->showTime:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 214
    new-instance v9, Landroid/content/Intent;

    const-class v0, Lcom/huawei/operation/activity/WebViewActivity;

    invoke-direct {v9, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 215
    const-string v0, "url"

    invoke-virtual {v9, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 216
    const-string v0, "EXTRA_BI_ID"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->msgId:Ljava/lang/String;

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 217
    const-string v0, "EXTRA_BI_NAME"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->title:Ljava/lang/String;

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 218
    const-string v0, "EXTRA_BI_SOURCE"

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->source:Ljava/lang/String;

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 219
    const-string v0, "EXTRA_BI_SHOWTIME"

    const-string v1, "SHOW_TIME_BI"

    invoke-virtual {v9, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 220
    invoke-virtual {p0, v9}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 221
    goto :goto_0

    .line 222
    :cond_3
    invoke-virtual {v4, p2}, Lcom/huawei/operation/operation/PluginOperation;->startOperationWebPage(Ljava/lang/String;)V

    .line 225
    :goto_0
    return-void

    .line 229
    :cond_4
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adaper not ready, jump to main."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    const/4 v0, 0x0

    invoke-direct {p0, p0, p2, v0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->startHealthApp(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V

    .line 233
    :goto_1
    return-void

    .line 235
    :cond_5
    const-string v0, "messagecenter"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 236
    return-void

    .line 238
    :cond_6
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 91
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 92
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 93
    if-nez v4, :cond_0

    .line 94
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->finish()V

    .line 95
    return-void

    .line 97
    :cond_0
    const-string v0, "msgId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->msgId:Ljava/lang/String;

    .line 98
    const-string v0, "detailUri"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 99
    const-string v0, "notifiUri"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->notifi_uri:Ljava/lang/String;

    .line 100
    const-string v0, "EXTRA_BI_NAME"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->title:Ljava/lang/String;

    .line 101
    const-string v0, "EXTRA_BI_SOURCE"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->source:Ljava/lang/String;

    .line 102
    const-string v0, "EXTRA_BI_SHOWTIME"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->showTime:Ljava/lang/String;

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->notifi_uri:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 104
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is notifi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 107
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is notifi isNoCloudVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->finish()V

    .line 109
    return-void

    .line 114
    :cond_1
    const-string v0, "OPEN_STYLE"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->openStyle:Ljava/lang/String;

    .line 115
    iget-object v0, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->msgId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 116
    :cond_2
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msgId or detailUri is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->finish()V

    .line 118
    return-void

    .line 120
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->msgId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eaa;->c(Ljava/lang/String;)Z

    .line 121
    const-string v0, "UIDV_DispatchSkipEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate detailUri==============="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  msgId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->msgId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->handleDetailUri(Ljava/lang/String;)V

    .line 123
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/messagecenter/activity/DispatchSkipEventActivity;->finish()V

    .line 124
    return-void
.end method

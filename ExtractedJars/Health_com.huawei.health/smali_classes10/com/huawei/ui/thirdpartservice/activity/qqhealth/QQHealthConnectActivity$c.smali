.class Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V
    .locals 1

    .line 223
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 224
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->c:Ljava/lang/ref/WeakReference;

    .line 225
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 229
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;

    .line 230
    if-nez v4, :cond_0

    .line 231
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 232
    return-void

    .line 234
    :cond_0
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage msg is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 238
    :pswitch_0
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage() msg.what=MSG_LOGIN_GET_USER_INFO"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V

    .line 241
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserName"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    new-instance v0, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;

    invoke-direct {v0, p0, v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$3;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V

    invoke-virtual {v4, v0}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lo/cyx;)V

    .line 259
    goto/16 :goto_1

    .line 263
    :pswitch_1
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage() msg.what = MSG_LOGIN_HWCLOUD"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    new-instance v5, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;-><init>(Landroid/content/Context;)V

    .line 266
    invoke-virtual {v5}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;->get()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;

    move-result-object v6

    .line 267
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 268
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessage() qqHealthTable="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 270
    :cond_1
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage() qqHealthTable is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->d(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 273
    goto/16 :goto_1

    .line 276
    :goto_0
    new-instance v7, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;

    invoke-direct {v7}, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;-><init>()V

    .line 278
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v8

    .line 279
    const-wide/16 v9, 0x0

    .line 280
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 281
    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    .line 283
    :cond_2
    invoke-virtual {v7, v9, v10}, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->setHuid(J)V

    .line 284
    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getOpenId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->setThirdAccount(Ljava/lang/String;)V

    .line 285
    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->setThirdAccessToken(Ljava/lang/String;)V

    .line 286
    const/4 v0, 0x7

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->setType(I)V

    .line 287
    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getExpiresIn()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 288
    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getExpiresIn()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->setExpireTime(I)V

    .line 291
    :cond_3
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set thirdUserToken() huid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set thirdUserToken() ThirdAccount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getOpenId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set thirdUserToken() ThirdAccessToken="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set thirdUserToken() expireTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getExpiresIn()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->b(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;

    invoke-direct {v1, p0, v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c$2;-><init>(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity$c;Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V

    invoke-virtual {v0, v7, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQHealthInteractors;->authorize(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;Lo/cyx;)V

    .line 314
    goto :goto_1

    .line 318
    :pswitch_2
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage() msg.what = MSG_LOGIN_CONNECT_FINISH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V

    .line 320
    new-instance v11, Landroid/content/Intent;

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthActivity;

    invoke-direct {v11, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 321
    invoke-virtual {v4, v11}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->startActivity(Landroid/content/Intent;)V

    .line 322
    invoke-virtual {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->finish()V

    .line 323
    goto :goto_1

    .line 326
    :pswitch_3
    const-string v0, "QQHealthConnectActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage() msg.what=MSG_LOGIN_HUAWEI_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->a(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)V

    .line 328
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/qqhealth/QQHealthConnectActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_eu_login_failure:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 329
    .line 334
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

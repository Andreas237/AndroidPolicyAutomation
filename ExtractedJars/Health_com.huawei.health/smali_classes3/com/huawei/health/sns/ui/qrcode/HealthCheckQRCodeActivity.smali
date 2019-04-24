.class public Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;
.super Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:Lo/bio;

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Landroid/os/Handler;

.field private g:Lo/aoo;

.field private h:Landroid/content/Context;

.field private i:J

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;-><init>()V

    .line 88
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e:Z

    .line 98
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->d:Ljava/lang/String;

    .line 174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->k:Z

    .line 186
    new-instance v0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$a;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->f:Landroid/os/Handler;

    .line 649
    new-instance v0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$3;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->g:Lo/aoo;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/os/Handler;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->f:Landroid/os/Handler;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 609
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleSNSQRCode in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 611
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleSNSQRCode hasLoginAccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c()V

    goto :goto_0

    .line 615
    :cond_0
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleSNSQRCode hasLoginAccount in else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 617
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->g:Lo/aoo;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, p0, v1, v2, v3}, Lo/aor;->c(Landroid/app/Activity;Lo/aoo;ZZ)V

    .line 619
    :goto_0
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 561
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showErrorToast start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    invoke-static {p0, p1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 563
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->finish()V

    .line 564
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 6

    .line 314
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 316
    if-nez v4, :cond_0

    .line 317
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData bundle == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    return-void

    .line 322
    :cond_0
    const-string v0, "qrcode_intent_key"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 323
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData QrcodeConstant.QRCODE_INTENT_KEY_BASEINFO"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    const-string v0, "qrcode_intent_key"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    .line 325
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e:Z

    .line 327
    const-string v0, "intent_external_value"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 329
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Ljava/lang/String;)V

    .line 330
    goto/16 :goto_0

    .line 331
    :cond_1
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData QrcodeConstant.QRCODE_INTENT_KEY_BASEINFO in else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e:Z

    .line 334
    const-string v0, "from_account"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 335
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData QrcodeConstant.QRCODE_INTENT_KEY_BASEINFO in else FROM_ACCOUNT_CENTER"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    const-string v0, "from_account"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->k:Z

    .line 338
    :cond_2
    const-string v0, "QRCode_errContent"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 339
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData QrcodeConstant.QRCODE_INTENT_KEY_BASEINFO in else BUNDLE_KEY_ERR_CONTENT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    const-string v0, "QRCode_errContent"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    .line 343
    :cond_3
    const-string v0, "QRCode_Identify"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 344
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData QrcodeConstant.QRCODE_INTENT_KEY_BASEINFO in else BUNDLE_KEY_IDENTIFY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    const-string v0, "QRCode_Identify"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->d:Ljava/lang/String;

    .line 348
    :cond_4
    const-string v0, "groupId"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 349
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIntentData QrcodeConstant.QRCODE_INTENT_KEY_BASEINFO in else BUNDLE_KEY_GROUP_ID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    const-string v0, "groupId"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b:J

    .line 355
    :cond_5
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->d()V

    .line 356
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;Landroid/content/Intent;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;[J)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c([J)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .line 411
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseExternalValue start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 414
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseExternalValue TextUtils.isEmpty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    return-void

    .line 419
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 420
    const-string v0, "sns_groupId"

    const-wide/16 v1, 0x0

    invoke-virtual {v4, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b:J

    .line 422
    const-string v0, "sns_type"

    const-string v1, ""

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->d:Ljava/lang/String;

    .line 423
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseExternalValue json parse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 426
    goto :goto_0

    .line 424
    :catch_0
    move-exception v4

    .line 425
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse group invite json data meet exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 427
    :goto_0
    return-void
.end method

.method private b()J
    .locals 4

    .line 642
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getShowProgressDelay  in "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->k:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0xc8

    :goto_0
    return-wide v0
.end method

.method private b(J)V
    .locals 4

    .line 470
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkGroup start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$4;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;J)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 490
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 8

    .line 362
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFromScheme start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 364
    if-nez v4, :cond_0

    .line 365
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFromScheme  bundle == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    return-void

    .line 369
    :cond_0
    const-string v0, "is_form_scheme"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "is_form_scheme"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 370
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFromScheme in if IS_FORM_SCHEME && IS_FORM_SCHEME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "NEWSOCIALFRAGMENT_IS_SHOW_HEALTH_GROUP_KEY"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 373
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u901a\u8fc7scheme\u62c9\u8d77, isGroupDialog ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    const-string v0, "NEWSOCIALFRAGMENT_SHOW_HEALTH_GROUP_VALUE"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 375
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFromScheme in if IS_FORM_SCHEME && IS_FORM_SCHEME in if"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    new-instance v7, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->h:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->h:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_enter_secure_tips:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->h:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_apphelp_pwindows_continue_button:I

    .line 379
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$5;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$5;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;Landroid/content/Intent;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->h:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_apphelp_pwindows_back_button:I

    .line 386
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$1;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 391
    invoke-virtual {v7}, Lo/egy$b;->a()Lo/egy;

    move-result-object v6

    .line 392
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egy;->setCanceledOnTouchOutside(Z)V

    .line 393
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/egy;->setCancelable(Z)V

    .line 394
    invoke-virtual {v6}, Lo/egy;->show()V

    .line 395
    goto :goto_0

    .line 396
    :cond_1
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFromScheme in if IS_FORM_SCHEME && IS_FORM_SCHEME in else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Landroid/content/Intent;)V

    .line 399
    :goto_0
    goto :goto_1

    .line 400
    :cond_2
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6b63\u5e38\u52a0\u8f7d"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 401
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(Landroid/content/Intent;)V

    .line 403
    :goto_1
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;I)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;J)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e(J)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;ZLjava/lang/String;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(ZLjava/lang/String;)V

    return-void
.end method

.method private b(ZLjava/lang/String;)V
    .locals 5

    .line 708
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showTextUrlPage in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 710
    const-class v0, Lcom/huawei/health/sns/ui/qrcode/HealthQRTextUrlActivty;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 711
    const-string v0, "isUrl"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 712
    const-string v0, "qrContent"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 713
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 714
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->finish()V

    .line 715
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Z
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e()Z

    move-result v0

    return v0
.end method

.method private c()V
    .locals 4

    .line 667
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestCode in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->i:J

    .line 670
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->f:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b()J

    move-result-wide v1

    const/16 v3, 0x80

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 673
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    new-instance v1, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$2;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    invoke-static {v0, v1}, Lo/avv;->e(Ljava/lang/String;Lo/avv$e;)V

    .line 699
    return-void
.end method

.method private c(J)V
    .locals 5

    .line 508
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoHealthGroupPage start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 510
    const-class v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 511
    const-string v0, "EXTRA_GROUP_ID"

    invoke-virtual {v4, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 512
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 513
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->finish()V

    .line 514
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->k()V

    return-void
.end method

.method private c([J)V
    .locals 4

    .line 435
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseQRCode start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    const/4 v0, 0x0

    aget-wide v0, p1, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 437
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseQRCode ids[0] > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->d(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(ZLjava/lang/String;)V

    goto :goto_0

    .line 455
    :cond_0
    const/4 v0, 0x1

    aget-wide v0, p1, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 456
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseQRCode ids[1] > 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    const/4 v0, 0x1

    aget-wide v0, p1, v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(J)V

    goto :goto_0

    .line 459
    :cond_1
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseQRCode ids[0] <= 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    sget v0, Lcom/huawei/android/sns/R$string;->sns_two_dim_code_error:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(I)V

    .line 462
    :goto_0
    return-void
.end method

.method private d()V
    .locals 5

    .line 570
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkQRCode start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkQRCode TextUtils.isEmpty(qrCode)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 573
    sget v0, Lcom/huawei/android/sns/R$string;->sns_two_dim_code_error:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a(I)V

    .line 574
    return-void

    .line 576
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e:Z

    if-eqz v0, :cond_2

    .line 577
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkQRCode isNewQRCode in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 581
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkQRCode isValidateLoginBox in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->d(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(ZLjava/lang/String;)V

    goto/16 :goto_0

    .line 585
    :cond_1
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkQRCode isValidateLoginBox handleSNSQRCode"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a()V

    goto :goto_0

    .line 590
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->c(Ljava/lang/String;)Z

    move-result v4

    .line 591
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkQRCode isValidate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    if-eqz v4, :cond_3

    .line 593
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a()V

    goto :goto_0

    .line 594
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 595
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkQRCode QRCodeUtil.isValidateLoginBox"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->d(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(ZLjava/lang/String;)V

    goto :goto_0

    .line 599
    :cond_4
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkQRCode QRCodeUtil.isValidateLoginBox in else"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->d(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(ZLjava/lang/String;)V

    .line 603
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->i()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Landroid/content/Context;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->h:Landroid/content/Context;

    return-object v0
.end method

.method private e(I)V
    .locals 5

    .line 723
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handlerResult in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 724
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->f:Landroid/os/Handler;

    const/16 v1, 0x74

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 725
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 726
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->f:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->h()J

    move-result-wide v1

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 727
    return-void
.end method

.method private e(J)V
    .locals 5

    .line 520
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoApplyJoinGroup start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoApplyJoinGroup is not OffineInfoNull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 529
    const-class v0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 530
    const-string v0, "groupId"

    invoke-virtual {v4, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 531
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 532
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->finish()V

    .line 533
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 5

    .line 295
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initIntentDate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    if-nez p1, :cond_0

    .line 297
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initIntentDate intent == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 298
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->finish()V

    .line 299
    return-void

    .line 302
    :cond_0
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initIntentDate iisFromScheme"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    goto :goto_0

    .line 304
    :catch_0
    move-exception v4

    .line 305
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initIntentDate meet Exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;J)V
    .locals 0

    .line 54
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c(J)V

    return-void
.end method

.method private e()Z
    .locals 4

    .line 553
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gotoApplyJoinGroup start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 554
    const-string v0, "invite_member"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)J
    .locals 2

    .line 54
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->h()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->a:Ljava/lang/String;

    return-object v0
.end method

.method private h()J
    .locals 8

    .line 736
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDelay in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 737
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 738
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->i:J

    sub-long v6, v4, v0

    .line 740
    const-wide/16 v0, 0x320

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 741
    const-wide/16 v0, 0x0

    return-wide v0

    .line 743
    :cond_0
    const-wide/16 v0, 0x320

    sub-long/2addr v0, v6

    return-wide v0
.end method

.method private i()V
    .locals 4

    .line 767
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressDialog in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 768
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c:Lo/bio;

    if-nez v0, :cond_0

    .line 769
    new-instance v0, Lo/bio;

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_qr_loading:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$6;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity$6;-><init>(Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;)V

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/bir;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c:Lo/bio;

    .line 778
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 779
    return-void
.end method

.method private k()V
    .locals 4

    .line 757
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeProgressDialog in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 758
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c:Lo/bio;

    if-eqz v0, :cond_0

    .line 759
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->c:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 761
    :cond_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 275
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 276
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    iput-object p0, p0, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->h:Landroid/content/Context;

    .line 278
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 279
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e(Landroid/content/Intent;)V

    .line 280
    return-void
.end method

.method protected onDestroy()V
    .locals 4

    .line 748
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 749
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->k()V

    .line 750
    invoke-super {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onDestroy()V

    .line 751
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 284
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 285
    const-string v0, "Group_HealthCheckQRCodeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onNewIntent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 286
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/HealthCheckQRCodeActivity;->e(Landroid/content/Intent;)V

    .line 287
    return-void
.end method

.class public Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;
.super Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$e;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lo/bio;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:J

.field private g:J

.field private h:Lo/aoo;

.field private i:Landroid/os/Handler;

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;-><init>()V

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    .line 82
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->a:Z

    .line 87
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d:Ljava/lang/String;

    .line 162
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->k:Z

    .line 172
    new-instance v0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$e;-><init>(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->i:Landroid/os/Handler;

    .line 592
    new-instance v0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$4;-><init>(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->h:Lo/aoo;

    return-void
.end method

.method private a()V
    .locals 4

    .line 509
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 511
    sget v0, Lcom/huawei/android/sns/R$string;->sns_two_dim_code_error:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(I)V

    .line 512
    return-void

    .line 514
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->a:Z

    if-eqz v0, :cond_2

    .line 517
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 519
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 524
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b()V

    goto :goto_0

    .line 530
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->c(Ljava/lang/String;)Z

    move-result v3

    .line 531
    const-string v0, "CheckQRCodeActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkQRCode isValidate:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    if-eqz v3, :cond_3

    .line 534
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b()V

    goto :goto_0

    .line 536
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 538
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 542
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    invoke-static {v0}, Lo/biv;->d(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e(ZLjava/lang/String;)V

    .line 545
    :goto_0
    return-void
.end method

.method private a(J)V
    .locals 2

    .line 447
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 448
    const-class v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 449
    const-string v0, "groupId"

    invoke-virtual {v1, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 450
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 451
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 452
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Z
    .locals 1

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d()Z

    move-result v0

    return v0
.end method

.method private b()V
    .locals 4

    .line 552
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 555
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->f()V

    goto :goto_0

    .line 560
    :cond_0
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->h:Lo/aoo;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, p0, v1, v2, v3}, Lo/aor;->c(Landroid/app/Activity;Lo/aoo;ZZ)V

    .line 562
    :goto_0
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 3

    .line 284
    if-nez p1, :cond_0

    .line 286
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 287
    return-void

    .line 291
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    goto :goto_0

    .line 293
    :catch_0
    move-exception v2

    .line 295
    const-string v0, "CheckQRCodeActivity"

    const-string v1, "getIntentData meet Exception."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->a()V

    .line 299
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->h()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;[J)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c([J)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .line 571
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 572
    const-string v0, "com.huawei.hwid.action.AUTH_LOGIN"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 573
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 574
    const-string v0, "qrcode_intent_key"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 575
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 576
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 577
    return-void
.end method

.method private c()J
    .locals 2

    .line 586
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->k:Z

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0xc8

    :goto_0
    return-wide v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->g()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;J)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(J)V

    return-void
.end method

.method private c([J)V
    .locals 6

    .line 380
    const/4 v0, 0x0

    aget-wide v0, p1, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 382
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 383
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 384
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 386
    const-string v0, "bundleKeyGroupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 387
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x5

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 391
    :cond_0
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x4

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 393
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 394
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 396
    :goto_0
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 397
    const-string v0, "bundleKeyUserId"

    const/4 v1, 0x0

    aget-wide v1, p1, v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 398
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 399
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 400
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 401
    goto :goto_1

    .line 402
    :cond_1
    const/4 v0, 0x1

    aget-wide v0, p1, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 404
    const/4 v0, 0x1

    aget-wide v0, p1, v0

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e(J)V

    goto :goto_1

    .line 408
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_two_dim_code_error:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(I)V

    .line 410
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)Landroid/os/Handler;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->i:Landroid/os/Handler;

    return-object v0
.end method

.method private d(I)V
    .locals 0

    .line 500
    invoke-static {p0, p1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 501
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 502
    return-void
.end method

.method private d(J)V
    .locals 2

    .line 460
    new-instance v0, Lo/bca;

    invoke-direct {v0}, Lo/bca;-><init>()V

    invoke-virtual {v0}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 462
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e()V

    .line 463
    return-void

    .line 466
    :cond_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 467
    const-class v0, Lcom/huawei/health/sns/ui/group/HealthApplyJoinGroupActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 468
    const-string v0, "groupId"

    invoke-virtual {v1, v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 469
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 470
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 471
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .line 355
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 357
    return-void

    .line 362
    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 363
    const-string v0, "sns_groupId"

    const-wide/16 v1, 0x0

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e:J

    .line 365
    const-string v0, "sns_type"

    const-string v1, ""

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 370
    goto :goto_0

    .line 367
    :catch_0
    move-exception v3

    .line 369
    const-string v0, "CheckQRCodeActivity"

    const-string v1, "parse group invite json data meet exception."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    :goto_0
    return-void
.end method

.method private d()Z
    .locals 4

    .line 492
    const-string v0, "invite_member"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e:J

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

.method static synthetic e(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)J
    .locals 2

    .line 50
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e:J

    return-wide v0
.end method

.method private e()V
    .locals 3

    .line 478
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/HomeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 479
    const-string v0, "messageTab"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 480
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 481
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 482
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 483
    return-void
.end method

.method private e(I)V
    .locals 4

    .line 671
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->i:Landroid/os/Handler;

    const/16 v1, 0x74

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 672
    iput p1, v3, Landroid/os/Message;->arg1:I

    .line 673
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->i:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->i()J

    move-result-wide v1

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 674
    return-void
.end method

.method private e(J)V
    .locals 2

    .line 419
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$5;-><init>(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;J)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 440
    return-void
.end method

.method private e(Landroid/content/Intent;)V
    .locals 4

    .line 306
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 307
    if-nez v2, :cond_0

    .line 309
    return-void

    .line 312
    :cond_0
    const-string v0, "qrcode_intent_key"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 314
    const-string v0, "qrcode_intent_key"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    .line 315
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->a:Z

    .line 317
    const-string v0, "intent_external_value"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 319
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d(Ljava/lang/String;)V

    .line 320
    goto :goto_0

    .line 323
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->a:Z

    .line 325
    const-string v0, "from_account"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 327
    const-string v0, "from_account"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->k:Z

    .line 329
    :cond_2
    const-string v0, "QRCode_errContent"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 332
    const-string v0, "QRCode_errContent"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    .line 334
    :cond_3
    const-string v0, "QRCode_Identify"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 337
    const-string v0, "QRCode_Identify"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->d:Ljava/lang/String;

    .line 339
    :cond_4
    const-string v0, "groupId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 342
    const-string v0, "groupId"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e:J

    .line 345
    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->e(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;J)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->a(J)V

    return-void
.end method

.method private e(ZLjava/lang/String;)V
    .locals 2

    .line 656
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 657
    const-class v0, Lcom/huawei/health/sns/ui/qrcode/QRTextUrlActivity;

    invoke-virtual {v1, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 658
    const-string v0, "isUrl"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 659
    const-string v0, "qrContent"

    invoke-virtual {v1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 660
    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->startActivity(Landroid/content/Intent;)V

    .line 661
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->finish()V

    .line 662
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)J
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method private f()V
    .locals 4

    .line 614
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->g:J

    .line 616
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->i:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c()J

    move-result-wide v1

    const/16 v3, 0x80

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 619
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->c:Ljava/lang/String;

    new-instance v1, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$3;-><init>(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V

    invoke-static {v0, v1}, Lo/avv;->e(Ljava/lang/String;Lo/avv$e;)V

    .line 646
    return-void
.end method

.method private g()V
    .locals 4

    .line 718
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b:Lo/bio;

    if-nez v0, :cond_0

    .line 720
    new-instance v0, Lo/bio;

    const-string v1, ""

    sget v2, Lcom/huawei/android/sns/R$string;->sns_qr_loading:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$1;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity$1;-><init>(Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;)V

    invoke-direct {v0, p0, v1, v2, v3}, Lo/bio;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/bir;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b:Lo/bio;

    .line 731
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->a()V

    .line 732
    return-void
.end method

.method private h()V
    .locals 1

    .line 707
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b:Lo/bio;

    if-eqz v0, :cond_0

    .line 709
    iget-object v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 711
    :cond_0
    return-void
.end method

.method private i()J
    .locals 6

    .line 684
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 685
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->g:J

    sub-long v4, v2, v0

    .line 687
    const-wide/16 v0, 0x320

    cmp-long v0, v4, v0

    if-lez v0, :cond_0

    .line 689
    const-wide/16 v0, 0x0

    return-wide v0

    .line 691
    :cond_0
    const-wide/16 v0, 0x320

    sub-long/2addr v0, v4

    return-wide v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 263
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 264
    const-string v0, "CheckQRCodeActivity"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 266
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b(Landroid/content/Intent;)V

    .line 267
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 697
    const-string v0, "CheckQRCodeActivity"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 698
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->h()V

    .line 699
    invoke-super {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onDestroy()V

    .line 700
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 272
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 273
    const-string v0, "CheckQRCodeActivity"

    const-string v1, "onNewIntent"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/qrcode/CheckQRCodeActivity;->b(Landroid/content/Intent;)V

    .line 275
    return-void
.end method

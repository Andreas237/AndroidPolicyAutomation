.class final Lo/eem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eej;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lo/eek;

.field private final d:I

.field private final e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/eek;ILjava/lang/String;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, Lo/eem;->e:Landroid/content/Context;

    .line 85
    iput-object p2, p0, Lo/eem;->c:Lo/eek;

    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eem;->b:Ljava/lang/String;

    .line 87
    iput-object p4, p0, Lo/eem;->a:Ljava/lang/String;

    .line 88
    iput p3, p0, Lo/eem;->d:I

    .line 89
    return-void
.end method

.method private c(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .line 603
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 605
    const-string v0, "sns_sdk_transaction"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 607
    const-string v0, "sns_sdk_activity_className"

    iget-object v1, p0, Lo/eem;->b:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    const-string v0, "sns_sdk_package_name"

    iget-object v1, p0, Lo/eem;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 611
    const-string v0, "sns_sdk_channel"

    iget v1, p0, Lo/eem;->d:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 613
    const-string v0, "sns_sdk_version"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 615
    const-string v0, "sns_sdk_is_activity_call"

    iget-object v1, p0, Lo/eem;->e:Landroid/content/Context;

    invoke-static {v1}, Lo/eeo;->b(Landroid/content/Context;)Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 616
    return-object v2
.end method


# virtual methods
.method public b(Lcom/huawei/sns/sdk/modelmsg/CommonReq;)I
    .locals 4

    .line 136
    invoke-virtual {p0}, Lo/eem;->e()Z

    move-result v0

    invoke-static {p1, v0}, Lo/eeo;->e(Lo/edw;Z)I

    move-result v2

    .line 137
    if-eqz v2, :cond_0

    .line 139
    return v2

    .line 143
    :cond_0
    iget v0, p0, Lo/eem;->d:I

    invoke-virtual {p1, v0}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->setChannel(I)V

    .line 146
    new-instance v3, Lo/eem$4;

    invoke-direct {v3, p0, p1}, Lo/eem$4;-><init>(Lo/eem;Lcom/huawei/sns/sdk/modelmsg/CommonReq;)V

    .line 157
    iget-object v0, p0, Lo/eem;->c:Lo/eek;

    iget-object v1, p0, Lo/eem;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, v3, v1}, Lo/eek;->b(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eei;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/sns/sdk/modelmsg/CommonReq;)I
    .locals 4

    .line 233
    invoke-virtual {p0}, Lo/eem;->e()Z

    move-result v0

    invoke-static {p1, v0}, Lo/eeo;->e(Lo/edw;Z)I

    move-result v2

    .line 234
    if-eqz v2, :cond_0

    .line 236
    return v2

    .line 240
    :cond_0
    iget v0, p0, Lo/eem;->d:I

    invoke-virtual {p1, v0}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->setChannel(I)V

    .line 243
    new-instance v3, Lo/eem$5;

    invoke-direct {v3, p0, p1}, Lo/eem$5;-><init>(Lo/eem;Lcom/huawei/sns/sdk/modelmsg/CommonReq;)V

    .line 255
    iget-object v0, p0, Lo/eem;->c:Lo/eek;

    iget-object v1, p0, Lo/eem;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, v3, v1}, Lo/eek;->a(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Lo/eee;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;)I
    .locals 8

    .line 435
    invoke-virtual {p0}, Lo/eem;->e()Z

    move-result v0

    invoke-static {p1, v0}, Lo/eeo;->e(Lo/edw;Z)I

    move-result v3

    .line 436
    if-eqz v3, :cond_0

    .line 438
    return v3

    .line 442
    :cond_0
    iget-object v0, p1, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->transaction:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/eem;->c(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    .line 444
    const-string v0, "sns_sdk_operate_type"

    sget-object v1, Lo/edx$b;->b:Lo/edx$b;

    invoke-virtual {v1}, Lo/edx$b;->b()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 445
    const-string v0, "com.huawei.hwid"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lo/eeo;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v5

    .line 447
    iget-object v0, p0, Lo/eem;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eeo;->b(Landroid/content/Context;)Z

    move-result v0

    invoke-static {p1, v5, v4, v0}, Lo/eeo;->e(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Intent;Landroid/os/Bundle;Z)I

    move-result v6

    .line 449
    invoke-virtual {v5, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 451
    if-eqz v6, :cond_1

    .line 453
    return v6

    .line 457
    :cond_1
    :try_start_0
    iget-object v0, p0, Lo/eem;->e:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 463
    goto :goto_0

    .line 459
    :catch_0
    move-exception v7

    .line 461
    const-string v0, "SNS_SDK"

    const-string v1, "api.showUI() exception."

    invoke-static {v0, v1, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 462
    const/4 v0, 0x2

    return v0

    .line 465
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Lcom/huawei/sns/sdk/modelmsg/CommonReq;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;
    .locals 4

    .line 540
    const/4 v2, 0x0

    .line 541
    invoke-virtual {p0}, Lo/eem;->e()Z

    move-result v0

    invoke-static {p1, v0}, Lo/eeo;->e(Lo/edw;Z)I

    move-result v3

    .line 542
    if-eqz v3, :cond_0

    .line 544
    new-instance v2, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    invoke-direct {v2}, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;-><init>()V

    .line 545
    iget-object v0, p1, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->transaction:Ljava/lang/String;

    invoke-static {v2, v0, v3}, Lo/eeo;->e(Lo/edv;Ljava/lang/String;I)V

    .line 549
    :cond_0
    iget v0, p0, Lo/eem;->d:I

    invoke-virtual {p1, v0}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->setChannel(I)V

    .line 551
    iget-object v0, p0, Lo/eem;->c:Lo/eek;

    iget-object v1, p0, Lo/eem;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lo/eek;->c(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Ljava/lang/String;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 97
    iget-object v0, p0, Lo/eem;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/eel;->e(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

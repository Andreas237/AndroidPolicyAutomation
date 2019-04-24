.class Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 0

    .line 597
    iput-object p1, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;Ljava/lang/String;Z)V
    .locals 17

    .line 600
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkQQStatus HwCloudManagerQQ getAuthorizeToken() isSuccess="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkQQStatus HwCloudManagerQQ getAuthorizeToken() text="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 602
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->a()V

    .line 603
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 604
    if-eqz p3, :cond_3

    .line 605
    const/4 v5, 0x0

    .line 609
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;

    move-object/from16 v2, p2

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;

    .line 610
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() qqAuthorizeTokenResult = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() qqAuthorizeTokenResult.getThirdUserToken() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 614
    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->getExpireTime()I

    move-result v5

    .line 615
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() expireTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->getLastModifyTime()Ljava/lang/String;

    move-result-object v6

    .line 617
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() strLastModifyTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 618
    invoke-virtual {v8}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult;->getThirdUserToken()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/QQAuthorizeTokenResult$ThirdUserToken;->isValid()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 619
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() isValid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 622
    const-wide/16 v11, 0x0

    .line 623
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() curTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 625
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 626
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 628
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 629
    sub-long v0, v9, v11

    const-wide/16 v2, 0x3e8

    div-long v13, v0, v2

    .line 630
    int-to-long v0, v5

    cmp-long v0, v13, v0

    if-gtz v0, :cond_1

    .line 631
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() usedTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", expireTime="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 633
    new-instance v0, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;-><init>(Landroid/content/Context;)V

    move-object v15, v0

    .line 634
    invoke-virtual {v15}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthDB;->get()Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;

    move-result-object v16

    .line 636
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_1

    .line 637
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkQQStatus get qqHealthTable="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 638
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getNickName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-virtual/range {v16 .. v16}, Lcom/huawei/ui/thirdpartservice/interactors/thirdpartyservice/qqhealth/mgr/QQHealthTable;->getNickName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 639
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCloudManagerQQ getAuthorizeToken() isQQTokenValid = true\uff0cend"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 645
    :cond_1
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HwCloudManagerQQ getAuthorizeToken() isQQTokenValid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 646
    goto :goto_0

    .line 647
    :cond_2
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCloudManagerQQ getAuthorizeToken() ,qqAuthorizeTokenResult.getThirdUserToken() is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 648
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 650
    :goto_0
    goto :goto_1

    .line 651
    :cond_3
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HwCloudManagerQQ getAuthorizeToken() ,not success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    const/16 v1, 0x1f7

    invoke-virtual {v0, v1}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 656
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 658
    const-string v6, "true"

    .line 659
    iput-object v6, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 660
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 661
    goto :goto_2

    .line 663
    :cond_4
    const-string v6, "false"

    .line 664
    iput-object v6, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 665
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;->e:Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->k(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->sendMessage(Landroid/os/Message;)Z

    .line 667
    :goto_2
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 597
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0, p2, p3}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$2;->a(Ljava/lang/Boolean;Ljava/lang/String;Z)V

    return-void
.end method

.class Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->generateNpsMessage()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V
    .locals 0

    .line 542
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 12

    .line 545
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 546
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 547
    new-instance v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 548
    invoke-virtual {v5, v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 549
    const-string v0, "nps"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 550
    const-string v0, "nps_type_message"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setType(Ljava/lang/String;)V

    .line 551
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 552
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 553
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgPosition(I)V

    .line 554
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$500(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_nps_success_message_2:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 555
    invoke-virtual {v5, v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 556
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps generateNpsMessage contentStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 557
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$500(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_messagecenter_nps_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 558
    invoke-virtual {v5, v7}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 559
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nps generateNpsMessage mstTitle = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 561
    invoke-virtual {v5, v8, v9}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 562
    const-string v0, "messagecenter://nps_question"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 563
    const-string v0, "assets://localMessageIcon/ic_investigation.webp"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgUri(Ljava/lang/String;)V

    .line 564
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 565
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 568
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$600(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Lo/eaa;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/eaa;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    .line 569
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps Leave generateNpsMessage !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 573
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=========isEmui-->\u534e\u4e3a\u624b\u673a\u624d\u5141\u8bb8\u5728\u4eca\u65e5\u5f85\u529e\u4e2d\u51fa\u73b0\u8bbe\u5907NPS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    const-string v1, "KEY_NPS_SHOW"

    const-string v2, "true"

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    .line 575
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KEY_NPS_SHOW result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    const-string v1, "MESSAGE_NPSID"

    invoke-virtual {v0, v1, v4}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MESSAGE_NPSID result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    .line 579
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    const-string v1, "MNP_SHOW_TIME"

    invoke-virtual {v0, v1, v11}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;)I

    move-result v10

    .line 580
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$5;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MNP_SHOW_TIME result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 593
    :cond_1
    return-void
.end method

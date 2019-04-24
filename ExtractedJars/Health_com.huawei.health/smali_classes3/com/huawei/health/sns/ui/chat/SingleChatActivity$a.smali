.class Lcom/huawei/health/sns/ui/chat/SingleChatActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/SingleChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/SingleChatActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V
    .locals 1

    .line 597
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 598
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$a;->c:Ljava/lang/ref/WeakReference;

    .line 599
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 603
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 605
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SingleChatActivity$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;

    .line 606
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 607
    :cond_0
    return-void

    .line 610
    :cond_1
    invoke-virtual {v3, p1}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->e(Landroid/os/Message;)V

    .line 612
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 614
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 615
    const-string v0, "SingleChatActivity"

    const-string v1, "MSG_CLEAR_CHAT_DATE. userId is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    goto/16 :goto_0

    .line 618
    :cond_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 619
    invoke-virtual {v3, v4, v5}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->a(J)V

    .line 620
    goto/16 :goto_0

    .line 623
    :sswitch_1
    const-string v0, "SingleChatActivity"

    const-string v1, "msg user change."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 624
    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->a(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    .line 625
    goto/16 :goto_0

    .line 628
    :sswitch_2
    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->c(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    .line 629
    goto/16 :goto_0

    .line 632
    :sswitch_3
    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->e(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    .line 633
    goto/16 :goto_0

    .line 636
    :sswitch_4
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v4, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 637
    const-string v0, "bundleKeyUserId"

    iget-wide v1, v3, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->f:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 639
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/health/sns/server/user/Origin;

    if-eqz v0, :cond_3

    .line 640
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/server/user/Origin;

    .line 641
    invoke-static {v5}, Lcom/huawei/health/sns/server/user/Origin;->obtainOriginByLocalType(Lcom/huawei/health/sns/server/user/Origin;)[Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v6

    .line 642
    const-string v0, "sns_frd_origin"

    const/4 v1, 0x0

    aget-object v1, v6, v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 643
    const-string v0, "sns_frd_origin"

    const/4 v1, 0x1

    aget-object v1, v6, v1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 645
    :cond_3
    invoke-virtual {v3, v4}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 646
    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->finish()V

    .line 647
    goto :goto_0

    .line 651
    :sswitch_5
    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 652
    sget v0, Lcom/huawei/android/sns/R$string;->sns_user_not_exist:I

    invoke-static {v3, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 653
    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->finish()V

    goto :goto_0

    .line 655
    :cond_4
    invoke-static {v3}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->d(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;)V

    .line 657
    goto :goto_0

    .line 660
    :sswitch_6
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 661
    const-string v0, "bundleKeyUser"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/user/User;

    .line 662
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 663
    const-string v0, "SingleChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "user = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 664
    invoke-static {v3, v5}, Lcom/huawei/health/sns/ui/chat/SingleChatActivity;->d(Lcom/huawei/health/sns/ui/chat/SingleChatActivity;Lcom/huawei/health/sns/model/user/User;)V

    .line 671
    :cond_5
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_1
        0x25 -> :sswitch_6
        0x7e3 -> :sswitch_0
        0x7e5 -> :sswitch_2
        0x7e6 -> :sswitch_3
        0x7e7 -> :sswitch_5
        0x7f2 -> :sswitch_4
    .end sparse-switch
.end method

.class Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V
    .locals 1

    .line 706
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 707
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->c:Ljava/lang/ref/WeakReference;

    .line 708
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 712
    iget-object v0, p0, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;

    .line 713
    if-nez v4, :cond_0

    .line 714
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 715
    return-void

    .line 717
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 719
    :sswitch_0
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 721
    invoke-static {}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, ""

    invoke-static {}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 722
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 723
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage MESSAGE_ID_GETQRCODETICKET get unvalid userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 724
    return-void

    .line 726
    :cond_2
    const-string v0, "ThirdPartServiceActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userid get:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 727
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 728
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a$4;

    invoke-direct {v1, p0, v5, v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a$4;-><init>(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity$a;Ljava/lang/String;Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    invoke-virtual {v0, v1}, Lo/dgu;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 752
    goto/16 :goto_1

    .line 754
    :sswitch_1
    invoke-virtual {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 755
    return-void

    .line 757
    :cond_3
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 759
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_confirm_network_whether_connected:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 760
    goto/16 :goto_1

    .line 762
    :sswitch_2
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 764
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_update_server_bussy:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 765
    goto/16 :goto_1

    .line 767
    :sswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 768
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->c(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Lo/fit;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lo/fit;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 769
    goto/16 :goto_1

    .line 771
    :sswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 772
    const-string v0, "false"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 773
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->i(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_wechat_dialog_button_content:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 774
    :cond_4
    const-string v0, "true"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 775
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->i(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_data_share_wechat_status:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 776
    new-instance v8, Lo/dcy;

    invoke-direct {v8}, Lo/dcy;-><init>()V

    .line 777
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wechat_red_dot_show"

    const-string v3, "true"

    invoke-static {v0, v1, v2, v3, v8}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 780
    :cond_5
    :goto_0
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->h(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    .line 781
    goto/16 :goto_1

    .line 783
    :sswitch_5
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->g(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)V

    .line 784
    goto/16 :goto_1

    .line 786
    :sswitch_6
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_connect_network:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 787
    goto/16 :goto_1

    .line 789
    :sswitch_7
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_update_server_bussy:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 790
    goto/16 :goto_1

    .line 792
    :sswitch_8
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->o(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_data_share_wechat_status:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 793
    goto/16 :goto_1

    .line 795
    :sswitch_9
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->o(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_wechat_dialog_button_content:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 796
    goto/16 :goto_1

    .line 798
    :sswitch_a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 799
    const-string v0, "false"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 800
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->l(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_wechat_dialog_button_content:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 801
    :cond_6
    const-string v0, "true"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 802
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->l(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_data_share_wechat_status:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 806
    :sswitch_b
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 807
    const-string v0, "false"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 808
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->m(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_wechat_dialog_button_content:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 809
    :cond_7
    const-string v0, "true"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 810
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->m(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_data_share_wechat_status:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 814
    :sswitch_c
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 815
    const-string v0, "false"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 816
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->p(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_wechat_dialog_button_content:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 817
    :cond_8
    const-string v0, "true"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 818
    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->p(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v4}, Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;->e(Lcom/huawei/ui/thirdpartservice/activity/ThirdPartServiceActivity;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/ui/thirdpartservice/R$string;->IDS_hw_healt_data_share_wechat_status:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 824
    :cond_9
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc9 -> :sswitch_0
        0xca -> :sswitch_1
        0xcb -> :sswitch_2
        0xcd -> :sswitch_3
        0xce -> :sswitch_8
        0xcf -> :sswitch_9
        0x1f4 -> :sswitch_4
        0x1f5 -> :sswitch_5
        0x1f6 -> :sswitch_a
        0x1f7 -> :sswitch_b
        0x1f8 -> :sswitch_c
        0x3e8 -> :sswitch_6
        0x3e9 -> :sswitch_7
    .end sparse-switch
.end method

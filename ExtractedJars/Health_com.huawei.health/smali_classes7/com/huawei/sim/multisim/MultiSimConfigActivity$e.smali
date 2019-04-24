.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/sim/multisim/MultiSimConfigActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 1

    .line 843
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 844
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->d:Ljava/lang/ref/WeakReference;

    .line 845
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 849
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 850
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    .line 851
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 852
    return-void

    .line 856
    :cond_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage msg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 859
    :pswitch_0
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg MULTI_SIM_MSG_OPEN_SUCCESS msg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 860
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/dra;

    .line 861
    invoke-static {v4, v5}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Lo/dra;)V

    .line 862
    goto/16 :goto_1

    .line 864
    :pswitch_1
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg MULTI_SIM_MSG_QUERY_RESULT msg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 865
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/dra;

    .line 866
    invoke-static {v4, v5}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Lo/dra;)V

    .line 867
    goto/16 :goto_1

    .line 869
    :pswitch_2
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg MULTI_STATUS_CHANGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    invoke-static {v4}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    .line 871
    goto/16 :goto_1

    .line 873
    :pswitch_3
    const/16 v0, 0x8

    invoke-static {v4, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)V

    .line 874
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg MULTI_SIM_MSG_REFRESH_CURRENT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 875
    invoke-static {v4}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    .line 876
    goto/16 :goto_1

    .line 878
    :pswitch_4
    invoke-static {v4}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->h(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    .line 879
    invoke-static {v4}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->f(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)I

    move-result v0

    invoke-static {v4, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_open_result_query_fail_notic:I

    .line 880
    invoke-virtual {v4, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 879
    invoke-static {v4, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->c(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 881
    goto/16 :goto_1

    .line 883
    :pswitch_5
    const/16 v0, 0x10

    invoke-static {v4, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)V

    .line 884
    invoke-static {v4}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->k(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    .line 885
    goto :goto_1

    .line 887
    :pswitch_6
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg MULTI_SIM_MSG_AUTH_RESULT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 888
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v4, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)V

    .line 889
    goto :goto_1

    .line 891
    :pswitch_7
    const/16 v0, 0x10

    invoke-static {v4, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)V

    .line 892
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg MULTI_SIM_MSG_DOWNLOAD_PROFILE_COMPLETE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 893
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 894
    invoke-static {v4}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    goto :goto_1

    .line 896
    :cond_1
    invoke-static {v4}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->k(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V

    .line 899
    goto :goto_1

    .line 901
    :pswitch_8
    const/16 v0, 0xf

    invoke-static {v4, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;I)V

    .line 902
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg MULTI_SIM_INIT_STARTVIEW"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 903
    sget v0, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_query_fail:I

    invoke-virtual {v4, v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/huawei/sim/R$string;->IDS_plugin_multi_sim_deviceinfo_fail:I

    invoke-virtual {v4, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->d(Lcom/huawei/sim/multisim/MultiSimConfigActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 904
    goto :goto_1

    .line 906
    :goto_0
    :pswitch_9
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unknow massage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 909
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_3
        :pswitch_4
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_5
    .end packed-switch
.end method

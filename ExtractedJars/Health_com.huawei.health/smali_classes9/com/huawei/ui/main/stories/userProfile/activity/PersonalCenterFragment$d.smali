.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V
    .locals 0

    .line 3805
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 3806
    return-void
.end method


# virtual methods
.method protected d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Landroid/os/Message;)V
    .locals 16

    .line 3810
    move-object/from16 v0, p2

    iget v0, v0, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 3813
    :sswitch_0
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_b

    .line 3814
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/up/model/UserInfomation;

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->b(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Lcom/huawei/up/model/UserInfomation;)V

    goto/16 :goto_2

    .line 3819
    :sswitch_1
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_USERINFO_FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3820
    goto/16 :goto_2

    .line 3823
    :sswitch_2
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/dwe;

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Lo/dwe;)Lo/dwe;

    .line 3824
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->F(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dwe;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3825
    return-void

    .line 3827
    :cond_0
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "REFRESH_ACHIEVEMENT_DATA:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->F(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dwe;

    move-result-object v2

    invoke-virtual {v2}, Lo/dwe;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3828
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->H(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 3829
    goto/16 :goto_2

    .line 3832
    :sswitch_3
    goto/16 :goto_2

    .line 3834
    :sswitch_4
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->M(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 3835
    goto/16 :goto_2

    .line 3838
    :sswitch_5
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_b

    .line 3839
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Landroid/graphics/Bitmap;

    .line 3840
    move-object/from16 v0, p1

    invoke-static {v0, v6}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Landroid/graphics/Bitmap;)V

    .line 3841
    goto/16 :goto_2

    .line 3844
    :sswitch_6
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 3845
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "gomedalsrefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3846
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 3847
    move-object/from16 v0, p1

    invoke-static {v0, v6}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Ljava/lang/String;)V

    .line 3848
    goto/16 :goto_2

    .line 3851
    :sswitch_7
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 3853
    invoke-static {}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const-string v0, ""

    invoke-static {}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3854
    :cond_1
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage MESSAGE_ID_GETQRCODETICKET get unvalid userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3855
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->k(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 3856
    return-void

    .line 3858
    :cond_2
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 3859
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MESSAGE_ID_GETQRCODETICKET userid is:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3860
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d$1;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    invoke-direct {v1, v2, v6, v3}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d$1;-><init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;Ljava/lang/String;Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    invoke-virtual {v0, v1}, Lo/dgu;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3885
    goto/16 :goto_2

    .line 3887
    :sswitch_8
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->K(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->k(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 3888
    :cond_3
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_confirm_network_whether_connected:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 3889
    goto/16 :goto_2

    .line 3891
    :sswitch_9
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->K(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->k(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fit;

    move-result-object v0

    invoke-virtual {v0}, Lo/fit;->a()V

    .line 3892
    :cond_4
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_update_server_bussy:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 3893
    goto/16 :goto_2

    .line 3895
    :sswitch_a
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show point"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3896
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->f(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3897
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 3898
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 3900
    goto/16 :goto_2

    .line 3902
    :sswitch_b
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 3903
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MESSAGE_ID_BINDTITLE jumpToHwPublic trdTicket = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3904
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->K(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->k(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fit;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lo/fit;->d(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 3907
    :sswitch_c
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 3908
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " isWeChatBinded = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3909
    const-string v0, "false"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3911
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->f(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 3912
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    goto/16 :goto_2

    .line 3914
    :cond_5
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->f(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 3915
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 3916
    const-string v0, "true"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 3917
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwo;->d()V

    .line 3920
    new-instance v9, Lo/dcy;

    invoke-direct {v9}, Lo/dcy;-><init>()V

    .line 3921
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wechat_red_dot_show"

    const-string v3, "true"

    invoke-static {v0, v1, v2, v3, v9}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3923
    goto/16 :goto_2

    .line 3927
    :sswitch_d
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 3928
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " isAliBinded = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3929
    const-string v0, "false"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 3930
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->i(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 3931
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    goto/16 :goto_2

    .line 3933
    :cond_6
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->i(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 3934
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 3935
    const-string v0, "true"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 3936
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwo;->d()V

    goto/16 :goto_2

    .line 3941
    :sswitch_e
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->J(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3942
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->g(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 3943
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 3944
    goto/16 :goto_2

    .line 3946
    :sswitch_f
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->J(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3947
    move-object/from16 v0, p1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->g(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 3948
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 3949
    goto/16 :goto_2

    .line 3953
    :sswitch_10
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reconnect device timeout \uff1f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p2

    iget v2, v2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3954
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 3955
    move-object/from16 v0, p2

    iget v0, v0, Landroid/os/Message;->what:I

    const/16 v1, 0x1e

    if-ne v1, v0, :cond_7

    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a:Ljava/lang/String;

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 3956
    move-object/from16 v0, p0

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;->removeMessages(I)V

    .line 3957
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->d()V

    .line 3958
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fik;->a(Z)V

    .line 3959
    const/4 v0, 0x0

    move-object/from16 v1, p1

    iput-object v0, v1, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a:Ljava/lang/String;

    goto :goto_0

    .line 3960
    :cond_7
    move-object/from16 v0, p2

    iget v0, v0, Landroid/os/Message;->what:I

    const/16 v1, 0x1f

    if-ne v1, v0, :cond_8

    .line 3961
    move-object/from16 v0, p0

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;->removeMessages(I)V

    .line 3962
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->d()V

    .line 3963
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fik;->a(Z)V

    .line 3966
    :cond_8
    :goto_0
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fik;->a(Z)V

    .line 3967
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d:Lo/acl$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lo/acl$a;)V

    .line 3968
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V

    .line 3969
    goto/16 :goto_2

    .line 3971
    :sswitch_11
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V

    .line 3972
    goto/16 :goto_2

    .line 3975
    :sswitch_12
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d:Lo/acl$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lo/acl$a;)V

    .line 3976
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 3977
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a:Ljava/lang/String;

    invoke-virtual {v11, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 3978
    move-object/from16 v0, p0

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;->removeMessages(I)V

    .line 3979
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->d()V

    .line 3980
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fik;->a(Z)V

    .line 3981
    const/4 v0, 0x0

    move-object/from16 v1, p1

    iput-object v0, v1, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a:Ljava/lang/String;

    .line 3983
    :cond_9
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d:Lo/acl$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lo/acl$a;)V

    .line 3984
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V

    .line 3985
    goto/16 :goto_2

    .line 3988
    :sswitch_13
    move-object/from16 v0, p0

    const/16 v1, 0x1f

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;->removeMessages(I)V

    .line 3989
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->d()V

    .line 3990
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fik;->a(Z)V

    .line 3991
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d:Lo/acl$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lo/acl$a;)V

    .line 3992
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V

    .line 3993
    move-object/from16 v0, p2

    iget v0, v0, Landroid/os/Message;->arg1:I

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->c(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;I)V

    .line 3994
    goto/16 :goto_2

    .line 3996
    :sswitch_14
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg_connect_change  state:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v2

    invoke-virtual {v2}, Lo/fik;->b()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "msg: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    move-object/from16 v2, p2

    iget v2, v2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3997
    move-object/from16 v0, p2

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v1, p1

    iput-object v0, v1, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a:Ljava/lang/String;

    .line 3998
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fik;->a(Z)V

    .line 4000
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d:Lo/acl$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lo/acl$a;)V

    .line 4001
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V

    .line 4002
    goto/16 :goto_2

    .line 4004
    :sswitch_15
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "msg_device_delete msg: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p2

    iget v2, v2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4006
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d:Lo/acl$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->a(Lo/acl$a;)V

    .line 4007
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->n(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/support/v7/widget/RecyclerView;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 4008
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->r(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/fik;

    move-result-object v0

    invoke-virtual {v0}, Lo/fik;->notifyDataSetChanged()V

    .line 4009
    invoke-static/range {p1 .. p1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->N(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 4010
    goto/16 :goto_2

    .line 4012
    :sswitch_16
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get message msg_get_device_log"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4013
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 4015
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Crowd_test_last_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v14

    .line 4016
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearHomeActivity  curTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", lastTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4017
    sub-long v0, v12, v14

    const-wide/32 v2, 0x1b7740

    cmp-long v0, v2, v0

    if-lez v0, :cond_a

    .line 4018
    return-void

    .line 4022
    :cond_a
    goto :goto_1

    .line 4020
    :catch_0
    move-exception v14

    .line 4021
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearHomeActivity... e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v14}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4024
    :goto_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Crowd_test_last_time"

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4026
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v14

    .line 4027
    new-instance v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d$5;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d$5;-><init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;)V

    const/4 v1, 0x0

    invoke-virtual {v14, v1, v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getCrowdTestAndMaint(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V

    .line 4041
    .line 4045
    :cond_b
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x6 -> :sswitch_5
        0x7 -> :sswitch_6
        0x8 -> :sswitch_a
        0x9 -> :sswitch_e
        0xa -> :sswitch_f
        0x1e -> :sswitch_10
        0x1f -> :sswitch_10
        0x20 -> :sswitch_12
        0x21 -> :sswitch_14
        0x22 -> :sswitch_11
        0x23 -> :sswitch_15
        0x24 -> :sswitch_13
        0x25 -> :sswitch_16
        0xc9 -> :sswitch_7
        0xca -> :sswitch_8
        0xcb -> :sswitch_9
        0xcd -> :sswitch_b
        0xce -> :sswitch_c
        0xcf -> :sswitch_d
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 3803
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Landroid/os/Message;)V

    return-void
.end method

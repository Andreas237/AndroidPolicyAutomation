.class public Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;,
        Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;,
        Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$d;
    }
.end annotation


# instance fields
.field private A:Lo/egw;

.field private B:Lo/egw;

.field private C:Lo/aoh;

.field private D:Ljava/lang/String;

.field private E:Landroid/widget/RelativeLayout;

.field private F:Ljava/lang/String;

.field private G:Ljava/lang/String;

.field private H:Landroid/widget/TextView;

.field private I:Landroid/widget/RelativeLayout;

.field private J:Landroid/widget/RelativeLayout;

.field private K:Landroid/widget/RelativeLayout;

.field private L:Landroid/view/View;

.field private M:Landroid/widget/RelativeLayout;

.field private N:[Ljava/lang/String;

.field private O:Landroid/widget/RelativeLayout;

.field private P:Landroid/widget/ImageView;

.field private Q:Landroid/widget/RelativeLayout;

.field private R:Landroid/widget/RelativeLayout;

.field private S:Landroid/widget/RelativeLayout;

.field private T:Landroid/widget/ImageView;

.field private U:Landroid/widget/ImageView;

.field private V:Landroid/widget/ImageView;

.field private W:Landroid/widget/ImageView;

.field private X:Landroid/widget/ImageView;

.field private Y:Ljava/lang/String;

.field private Z:Landroid/os/Handler;

.field private a:Landroid/view/View;

.field private aa:Lo/egn;

.field private ab:I

.field private ac:Lo/bgp;

.field private ae:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;

.field private b:Landroid/view/View;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Lo/emr;

.field private f:Lo/egd;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Lo/egd;

.field private j:Ljava/lang/String;

.field private k:Lo/egd;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/LinearLayout;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/widget/ImageView;

.field private r:Landroid/widget/ImageView;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/ImageView;

.field private v:Lcom/huawei/health/sns/model/group/Group;

.field private w:J

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/RelativeLayout;

.field private z:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 114
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    .line 140
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    .line 177
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$d;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    return-void
.end method

.method private a(I)V
    .locals 2

    .line 1388
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->P:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1389
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->T:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1390
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->W:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1391
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->V:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1392
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->U:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1393
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->X:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1394
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 1396
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->P:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1397
    goto :goto_0

    .line 1399
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->T:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1400
    goto :goto_0

    .line 1402
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->W:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1403
    goto :goto_0

    .line 1405
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->V:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1406
    goto :goto_0

    .line 1408
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->U:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1409
    goto :goto_0

    .line 1411
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->X:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1412
    .line 1416
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 805
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->l:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 807
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 809
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->y()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/os/Message;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Landroid/os/Message;)V

    return-void
.end method

.method private b(I)V
    .locals 10

    .line 864
    const-string v3, ""

    .line 865
    const-string v4, ""

    .line 866
    const-string v5, ""

    .line 867
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 868
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_nick_name:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 869
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_modify_nick_name_hint:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 870
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 871
    :cond_0
    if-nez p1, :cond_1

    .line 872
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_edite_group_name:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 873
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_input_group_name:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 874
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 876
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/view/LayoutInflater;

    .line 877
    sget v0, Lcom/huawei/android/sns/R$layout;->group_setting_name_dialog_custom_item:I

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 878
    sget v0, Lcom/huawei/android/sns/R$id;->et_input_content:I

    invoke-virtual {v7, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/EditText;

    .line 879
    invoke-virtual {v8, v4}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 881
    new-instance v9, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-direct {v9, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 882
    invoke-virtual {v9, v3}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 883
    invoke-virtual {v0, v7}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$7;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    .line 884
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_contact_confirm:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;

    invoke-direct {v2, p0, v8, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$9;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/widget/EditText;I)V

    .line 890
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 901
    invoke-virtual {v9}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->A:Lo/egw;

    .line 903
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 904
    invoke-virtual {v8, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 905
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 906
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 907
    invoke-virtual {v8}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 908
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lo/egw$c;->e(Z)V

    goto :goto_1

    .line 910
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/egw$c;->e(Z)V

    goto :goto_1

    .line 913
    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/egw$c;->e(Z)V

    .line 915
    :goto_1
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;

    invoke-direct {v0, p0, v8, v9}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$8;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/widget/EditText;Lo/egw$c;)V

    invoke-virtual {v8, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 958
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->A:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 959
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 6

    .line 757
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 758
    if-eqz v4, :cond_0

    .line 759
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 760
    if-eqz v5, :cond_0

    .line 761
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateGroupInfo group = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 762
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Lcom/huawei/health/sns/model/group/Group;)V

    .line 765
    :cond_0
    return-void
.end method

.method private b(Landroid/widget/EditText;I)V
    .locals 10

    .line 1166
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1167
    if-nez p2, :cond_0

    .line 1169
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1170
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    invoke-direct {p0, v0, v1, v6}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(JLjava/lang/String;)V

    goto :goto_0

    .line 1172
    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 1174
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->x:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1175
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v7

    .line 1177
    :try_start_0
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 1178
    move-object v0, p0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    move-wide v3, v8

    move-object v5, v6

    invoke-direct/range {v0 .. v5}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(JJLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1181
    goto :goto_0

    .line 1179
    :catch_0
    move-exception v8

    .line 1180
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "modifGroupNameDialog:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1184
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/os/Message;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/widget/EditText;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Landroid/widget/EditText;I)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .line 1324
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1326
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    goto/16 :goto_0

    .line 1327
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1328
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    goto :goto_0

    .line 1329
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1330
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    goto :goto_0

    .line 1331
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1332
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    goto :goto_0

    .line 1333
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1334
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    goto :goto_0

    .line 1335
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1336
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    goto :goto_0

    .line 1339
    :cond_5
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " groupType is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1340
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    .line 1342
    :cond_6
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private c()V
    .locals 6

    .line 264
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_create_failed_1029:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 266
    invoke-virtual {v4, v5}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_user_permission_know:I

    .line 267
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 274
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 275
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 276
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 277
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 4

    .line 731
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v2

    .line 732
    if-eqz v2, :cond_2

    .line 733
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 734
    if-eqz v3, :cond_1

    .line 735
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 741
    :cond_0
    invoke-direct {p0, v3}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 743
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->q()V

    goto :goto_0

    .line 747
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->r()V

    .line 750
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 5

    .line 1059
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 1060
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_dimiss_group_tips:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_dismiss_sure:I

    .line 1061
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal:I

    .line 1084
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1090
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 1091
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 1092
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 1093
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/os/Message;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/app/Activity;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    return-object v0
.end method

.method private d(I)V
    .locals 3

    .line 1350
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 1352
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1353
    const-string v0, "healthwalk"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    .line 1354
    goto/16 :goto_1

    .line 1356
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1357
    const-string v0, "run"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    .line 1358
    goto :goto_1

    .line 1360
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1361
    const-string v0, "riding"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    .line 1362
    goto :goto_1

    .line 1364
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1365
    const-string v0, "bodybuilding"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    .line 1366
    goto :goto_1

    .line 1368
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1369
    const-string v0, "swimming"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    .line 1370
    goto :goto_1

    .line 1372
    :pswitch_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1373
    const-string v0, "other"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    .line 1374
    goto :goto_1

    .line 1376
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1377
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    .line 1380
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private d(JJLjava/lang/String;)V
    .locals 6

    .line 1265
    iput-object p5, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->j:Ljava/lang/String;

    .line 1266
    new-instance v0, Lo/atq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atq;-><init>(Landroid/os/Handler;)V

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/atq;->d(JJLjava/lang/String;)V

    .line 1267
    return-void
.end method

.method private d(JLjava/lang/String;)V
    .locals 2

    .line 1206
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->u()V

    .line 1207
    new-instance v0, Lo/atq;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atq;-><init>(Landroid/os/Handler;)V

    const/16 v1, 0x345

    invoke-virtual {v0, v1, p1, p2, p3}, Lo/atq;->c(IJLjava/lang/String;)V

    .line 1208
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 6

    .line 713
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 714
    if-eqz v4, :cond_1

    .line 715
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 716
    if-eqz v5, :cond_1

    .line 717
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 720
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group.getGroupType() == Group.TYPE_FAMILY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 723
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 727
    :cond_1
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 786
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    .line 787
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 789
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(I)V

    return-void
.end method

.method private e(I)V
    .locals 3

    .line 696
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    invoke-virtual {v0, p1, v1, v2}, Lo/atb;->e(IJ)V

    .line 697
    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 3

    .line 1103
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w()V

    .line 1104
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d()V

    .line 1105
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1106
    if-eqz v2, :cond_0

    .line 1107
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1109
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 773
    new-instance v0, Lo/bgg;

    invoke-direct {v0}, Lo/bgg;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v1, p1}, Lo/bgg;->a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/group/Group;)V

    .line 778
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;I)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(I)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Landroid/os/Message;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/os/Handler;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 576
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_main_time_line_walking:I

    .line 577
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_run:I

    .line 578
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_start_track_sport_type_cycle:I

    .line 579
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_type_group_type_workout:I

    .line 580
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id10:I

    .line 581
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_device_setting_other:I

    .line 582
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    .line 585
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 586
    if-nez v3, :cond_0

    .line 587
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->finish()V

    .line 588
    return-void

    .line 590
    :cond_0
    const-string v0, "EXTRA_GROUP_ID"

    const-wide/16 v1, 0x0

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    .line 591
    const-string v0, "EXTRA_NICK_NAME"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->D:Ljava/lang/String;

    .line 592
    const-string v0, "EXTRA_GROUP"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    .line 593
    const-string v0, "groupType"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    .line 594
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 595
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    const-string v1, "healthwalk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 596
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    goto/16 :goto_0

    .line 597
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 598
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    goto :goto_0

    .line 599
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 600
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    goto :goto_0

    .line 601
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 602
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    goto :goto_0

    .line 603
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 604
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    goto :goto_0

    .line 605
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 606
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->N:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    goto :goto_0

    .line 609
    :cond_6
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    .line 611
    :cond_7
    :goto_0
    const-string v0, "groupDesc"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->F:Ljava/lang/String;

    .line 612
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->n()V

    .line 613
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lo/egw;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->A:Lo/egw;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 371
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 373
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 374
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 375
    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupDesc"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 374
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->F:Ljava/lang/String;

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->F:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    new-instance v3, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;

    invoke-direct {v3, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    invoke-static {v0, v1, v2, v3}, Lo/anz;->b(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lo/aog;)V

    .line 402
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Y:Ljava/lang/String;

    return-object v0
.end method

.method private h()V
    .locals 2

    .line 308
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e:Lo/emr;

    .line 309
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 316
    sget v0, Lcom/huawei/android/sns/R$id;->layout_transfer_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->h:Landroid/widget/LinearLayout;

    .line 317
    sget v0, Lcom/huawei/android/sns/R$id;->layout_dismiss_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->o:Landroid/widget/LinearLayout;

    .line 318
    sget v0, Lcom/huawei/android/sns/R$id;->transfer_group_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->i:Lo/egd;

    .line 319
    sget v0, Lcom/huawei/android/sns/R$id;->dissmiss_group_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->k:Lo/egd;

    .line 320
    sget v0, Lcom/huawei/android/sns/R$id;->remove_group_member_containr:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c:Landroid/view/View;

    .line 321
    sget v0, Lcom/huawei/android/sns/R$id;->add_group_member_containr:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b:Landroid/view/View;

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 323
    sget v0, Lcom/huawei/android/sns/R$id;->group_head_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d:Landroid/view/View;

    .line 324
    sget v0, Lcom/huawei/android/sns/R$id;->group_name_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a:Landroid/view/View;

    .line 325
    sget v0, Lcom/huawei/android/sns/R$id;->img_group_head:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->l:Landroid/widget/ImageView;

    .line 326
    sget v0, Lcom/huawei/android/sns/R$id;->group_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->t:Landroid/widget/TextView;

    .line 327
    sget v0, Lcom/huawei/android/sns/R$id;->nick_name_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->y:Landroid/widget/RelativeLayout;

    .line 328
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->y:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 329
    sget v0, Lcom/huawei/android/sns/R$id;->nick_name:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->x:Landroid/widget/TextView;

    .line 330
    sget v0, Lcom/huawei/android/sns/R$id;->quit_group_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->f:Lo/egd;

    .line 331
    sget v0, Lcom/huawei/android/sns/R$id;->layout_quit_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->g:Landroid/widget/LinearLayout;

    .line 332
    sget v0, Lcom/huawei/android/sns/R$id;->last_divider:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->L:Landroid/view/View;

    .line 333
    sget v0, Lcom/huawei/android/sns/R$id;->group_profile_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->I:Landroid/widget/RelativeLayout;

    .line 336
    sget v0, Lcom/huawei/android/sns/R$id;->group_type_container:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->E:Landroid/widget/RelativeLayout;

    .line 337
    sget v0, Lcom/huawei/android/sns/R$id;->group_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    .line 338
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_memb_mng_container:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->R:Landroid/widget/RelativeLayout;

    .line 340
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->k()V

    .line 342
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->D:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->D:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 362
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Ljava/lang/String;)V

    .line 364
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d(I)V

    .line 365
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->F:Ljava/lang/String;

    return-object v0
.end method

.method private i()V
    .locals 4

    .line 422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 423
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 425
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 426
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->m:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 427
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->u:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 429
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->R:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 430
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->s:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 432
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->L:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 434
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 435
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->o:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 436
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->i:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 437
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->k:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 438
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 439
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->i:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 440
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->k:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 443
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 444
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 445
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->E:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 447
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->E:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->f:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->I:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->I:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 513
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 514
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->m:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 515
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->q:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 516
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->u:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 517
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->R:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 518
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->r:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 519
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->s:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 520
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->L:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 522
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 523
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->o:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 524
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->i:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 525
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->k:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 526
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 527
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 528
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 531
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->f:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 532
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->f:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 534
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->I:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 535
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->E:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 538
    :cond_1
    :goto_0
    return-void
.end method

.method private k()V
    .locals 2

    .line 544
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_head_tips_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->p:Landroid/widget/ImageView;

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_name_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->m:Landroid/widget/ImageView;

    .line 546
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_profile_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->n:Landroid/widget/ImageView;

    .line 547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->nick_name_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->q:Landroid/widget/ImageView;

    .line 548
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_type_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->u:Landroid/widget/ImageView;

    .line 550
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->add_group_member_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->r:Landroid/widget/ImageView;

    .line 551
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->remove_group_member_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->s:Landroid/widget/ImageView;

    .line 553
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 554
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 555
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 556
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 557
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 558
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->u:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 559
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->r:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 560
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->s:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 562
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 563
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->m:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 564
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->n:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 565
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->q:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 566
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->u:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 567
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->r:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 568
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->s:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 570
    :goto_0
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v()V

    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)J
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    return-wide v0
.end method

.method private l()V
    .locals 2

    .line 670
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/axf;->d(I)V

    .line 671
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->K:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private m()V
    .locals 1

    .line 689
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e(I)V

    .line 690
    return-void
.end method

.method private n()V
    .locals 5

    .line 639
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFeatureBroadcastReciver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 640
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ae:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 641
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ae:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;

    .line 643
    :cond_0
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 644
    const-string v0, "HEALTH_ACTION_TRANSFER_GROUP_SUCCESS"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ae:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 646
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->u()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->M:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private o()V
    .locals 4

    .line 677
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ac:Lo/bgp;

    .line 678
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ac:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 679
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lo/aoh;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->C:Lo/aoh;

    return-object v0
.end method

.method private p()V
    .locals 2

    .line 682
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ac:Lo/bgp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 683
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ac:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 684
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ac:Lo/bgp;

    .line 686
    :cond_0
    return-void
.end method

.method static synthetic q(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Lo/egw;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->B:Lo/egw;

    return-object v0
.end method

.method private q()V
    .locals 5

    .line 795
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    const/16 v3, 0x351

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 796
    return-void
.end method

.method static synthetic r(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Q:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private r()V
    .locals 5

    .line 703
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    const/16 v3, 0x349

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 704
    return-void
.end method

.method static synthetic s(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->J:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private s()V
    .locals 8

    .line 965
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->H:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    .line 966
    invoke-direct {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(Ljava/lang/String;)V

    .line 967
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/LayoutInflater;

    .line 968
    sget v0, Lcom/huawei/android/sns/R$layout;->health_show_group_type_view:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 969
    sget v0, Lcom/huawei/android/sns/R$id;->layout_group_type_walk:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->M:Landroid/widget/RelativeLayout;

    .line 970
    sget v0, Lcom/huawei/android/sns/R$id;->iv_group_type_walk:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->P:Landroid/widget/ImageView;

    .line 971
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->M:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 972
    sget v0, Lcom/huawei/android/sns/R$id;->layout_group_type_run:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->K:Landroid/widget/RelativeLayout;

    .line 973
    sget v0, Lcom/huawei/android/sns/R$id;->iv_group_type_run:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->T:Landroid/widget/ImageView;

    .line 974
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->K:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 975
    sget v0, Lcom/huawei/android/sns/R$id;->layout_group_type_cycle:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->J:Landroid/widget/RelativeLayout;

    .line 976
    sget v0, Lcom/huawei/android/sns/R$id;->iv_group_type_cycle:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->W:Landroid/widget/ImageView;

    .line 977
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->J:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 978
    sget v0, Lcom/huawei/android/sns/R$id;->layout_group_type_fitness:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Q:Landroid/widget/RelativeLayout;

    .line 979
    sget v0, Lcom/huawei/android/sns/R$id;->iv_group_type_fitness:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->V:Landroid/widget/ImageView;

    .line 980
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Q:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 981
    sget v0, Lcom/huawei/android/sns/R$id;->layout_group_type_swimming:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->O:Landroid/widget/RelativeLayout;

    .line 982
    sget v0, Lcom/huawei/android/sns/R$id;->iv_group_type_swimming:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->U:Landroid/widget/ImageView;

    .line 983
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->O:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 984
    sget v0, Lcom/huawei/android/sns/R$id;->layout_group_type_other:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->S:Landroid/widget/RelativeLayout;

    .line 985
    sget v0, Lcom/huawei/android/sns/R$id;->iv_group_type_other:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->X:Landroid/widget/ImageView;

    .line 986
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->S:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$1;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 987
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ab:I

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a(I)V

    .line 989
    new-instance v7, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-direct {v7, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 990
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_type_group_type:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 991
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v6, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal_ios_btn:I

    .line 992
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$10;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$10;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 997
    invoke-virtual {v7}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->B:Lo/egw;

    .line 998
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->B:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 999
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGroupTypeDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1000
    return-void
.end method

.method static synthetic t(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->O:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private t()V
    .locals 5

    .line 1008
    new-instance v4, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-direct {v4, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 1009
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_quit_group_or_not:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_firmware_upgrade_exit:I

    .line 1010
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$14;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_button_cancal_ios_btn:I

    .line 1041
    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$6;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$6;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egy$b;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egy$b;

    .line 1047
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 1048
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 1049
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 1050
    return-void
.end method

.method static synthetic u(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->S:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private u()V
    .locals 3

    .line 1214
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1215
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    .line 1216
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_waiting:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1217
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 1218
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1221
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1222
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 1224
    :cond_1
    return-void
.end method

.method private v()V
    .locals 2

    .line 1283
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_network_error:I

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 1284
    return-void
.end method

.method private w()V
    .locals 2

    .line 1230
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1231
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 1232
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->aa:Lo/egn;

    .line 1234
    :cond_0
    return-void
.end method

.method private y()V
    .locals 2

    .line 1273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1274
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->j:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->D:Ljava/lang/String;

    .line 1275
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->x:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1277
    :cond_0
    return-void
.end method

.method static synthetic y(Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->g()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 4

    .line 1251
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "quitWorkerThread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1252
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->C:Lo/aoh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/aoh;->a(Landroid/os/Handler;)V

    .line 1253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->C:Lo/aoh;

    invoke-virtual {v0}, Lo/aoh;->quit()Z

    .line 1254
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->C:Lo/aoh;

    .line 1255
    return-void
.end method

.method protected b()V
    .locals 4

    .line 1241
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initWorkerThread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1242
    new-instance v0, Lo/aoh;

    const-string v1, "Group Handler Thread"

    invoke-direct {v0, v1}, Lo/aoh;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->C:Lo/aoh;

    .line 1243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->C:Lo/aoh;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->Z:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/aoh;->a(Landroid/os/Handler;)V

    .line 1244
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->C:Lo/aoh;

    invoke-virtual {v0}, Lo/aoh;->start()V

    .line 1245
    return-void
.end method

.method public d()V
    .locals 1

    .line 1190
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->A:Lo/egw;

    if-eqz v0, :cond_0

    .line 1191
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->A:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 1193
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 410
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    .line 411
    const/4 v3, 0x0

    .line 412
    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    .line 413
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 415
    :cond_0
    if-lez v3, :cond_1

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, p1

    :goto_1
    return-object v0
.end method

.method public e()V
    .locals 4

    .line 658
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ae:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;

    if-eqz v0, :cond_0

    .line 660
    const-string v0, "Group_HealthGroupSettingActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver mReceiver != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 661
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->ae:Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity$c;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 664
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 813
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->k:Lo/egd;

    if-ne p1, v0, :cond_0

    .line 814
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c(Lcom/huawei/health/sns/model/group/Group;)V

    goto/16 :goto_0

    .line 815
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->i:Lo/egd;

    if-ne p1, v0, :cond_1

    .line 816
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 817
    const-string v0, "EXTRA_GROUP_ID"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 818
    const-string v0, "EXTRA_MEMB_LIST_TYPE"

    const/4 v1, 0x3

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 819
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 820
    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b:Landroid/view/View;

    if-ne p1, v0, :cond_2

    .line 821
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 822
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 823
    const-string v0, "bundleKeyGroupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    invoke-virtual {v4, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 824
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 825
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 826
    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->c:Landroid/view/View;

    if-ne p1, v0, :cond_3

    .line 827
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 828
    const-string v0, "EXTRA_GROUP_ID"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 829
    const-string v0, "EXTRA_MEMB_LIST_TYPE"

    const/4 v1, 0x1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 830
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 831
    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->d:Landroid/view/View;

    if-ne p1, v0, :cond_4

    .line 832
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 833
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupHeadImageActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 834
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 835
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->startActivity(Landroid/content/Intent;)V

    .line 836
    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a:Landroid/view/View;

    if-ne p1, v0, :cond_5

    .line 838
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(I)V

    goto :goto_0

    .line 839
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->y:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_6

    .line 842
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b(I)V

    goto :goto_0

    .line 843
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->I:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_7

    .line 845
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-direct {v3, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 846
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->v:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 847
    const-string v0, "groupDesc"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->F:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 848
    const-string v0, "groupType"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->G:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 849
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 850
    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->f:Lo/egd;

    if-ne p1, v0, :cond_8

    .line 851
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->t()V

    goto :goto_0

    .line 852
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->E:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_9

    .line 854
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->s()V

    .line 856
    :cond_9
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 281
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 282
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_group_setting:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->setContentView(I)V

    .line 283
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->z:Landroid/app/Activity;

    .line 284
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->f()V

    .line 285
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->h()V

    .line 286
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->i()V

    .line 287
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->l()V

    .line 288
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->o()V

    .line 289
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->b()V

    .line 290
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 650
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->e()V

    .line 651
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->p()V

    .line 652
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->a()V

    .line 653
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->w()V

    .line 654
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 655
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 294
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 295
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;->m()V

    .line 296
    return-void
.end method

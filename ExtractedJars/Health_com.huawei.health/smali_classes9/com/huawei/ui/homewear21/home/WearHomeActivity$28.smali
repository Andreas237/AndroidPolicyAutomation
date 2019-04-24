.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 3436
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 15

    .line 3439
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3440
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Activity is finishing or null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3441
    return-void

    .line 3443
    :cond_0
    move-object/from16 v0, p1

    iget v6, v0, Landroid/os/Message;->what:I

    .line 3444
    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_1

    .line 3446
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->A(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3447
    goto/16 :goto_2

    .line 3450
    :sswitch_1
    invoke-static {}, Lo/dhd;->a()Lo/dhd;

    .line 3451
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cwf;->a(Landroid/content/Context;)Lo/cwf;

    .line 3452
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cvw;->e(Landroid/content/Context;)Lo/cvw;

    .line 3453
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ddd;->c(Landroid/content/Context;)Lo/ddd;

    .line 3455
    goto/16 :goto_2

    .line 3457
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3458
    goto/16 :goto_2

    .line 3460
    :sswitch_3
    goto/16 :goto_2

    .line 3463
    :sswitch_4
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/etq;->a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3464
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->I(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3465
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3466
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v7

    .line 3467
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    new-array v1, v1, [Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d([Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 3468
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 3469
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0, v7}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V

    .line 3471
    goto/16 :goto_2

    .line 3472
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V

    .line 3473
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceInfo is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3476
    goto/16 :goto_2

    .line 3479
    :sswitch_5
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter GET_BATTETY_LEVEL"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3480
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28$1;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;)V

    invoke-virtual {v0, v1}, Lo/etq;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3491
    goto/16 :goto_2

    .line 3493
    :sswitch_6
    move-object/from16 v0, p1

    iget v7, v0, Landroid/os/Message;->arg1:I

    .line 3494
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v7, v1}, Lo/eny;->c(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3495
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->H(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/TextView;

    move-result-object v0

    int-to-double v1, v7

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3496
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->G(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3497
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->H(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3498
    const/16 v0, 0xa

    if-gt v7, v0, :cond_2

    .line 3499
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->H(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_dialog_red_btn_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_2

    .line 3501
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->H(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/homewear21/R$color;->common_white_90alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 3503
    goto/16 :goto_2

    .line 3505
    :sswitch_7
    goto/16 :goto_2

    .line 3507
    :sswitch_8
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->E(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3508
    goto/16 :goto_2

    .line 3510
    :sswitch_9
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->F(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3511
    goto/16 :goto_2

    .line 3513
    :sswitch_a
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->h()V

    .line 3514
    goto/16 :goto_2

    .line 3516
    :sswitch_b
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    move-object/from16 v2, p1

    iget-object v2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/16 v3, 0xb

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Z)V

    .line 3517
    goto/16 :goto_2

    .line 3519
    :sswitch_c
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    move-object/from16 v2, p1

    iget-object v2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Z)V

    .line 3520
    goto/16 :goto_2

    .line 3522
    :sswitch_d
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    move-object/from16 v2, p1

    iget-object v2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x2

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Z)V

    .line 3523
    goto/16 :goto_2

    .line 3525
    :sswitch_e
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_not_support_gold_card:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 3526
    goto/16 :goto_2

    .line 3528
    :sswitch_f
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_confirm_network_whether_connected:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 3529
    goto/16 :goto_2

    .line 3531
    :sswitch_10
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_main_sns_member_account_has_been_effective:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 3532
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Account has been effective, please login again"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3533
    goto/16 :goto_2

    .line 3535
    :sswitch_11
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_main_sns_member_activation_no_get_my_user_infor_failure:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 3536
    goto/16 :goto_2

    .line 3538
    :sswitch_12
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_restore_factory_settings_low_battery_dialog_msg:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 3539
    goto/16 :goto_2

    .line 3541
    :sswitch_13
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e()V

    .line 3542
    goto/16 :goto_2

    .line 3544
    :sswitch_14
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "reset factory success"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3545
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->g(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/enz;

    move-result-object v0

    invoke-virtual {v0}, Lo/enz;->c()V

    .line 3546
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b()V

    .line 3547
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->L(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3548
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->b(Ljava/lang/String;)V

    .line 3549
    goto/16 :goto_2

    .line 3551
    :sswitch_15
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_plugin_menu_reset_failed:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 3552
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b()V

    .line 3553
    goto/16 :goto_2

    .line 3555
    :sswitch_16
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, p1

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/util/List;)V

    .line 3556
    goto/16 :goto_2

    .line 3558
    :sswitch_17
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_main_sns_member_activation_get_my_user_infor:I

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;I)V

    .line 3559
    goto/16 :goto_2

    .line 3561
    :sswitch_18
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b()V

    .line 3562
    goto/16 :goto_2

    .line 3564
    :sswitch_19
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    iget-object v1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->p(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/util/ArrayList;

    move-result-object v1

    move-object/from16 v2, p1

    iget-object v2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/16 v3, 0xf

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/util/ArrayList;Z)V

    .line 3565
    goto/16 :goto_2

    .line 3567
    :sswitch_1a
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, p1

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 3568
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, p1

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 3569
    goto/16 :goto_2

    .line 3571
    :sswitch_1b
    goto/16 :goto_2

    .line 3573
    :sswitch_1c
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "MSG_RETRY_REFRESH_SETTING_LIST"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3574
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->D(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3575
    goto/16 :goto_2

    .line 3577
    :sswitch_1d
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b()V

    .line 3578
    goto/16 :goto_2

    .line 3580
    :sswitch_1e
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->J(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3581
    goto/16 :goto_2

    .line 3583
    :sswitch_1f
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->M(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3584
    goto/16 :goto_2

    .line 3586
    :sswitch_20
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->K(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3587
    goto/16 :goto_2

    .line 3589
    :sswitch_21
    goto/16 :goto_2

    .line 3591
    :sswitch_22
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0a\u4f20log \u8d85\u65f6"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3593
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->N(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_6

    .line 3594
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0a\u4f20log \u8d85\u65f6 toast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3595
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 3596
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 3597
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    goto/16 :goto_2

    .line 3601
    :sswitch_23
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->logUploadFinish()Z

    move-result v8

    .line 3602
    if-eqz v8, :cond_3

    .line 3603
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUploadLogResultBroadcastReceiver: log upload success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3604
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_success:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 3605
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 3606
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 3607
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3fe

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto/16 :goto_2

    .line 3611
    :cond_3
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6587\u4ef6\u6ca1\u4e0a\u4f20\u5b8c\u6bd5\uff0c\u7b49\u5f85\u6587\u4ef6\u4e0a\u4f20"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3612
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v9

    .line 3613
    const/16 v0, 0x3fd

    iput v0, v9, Landroid/os/Message;->what:I

    .line 3614
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v1, 0x927c0

    invoke-virtual {v0, v9, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 3616
    goto/16 :goto_2

    .line 3618
    :sswitch_24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 3620
    :try_start_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Crowd_test_last_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    .line 3621
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearHomeActivity  curTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", lastTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3622
    sub-long v0, v9, v11

    const-wide/32 v2, 0x1b7740

    cmp-long v0, v2, v0

    if-lez v0, :cond_4

    .line 3623
    return-void

    .line 3627
    :cond_4
    goto :goto_0

    .line 3625
    :catch_0
    move-exception v11

    .line 3626
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WearHomeActivity... e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3629
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Crowd_test_last_time"

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 3631
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v11

    .line 3632
    new-instance v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28$2;

    invoke-direct {v0, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28$2;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;)V

    const/4 v1, 0x0

    invoke-virtual {v11, v1, v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getCrowdTestAndMaint(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V

    .line 3646
    goto/16 :goto_2

    .line 3648
    :sswitch_25
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, p1

    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Ljava/lang/String;)V

    .line 3649
    goto/16 :goto_2

    .line 3651
    :sswitch_26
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    move-object/from16 v1, p1

    iget v1, v1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(I)V

    .line 3652
    goto/16 :goto_2

    .line 3654
    :sswitch_27
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DataDeviceInfo msg.obj= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p1

    iget-object v3, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3655
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Lcom/huawei/datatype/DataDeviceInfo;

    .line 3656
    invoke-static {}, Lo/dce;->c()Lo/dce;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dce;->c(I)V

    .line 3657
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0, v12}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->e(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Lcom/huawei/datatype/DataDeviceInfo;)V

    .line 3658
    goto :goto_2

    .line 3660
    :sswitch_28
    move-object/from16 v0, p1

    iget v13, v0, Landroid/os/Message;->arg1:I

    .line 3661
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    .line 3662
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->R(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3663
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0, v13, v14}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/lang/String;)V

    goto :goto_2

    .line 3665
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3666
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0, v13, v14}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;ILjava/lang/String;)V

    .line 3667
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0, v14}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->c(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 3670
    goto :goto_2

    .line 3672
    :sswitch_29
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->K(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 3673
    goto :goto_2

    .line 3675
    :goto_1
    const-string v0, "MainUI"

    const-string v1, "WearHomeActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter default"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3678
    :cond_6
    :goto_2
    move-object/from16 v0, p1

    invoke-super {p0, v0}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 3679
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_b
        0x2 -> :sswitch_c
        0x3 -> :sswitch_e
        0x4 -> :sswitch_f
        0x5 -> :sswitch_10
        0x6 -> :sswitch_11
        0x7 -> :sswitch_d
        0x8 -> :sswitch_14
        0x9 -> :sswitch_12
        0xa -> :sswitch_16
        0xb -> :sswitch_15
        0xc -> :sswitch_17
        0xd -> :sswitch_18
        0xe -> :sswitch_19
        0xf -> :sswitch_13
        0x10 -> :sswitch_1d
        0x11 -> :sswitch_0
        0x12 -> :sswitch_1e
        0x13 -> :sswitch_1f
        0x18 -> :sswitch_20
        0x3e9 -> :sswitch_4
        0x3ea -> :sswitch_5
        0x3eb -> :sswitch_6
        0x3ec -> :sswitch_7
        0x3ef -> :sswitch_8
        0x3f0 -> :sswitch_9
        0x3f1 -> :sswitch_a
        0x3f2 -> :sswitch_2
        0x3f3 -> :sswitch_1a
        0x3f5 -> :sswitch_1b
        0x3f6 -> :sswitch_1c
        0x3f8 -> :sswitch_3
        0x3fa -> :sswitch_1
        0x3fc -> :sswitch_21
        0x3fd -> :sswitch_22
        0x3fe -> :sswitch_23
        0x3ff -> :sswitch_24
        0x400 -> :sswitch_25
        0x401 -> :sswitch_26
        0x402 -> :sswitch_28
        0x403 -> :sswitch_29
        0x409 -> :sswitch_27
    .end sparse-switch
.end method

.class public Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;
    }
.end annotation


# static fields
.field private static final BIND_CARD_BINDING:I = 0xa

.field private static final BIND_CARD_FAIL:I = 0x1

.field private static final BIND_CARD_PROGRESS:I = 0xe

.field private static final BIND_CARD_SUCCESS:I = 0x0

.field private static final PERCENT_MARGIN_TOP:F = 0.3f


# instance fields
.field private bindCardResult:Landroid/widget/TextView;

.field private bindCardResultCode:Landroid/widget/TextView;

.field private final handler:Landroid/os/Handler;

.field private ll_ani_view:Landroid/widget/LinearLayout;

.field private ll_result:Landroid/widget/LinearLayout;

.field private nextButton:Lo/egd;

.field private nfcBindCardSuccessFg:Landroid/widget/ImageView;

.field private pro:I

.field private progress:Landroid/widget/ProgressBar;

.field private successListener:Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 101
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->pro:I

    .line 111
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->handler:Landroid/os/Handler;

    .line 103
    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;)V
    .locals 1

    .line 106
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->pro:I

    .line 111
    new-instance v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->handler:Landroid/os/Handler;

    .line 107
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->successListener:Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;

    .line 109
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)I
    .locals 1

    .line 41
    iget v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->pro:I

    return v0
.end method

.method static synthetic access$002(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)I
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->pro:I

    return p1
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/ProgressBar;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->progress:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;I)Ljava/lang/String;
    .locals 1

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->ll_ani_view:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/LinearLayout;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->ll_result:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->progressStart()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->successListener:Lcom/huawei/nfc/carrera/ui/bindcard/ShownBindSuccessEndListener;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/ImageView;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->nfcBindCardSuccessFg:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Lo/egd;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->nextButton:Lo/egd;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/TextView;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->bindCardResult:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;)Landroid/widget/TextView;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->bindCardResultCode:Landroid/widget/TextView;

    return-object v0
.end method

.method private dealBindCardErrorCode(I)Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;
    .locals 2

    .line 501
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getErrorInfoOnce(I)Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;

    move-result-object v1

    .line 503
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 505
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getErrorInfoSecondTime(I)Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;

    move-result-object v1

    .line 507
    :cond_0
    return-object v1
.end method

.method private getErrorInfoOnce(I)Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;
    .locals 3

    .line 512
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===getErrorInfoOnce resultCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 513
    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;-><init>()V

    .line 514
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 517
    :pswitch_0
    const/4 v0, 0x2

    iput v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 518
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_card_information_check:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 519
    goto :goto_1

    .line 521
    :pswitch_1
    const/4 v0, 0x3

    iput v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 522
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_no_network_failed:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 523
    goto :goto_1

    .line 525
    :pswitch_2
    const/4 v0, 0x3

    iput v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 526
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_instruction_delete_desc_new:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 527
    goto :goto_1

    .line 530
    :pswitch_3
    const/4 v0, 0x1

    iput v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 531
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_overcount:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 532
    goto :goto_1

    .line 534
    :pswitch_4
    const/4 v0, 0x1

    iput v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 535
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_apply_overcount:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 536
    goto :goto_1

    .line 538
    :goto_0
    :pswitch_5
    const/4 v2, 0x0

    .line 541
    :goto_1
    return-object v2

    :pswitch_data_0
    .packed-switch -0x10
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private getErrorInfoSecondTime(I)Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;
    .locals 2

    .line 546
    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;-><init>()V

    .line 547
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 550
    :pswitch_0
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 551
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_card_installed:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 552
    goto/16 :goto_1

    .line 554
    :pswitch_1
    const/4 v0, 0x1

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 555
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_open_reach_bank_limit:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 556
    goto/16 :goto_1

    .line 558
    :pswitch_2
    const/4 v0, 0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 559
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_account_no_permission:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 560
    goto/16 :goto_1

    .line 562
    :pswitch_3
    const/4 v0, 0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 563
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_account_no_cellphone:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 564
    goto :goto_1

    .line 566
    :pswitch_4
    const/4 v0, 0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 567
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_account_info_invalid:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 568
    goto :goto_1

    .line 570
    :pswitch_5
    const/4 v0, 0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 571
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_card_no_permission:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 572
    goto :goto_1

    .line 574
    :pswitch_6
    const/4 v0, 0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 575
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_card_fail_customer_no_permission:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 576
    goto :goto_1

    .line 578
    :pswitch_7
    const/4 v0, 0x5

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 579
    sget v0, Lcom/huawei/wallet/R$string;->nfc_rebind_fail_add_again:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 580
    goto :goto_1

    .line 582
    :pswitch_8
    const/4 v0, 0x6

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 583
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bind_fail_contact_unionpay:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 584
    goto :goto_1

    .line 586
    :goto_0
    :pswitch_9
    const/4 v0, 0x4

    iput v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->oprType:I

    .line 587
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_others_error:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getStringByID(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 590
    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch -0x14
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_6
        :pswitch_9
        :pswitch_1
        :pswitch_9
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_9
        :pswitch_0
    .end packed-switch
.end method

.method private getStringByID(I)Ljava/lang/String;
    .locals 1

    .line 630
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private initViews(Landroid/view/View;)V
    .locals 1

    .line 309
    sget v0, Lcom/huawei/wallet/R$id;->ll_ani_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->ll_ani_view:Landroid/widget/LinearLayout;

    .line 311
    sget v0, Lcom/huawei/wallet/R$id;->progress:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->progress:Landroid/widget/ProgressBar;

    .line 320
    sget v0, Lcom/huawei/wallet/R$id;->ll_result:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->ll_result:Landroid/widget/LinearLayout;

    .line 321
    sget v0, Lcom/huawei/wallet/R$id;->nfc_bind_card_success_fg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->nfcBindCardSuccessFg:Landroid/widget/ImageView;

    .line 322
    sget v0, Lcom/huawei/wallet/R$id;->bind_card_result:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->bindCardResult:Landroid/widget/TextView;

    .line 323
    sget v0, Lcom/huawei/wallet/R$id;->bind_card_result_code:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->bindCardResultCode:Landroid/widget/TextView;

    .line 324
    sget v0, Lcom/huawei/wallet/R$id;->nfc_next_step_button:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->nextButton:Lo/egd;

    .line 326
    return-void
.end method

.method private openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 650
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 651
    return-void
.end method

.method private progressStart()V
    .locals 2

    .line 268
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->handler:Landroid/os/Handler;

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 270
    return-void
.end method


# virtual methods
.method public bindFailed(ILjava/lang/String;I)V
    .locals 6

    .line 472
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->dealBindCardErrorCode(I)Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;

    move-result-object v3

    .line 474
    const/4 v0, -0x3

    if-eq v0, p1, :cond_0

    const/4 v0, -0x4

    if-eq v0, p1, :cond_0

    .line 477
    iget-object v4, v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    .line 478
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 479
    const-string v0, "fail_reason"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    const-string v0, "fail_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    const-string v0, "issuerId"

    invoke-interface {v5, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    const-string v0, "cardType"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    const v0, 0x3611a45f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v5, v4, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 486
    :cond_0
    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 v0, -0x2

    if-eq p1, v0, :cond_1

    const/16 v0, -0xe

    if-eq p1, v0, :cond_1

    const/16 v0, -0x12

    if-eq p1, v0, :cond_1

    const/16 v0, -0x13

    if-eq p1, v0, :cond_1

    const/16 v0, -0x63

    if-ne p1, v0, :cond_2

    .line 493
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment$ErrorInfo;->strErrorMsg:Ljava/lang/String;

    invoke-direct {p0, p2, v0, v1, p3}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 496
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->handler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->handler:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 497
    return-void
.end method

.method public binding()V
    .locals 2

    .line 461
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->handler:Landroid/os/Handler;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 462
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 300
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_fragment_bind_card:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 301
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->initViews(Landroid/view/View;)V

    .line 302
    return-object v2
.end method

.method public onDestroyView()V
    .locals 0

    .line 616
    invoke-super {p0}, Landroid/app/Fragment;->onDestroyView()V

    .line 620
    return-void
.end method

.method public reBind()V
    .locals 2

    .line 596
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->nextButton:Lo/egd;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 597
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->ll_ani_view:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 598
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->ll_result:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 599
    return-void
.end method

.method public showBindSuccessView(Ljava/lang/String;I)V
    .locals 2

    .line 466
    const-string v0, "0"

    const-string v1, ""

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 467
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardProgressFragment;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 468
    return-void
.end method

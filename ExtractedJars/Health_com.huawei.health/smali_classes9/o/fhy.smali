.class public Lo/fhy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/CheckBox;

.field private b:Lo/egw;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/CheckBox;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private u:Lo/egv;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Landroid/content/Context;Landroid/view/View;)V
    .locals 9

    .line 146
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_ele:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->c:Landroid/widget/TextView;

    .line 147
    iget-object v0, p0, Lo/fhy;->c:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 148
    iget-object v0, p0, Lo/fhy;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 150
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_use_agreement:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 151
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_privacy_statement:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 152
    new-instance v5, Landroid/text/SpannableString;

    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_user_agreement:I

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 153
    invoke-virtual {v5}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 154
    new-instance v7, Lo/fhs;

    const-string v0, "VmallUserAgreement"

    invoke-direct {v7, p1, v0}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 155
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 156
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v6

    .line 155
    const/16 v2, 0x21

    invoke-virtual {v5, v0, v6, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 157
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v6

    const/16 v1, 0x11

    invoke-virtual {v5, v7, v6, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 159
    invoke-virtual {v5}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 160
    new-instance v8, Lo/fhs;

    const-string v0, "VmallPrivacy"

    invoke-direct {v8, p1, v0}, Lo/fhs;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 161
    new-instance v0, Landroid/text/style/TypefaceSpan;

    const-string v1, "HwChinese-medium"

    invoke-direct {v0, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v6

    .line 161
    const/16 v2, 0x21

    invoke-virtual {v5, v0, v6, v1, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 163
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v6

    const/16 v1, 0x11

    invoke-virtual {v5, v8, v6, v0, v1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 165
    iget-object v0, p0, Lo/fhy;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    return-void
.end method

.method static synthetic d(Lo/fhy;Lo/egv;)Lo/egv;
    .locals 0

    .line 31
    iput-object p1, p0, Lo/fhy;->u:Lo/egv;

    return-object p1
.end method

.method static synthetic e(Lo/fhy;)Lo/egv;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/fhy;->u:Lo/egv;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 7

    .line 42
    if-nez p1, :cond_0

    .line 43
    return-void

    .line 45
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$layout;->vmall_services_custom_view_dialog:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 46
    invoke-static {p1, v3}, Lo/fjg;->d(Landroid/content/Context;Landroid/view/View;)V

    .line 47
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_agree_dialog_recommend_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/fhy;->e:Landroid/widget/LinearLayout;

    .line 50
    iget-object v0, p0, Lo/fhy;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 52
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_one:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->f:Landroid/widget/TextView;

    .line 53
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_two:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->i:Landroid/widget/TextView;

    .line 54
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_three:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->g:Landroid/widget/TextView;

    .line 55
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_four:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->h:Landroid/widget/TextView;

    .line 56
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_five:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->k:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_six:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->p:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_seven:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->m:Landroid/widget/TextView;

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_eight:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->l:Landroid/widget/TextView;

    .line 60
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_nine:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->o:Landroid/widget/TextView;

    .line 61
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_service_item_ten:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/fhy;->n:Landroid/widget/TextView;

    .line 64
    iget-object v0, p0, Lo/fhy;->f:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_public_one:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object v0, p0, Lo/fhy;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_public_two:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    iget-object v0, p0, Lo/fhy;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_public_three:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    iget-object v0, p0, Lo/fhy;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_public_four:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    iget-object v0, p0, Lo/fhy;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_public_five:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lo/fhy;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_public_six:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object v0, p0, Lo/fhy;->m:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_public_seven:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    iget-object v0, p0, Lo/fhy;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_server_info:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v0, p0, Lo/fhy;->o:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_agreement_background:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v0, p0, Lo/fhy;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_unagreement:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_agree_dialog_user_plan_box:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/fhy;->a:Landroid/widget/CheckBox;

    .line 77
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_agree_dialog_recommend_box:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/fhy;->d:Landroid/widget/CheckBox;

    .line 78
    iget-object v0, p0, Lo/fhy;->a:Landroid/widget/CheckBox;

    invoke-static {}, Lo/dgk;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 79
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "health_product_recommend"

    invoke-static {p1, v0, v1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 81
    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    iget-object v0, p0, Lo/fhy;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 84
    :cond_1
    iget-object v0, p0, Lo/fhy;->d:Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 87
    :goto_0
    iget-object v0, p0, Lo/fhy;->a:Landroid/widget/CheckBox;

    new-instance v1, Lo/fhy$5;

    invoke-direct {v1, p0, p1}, Lo/fhy$5;-><init>(Lo/fhy;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 99
    iget-object v0, p0, Lo/fhy;->d:Landroid/widget/CheckBox;

    new-instance v1, Lo/fhy$2;

    invoke-direct {v1, p0}, Lo/fhy$2;-><init>(Lo/fhy;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 105
    invoke-direct {p0, p1, v3}, Lo/fhy;->b(Landroid/content/Context;Landroid/view/View;)V

    .line 106
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_privacy_revoke_auth:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    .line 107
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hwh_vmall_privacy_change_notice:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 109
    new-instance v0, Lo/egw$c;

    invoke-direct {v0, p1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 110
    invoke-virtual {v0, v6}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 111
    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lo/egw$c;->b(Landroid/view/View;II)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    .line 112
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/fhy$1;

    invoke-direct {v2, p0}, Lo/fhy$1;-><init>(Lo/fhy;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    new-instance v1, Lo/fhy$3;

    invoke-direct {v1, p0, p1}, Lo/fhy$3;-><init>(Lo/fhy;Landroid/content/Context;)V

    .line 118
    invoke-virtual {v0, v5, v1}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/fhy;->b:Lo/egw;

    .line 140
    iget-object v0, p0, Lo/fhy;->b:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 141
    iget-object v0, p0, Lo/fhy;->b:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 142
    return-void
.end method

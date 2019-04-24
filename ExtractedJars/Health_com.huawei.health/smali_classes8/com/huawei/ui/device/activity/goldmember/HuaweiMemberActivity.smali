.class public Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static c:Ljava/lang/String;

.field private static e:Ljava/lang/String;


# instance fields
.field a:Lo/eoe;

.field private b:Lo/egd;

.field d:Landroid/os/Handler;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/content/Context;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/CheckBox;

.field private l:I

.field private m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const-string v0, "HuaweiMemberActivity"

    sput-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e:Ljava/lang/String;

    .line 40
    const-string v0, "putExtraMemAdLevel"

    sput-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->m:Ljava/lang/String;

    .line 200
    new-instance v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$5;-><init>(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Landroid/widget/CheckBox;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->k:Landroid/widget/CheckBox;

    return-object v0
.end method

.method private a()V
    .locals 8

    .line 85
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_huawei_member:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->setContentView(I)V

    .line 87
    sget v0, Lcom/huawei/ui/device/R$id;->vip_immediate_activation:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b:Lo/egd;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    sget v0, Lcom/huawei/ui/device/R$id;->VIP_agreement_textView:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->h:Landroid/widget/TextView;

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_golden_member_user_agreement:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->g:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_huawei_member_agree_to:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 93
    const/4 v0, 0x1

    new-array v6, v0, [I

    .line 94
    invoke-virtual {v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v6, v1

    .line 95
    new-instance v7, Landroid/text/SpannableString;

    invoke-direct {v7, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 96
    new-instance v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$4;-><init>(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)V

    const/4 v1, 0x0

    aget v1, v6, v1

    const/4 v2, 0x0

    aget v2, v6, v2

    .line 110
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    .line 96
    const/16 v3, 0x21

    invoke-virtual {v7, v0, v1, v2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 111
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->h:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 113
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_enjoy_wonderful_interest_textView:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->i:Landroid/widget/TextView;

    .line 114
    sget v0, Lcom/huawei/ui/device/R$id;->main_sns_enjoy_wonderful_interest_textView_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->f:Landroid/widget/TextView;

    .line 116
    sget v0, Lcom/huawei/ui/device/R$id;->VIP_agreement_checkBox:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->k:Landroid/widget/CheckBox;

    .line 117
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 192
    new-instance v2, Lo/eoc;

    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->g:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/eoc;-><init>(Landroid/content/Context;)V

    .line 193
    new-instance v3, Landroid/content/Intent;

    const-class v0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-direct {v3, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 194
    const-string v0, "LegalInfoWebViewActivity.URL_TYPE_KEY"

    const/16 v1, 0x3ea

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 195
    const-string v0, "LegalInfoWebViewActivity.TITLE_KEY"

    invoke-virtual {v3, v0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 196
    const-string v0, "LegalInfoWebViewActivity.URL_KEY"

    invoke-virtual {v2, p2}, Lo/eoc;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 197
    invoke-virtual {p1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 198
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Lo/egd;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->b:Lo/egd;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)Landroid/content/Context;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->g:Landroid/content/Context;

    return-object v0
.end method

.method private d()V
    .locals 5

    .line 123
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter upActivationDataMember()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->l:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 127
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_ordinary_gold:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->m:Ljava/lang/String;

    goto :goto_0

    .line 129
    :cond_0
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->l:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 131
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_silver_gold:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->m:Ljava/lang/String;

    goto :goto_0

    .line 133
    :cond_1
    iget v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->l:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_2

    .line 135
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_main_sns_member_gold:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->m:Ljava/lang/String;

    .line 139
    :cond_2
    :goto_0
    new-instance v4, Landroid/text/SpannableString;

    sget v0, Lcom/huawei/ui/device/R$string;->IDS_main_sns_enjoy_wonderful_interest:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->m:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_main_sns_activate_the_right_to_enjoy1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->k:Landroid/widget/CheckBox;

    new-instance v1, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity$2;-><init>(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 152
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e()Ljava/lang/String;
    .locals 1

    .line 38
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 173
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onClick()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v4

    .line 175
    sget v0, Lcom/huawei/ui/device/R$id;->vip_immediate_activation:I

    if-ne v4, v0, :cond_0

    .line 176
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 177
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 178
    const-class v0, Lcom/huawei/ui/device/activity/goldmember/VIPMemberActivationActivity;

    invoke-virtual {v5, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 179
    invoke-virtual {p0, v5}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->startActivity(Landroid/content/Intent;)V

    .line 180
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->finish()V

    .line 182
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 69
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 72
    iput-object p0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->g:Landroid/content/Context;

    .line 73
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    sget-object v1, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->c:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->l:I

    .line 76
    :cond_0
    new-instance v0, Lo/eoe;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->g:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/eoe;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->a:Lo/eoe;

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->a()V

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 79
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 162
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 164
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->d:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 168
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->finish()V

    .line 169
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 156
    sget-object v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;->e:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 158
    return-void
.end method

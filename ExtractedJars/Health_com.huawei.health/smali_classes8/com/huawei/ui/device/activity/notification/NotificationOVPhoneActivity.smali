.class public Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Lo/emr;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/LinearLayout;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 35
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->a:Ljava/lang/String;

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->b:Z

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->c:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 5

    .line 71
    sget v0, Lcom/huawei/ui/device/R$id;->notification_open_title:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->e:Lo/emr;

    .line 72
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->e:Lo/emr;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonVisibility(I)V

    .line 74
    sget v0, Lcom/huawei/ui/device/R$id;->open_management_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->k:Landroid/widget/TextView;

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v4

    .line 77
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    .line 78
    sget v0, Lcom/huawei/ui/device/R$id;->open_management_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->g:Landroid/widget/TextView;

    .line 79
    sget v0, Lcom/huawei/ui/device/R$id;->open_management_attention:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->h:Landroid/widget/TextView;

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_content:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_attention:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 83
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->h:Landroid/widget/TextView;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    .line 86
    sget v0, Lcom/huawei/ui/device/R$id;->open_management_phone_brand:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->f:Landroid/widget/TextView;

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_phone_brand:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    sget v0, Lcom/huawei/ui/device/R$id;->open_management_instraction_pictrue:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->i:Landroid/widget/ImageView;

    .line 91
    sget v0, Lcom/huawei/ui/device/R$id;->open_management_step_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->n:Landroid/widget/TextView;

    .line 92
    sget v0, Lcom/huawei/ui/device/R$id;->open_management_step_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->l:Landroid/widget/TextView;

    .line 93
    sget v0, Lcom/huawei/ui/device/R$id;->open_management_step_three:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->p:Landroid/widget/TextView;

    .line 94
    invoke-static {}, Lo/cdq;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_paring_oppo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_oppo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_oppo_step_two:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_oppo_step_three:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 100
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_paring_vivo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 101
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_vivo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_vivo_step_two:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_vivo_step_three:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 106
    :goto_0
    sget v0, Lcom/huawei/ui/device/R$id;->notification_last_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->m:Landroid/widget/LinearLayout;

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    sget v0, Lcom/huawei/ui/device/R$id;->notification_next_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->o:Landroid/widget/RelativeLayout;

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    sget v0, Lcom/huawei/ui/device/R$id;->notification_next_layout_twice:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->q:Landroid/widget/RelativeLayout;

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->a:Ljava/lang/String;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 166
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_apphelp_pwindows_continue_button:I

    new-instance v2, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$4;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)V

    .line 167
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity$3;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)V

    .line 181
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v3

    .line 189
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_next_step_dialog:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    .line 190
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 191
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 192
    invoke-virtual {v4}, Lo/egy;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 193
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 195
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->b:Z

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;)Landroid/content/Context;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->d:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .line 200
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 119
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getId()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 120
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_battery_manager:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_battery_manager_content:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 124
    invoke-static {}, Lo/cdq;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_paring_oppo_step_two:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_battery_manager_oppo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_battery_manager_oppo_step_two:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_battery_manager_oppo_step_three:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_paring_vivo_step_two:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_battery_manager_vivo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 132
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_battery_manager_vivo_step_two:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_battery_manager_vivo_step_three:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 135
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 136
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->o:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 140
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->m:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getId()I

    move-result v1

    if-ne v0, v1, :cond_3

    .line 141
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 142
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->g:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_content:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 143
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_phone_brand:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    invoke-static {}, Lo/cdq;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_paring_oppo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_oppo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 148
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_oppo_step_two:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_oppo_step_three:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 151
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->ic_paring_vivo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_vivo_step_one:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->l:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_vivo_step_two:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->p:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_msgnotif_open_manager_vivo_step_three:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 156
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 157
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 160
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getId()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 161
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->b()V

    .line 163
    :cond_4
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 54
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 55
    sget v0, Lcom/huawei/ui/device/R$layout;->notification_ovphone_setting_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->setContentView(I)V

    .line 56
    iput-object p0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->d:Landroid/content/Context;

    .line 57
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 58
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 59
    const-string v0, "device_id"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->a:Ljava/lang/String;

    .line 60
    const-string v0, "isFromWear"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->b:Z

    .line 62
    :cond_0
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->c:Ljava/lang/String;

    .line 63
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOVPhoneActivity;->a()V

    .line 64
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 204
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 205
    return-void
.end method

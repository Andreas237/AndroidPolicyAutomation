.class public Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/widget/Button;

.field private c:Landroid/widget/Button;

.field private d:Lo/emr;

.field private e:I

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/view/View;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/view/View;

.field private n:Lo/ecx;

.field private o:Landroid/widget/ImageView;

.field private p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private t:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 36
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e:I

    .line 185
    new-instance v0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$1;-><init>(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 211
    new-instance v0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$5;-><init>(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->t:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 3

    .line 157
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 158
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 162
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 163
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 166
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_btn_two:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 167
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_next_back_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 168
    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->a()V

    return-void
.end method

.method private b()V
    .locals 4

    .line 171
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 172
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 173
    sget v0, Lcom/huawei/sim/R$anim;->bt_connecting:I

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    .line 175
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 178
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 180
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 181
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_btn_two_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 182
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 183
    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)Landroid/os/Handler;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->t:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->b()V

    return-void
.end method

.method private e()V
    .locals 3

    .line 143
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 144
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 145
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 148
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 150
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_btn_two_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 153
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$color;->IDS_plugin_sim_ext_back_color_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 154
    return-void
.end method

.method static synthetic e(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 127
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->esim_profile_cancel:I

    if-ne v0, v1, :cond_0

    .line 128
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 129
    invoke-virtual {p0, v2}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->startActivity(Landroid/content/Intent;)V

    .line 130
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->finish()V

    .line 131
    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/sim/R$id;->esim_profile_retry:I

    if-ne v0, v1, :cond_1

    .line 134
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/qrcode/QrCodeActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 135
    invoke-virtual {p0, v2}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->startActivity(Landroid/content/Intent;)V

    .line 136
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->finish()V

    .line 139
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 53
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    sget v0, Lcom/huawei/sim/R$layout;->activity_profile_bt_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->setContentView(I)V

    .line 55
    sget v0, Lcom/huawei/sim/R$id;->esim_profile_cancel:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->b:Landroid/widget/Button;

    .line 56
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->b:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    sget v0, Lcom/huawei/sim/R$id;->esim_profile_retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    .line 58
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->c:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    sget v0, Lcom/huawei/sim/R$id;->profile_bt_fail_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->d:Lo/emr;

    .line 61
    sget v0, Lcom/huawei/sim/R$id;->esim_failed_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->h:Landroid/widget/TextView;

    .line 62
    sget v0, Lcom/huawei/sim/R$id;->esim_image_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->f:Landroid/widget/ImageView;

    .line 63
    sget v0, Lcom/huawei/sim/R$id;->esim_success_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->g:Landroid/widget/TextView;

    .line 64
    sget v0, Lcom/huawei/sim/R$id;->esim_image_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->k:Landroid/widget/ImageView;

    .line 65
    sget v0, Lcom/huawei/sim/R$id;->bt_disconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->i:Landroid/view/View;

    .line 66
    sget v0, Lcom/huawei/sim/R$id;->set_bt_reconnect:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->a:Landroid/view/View;

    .line 67
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->a:Landroid/view/View;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity$4;-><init>(Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting_imgage:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->o:Landroid/widget/ImageView;

    .line 80
    sget v0, Lcom/huawei/sim/R$id;->bt_connecting:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->m:Landroid/view/View;

    .line 81
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->n:Lo/ecx;

    .line 83
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->n:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 84
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return-void

    .line 87
    :cond_0
    sget v0, Lcom/huawei/sim/R$id;->bt_reconnect_set_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->l:Landroid/widget/ImageView;

    .line 88
    invoke-static {p0}, Lo/ene;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->l:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/sim/R$drawable;->sim_direction_left_black_tip_image:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->n:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 93
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 119
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 120
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->n:Lo/ecx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->n:Lo/ecx;

    iget-object v1, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Lo/ecx;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 123
    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 97
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 98
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->n:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 99
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pluginSimAdapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e:I

    goto :goto_0

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->n:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v0

    iput v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e:I

    .line 105
    :goto_0
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 106
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->a()V

    goto :goto_1

    .line 108
    :cond_1
    iget v0, p0, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 109
    const-string v0, "EsimProfileBTFailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DEVICE_CONNECTING == mBTStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->b()V

    goto :goto_1

    .line 113
    :cond_2
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimProfileBTFailActivity;->e()V

    .line 115
    :goto_1
    return-void
.end method

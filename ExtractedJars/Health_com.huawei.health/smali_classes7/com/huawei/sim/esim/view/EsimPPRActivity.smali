.class public Lcom/huawei/sim/esim/view/EsimPPRActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/LinearLayout;

.field private b:Lo/egd;

.field private c:[B

.field private d:Lo/egd;

.field private e:Lo/emr;

.field private f:Lo/ecx;

.field private g:Lo/egn;

.field private h:Landroid/widget/LinearLayout;

.field private i:Ljava/lang/Boolean;

.field private k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private m:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    .line 118
    new-instance v0, Lcom/huawei/sim/esim/view/EsimPPRActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity$2;-><init>(Lcom/huawei/sim/esim/view/EsimPPRActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 130
    new-instance v0, Lcom/huawei/sim/esim/view/EsimPPRActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity$3;-><init>(Lcom/huawei/sim/esim/view/EsimPPRActivity;)V

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->m:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->k:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 195
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter dismissLoadingDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    return-void

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dismissLoadingDialog()!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 202
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    .line 204
    :cond_1
    return-void
.end method

.method private a(I)V
    .locals 4

    .line 176
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 177
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/sim/R$style;->common_dialog21:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    .line 178
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 179
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    goto :goto_0

    .line 181
    :cond_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 184
    :goto_0
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->g:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 185
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLoadingUserInformationDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Lo/ecx;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->f:Lo/ecx;

    return-object v0
.end method

.method private b(I)V
    .locals 5

    .line 146
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->i:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "commandResult errorcode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->a()V

    .line 149
    return-void

    .line 151
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 152
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/sim/esim/view/EsimProfileSuccessActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 153
    const-string v0, "conform_status"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 154
    invoke-virtual {p0, v4}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->startActivity(Landroid/content/Intent;)V

    .line 155
    goto :goto_0

    .line 156
    :cond_1
    const/4 v4, 0x3

    .line 157
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->f:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 158
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 160
    :cond_2
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->f:Lo/ecx;

    invoke-interface {v0}, Lo/ecx;->a()I

    move-result v4

    .line 162
    .line 166
    :goto_0
    invoke-direct {p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->a()V

    .line 167
    return-void
.end method

.method static synthetic b(Lcom/huawei/sim/esim/view/EsimPPRActivity;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->b(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Ljava/lang/Boolean;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->i:Ljava/lang/Boolean;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/EsimPPRActivity;)Landroid/os/Handler;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->m:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/sim/esim/view/EsimPPRActivity;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->a(I)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 46
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    sget v0, Lcom/huawei/sim/R$layout;->activity_ppr_rules:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->setContentView(I)V

    .line 48
    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 49
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 50
    return-void

    .line 52
    :cond_0
    const-string v0, "profile_policy_rules"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    .line 53
    const-string v0, "conform_status"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->i:Ljava/lang/Boolean;

    .line 54
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "the mNeedConform: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->i:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    sget v0, Lcom/huawei/sim/R$id;->ppr_title_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->e:Lo/emr;

    .line 56
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->e:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/sim/R$string;->IDS_plugin_sim_ppr_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->e:Lo/emr;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimPPRActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity$4;-><init>(Lcom/huawei/sim/esim/view/EsimPPRActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    invoke-static {p0}, Lo/ecy;->c(Landroid/content/Context;)Lo/ecy;

    move-result-object v0

    invoke-virtual {v0}, Lo/ecy;->getAdapter()Lo/eab;

    move-result-object v0

    check-cast v0, Lo/ecx;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->f:Lo/ecx;

    .line 64
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->f:Lo/ecx;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 65
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == pluginSimAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    return-void

    .line 68
    :cond_1
    sget v0, Lcom/huawei/sim/R$id;->conform_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->b:Lo/egd;

    .line 69
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->b:Lo/egd;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity$5;-><init>(Lcom/huawei/sim/esim/view/EsimPPRActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    sget v0, Lcom/huawei/sim/R$id;->cancel_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->d:Lo/egd;

    .line 88
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->d:Lo/egd;

    new-instance v1, Lcom/huawei/sim/esim/view/EsimPPRActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/sim/esim/view/EsimPPRActivity$1;-><init>(Lcom/huawei/sim/esim/view/EsimPPRActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    sget v0, Lcom/huawei/sim/R$id;->ll_ppr1_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->a:Landroid/widget/LinearLayout;

    .line 95
    sget v0, Lcom/huawei/sim/R$id;->ll_ppr2_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/sim/esim/view/EsimPPRActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->h:Landroid/widget/LinearLayout;

    .line 96
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    array-length v0, v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 97
    :cond_2
    return-void

    .line 99
    :cond_3
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, 0x40

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, -0x40

    if-ne v0, v1, :cond_5

    .line 102
    :cond_4
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPPRType[0] == 0x40 || mPPRType[0] == 0xC0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 104
    :cond_5
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, 0x20

    if-eq v0, v1, :cond_6

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, -0x60

    if-ne v0, v1, :cond_7

    .line 107
    :cond_6
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPPRType[0] == 0x20 || mPPRType[0] == 0xA0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 109
    :cond_7
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, 0x60

    if-eq v0, v1, :cond_8

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->c:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/16 v1, -0x20

    if-ne v0, v1, :cond_9

    .line 112
    :cond_8
    const-string v0, "EsimPPRActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPPRType[0] == 0x60 || mPPRType[0] == 0xE0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->a:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 114
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimPPRActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 116
    :cond_9
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 214
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 215
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 209
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 210
    return-void
.end method

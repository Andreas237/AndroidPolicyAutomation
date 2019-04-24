.class public Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/TextView;

.field private g:Lo/egd;

.field private h:Landroid/widget/TextView;

.field private k:I

.field private l:I

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:J

.field private t:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 197
    new-instance v0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity$4;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->t:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)I
    .locals 1

    .line 28
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->l:I

    return v0
.end method

.method private a()V
    .locals 2

    .line 178
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v1

    .line 179
    if-eqz v1, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 183
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->p:J

    return-wide v0
.end method

.method private b()V
    .locals 3

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->o:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->o:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_0

    .line 167
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->o:Ljava/lang/String;

    const/4 v1, 0x0

    const/16 v2, 0x3f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->o:Ljava/lang/String;

    .line 170
    :cond_0
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 3

    .line 123
    if-eqz p1, :cond_6

    .line 125
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 126
    if-nez v2, :cond_0

    .line 128
    return-void

    .line 130
    :cond_0
    const-string v0, "complain_url_title"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    const-string v0, "complain_url_title"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->o:Ljava/lang/String;

    .line 133
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->b()V

    .line 135
    :cond_1
    const-string v0, "complain_url"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    const-string v0, "complain_url"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->n:Ljava/lang/String;

    .line 139
    :cond_2
    const-string v0, "chat_type"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 141
    const-string v0, "chat_type"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->k:I

    .line 143
    :cond_3
    const-string v0, "chat_category"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 145
    const-string v0, "chat_category"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->l:I

    .line 147
    :cond_4
    const-string v0, "user_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 149
    const-string v0, "user_id"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->p:J

    .line 151
    :cond_5
    const-string v0, "user_name"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 153
    const-string v0, "user_name"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->m:Ljava/lang/String;

    .line 156
    :cond_6
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)I
    .locals 1

    .line 28
    iget v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->k:I

    return v0
.end method

.method private c()V
    .locals 2

    .line 193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->m:Ljava/lang/String;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 102
    sget v0, Lcom/huawei/android/sns/R$id;->complain_title_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->f:Landroid/widget/TextView;

    .line 103
    sget v0, Lcom/huawei/android/sns/R$id;->complain_url_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->h:Landroid/widget/TextView;

    .line 104
    sget v0, Lcom/huawei/android/sns/R$id;->btn_submit_check:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->g:Lo/egd;

    .line 107
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->g:Lo/egd;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {p0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x42200000    # 40.0f

    invoke-static {p0, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v3, v1, v4, v2}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->g:Lo/egd;

    invoke-static {p0, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->g:Lo/egd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->t:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->p:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->g:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 119
    :cond_1
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;)Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->o:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 188
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->d:Landroid/view/View;

    .line 189
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 92
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 93
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_complain_url:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->setContentView(I)V

    .line 94
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->b(Landroid/content/Intent;)V

    .line 95
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->a()V

    .line 96
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->e()V

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainUrlActivity;->c()V

    .line 98
    return-void
.end method

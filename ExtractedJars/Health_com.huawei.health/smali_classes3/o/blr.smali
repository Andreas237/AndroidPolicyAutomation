.class public Lo/blr;
.super Lo/blh;
.source "SourceFile"


# instance fields
.field private f:Ljava/lang/String;

.field private h:Landroid/widget/RelativeLayout;

.field private k:Landroid/view/View;

.field private m:Lo/axd;

.field private n:Z

.field private o:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V
    .locals 1

    .line 63
    invoke-direct {p0, p1, p2, p3}, Lo/blh;-><init>(Landroid/app/Activity;Landroid/os/Handler;Lo/bly;)V

    .line 28
    const-string v0, "DetailRemarkView"

    iput-object v0, p0, Lo/blr;->f:Ljava/lang/String;

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/blr;->n:Z

    .line 64
    invoke-direct {p0}, Lo/blr;->d()V

    .line 65
    return-void
.end method

.method private c(Ljava/lang/String;Lcom/huawei/health/sns/model/user/User;)V
    .locals 4

    .line 182
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lo/blr;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 186
    :cond_0
    invoke-direct {p0}, Lo/blr;->h()Lo/axd;

    move-result-object v0

    iget-object v1, p0, Lo/blr;->e:Landroid/app/Activity;

    const/16 v2, 0x21

    invoke-virtual {v0, v2, v1, p2, p1}, Lo/axd;->c(ILandroid/app/Activity;Lcom/huawei/health/sns/model/user/User;Ljava/lang/String;)V

    .line 187
    return-void
.end method

.method static synthetic c(Lo/blr;Ljava/lang/String;Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lo/blr;->c(Ljava/lang/String;Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method private d()V
    .locals 2

    .line 70
    iget-object v0, p0, Lo/blr;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->remark_name_relative_layout:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/blr;->h:Landroid/widget/RelativeLayout;

    .line 71
    iget-object v0, p0, Lo/blr;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->divider_remark_layout_1:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/blr;->k:Landroid/view/View;

    .line 72
    iget-object v0, p0, Lo/blr;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->divider_remark_layout_2:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/blr;->o:Landroid/view/View;

    .line 73
    iget-object v0, p0, Lo/blr;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    return-void
.end method

.method private e()V
    .locals 5

    .line 138
    const-string v3, ""

    .line 141
    iget-object v0, p0, Lo/blr;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v3

    .line 143
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Lo/blr;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 147
    iget-object v0, p0, Lo/blr;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lo/blr;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v3

    .line 154
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/blr;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_set_remark_name:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 156
    iget-object v0, p0, Lo/blr;->e:Landroid/app/Activity;

    new-instance v1, Lo/blr$3;

    invoke-direct {v1, p0}, Lo/blr$3;-><init>(Lo/blr;)V

    const/4 v2, 0x1

    invoke-static {v0, v4, v3, v1, v2}, Lo/boj;->b(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lo/blr;->i:Landroid/app/AlertDialog;

    .line 172
    return-void
.end method

.method private e(I)V
    .locals 1

    .line 101
    iget-object v0, p0, Lo/blr;->k:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lo/blr;->k:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 105
    :cond_0
    iget-object v0, p0, Lo/blr;->h:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    .line 107
    iget-object v0, p0, Lo/blr;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 109
    :cond_1
    return-void
.end method

.method private h()Lo/axd;
    .locals 2

    .line 196
    iget-object v0, p0, Lo/blr;->m:Lo/axd;

    if-nez v0, :cond_0

    .line 198
    new-instance v0, Lo/axd;

    iget-object v1, p0, Lo/blr;->b:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/axd;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lo/blr;->m:Lo/axd;

    .line 200
    :cond_0
    iget-object v0, p0, Lo/blr;->m:Lo/axd;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 26
    invoke-super {p0}, Lo/blh;->a()V

    return-void
.end method

.method public bridge synthetic a(I)V
    .locals 0

    .line 26
    invoke-super {p0, p1}, Lo/blh;->a(I)V

    return-void
.end method

.method a(Lcom/huawei/health/sns/model/user/User;)V
    .locals 1

    .line 79
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lo/blr;->n:Z

    if-eqz v0, :cond_1

    .line 81
    :cond_0
    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lo/blr;->e(I)V

    goto :goto_0

    .line 85
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/blr;->e(I)V

    .line 87
    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 118
    iget-object v0, p0, Lo/blr;->o:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 120
    iget-object v0, p0, Lo/blr;->o:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 122
    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    .line 208
    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lo/blr;->e(I)V

    .line 209
    return-void
.end method

.method public bridge synthetic c()V
    .locals 0

    .line 26
    invoke-super {p0}, Lo/blh;->c()V

    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 96
    iput-boolean p1, p0, Lo/blr;->n:Z

    .line 97
    return-void
.end method

.method public bridge synthetic e(Lcom/huawei/health/sns/model/user/User;)V
    .locals 0

    .line 26
    invoke-super {p0, p1}, Lo/blh;->e(Lcom/huawei/health/sns/model/user/User;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 127
    iget-object v0, p0, Lo/blr;->c:Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 129
    invoke-direct {p0}, Lo/blr;->e()V

    .line 131
    :cond_0
    return-void
.end method

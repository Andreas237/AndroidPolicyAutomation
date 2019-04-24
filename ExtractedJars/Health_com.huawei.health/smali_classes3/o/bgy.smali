.class public Lo/bgy;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private g:Landroid/view/View;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 54
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgy;->i:Landroid/widget/TextView;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgy;->k:Landroid/widget/TextView;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgy;->h:Landroid/widget/TextView;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgy;->g:Landroid/view/View;

    .line 55
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 98
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lo/bgy;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bgy;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_invite_family_with_name_null:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 104
    :cond_0
    iget-object v0, p0, Lo/bgy;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bgy;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_invite_to_join_group:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {p2}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    :goto_0
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 60
    sget v0, Lcom/huawei/android/sns/R$id;->text_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bgy;->i:Landroid/widget/TextView;

    .line 61
    sget v0, Lcom/huawei/android/sns/R$id;->text_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bgy;->k:Landroid/widget/TextView;

    .line 62
    sget v0, Lcom/huawei/android/sns/R$id;->text_count:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bgy;->h:Landroid/widget/TextView;

    .line 63
    sget v0, Lcom/huawei/android/sns/R$id;->frame_layout_redpoint:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bgy;->g:Landroid/view/View;

    .line 64
    invoke-virtual {p0, p1}, Lo/bgy;->a(Landroid/view/View;)V

    .line 65
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 5

    .line 71
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 73
    instance-of v0, p1, Lcom/huawei/health/sns/model/group/GroupNotify;

    if-eqz v0, :cond_0

    .line 75
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/model/group/GroupNotify;

    .line 76
    iget-object v0, p0, Lo/bgy;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_new_invite:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 77
    iget-object v0, p0, Lo/bgy;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 78
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/GroupNotify;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    .line 79
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupName()Ljava/lang/String;

    move-result-object v4

    .line 80
    invoke-direct {p0, v3, v4}, Lo/bgy;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lo/bgy;->g:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 82
    iget-object v0, p0, Lo/bgy;->h:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/GroupNotify;->getInviteCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    goto :goto_0

    .line 86
    :cond_0
    const-string v0, "GroupNotifyCard"

    const-string v1, "data not instanceof GroupNotify"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    :goto_0
    return-void
.end method

.class public Lo/bgz;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;

.field private i:Landroid/view/View;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 53
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgz;->f:Landroid/widget/ImageView;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgz;->g:Landroid/widget/TextView;

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgz;->k:Landroid/widget/TextView;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgz;->i:Landroid/view/View;

    .line 54
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 59
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bgz;->f:Landroid/widget/ImageView;

    .line 60
    sget v0, Lcom/huawei/android/sns/R$id;->text_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bgz;->g:Landroid/widget/TextView;

    .line 61
    sget v0, Lcom/huawei/android/sns/R$id;->text_content:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bgz;->k:Landroid/widget/TextView;

    .line 62
    sget v0, Lcom/huawei/android/sns/R$id;->image_arrow:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bgz;->i:Landroid/view/View;

    .line 63
    invoke-virtual {p0, p1}, Lo/bgz;->a(Landroid/view/View;)V

    .line 64
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 8

    .line 71
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 72
    const/4 v6, 0x0

    .line 73
    instance-of v0, p1, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_0

    .line 75
    move-object v6, p1

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 77
    :cond_0
    if-nez v6, :cond_1

    .line 79
    return-void

    .line 81
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/bgz;->f:Landroid/widget/ImageView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 82
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v5

    .line 81
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lo/bgz;->d:Landroid/content/Context;

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 86
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    .line 88
    iget-object v0, p0, Lo/bgz;->i:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bgz;->d:Landroid/content/Context;

    sget v2, Lcom/huawei/android/sns/R$string;->sns_me:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 93
    :cond_2
    iget-object v0, p0, Lo/bgz;->i:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    :goto_0
    iget-object v0, p0, Lo/bgz;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->isManager()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 99
    iget-object v0, p0, Lo/bgz;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_manager:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 100
    iget-object v0, p0, Lo/bgz;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bgz;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_group_manager_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 104
    :cond_3
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 106
    iget-object v0, p0, Lo/bgz;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_member_invite:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_1

    .line 110
    :cond_4
    iget-object v0, p0, Lo/bgz;->k:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_member:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 112
    :goto_1
    iget-object v0, p0, Lo/bgz;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bgz;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_group_normal_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 114
    :goto_2
    return-void
.end method

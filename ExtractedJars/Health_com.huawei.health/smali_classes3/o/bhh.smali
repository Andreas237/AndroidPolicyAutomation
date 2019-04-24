.class public Lo/bhh;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 64
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhh;->h:Landroid/widget/TextView;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhh;->f:Landroid/widget/TextView;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhh;->i:Landroid/widget/ImageView;

    .line 65
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 70
    sget v0, Lcom/huawei/android/sns/R$id;->text_group_name_tag:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhh;->h:Landroid/widget/TextView;

    .line 71
    sget v0, Lcom/huawei/android/sns/R$id;->text_group_name:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhh;->f:Landroid/widget/TextView;

    .line 72
    sget v0, Lcom/huawei/android/sns/R$id;->divider_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhh;->i:Landroid/widget/ImageView;

    .line 73
    invoke-virtual {p0, p1}, Lo/bhh;->a(Landroid/view/View;)V

    .line 74
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 7

    .line 80
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 82
    instance-of v0, p1, Lo/ayi;

    if-eqz v0, :cond_5

    .line 84
    move-object v5, p1

    check-cast v5, Lo/ayi;

    .line 85
    invoke-virtual {p1}, Lo/bfh;->isNeedHideDivider()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lo/bhh;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 91
    :cond_0
    iget-object v0, p0, Lo/bhh;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 93
    :goto_0
    const/4 v6, 0x0

    .line 94
    iget-object v0, p0, Lo/bhh;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 95
    iget v0, v5, Lo/ayi;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 97
    iget-object v0, p0, Lo/bhh;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_name:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 99
    :cond_1
    iget v0, v5, Lo/ayi;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 101
    iget-object v0, p0, Lo/bhh;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_my_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 103
    :cond_2
    iget v0, v5, Lo/ayi;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 105
    iget-object v0, p0, Lo/bhh;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_all_group_member:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, v5, Lo/ayi;->d:Ljava/lang/String;

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 106
    iget-object v0, p0, Lo/bhh;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 107
    iget-object v0, p0, Lo/bhh;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 109
    :cond_3
    :goto_1
    if-eqz v6, :cond_4

    .line 111
    iget-object v0, p0, Lo/bhh;->h:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    :cond_4
    iget-object v0, p0, Lo/bhh;->f:Landroid/widget/TextView;

    iget-object v1, v5, Lo/ayi;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 115
    goto :goto_2

    .line 118
    :cond_5
    const-string v0, "NormalGroupTagValueCard"

    const-string v1, "data not instanceof NormalGroupTagValue"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    :goto_2
    return-void
.end method

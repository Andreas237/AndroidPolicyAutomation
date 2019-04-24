.class public Lo/bha;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 63
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 49
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bha;->f:Landroid/widget/TextView;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bha;->i:Landroid/widget/ImageView;

    .line 64
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 69
    sget v0, Lcom/huawei/android/sns/R$id;->text_group_name_tag:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bha;->f:Landroid/widget/TextView;

    .line 70
    sget v0, Lcom/huawei/android/sns/R$id;->divider_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bha;->i:Landroid/widget/ImageView;

    .line 71
    invoke-virtual {p0, p1}, Lo/bha;->a(Landroid/view/View;)V

    .line 72
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 4

    .line 78
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 80
    instance-of v0, p1, Lo/ayg;

    if-eqz v0, :cond_2

    .line 82
    move-object v2, p1

    check-cast v2, Lo/ayg;

    .line 83
    invoke-virtual {p1}, Lo/bfh;->isNeedHideDivider()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lo/bha;->i:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 89
    :cond_0
    iget-object v0, p0, Lo/bha;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 91
    :goto_0
    const/4 v3, 0x0

    .line 92
    iget v0, v2, Lo/ayg;->c:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 95
    :pswitch_0
    iget-object v0, p0, Lo/bha;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_find_record:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 96
    goto :goto_1

    .line 98
    :pswitch_1
    iget-object v0, p0, Lo/bha;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_clear_record:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 99
    goto :goto_1

    .line 101
    :pswitch_2
    iget-object v0, p0, Lo/bha;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_normal_group_transfer:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 102
    goto :goto_1

    .line 104
    :pswitch_3
    iget-object v0, p0, Lo/bha;->d:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_complain:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 105
    .line 110
    :goto_1
    if-eqz v3, :cond_1

    .line 112
    iget-object v0, p0, Lo/bha;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    :cond_1
    goto :goto_2

    .line 117
    :cond_2
    const-string v0, "NormalGroupTagCard"

    const-string v1, "data not instanceof NormalGroupTag"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

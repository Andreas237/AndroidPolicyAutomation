.class public Lcom/huawei/health/sns/ui/user/card/LinkCard;
.super Lo/bfl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;
    }
.end annotation


# instance fields
.field private f:Lo/bnj;

.field private h:Landroid/widget/ImageView;

.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->f:Lo/bnj;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->k:Landroid/widget/TextView;

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->h:Landroid/widget/ImageView;

    .line 34
    return-void
.end method

.method private c(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)V
    .locals 4

    .line 108
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/card/LinkCard;->c()Landroid/view/View;

    move-result-object v3

    .line 109
    if-eqz v3, :cond_1

    .line 111
    invoke-static {p1}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$400(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_100_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_50_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 116
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_20_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_black_10_percent:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 123
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 126
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 39
    sget v0, Lcom/huawei/android/sns/R$id;->head_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->a:Landroid/widget/ImageView;

    .line 40
    sget v0, Lcom/huawei/android/sns/R$id;->title_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->b:Landroid/widget/TextView;

    .line 41
    sget v0, Lcom/huawei/android/sns/R$id;->sub_title_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->k:Landroid/widget/TextView;

    .line 42
    sget v0, Lcom/huawei/android/sns/R$id;->count_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnj;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->f:Lo/bnj;

    .line 43
    sget v0, Lcom/huawei/android/sns/R$id;->link_card_bottom_line:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->h:Landroid/widget/ImageView;

    .line 44
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/user/card/LinkCard;->a(Landroid/view/View;)V

    .line 45
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 3

    .line 51
    if-eqz p1, :cond_5

    instance-of v0, p1, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    if-eqz v0, :cond_5

    .line 53
    move-object v2, p1

    check-cast v2, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    .line 54
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$000(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)I

    move-result v0

    if-lez v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->a:Landroid/widget/ImageView;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$000(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 59
    :cond_0
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$100(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->b:Landroid/widget/TextView;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$100(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 66
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    :goto_0
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->isShowBottomLine()Z

    move-result v0

    if-nez v0, :cond_2

    .line 72
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 76
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 79
    :goto_1
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$200(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->k:Landroid/widget/TextView;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$200(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    .line 86
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 89
    :goto_2
    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$300(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)I

    move-result v0

    if-lez v0, :cond_4

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->f:Lo/bnj;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->access$300(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bnj;->setText(Ljava/lang/String;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->f:Lo/bnj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnj;->setVisibility(I)V

    goto :goto_3

    .line 96
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->f:Lo/bnj;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/bnj;->setText(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/card/LinkCard;->f:Lo/bnj;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnj;->setVisibility(I)V

    .line 101
    :goto_3
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard;->c(Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;)V

    .line 103
    :cond_5
    return-void
.end method

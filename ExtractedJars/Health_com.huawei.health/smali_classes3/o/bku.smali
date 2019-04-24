.class public Lo/bku;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/TextView;

.field private g:Lo/bla;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bku;->f:Landroid/widget/TextView;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bku;->i:Landroid/widget/TextView;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bku;->k:Landroid/widget/ImageView;

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bku;->g:Lo/bla;

    .line 46
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V
    .locals 3

    .line 134
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    iget-object v0, p0, Lo/bku;->g:Lo/bla;

    invoke-virtual {v0}, Lo/bla;->c()Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 137
    iget-object v0, p0, Lo/bku;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lo/bku;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V
    .locals 3

    .line 96
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 98
    iget-object v0, p0, Lo/bku;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 100
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getMsgCounts()I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    .line 102
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTips()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    iget-object v0, p0, Lo/bku;->i:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lo/bku;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTips()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Lo/bku;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 111
    :goto_0
    iget-object v0, p0, Lo/bku;->g:Lo/bla;

    invoke-virtual {v0}, Lo/bla;->d()Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 112
    iget-object v0, p0, Lo/bku;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    goto :goto_1

    .line 116
    :cond_1
    iget-object v0, p0, Lo/bku;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 117
    iget-object v0, p0, Lo/bku;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getSubTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 122
    :cond_2
    iget-object v0, p0, Lo/bku;->i:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lo/bku;->f:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 125
    :goto_1
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 51
    sget v0, Lcom/huawei/android/sns/R$id;->user_head_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bku;->a:Landroid/widget/ImageView;

    .line 52
    sget v0, Lcom/huawei/android/sns/R$id;->title_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bku;->b:Landroid/widget/TextView;

    .line 53
    sget v0, Lcom/huawei/android/sns/R$id;->type_sub_title_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bku;->i:Landroid/widget/TextView;

    .line 54
    sget v0, Lcom/huawei/android/sns/R$id;->sub_title_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bku;->f:Landroid/widget/TextView;

    .line 55
    sget v0, Lcom/huawei/android/sns/R$id;->search_item_divider:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bku;->k:Landroid/widget/ImageView;

    .line 56
    invoke-virtual {p0, p1}, Lo/bku;->a(Landroid/view/View;)V

    .line 57
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 8

    .line 63
    if-eqz p1, :cond_3

    instance-of v0, p1, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    if-eqz v0, :cond_3

    .line 65
    move-object v6, p1

    check-cast v6, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    .line 66
    new-instance v0, Lo/bla;

    iget-object v1, p0, Lo/bku;->d:Landroid/content/Context;

    invoke-direct {v0, v1, v6}, Lo/bla;-><init>(Landroid/content/Context;Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    iput-object v0, p0, Lo/bku;->g:Lo/bla;

    .line 68
    invoke-direct {p0, v6}, Lo/bku;->d(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 70
    invoke-direct {p0, v6}, Lo/bku;->e(Lcom/huawei/health/sns/model/search/SNSSearchBean;)V

    .line 72
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->f:Lo/bfp$c;

    if-ne v0, v1, :cond_1

    .line 74
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getGroup()Lcom/huawei/health/sns/model/group/Group;

    move-result-object v7

    .line 75
    if-eqz v7, :cond_0

    .line 77
    iget-object v0, p0, Lo/bku;->a:Landroid/widget/ImageView;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 79
    :cond_0
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/bku;->a:Landroid/widget/ImageView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    .line 83
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 82
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    :goto_0
    iget-object v0, p0, Lo/bku;->k:Landroid/widget/ImageView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->isLastItem()Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x8

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 87
    :cond_3
    return-void
.end method

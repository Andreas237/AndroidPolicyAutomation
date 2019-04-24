.class public Lo/blc;
.super Lo/bli;
.source "SourceFile"


# instance fields
.field private h:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/blc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/blc;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3}, Lo/bli;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    invoke-direct {p0}, Lo/blc;->c()V

    .line 41
    return-void
.end method

.method private c()V
    .locals 0

    .line 47
    invoke-virtual {p0}, Lo/blc;->a()V

    .line 48
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 53
    invoke-virtual {p0}, Lo/blc;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_detail_circle_html_layout:I

    invoke-static {v0, v1, p0}, Lo/blc;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 54
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/blc;->setOrientation(I)V

    .line 55
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {v2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 56
    const/16 v0, 0x10

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 57
    invoke-virtual {p0, v2}, Lo/blc;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    sget v0, Lcom/huawei/android/sns/R$id;->tag_download_textview:I

    invoke-virtual {p0, v0}, Lo/blc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/blc;->b:Landroid/widget/TextView;

    .line 59
    sget v0, Lcom/huawei/android/sns/R$id;->download_relativelayout:I

    invoke-virtual {p0, v0}, Lo/blc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/blc;->h:Landroid/widget/RelativeLayout;

    .line 60
    sget v0, Lcom/huawei/android/sns/R$id;->download_textview:I

    invoke-virtual {p0, v0}, Lo/blc;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/blc;->d:Landroid/widget/TextView;

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/blc;->c:Ljava/util/List;

    .line 62
    iget-object v0, p0, Lo/blc;->c:Ljava/util/List;

    sget v1, Lcom/huawei/android/sns/R$id;->first_textview:I

    invoke-virtual {p0, v1}, Lo/blc;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    iget-object v0, p0, Lo/blc;->c:Ljava/util/List;

    sget v1, Lcom/huawei/android/sns/R$id;->second_textview:I

    invoke-virtual {p0, v1}, Lo/blc;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    iget-object v0, p0, Lo/blc;->c:Ljava/util/List;

    sget v1, Lcom/huawei/android/sns/R$id;->third_textview:I

    invoke-virtual {p0, v1}, Lo/blc;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    iget-object v0, p0, Lo/blc;->c:Ljava/util/List;

    sget v1, Lcom/huawei/android/sns/R$id;->four_textview:I

    invoke-virtual {p0, v1}, Lo/blc;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    return-void
.end method

.method protected b()V
    .locals 2

    .line 87
    invoke-super {p0}, Lo/bli;->b()V

    .line 88
    iget-object v0, p0, Lo/blc;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 89
    return-void
.end method

.method protected e()V
    .locals 2

    .line 94
    invoke-super {p0}, Lo/bli;->e()V

    .line 95
    iget-object v0, p0, Lo/blc;->h:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 96
    return-void
.end method

.method protected e(Landroid/view/View;Lcom/huawei/health/sns/model/circle/UserCircleContent;)V
    .locals 2

    .line 77
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->getCircleContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    move-object v1, p1

    check-cast v1, Landroid/widget/TextView;

    .line 80
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/circle/UserCircleContent;->getCircleContent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    :cond_0
    return-void
.end method

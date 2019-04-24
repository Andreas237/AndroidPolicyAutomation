.class public Lo/bnj;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field protected b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bnj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 47
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bnj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    invoke-direct {p0}, Lo/bnj;->c()V

    .line 61
    return-void
.end method

.method private c()V
    .locals 0

    .line 64
    invoke-virtual {p0}, Lo/bnj;->e()V

    .line 65
    return-void
.end method


# virtual methods
.method protected e()V
    .locals 4

    .line 72
    invoke-virtual {p0}, Lo/bnj;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 73
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_red_point_text_view:I

    const/4 v1, 0x1

    invoke-virtual {v2, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 74
    sget v0, Lcom/huawei/android/sns/R$id;->text_count:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bnj;->b:Landroid/widget/TextView;

    .line 75
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 6

    .line 84
    iget-object v0, p0, Lo/bnj;->b:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    .line 86
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 88
    :cond_0
    iget-object v0, p0, Lo/bnj;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    goto :goto_0

    .line 92
    :cond_1
    iget-object v0, p0, Lo/bnj;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$dimen;->sns_redpoint_h_padding_size:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 93
    iget-object v0, p0, Lo/bnj;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v5, v1, v5, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 95
    :goto_0
    iget-object v0, p0, Lo/bnj;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    :cond_2
    return-void
.end method

.class public Lo/bli;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field protected a:Lcom/huawei/health/sns/model/circle/UserCircle;

.field protected b:Landroid/widget/TextView;

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field protected d:Landroid/widget/TextView;

.field protected e:Landroid/content/Context;

.field protected f:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 47
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bli;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 48
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 52
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bli;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    iput-object p1, p0, Lo/bli;->e:Landroid/content/Context;

    .line 59
    return-void
.end method

.method private c()V
    .locals 3

    .line 180
    invoke-static {}, Lo/bmo;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    iget-object v0, p0, Lo/bli;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bli;->a:Lcom/huawei/health/sns/model/circle/UserCircle;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 186
    :cond_0
    iget-object v0, p0, Lo/bli;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bli;->a:Lcom/huawei/health/sns/model/circle/UserCircle;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 154
    return-void
.end method

.method protected a(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/circle/UserCircleContent;>;)V"
        }
    .end annotation

    .line 119
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 121
    iget-object v0, p0, Lo/bli;->c:Ljava/util/List;

    if-nez v0, :cond_0

    .line 123
    return-void

    .line 125
    :cond_0
    iget-object v0, p0, Lo/bli;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 126
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 128
    if-ge v4, v2, :cond_1

    .line 130
    iget-object v0, p0, Lo/bli;->c:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    iget-object v0, p0, Lo/bli;->c:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/sns/model/circle/UserCircleContent;

    invoke-virtual {p0, v0, v1}, Lo/bli;->e(Landroid/view/View;Lcom/huawei/health/sns/model/circle/UserCircleContent;)V

    goto :goto_1

    .line 135
    :cond_1
    iget-object v0, p0, Lo/bli;->c:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 126
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 138
    :cond_2
    return-void
.end method

.method protected b()V
    .locals 2

    .line 171
    invoke-direct {p0}, Lo/bli;->c()V

    .line 172
    iget-object v0, p0, Lo/bli;->d:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 173
    return-void
.end method

.method public c(Lcom/huawei/health/sns/model/circle/UserCircle;Lcom/huawei/health/sns/model/user/User;)V
    .locals 5

    .line 63
    if-nez p1, :cond_0

    .line 65
    return-void

    .line 67
    :cond_0
    iput-object p1, p0, Lo/bli;->a:Lcom/huawei/health/sns/model/circle/UserCircle;

    .line 68
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleContent()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 70
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bli;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lo/bli;->e:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppPackage()Ljava/lang/String;

    move-result-object v1

    .line 72
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppVersion()J

    move-result-wide v2

    .line 71
    invoke-static {v0, v1, v2, v3}, Lo/bls;->e(Landroid/content/Context;Ljava/lang/String;J)I

    move-result v4

    .line 74
    if-eqz v4, :cond_1

    const/4 v0, 0x1

    if-ne v4, v0, :cond_3

    .line 76
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->isShowDownload()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 78
    invoke-virtual {p0}, Lo/bli;->d()V

    .line 79
    invoke-virtual {p0}, Lo/bli;->e()V

    .line 80
    iget-object v0, p0, Lo/bli;->f:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v0}, Lo/bli;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 84
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/bli;->setVisibility(I)V

    goto :goto_0

    .line 90
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/circle/UserCircle;->getCircleContent()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bli;->a(Ljava/util/List;)V

    .line 91
    invoke-virtual {p0}, Lo/bli;->b()V

    .line 92
    iget-object v0, p0, Lo/bli;->f:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v0}, Lo/bli;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    :goto_0
    goto :goto_1

    .line 97
    :cond_4
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/bli;->setVisibility(I)V

    .line 99
    :goto_1
    return-void
.end method

.method protected d()V
    .locals 3

    .line 106
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/bli;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 108
    iget-object v0, p0, Lo/bli;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 106
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 110
    :cond_0
    return-void
.end method

.method protected e()V
    .locals 6

    .line 161
    invoke-direct {p0}, Lo/bli;->c()V

    .line 162
    iget-object v0, p0, Lo/bli;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 163
    iget-object v0, p0, Lo/bli;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/bli;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_download_app:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lo/bli;->a:Lcom/huawei/health/sns/model/circle/UserCircle;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/circle/UserCircle;->getAppName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    return-void
.end method

.method protected e(Landroid/view/View;Lcom/huawei/health/sns/model/circle/UserCircleContent;)V
    .locals 0

    .line 142
    return-void
.end method

.method public getUserCircle()Lcom/huawei/health/sns/model/circle/UserCircle;
    .locals 1

    .line 192
    iget-object v0, p0, Lo/bli;->a:Lcom/huawei/health/sns/model/circle/UserCircle;

    return-object v0
.end method

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lo/bli;->f:Landroid/view/View$OnClickListener;

    .line 147
    return-void
.end method

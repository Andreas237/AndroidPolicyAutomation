.class public Lo/bkt;
.super Lo/bfl;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 26
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 31
    sget v0, Lcom/huawei/android/sns/R$id;->head_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bkt;->a:Landroid/widget/ImageView;

    .line 32
    sget v0, Lcom/huawei/android/sns/R$id;->title_textview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bkt;->b:Landroid/widget/TextView;

    .line 33
    invoke-virtual {p0, p1}, Lo/bkt;->a(Landroid/view/View;)V

    .line 34
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 7

    .line 40
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 42
    move-object v6, p1

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 43
    iget-object v0, p0, Lo/bkt;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bkt;->d:Landroid/content/Context;

    invoke-virtual {v6, v1}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/bkt;->a:Landroid/widget/ImageView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 46
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 45
    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    :cond_0
    return-void
.end method

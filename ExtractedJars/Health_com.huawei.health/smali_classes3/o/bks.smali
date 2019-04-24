.class public Lo/bks;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bks;->g:Landroid/widget/TextView;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bks;->f:Landroid/widget/TextView;

    .line 37
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 42
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bks;->b:Landroid/widget/TextView;

    .line 43
    sget v0, Lcom/huawei/android/sns/R$id;->head_view:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bks;->a:Landroid/widget/ImageView;

    .line 44
    sget v0, Lcom/huawei/android/sns/R$id;->assistant_brief:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bks;->g:Landroid/widget/TextView;

    .line 45
    sget v0, Lcom/huawei/android/sns/R$id;->follow_status:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bks;->f:Landroid/widget/TextView;

    .line 46
    invoke-virtual {p0, p1}, Lo/bks;->a(Landroid/view/View;)V

    .line 47
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 8

    .line 53
    if-eqz p1, :cond_1

    instance-of v0, p1, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    if-eqz v0, :cond_1

    .line 55
    move-object v6, p1

    check-cast v6, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    .line 56
    iget-object v0, p0, Lo/bks;->d:Landroid/content/Context;

    .line 57
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getSearchKey()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lo/bom;->i()Z

    move-result v3

    .line 56
    invoke-static {v0, v1, v2, v3}, Lo/bqz;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Landroid/text/SpannableStringBuilder;

    move-result-object v7

    .line 58
    iget-object v0, p0, Lo/bks;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getUID()J

    move-result-wide v0

    iget-object v2, p0, Lo/bks;->a:Landroid/widget/ImageView;

    .line 61
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getHead_pic()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getHead_pic()Ljava/lang/String;

    move-result-object v5

    .line 60
    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lo/bbk;->c(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    iget-object v0, p0, Lo/bks;->g:Landroid/widget/TextView;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getIntroduction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getFollow()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 66
    iget-object v0, p0, Lo/bks;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getFollow()I

    move-result v0

    if-nez v0, :cond_1

    .line 70
    iget-object v0, p0, Lo/bks;->f:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 73
    :cond_1
    :goto_0
    return-void
.end method

.class public Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 19
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 20
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_suggest:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->setContentView(I)V

    .line 22
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_suggest_rate_mid_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->a:Landroid/widget/TextView;

    .line 23
    sget v0, Lcom/huawei/ui/main/R$id;->IDS_finess_suggest_rate_mid_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->c:Landroid/widget/TextView;

    .line 24
    sget v0, Lcom/huawei/ui/main/R$id;->suggest_content_title_one:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->e:Landroid/widget/TextView;

    .line 25
    sget v0, Lcom/huawei/ui/main/R$id;->suggest_content_title_two:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->b:Landroid/widget/TextView;

    .line 26
    sget v0, Lcom/huawei/ui/main/R$id;->suggest_content_title_three:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->d:Landroid/widget/TextView;

    .line 28
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_reference_14:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->o:Ljava/lang/String;

    .line 29
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_fitness_core_sleep_reference_14:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->p:Ljava/lang/String;

    .line 30
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_explain_1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->i:Ljava/lang/String;

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->i:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->g:Ljava/lang/String;

    .line 32
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_explain_2:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->f:Ljava/lang/String;

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->f:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->k:Ljava/lang/String;

    .line 34
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_details_sleep_explain_3:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->h:Ljava/lang/String;

    .line 35
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->h:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->l:Ljava/lang/String;

    .line 37
    invoke-static {p0}, Lo/cxa;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 39
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/SuggestActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    return-void
.end method

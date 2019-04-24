.class public Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;
.super Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;
.source "SourceFile"


# instance fields
.field private d:Lo/ewl;

.field private e:Z

.field private f:Lo/egd;

.field private g:I

.field private h:Landroid/widget/TextView;

.field private i:Landroid/content/Intent;

.field private k:Lo/ewk;

.field private l:I

.field private m:Landroid/support/v4/content/LocalBroadcastManager;

.field private p:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 5

    .line 54
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/PressureQuestionFragment;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->e:Z

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->i:Landroid/content/Intent;

    .line 55
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->p:Landroid/content/Context;

    .line 56
    iput p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->g:I

    .line 57
    add-int/lit8 v0, p2, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->l:I

    .line 58
    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v0

    iget-object v4, v0, Lo/ewn;->a:Ljava/util/List;

    .line 59
    if-ltz p2, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 60
    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/ewk;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->k:Lo/ewk;

    .line 62
    :cond_0
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QuestionItemFragment index = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Intent;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->i:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/egd;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->f:Lo/egd;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/content/Context;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->p:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewk;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->k:Lo/ewk;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;Z)Z
    .locals 0

    .line 34
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->e:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->i:Landroid/content/Intent;

    return-object p1
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/support/v4/content/LocalBroadcastManager;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->m:Landroid/support/v4/content/LocalBroadcastManager;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->e:Z

    return v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Landroid/widget/TextView;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->h:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)Lo/ewl;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d:Lo/ewl;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 8

    .line 72
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->m:Landroid/support/v4/content/LocalBroadcastManager;

    .line 73
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-direct {v4}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_pager_question_number:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 76
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->l:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-static {}, Lo/ewn;->i()Lo/ewn;

    move-result-object v1

    iget-object v1, v1, Lo/ewn;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 77
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pager index==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_pager_question_options:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ewp;

    .line 80
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_pager_question_description:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 81
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->k:Lo/ewk;

    invoke-virtual {v0}, Lo/ewk;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    const-string v1, "\u3001"

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->k:Lo/ewk;

    invoke-virtual {v1}, Lo/ewk;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 83
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_pressure_calibrate_pager_question_btn_submit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->f:Lo/egd;

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->f:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 86
    new-instance v0, Lo/ewl;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->k:Lo/ewk;

    invoke-virtual {v2}, Lo/ewk;->d()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2, v6}, Lo/ewl;-><init>(Landroid/content/Context;Ljava/util/List;Landroid/widget/ListView;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d:Lo/ewl;

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/main/R$id;->hw_wifi_device_guide_pressure_calibrate_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->h:Landroid/widget/TextView;

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->d:Lo/ewl;

    invoke-virtual {v6, v0}, Lo/ewp;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 90
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/ewp;->setChoiceMode(I)V

    .line 91
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$5;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)V

    invoke-virtual {v6, v0}, Lo/ewp;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->f:Lo/egd;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment$2;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    return-void
.end method

.method protected e()I
    .locals 1

    .line 66
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/fragment/QuestionItemFragment;->m:Landroid/support/v4/content/LocalBroadcastManager;

    .line 67
    sget v0, Lcom/huawei/ui/main/R$layout;->pressure_calibrate_viewpager_item:I

    return v0
.end method

.class public Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private k:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 21

    .line 49
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super {v0, v1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_pressure_introduce:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->setContentView(I)V

    .line 51
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    .line 52
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_introduce_title_one:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->c:Landroid/widget/TextView;

    .line 53
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_introduce_title_second:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->a:Landroid/widget/TextView;

    .line 54
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_introduce_title_third:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->d:Landroid/widget/TextView;

    .line 55
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_introduce_title_fourth:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->b:Landroid/widget/TextView;

    .line 56
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_advice_summarize_introduce_fourth_content1:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->e:Landroid/widget/TextView;

    .line 57
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_advice_summarize_introduce_fourth_content2:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->f:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_advice_summarize_introduce_fourth_content3:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->g:Landroid/widget/TextView;

    .line 59
    sget v0, Lcom/huawei/ui/main/R$id;->pressure_advice_summarize_introduce_fourth_content4:I

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->h:Landroid/widget/TextView;

    .line 60
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 61
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 62
    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 63
    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 64
    const-wide v0, 0x409f6c0000000000L    # 2011.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v9

    .line 65
    const-wide v0, 0x409f7c0000000000L    # 2015.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v10

    .line 66
    const-wide v0, 0x409efc0000000000L    # 1983.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v11

    .line 67
    const-wide v0, 0x4051c00000000000L    # 71.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v12

    .line 68
    const-wide v0, 0x4078100000000000L    # 385.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v13

    .line 69
    const-wide v0, 0x4078c00000000000L    # 396.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v14

    .line 70
    const-wide v0, 0x4058400000000000L    # 97.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v15

    .line 71
    const-wide/high16 v0, 0x4054000000000000L    # 80.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v16

    .line 72
    const-wide/high16 v0, 0x405b000000000000L    # 108.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v17

    .line 73
    const-wide v0, 0x4077200000000000L    # 370.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v18

    .line 74
    const-wide v0, 0x4077900000000000L    # 377.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v19

    .line 75
    const-wide/high16 v0, 0x4042000000000000L    # 36.0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v20

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->c:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_advice_advice_summarize_introduce_frist_title:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->a:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_advice_advice_summarize_introduce_second_title:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->d:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_advice_advice_summarize_introduce_third_title:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->b:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_advice_advice_summarize_introduce_fourth_title:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->e:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_advice_advice_summarize_introduce_fourth_content1:I

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    const/4 v4, 0x1

    aput-object v9, v3, v4

    const/4 v4, 0x2

    aput-object v15, v3, v4

    const/4 v4, 0x3

    aput-object v17, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->f:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_advice_advice_summarize_introduce_fourth_content2:I

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v6, v3, v4

    const/4 v4, 0x1

    aput-object v11, v3, v4

    const/4 v4, 0x2

    aput-object v13, v3, v4

    const/4 v4, 0x3

    aput-object v14, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->g:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_advice_advice_summarize_introduce_fourth_content3:I

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v7, v3, v4

    const/4 v4, 0x1

    aput-object v9, v3, v4

    const/4 v4, 0x2

    aput-object v20, v3, v4

    const/4 v4, 0x3

    aput-object v12, v3, v4

    const/4 v4, 0x4

    aput-object v16, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->h:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureIntroduceActivity;->k:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_advice_advice_summarize_introduce_fourth_content4:I

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v8, v3, v4

    const/4 v4, 0x1

    aput-object v10, v3, v4

    const/4 v4, 0x2

    aput-object v18, v3, v4

    const/4 v4, 0x3

    aput-object v19, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    return-void
.end method

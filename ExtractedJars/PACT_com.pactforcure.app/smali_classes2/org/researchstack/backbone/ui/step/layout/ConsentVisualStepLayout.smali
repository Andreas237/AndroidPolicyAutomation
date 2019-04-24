.class public Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;
.super Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;
.source "ConsentVisualStepLayout.java"

# interfaces
.implements Lorg/researchstack/backbone/ui/step/layout/StepLayout;


# instance fields
.field private callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

.field private step:Lorg/researchstack/backbone/step/ConsentVisualStep;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 47
    invoke-direct {p0, p1, p2, p3}, Lorg/researchstack/backbone/ui/views/FixedSubmitBarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    return-void
.end method

.method private initializeStep()V
    .locals 19

    .prologue
    .line 90
    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->step:Lorg/researchstack/backbone/step/ConsentVisualStep;

    invoke-virtual {v14}, Lorg/researchstack/backbone/step/ConsentVisualStep;->getSection()Lorg/researchstack/backbone/model/ConsentSection;

    move-result-object v3

    .line 93
    .local v3, "data":Lorg/researchstack/backbone/model/ConsentSection;
    new-instance v13, Landroid/util/TypedValue;

    invoke-direct {v13}, Landroid/util/TypedValue;-><init>()V

    .line 94
    .local v13, "typedValue":Landroid/util/TypedValue;
    invoke-virtual/range {p0 .. p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->getContext()Landroid/content/Context;

    move-result-object v14

    iget v15, v13, Landroid/util/TypedValue;->data:I

    const/16 v16, 0x1

    move/from16 v0, v16

    new-array v0, v0, [I

    move-object/from16 v16, v0

    const/16 v17, 0x0

    sget v18, Lorg/researchstack/backbone/R$attr;->colorAccent:I

    aput v18, v16, v17

    invoke-virtual/range {v14 .. v16}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 96
    .local v1, "a":Landroid/content/res/TypedArray;
    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-virtual {v1, v14, v15}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    .line 97
    .local v2, "accentColor":I
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 99
    sget v14, Lorg/researchstack/backbone/R$id;->image:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/ImageView;

    .line 101
    .local v7, "imageView":Landroid/widget/ImageView;
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getCustomImageName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_0

    .line 102
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getCustomImageName()Ljava/lang/String;

    move-result-object v5

    .line 105
    .local v5, "imageName":Ljava/lang/String;
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->getContext()Landroid/content/Context;

    move-result-object v14

    invoke-static {v14, v5}, Lorg/researchstack/backbone/utils/ResUtils;->getDrawableResourceId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    .line 107
    .local v6, "imageResId":I
    if-eqz v6, :cond_1

    .line 109
    invoke-virtual/range {p0 .. p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 110
    .local v4, "drawable":Landroid/graphics/drawable/Drawable;
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 111
    invoke-static {v4, v2}, Landroid/support/v4/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 112
    invoke-virtual {v7, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 113
    const/4 v14, 0x0

    invoke-virtual {v7, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 121
    .end local v4    # "drawable":Landroid/graphics/drawable/Drawable;
    :goto_1
    sget v14, Lorg/researchstack/backbone/R$id;->title:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/TextView;

    .line 122
    .local v12, "titleView":Landroid/widget/TextView;
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getTitle()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-virtual/range {p0 .. p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getType()Lorg/researchstack/backbone/model/ConsentSection$Type;

    move-result-object v15

    .line 123
    invoke-virtual {v15}, Lorg/researchstack/backbone/model/ConsentSection$Type;->getTitleResId()I

    move-result v15

    .line 122
    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 124
    .local v11, "title":Ljava/lang/String;
    :goto_2
    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->step:Lorg/researchstack/backbone/step/ConsentVisualStep;

    invoke-virtual {v14}, Lorg/researchstack/backbone/step/ConsentVisualStep;->allowsBackNavigation()Z

    move-result v14

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->toggleBackNavigation(Z)V

    .line 130
    sget v14, Lorg/researchstack/backbone/R$id;->summary:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    .line 131
    .local v10, "summaryView":Landroid/widget/TextView;
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getSummary()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v14

    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    sget v14, Lorg/researchstack/backbone/R$id;->more_info:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 136
    .local v8, "moreInfoView":Landroid/widget/TextView;
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getHtmlContent()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_4

    .line 138
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getCustomLearnMoreButtonTitle()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_3

    .line 140
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getCustomLearnMoreButtonTitle()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    :goto_3
    invoke-static {v8}, Lcom/jakewharton/rxbinding/view/RxView;->clicks(Landroid/view/View;)Lrx/Observable;

    move-result-object v14

    move-object/from16 v0, p0

    invoke-static {v0, v11, v3}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;Ljava/lang/String;Lorg/researchstack/backbone/model/ConsentSection;)Lrx/functions/Action1;

    move-result-object v15

    invoke-virtual {v14, v15}, Lrx/Observable;->subscribe(Lrx/functions/Action1;)Lrx/Subscription;

    .line 158
    :goto_4
    sget v14, Lorg/researchstack/backbone/R$id;->rsb_submit_bar:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v14}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lorg/researchstack/backbone/ui/views/SubmitBar;

    .line 159
    .local v9, "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->step:Lorg/researchstack/backbone/step/ConsentVisualStep;

    invoke-virtual {v14}, Lorg/researchstack/backbone/step/ConsentVisualStep;->getNextButtonString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveTitle(Ljava/lang/String;)V

    .line 160
    invoke-static/range {p0 .. p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;)Lrx/functions/Action1;

    move-result-object v14

    invoke-virtual {v9, v14}, Lorg/researchstack/backbone/ui/views/SubmitBar;->setPositiveAction(Lrx/functions/Action1;)V

    .line 163
    invoke-virtual {v9}, Lorg/researchstack/backbone/ui/views/SubmitBar;->getNegativeActionView()Landroid/view/View;

    move-result-object v14

    const/16 v15, 0x8

    invoke-virtual {v14, v15}, Landroid/view/View;->setVisibility(I)V

    .line 164
    return-void

    .line 103
    .end local v5    # "imageName":Ljava/lang/String;
    .end local v6    # "imageResId":I
    .end local v8    # "moreInfoView":Landroid/widget/TextView;
    .end local v9    # "submitBar":Lorg/researchstack/backbone/ui/views/SubmitBar;
    .end local v10    # "summaryView":Landroid/widget/TextView;
    .end local v11    # "title":Ljava/lang/String;
    .end local v12    # "titleView":Landroid/widget/TextView;
    :cond_0
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getType()Lorg/researchstack/backbone/model/ConsentSection$Type;

    move-result-object v14

    invoke-virtual {v14}, Lorg/researchstack/backbone/model/ConsentSection$Type;->getImageName()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    .line 117
    .restart local v5    # "imageName":Ljava/lang/String;
    .restart local v6    # "imageResId":I
    :cond_1
    const/16 v14, 0x8

    invoke-virtual {v7, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_1

    .line 123
    .restart local v12    # "titleView":Landroid/widget/TextView;
    :cond_2
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getTitle()Ljava/lang/String;

    move-result-object v11

    goto/16 :goto_2

    .line 144
    .restart local v8    # "moreInfoView":Landroid/widget/TextView;
    .restart local v10    # "summaryView":Landroid/widget/TextView;
    .restart local v11    # "title":Ljava/lang/String;
    :cond_3
    invoke-virtual {v3}, Lorg/researchstack/backbone/model/ConsentSection;->getType()Lorg/researchstack/backbone/model/ConsentSection$Type;

    move-result-object v14

    invoke-virtual {v14}, Lorg/researchstack/backbone/model/ConsentSection$Type;->getMoreInfoResId()I

    move-result v14

    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    .line 155
    :cond_4
    const/16 v14, 0x8

    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4
.end method

.method static synthetic lambda$initializeStep$35(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;Ljava/lang/String;Lorg/researchstack/backbone/model/ConsentSection;Ljava/lang/Object;)V
    .locals 3
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;
    .param p3, "v"    # Ljava/lang/Object;

    .prologue
    .line 148
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 149
    invoke-virtual {p2}, Lorg/researchstack/backbone/model/ConsentSection;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/researchstack/backbone/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lorg/researchstack/backbone/model/ConsentSection;->getHtmlContent()Ljava/lang/String;

    move-result-object v1

    .line 148
    :goto_0
    invoke-static {v2, p1, v1}, Lorg/researchstack/backbone/ui/ViewWebDocumentActivity;->newIntentForContent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 150
    .local v0, "webDoc":Landroid/content/Intent;
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 151
    return-void

    .line 149
    .end local v0    # "webDoc":Landroid/content/Intent;
    :cond_0
    invoke-virtual {p2}, Lorg/researchstack/backbone/model/ConsentSection;->getContent()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method static synthetic lambda$initializeStep$36(Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;Ljava/lang/Object;)V
    .locals 4
    .param p0, "this"    # Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;
    .param p1, "v"    # Ljava/lang/Object;

    .prologue
    .line 160
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, 0x1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->step:Lorg/researchstack/backbone/step/ConsentVisualStep;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    return-void
.end method


# virtual methods
.method public clearViews()V
    .locals 0

    .prologue
    .line 174
    return-void
.end method

.method public getContentResourceId()I
    .locals 1

    .prologue
    .line 85
    sget v0, Lorg/researchstack/backbone/R$layout;->rsb_step_layout_consent_visual:I

    return v0
.end method

.method public getLayout()Landroid/view/View;
    .locals 0

    .prologue
    .line 66
    return-object p0
.end method

.method public initialize(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V
    .locals 0
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "result"    # Lorg/researchstack/backbone/result/StepResult;

    .prologue
    .line 53
    check-cast p1, Lorg/researchstack/backbone/step/ConsentVisualStep;

    .end local p1    # "step":Lorg/researchstack/backbone/step/Step;
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->step:Lorg/researchstack/backbone/step/ConsentVisualStep;

    .line 54
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->initializeStep()V

    .line 55
    return-void
.end method

.method public isBackEventConsumed()Z
    .locals 4

    .prologue
    .line 72
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    const/4 v1, -0x1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->step:Lorg/researchstack/backbone/step/ConsentVisualStep;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;->onSaveStep(ILorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/StepResult;)V

    .line 73
    const/4 v0, 0x0

    return v0
.end method

.method public onRestoreStep(Lorg/researchstack/backbone/step/Step;Ljava/lang/String;)V
    .locals 0
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;
    .param p2, "answer"    # Ljava/lang/String;

    .prologue
    .line 169
    return-void
.end method

.method public onViewChange(Lorg/researchstack/backbone/step/Step;)V
    .locals 1
    .param p1, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 60
    invoke-virtual {p1}, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation()Z

    move-result v0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->toggleBackNavigation(Z)V

    .line 61
    return-void
.end method

.method public setCallbacks(Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;)V
    .locals 0
    .param p1, "callbacks"    # Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .prologue
    .line 79
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/layout/ConsentVisualStepLayout;->callbacks:Lorg/researchstack/backbone/ui/callbacks/StepCallbacks;

    .line 80
    return-void
.end method

.class public Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;
.super Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;
.source "QuestionEngagementView.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field protected bSubmit:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900ab
    .end annotation
.end field

.field protected driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

.field protected gameQuestionDriverFactory:Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected llOptions:Landroid/widget/LinearLayout;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09031b
    .end annotation
.end field

.field protected optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private optionsMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OptionModel;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private submitting:Z

.field protected tvLegal:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09053b
    .end annotation
.end field

.field protected tvQuestion:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090562
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 62
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 49
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    return-void
.end method

.method private canProceedAfterAnswer()Z
    .locals 6

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->getCurrentGameQuestion()Lcom/ibotta/android/fragment/game/question/GameQuestion;

    move-result-object v0

    .line 261
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionHelper:Lcom/ibotta/api/helper/offer/OptionHelper;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getOptions()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getAnswer()I

    move-result v0

    int-to-long v3, v0

    invoke-interface {v1, v2, v3, v4}, Lcom/ibotta/api/helper/offer/OptionHelper;->findById(Ljava/util/List;J)Lcom/ibotta/api/model/OptionModel;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    .line 267
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 268
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->isSelected()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 269
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OptionModel;

    :cond_2
    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 274
    invoke-interface {v2}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result v2

    invoke-interface {v0}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result v0

    if-ne v2, v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_4

    const v0, 0x7f110293

    goto :goto_1

    :cond_4
    const v0, 0x7f110294

    :goto_1
    if-eqz v1, :cond_5

    .line 281
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->proceedAfterAnswer()V

    .line 284
    :cond_5
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0, v3, v3}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->showQuickMessage(Ljava/lang/String;ZZ)V

    return v3
.end method

.method private clearAnswers()V
    .locals 4

    .line 238
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 239
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OptionModel;

    .line 240
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const/4 v3, 0x0

    .line 242
    invoke-virtual {v1, v3}, Landroid/view/View;->setSelected(Z)V

    .line 243
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v2}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result v2

    int-to-long v2, v2

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->removeResponse(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private clearTheClearAllAnswer()V
    .locals 4

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 249
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OptionModel;

    .line 250
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 252
    invoke-interface {v2}, Lcom/ibotta/api/model/OptionModel;->isClearOptions()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    .line 253
    invoke-virtual {v1, v3}, Landroid/view/View;->setSelected(Z)V

    .line 254
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v2}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result v2

    int-to-long v2, v2

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->removeResponse(J)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private createDivider()Landroid/view/View;
    .locals 5

    .line 141
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v1, 0x7f060110

    .line 142
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 144
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 146
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 147
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07015d

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const/4 v4, -0x1

    invoke-direct {v2, v4, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 148
    iput v1, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 150
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private createEngagementPollRow(Lcom/ibotta/api/model/OptionModel;)Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;
    .locals 3

    .line 126
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;-><init>(Landroid/content/Context;)V

    .line 127
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->setOption(Lcom/ibotta/api/model/OptionModel;)V

    .line 128
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/engagement/-$$Lambda$QuestionEngagementView$LR3_zPzcOkaXSU8LWjnZtee6zbA;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/-$$Lambda$QuestionEngagementView$LR3_zPzcOkaXSU8LWjnZtee6zbA;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;Lcom/ibotta/api/model/OptionModel;)V

    instance-of p1, v0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p1, v0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 130
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f070165

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    const/4 v1, 0x0

    .line 131
    invoke-virtual {v0, p1, p1, v1, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->setPadding(IIII)V

    .line 133
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {p1, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 135
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private initButton()V
    .locals 5

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->isMultiQuestion()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->isQuestionNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->bSubmit:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v1}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->getSubmitButtonText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 169
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f11028f

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->currentValue:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 170
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->bSubmit:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 173
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->bSubmit:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->isSelection()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method private initLegal()V
    .locals 2

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/TaskModel;->getLegal()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->tvLegal:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->tvLegal:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getLegal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->tvLegal:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private initQuestion()V
    .locals 2

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->getCurrentGameQuestion()Lcom/ibotta/android/fragment/game/question/GameQuestion;

    move-result-object v0

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->tvQuestion:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic lambda$createEngagementPollRow$0(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;Lcom/ibotta/api/model/OptionModel;Landroid/view/View;)V
    .locals 0

    .line 128
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->onOptionSelected(Lcom/ibotta/api/model/OptionModel;)V

    return-void
.end method

.method private proceedAfterAnswer()V
    .locals 5

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 291
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 292
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OptionModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result v1

    int-to-long v3, v1

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->addResponse(J)V

    goto :goto_0

    .line 294
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OptionModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OptionModel;->getId()I

    move-result v1

    int-to-long v3, v1

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->removeResponse(J)V

    goto :goto_0

    .line 298
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->isQuestionNext()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->navigateForward()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 299
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->submitting:Z

    .line 300
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->initQuestion()V

    .line 301
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->initOptions()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    .line 302
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->initButton()V

    goto :goto_1

    .line 304
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->buildResponse()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->notifySuccess(Ljava/lang/String;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public buildResponse()Ljava/lang/String;
    .locals 5

    .line 309
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 311
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v1}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->getResponses()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    add-int/lit8 v4, v2, 0x1

    .line 312
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v2, v4

    goto :goto_0

    .line 315
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, ","

    invoke-static {v0, v1}, Lcom/ibotta/android/util/StringHelper;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getEmailContent()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getEmailSubject()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getLayoutId()I
    .locals 1

    const v0, 0x7f0c01a6

    return v0
.end method

.method protected initLayout()V
    .locals 0

    return-void
.end method

.method protected initOptions()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OptionModel;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->getCurrentGameQuestion()Lcom/ibotta/android/fragment/game/question/GameQuestion;

    move-result-object v0

    .line 102
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getOptions()Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 103
    new-instance v0, Lcom/ibotta/android/fragment/game/question/GameQuestionOptionWeightComparator;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionOptionWeightComparator;-><init>()V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->llOptions:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 107
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    .line 109
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 110
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/OptionModel;

    .line 112
    invoke-direct {p0, v3}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->createEngagementPollRow(Lcom/ibotta/api/model/OptionModel;)Lcom/ibotta/android/mvp/ui/view/engagement/row/PollRowEngagementView;

    move-result-object v4

    .line 113
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->llOptions:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 115
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ge v2, v5, :cond_0

    .line 116
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->llOptions:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->createDivider()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 119
    :cond_0
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected injectThis()V
    .locals 1

    .line 71
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;)V

    return-void
.end method

.method protected isSelection()Z
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 228
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected isShareable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onOptionSelected(Lcom/ibotta/api/model/OptionModel;)V
    .locals 4

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    invoke-interface {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;->getCurrentGameQuestion()Lcom/ibotta/android/fragment/game/question/GameQuestion;

    move-result-object v0

    .line 206
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 207
    invoke-virtual {v1}, Landroid/view/View;->isSelected()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    .line 209
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/game/question/GameQuestion;->getMode()Lcom/ibotta/android/fragment/game/question/Mode;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/fragment/game/question/Mode;->ANSWER_SINGLE:Lcom/ibotta/android/fragment/game/question/Mode;

    if-ne v0, v3, :cond_0

    .line 210
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->clearAnswers()V

    .line 211
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    goto :goto_1

    .line 213
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OptionModel;->isClearOptions()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 214
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->clearAnswers()V

    goto :goto_0

    .line 216
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->clearTheClearAllAnswer()V

    .line 219
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 222
    :goto_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->initButton()V

    return-void
.end method

.method protected onSetup()V
    .locals 2

    .line 85
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->gameQuestionDriverFactory:Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/fragment/game/question/GameQuestionDriverFactory;->getDriver(Lcom/ibotta/api/model/TaskModel;)Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->driver:Lcom/ibotta/android/fragment/game/question/GameQuestionDriver;

    .line 87
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->initQuestion()V

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->initOptions()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->optionsMap:Ljava/util/Map;

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->initLegal()V

    .line 90
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->initButton()V

    return-void
.end method

.method protected onSubmitClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900ab
        }
    .end annotation

    .line 193
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->submitting:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 197
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->submitting:Z

    .line 199
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->canProceedAfterAnswer()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 200
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/QuestionEngagementView;->proceedAfterAnswer()V

    :cond_1
    return-void
.end method

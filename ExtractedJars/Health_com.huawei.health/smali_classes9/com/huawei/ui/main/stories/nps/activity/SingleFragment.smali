.class public Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ValidFragment"
    }
.end annotation


# instance fields
.field private TAG:Ljava/lang/String;

.field private adapter:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

.field private beans:[Ljava/lang/String;

.field private mHandler:Landroid/os/Handler;

.field private mListView:Landroid/widget/ListView;

.field private mNumber:I

.field private mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

.field private mQstnchooseResponses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;>;"
        }
    .end annotation
.end field

.field private mTitle:Landroid/widget/TextView;

.field private states:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 32
    const-string v0, "SingleFragment"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->TAG:Ljava/lang/String;

    .line 45
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$1;-><init>(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mHandler:Landroid/os/Handler;

    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->states:Ljava/util/HashMap;

    .line 66
    return-void
.end method

.method public constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    .line 59
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 32
    const-string v0, "SingleFragment"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->TAG:Ljava/lang/String;

    .line 45
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$1;-><init>(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mHandler:Landroid/os/Handler;

    .line 56
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->states:Ljava/util/HashMap;

    .line 60
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 61
    iput p2, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mNumber:I

    .line 62
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Landroid/widget/ListView;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mListView:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Ljava/util/List;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Ljava/util/HashMap;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->states:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic access$300(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->adapter:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    return-object v0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 72
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_nps_question_single:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 74
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getChoose()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    .line 75
    sget v0, Lcom/huawei/ui/main/R$id;->single_listview:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mListView:Landroid/widget/ListView;

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->states:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->beans:[Ljava/lang/String;

    .line 80
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 81
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;->getRemark()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->beans:[Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;

    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;

    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;->getRemark()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    goto :goto_1

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->beans:[Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 86
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v6, :cond_1

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->states:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 89
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->states:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 95
    :cond_2
    new-instance v0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->beans:[Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->states:Ljava/util/HashMap;

    iget-object v4, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mHandler:Landroid/os/Handler;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;-><init>(Landroid/content/Context;[Ljava/lang/String;Ljava/util/HashMap;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->adapter:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mListView:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->adapter:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mListView:Landroid/widget/ListView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mListView:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;-><init>(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 113
    sget v0, Lcom/huawei/ui/main/R$id;->single_title:I

    invoke-static {v5, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mTitle:Landroid/widget/TextView;

    .line 114
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mTitle:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mNumber:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 116
    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getQuestion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 118
    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getQuestionType()Ljava/lang/String;

    move-result-object v2

    .line 117
    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/interactors/util/ParamsUtils;->getQuestionTypeParams(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 114
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mListView:Landroid/widget/ListView;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 120
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->saveData()V

    .line 121
    return-object v5
.end method

.method public saveData()V
    .locals 5

    .line 126
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========Enter saveData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mListView:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getCheckedItemPosition()I

    move-result v4

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v1, v4, -0x1

    if-ge v0, v1, :cond_1

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========saveData  error1 !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    return-void

    .line 132
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "==========saveData  error2 !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void

    .line 136
    :cond_2
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getOptionResult()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getId()Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->mQstnchooseResponses:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;

    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSurveyChooseResponse;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "finish single successful getOptionResult:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getOptionResult()Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    return-void
.end method

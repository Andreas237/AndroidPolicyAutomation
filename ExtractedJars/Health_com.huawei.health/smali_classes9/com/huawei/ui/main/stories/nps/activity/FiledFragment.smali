.class public Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;
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

.field private mContent:Landroid/widget/EditText;

.field private mFiledData:Ljava/lang/String;

.field private mNumber:I

.field private mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

.field private mQuestionId:Ljava/lang/Integer;

.field private mTitle:Landroid/widget/TextView;

.field private watcher:Landroid/text/TextWatcher;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 28
    const-string v0, "FiledFragment"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->TAG:Ljava/lang/String;

    .line 79
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;-><init>(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->watcher:Landroid/text/TextWatcher;

    .line 43
    return-void
.end method

.method public constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 28
    const-string v0, "FiledFragment"

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->TAG:Ljava/lang/String;

    .line 79
    new-instance v0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;-><init>(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->watcher:Landroid/text/TextWatcher;

    .line 51
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 52
    iput p2, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mNumber:I

    .line 54
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mFiledData:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mFiledData:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/Integer;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mQuestionId:Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->TAG:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 60
    sget v0, Lcom/huawei/ui/main/R$layout;->fragment_nps_question_filed:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 62
    sget v0, Lcom/huawei/ui/main/R$id;->field_title:I

    invoke-static {v3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mTitle:Landroid/widget/TextView;

    .line 64
    sget v0, Lcom/huawei/ui/main/R$id;->field_content_et:I

    invoke-static {v3, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mContent:Landroid/widget/EditText;

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mContent:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->watcher:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mTitle:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mNumber:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 69
    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getQuestion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    .line 71
    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getQuestionType()Ljava/lang/String;

    move-result-object v2

    .line 70
    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/interactors/util/ParamsUtils;->getQuestionTypeParams(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mQstnSureyResponse:Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/QstnSureyResponse;->getId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mQuestionId:Ljava/lang/Integer;

    .line 74
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mQuestionId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mFiledData:Ljava/lang/String;

    .line 75
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->mQuestionId:Ljava/lang/Integer;

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    return-object v3
.end method

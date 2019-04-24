.class public Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;
.super Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;
.source "TestifyEngagementView.java"


# static fields
.field private static final MIN_LENGTH:I = 0x3


# instance fields
.field protected bSubmit:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900ab
    .end annotation
.end field

.field protected etAnswer:Landroid/widget/EditText;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0901bd
    .end annotation
.end field

.field private textWatcher:Landroid/text/TextWatcher;

.field protected tvContent:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09050e
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/engagement/AbstractEngagementView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->onAnswerChanged()V

    return-void
.end method

.method private initAnswerField()V
    .locals 2

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->textWatcher:Landroid/text/TextWatcher;

    if-nez v0, :cond_0

    .line 73
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->textWatcher:Landroid/text/TextWatcher;

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->etAnswer:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->textWatcher:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    return-void
.end method

.method private initContent()V
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->tvContent:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->taskModel:Lcom/ibotta/api/model/TaskModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/TaskModel;->getContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private initSubmitButton()V
    .locals 4

    .line 93
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->currentValue:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f11028f

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->bSubmit:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 95
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->bSubmit:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method private onAnswerChanged()V
    .locals 3

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->bSubmit:Landroid/widget/Button;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->etAnswer:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method


# virtual methods
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

    const v0, 0x7f0c01db

    return v0
.end method

.method protected initLayout()V
    .locals 0

    return-void
.end method

.method protected injectThis()V
    .locals 1

    .line 48
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;)V

    return-void
.end method

.method protected isShareable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected onSetup()V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->initContent()V

    .line 63
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->initAnswerField()V

    .line 64
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->initSubmitButton()V

    return-void
.end method

.method protected onSubmitClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900ab
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->engagementHost:Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/TestifyEngagementView;->etAnswer:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/engagement/EngagementHost;->notifySuccess(Ljava/lang/String;)V

    return-void
.end method

.class public Lcom/shopkick/app/controllers/FirstNamePanelController;
.super Lcom/shopkick/app/controllers/InputPanelController;
.source "FirstNamePanelController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/text/TextWatcher;


# instance fields
.field private didLogFirstNameTextFieldChanged:Z

.field private editText:Lcom/shopkick/app/widget/SKEditText;

.field private inputLayout:Landroid/support/design/widget/TextInputLayout;

.field private nextButton:Lcom/shopkick/app/widget/SKButton;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/shopkick/app/activities/BaseActivity;",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/controllers/IPanelControllerCallback;",
            "Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;",
            ")V"
        }
    .end annotation

    .line 37
    invoke-direct/range {p0 .. p7}, Lcom/shopkick/app/controllers/InputPanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    return-void
.end method

.method private onClickNextButton()V
    .locals 3

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/FirstNamePanelController;->enableNextButton(Lcom/shopkick/app/widget/SKButton;Z)V

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 114
    iget-object v1, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->panelStorageProviderCallback:Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;

    const-string v2, "first_name"

    invoke-interface {v1, v2, v0}, Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;->putValueForKey(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->panelControllerCallback:Lcom/shopkick/app/controllers/IPanelControllerCallback;

    invoke-interface {v0}, Lcom/shopkick/app/controllers/IPanelControllerCallback;->triggerNextPanel()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 86
    iget-boolean p1, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->didLogFirstNameTextFieldChanged:Z

    if-nez p1, :cond_0

    .line 87
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x140

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x55

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 88
    invoke-virtual {p0, p1}, Lcom/shopkick/app/controllers/FirstNamePanelController;->logEventRecordWithScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    const/4 p1, 0x1

    .line 90
    iput-boolean p1, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->didLogFirstNameTextFieldChanged:Z

    .line 94
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/controllers/FirstNamePanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_0

    .line 106
    invoke-direct {p0}, Lcom/shopkick/app/controllers/FirstNamePanelController;->onClickNextButton()V

    :cond_0
    return-void
.end method

.method public onPanelDidShow()V
    .locals 2

    .line 66
    invoke-super {p0}, Lcom/shopkick/app/controllers/InputPanelController;->onPanelDidShow()V

    .line 67
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v1, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/FirstNamePanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->requestFocus()Z

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/controllers/FirstNamePanelController;->showKeyboard(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 71
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->didLogFirstNameTextFieldChanged:Z

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public setUpPanel(Landroid/view/ViewGroup;)V
    .locals 3

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c00b7

    invoke-virtual {v0, v1, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f090286

    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f090285

    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKEditText;

    iput-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    .line 49
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f090284

    .line 53
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 54
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->params:Ljava/util/Map;

    const-string v2, "button_text"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x1d

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/FirstNamePanelController;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    .line 58
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->panelView:Landroid/view/View;

    .line 61
    invoke-virtual {p0}, Lcom/shopkick/app/controllers/FirstNamePanelController;->onPanelDidShow()V

    return-void
.end method

.method protected validateInput()Z
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/shopkick/app/controllers/FirstNamePanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 100
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

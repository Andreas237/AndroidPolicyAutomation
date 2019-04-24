.class public Lcom/shopkick/app/controllers/EmailPanelController;
.super Lcom/shopkick/app/controllers/InputPanelController;
.source "EmailPanelController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Landroid/text/TextWatcher;


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private didLogEmailTextFieldChanged:Z

.field private editText:Lcom/shopkick/app/widget/SKEditText;

.field private inputLayout:Landroid/support/design/widget/TextInputLayout;

.field private nextButton:Lcom/shopkick/app/widget/SKButton;

.field private progressBar:Landroid/widget/ProgressBar;

.field private shouldMakeEmailValidationRequest:Z

.field private validateSignupEmailRequest:Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailRequest;


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

    .line 52
    invoke-direct/range {p0 .. p7}, Lcom/shopkick/app/controllers/InputPanelController;-><init>(Lcom/shopkick/app/application/ScreenGlobals;Lcom/shopkick/app/logging/UserEventLogger;Ljava/util/Map;Lcom/shopkick/app/activities/BaseActivity;Landroid/content/Context;Lcom/shopkick/app/controllers/IPanelControllerCallback;Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;)V

    const/4 p2, 0x0

    .line 45
    iput-boolean p2, p0, Lcom/shopkick/app/controllers/EmailPanelController;->shouldMakeEmailValidationRequest:Z

    .line 54
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/controllers/EmailPanelController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 55
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method private onClickNextButton()V
    .locals 3

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/EmailPanelController;->enableNextButton(Lcom/shopkick/app/widget/SKButton;Z)V

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 144
    iget-boolean v2, p0, Lcom/shopkick/app/controllers/EmailPanelController;->shouldMakeEmailValidationRequest:Z

    if-eqz v2, :cond_0

    .line 145
    iget-object v2, p0, Lcom/shopkick/app/controllers/EmailPanelController;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 146
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailRequest;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailRequest;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->validateSignupEmailRequest:Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailRequest;

    .line 147
    iget-object v1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->validateSignupEmailRequest:Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailRequest;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailRequest;->email:Ljava/lang/String;

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    .line 150
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/EmailPanelController;->onSuccessfulEmailValidationResponse()V

    :goto_0
    return-void
.end method

.method private onSuccessfulEmailValidationResponse()V
    .locals 3

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->panelStorageProviderCallback:Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;

    const-string v1, "email_address"

    iget-object v2, p0, Lcom/shopkick/app/controllers/EmailPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    .line 188
    invoke-virtual {v2}, Lcom/shopkick/app/widget/SKEditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v2

    .line 187
    invoke-interface {v0, v1, v2}, Lcom/shopkick/app/controllers/IPanelStorageProviderCallback;->putValueForKey(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->panelControllerCallback:Lcom/shopkick/app/controllers/IPanelControllerCallback;

    invoke-interface {v0}, Lcom/shopkick/app/controllers/IPanelControllerCallback;->triggerNextPanel()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    const/4 v0, 0x1

    .line 106
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->shouldMakeEmailValidationRequest:Z

    .line 108
    iget-boolean v1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->didLogEmailTextFieldChanged:Z

    if-nez v1, :cond_0

    .line 109
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x13e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x55

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 110
    invoke-virtual {p0, v1}, Lcom/shopkick/app/controllers/EmailPanelController;->logEventRecordWithScreenParams(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 112
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->didLogEmailTextFieldChanged:Z

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 117
    iget-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 118
    iget-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/shopkick/app/controllers/EmailPanelController;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    .line 123
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/controllers/EmailPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 162
    iget-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->progressBar:Landroid/widget/ProgressBar;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 164
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    .line 165
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailResponse;

    .line 166
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    .line 167
    iput-boolean p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->shouldMakeEmailValidationRequest:Z

    .line 168
    invoke-direct {p0}, Lcom/shopkick/app/controllers/EmailPanelController;->onSuccessfulEmailValidationResponse()V

    goto :goto_0

    .line 171
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailResponse;->message:Ljava/lang/String;

    .line 172
    iget-object p2, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v0, 0x1

    invoke-virtual {p0, p2, v0, p1}, Lcom/shopkick/app/controllers/EmailPanelController;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    .line 174
    iget-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object p2, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/controllers/EmailPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    goto :goto_0

    .line 177
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/controllers/EmailPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    .line 180
    iget-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :goto_0
    const/4 p1, 0x0

    .line 183
    iput-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->validateSignupEmailRequest:Lcom/shopkick/app/fetchers/api/skapi/ValidateSignupEmailRequest;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_0

    .line 135
    invoke-direct {p0}, Lcom/shopkick/app/controllers/EmailPanelController;->onClickNextButton()V

    :cond_0
    return-void
.end method

.method public onPanelDidShow()V
    .locals 2

    .line 86
    invoke-super {p0}, Lcom/shopkick/app/controllers/InputPanelController;->onPanelDidShow()V

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    iget-object v1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/EmailPanelController;->updateNextButton(Landroid/support/design/widget/TextInputLayout;Lcom/shopkick/app/widget/SKButton;)V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->requestFocus()Z

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/controllers/EmailPanelController;->showKeyboard(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 91
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->didLogEmailTextFieldChanged:Z

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setUpPanel(Landroid/view/ViewGroup;)V
    .locals 3

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c00ab

    invoke-virtual {v0, v1, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f09023d

    .line 61
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f09023a

    .line 63
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/TextInputLayout;

    iput-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKEditText;

    iput-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    .line 66
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->inputLayout:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 68
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v0, 0x7f090237

    .line 70
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKButton;

    iput-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 71
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->params:Ljava/util/Map;

    const-string v2, "button_text"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const/16 v1, 0x1d

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/controllers/EmailPanelController;->setupEventLogForButton(Lcom/shopkick/app/widget/SKButton;I)V

    const v0, 0x7f090432

    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->progressBar:Landroid/widget/ProgressBar;

    .line 76
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 78
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 80
    iput-object p1, p0, Lcom/shopkick/app/controllers/EmailPanelController;->panelView:Landroid/view/View;

    .line 81
    invoke-virtual {p0}, Lcom/shopkick/app/controllers/EmailPanelController;->onPanelDidShow()V

    return-void
.end method

.method protected validateInput()Z
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/controllers/EmailPanelController;->editText:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getTrimmedInput()Ljava/lang/String;

    move-result-object v0

    .line 129
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/shopkick/app/validators/EmailValidator;->isValid(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

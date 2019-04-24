.class public Lcom/shopkick/app/account/ChangePasswordScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ChangePasswordScreen.java"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field public static final MAX_FAILED_CHANGE_PWD_COUNT_BEFORE_LOGOUT:I = 0x5


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field changeDialog:Landroid/app/ProgressDialog;

.field changePwdError:Landroid/widget/TextView;

.field changePwdErrorVisible:Z

.field changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

.field clickListener:Landroid/view/View$OnClickListener;

.field currPwd:Landroid/widget/EditText;

.field currPwdError:Landroid/widget/TextView;

.field currPwdErrorVisible:Z

.field newPwd:Landroid/widget/EditText;

.field newPwdError:Landroid/widget/TextView;

.field newPwdErrorVisible:Z

.field retypePwd:Landroid/widget/EditText;

.field retypePwdError:Landroid/widget/TextView;

.field retypePwdErrorVisible:Z

.field savePasswordButton:Landroid/view/View;

.field private userAcct:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 52
    iput-boolean v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwdErrorVisible:Z

    .line 53
    iput-boolean v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwdErrorVisible:Z

    .line 54
    iput-boolean v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdErrorVisible:Z

    .line 55
    iput-boolean v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdErrorVisible:Z

    .line 97
    new-instance v0, Lcom/shopkick/app/account/ChangePasswordScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/ChangePasswordScreen$1;-><init>(Lcom/shopkick/app/account/ChangePasswordScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->clickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/ChangePasswordScreen;)Z
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/account/ChangePasswordScreen;->formIsValid()Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/ChangePasswordScreen;)Lcom/shopkick/fetchers/api/APIManager;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-object p0
.end method

.method private formIsValid()Z
    .locals 6

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwdError:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 138
    iput-boolean v2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwdErrorVisible:Z

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    .line 143
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwd:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 144
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x6

    if-ge v4, v5, :cond_2

    .line 145
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwdError:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 146
    iput-boolean v2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwdErrorVisible:Z

    move v0, v2

    .line 151
    :cond_2
    iget-object v4, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwd:Landroid/widget/EditText;

    invoke-virtual {v4}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 152
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 153
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdError:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 154
    iput-boolean v2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdErrorVisible:Z

    move v0, v2

    :cond_4
    xor-int/2addr v0, v2

    return v0
.end method

.method public static synthetic lambda$completedResponse$10(Lcom/shopkick/app/account/ChangePasswordScreen;Ljava/lang/ref/WeakReference;)V
    .locals 0

    .line 239
    invoke-static {p1}, Lcom/shopkick/app/application/dialog/SKDialogFragment;->hideIfNotNull(Ljava/lang/ref/WeakReference;)V

    .line 240
    invoke-virtual {p0}, Lcom/shopkick/app/account/ChangePasswordScreen;->popScreen()V

    return-void
.end method

.method private shouldEnableSaveButton()Z
    .locals 2

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdError:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdError:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v1
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    .line 167
    iget-boolean p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwdErrorVisible:Z

    if-eqz p1, :cond_2

    .line 168
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwdError:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 169
    iput-boolean v2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwdErrorVisible:Z

    goto :goto_0

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 172
    iget-boolean p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwdErrorVisible:Z

    if-eqz p1, :cond_2

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwdError:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 174
    iput-boolean v2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwdErrorVisible:Z

    goto :goto_0

    .line 176
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwd:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 177
    iget-boolean p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdErrorVisible:Z

    if-eqz p1, :cond_2

    .line 178
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdError:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 179
    iput-boolean v2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdErrorVisible:Z

    .line 184
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/account/ChangePasswordScreen;->shouldEnableSaveButton()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->savePasswordButton:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 187
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->savePasswordButton:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    :goto_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 10

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changeDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    if-ne p1, v0, :cond_3

    .line 223
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_2

    .line 224
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordResponse;

    .line 225
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 226
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/account/UserAccount;->setFailedChangePasswordCount(I)V

    .line 227
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 228
    invoke-virtual {p0}, Lcom/shopkick/app/account/ChangePasswordScreen;->popScreen()V

    goto :goto_0

    .line 230
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getFailedChangePasswordCount()I

    move-result p2

    const/4 v1, 0x1

    add-int/2addr p2, v1

    .line 231
    iget-object v2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2, p2}, Lcom/shopkick/app/account/UserAccount;->setFailedChangePasswordCount(I)V

    .line 232
    iget-object v2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->save()V

    const/4 v2, 0x5

    if-lt p2, v2, :cond_1

    .line 234
    iget-object v3, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v4, 0x0

    const p1, 0x7f11010a

    .line 235
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/ChangePasswordScreen;->getString(I)Ljava/lang/String;

    move-result-object v5

    const p1, 0x7f110109

    .line 236
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/ChangePasswordScreen;->getString(I)Ljava/lang/String;

    move-result-object v6

    const p1, 0x7f11010c

    .line 237
    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/ChangePasswordScreen;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/shopkick/app/account/-$$Lambda$ChangePasswordScreen$Vswed_gxfRsZud66vhbrTkDnuBM;

    invoke-direct {v8, p0}, Lcom/shopkick/app/account/-$$Lambda$ChangePasswordScreen$Vswed_gxfRsZud66vhbrTkDnuBM;-><init>(Lcom/shopkick/app/account/ChangePasswordScreen;)V

    const/4 v9, 0x0

    .line 234
    invoke-virtual/range {v3 .. v9}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 244
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdError:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordResponse;->errorMsg:Ljava/lang/String;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 245
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdError:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 246
    iput-boolean v1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdErrorVisible:Z

    goto :goto_0

    .line 250
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :goto_0
    const/4 p1, 0x0

    .line 253
    iput-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    :cond_3
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const/4 p3, 0x0

    const v0, 0x7f0c0061

    .line 68
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    const p2, 0x7f110108

    .line 69
    invoke-virtual {p0, p2}, Lcom/shopkick/app/account/ChangePasswordScreen;->setAppScreenTitle(I)V

    const p2, 0x7f0900f5

    .line 70
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwd:Landroid/widget/EditText;

    .line 71
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwd:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f0900f8

    .line 72
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwd:Landroid/widget/EditText;

    .line 73
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwd:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f0900fa

    .line 74
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwd:Landroid/widget/EditText;

    .line 75
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwd:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f0905f9

    .line 77
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->savePasswordButton:Landroid/view/View;

    .line 78
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->savePasswordButton:Landroid/view/View;

    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 79
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->savePasswordButton:Landroid/view/View;

    invoke-virtual {p2, p3}, Landroid/view/View;->setEnabled(Z)V

    const p2, 0x7f0900f4

    .line 80
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->currPwdError:Landroid/widget/TextView;

    const p2, 0x7f0900f7

    .line 81
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->newPwdError:Landroid/widget/TextView;

    const p2, 0x7f0900f9

    .line 82
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->retypePwdError:Landroid/widget/TextView;

    const p2, 0x7f0900f6

    .line 83
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdError:Landroid/widget/TextView;

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 61
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 62
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 63
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 90
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    if-eqz v0, :cond_0

    .line 91
    iget-object v1, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 93
    iput-object v0, p0, Lcom/shopkick/app/account/ChangePasswordScreen;->changePwdReq:Lcom/shopkick/app/fetchers/api/skapi/UserChangePasswordRequest;

    .line 94
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

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

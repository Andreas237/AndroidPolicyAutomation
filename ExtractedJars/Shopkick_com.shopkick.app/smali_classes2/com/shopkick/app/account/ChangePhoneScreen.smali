.class public Lcom/shopkick/app/account/ChangePhoneScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ChangePhoneScreen.java"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# instance fields
.field alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

.field changeDialog:Landroid/app/ProgressDialog;

.field changePhoneError:Landroid/widget/TextView;

.field clickListener:Landroid/view/View$OnClickListener;

.field clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

.field errorVisible:Z

.field nextButton:Lcom/shopkick/app/widget/SKButton;

.field phoneError:Landroid/widget/TextView;

.field phoneErrorVisible:Z

.field phoneNum:Landroid/widget/EditText;

.field updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

.field userAcct:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    .line 92
    new-instance v0, Lcom/shopkick/app/account/ChangePhoneScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/ChangePhoneScreen$1;-><init>(Lcom/shopkick/app/account/ChangePhoneScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->clickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/ChangePhoneScreen;)Z
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/shopkick/app/account/ChangePhoneScreen;->formIsValid()Z

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/ChangePhoneScreen;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/shopkick/app/account/ChangePhoneScreen;->changeNum()V

    return-void
.end method

.method private changeNum()V
    .locals 5

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->changeDialog:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    .line 119
    invoke-virtual {p0}, Lcom/shopkick/app/account/ChangePhoneScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f11073e

    .line 121
    invoke-virtual {p0, v2}, Lcom/shopkick/app/account/ChangePhoneScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 119
    invoke-static {v0, v1, v2, v3, v4}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->changeDialog:Landroid/app/ProgressDialog;

    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 127
    :goto_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneNum:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 129
    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 128
    invoke-static {v1, v2}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFormattedForNetwork(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->phoneNumber:Ljava/lang/String;

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private formIsValid()Z
    .locals 4

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneNum:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 142
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 147
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v3}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v0, v3}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->isValid(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_2

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneError:Landroid/widget/TextView;

    const v3, 0x7f110735

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 149
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneError:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 150
    iput-boolean v2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->errorVisible:Z

    move v1, v2

    goto :goto_1

    .line 143
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneError:Landroid/widget/TextView;

    const v3, 0x7f11017d

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneError:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 145
    iput-boolean v2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->errorVisible:Z

    move v1, v2

    :cond_2
    :goto_1
    xor-int/lit8 v0, v1, 0x1

    return v0
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 163
    iget-boolean p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->errorVisible:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneErrorVisible:Z

    if-eqz p1, :cond_1

    .line 164
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->changePhoneError:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 165
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneError:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 p1, 0x0

    .line 166
    iput-boolean p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->errorVisible:Z

    .line 167
    iput-boolean p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneErrorVisible:Z

    :cond_1
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-ne p1, v0, :cond_2

    .line 190
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->changeDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 191
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_1

    .line 192
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;

    .line 193
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->phoneNumberMessage:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 195
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->changePhoneError:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->phoneNumberMessage:Ljava/lang/String;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->changePhoneError:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 197
    iput-boolean v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->errorVisible:Z

    goto :goto_0

    .line 199
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/account/UserAccount;->setUserInfo(Lcom/shopkick/app/fetchers/api/skapi/UserInfo;)V

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 201
    invoke-virtual {p0}, Lcom/shopkick/app/account/ChangePhoneScreen;->popScreen()V

    goto :goto_0

    .line 204
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    :goto_0
    const/4 p1, 0x0

    .line 206
    iput-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    :cond_2
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const/4 p3, 0x0

    const v0, 0x7f0c0062

    .line 70
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f11010f

    .line 71
    invoke-virtual {p0, p2}, Lcom/shopkick/app/account/ChangePhoneScreen;->setAppScreenTitle(I)V

    const p2, 0x7f0900f2

    .line 72
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneNum:Landroid/widget/EditText;

    .line 73
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneNum:Landroid/widget/EditText;

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Lcom/shopkick/app/util/phoneNumber/PhoneNumberInputFilter;

    invoke-direct {v1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberInputFilter;-><init>()V

    aput-object v1, v0, p3

    invoke-virtual {p2, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 74
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneNum:Landroid/widget/EditText;

    new-instance p3, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;

    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p3, v0}, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;-><init>(I)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 75
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneNum:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f090526

    .line 76
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->phoneError:Landroid/widget/TextView;

    const p2, 0x7f0900f0

    .line 77
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 78
    iget-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0900ef

    .line 79
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->changePhoneError:Landroid/widget/TextView;

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

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 62
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 63
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 64
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->buttonDrawableFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    iput-object p2, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->buttonFactory:Lcom/shopkick/app/graphics/ButtonDrawableFactory;

    .line 65
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p1, p1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iput-object p1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 85
    iget-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-eqz v0, :cond_0

    .line 86
    iget-object v1, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 88
    iput-object v0, p0, Lcom/shopkick/app/account/ChangePhoneScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    .line 89
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

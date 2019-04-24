.class public Lcom/shopkick/app/registration/LinkPhoneNumberScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "LinkPhoneNumberScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/registration/LinkPhoneNumberScreen$NextButtonClickListener;
    }
.end annotation


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

.field private nextButton:Lcom/shopkick/app/widget/SKButton;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

.field private progressDialog:Landroid/app/ProgressDialog;

.field private updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/LinkPhoneNumberScreen;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->handleNextButtonClick()V

    return-void
.end method

.method private handleNextButtonClick()V
    .locals 4

    .line 210
    invoke-direct {p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->isPhoneNumberValid()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 213
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-nez v0, :cond_1

    .line 214
    invoke-virtual {p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f11073e

    .line 216
    invoke-virtual {p0, v2}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    .line 214
    invoke-static {v0, v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 219
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    .line 221
    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 222
    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 221
    invoke-static {v1, v2}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFormattedForNetwork(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->phoneNumber:Ljava/lang/String;

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_1
    return-void
.end method

.method private isPhoneNumberValid()Z
    .locals 2

    .line 137
    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->isValid(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method private maybeToggleNextButton()V
    .locals 1

    .line 133
    invoke-direct {p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->isPhoneNumberValid()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->toggleNextButton(Z)V

    return-void
.end method

.method private toggleNextButton(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 126
    iget-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f080091

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    goto :goto_0

    .line 128
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f080093

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setBackgroundResource(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 185
    invoke-direct {p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->maybeToggleNextButton()V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 149
    iget-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 150
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 151
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;

    .line 152
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->phoneNumberMessage:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 154
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->phoneNumberMessage:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 156
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/account/UserAccount;->setUserInfo(Lcom/shopkick/app/fetchers/api/skapi/UserInfo;)V

    .line 157
    iget-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 158
    iget-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified()Z

    move-result p1

    if-nez p1, :cond_2

    .line 159
    const-class p1, Lcom/shopkick/app/registration/VerifyPhoneScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 163
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 166
    :cond_2
    :goto_0
    iput-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f1103c3

    .line 68
    invoke-virtual {p0, p3}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->setAppScreenTitle(I)V

    const/4 p3, 0x0

    const v0, 0x7f0c010a

    .line 69
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0901e6

    .line 71
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    const/4 v0, 0x4

    .line 72
    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    const p2, 0x7f0904a8

    .line 74
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    .line 75
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->nextButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v1, Lcom/shopkick/app/registration/LinkPhoneNumberScreen$NextButtonClickListener;

    invoke-direct {v1, p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen$NextButtonClickListener;-><init>(Lcom/shopkick/app/registration/LinkPhoneNumberScreen;)V

    invoke-virtual {p2, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090527

    .line 77
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKEditText;

    iput-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    .line 78
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKEditText;->setDefaultFont(I)Z

    .line 79
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Lcom/shopkick/app/util/phoneNumber/PhoneNumberInputFilter;

    invoke-direct {v1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberInputFilter;-><init>()V

    aput-object v1, v0, p3

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 80
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    new-instance p3, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;

    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p3, v0}, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;-><init>(I)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 81
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 82
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    new-instance p3, Lcom/shopkick/app/registration/LinkPhoneNumberScreen$1;

    invoke-direct {p3, p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen$1;-><init>(Lcom/shopkick/app/registration/LinkPhoneNumberScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKEditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 91
    iget-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    invoke-virtual {p2}, Lcom/shopkick/app/application/DeviceInfo;->getDevicePhoneNumber()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 95
    iget-object p3, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p3, p2}, Lcom/shopkick/app/widget/SKEditText;->append(Ljava/lang/CharSequence;)V

    .line 98
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p2

    invoke-virtual {p2}, Landroid/support/v4/app/FragmentActivity;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/4 p3, 0x5

    invoke-virtual {p2, p3}, Landroid/view/Window;->setSoftInputMode(I)V

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

    .line 59
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 60
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    iput-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->deviceInfo:Lcom/shopkick/app/application/DeviceInfo;

    .line 61
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 62
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 63
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "VerifyPhoneCompleteEvent"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 121
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-eqz v0, :cond_0

    .line 105
    iget-object v1, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 107
    iput-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    .line 108
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 1

    .line 113
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->phoneNumberField:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->requestFocus()Z

    .line 115
    invoke-virtual {p0}, Lcom/shopkick/app/registration/LinkPhoneNumberScreen;->showKeyboard()V

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

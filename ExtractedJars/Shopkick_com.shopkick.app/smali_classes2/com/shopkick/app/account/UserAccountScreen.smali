.class public Lcom/shopkick/app/account/UserAccountScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "UserAccountScreen.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Landroid/text/TextWatcher;
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final ACCOUNT_DELETED:Ljava/lang/String; = "acctDeleted"

.field public static final LOGOUT:Ljava/lang/String; = "logout"

.field public static MIN_ZIP_DIGITS:I = 0x5


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private authenticator:Lcom/shopkick/app/account/Authenticator;

.field private awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field buttonTapped:Z

.field private changePasswordButton:Lcom/shopkick/app/widget/SKButton;

.field private credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

.field private deleteAccountLink:Lcom/shopkick/app/widget/SKTextView;

.field private emailChanged:Z

.field private facebookConnectButton:Lcom/shopkick/app/widget/SKButton;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private logoutButton:Lcom/shopkick/app/widget/SKButton;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private phoneNumChanged:Z

.field private phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private progressDialog:Landroid/app/ProgressDialog;

.field private saveCheckmarkVisible:Z

.field private updateEmailText:Landroid/widget/EditText;

.field private updatePhoneText:Landroid/widget/EditText;

.field private updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

.field private updateZipText:Landroid/widget/EditText;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

.field private userAcct:Lcom/shopkick/app/account/UserAccount;

.field private verifyPhoneButton:Lcom/shopkick/app/widget/SKButton;

.field private zipChanged:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 89
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

    .line 91
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->saveCheckmarkVisible:Z

    return-void
.end method

.method private didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 237
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 238
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v2, 0x1

    if-nez v0, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    .line 245
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method private fillInPhoneNumber()V
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 177
    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 176
    invoke-static {v0, v1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFromNetworkFormattedForDisplay(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 179
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberUtils;->formatNumber(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 180
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private handleCredentialDisableAutoSignInDone()V
    .locals 0

    .line 425
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountScreen;->popScreen()V

    .line 426
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountScreen;->resetLogoutState()V

    return-void
.end method

.method private handleSave()V
    .locals 6

    .line 285
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

    if-eqz v0, :cond_0

    return-void

    .line 289
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->emailChanged:Z

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->phoneNumChanged:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->zipChanged:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v1

    :goto_1
    const-string v3, "Email, phone or zip code fields must have been updated."

    invoke-static {v0, v3}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 292
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountScreen;->setSaveButtonDisabled()V

    .line 293
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

    .line 296
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountScreen;->hideKeyboard()V

    .line 298
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    .line 300
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->emailChanged:Z

    if-eqz v0, :cond_3

    .line 301
    iput-boolean v2, p0, Lcom/shopkick/app/account/UserAccountScreen;->emailChanged:Z

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v3, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateEmailText:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->email:Ljava/lang/String;

    .line 305
    :cond_3
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->phoneNumChanged:Z

    if-eqz v0, :cond_4

    .line 306
    iput-boolean v2, p0, Lcom/shopkick/app/account/UserAccountScreen;->phoneNumChanged:Z

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v3, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    .line 308
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 309
    invoke-virtual {v4}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 308
    invoke-static {v3, v4}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFormattedForNetwork(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->phoneNumber:Ljava/lang/String;

    .line 312
    :cond_4
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->zipChanged:Z

    if-eqz v0, :cond_5

    .line 313
    iput-boolean v2, p0, Lcom/shopkick/app/account/UserAccountScreen;->zipChanged:Z

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    iget-object v3, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateZipText:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;->zipCode:Ljava/lang/String;

    .line 317
    :cond_5
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v3, ""

    .line 319
    invoke-virtual {p0}, Lcom/shopkick/app/account/UserAccountScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    const v5, 0x7f1101b5

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 317
    invoke-static {v0, v3, v4, v1, v2}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 322
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private resetLogoutState()V
    .locals 1

    const/4 v0, 0x0

    .line 430
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

    .line 431
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 432
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-static {v0}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    const/4 v0, 0x0

    .line 433
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->progressDialog:Landroid/app/ProgressDialog;

    return-void
.end method

.method private setSaveButtonDisabled()V
    .locals 1

    .line 192
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->saveCheckmarkVisible:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 193
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->saveCheckmarkVisible:Z

    .line 194
    invoke-virtual {p0, v0}, Lcom/shopkick/app/account/UserAccountScreen;->setHasOptionsMenu(Z)V

    :cond_0
    return-void
.end method

.method private setSaveButtonEnabled()V
    .locals 1

    .line 185
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->saveCheckmarkVisible:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 186
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->saveCheckmarkVisible:Z

    .line 187
    invoke-virtual {p0, v0}, Lcom/shopkick/app/account/UserAccountScreen;->setHasOptionsMenu(Z)V

    :cond_0
    return-void
.end method

.method private setVerifyPhoneButtonClickable(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 200
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->verifyPhoneButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f080096

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(I)V

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->verifyPhoneButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    goto :goto_0

    .line 203
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->verifyPhoneButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f080097

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonImage(I)V

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->verifyPhoneButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    :goto_0
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateEmailText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 215
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object p1

    .line 216
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateEmailText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 217
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/UserAccountScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->emailChanged:Z

    goto :goto_0

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 219
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getPhoneNumber()Ljava/lang/String;

    move-result-object p1

    .line 220
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 221
    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 220
    invoke-static {v0, v1}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFormattedForNetwork(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 222
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/UserAccountScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->phoneNumChanged:Z

    goto :goto_0

    .line 223
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateZipText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 224
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getZipCode()Ljava/lang/String;

    move-result-object p1

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateZipText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 226
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/UserAccountScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->zipChanged:Z

    .line 229
    :cond_2
    :goto_0
    iget-boolean p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->emailChanged:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->phoneNumChanged:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->zipChanged:Z

    if-eqz p1, :cond_3

    goto :goto_1

    .line 232
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountScreen;->setSaveButtonDisabled()V

    goto :goto_2

    .line 230
    :cond_4
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountScreen;->setSaveButtonEnabled()V

    :goto_2
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 11

    .line 336
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-ne p1, v0, :cond_8

    .line 337
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-static {p1}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    const/4 p1, 0x0

    .line 338
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->progressDialog:Landroid/app/ProgressDialog;

    const/4 v0, 0x0

    .line 339
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

    .line 341
    iget-boolean v1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_6

    .line 342
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;

    .line 346
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->phoneNumber:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/UserInfo;->isPhoneNumberVerified:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    invoke-direct {p0, v1}, Lcom/shopkick/app/account/UserAccountScreen;->setVerifyPhoneButtonClickable(Z)V

    .line 349
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->phoneNumberMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    .line 350
    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 351
    invoke-virtual {v4}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 350
    invoke-static {v3, v4}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFormattedForNetwork(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    .line 349
    invoke-direct {p0, v1, v3}, Lcom/shopkick/app/account/UserAccountScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 352
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/AppPreferences;->setVerificationSMSSent(Z)V

    .line 356
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->userInfo:Lcom/shopkick/app/fetchers/api/skapi/UserInfo;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/account/UserAccount;->setUserInfo(Lcom/shopkick/app/fetchers/api/skapi/UserInfo;)V

    .line 357
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 360
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const v3, 0x7f11014f

    if-nez v1, :cond_2

    .line 362
    iget-object v4, p0, Lcom/shopkick/app/account/UserAccountScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const p2, 0x7f110740

    .line 364
    invoke-virtual {p0, p2}, Lcom/shopkick/app/account/UserAccountScreen;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 365
    invoke-virtual {p0, v3}, Lcom/shopkick/app/account/UserAccountScreen;->getString(I)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lcom/shopkick/app/account/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/account/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v10, 0x0

    .line 362
    invoke-virtual/range {v4 .. v10}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto/16 :goto_2

    .line 368
    :cond_2
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v2, :cond_7

    .line 371
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->emailMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 372
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->emailMessage:Ljava/lang/String;

    move-object v7, p2

    goto :goto_1

    .line 373
    :cond_3
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->phoneNumberMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 374
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->phoneNumberMessage:Ljava/lang/String;

    move-object v7, p2

    goto :goto_1

    .line 375
    :cond_4
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->zipCodeMessage:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 376
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoResponse;->zipCodeMessage:Ljava/lang/String;

    move-object v7, p2

    goto :goto_1

    :cond_5
    const-string p2, "Error message for email, phone number or zip code must be present."

    .line 378
    invoke-static {v0, p2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    move-object v7, p1

    .line 382
    :goto_1
    iget-object v4, p0, Lcom/shopkick/app/account/UserAccountScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 385
    invoke-virtual {p0, v3}, Lcom/shopkick/app/account/UserAccountScreen;->getString(I)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lcom/shopkick/app/account/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;->INSTANCE:Lcom/shopkick/app/account/-$$Lambda$Piccf7okaDJZNsM3vtOQfarR2eU;

    const/4 v10, 0x0

    .line 382
    invoke-virtual/range {v4 .. v10}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogAcknowledge(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_2

    .line 391
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateEmailText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/UserAccountScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->emailChanged:Z

    .line 392
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    .line 393
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 394
    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 393
    invoke-static {v1, v2}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberValidator;->numberFormattedForNetwork(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    .line 392
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/UserAccountScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->phoneNumChanged:Z

    .line 395
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getZipCode()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateZipText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/UserAccountScreen;->didFieldChange(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->zipChanged:Z

    .line 396
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountScreen;->setSaveButtonEnabled()V

    .line 398
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 400
    :cond_7
    :goto_2
    iput-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    :cond_8
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p2, 0x7f0c01e3

    const/4 p3, 0x0

    .line 113
    invoke-virtual {p1, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f110742

    .line 114
    invoke-virtual {p0, p2}, Lcom/shopkick/app/account/UserAccountScreen;->setAppScreenTitle(I)V

    const p2, 0x7f0907e1

    .line 115
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateEmailText:Landroid/widget/EditText;

    .line 116
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateEmailText:Landroid/widget/EditText;

    iget-object p3, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p3}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 117
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateEmailText:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f0907e2

    .line 119
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    .line 120
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountScreen;->fillInPhoneNumber()V

    .line 121
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    const/4 p3, 0x1

    new-array p3, p3, [Landroid/text/InputFilter;

    new-instance v0, Lcom/shopkick/app/util/phoneNumber/PhoneNumberInputFilter;

    invoke-direct {v0}, Lcom/shopkick/app/util/phoneNumber/PhoneNumberInputFilter;-><init>()V

    const/4 v1, 0x0

    aput-object v0, p3, v1

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 122
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    new-instance p3, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;

    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p3, v0}, Lcom/shopkick/app/util/phoneNumber/SKPhoneNumberFormattingTextWatcher;-><init>(I)V

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 123
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updatePhoneText:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f0907e3

    .line 125
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateZipText:Landroid/widget/EditText;

    .line 126
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateZipText:Landroid/widget/EditText;

    iget-object p3, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p3}, Lcom/shopkick/app/account/UserAccount;->getZipCode()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 127
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateZipText:Landroid/widget/EditText;

    invoke-virtual {p2, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f0907f2

    .line 129
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->verifyPhoneButton:Lcom/shopkick/app/widget/SKButton;

    .line 130
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->verifyPhoneButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 132
    invoke-direct {p0, v1}, Lcom/shopkick/app/account/UserAccountScreen;->setVerifyPhoneButtonClickable(Z)V

    :cond_0
    const p2, 0x7f0900ee

    .line 135
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->changePasswordButton:Lcom/shopkick/app/widget/SKButton;

    .line 137
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->changePasswordButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f090194

    .line 139
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->facebookConnectButton:Lcom/shopkick/app/widget/SKButton;

    .line 140
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 141
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->facebookConnectButton:Lcom/shopkick/app/widget/SKButton;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    goto :goto_0

    .line 143
    :cond_1
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->facebookConnectButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_0
    const p2, 0x7f0901d7

    .line 146
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKTextView;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->deleteAccountLink:Lcom/shopkick/app/widget/SKTextView;

    .line 147
    iget-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->deleteAccountLink:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    .line 97
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    .line 98
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 99
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 100
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 101
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    .line 102
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 103
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 104
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 105
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->authenticator:Lcom/shopkick/app/account/Authenticator;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    .line 106
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 107
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    iput-object p2, p0, Lcom/shopkick/app/account/UserAccountScreen;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    .line 108
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    iput-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 263
    iget-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 267
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

    .line 268
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->verifyPhoneButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    .line 269
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "VerifyPhoneCompleteEvent"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 270
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->phoneVerificationController:Lcom/shopkick/app/controllers/PhoneVerificationController;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/controllers/PhoneVerificationController;->launchVerifyPhoneFlow(Ljava/lang/String;)V

    goto :goto_0

    .line 271
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->changePasswordButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_2

    .line 272
    const-class p1, Lcom/shopkick/app/account/ChangePasswordScreen;

    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/account/UserAccountScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 273
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->deleteAccountLink:Lcom/shopkick/app/widget/SKTextView;

    if-ne p1, v0, :cond_3

    .line 274
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "RowName"

    const-string v2, "DeleteAccount"

    .line 275
    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->logger:Lcom/shopkick/app/application/SKLogger;

    const-string v2, "UserAccount|RowTapped"

    invoke-virtual {v0, v2, p1}, Lcom/shopkick/app/application/SKLogger;->onEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 277
    const-class p1, Lcom/shopkick/app/account/DeleteAccountScreen;

    invoke-virtual {p0, p1, v1}, Lcom/shopkick/app/account/UserAccountScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 278
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->facebookConnectButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_4

    .line 279
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->authenticator:Lcom/shopkick/app/account/Authenticator;

    sget-object v0, Lcom/shopkick/app/account/Authenticator$AuthAction;->CONNECT:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    const v0, 0x7f0d0008

    .line 442
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    if-eqz v0, :cond_0

    .line 155
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 157
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->updateUserAccountInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/UpdateUserAccountInfoRequestV2;

    .line 159
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 160
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 161
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    .line 162
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 163
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 164
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 165
    iget-object v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-static {v1}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    .line 166
    iput-object v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 167
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 410
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, 0x465aaffa

    const/4 v1, 0x0

    if-eq p2, v0, :cond_2

    const v0, 0x733d7e8c

    if-eq p2, v0, :cond_1

    const v0, 0x74e1a181

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "CREDENTIAL_DISABLE_AUTO_SIGN_IN_FAILURE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_1

    :cond_1
    const-string p2, "VerifyPhoneCompleteEvent"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v1

    goto :goto_1

    :cond_2
    const-string p2, "CREDENTIAL_DISABLE_AUTO_SIGN_IN_SUCCESS"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 419
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountScreen;->handleCredentialDisableAutoSignInDone()V

    goto :goto_2

    .line 412
    :pswitch_1
    iput-boolean v1, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

    .line 413
    iget-object p1, p0, Lcom/shopkick/app/account/UserAccountScreen;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->isPhoneVerified()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 414
    invoke-direct {p0, v1}, Lcom/shopkick/app/account/UserAccountScreen;->setVerifyPhoneButtonClickable(Z)V

    :cond_4
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 447
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090024

    if-ne v0, v1, :cond_0

    .line 448
    invoke-direct {p0}, Lcom/shopkick/app/account/UserAccountScreen;->handleSave()V

    const/4 p1, 0x1

    return p1

    .line 451
    :cond_0
    invoke-super {p0, p1}, Lcom/shopkick/app/screens/AppScreen;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onScreenDidShow()V
    .locals 1

    const/4 v0, 0x0

    .line 172
    iput-boolean v0, p0, Lcom/shopkick/app/account/UserAccountScreen;->buttonTapped:Z

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

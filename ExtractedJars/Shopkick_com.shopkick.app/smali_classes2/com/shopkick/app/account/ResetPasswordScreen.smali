.class public Lcom/shopkick/app/account/ResetPasswordScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "ResetPasswordScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/account/ResetPasswordScreen$OnClickListener;
    }
.end annotation


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private code:Ljava/lang/String;

.field private dismissButton:Landroid/widget/ImageView;

.field private editText1:Lcom/shopkick/app/widget/SKEditText;

.field private editText2:Lcom/shopkick/app/widget/SKEditText;

.field private inputLayout1:Landroid/support/design/widget/TextInputLayout;

.field private inputLayout2:Landroid/support/design/widget/TextInputLayout;

.field private progressDialog:Landroid/app/ProgressDialog;

.field private resetPasswordFromClientRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;

.field private submitButton:Lcom/shopkick/app/widget/SKButton;

.field private user_id:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/ResetPasswordScreen;)Lcom/shopkick/app/widget/SKEditText;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/ResetPasswordScreen;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->updateCheckmarks()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/account/ResetPasswordScreen;)Landroid/widget/ImageView;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->dismissButton:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/account/ResetPasswordScreen;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->onClickDismissButton()V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/account/ResetPasswordScreen;)Lcom/shopkick/app/widget/SKButton;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/account/ResetPasswordScreen;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->onClickSubmitButton()V

    return-void
.end method

.method private enableSubmitButton(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 216
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 217
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 219
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x4d

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :goto_0
    return-void
.end method

.method private onClickDismissButton()V
    .locals 2

    .line 134
    const-class v0, Lcom/shopkick/app/registration/LoginPickerV3Screen;

    invoke-virtual {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->getParams()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method private onClickSubmitButton()V
    .locals 4

    const/4 v0, 0x0

    .line 308
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/ResetPasswordScreen;->enableSubmitButton(Z)V

    .line 309
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    const v1, 0x7f1105c4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 311
    invoke-virtual {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, ""

    const v2, 0x7f1105c2

    .line 313
    invoke-virtual {p0, v2}, Lcom/shopkick/app/account/ResetPasswordScreen;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    .line 311
    invoke-static {v0, v1, v2, v3}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 316
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getInput()Ljava/lang/String;

    move-result-object v0

    .line 317
    iget-object v1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKEditText;->getInput()Ljava/lang/String;

    move-result-object v1

    .line 319
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;-><init>()V

    iput-object v2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->resetPasswordFromClientRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;

    .line 320
    iget-object v2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->resetPasswordFromClientRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;

    iget-object v3, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->user_id:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;->userId:Ljava/lang/String;

    .line 321
    iget-object v3, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->code:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;->code:Ljava/lang/String;

    .line 322
    iput-object v0, v2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;->password:Ljava/lang/String;

    .line 323
    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;->password2:Ljava/lang/String;

    .line 324
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, v2, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V
    .locals 0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 149
    invoke-virtual {p1, p2}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 150
    invoke-virtual {p1, p3}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 151
    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 152
    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    const p2, 0x7f060121

    invoke-virtual {p0, p2}, Lcom/shopkick/app/account/ResetPasswordScreen;->getResourceColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setTextColor(I)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 155
    invoke-virtual {p1, p2}, Landroid/support/design/widget/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 156
    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 157
    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p1

    const p2, 0x7f0600c7

    invoke-virtual {p0, p2}, Lcom/shopkick/app/account/ResetPasswordScreen;->getResourceColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setTextColor(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 247
    invoke-virtual {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f0800d8

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 245
    invoke-virtual {p1, v0, v0, p2, v0}, Lcom/shopkick/app/widget/SKEditText;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 250
    :cond_0
    invoke-virtual {p1, v0, v0, v0, v0}, Lcom/shopkick/app/widget/SKEditText;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method private updateCheckmarks()V
    .locals 3

    .line 255
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout1:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    .line 257
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    return-void

    .line 261
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 267
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout2:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 268
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    .line 271
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_4

    .line 272
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    .line 275
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 276
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    .line 277
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    goto :goto_0

    .line 279
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    :goto_0
    return-void

    .line 262
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    return-void
.end method

.method private updateSubmitButton()V
    .locals 2

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 231
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout1:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout2:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0}, Landroid/support/design/widget/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 234
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v1}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 237
    :cond_3
    :goto_0
    invoke-direct {p0, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->enableSubmitButton(Z)V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-ne p1, v0, :cond_0

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout1:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p1}, Landroid/support/design/widget/TextInputLayout;->getError()Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 174
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-direct {p0, p1, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->showCheckmark(Lcom/shopkick/app/widget/SKEditText;Z)V

    .line 175
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout1:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {p0, p1, v3, v2}, Lcom/shopkick/app/account/ResetPasswordScreen;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    .line 179
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout2:Landroid/support/design/widget/TextInputLayout;

    invoke-direct {p0, p1, v3, v2}, Lcom/shopkick/app/account/ResetPasswordScreen;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    const-string p1, ""

    const-string v0, ""

    .line 184
    iget-object v2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 188
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v2}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 189
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 192
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-lt v2, v3, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_3

    .line 193
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 194
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout2:Landroid/support/design/widget/TextInputLayout;

    .line 195
    invoke-virtual {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v2, 0x7f1105c3

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 194
    invoke-direct {p0, p1, v1, v0}, Lcom/shopkick/app/account/ResetPasswordScreen;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    .line 199
    :cond_3
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->updateCheckmarks()V

    .line 200
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->updateSubmitButton()V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 337
    iget-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-static {p1}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    const/4 p1, 0x0

    .line 338
    iput-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 340
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const v1, 0x7f1105c5

    if-eqz v0, :cond_1

    .line 341
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientResponse;

    .line 342
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientResponse;->status:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 344
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 345
    iget-object v1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->user_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setUserId(Ljava/lang/String;)V

    .line 346
    iget-object v1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 349
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientResponse;->emailAddress:Ljava/lang/String;

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->getInput()Ljava/lang/String;

    move-result-object v0

    .line 352
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "email"

    .line 353
    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "password"

    .line 354
    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    const-class p2, Lcom/shopkick/app/registration/EmailLoginV3Screen;

    invoke-virtual {p0, p2, v1}, Lcom/shopkick/app/account/ResetPasswordScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 358
    :cond_0
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientResponse;->errorMessage:Ljava/lang/String;

    .line 359
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout1:Landroid/support/design/widget/TextInputLayout;

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2, p2}, Lcom/shopkick/app/account/ResetPasswordScreen;->setErrorMessage(Landroid/support/design/widget/TextInputLayout;ZLjava/lang/String;)V

    .line 361
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p2, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 362
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->updateSubmitButton()V

    .line 364
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->updateCheckmarks()V

    goto :goto_0

    .line 367
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 368
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->updateSubmitButton()V

    .line 371
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 373
    invoke-direct {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->updateCheckmarks()V

    .line 376
    :goto_0
    iput-object p1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->resetPasswordFromClientRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;

    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const/4 p3, 0x0

    const v0, 0x7f0c0182

    .line 73
    invoke-virtual {p1, v0, p2, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0905b2

    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/design/widget/TextInputLayout;

    iput-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout1:Landroid/support/design/widget/TextInputLayout;

    const p2, 0x7f0905b3

    .line 76
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/support/design/widget/TextInputLayout;

    iput-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout2:Landroid/support/design/widget/TextInputLayout;

    .line 78
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout1:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p2}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKEditText;

    iput-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    .line 79
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout2:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {p2}, Landroid/support/design/widget/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKEditText;

    iput-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    .line 81
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, p3

    :goto_0
    const-string v0, "EditText field inside TextInputLayout should not be null"

    invoke-static {p2, v0}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 84
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 85
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText2:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/widget/SKEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const p2, 0x7f0905b1

    .line 87
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->dismissButton:Landroid/widget/ImageView;

    .line 88
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->dismissButton:Landroid/widget/ImageView;

    new-instance v0, Lcom/shopkick/app/account/ResetPasswordScreen$OnClickListener;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/ResetPasswordScreen$OnClickListener;-><init>(Lcom/shopkick/app/account/ResetPasswordScreen;)V

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0905b4

    .line 90
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    .line 91
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v0, Lcom/shopkick/app/account/ResetPasswordScreen$OnClickListener;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/ResetPasswordScreen$OnClickListener;-><init>(Lcom/shopkick/app/account/ResetPasswordScreen;)V

    invoke-virtual {p2, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x122

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 94
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->user_id:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setUserId(Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->submitButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 97
    invoke-direct {p0, p3}, Lcom/shopkick/app/account/ResetPasswordScreen;->enableSubmitButton(Z)V

    .line 99
    iget-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    new-instance p3, Lcom/shopkick/app/account/ResetPasswordScreen$1;

    invoke-direct {p3, p0}, Lcom/shopkick/app/account/ResetPasswordScreen$1;-><init>(Lcom/shopkick/app/account/ResetPasswordScreen;)V

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKEditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
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

    .line 58
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 59
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    if-eqz p2, :cond_0

    const-string/jumbo v0, "user_id"

    .line 62
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->user_id:Ljava/lang/String;

    const-string v0, "code"

    .line 63
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    iput-object p2, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->code:Ljava/lang/String;

    .line 66
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 67
    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const-string p2, "This screen should never be displayed to a registered user."

    invoke-static {p1, p2}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    return-void
.end method

.method public onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;
    .locals 1

    .line 130
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onBackPressed()Lcom/shopkick/app/screens/AppScreen$BackPressedState;

    move-result-object v0

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->resetPasswordFromClientRequest:Lcom/shopkick/app/fetchers/api/skapi/UserResetPasswordFromClientRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->progressDialog:Landroid/app/ProgressDialog;

    invoke-static {v0}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    const/4 v0, 0x0

    .line 119
    iput-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->progressDialog:Landroid/app/ProgressDialog;

    .line 120
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 139
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onScreenDidShow()V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout1:Landroid/support/design/widget/TextInputLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->inputLayout2:Landroid/support/design/widget/TextInputLayout;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/TextInputLayout;->setErrorEnabled(Z)V

    .line 143
    iget-object v0, p0, Lcom/shopkick/app/account/ResetPasswordScreen;->editText1:Lcom/shopkick/app/widget/SKEditText;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKEditText;->requestFocus()Z

    .line 144
    invoke-virtual {p0}, Lcom/shopkick/app/account/ResetPasswordScreen;->showKeyboard()V

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

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

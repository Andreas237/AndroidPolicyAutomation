.class public Lcom/shopkick/app/account/DeleteAccountScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "DeleteAccountScreen.java"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/controllers/IFBConnectControllerCallback;
.implements Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;


# instance fields
.field buttonTapped:Z

.field continueButton:Lcom/shopkick/app/widget/SKButton;

.field errorVisible:Z

.field private fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

.field private googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

.field private mainView:Landroid/widget/RelativeLayout;

.field passwordErrorText:Landroid/widget/TextView;

.field passwordText:Landroid/widget/EditText;

.field private shouldAttemptSilentGoogleSignIn:Z

.field private textContainer:Landroid/widget/RelativeLayout;

.field useFbButton:Lcom/shopkick/app/widget/SKButton;

.field useGoogleButton:Lcom/shopkick/app/widget/SKButton;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->buttonTapped:Z

    .line 47
    iput-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->errorVisible:Z

    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->shouldAttemptSilentGoogleSignIn:Z

    return-void
.end method

.method private formIsValid()Z
    .locals 3

    .line 96
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordErrorText:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 99
    iput-boolean v2, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->errorVisible:Z

    move v1, v2

    :cond_1
    xor-int/lit8 v0, v1, 0x1

    return v0
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 179
    iget-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->errorVisible:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordErrorText:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 181
    iput-boolean v1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->errorVisible:Z

    .line 183
    :cond_0
    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result p1

    if-nez p1, :cond_1

    .line 184
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    goto :goto_0

    .line 186
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0095

    const/4 v0, 0x0

    .line 115
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/RelativeLayout;

    iput-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->mainView:Landroid/widget/RelativeLayout;

    const p3, 0x7f11025e

    .line 116
    invoke-virtual {p0, p3}, Lcom/shopkick/app/account/DeleteAccountScreen;->setAppScreenTitle(I)V

    .line 117
    iget-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0901df

    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordErrorText:Landroid/widget/TextView;

    .line 118
    iget-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f090761

    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/RelativeLayout;

    iput-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->textContainer:Landroid/widget/RelativeLayout;

    .line 119
    iget-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0901de

    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/EditText;

    iput-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordText:Landroid/widget/EditText;

    .line 120
    iget-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0901db

    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKButton;

    iput-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useFbButton:Lcom/shopkick/app/widget/SKButton;

    .line 121
    iget-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0901dc

    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKButton;

    iput-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useGoogleButton:Lcom/shopkick/app/widget/SKButton;

    .line 122
    iget-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->mainView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0901dd

    invoke-virtual {p3, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKButton;

    iput-object p3, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    .line 123
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/account/DeleteAccountScreen;->setupDeleteAccountScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    .line 124
    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountScreen;->setButtonsToShow()V

    .line 125
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->mainView:Landroid/widget/RelativeLayout;

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

    .line 108
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    iput-object p2, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    .line 109
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    iput-object p2, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    .line 110
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iput-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 55
    iget-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->buttonTapped:Z

    if-eqz v0, :cond_0

    return-void

    .line 59
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useFbButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_1

    .line 60
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/app/controllers/FBConnectController;->authorize(Landroid/app/Activity;Lcom/shopkick/app/controllers/IFBConnectControllerCallback;)V

    return-void

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useGoogleButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_3

    .line 63
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->shouldAttemptSilentGoogleSignIn:Z

    if-eqz p1, :cond_2

    .line 64
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    iget-object v2, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, p0, v1, v2}, Lcom/shopkick/app/registration/GoogleSignInController;->authorizeSilentSignIn(Landroid/app/Activity;Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;ZLjava/lang/String;)V

    goto :goto_0

    .line 66
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {p1, v0, p0, v1}, Lcom/shopkick/app/registration/GoogleSignInController;->authorize(Landroid/app/Activity;Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;Z)V

    :goto_0
    return-void

    .line 69
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_6

    .line 71
    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 74
    iget-boolean p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->errorVisible:Z

    if-eqz p1, :cond_4

    .line 75
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordErrorText:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 76
    iput-boolean v1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->errorVisible:Z

    .line 78
    :cond_4
    invoke-direct {p0}, Lcom/shopkick/app/account/DeleteAccountScreen;->formIsValid()Z

    move-result p1

    if-nez p1, :cond_5

    return-void

    .line 81
    :cond_5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "password_key"

    .line 82
    iget-object v1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    const-class v0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-virtual {p0, v0, p1}, Lcom/shopkick/app/account/DeleteAccountScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_6
    const/4 p1, 0x1

    .line 86
    iput-boolean p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->buttonTapped:Z

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    invoke-virtual {v0}, Lcom/shopkick/app/controllers/FBConnectController;->abandonAuthorization()V

    .line 172
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-virtual {v0}, Lcom/shopkick/app/registration/GoogleSignInController;->abandonAuthorization()V

    .line 173
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onFacebookConnectCancel()V
    .locals 0

    return-void
.end method

.method public onFacebookConnectFailure()V
    .locals 0

    return-void
.end method

.method public onFacebookConnectSuccess(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 202
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "fb_access_token_key"

    .line 203
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    const-class p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/account/DeleteAccountScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    return-void
.end method

.method public onGoogleSignInCancel()V
    .locals 0

    return-void
.end method

.method public onGoogleSignInFailure()V
    .locals 3

    .line 231
    iget-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->shouldAttemptSilentGoogleSignIn:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 232
    iput-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->shouldAttemptSilentGoogleSignIn:Z

    .line 233
    iget-object v1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    invoke-virtual {v1, v2, p0, v0}, Lcom/shopkick/app/registration/GoogleSignInController;->authorize(Landroid/app/Activity;Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;Z)V

    :cond_0
    return-void
.end method

.method public onGoogleSignInSuccess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 p2, 0x0

    .line 221
    iput-boolean p2, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->shouldAttemptSilentGoogleSignIn:Z

    if-eqz p1, :cond_0

    .line 223
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "google_id_token_key"

    .line 224
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    const-class p1, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/account/DeleteAccountScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public onScreenDidShow()V
    .locals 2

    .line 158
    iget-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->buttonTapped:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 159
    iput-boolean v1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->buttonTapped:Z

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 162
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 165
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    goto :goto_1

    .line 163
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    :goto_1
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public setButtonsToShow()V
    .locals 3

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isFacebookConnected()Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useFbButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 141
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->textContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useGoogleButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isGooglePlusConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useFbButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->textContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useGoogleButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    goto :goto_0

    .line 149
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useFbButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->textContainer:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useGoogleButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public setupDeleteAccountScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V
    .locals 0

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useFbButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->useGoogleButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->continueButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountScreen;->passwordText:Landroid/widget/EditText;

    invoke-virtual {p1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

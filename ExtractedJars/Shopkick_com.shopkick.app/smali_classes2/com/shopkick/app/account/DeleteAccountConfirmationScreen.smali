.class public Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "DeleteAccountConfirmationScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final FB_ACCESS_TOKEN_KEY:Ljava/lang/String; = "fb_access_token_key"

.field public static final GOOGLE_ID_TOKEN_KEY:Ljava/lang/String; = "google_id_token_key"

.field public static final PASSWORD_KEY:Ljava/lang/String; = "password_key"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field buttonTapped:Z

.field clickListener:Landroid/view/View$OnClickListener;

.field private credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

.field deleteButton:Lcom/shopkick/app/widget/SKButton;

.field deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

.field deletingDialog:Landroid/app/ProgressDialog;

.field errorText:Landroid/widget/TextView;

.field errorVisible:Z

.field private facebookAccessToken:Ljava/lang/String;

.field private googleIdToken:Ljava/lang/String;

.field private googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private password:Ljava/lang/String;

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->buttonTapped:Z

    .line 47
    iput-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->errorVisible:Z

    .line 63
    new-instance v0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen$1;-><init>(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->clickListener:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)Ljava/lang/String;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->password:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)Ljava/lang/String;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->facebookAccessToken:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)Ljava/lang/String;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->googleIdToken:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;)Lcom/shopkick/fetchers/api/APIManager;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    return-object p0
.end method

.method private deleteCredential()Z
    .locals 7

    .line 173
    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    .line 176
    iget-object v3, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;->password:Ljava/lang/String;

    if-eqz v3, :cond_0

    if-eqz v0, :cond_2

    .line 177
    iget-object v3, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v3}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 178
    iget-object v2, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 179
    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;->password:Ljava/lang/String;

    .line 178
    invoke-static {v0, v2, v3}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v2

    goto :goto_0

    .line 182
    :cond_0
    iget-object v3, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;->facebookAccessToken:Ljava/lang/String;

    if-eqz v3, :cond_1

    if-eqz v0, :cond_2

    .line 184
    invoke-static {v0}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromFacebook(Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v2

    goto :goto_0

    .line 186
    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;->googleIdToken:Ljava/lang/String;

    if-eqz v3, :cond_4

    if-eqz v0, :cond_2

    .line 187
    iget-object v3, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v3, v3, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v3}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 188
    iget-object v2, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v2, v2, Lcom/shopkick/app/application/ScreenGlobals;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromGoogle(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v2

    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 199
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v3, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 200
    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v5, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v5, "Tried to delete credential with null skCredential. Return early as no action to take here."

    new-array v6, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 205
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v3, "CREDENTIAL_DELETE_SUCCESS"

    invoke-virtual {v0, p0, v3, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v3, "CREDENTIAL_DELETE_FAILURE"

    invoke-virtual {v0, p0, v3, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/account/CredentialStorageController;->deleteCredential(Landroid/app/Activity;Lcom/shopkick/app/account/SKCredential;)V

    const/4 v0, 0x1

    return v0

    .line 191
    :cond_4
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 192
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "Tried to delete credential with invalid deleteRequest. Return early as no action to take here."

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 210
    :cond_5
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 211
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "Tried to delete credential with null activity reference. Return early as no action to take here."

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method

.method private handleCredentialDeleteDone()V
    .locals 2

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->resetCurrentUserWithReason(I)V

    .line 220
    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/activities/BaseActivity;->finish()V

    const/4 v0, 0x0

    .line 221
    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 4

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    if-ne p1, v0, :cond_5

    .line 140
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deletingDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 141
    iget-boolean p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->buttonTapped:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 142
    iput-boolean v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->buttonTapped:Z

    .line 144
    :cond_0
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 145
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountResponse;

    .line 146
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_2

    .line 148
    invoke-direct {p0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteCredential()Z

    move-result p1

    if-nez p1, :cond_1

    .line 150
    invoke-direct {p0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->handleCredentialDeleteDone()V

    .line 152
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    if-eqz p1, :cond_5

    .line 153
    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->clearFTUEAppPreferences()V

    goto :goto_0

    :cond_2
    const/4 p2, 0x1

    .line 156
    iput-boolean p2, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->errorVisible:Z

    .line 157
    iget-object v2, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->errorText:Landroid/widget/TextView;

    iget-object v3, p1, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountResponse;->errorMsg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object v2, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->errorText:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;->googleIdToken:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountResponse;->status:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, p2, :cond_3

    .line 161
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-virtual {p0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/registration/GoogleSignInController;->logout(Landroid/app/Activity;)V

    .line 163
    :cond_3
    iput-object v1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    goto :goto_0

    .line 166
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/dialog/DialogsManager;->showResponseErrorAlert(Lcom/shopkick/fetchers/DataResponse;)V

    .line 167
    iput-object v1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    :cond_5
    :goto_0
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0094

    const/4 v0, 0x0

    .line 114
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    const p2, 0x7f0901d8

    .line 117
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/widget/SKButton;

    iput-object p2, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteButton:Lcom/shopkick/app/widget/SKButton;

    .line 118
    iget-object p2, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteButton:Lcom/shopkick/app/widget/SKButton;

    iget-object p3, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->clickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p2, 0x7f0901da

    .line 120
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->errorText:Landroid/widget/TextView;

    const p2, 0x7f110258

    .line 122
    invoke-virtual {p0, p2}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->setAppScreenTitle(I)V

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

    .line 99
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 100
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 101
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 102
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 103
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    .line 104
    iget-object v0, p1, Lcom/shopkick/app/application/ScreenGlobals;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    .line 105
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p1, "password_key"

    .line 107
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->password:Ljava/lang/String;

    const-string p1, "fb_access_token_key"

    .line 108
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->facebookAccessToken:Ljava/lang/String;

    const-string p1, "google_id_token_key"

    .line 109
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->googleIdToken:Ljava/lang/String;

    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    if-eqz v0, :cond_0

    .line 129
    iget-object v1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    const/4 v0, 0x0

    .line 131
    iput-object v0, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->deleteRequest:Lcom/shopkick/app/fetchers/api/skapi/UserDeleteAccountRequest;

    .line 134
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    .line 229
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x5f537c42

    if-eq p2, v0, :cond_1

    const v0, 0x72259237

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "CREDENTIAL_DELETE_SUCCESS"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const-string p2, "CREDENTIAL_DELETE_FAILURE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 232
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_DELETE_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_DELETE_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 234
    invoke-direct {p0}, Lcom/shopkick/app/account/DeleteAccountConfirmationScreen;->handleCredentialDeleteDone()V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

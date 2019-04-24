.class public Lcom/shopkick/app/account/Authenticator;
.super Ljava/lang/Object;
.source "Authenticator.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/controllers/IFBConnectControllerCallback;
.implements Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/account/Authenticator$AuthInfo;,
        Lcom/shopkick/app/account/Authenticator$DialogBtnNegativeListener;,
        Lcom/shopkick/app/account/Authenticator$DialogBtnPositiveListener;,
        Lcom/shopkick/app/account/Authenticator$AuthMedium;,
        Lcom/shopkick/app/account/Authenticator$AuthAction;
    }
.end annotation


# static fields
.field public static final AUTHENTICATOR_ACTION_KEY:Ljava/lang/String; = "AUTHENTICATOR_ACTION_KEY"

.field public static final AUTHENTICATOR_CANCEL:Ljava/lang/String; = "AUTHENTICATOR_CANCEL"

.field public static final AUTHENTICATOR_ERROR_MESSAGE_KEY:Ljava/lang/String; = "AUTHENTICATOR_ERROR_MESSAGE_KEY"

.field public static final AUTHENTICATOR_ERROR_STATUS_KEY:Ljava/lang/String; = "AUTHENTICATOR_ERROR_STATUS_KEY"

.field public static final AUTHENTICATOR_FAILURE:Ljava/lang/String; = "AUTHENTICATOR_FAILURE"

.field public static final AUTHENTICATOR_SUCCESS:Ljava/lang/String; = "AUTHENTICATOR_SUCCESS"

.field private static final TAG:Ljava/lang/String; = "com.shopkick.app.account.Authenticator"


# instance fields
.field private final appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

.field private authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

.field private authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field private authenticating:Z

.field private context:Landroid/content/Context;

.field private final credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

.field private currentActivityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field private dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private final fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

.field private final googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

.field private howToVideoDynamicFeatureSessionId:I

.field private loginRequestFailureErrorMessage:Ljava/lang/String;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private profileInfo:Lcom/shopkick/app/application/ProfileInfo;

.field private progressDialog:Landroid/app/ProgressDialog;

.field private final skLogger:Lcom/shopkick/app/application/SKLogger;

.field private temporarySKCredential:Lcom/shopkick/app/account/SKCredential;

.field private final userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/controllers/FBConnectController;Lcom/shopkick/app/registration/GoogleSignInController;Lcom/shopkick/app/account/CredentialStorageController;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/dialog/DialogsManager;Landroid/content/Context;)V
    .locals 1

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 119
    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->loginRequestFailureErrorMessage:Ljava/lang/String;

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    if-eqz p4, :cond_0

    if-eqz p5, :cond_0

    if-eqz p6, :cond_0

    if-nez p9, :cond_1

    :cond_0
    const-string v0, "Authenticator constructor parameters must not be null"

    .line 136
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    .line 138
    :cond_1
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 139
    iput-object p2, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    .line 140
    iput-object p3, p0, Lcom/shopkick/app/account/Authenticator;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 141
    iput-object p4, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 142
    iput-object p5, p0, Lcom/shopkick/app/account/Authenticator;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    .line 143
    iput-object p6, p0, Lcom/shopkick/app/account/Authenticator;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    .line 144
    iput-object p7, p0, Lcom/shopkick/app/account/Authenticator;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    .line 145
    iput-object p8, p0, Lcom/shopkick/app/account/Authenticator;->skLogger:Lcom/shopkick/app/application/SKLogger;

    .line 146
    iput-object p9, p0, Lcom/shopkick/app/account/Authenticator;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 147
    iput-object p10, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    return-void
.end method

.method static synthetic access$1000(Lcom/shopkick/app/account/Authenticator;)Lcom/shopkick/app/account/Authenticator$AuthMedium;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/shopkick/app/account/Authenticator;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/shopkick/app/account/Authenticator;)Lcom/shopkick/app/registration/GoogleSignInController;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/shopkick/app/account/Authenticator;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/shopkick/app/account/Authenticator;Ljava/lang/String;)Z
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->deleteCredential(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$1400(Lcom/shopkick/app/account/Authenticator;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->handleCredentialDeleteDone()V

    return-void
.end method

.method static synthetic access$802(Lcom/shopkick/app/account/Authenticator;Lcom/shopkick/app/account/Authenticator$AuthAction;)Lcom/shopkick/app/account/Authenticator$AuthAction;
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    return-object p1
.end method

.method static synthetic access$900(Lcom/shopkick/app/account/Authenticator;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->authenticateInternal()V

    return-void
.end method

.method private authenticateInternal()V
    .locals 6

    .line 204
    iget-boolean v0, p0, Lcom/shopkick/app/account/Authenticator;->authenticating:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->validate()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->progressDialog:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 215
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->progressDialog:Landroid/app/ProgressDialog;

    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->progressDialogMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 206
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 208
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 209
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "Tried to perform auth with null activity reference. Return early and do no op."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    const-string v2, ""

    .line 213
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->progressDialogMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->progressDialog:Landroid/app/ProgressDialog;

    .line 217
    :goto_1
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->performAuthAction()V

    :cond_3
    return-void
.end method

.method private clear()V
    .locals 2

    const/4 v0, 0x0

    .line 241
    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    .line 242
    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 243
    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 244
    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 245
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->progressDialog:Landroid/app/ProgressDialog;

    invoke-static {v1}, Lcom/shopkick/app/util/DialogUtils;->dismissProgressDialog(Landroid/app/ProgressDialog;)V

    .line 246
    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->progressDialog:Landroid/app/ProgressDialog;

    return-void
.end method

.method private connect()V
    .locals 2

    .line 474
    sget-object v0, Lcom/shopkick/app/account/Authenticator$1;->$SwitchMap$com$shopkick$app$account$Authenticator$AuthMedium:[I

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v1}, Lcom/shopkick/app/account/Authenticator$AuthMedium;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "Cannot perform action CONNECT with medium AUTH_CODE"

    .line 485
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_1
    const-string v0, "Cannot perform action CONNECT with medium GOOGLE"

    .line 479
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    goto :goto_0

    .line 476
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->facebookConnect()V

    goto :goto_0

    :pswitch_3
    const-string v0, "Cannot perform action CONNECT with medium EMAIL"

    .line 482
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private deleteCredential(Ljava/lang/String;)Z
    .locals 7

    .line 727
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 728
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 729
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "Tried to delete credential with null activity reference. Return early as no action to take here."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 735
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    if-nez v0, :cond_1

    return v1

    .line 741
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v3, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v3, :cond_2

    .line 742
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 743
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v2, v3}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v5

    goto :goto_0

    .line 745
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v3, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v2, v3, :cond_3

    .line 746
    invoke-static {v5}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromFacebook(Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v5

    goto :goto_0

    .line 747
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v3, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v2, v3, :cond_6

    .line 748
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$700(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 749
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$700(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromGoogle(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v5

    :cond_4
    :goto_0
    if-nez v5, :cond_5

    .line 760
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 761
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "Tried to delete credential with null skCredential. Return early as no action to take here."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 766
    :cond_5
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v3, "CREDENTIAL_DELETE_SUCCESS"

    invoke-virtual {v2, p0, v3, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 767
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v3, "CREDENTIAL_DELETE_FAILURE"

    invoke-virtual {v2, p0, v3, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 768
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator;->loginRequestFailureErrorMessage:Ljava/lang/String;

    .line 769
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    invoke-virtual {p1, v0, v5}, Lcom/shopkick/app/account/CredentialStorageController;->deleteCredential(Landroid/app/Activity;Lcom/shopkick/app/account/SKCredential;)V

    return v4

    .line 752
    :cond_6
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 753
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v2, v5

    const-string v0, "Tried to delete credential with invalid AuthMedium %d. Return early as no action to take here."

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 755
    invoke-virtual {v5}, Lcom/shopkick/app/account/Authenticator$AuthMedium;->getValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    .line 753
    invoke-virtual {p1, v2, v3, v0, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method

.method private facebookConnect()V
    .locals 2

    .line 492
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserFacebookConnectSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 493
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "UserFacebookConnectFailure"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 494
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$500(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->makeUserFacebookConnectRequest(Ljava/lang/String;)V

    return-void
.end method

.method private finishAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V
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

    const/4 v0, 0x0

    .line 327
    iput-boolean v0, p0, Lcom/shopkick/app/account/Authenticator;->authenticating:Z

    .line 328
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->clear()V

    .line 329
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method private handleCommonUserAccountDataSourceFailure(Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 661
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AUTHENTICATOR_ACTION_KEY"

    .line 662
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_ERROR_MESSAGE_KEY"

    const-string v2, "ErrorMsg"

    .line 663
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_ERROR_STATUS_KEY"

    const-string v2, "Status"

    .line 664
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "AUTHENTICATOR_FAILURE"

    .line 665
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/Authenticator;->finishAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private handleCommonUserAccountDataSourceSuccess(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 655
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "AUTHENTICATOR_ACTION_KEY"

    .line 656
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "AUTHENTICATOR_SUCCESS"

    .line 657
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/account/Authenticator;->finishAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private handleCredentialDeleteDone()V
    .locals 3

    .line 774
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AUTHENTICATOR_ACTION_KEY"

    .line 775
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_ERROR_MESSAGE_KEY"

    .line 779
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->loginRequestFailureErrorMessage:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 781
    iput-object v1, p0, Lcom/shopkick/app/account/Authenticator;->loginRequestFailureErrorMessage:Ljava/lang/String;

    const-string v1, "AUTHENTICATOR_FAILURE"

    .line 782
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/account/Authenticator;->finishAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private handleFacebookConnectFailure(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 650
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const-string v1, "ErrorMsg"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    .line 651
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleCommonUserAccountDataSourceFailure(Ljava/util/HashMap;)V

    return-void
.end method

.method private handleFacebookConnectSuccess(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Status"

    .line 641
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 643
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleCommonUserAccountDataSourceSuccess(Ljava/util/HashMap;)V

    goto :goto_0

    .line 645
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleFacebookConnectFailure(Ljava/util/HashMap;)V

    :goto_0
    return-void
.end method

.method private handleLoginRequestFailure(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 634
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 635
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/registration/GoogleSignInController;->logout(Landroid/app/Activity;)V

    .line 637
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleCommonUserAccountDataSourceFailure(Ljava/util/HashMap;)V

    return-void
.end method

.method private handleLoginRequestSuccess(Ljava/util/HashMap;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Status"

    .line 590
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DisplayName"

    .line 592
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/shopkick/app/account/Authenticator;->saveCredential(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 594
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleCommonUserAccountDataSourceSuccess(Ljava/util/HashMap;)V

    .line 596
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    if-eqz p1, :cond_8

    .line 597
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->checkFTUEUserId(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 600
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "ErrorMsg"

    .line 611
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/shopkick/app/account/Authenticator;->deleteCredential(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 613
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleLoginRequestFailure(Ljava/util/HashMap;)V

    goto/16 :goto_2

    .line 601
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 602
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->dialogsManager:Lcom/shopkick/app/application/dialog/DialogsManager;

    const/4 v1, 0x0

    const v2, 0x7f110155

    .line 603
    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f11003d

    .line 604
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f11014f

    .line 605
    invoke-virtual {p1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/shopkick/app/account/Authenticator$DialogBtnPositiveListener;

    invoke-direct {v5, p0}, Lcom/shopkick/app/account/Authenticator$DialogBtnPositiveListener;-><init>(Lcom/shopkick/app/account/Authenticator;)V

    const v6, 0x7f110140

    .line 607
    invoke-virtual {p1, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/shopkick/app/account/Authenticator$DialogBtnNegativeListener;

    invoke-direct {v7, p0}, Lcom/shopkick/app/account/Authenticator$DialogBtnNegativeListener;-><init>(Lcom/shopkick/app/account/Authenticator;)V

    const/4 v8, 0x0

    .line 602
    invoke-virtual/range {v0 .. v8}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogConfirmOrDeny(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Ljava/lang/String;Lcom/shopkick/app/application/dialog/SKDialogFragment$SKDialogBtnClickListener;Lcom/shopkick/app/application/dialog/SKDialogFragment$OnDismissListener;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_2

    :cond_4
    const/4 v2, 0x3

    if-ne v0, v2, :cond_7

    .line 619
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    const-string v0, "Must have email and password to require Two Factor Auth"

    invoke-static {v1, v0}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 621
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 622
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    const v1, 0x7f110254

    .line 623
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 624
    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 625
    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    .line 622
    invoke-static {v0, v1, v2}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->temporarySKCredential:Lcom/shopkick/app/account/SKCredential;

    .line 627
    :cond_6
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleLoginRequestFailure(Ljava/util/HashMap;)V

    goto :goto_2

    .line 629
    :cond_7
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleLoginRequestFailure(Ljava/util/HashMap;)V

    :cond_8
    :goto_2
    return-void
.end method

.method private handleRegistrationRequestFailure(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 578
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 579
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/registration/GoogleSignInController;->logout(Landroid/app/Activity;)V

    .line 581
    :cond_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleCommonUserAccountDataSourceFailure(Ljava/util/HashMap;)V

    const-string v0, "HttpStatusCode"

    .line 582
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "HttpStatusCode"

    .line 583
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_1

    .line 585
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Lcom/shopkick/app/account/UserAccountDataSource;->resetCurrentUserWithReason(I)V

    :cond_1
    return-void
.end method

.method private handleRegistrationRequestSuccess(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "Status"

    .line 558
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DisplayName"

    .line 560
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/shopkick/app/account/Authenticator;->saveCredential(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 562
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleCommonUserAccountDataSourceSuccess(Ljava/util/HashMap;)V

    .line 564
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    if-eqz p1, :cond_4

    .line 565
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->checkFTUEUserId(Ljava/lang/String;)V

    .line 566
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/AppPreferences;->setFtueIsNewAccount(Z)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x7

    if-ne v0, v1, :cond_2

    goto :goto_0

    .line 573
    :cond_2
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/Authenticator;->handleRegistrationRequestFailure(Ljava/util/HashMap;)V

    goto :goto_1

    .line 570
    :cond_3
    :goto_0
    sget-object p1, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 571
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->authenticateInternal()V

    :cond_4
    :goto_1
    return-void
.end method

.method private login()V
    .locals 5

    .line 461
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "LoginRequestSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 462
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "LoginRequestFailure"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 463
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->AUTH_CODE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_0

    .line 464
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$400(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->makeAuthCodeLoginRequest(Ljava/lang/String;)V

    goto :goto_0

    .line 466
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 467
    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 468
    invoke-static {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$500(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 469
    invoke-static {v4}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$600(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v4

    .line 466
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/app/account/UserAccountDataSource;->makeLoginRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private maybeRegister()V
    .locals 2

    .line 429
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->isCountryAvailableToCreateGuestAccount()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 430
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 431
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestFailure"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 432
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->makeUserCreateGuestRequestWithReason(I)V

    goto :goto_0

    .line 434
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->register()V

    :goto_0
    return-void
.end method

.method private performAuthAction()V
    .locals 2

    .line 415
    sget-object v0, Lcom/shopkick/app/account/Authenticator$1;->$SwitchMap$com$shopkick$app$account$Authenticator$AuthAction:[I

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v1}, Lcom/shopkick/app/account/Authenticator$AuthAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 423
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->connect()V

    goto :goto_0

    .line 420
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->login()V

    goto :goto_0

    .line 417
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->maybeRegister()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private progressDialogMessage()Ljava/lang/String;
    .locals 3

    .line 222
    sget-object v0, Lcom/shopkick/app/account/Authenticator$1;->$SwitchMap$com$shopkick$app$account$Authenticator$AuthAction:[I

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v1}, Lcom/shopkick/app/account/Authenticator$AuthAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v0, "Invalid code path"

    .line 235
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    return-object v1

    .line 228
    :pswitch_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v2, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v2, :cond_0

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    const v1, 0x7f110586

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "Invalid connect option"

    .line 231
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    return-object v1

    .line 226
    :pswitch_1
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    const v1, 0x7f110590

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 224
    :pswitch_2
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    const v1, 0x7f110591

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private register()V
    .locals 18

    move-object/from16 v0, p0

    .line 439
    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    .line 440
    invoke-virtual {v1, v2}, Lcom/shopkick/app/application/ProfileInfo;->setUserFirstUse(Z)V

    .line 442
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "RegistrationRequestSuccess"

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 443
    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "RegistrationRequestFailure"

    invoke-virtual {v1, v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 444
    iget-object v3, v0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v4

    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 445
    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v5

    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 446
    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$300(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 448
    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$200(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v8

    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 449
    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$500(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v9

    iget-object v1, v0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 450
    invoke-static {v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$600(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 444
    invoke-virtual/range {v3 .. v17}, Lcom/shopkick/app/account/UserAccountDataSource;->makeUserRegisterRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private saveCredential(Ljava/lang/String;)Z
    .locals 8

    .line 669
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 670
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 671
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "Tried to save credential with null activity reference. Return early as no action to take here."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 677
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    if-nez v0, :cond_1

    return v1

    .line 682
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 683
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    const v2, 0x7f110254

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 687
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->temporarySKCredential:Lcom/shopkick/app/account/SKCredential;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    .line 688
    iget-object v2, v2, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    iget-object v5, p0, Lcom/shopkick/app/account/Authenticator;->temporarySKCredential:Lcom/shopkick/app/account/SKCredential;

    iget-object v5, v5, Lcom/shopkick/app/account/SKCredential;->password:Ljava/lang/String;

    invoke-static {p1, v2, v5}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object p1

    .line 691
    iput-object v4, p0, Lcom/shopkick/app/account/Authenticator;->temporarySKCredential:Lcom/shopkick/app/account/SKCredential;

    move-object v4, p1

    goto :goto_0

    .line 693
    :cond_3
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v5, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v2, v5, :cond_4

    .line 694
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 695
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v4}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v2, v4}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v4

    goto :goto_0

    .line 697
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v5, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v2, v5, :cond_5

    .line 698
    invoke-static {p1}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromFacebook(Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v4

    goto :goto_0

    .line 699
    :cond_5
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v5, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v2, v5, :cond_8

    .line 700
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$700(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 701
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$700(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromGoogle(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object v4

    :cond_6
    :goto_0
    if-nez v4, :cond_7

    .line 714
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 715
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v0, "Tried to save credential with null skCredential. Return early as no action to take here."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 720
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "CREDENTIAL_SAVE_SUCCESS"

    invoke-virtual {p1, p0, v2, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 721
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "CREDENTIAL_SAVE_FAILURE"

    invoke-virtual {p1, p0, v2, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 722
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->credentialStorageController:Lcom/shopkick/app/account/CredentialStorageController;

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1, v4}, Lcom/shopkick/app/account/CredentialStorageController;->saveCredential(Landroid/app/Activity;Ljava/lang/String;Lcom/shopkick/app/account/SKCredential;)V

    return v3

    .line 704
    :cond_8
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 705
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 706
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v4, v6

    const-string v0, "Tried to save credential with invalid AuthMedium %d. Return early as no action to take here."

    new-array v2, v3, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 708
    invoke-virtual {v3}, Lcom/shopkick/app/account/Authenticator$AuthMedium;->getValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    .line 706
    invoke-virtual {p1, v4, v5, v0, v2}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method

.method private validate()Z
    .locals 2

    .line 255
    sget-object v0, Lcom/shopkick/app/account/Authenticator$1;->$SwitchMap$com$shopkick$app$account$Authenticator$AuthMedium:[I

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    invoke-virtual {v1}, Lcom/shopkick/app/account/Authenticator$AuthMedium;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const-string v0, "Invalid code path"

    .line 265
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    .line 263
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->validateAuthCodeAuthInfo()Z

    move-result v0

    return v0

    .line 261
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->validateGoogleSignInAuthInfo()Z

    move-result v0

    return v0

    .line 259
    :pswitch_2
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->validateFacebookAuthInfo()Z

    move-result v0

    return v0

    .line 257
    :pswitch_3
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->validateEmailAuthInfo()Z

    move-result v0

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private validateAuthCodeAuthInfo()Z
    .locals 5

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$400(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 283
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v4, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    if-ne v3, v4, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    if-nez v1, :cond_3

    const-string v0, "Insufficient fields or incorrect authAction for auth code authentication."

    .line 286
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    :cond_3
    return v1
.end method

.method private validateEmailAuthInfo()Z
    .locals 6

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$000(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$100(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 272
    :goto_0
    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$200(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$300(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 273
    invoke-static {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$200(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$300(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move v3, v2

    goto :goto_2

    :cond_3
    :goto_1
    move v3, v1

    .line 274
    :goto_2
    iget-object v4, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    sget-object v5, Lcom/shopkick/app/account/Authenticator$AuthAction;->LOGIN:Lcom/shopkick/app/account/Authenticator$AuthAction;

    if-ne v4, v5, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v0, :cond_5

    if-eqz v3, :cond_5

    move v0, v1

    goto :goto_3

    :cond_5
    move v0, v2

    :goto_3
    if-nez v0, :cond_6

    const-string v1, "Insufficient or incorrect fields for E-mail authentication."

    .line 276
    invoke-static {v1}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    :cond_6
    return v0
.end method

.method private validateFacebookAuthInfo()Z
    .locals 6

    .line 292
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$500(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 295
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 297
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 298
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "Tried to perform fb auth with null activity reference. Return early as fb auth failed."

    new-array v5, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v1

    .line 302
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->fbConnectController:Lcom/shopkick/app/controllers/FBConnectController;

    invoke-virtual {v2, v0, p0}, Lcom/shopkick/app/controllers/FBConnectController;->authorize(Landroid/app/Activity;Lcom/shopkick/app/controllers/IFBConnectControllerCallback;)V

    return v1
.end method

.method private validateGoogleSignInAuthInfo()Z
    .locals 7

    .line 307
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$600(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 310
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 312
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 313
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    sget-object v1, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    or-long/2addr v3, v5

    const-string v1, "Tried to perform Google auth with null activity reference. Return early as Google auth failed."

    new-array v5, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v3, v4, v1, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return v2

    .line 318
    :cond_1
    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v3}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$700(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 319
    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    iget-object v4, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v4}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$700(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, p0, v1, v4}, Lcom/shopkick/app/registration/GoogleSignInController;->authorizeSilentSignIn(Landroid/app/Activity;Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;ZLjava/lang/String;)V

    goto :goto_0

    .line 321
    :cond_2
    iget-object v3, p0, Lcom/shopkick/app/account/Authenticator;->googleSignInController:Lcom/shopkick/app/registration/GoogleSignInController;

    invoke-virtual {v3, v0, p0, v1}, Lcom/shopkick/app/registration/GoogleSignInController;->authorize(Landroid/app/Activity;Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;Z)V

    :goto_0
    return v2
.end method


# virtual methods
.method public authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;)V
    .locals 1

    const/4 v0, 0x0

    .line 166
    invoke-virtual {p0, p1, p2, v0}, Lcom/shopkick/app/account/Authenticator;->authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Lcom/shopkick/app/account/Authenticator$AuthInfo;)V

    return-void
.end method

.method public authenticate(Lcom/shopkick/app/account/Authenticator$AuthAction;Lcom/shopkick/app/account/Authenticator$AuthMedium;Lcom/shopkick/app/account/Authenticator$AuthInfo;)V
    .locals 2
    .param p3    # Lcom/shopkick/app/account/Authenticator$AuthInfo;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 187
    iget-boolean v0, p0, Lcom/shopkick/app/account/Authenticator;->authenticating:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 190
    iput-boolean v0, p0, Lcom/shopkick/app/account/Authenticator;->authenticating:Z

    .line 192
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->currentActivityRef:Ljava/lang/ref/WeakReference;

    .line 193
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    .line 194
    iput-object p2, p0, Lcom/shopkick/app/account/Authenticator;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    .line 195
    iput-object p3, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 196
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    if-nez p1, :cond_1

    .line 198
    new-instance p1, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {p1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 200
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->authenticateInternal()V

    return-void
.end method

.method public destroy()V
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

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

    .line 501
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "CREDENTIAL_DELETE_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xa

    goto/16 :goto_1

    :sswitch_1
    const-string v0, "RegistrationRequestFailure"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "RegistrationRequestSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_3
    const-string v0, "UserFacebookConnectFailure"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x7

    goto :goto_1

    :sswitch_4
    const-string v0, "CreateGuestRequestFailure"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :sswitch_5
    const-string v0, "LoginRequestFailure"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :sswitch_6
    const-string v0, "UserFacebookConnectSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x6

    goto :goto_1

    :sswitch_7
    const-string v0, "CreateGuestRequestSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :sswitch_8
    const-string v0, "LoginRequestSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_1

    :sswitch_9
    const-string v0, "CREDENTIAL_SAVE_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x9

    goto :goto_1

    :sswitch_a
    const-string v0, "CREDENTIAL_DELETE_FAILURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0xb

    goto :goto_1

    :sswitch_b
    const-string v0, "CREDENTIAL_SAVE_SUCCESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_2

    .line 550
    :pswitch_0
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_DELETE_SUCCESS"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 551
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CREDENTIAL_DELETE_FAILURE"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 552
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->handleCredentialDeleteDone()V

    goto/16 :goto_2

    .line 544
    :pswitch_1
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_SAVE_SUCCESS"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 545
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "CREDENTIAL_SAVE_FAILURE"

    invoke-virtual {p1, p0, v0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 546
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/Authenticator;->handleCommonUserAccountDataSourceSuccess(Ljava/util/HashMap;)V

    goto/16 :goto_2

    .line 538
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/Authenticator;->handleFacebookConnectFailure(Ljava/util/HashMap;)V

    .line 539
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserFacebookConnectSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 540
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserFacebookConnectFailure"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 533
    :pswitch_3
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/Authenticator;->handleFacebookConnectSuccess(Ljava/util/HashMap;)V

    .line 534
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserFacebookConnectSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 535
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "UserFacebookConnectFailure"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_2

    .line 528
    :pswitch_4
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/Authenticator;->handleLoginRequestFailure(Ljava/util/HashMap;)V

    .line 529
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "LoginRequestSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 530
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "LoginRequestFailure"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_2

    .line 523
    :pswitch_5
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/Authenticator;->handleLoginRequestSuccess(Ljava/util/HashMap;)V

    .line 524
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "LoginRequestSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 525
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "LoginRequestFailure"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_2

    .line 518
    :pswitch_6
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/Authenticator;->handleRegistrationRequestFailure(Ljava/util/HashMap;)V

    .line 519
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "RegistrationRequestSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 520
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "RegistrationRequestFailure"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_2

    .line 513
    :pswitch_7
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/Authenticator;->handleRegistrationRequestSuccess(Ljava/util/HashMap;)V

    .line 514
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "RegistrationRequestSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 515
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "RegistrationRequestFailure"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_2

    .line 508
    :pswitch_8
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/Authenticator;->handleCommonUserAccountDataSourceFailure(Ljava/util/HashMap;)V

    .line 509
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CreateGuestRequestSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 510
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CreateGuestRequestFailure"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    goto :goto_2

    .line 503
    :pswitch_9
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->register()V

    .line 504
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CreateGuestRequestSuccess"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 505
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "CreateGuestRequestFailure"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x773e05f7 -> :sswitch_b
        -0x5f537c42 -> :sswitch_a
        -0x48b71470 -> :sswitch_9
        -0x3a5c71e3 -> :sswitch_8
        -0x3205dc50 -> :sswitch_7
        -0x1fcc0e16 -> :sswitch_6
        -0xbd5805c -> :sswitch_5
        -0x37eeac9 -> :sswitch_4
        0xebae371 -> :sswitch_3
        0x414ccfad -> :sswitch_2
        0x6fd3c134 -> :sswitch_1
        0x72259237 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onFacebookConnectCancel()V
    .locals 3

    .line 358
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 359
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 361
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AUTHENTICATOR_ACTION_KEY"

    .line 362
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_CANCEL"

    .line 363
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/account/Authenticator;->finishAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method public onFacebookConnectFailure()V
    .locals 4

    .line 347
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 348
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 350
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AUTHENTICATOR_ACTION_KEY"

    .line 351
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_ERROR_MESSAGE_KEY"

    .line 352
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    const v3, 0x7f110585

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_FAILURE"

    .line 353
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/account/Authenticator;->finishAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method public onFacebookConnectSuccess(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 335
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 336
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    if-nez v0, :cond_0

    .line 339
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 341
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0, p1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$502(Lcom/shopkick/app/account/Authenticator$AuthInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->authenticateInternal()V

    return-void
.end method

.method public onGoogleSignInCancel()V
    .locals 3

    .line 403
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 404
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 406
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AUTHENTICATOR_ACTION_KEY"

    .line 407
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_CANCEL"

    .line 408
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/account/Authenticator;->finishAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method public onGoogleSignInFailure()V
    .locals 4

    .line 384
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$700(Lcom/shopkick/app/account/Authenticator$AuthInfo;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 388
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$702(Lcom/shopkick/app/account/Authenticator$AuthInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 389
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->validateGoogleSignInAuthInfo()Z

    goto :goto_0

    .line 391
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 392
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 394
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AUTHENTICATOR_ACTION_KEY"

    .line 395
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->authAction:Lcom/shopkick/app/account/Authenticator$AuthAction;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_ERROR_MESSAGE_KEY"

    .line 396
    iget-object v2, p0, Lcom/shopkick/app/account/Authenticator;->context:Landroid/content/Context;

    const v3, 0x7f110587

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AUTHENTICATOR_FAILURE"

    .line 397
    invoke-direct {p0, v1, v0}, Lcom/shopkick/app/account/Authenticator;->finishAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    :goto_0
    return-void
.end method

.method public onGoogleSignInSuccess(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 371
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const v1, 0x6ddd7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 372
    iget-object v1, p0, Lcom/shopkick/app/account/Authenticator;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 374
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    if-nez v0, :cond_0

    .line 375
    new-instance v0, Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-direct {v0}, Lcom/shopkick/app/account/Authenticator$AuthInfo;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    .line 377
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {v0, p1}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$602(Lcom/shopkick/app/account/Authenticator$AuthInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 378
    iget-object p1, p0, Lcom/shopkick/app/account/Authenticator;->authInfo:Lcom/shopkick/app/account/Authenticator$AuthInfo;

    invoke-static {p1, p2}, Lcom/shopkick/app/account/Authenticator$AuthInfo;->access$702(Lcom/shopkick/app/account/Authenticator$AuthInfo;Ljava/lang/String;)Ljava/lang/String;

    .line 379
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->authenticateInternal()V

    return-void
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 250
    iput-boolean v0, p0, Lcom/shopkick/app/account/Authenticator;->authenticating:Z

    .line 251
    invoke-direct {p0}, Lcom/shopkick/app/account/Authenticator;->clear()V

    return-void
.end method

.method public setProfileInfo(Lcom/shopkick/app/application/ProfileInfo;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/shopkick/app/account/Authenticator;->profileInfo:Lcom/shopkick/app/application/ProfileInfo;

    return-void
.end method

.class public Lcom/shopkick/app/account/GoogleSmartLockController;
.super Ljava/lang/Object;
.source "GoogleSmartLockController.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;,
        Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;
    }
.end annotation


# static fields
.field private static final GOOGLE_SMART_LOCK_API_BAIL_OUT_TIME_SEC:I = 0x5

.field public static final GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_FAILURE:Ljava/lang/String; = "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_FAILURE"

.field public static final GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_SUCCESS:Ljava/lang/String; = "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_SUCCESS"

.field public static final GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_FAILURE:Ljava/lang/String; = "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_FAILURE"

.field public static final GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_SUCCESS:Ljava/lang/String; = "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_SUCCESS"

.field public static final GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_FAILURE:Ljava/lang/String; = "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_FAILURE"

.field public static final GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_SUCCESS:Ljava/lang/String; = "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_SUCCESS"

.field public static final GOOGLE_SMART_LOCK_RETRIEVED_CREDENTIAL_KEY:Ljava/lang/String; = "GOOGLE_SMART_LOCK_RETRIEVED_CREDENTIAL_KEY"

.field public static final GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_FAILURE:Ljava/lang/String; = "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_FAILURE"

.field public static final GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_SUCCESS:Ljava/lang/String; = "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_SUCCESS"

.field public static final GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_FAILURE:Ljava/lang/String; = "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_FAILURE"

.field public static final GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_SUCCESS:Ljava/lang/String; = "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_SUCCESS"

.field private static bailOutHandler:Landroid/os/Handler;


# instance fields
.field private activityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private bailOutRunnable:Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;

.field private context:Landroid/content/Context;

.field private deleteCredential:Lcom/google/android/gms/auth/api/credentials/Credential;

.field private mCredentialRequest:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

.field private mCredentialRequestType:I

.field private mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private saveCredential:Lcom/google/android/gms/auth/api/credentials/Credential;

.field private skLogger:Lcom/shopkick/app/application/SKLogger;

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/SKLogger;)V
    .locals 1

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 98
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 138
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->context:Landroid/content/Context;

    .line 139
    iput-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 140
    iput-object p3, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    .line 142
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    sput-object p1, Lcom/shopkick/app/account/GoogleSmartLockController;->bailOutHandler:Landroid/os/Handler;

    return-void

    .line 136
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'notificationCenter\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 133
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'context\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialSavedFailure(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialRetrievedFailure(Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/shopkick/app/account/GoogleSmartLockController;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialSavedSuccess()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialDeletedFailure(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialDisableAuthSignInFailure(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$400(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialCheckedFailure(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/account/GoogleSmartLockController;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialDeletedSuccess()V

    return-void
.end method

.method static synthetic access$700(Lcom/shopkick/app/account/GoogleSmartLockController;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialCheckedSuccess()V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/account/GoogleSmartLockController;Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialRetrievedSuccess(Lcom/google/android/gms/auth/api/credentials/Credential;)V

    return-void
.end method

.method static synthetic access$900(Lcom/shopkick/app/account/GoogleSmartLockController;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->activityRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method private checkCredentialCallback()V
    .locals 3

    const/4 v0, 0x0

    .line 478
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disableAutoSignInCredentialCallback(Z)V

    .line 479
    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->CredentialsApi:Lcom/google/android/gms/auth/api/credentials/CredentialsApi;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequest:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/auth/api/credentials/CredentialsApi;->request(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/account/GoogleSmartLockController$2;

    invoke-direct {v1, p0}, Lcom/shopkick/app/account/GoogleSmartLockController$2;-><init>(Lcom/shopkick/app/account/GoogleSmartLockController;)V

    .line 480
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    return-void
.end method

.method private deleteCredentialCallback()V
    .locals 3

    .line 371
    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->CredentialsApi:Lcom/google/android/gms/auth/api/credentials/CredentialsApi;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->deleteCredential:Lcom/google/android/gms/auth/api/credentials/Credential;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/auth/api/credentials/CredentialsApi;->delete(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/auth/api/credentials/Credential;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/account/GoogleSmartLockController$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/account/GoogleSmartLockController$1;-><init>(Lcom/shopkick/app/account/GoogleSmartLockController;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    return-void
.end method

.method private disableAutoSignInCredentialCallback(Z)V
    .locals 2

    .line 428
    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->CredentialsApi:Lcom/google/android/gms/auth/api/credentials/CredentialsApi;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1}, Lcom/google/android/gms/auth/api/credentials/CredentialsApi;->disableAutoSignIn(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    if-eqz p1, :cond_0

    const-string p1, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_SUCCESS"

    const/4 v0, 0x0

    .line 433
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    :cond_0
    return-void
.end method

.method private disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V
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

    .line 266
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->activityRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 267
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 269
    check-cast v0, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    :cond_0
    const/4 v0, 0x0

    .line 272
    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 273
    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v1, :cond_1

    .line 274
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 278
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOffBailOutTimer()V

    .line 280
    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->userId:Ljava/lang/String;

    if-eqz p1, :cond_2

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :cond_2
    return-void
.end method

.method private getCredentialFromSKCredential(Lcom/shopkick/app/account/SKCredential;)Lcom/google/android/gms/auth/api/credentials/Credential;
    .locals 3

    .line 735
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_0

    .line 736
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    iget-object v1, p1, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lcom/shopkick/app/account/SKCredential;->password:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->setPassword(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    move-result-object v0

    iget-object p1, p1, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    .line 737
    invoke-virtual {v0, p1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    move-result-object p1

    .line 739
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->build()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object p1

    goto :goto_0

    .line 740
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_1

    .line 742
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->context:Landroid/content/Context;

    const v2, 0x7f110220

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;-><init>(Ljava/lang/String;)V

    const-string v1, "https://www.facebook.com"

    .line 744
    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->setAccountType(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    move-result-object v0

    iget-object p1, p1, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    .line 745
    invoke-virtual {v0, p1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    move-result-object p1

    .line 746
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->build()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object p1

    goto :goto_0

    .line 747
    :cond_1
    iget-object v0, p1, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    sget-object v1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    if-ne v0, v1, :cond_2

    .line 748
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    iget-object v1, p1, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;-><init>(Ljava/lang/String;)V

    const-string v1, "https://accounts.google.com"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->setAccountType(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    move-result-object v0

    iget-object p1, p1, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    .line 749
    invoke-virtual {v0, p1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->setName(Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/Credential$Builder;

    move-result-object p1

    .line 750
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential$Builder;->build()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private onCredentialCheckedFailure(Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    .line 521
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 522
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "Google Smart Lock checkCredential failed with reason: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string p1, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_FAILURE"

    const/4 v0, 0x0

    .line 527
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private onCredentialCheckedSuccess()V
    .locals 2

    const/4 v0, 0x0

    .line 514
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disableAutoSignInCredentialCallback(Z)V

    const-string v0, "GOOGLE_SMART_LOCK_CHECK_CREDENTIAL_SUCCESS"

    const/4 v1, 0x0

    .line 516
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private onCredentialDeletedFailure(Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    .line 396
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 397
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "Google Smart Lock deleteCredential failed with reason: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string p1, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_FAILURE"

    const/4 v0, 0x0

    .line 402
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private onCredentialDeletedSuccess()V
    .locals 2

    const/4 v0, 0x0

    .line 389
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disableAutoSignInCredentialCallback(Z)V

    const-string v0, "GOOGLE_SMART_LOCK_DELETE_CREDENTIAL_SUCCESS"

    const/4 v1, 0x0

    .line 391
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private onCredentialDisableAuthSignInFailure(Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    .line 439
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 440
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "Google Smart Lock disableAutoSignInCredential failed with reason: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string p1, "GOOGLE_SMART_LOCK_DISABLE_AUTO_SIGN_IN_CREDENTIAL_FAILURE"

    const/4 v0, 0x0

    .line 445
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private onCredentialRetrievedFailure(Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V
    .locals 6

    if-eqz p1, :cond_0

    .line 635
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 636
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "Google Smart Lock retrieveCredential failed with reason: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 641
    :cond_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "GOOGLE_SMART_LOCK_RETRIEVED_CREDENTIAL_KEY"

    .line 642
    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_FAILURE"

    .line 643
    invoke-direct {p0, p2, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private onCredentialRetrievedSuccess(Lcom/google/android/gms/auth/api/credentials/Credential;)V
    .locals 2

    .line 612
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->getAccountType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 615
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->getId()Ljava/lang/String;

    move-result-object v1

    .line 616
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->getPassword()Ljava/lang/String;

    move-result-object p1

    .line 615
    invoke-static {v0, v1, p1}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v1, "https://www.facebook.com"

    .line 617
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 618
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromFacebook(Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string v1, "https://accounts.google.com"

    .line 619
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 620
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/credentials/Credential;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/shopkick/app/account/SKCredential;->createSKCredentialFromGoogle(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    .line 626
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disableAutoSignInCredentialCallback(Z)V

    .line 628
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "GOOGLE_SMART_LOCK_RETRIEVED_CREDENTIAL_KEY"

    .line 629
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "GOOGLE_SMART_LOCK_RETRIEVE_CREDENTIAL_SUCCESS"

    .line 630
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void

    :cond_2
    return-void
.end method

.method private onCredentialSavedFailure(Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_0

    .line 720
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 721
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "Google Smart Lock saveCredential failed with reason: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const-string p1, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_FAILURE"

    const/4 v0, 0x0

    .line 726
    invoke-direct {p0, p1, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private onCredentialSavedSuccess()V
    .locals 2

    const/4 v0, 0x0

    .line 713
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disableAutoSignInCredentialCallback(Z)V

    const-string v0, "GOOGLE_SMART_LOCK_SAVE_CREDENTIAL_SUCCESS"

    const/4 v1, 0x0

    .line 715
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    return-void
.end method

.method private retrieveCredentialCallback()V
    .locals 3

    const/4 v0, 0x0

    .line 560
    invoke-direct {p0, v0}, Lcom/shopkick/app/account/GoogleSmartLockController;->disableAutoSignInCredentialCallback(Z)V

    .line 561
    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->CredentialsApi:Lcom/google/android/gms/auth/api/credentials/CredentialsApi;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequest:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/auth/api/credentials/CredentialsApi;->request(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/auth/api/credentials/CredentialRequest;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/account/GoogleSmartLockController$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/account/GoogleSmartLockController$3;-><init>(Lcom/shopkick/app/account/GoogleSmartLockController;)V

    .line 562
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    return-void
.end method

.method private saveCredentialCallback()V
    .locals 3

    .line 678
    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->CredentialsApi:Lcom/google/android/gms/auth/api/credentials/CredentialsApi;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->saveCredential:Lcom/google/android/gms/auth/api/credentials/Credential;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/auth/api/credentials/CredentialsApi;->save(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/auth/api/credentials/Credential;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/account/GoogleSmartLockController$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/account/GoogleSmartLockController$4;-><init>(Lcom/shopkick/app/account/GoogleSmartLockController;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    return-void
.end method

.method private turnOffBailOutTimer()V
    .locals 2

    .line 335
    sget-object v0, Lcom/shopkick/app/account/GoogleSmartLockController;->bailOutHandler:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->bailOutRunnable:Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;

    if-eqz v1, :cond_0

    .line 336
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 337
    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->bailOutRunnable:Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;

    :cond_0
    return-void
.end method

.method private turnOnBailOutTimer()V
    .locals 5

    .line 330
    new-instance v0, Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;

    iget v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;-><init>(Lcom/shopkick/app/account/GoogleSmartLockController;I)V

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->bailOutRunnable:Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;

    .line 331
    sget-object v0, Lcom/shopkick/app/account/GoogleSmartLockController;->bailOutHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->bailOutRunnable:Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x5

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public checkCredential(Landroid/app/Activity;)V
    .locals 3

    .line 454
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 456
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;->setPasswordLoginSupported(Z)Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;

    move-result-object v0

    const-string v1, "https://www.facebook.com"

    const-string v2, "https://accounts.google.com"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 457
    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;->setAccountTypes([Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;

    move-result-object v0

    .line 459
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;->build()Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequest:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    .line 461
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 462
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 465
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/auth/api/Auth;->CREDENTIALS_API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 466
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 467
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 468
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/16 v0, 0x232c

    .line 470
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 471
    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 472
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOnBailOutTimer()V

    .line 473
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public deleteCredential(Landroid/app/Activity;Lcom/shopkick/app/account/SKCredential;)V
    .locals 1

    .line 347
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 349
    invoke-direct {p0, p2}, Lcom/shopkick/app/account/GoogleSmartLockController;->getCredentialFromSKCredential(Lcom/shopkick/app/account/SKCredential;)Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->deleteCredential:Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 350
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->deleteCredential:Lcom/google/android/gms/auth/api/credentials/Credential;

    if-nez v0, :cond_0

    .line 351
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid SKCredential - "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 352
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialDeletedFailure(Ljava/lang/String;)V

    return-void

    .line 356
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz p2, :cond_1

    .line 357
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 360
    :cond_1
    new-instance p2, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->context:Landroid/content/Context;

    invoke-direct {p2, v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->CREDENTIALS_API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 361
    invoke-virtual {p2, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 362
    invoke-virtual {p2, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 363
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/16 p2, 0x232a

    .line 364
    iput p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 365
    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 366
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOnBailOutTimer()V

    .line 367
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public disableAutoSignInCredential(Landroid/app/Activity;)V
    .locals 2

    .line 411
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 413
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 414
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 417
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/auth/api/Auth;->CREDENTIALS_API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 418
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 419
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 420
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/16 v0, 0x232b

    .line 421
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 422
    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 423
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOnBailOutTimer()V

    .line 424
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 3

    const/16 p1, 0x8

    const/16 v0, 0x9

    const/4 v1, -0x1

    const/16 v2, 0x2328

    if-ne p2, v2, :cond_3

    if-ne p3, v1, :cond_1

    .line 207
    iget-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    if-eqz p2, :cond_0

    .line 208
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0x118

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 209
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->userId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setUserId(Ljava/lang/String;)V

    .line 210
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 212
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialSavedSuccess()V

    goto/16 :goto_1

    .line 217
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    if-eqz p1, :cond_2

    .line 218
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0x119

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 219
    iget-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->userId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setUserId(Ljava/lang/String;)V

    .line 220
    iget-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_2
    const-string p1, "User said NO to saving credentials."

    .line 223
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialSavedFailure(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const/16 v2, 0x2329

    if-ne p2, v2, :cond_9

    if-ne p3, v1, :cond_5

    .line 231
    iget-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    if-eqz p2, :cond_4

    .line 232
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p3, 0x11a

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 233
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_4
    const-string p1, "com.google.android.gms.credentials.Credential"

    .line 235
    invoke-virtual {p4, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 236
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialRetrievedSuccess(Lcom/google/android/gms/auth/api/credentials/Credential;)V

    goto :goto_1

    :cond_5
    if-nez p3, :cond_7

    if-eqz p4, :cond_6

    const-string p1, "Error when trying to retrieve credentials"

    .line 244
    sget-object p2, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->ERROR_RETRIEVING:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialRetrievedFailure(Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V

    goto :goto_0

    :cond_6
    const-string p1, "System (Google) dismissed dialog before any user input received"

    .line 247
    sget-object p2, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->SYSTEM_CANCELLED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialRetrievedFailure(Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V

    :goto_0
    return-void

    .line 251
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    if-eqz p1, :cond_8

    .line 252
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0x11b

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 253
    iget-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->skLogger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_8
    const-string p1, "User said NO to using retrieved credentials."

    .line 256
    sget-object p2, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->USER_DECLINED:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialRetrievedFailure(Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V

    :cond_9
    :goto_1
    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 5

    .line 151
    iget p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    const/4 v0, 0x0

    const/16 v1, 0x2328

    if-ne p1, v1, :cond_0

    .line 152
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 153
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOffBailOutTimer()V

    .line 154
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->saveCredentialCallback()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x2329

    if-ne p1, v1, :cond_1

    .line 156
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 157
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOffBailOutTimer()V

    .line 158
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->retrieveCredentialCallback()V

    goto :goto_0

    :cond_1
    const/16 v1, 0x232a

    if-ne p1, v1, :cond_2

    .line 160
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 161
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOffBailOutTimer()V

    .line 162
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->deleteCredentialCallback()V

    goto :goto_0

    :cond_2
    const/16 v1, 0x232b

    if-ne p1, v1, :cond_3

    .line 164
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 165
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOffBailOutTimer()V

    const/4 p1, 0x1

    .line 166
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->disableAutoSignInCredentialCallback(Z)V

    goto :goto_0

    :cond_3
    const/16 v1, 0x232c

    if-ne p1, v1, :cond_4

    .line 168
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 169
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOffBailOutTimer()V

    .line 170
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->checkCredentialCallback()V

    goto :goto_0

    .line 172
    :cond_4
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 173
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    .line 174
    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 175
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "Google Smart Lock connect succeeded but no request type available"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 177
    invoke-direct {p0, p1, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->disconnectAndNotify(Ljava/lang/String;Ljava/util/HashMap;)V

    :goto_0
    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method

.method public retrieveCredential(Landroid/app/Activity;)V
    .locals 3

    .line 536
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 538
    new-instance v0, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;->setPasswordLoginSupported(Z)Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;

    move-result-object v0

    const-string v1, "https://www.facebook.com"

    const-string v2, "https://accounts.google.com"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 539
    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;->setAccountTypes([Ljava/lang/String;)Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;

    move-result-object v0

    .line 541
    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/credentials/CredentialRequest$Builder;->build()Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequest:Lcom/google/android/gms/auth/api/credentials/CredentialRequest;

    .line 543
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 544
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 547
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/auth/api/Auth;->CREDENTIALS_API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 548
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 549
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 550
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/16 v0, 0x2329

    .line 552
    iput v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 553
    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 554
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOnBailOutTimer()V

    .line 555
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public saveCredential(Landroid/app/Activity;Ljava/lang/String;Lcom/shopkick/app/account/SKCredential;)V
    .locals 1

    .line 652
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 654
    invoke-direct {p0, p3}, Lcom/shopkick/app/account/GoogleSmartLockController;->getCredentialFromSKCredential(Lcom/shopkick/app/account/SKCredential;)Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->saveCredential:Lcom/google/android/gms/auth/api/credentials/Credential;

    .line 655
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->saveCredential:Lcom/google/android/gms/auth/api/credentials/Credential;

    if-nez v0, :cond_0

    .line 656
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Invalid SKCredential - "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 657
    invoke-direct {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->onCredentialSavedFailure(Ljava/lang/String;)V

    return-void

    .line 661
    :cond_0
    iget-object p3, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz p3, :cond_1

    .line 662
    invoke-virtual {p3}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 665
    :cond_1
    new-instance p3, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->context:Landroid/content/Context;

    invoke-direct {p3, v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->CREDENTIALS_API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {p3, v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p3

    .line 666
    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p3

    .line 667
    invoke-virtual {p3, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p3

    .line 668
    invoke-virtual {p3}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p3

    iput-object p3, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 670
    iput-object p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->userId:Ljava/lang/String;

    const/16 p2, 0x2328

    .line 671
    iput p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialRequestType:I

    .line 672
    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 673
    invoke-direct {p0}, Lcom/shopkick/app/account/GoogleSmartLockController;->turnOnBailOutTimer()V

    .line 674
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController;->mCredentialsApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

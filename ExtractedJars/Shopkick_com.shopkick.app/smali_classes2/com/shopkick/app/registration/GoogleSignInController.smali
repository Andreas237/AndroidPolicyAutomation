.class public Lcom/shopkick/app/registration/GoogleSignInController;
.super Ljava/lang/Object;
.source "GoogleSignInController.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;
    }
.end annotation


# static fields
.field private static final GOOGLE_CONSOLE_SHOPKICK_WEB_APP_ID:Ljava/lang/String; = "31007554452-77ofh79bpn2gt3c0hjl622go4fmbcott.apps.googleusercontent.com"


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

.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;",
            ">;"
        }
    .end annotation
.end field

.field private context:Landroid/content/Context;

.field private mConnectionProgressDialog:Landroid/app/ProgressDialog;

.field private mCredentialRequestType:I

.field private mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private mIsLoggingOut:Z

.field private mResolvingError:Z

.field private shouldShowToasts:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput-boolean v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mResolvingError:Z

    .line 40
    iput-boolean v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mIsLoggingOut:Z

    .line 41
    iput v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    const/4 v0, 0x1

    .line 45
    iput-boolean v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->shouldShowToasts:Z

    if-eqz p1, :cond_0

    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->context:Landroid/content/Context;

    return-void

    .line 60
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/shopkick/app/registration/GoogleSignInController;Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/GoogleSignInController;->handleSignInResult(Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;)V

    return-void
.end method

.method private disconnectAndNullify()V
    .locals 2

    const/4 v0, 0x0

    .line 202
    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 203
    iget-object v1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    .line 204
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    if-eqz v1, :cond_0

    .line 206
    check-cast v1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {v1, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 209
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_1

    .line 211
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    :cond_1
    return-void
.end method

.method private handleSignInResult(Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;)V
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 339
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;->isSuccess()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 358
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result p1

    const/16 v1, 0x30d5

    if-ne p1, v1, :cond_3

    .line 359
    sget-object p1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->CANCELED:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    invoke-direct {p0, p1, v0, v0}, Lcom/shopkick/app/registration/GoogleSignInController;->notifyCallback(Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 341
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;->getSignInAccount()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 343
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getIdToken()Ljava/lang/String;

    move-result-object v0

    .line 344
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getEmail()Ljava/lang/String;

    move-result-object v1

    .line 346
    iget-object v2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_2

    iget-boolean v3, p0, Lcom/shopkick/app/registration/GoogleSignInController;->shouldShowToasts:Z

    if-eqz v3, :cond_2

    .line 347
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    if-eqz v2, :cond_2

    .line 349
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getDisplayName()Ljava/lang/String;

    move-result-object p1

    const v3, 0x7f11032a

    const/4 v4, 0x1

    .line 350
    new-array v5, v4, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    .line 351
    invoke-virtual {v2, v3, v5}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 350
    invoke-static {v2, p1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    .line 352
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 355
    :cond_2
    sget-object p1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->SUCCESS:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    invoke-direct {p0, p1, v0, v1}, Lcom/shopkick/app/registration/GoogleSignInController;->notifyCallback(Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 362
    :cond_3
    :goto_1
    sget-object p1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->FAILURE:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    invoke-direct {p0, p1, v0, v0}, Lcom/shopkick/app/registration/GoogleSignInController;->notifyCallback(Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private notifyCallback(Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 175
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 176
    iput-object v1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    :cond_0
    const/4 v0, 0x0

    .line 179
    iput-boolean v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mResolvingError:Z

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->callbackRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 183
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;

    .line 186
    :cond_1
    invoke-direct {p0}, Lcom/shopkick/app/registration/GoogleSignInController;->disconnectAndNullify()V

    if-eqz v1, :cond_4

    .line 191
    sget-object v0, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->SUCCESS:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    if-ne p1, v0, :cond_2

    if-eqz p2, :cond_2

    .line 192
    invoke-interface {v1, p2, p3}, Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;->onGoogleSignInSuccess(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_2
    sget-object p2, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->CANCELED:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    if-ne p1, p2, :cond_3

    .line 194
    invoke-interface {v1}, Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;->onGoogleSignInCancel()V

    goto :goto_0

    .line 196
    :cond_3
    invoke-interface {v1}, Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;->onGoogleSignInFailure()V

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public abandonAuthorization()V
    .locals 2

    const/4 v0, 0x0

    .line 66
    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 67
    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 68
    iget-object v1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    if-eqz v1, :cond_0

    .line 69
    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 71
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    .line 72
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_1

    .line 73
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    :cond_1
    return-void
.end method

.method public authorize(Landroid/app/Activity;Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;Z)V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->callbackRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 83
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 85
    iput-boolean p3, p0, Lcom/shopkick/app/registration/GoogleSignInController;->shouldShowToasts:Z

    .line 87
    iget-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz p2, :cond_1

    .line 88
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 92
    :cond_1
    new-instance p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    sget-object p3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->DEFAULT_SIGN_IN:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {p2, p3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestEmail()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object p2

    const-string p3, "31007554452-77ofh79bpn2gt3c0hjl622go4fmbcott.apps.googleusercontent.com"

    .line 93
    invoke-virtual {p2, p3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestIdToken(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object p2

    .line 94
    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->build()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p2

    .line 95
    new-instance p3, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->context:Landroid/content/Context;

    invoke-direct {p3, v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->GOOGLE_SIGN_IN_API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {p3, v0, p2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 96
    invoke-virtual {p2, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 97
    invoke-virtual {p2, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 98
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/16 p2, 0x1f40

    .line 100
    iput p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    .line 101
    move-object p2, p1

    check-cast p2, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 102
    iget-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 104
    iget-boolean p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->shouldShowToasts:Z

    if-eqz p2, :cond_2

    .line 105
    new-instance p2, Landroid/app/ProgressDialog;

    invoke-direct {p2, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    .line 106
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    iget-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->context:Landroid/content/Context;

    const p3, 0x7f11032b

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    :cond_2
    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public authorizeSilentSignIn(Landroid/app/Activity;Lcom/shopkick/app/registration/IGoogleSignInControllerCallback;ZLjava/lang/String;)V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->callbackRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 117
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 118
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 120
    iput-boolean p3, p0, Lcom/shopkick/app/registration/GoogleSignInController;->shouldShowToasts:Z

    .line 122
    iget-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz p2, :cond_1

    .line 123
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 127
    :cond_1
    new-instance p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    sget-object p3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->DEFAULT_SIGN_IN:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {p2, p3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestEmail()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object p2

    const-string p3, "31007554452-77ofh79bpn2gt3c0hjl622go4fmbcott.apps.googleusercontent.com"

    .line 128
    invoke-virtual {p2, p3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->requestIdToken(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object p2

    .line 130
    invoke-virtual {p2, p4}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->setAccountName(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    move-result-object p2

    .line 131
    invoke-virtual {p2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->build()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p2

    .line 132
    new-instance p3, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object p4, p0, Lcom/shopkick/app/registration/GoogleSignInController;->context:Landroid/content/Context;

    invoke-direct {p3, p4}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object p4, Lcom/google/android/gms/auth/api/Auth;->GOOGLE_SIGN_IN_API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {p3, p4, p2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 133
    invoke-virtual {p2, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 134
    invoke-virtual {p2, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p2

    .line 135
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/16 p2, 0x1f41

    .line 137
    iput p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    .line 138
    move-object p2, p1

    check-cast p2, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p2, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 139
    iget-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p2}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 141
    iget-boolean p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->shouldShowToasts:Z

    if-eqz p2, :cond_2

    .line 142
    new-instance p2, Landroid/app/ProgressDialog;

    invoke-direct {p2, p1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    .line 143
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    iget-object p2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->context:Landroid/content/Context;

    const p3, 0x7f11032b

    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 144
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mConnectionProgressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->show()V

    :cond_2
    return-void

    :cond_3
    :goto_0
    return-void
.end method

.method public logout(Landroid/app/Activity;)V
    .locals 4

    if-nez p1, :cond_0

    .line 150
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 151
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    sget-object v2, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    const-string v2, "Tried to perform Google logout with null activity reference. Return early as Google logout failed."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_1

    .line 158
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 161
    :cond_1
    new-instance v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;

    sget-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->DEFAULT_SIGN_IN:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    invoke-direct {v0, v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions$Builder;->build()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v0

    .line 162
    new-instance v1, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->context:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v2, Lcom/google/android/gms/auth/api/Auth;->GOOGLE_SIGN_IN_API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 163
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 164
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 165
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/16 v0, 0x1f42

    .line 167
    iput v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    .line 168
    check-cast p1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    const/4 p1, 0x1

    .line 169
    iput-boolean p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mIsLoggingOut:Z

    .line 170
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 3

    const/16 p1, 0x1f43

    if-ne p2, p1, :cond_1

    const/4 p1, -0x1

    if-ne p3, p1, :cond_0

    .line 320
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result p1

    if-nez p1, :cond_3

    .line 321
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->reconnect()V

    goto :goto_0

    .line 324
    :cond_0
    sget-object p1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->FAILURE:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2, p2}, Lcom/shopkick/app/registration/GoogleSignInController;->notifyCallback(Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/16 p1, 0x1f40

    if-ne p2, p1, :cond_2

    .line 327
    sget-object p1, Lcom/google/android/gms/auth/api/Auth;->GoogleSignInApi:Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;

    invoke-interface {p1, p4}, Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;->getSignInResultFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;

    move-result-object p1

    .line 328
    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/GoogleSignInController;->handleSignInResult(Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;)V

    goto :goto_0

    .line 330
    :cond_2
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object p3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 331
    invoke-virtual {p3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide p3

    const-string v0, "GoogleSignIn onActivityRequest called unhandled request_code %d. No action to take here."

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 333
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v2

    .line 331
    invoke-virtual {p1, p3, p4, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 4

    .line 221
    iget p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    const/4 v0, 0x0

    const/16 v1, 0x1f42

    if-ne p1, v1, :cond_0

    .line 222
    iput v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    .line 223
    iget-boolean p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mIsLoggingOut:Z

    if-eqz p1, :cond_6

    .line 224
    iput-boolean v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mIsLoggingOut:Z

    .line 225
    sget-object p1, Lcom/google/android/gms/auth/api/Auth;->GoogleSignInApi:Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;

    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {p1, v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;->signOut(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1f40

    if-ne p1, v1, :cond_3

    .line 228
    iput v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    .line 229
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    if-nez p1, :cond_1

    return-void

    .line 233
    :cond_1
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-nez p1, :cond_2

    return-void

    .line 238
    :cond_2
    sget-object v0, Lcom/google/android/gms/auth/api/Auth;->GoogleSignInApi:Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;

    iget-object v2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;->getSignInIntent(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/content/Intent;

    move-result-object v0

    .line 239
    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_3
    const/16 v1, 0x1f41

    if-ne p1, v1, :cond_5

    .line 241
    iput v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    .line 242
    sget-object p1, Lcom/google/android/gms/auth/api/Auth;->GoogleSignInApi:Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;

    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 243
    invoke-interface {p1, v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;->silentSignIn(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/OptionalPendingResult;

    move-result-object p1

    .line 244
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/OptionalPendingResult;->isDone()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 246
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/OptionalPendingResult;->get()Lcom/google/android/gms/common/api/Result;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;

    .line 247
    invoke-direct {p0, p1}, Lcom/shopkick/app/registration/GoogleSignInController;->handleSignInResult(Lcom/google/android/gms/auth/api/signin/GoogleSignInResult;)V

    goto :goto_0

    .line 251
    :cond_4
    new-instance v0, Lcom/shopkick/app/registration/GoogleSignInController$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/registration/GoogleSignInController$1;-><init>(Lcom/shopkick/app/registration/GoogleSignInController;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/OptionalPendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_0

    .line 259
    :cond_5
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v1, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 260
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "GoogleSignIn onConnected called without mCredentialsRequestType set. No action to take here."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 277
    iget v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mCredentialRequestType:I

    const/4 v1, 0x0

    const/16 v2, 0x1f42

    if-ne v0, v2, :cond_0

    .line 278
    iget-boolean p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mIsLoggingOut:Z

    if-eqz p1, :cond_5

    .line 279
    iput-boolean v1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mIsLoggingOut:Z

    goto :goto_1

    :cond_0
    const/16 v2, 0x1f40

    if-eq v0, v2, :cond_2

    const/16 v2, 0x1f41

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 305
    :cond_1
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 306
    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v0, "GoogleSignIn onConnectionFailed called without mCredentialsRequestType set. No action to take here."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v2, v3, v0, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 283
    :cond_2
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mResolvingError:Z

    const/4 v1, 0x0

    if-nez v0, :cond_4

    .line 286
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->hasResolution()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 288
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/registration/GoogleSignInController;->activityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_5

    .line 290
    iput-boolean v2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mResolvingError:Z

    const/16 v1, 0x1f43

    .line 291
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/common/ConnectionResult;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 295
    :catch_0
    iget-object p1, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mGoogleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    goto :goto_1

    .line 298
    :cond_3
    iput-boolean v2, p0, Lcom/shopkick/app/registration/GoogleSignInController;->mResolvingError:Z

    .line 299
    sget-object p1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->FAILURE:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    invoke-direct {p0, p1, v1, v1}, Lcom/shopkick/app/registration/GoogleSignInController;->notifyCallback(Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 302
    :cond_4
    sget-object p1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->FAILURE:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    invoke-direct {p0, p1, v1, v1}, Lcom/shopkick/app/registration/GoogleSignInController;->notifyCallback(Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 1

    .line 268
    sget-object p1, Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;->FAILURE:Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v0}, Lcom/shopkick/app/registration/GoogleSignInController;->notifyCallback(Lcom/shopkick/app/registration/GoogleSignInController$GoogleSignInStatus;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

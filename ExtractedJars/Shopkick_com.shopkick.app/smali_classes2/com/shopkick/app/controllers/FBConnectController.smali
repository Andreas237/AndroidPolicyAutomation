.class public Lcom/shopkick/app/controllers/FBConnectController;
.super Ljava/lang/Object;
.source "FBConnectController.java"

# interfaces
.implements Lcom/shopkick/app/activities/IActivityResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;
    }
.end annotation


# static fields
.field private static final FACEBOOK_READ_PERMISSIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private activityRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/activities/BaseActivity;",
            ">;"
        }
    .end annotation
.end field

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field authenticating:Z

.field private callbackManager:Lcom/facebook/CallbackManager;

.field private callbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/controllers/IFBConnectControllerCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "public_profile"

    const-string v1, "email"

    .line 28
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/controllers/FBConnectController;->FACEBOOK_READ_PERMISSIONS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;)V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "App Activity Manager must not be null"

    .line 52
    invoke-static {v0, v1}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 53
    iput-object p1, p0, Lcom/shopkick/app/controllers/FBConnectController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 55
    invoke-static {}, Lcom/facebook/CallbackManager$Factory;->create()Lcom/facebook/CallbackManager;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/controllers/FBConnectController;->callbackManager:Lcom/facebook/CallbackManager;

    .line 56
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->callbackManager:Lcom/facebook/CallbackManager;

    new-instance v1, Lcom/shopkick/app/controllers/FBConnectController$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/controllers/FBConnectController$1;-><init>(Lcom/shopkick/app/controllers/FBConnectController;)V

    invoke-virtual {p1, v0, v1}, Lcom/facebook/login/LoginManager;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/controllers/FBConnectController;Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/controllers/FBConnectController;->handleCallback(Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;Ljava/lang/String;)V

    return-void
.end method

.method private clear()V
    .locals 2

    .line 145
    iget-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->cancelIgnoreAppBackground()V

    const/4 v0, 0x0

    .line 146
    iput-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 147
    iget-object v1, p0, Lcom/shopkick/app/controllers/FBConnectController;->activityRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/activities/BaseActivity;

    if-eqz v1, :cond_0

    .line 149
    invoke-virtual {v1, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 151
    :cond_0
    iput-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->activityRef:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    .line 152
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->authenticating:Z

    return-void
.end method

.method private handleCallback(Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;Ljava/lang/String;)V
    .locals 2

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->callbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/controllers/IFBConnectControllerCallback;

    if-eqz v0, :cond_2

    .line 133
    sget-object v1, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->SUCCESS:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    if-ne p1, v1, :cond_0

    if-eqz p2, :cond_0

    .line 134
    invoke-interface {v0, p2}, Lcom/shopkick/app/controllers/IFBConnectControllerCallback;->onFacebookConnectSuccess(Ljava/lang/String;)V

    goto :goto_0

    .line 135
    :cond_0
    sget-object p2, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->CANCELED:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    if-ne p1, p2, :cond_1

    .line 136
    invoke-interface {v0}, Lcom/shopkick/app/controllers/IFBConnectControllerCallback;->onFacebookConnectCancel()V

    goto :goto_0

    .line 138
    :cond_1
    invoke-interface {v0}, Lcom/shopkick/app/controllers/IFBConnectControllerCallback;->onFacebookConnectFailure()V

    .line 141
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/FBConnectController;->clear()V

    return-void
.end method

.method public static logout()V
    .locals 1

    .line 127
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/login/LoginManager;->logOut()V

    return-void
.end method


# virtual methods
.method public abandonAuthorization()V
    .locals 1

    .line 117
    iget-boolean v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->authenticating:Z

    if-nez v0, :cond_0

    return-void

    .line 120
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/controllers/FBConnectController;->clear()V

    return-void
.end method

.method public authorize(Landroid/app/Activity;Lcom/shopkick/app/controllers/IFBConnectControllerCallback;)V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Activity must not be null"

    .line 88
    invoke-static {v2, v3}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    if-eqz p2, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    const-string v3, "Callback must not be null"

    .line 89
    invoke-static {v2, v3}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    if-nez p1, :cond_2

    .line 92
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "activity is null when trying to login with facebook"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    if-nez p2, :cond_3

    .line 94
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v2

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    const-string v5, "callback is null when trying to login with facebook"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4, v5, v1}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 98
    :cond_3
    :goto_2
    iget-boolean v1, p0, Lcom/shopkick/app/controllers/FBConnectController;->authenticating:Z

    if-nez v1, :cond_5

    if-eqz p1, :cond_5

    if-nez p2, :cond_4

    goto :goto_3

    .line 102
    :cond_4
    iput-boolean v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->authenticating:Z

    .line 104
    new-instance v0, Ljava/lang/ref/WeakReference;

    move-object v1, p1

    check-cast v1, Lcom/shopkick/app/activities/BaseActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->activityRef:Ljava/lang/ref/WeakReference;

    .line 105
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController;->callbackRef:Ljava/lang/ref/WeakReference;

    .line 107
    invoke-virtual {v1, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 108
    iget-object p2, p0, Lcom/shopkick/app/controllers/FBConnectController;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {p2}, Lcom/shopkick/app/application/AppActivityManager;->ignoreAppBackground()V

    .line 110
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object p2

    sget-object v0, Lcom/shopkick/app/controllers/FBConnectController;->FACEBOOK_READ_PERMISSIONS:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    return-void

    :cond_5
    :goto_3
    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 0

    .line 158
    iget-object p1, p0, Lcom/shopkick/app/controllers/FBConnectController;->callbackManager:Lcom/facebook/CallbackManager;

    invoke-interface {p1, p2, p3, p4}, Lcom/facebook/CallbackManager;->onActivityResult(IILandroid/content/Intent;)Z

    return-void
.end method

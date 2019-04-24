.class Lcom/twitter/sdk/android/core/identity/ShareEmailClient;
.super Lcom/twitter/sdk/android/core/TwitterApiClient;
.source "ShareEmailClient.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/twitter/sdk/android/core/identity/ShareEmailClient$EmailService;
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/TwitterSession;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/twitter/sdk/android/core/TwitterApiClient;-><init>(Lcom/twitter/sdk/android/core/Session;)V

    return-void
.end method


# virtual methods
.method protected getEmail(Lcom/twitter/sdk/android/core/Callback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Callback<",
            "Lcom/twitter/sdk/android/core/models/User;",
            ">;)V"
        }
    .end annotation

    .line 49
    const-class v0, Lcom/twitter/sdk/android/core/identity/ShareEmailClient$EmailService;

    invoke-virtual {p0, v0}, Lcom/twitter/sdk/android/core/identity/ShareEmailClient;->getService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/twitter/sdk/android/core/identity/ShareEmailClient$EmailService;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v2, v1, p1}, Lcom/twitter/sdk/android/core/identity/ShareEmailClient$EmailService;->verifyCredentials(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/twitter/sdk/android/core/Callback;)V

    return-void
.end method

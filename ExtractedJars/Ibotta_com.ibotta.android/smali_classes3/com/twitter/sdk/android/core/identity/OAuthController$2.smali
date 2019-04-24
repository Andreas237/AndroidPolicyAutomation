.class Lcom/twitter/sdk/android/core/identity/OAuthController$2;
.super Lcom/twitter/sdk/android/core/Callback;
.source "OAuthController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/twitter/sdk/android/core/identity/OAuthController;->newRequestAccessTokenCallback()Lcom/twitter/sdk/android/core/Callback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/twitter/sdk/android/core/Callback<",
        "Lcom/twitter/sdk/android/core/internal/oauth/OAuthResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/twitter/sdk/android/core/identity/OAuthController;


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/identity/OAuthController;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/twitter/sdk/android/core/identity/OAuthController$2;->this$0:Lcom/twitter/sdk/android/core/identity/OAuthController;

    invoke-direct {p0}, Lcom/twitter/sdk/android/core/Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public failure(Lcom/twitter/sdk/android/core/TwitterException;)V
    .locals 3

    .line 164
    invoke-static {}, Lio/fabric/sdk/android/Fabric;->getLogger()Lio/fabric/sdk/android/Logger;

    move-result-object v0

    const-string v1, "Twitter"

    const-string v2, "Failed to get access token"

    invoke-interface {v0, v1, v2, p1}, Lio/fabric/sdk/android/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 167
    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/OAuthController$2;->this$0:Lcom/twitter/sdk/android/core/identity/OAuthController;

    new-instance v0, Lcom/twitter/sdk/android/core/TwitterAuthException;

    const-string v1, "Failed to get access token"

    invoke-direct {v0, v1}, Lcom/twitter/sdk/android/core/TwitterAuthException;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Lcom/twitter/sdk/android/core/identity/OAuthController;->handleAuthError(ILcom/twitter/sdk/android/core/TwitterAuthException;)V

    return-void
.end method

.method public success(Lcom/twitter/sdk/android/core/Result;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/twitter/sdk/android/core/Result<",
            "Lcom/twitter/sdk/android/core/internal/oauth/OAuthResponse;",
            ">;)V"
        }
    .end annotation

    .line 152
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 153
    iget-object p1, p1, Lcom/twitter/sdk/android/core/Result;->data:Ljava/lang/Object;

    check-cast p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuthResponse;

    const-string v1, "screen_name"

    .line 154
    iget-object v2, p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuthResponse;->userName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "user_id"

    .line 155
    iget-wide v2, p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuthResponse;->userId:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string v1, "tk"

    .line 156
    iget-object v2, p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuthResponse;->authToken:Lcom/twitter/sdk/android/core/TwitterAuthToken;

    iget-object v2, v2, Lcom/twitter/sdk/android/core/TwitterAuthToken;->token:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "ts"

    .line 157
    iget-object p1, p1, Lcom/twitter/sdk/android/core/internal/oauth/OAuthResponse;->authToken:Lcom/twitter/sdk/android/core/TwitterAuthToken;

    iget-object p1, p1, Lcom/twitter/sdk/android/core/TwitterAuthToken;->secret:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    iget-object p1, p0, Lcom/twitter/sdk/android/core/identity/OAuthController$2;->this$0:Lcom/twitter/sdk/android/core/identity/OAuthController;

    iget-object p1, p1, Lcom/twitter/sdk/android/core/identity/OAuthController;->listener:Lcom/twitter/sdk/android/core/identity/OAuthController$Listener;

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lcom/twitter/sdk/android/core/identity/OAuthController$Listener;->onComplete(ILandroid/content/Intent;)V

    return-void
.end method

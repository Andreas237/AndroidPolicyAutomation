.class Lcom/shopkick/app/controllers/FBConnectController$1;
.super Ljava/lang/Object;
.source "FBConnectController.java"

# interfaces
.implements Lcom/facebook/FacebookCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/controllers/FBConnectController;-><init>(Lcom/shopkick/app/application/AppActivityManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/FacebookCallback<",
        "Lcom/facebook/login/LoginResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/controllers/FBConnectController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/controllers/FBConnectController;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/shopkick/app/controllers/FBConnectController$1;->this$0:Lcom/shopkick/app/controllers/FBConnectController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 3

    .line 69
    iget-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController$1;->this$0:Lcom/shopkick/app/controllers/FBConnectController;

    sget-object v1, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->CANCELED:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/controllers/FBConnectController;->access$000(Lcom/shopkick/app/controllers/FBConnectController;Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;Ljava/lang/String;)V

    return-void
.end method

.method public onError(Lcom/facebook/FacebookException;)V
    .locals 2

    .line 74
    iget-object p1, p0, Lcom/shopkick/app/controllers/FBConnectController$1;->this$0:Lcom/shopkick/app/controllers/FBConnectController;

    sget-object v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->FAILURE:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/shopkick/app/controllers/FBConnectController;->access$000(Lcom/shopkick/app/controllers/FBConnectController;Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;Ljava/lang/String;)V

    return-void
.end method

.method public onSuccess(Lcom/facebook/login/LoginResult;)V
    .locals 2

    .line 59
    invoke-virtual {p1}, Lcom/facebook/login/LoginResult;->getAccessToken()Lcom/facebook/AccessToken;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 61
    iget-object v0, p0, Lcom/shopkick/app/controllers/FBConnectController$1;->this$0:Lcom/shopkick/app/controllers/FBConnectController;

    sget-object v1, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->SUCCESS:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    invoke-virtual {p1}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/controllers/FBConnectController;->access$000(Lcom/shopkick/app/controllers/FBConnectController;Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/controllers/FBConnectController$1;->this$0:Lcom/shopkick/app/controllers/FBConnectController;

    sget-object v0, Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;->FAILURE:Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lcom/shopkick/app/controllers/FBConnectController;->access$000(Lcom/shopkick/app/controllers/FBConnectController;Lcom/shopkick/app/controllers/FBConnectController$FBConnectStatus;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 56
    check-cast p1, Lcom/facebook/login/LoginResult;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/controllers/FBConnectController$1;->onSuccess(Lcom/facebook/login/LoginResult;)V

    return-void
.end method

.class Lcom/ibotta/android/social/facebook/FacebookManager$5;
.super Ljava/lang/Object;
.source "FacebookManager.java"

# interfaces
.implements Lcom/facebook/FacebookCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/social/facebook/FacebookManager;->authFacebook()V
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
.field final synthetic this$0:Lcom/ibotta/android/social/facebook/FacebookManager;


# direct methods
.method constructor <init>(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 380
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager$5;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 1

    .line 388
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager$5;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-static {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->access$1000(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    return-void
.end method

.method public onError(Lcom/facebook/FacebookException;)V
    .locals 1

    .line 393
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager$5;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->onFacebookAuthFail(Ljava/lang/Exception;)V

    return-void
.end method

.method public onSuccess(Lcom/facebook/login/LoginResult;)V
    .locals 0

    .line 383
    iget-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager$5;->this$0:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->onFacebookAuthSuccess()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 380
    check-cast p1, Lcom/facebook/login/LoginResult;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/social/facebook/FacebookManager$5;->onSuccess(Lcom/facebook/login/LoginResult;)V

    return-void
.end method

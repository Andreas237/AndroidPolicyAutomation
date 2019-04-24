.class Lcom/shopkick/app/account/GoogleSmartLockController$2;
.super Ljava/lang/Object;
.source "GoogleSmartLockController.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/account/GoogleSmartLockController;->checkCredentialCallback()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/account/GoogleSmartLockController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/GoogleSmartLockController;)V
    .locals 0

    .line 480
    iput-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController$2;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;)V
    .locals 2

    .line 483
    invoke-interface {p1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    .line 484
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 491
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController$2;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-static {p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$700(Lcom/shopkick/app/account/GoogleSmartLockController;)V

    goto :goto_0

    .line 495
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 499
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController$2;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-static {p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$700(Lcom/shopkick/app/account/GoogleSmartLockController;)V

    goto :goto_0

    .line 505
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 506
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController$2;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-static {v0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$400(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 480
    check-cast p1, Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController$2;->onResult(Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;)V

    return-void
.end method

.class Lcom/shopkick/app/account/GoogleSmartLockController$3;
.super Ljava/lang/Object;
.source "GoogleSmartLockController.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/account/GoogleSmartLockController;->retrieveCredentialCallback()V
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

    .line 562
    iput-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController$3;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;)V
    .locals 5

    .line 565
    invoke-interface {p1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    .line 566
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 573
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 574
    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    sget-object v3, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v3}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v3

    or-long/2addr v1, v3

    const-string v3, "Google Smart Lock retrieveCredential is auto signing in."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 576
    invoke-interface {p1}, Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;->getCredential()Lcom/google/android/gms/auth/api/credentials/Credential;

    move-result-object p1

    .line 577
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController$3;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-static {v0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$800(Lcom/shopkick/app/account/GoogleSmartLockController;Lcom/google/android/gms/auth/api/credentials/Credential;)V

    goto :goto_0

    .line 581
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result p1

    const/4 v1, 0x6

    if-ne p1, v1, :cond_1

    .line 586
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/account/GoogleSmartLockController$3;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    invoke-static {p1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$900(Lcom/shopkick/app/account/GoogleSmartLockController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    const/16 v1, 0x2329

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/common/api/Status;->startResolutionForResult(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 591
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not resolve result for status "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 593
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 594
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController$3;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    sget-object v1, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    invoke-static {v0, p1, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$100(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V

    goto :goto_0

    .line 602
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusCode()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->getStatusMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 603
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController$3;->this$0:Lcom/shopkick/app/account/GoogleSmartLockController;

    sget-object v1, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->NO_CREDENTIAL:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    invoke-static {v0, p1, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$100(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 562
    check-cast p1, Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/account/GoogleSmartLockController$3;->onResult(Lcom/google/android/gms/auth/api/credentials/CredentialRequestResult;)V

    return-void
.end method

.class Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;
.super Ljava/lang/Object;
.source "GoogleSmartLockController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/GoogleSmartLockController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "BailOutRunnable"
.end annotation


# instance fields
.field googleSmartLockControllerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/account/GoogleSmartLockController;",
            ">;"
        }
    .end annotation
.end field

.field mCredentialRequestType:I


# direct methods
.method constructor <init>(Lcom/shopkick/app/account/GoogleSmartLockController;I)V
    .locals 1

    .line 294
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 295
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;->googleSmartLockControllerWeakReference:Ljava/lang/ref/WeakReference;

    .line 297
    iput p2, p0, Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;->mCredentialRequestType:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 302
    iget-object v0, p0, Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;->googleSmartLockControllerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/account/GoogleSmartLockController;

    if-eqz v0, :cond_5

    const-string v1, "Bail out timer triggered"

    .line 305
    iget v2, p0, Lcom/shopkick/app/account/GoogleSmartLockController$BailOutRunnable;->mCredentialRequestType:I

    const/16 v3, 0x2328

    if-ne v2, v3, :cond_0

    .line 306
    invoke-static {v0, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$000(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/16 v3, 0x2329

    if-ne v2, v3, :cond_1

    .line 308
    sget-object v2, Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;->CONNECTION_TIMED_OUT:Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$100(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;Lcom/shopkick/app/account/GoogleSmartLockController$GoogleSmartLockRetrieveCredentialFailureReason;)V

    goto :goto_0

    :cond_1
    const/16 v3, 0x232a

    if-ne v2, v3, :cond_2

    .line 311
    invoke-static {v0, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$200(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/16 v3, 0x232b

    if-ne v2, v3, :cond_3

    .line 313
    invoke-static {v0, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$300(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const/16 v3, 0x232c

    if-ne v2, v3, :cond_4

    .line 315
    invoke-static {v0, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$400(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;)V

    goto :goto_0

    .line 317
    :cond_4
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 318
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v2, Lcom/shopkick/logging/Area;->USER_ACCOUNT:Lcom/shopkick/logging/Area;

    .line 319
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    sget-object v4, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    or-long/2addr v2, v4

    const-string v4, "Google Smart Lock connect failed but no request type available"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 322
    invoke-static {v0, v1, v1}, Lcom/shopkick/app/account/GoogleSmartLockController;->access$500(Lcom/shopkick/app/account/GoogleSmartLockController;Ljava/lang/String;Ljava/util/HashMap;)V

    :cond_5
    :goto_0
    return-void
.end method

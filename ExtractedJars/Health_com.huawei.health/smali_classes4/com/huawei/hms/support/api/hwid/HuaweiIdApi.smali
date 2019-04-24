.class public interface abstract Lcom/huawei/hms/support/api/hwid/HuaweiIdApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getSignInResultFromIntent(Landroid/content/Intent;)Lcom/huawei/hms/support/api/hwid/SignInResult;
.end method

.method public abstract signIn(Landroid/app/Activity;Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/app/Activity;Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/hwid/SignInResult;>;"
        }
    .end annotation
.end method

.method public abstract signInBackend(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/hwid/SignInResult;>;"
        }
    .end annotation
.end method

.method public abstract signOut(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/api/HuaweiApiClient;)Lcom/huawei/hms/support/api/client/PendingResult<Lcom/huawei/hms/support/api/hwid/SignOutResult;>;"
        }
    .end annotation
.end method

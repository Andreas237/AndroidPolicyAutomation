.class public Lcom/huawei/hms/support/api/ResolvePendingResult;
.super Lcom/huawei/hms/support/api/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::Lcom/huawei/hms/core/aidl/IMessageEntity;>Lcom/huawei/hms/support/api/c<Lcom/huawei/hms/support/api/ResolveResult<TT;>;TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class<TT;>;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hms/support/api/c;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)V

    .line 21
    return-void
.end method

.method public static build(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)Lcom/huawei/hms/support/api/ResolvePendingResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::Lcom/huawei/hms/core/aidl/IMessageEntity;>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class<TR;>;)Lcom/huawei/hms/support/api/ResolvePendingResult<TR;>;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/huawei/hms/support/api/ResolvePendingResult;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/huawei/hms/support/api/ResolvePendingResult;-><init>(Lcom/huawei/hms/support/api/client/ApiClient;Ljava/lang/String;Lcom/huawei/hms/core/aidl/IMessageEntity;Ljava/lang/Class;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/huawei/hms/core/aidl/IMessageEntity;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 57
    invoke-virtual {p0}, Lcom/huawei/hms/support/api/ResolvePendingResult;->await()Lcom/huawei/hms/support/api/client/Result;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/hms/support/api/ResolveResult;

    .line 58
    invoke-virtual {v1}, Lcom/huawei/hms/support/api/ResolveResult;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hms/core/aidl/IMessageEntity;

    return-object v0
.end method

.method public onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/ResolveResult;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Lcom/huawei/hms/support/api/ResolveResult<TT;>;"
        }
    .end annotation

    .line 47
    new-instance v2, Lcom/huawei/hms/support/api/ResolveResult;

    invoke-direct {v2, p1}, Lcom/huawei/hms/support/api/ResolveResult;-><init>(Ljava/lang/Object;)V

    .line 48
    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/hms/support/api/client/Status;-><init>(I)V

    invoke-virtual {v2, v0}, Lcom/huawei/hms/support/api/ResolveResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 49
    return-object v2
.end method

.method public bridge synthetic onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/client/Result;
    .locals 1

    .line 17
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/api/ResolvePendingResult;->onComplete(Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/support/api/ResolveResult;

    move-result-object v0

    return-object v0
.end method

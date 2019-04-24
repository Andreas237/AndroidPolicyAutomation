.class public Lcom/huawei/hwid/usecase/InitDataUseCase;
.super Lcom/huawei/hwid/UseCase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/usecase/InitDataUseCase$RequestValues;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwid/UseCase<Lcom/huawei/hwid/usecase/InitDataUseCase$RequestValues;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/huawei/hwid/usecase/InitDataUseCase;->a:Landroid/content/Context;

    .line 28
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/hwid/usecase/InitDataUseCase$RequestValues;)V
    .locals 5

    .line 32
    iget-object v0, p0, Lcom/huawei/hwid/usecase/InitDataUseCase;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwid/usecase/InitDataUseCase;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/o;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    iget-object v0, p0, Lcom/huawei/hwid/usecase/InitDataUseCase;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/accounts/AccountManager;->get(Landroid/content/Context;)Landroid/accounts/AccountManager;

    move-result-object v3

    .line 34
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v3, v0}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v4

    .line 35
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    array-length v0, v4

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 36
    :cond_0
    const-string v0, "initDataUseCase"

    const-string v1, "apk has no account, clear all sdk accounts"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/huawei/hwid/usecase/InitDataUseCase;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/usecase/InitDataUseCase;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hwid/usecase/InitDataUseCase;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwid/b/b;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 40
    :cond_1
    return-void
.end method

.method public synthetic b(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .locals 1

    .line 20
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwid/usecase/InitDataUseCase$RequestValues;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/usecase/InitDataUseCase;->a(Lcom/huawei/hwid/usecase/InitDataUseCase$RequestValues;)V

    return-void
.end method

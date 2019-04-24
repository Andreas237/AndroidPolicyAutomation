.class public Lcom/huawei/hwid/usecase/ReadHwAccountUseCase;
.super Lcom/huawei/hwid/UseCase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwid/UseCase<Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;>;"
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
    iput-object p1, p0, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase;->a:Landroid/content/Context;

    .line 28
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;)V
    .locals 5

    .line 32
    const-string v0, "ReadHwAccountUseCase"

    const-string v1, "readHwAccount"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    const-string v0, "accounts.xml"

    iget-object v1, p0, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase;->a:Landroid/content/Context;

    iget-boolean v2, p1, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;->a:Z

    invoke-static {v0, v1, v2}, Lcom/huawei/hwid/b/a/b;->a(Ljava/lang/String;Landroid/content/Context;Z)Ljava/util/ArrayList;

    move-result-object v3

    .line 34
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 35
    const-string v0, "account"

    invoke-virtual {v4, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 36
    invoke-virtual {p0}, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase;->b()Lcom/huawei/hwid/UseCase$a;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/huawei/hwid/UseCase$a;->a(Landroid/os/Bundle;)V

    .line 37
    return-void
.end method

.method public synthetic b(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .locals 1

    .line 20
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/usecase/ReadHwAccountUseCase;->a(Lcom/huawei/hwid/usecase/ReadHwAccountUseCase$RequestValues;)V

    return-void
.end method

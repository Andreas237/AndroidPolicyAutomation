.class public Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;
.super Lcom/huawei/hwid/UseCase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwid/UseCase<Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/HwAccount;>;"
        }
    .end annotation
.end field

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Lcom/huawei/hwid/core/datatype/HwAccount;>;Z)V"
        }
    .end annotation

    .line 30
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->a:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->b:Ljava/util/ArrayList;

    .line 33
    iput-boolean p3, p0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->c:Z

    .line 34
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;)V
    .locals 5

    .line 38
    const-string v0, "WriteHwAccountUseCase"

    const-string v1, "writeHwAccount"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;->a(Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/o;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->a:Landroid/content/Context;

    const-string v1, "accounts.xml"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 42
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->a:Landroid/content/Context;

    const-string v1, "accounts.xml"

    iget-object v2, p0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->b:Ljava/util/ArrayList;

    iget-boolean v3, p0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->c:Z

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/b/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    goto :goto_0

    .line 43
    :catch_0
    move-exception v4

    .line 44
    const-string v0, "WriteHwAccountUseCase"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    :goto_0
    return-void
.end method

.method public synthetic b(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .locals 1

    .line 22
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/usecase/WriteHwAccountUseCase;->a(Lcom/huawei/hwid/usecase/WriteHwAccountUseCase$RequestValues;)V

    return-void
.end method

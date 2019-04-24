.class public Lcom/huawei/hwid/usecase/GetUserInfoUseCase;
.super Lcom/huawei/hwid/UseCase;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;,
        Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwid/UseCase<Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;>;"
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/hwid/core/datatype/HwAccount;

.field private c:Lcom/huawei/cloudservice/CloudRequestHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a:Landroid/content/Context;

    .line 33
    iput-object p2, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 34
    iput-object p3, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    .line 35
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->e()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;)Lcom/huawei/cloudservice/CloudRequestHandler;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    return-object v0
.end method

.method private d()V
    .locals 8

    .line 57
    new-instance v0, Lcom/huawei/hwid/core/b/a/a/d;

    iget-object v1, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v3}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->e()I

    move-result v4

    iget-object v5, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v5}, Lcom/huawei/hwid/core/datatype/HwAccount;->i()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v6}, Lcom/huawei/hwid/core/datatype/HwAccount;->k()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/hwid/core/b/a/a/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    move-object v7, v0

    .line 58
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;-><init>(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;Lcom/huawei/hwid/usecase/GetUserInfoUseCase$1;)V

    invoke-virtual {v7, v0, v7, v1, v2}, Lcom/huawei/hwid/core/b/a/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 59
    return-void
.end method

.method private e()V
    .locals 5

    .line 65
    new-instance v4, Lcom/huawei/hwid/core/b/a/a/a;

    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a()Lcom/huawei/hwid/UseCase$RequestValues;

    move-result-object v2

    check-cast v2, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;

    invoke-static {v2}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;->a(Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/huawei/hwid/core/b/a/a/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 66
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->c:Lcom/huawei/cloudservice/CloudRequestHandler;

    invoke-virtual {v4, v0, v4, v1, v2}, Lcom/huawei/hwid/core/b/a/a;->a(Landroid/content/Context;Lcom/huawei/hwid/core/b/a/a;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 67
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;)V
    .locals 3

    .line 39
    const-string v0, "GetUserInfoUseCase"

    const-string v1, "GetUserInfoUseCase"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 41
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b:Lcom/huawei/hwid/core/datatype/HwAccount;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwid/c/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 42
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const-string v0, "GetUserInfoUseCase"

    const-string v1, "memery has no cookie,need stauth"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->d()V

    goto :goto_0

    .line 46
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->e()V

    .line 48
    :goto_0
    goto :goto_1

    .line 49
    :cond_1
    const-string v0, "GetUserInfoUseCase"

    const-string v1, "mHwAccount is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    :goto_1
    return-void
.end method

.method public synthetic b(Lcom/huawei/hwid/UseCase$RequestValues;)V
    .locals 1

    .line 23
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a(Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;)V

    return-void
.end method

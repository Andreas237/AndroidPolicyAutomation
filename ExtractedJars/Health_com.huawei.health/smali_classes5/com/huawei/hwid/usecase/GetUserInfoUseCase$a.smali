.class Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/cloudservice/CloudRequestHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/usecase/GetUserInfoUseCase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/usecase/GetUserInfoUseCase;


# direct methods
.method private constructor <init>(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;->a:Lcom/huawei/hwid/usecase/GetUserInfoUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;Lcom/huawei/hwid/usecase/GetUserInfoUseCase$1;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;-><init>(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;)V

    return-void
.end method


# virtual methods
.method public onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V
    .locals 4

    .line 78
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 79
    const-string v0, "GetUserInfoUseCase"

    const-string v1, "sterror.code "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v0

    const v1, 0x42c2560

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->getErrorCode()I

    move-result v0

    const v1, 0x42c255f

    if-ne v0, v1, :cond_1

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;->a:Lcom/huawei/hwid/usecase/GetUserInfoUseCase;

    invoke-static {v0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;)Lcom/huawei/cloudservice/CloudRequestHandler;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    const-string v2, "token invalid"

    const/16 v3, 0x1003

    invoke-direct {v1, v3, v2}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    goto :goto_0

    .line 83
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;->a:Lcom/huawei/hwid/usecase/GetUserInfoUseCase;

    invoke-static {v0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->b(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;)Lcom/huawei/cloudservice/CloudRequestHandler;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 86
    :cond_2
    :goto_0
    return-void
.end method

.method public onFinish(Landroid/os/Bundle;)V
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$a;->a:Lcom/huawei/hwid/usecase/GetUserInfoUseCase;

    invoke-static {v0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;->a(Lcom/huawei/hwid/usecase/GetUserInfoUseCase;)V

    .line 74
    return-void
.end method

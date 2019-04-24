.class Lcom/huawei/health/MainActivity$23$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/login/ui/login/util/ILoginCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity$23;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/MainActivity$23;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity$23;)V
    .locals 0

    .line 1023
    iput-object p1, p0, Lcom/huawei/health/MainActivity$23$5;->c:Lcom/huawei/health/MainActivity$23;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoginFailed(Ljava/lang/Object;)V
    .locals 6

    .line 1033
    move-object v4, p1

    check-cast v4, Lcom/huawei/login/ui/login/util/LoginResult;

    .line 1034
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAuthRelogin loginResult = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1035
    invoke-virtual {v4}, Lcom/huawei/login/ui/login/util/LoginResult;->getErrorCode()I

    move-result v5

    .line 1036
    const/16 v0, 0xbba

    if-ne v0, v5, :cond_0

    .line 1037
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->d(Z)Z

    .line 1039
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAuthRelogin errcode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1040
    iget-object v0, p0, Lcom/huawei/health/MainActivity$23$5;->c:Lcom/huawei/health/MainActivity$23;

    iget-object v0, v0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;)Lo/ale;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/ale;->e(I)V

    .line 1041
    return-void
.end method

.method public onLoginSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 1027
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkAuthRelogin(),onLoginSuccess."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1028
    return-void
.end method

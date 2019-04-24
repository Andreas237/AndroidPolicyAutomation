.class Lcom/huawei/health/MainActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 2124
    iput-object p1, p0, Lcom/huawei/health/MainActivity$8;->d:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 5

    .line 2127
    iget-object v0, p0, Lcom/huawei/health/MainActivity$8;->d:Lcom/huawei/health/MainActivity;

    iget-object v4, v0, Lcom/huawei/health/MainActivity;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 2128
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 2129
    iget-object v0, p0, Lcom/huawei/health/MainActivity$8;->d:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->signIn(Landroid/content/Context;)Ljava/lang/String;

    .line 2131
    :cond_0
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp aToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2132
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 2136
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp onConnectionSuspended"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2137
    iget-object v0, p0, Lcom/huawei/health/MainActivity$8;->d:Lcom/huawei/health/MainActivity;

    const-string v1, ""

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/huawei/health/MainActivity;->e(Lcom/huawei/health/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 2138
    return-void
.end method

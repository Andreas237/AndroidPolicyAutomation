.class Lo/cwe$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cwe;


# direct methods
.method constructor <init>(Lo/cwe;)V
    .locals 0

    .line 2171
    iput-object p1, p0, Lo/cwe$3;->d:Lo/cwe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 5

    .line 2174
    iget-object v0, p0, Lo/cwe$3;->d:Lo/cwe;

    iget-object v4, v0, Lo/cwe;->b:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 2175
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 2176
    iget-object v0, p0, Lo/cwe$3;->d:Lo/cwe;

    invoke-static {v0}, Lo/cwe;->k(Lo/cwe;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->signIn(Landroid/content/Context;)Ljava/lang/String;

    .line 2178
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp aToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2179
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 2183
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp onConnectionSuspended"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2184
    return-void
.end method

.class Lo/cwe$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cwe;


# direct methods
.method constructor <init>(Lo/cwe;)V
    .locals 0

    .line 1261
    iput-object p1, p0, Lo/cwe$10;->e:Lo/cwe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 4

    .line 1283
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OpenSDK IExecuteResult onServiceException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1284
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 1264
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get today steps success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1265
    if-nez p1, :cond_0

    .line 1266
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get today steps success but boj==null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1267
    return-void

    .line 1269
    :cond_0
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 1270
    iget-object v0, p0, Lo/cwe$10;->e:Lo/cwe;

    move-object v1, p1

    check-cast v1, Landroid/os/Bundle;

    const-string v2, "step"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/cwe;->b(Lo/cwe;I)I

    .line 1271
    iget-object v0, p0, Lo/cwe$10;->e:Lo/cwe;

    move-object v1, p1

    check-cast v1, Landroid/os/Bundle;

    const-string v2, "carior"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/cwe;->d(Lo/cwe;I)I

    .line 1272
    iget-object v0, p0, Lo/cwe$10;->e:Lo/cwe;

    move-object v1, p1

    check-cast v1, Landroid/os/Bundle;

    const-string v2, "distance"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/cwe;->e(Lo/cwe;I)I

    .line 1274
    :cond_1
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 1278
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OpenSDK IExecuteResult onFailed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1279
    return-void
.end method

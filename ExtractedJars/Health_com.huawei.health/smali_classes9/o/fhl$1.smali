.class Lo/fhl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhl;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

.field final synthetic d:Lo/fhl;


# direct methods
.method constructor <init>(Lo/fhl;Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;Landroid/content/Context;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/fhl$1;->d:Lo/fhl;

    iput-object p2, p0, Lo/fhl$1;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iput-object p3, p0, Lo/fhl$1;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnected()V
    .locals 4

    .line 44
    iget-object v0, p0, Lo/fhl$1;->c:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v1, p0, Lo/fhl$1;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->signIn(Landroid/content/Context;)Ljava/lang/String;

    .line 45
    const-string v0, "CancelAuthInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp aToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 4

    .line 50
    const-string v0, "CancelAuthInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp onConnectionSuspended"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return-void
.end method

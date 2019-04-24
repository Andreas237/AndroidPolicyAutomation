.class Lo/aks$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aks;


# direct methods
.method constructor <init>(Lo/aks;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/aks$5;->a:Lo/aks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 47
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse notified"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    iget-object v0, p0, Lo/aks$5;->a:Lo/aks;

    iget-object v1, p0, Lo/aks$5;->a:Lo/aks;

    invoke-static {v1}, Lo/aks;->c(Lo/aks;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aks;->a(Lo/aks;Ljava/util/List;)V

    .line 49
    const-string v0, "HWhealthLinkage_WearSDK"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "after mRegisterBinderListenerCallbackList notified"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lo/aks$5;->a:Lo/aks;

    iget-object v1, p0, Lo/aks$5;->a:Lo/aks;

    invoke-static {v1}, Lo/aks;->b(Lo/aks;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aks;->a(Lo/aks;Ljava/util/List;)V

    .line 51
    return-void
.end method

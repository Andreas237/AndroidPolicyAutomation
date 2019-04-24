.class Lo/akt$9$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/akt$9;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/akt$9;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/akt$9;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 750
    iput-object p1, p0, Lo/akt$9$4;->a:Lo/akt$9;

    iput-object p2, p0, Lo/akt$9$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 753
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IDeviceInterface:onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 755
    iget-object v0, p0, Lo/akt$9$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_0

    .line 756
    iget-object v0, p0, Lo/akt$9$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 759
    :cond_0
    return-void
.end method

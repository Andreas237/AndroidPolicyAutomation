.class Lo/akt$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bvm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/akt;


# direct methods
.method constructor <init>(Lo/akt;)V
    .locals 0

    .line 743
    iput-object p1, p0, Lo/akt$9;->c:Lo/akt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 748
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IDeviceInterface:isSporting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 750
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    new-instance v1, Lo/akt$9$4;

    invoke-direct {v1, p0, p1}, Lo/akt$9$4;-><init>(Lo/akt$9;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1}, Lo/aks;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 761
    return-void
.end method

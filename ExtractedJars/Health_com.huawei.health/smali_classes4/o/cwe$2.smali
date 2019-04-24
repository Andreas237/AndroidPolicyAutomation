.class Lo/cwe$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->a(Lcom/huawei/hihealth/HiDataReadOption;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwe;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
    .locals 0

    .line 440
    iput-object p1, p0, Lo/cwe$2;->a:Lo/cwe;

    iput-object p2, p0, Lo/cwe$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lo/cwe$2;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 5

    .line 443
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthData data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 445
    iget-object v0, p0, Lo/cwe$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 446
    return-void

    .line 449
    :cond_0
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 450
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 451
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthData The return run data is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    iget-object v0, p0, Lo/cwe$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 453
    return-void

    .line 456
    :cond_1
    iget-object v0, p0, Lo/cwe$2;->a:Lo/cwe;

    iget v1, p0, Lo/cwe$2;->e:I

    iget-object v2, p0, Lo/cwe$2;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, v4, v2}, Lo/cwe;->c(Lo/cwe;ILandroid/util/SparseArray;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 457
    return-void
.end method

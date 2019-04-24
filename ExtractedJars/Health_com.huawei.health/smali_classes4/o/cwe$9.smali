.class Lo/cwe$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwe;->b(Lcom/huawei/hihealth/HiAggregateOption;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cwe;

.field final synthetic d:I

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
    .locals 0

    .line 468
    iput-object p1, p0, Lo/cwe$9;->b:Lo/cwe;

    iput-object p2, p0, Lo/cwe$9;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lo/cwe$9;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 471
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHiAggregateData datas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 473
    iget-object v0, p0, Lo/cwe$9;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 474
    return-void

    .line 476
    :cond_0
    iget-object v0, p0, Lo/cwe$9;->b:Lo/cwe;

    iget v1, p0, Lo/cwe$9;->d:I

    iget-object v2, p0, Lo/cwe$9;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1, p1, v2}, Lo/cwe;->d(Lo/cwe;ILjava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 477
    return-void
.end method

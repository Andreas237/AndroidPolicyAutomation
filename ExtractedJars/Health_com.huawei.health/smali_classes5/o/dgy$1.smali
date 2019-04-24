.class Lo/dgy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgy;->a(JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dgy;


# direct methods
.method constructor <init>(Lo/dgy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 524
    iput-object p1, p0, Lo/dgy$1;->d:Lo/dgy;

    iput-object p2, p0, Lo/dgy$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

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

    .line 527
    iget-object v0, p0, Lo/dgy$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-nez v0, :cond_0

    .line 528
    invoke-static {}, Lo/dgy;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackMonthData callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    return-void

    .line 531
    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 532
    :cond_1
    invoke-static {}, Lo/dgy;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackMonthData() all run datas null or empty "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    iget-object v0, p0, Lo/dgy$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p2, p1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 534
    return-void

    .line 537
    :cond_2
    iget-object v0, p0, Lo/dgy$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p2, p1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 538
    return-void
.end method

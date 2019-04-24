.class final Lo/dmn$3;
.super Lo/dmd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dmn;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dmd<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lo/dmn$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Lo/dmd;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(ILjava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Z"
        }
    .end annotation

    .line 486
    const-string v0, "SmarterUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCommodityInfoFromCloud err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 488
    :goto_0
    if-nez v4, :cond_1

    .line 489
    iget-object v0, p0, Lo/dmn$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 491
    :cond_1
    return v4
.end method

.method protected c(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 512
    iget-object v0, p0, Lo/dmn$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 513
    return-void
.end method

.method protected synthetic d(ILjava/lang/Object;)Z
    .locals 1

    .line 483
    move-object v0, p2

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p0, p1, v0}, Lo/dmn$3;->a(ILjava/util/Map;)Z

    move-result v0

    return v0
.end method

.method protected synthetic d(Ljava/lang/Object;)Z
    .locals 1

    .line 483
    move-object v0, p1

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p0, v0}, Lo/dmn$3;->e(Ljava/util/Map;)Z

    move-result v0

    return v0
.end method

.method protected synthetic e(Ljava/lang/Object;)V
    .locals 1

    .line 483
    move-object v0, p1

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p0, v0}, Lo/dmn$3;->c(Ljava/util/Map;)V

    return-void
.end method

.method protected e(Ljava/util/Map;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Z"
        }
    .end annotation

    .line 496
    const/4 v2, 0x0

    .line 498
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 499
    const-string v0, "commodityList"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 500
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 501
    const/4 v2, 0x1

    .line 504
    :cond_0
    if-nez v2, :cond_1

    .line 505
    iget-object v0, p0, Lo/dmn$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    invoke-interface {v0, v1, p1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 507
    :cond_1
    return v2
.end method

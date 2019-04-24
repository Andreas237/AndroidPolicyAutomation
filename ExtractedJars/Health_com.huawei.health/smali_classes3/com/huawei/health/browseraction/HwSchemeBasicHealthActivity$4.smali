.class Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 243
    iput-object p1, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;->b:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    iput-object p2, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 8

    .line 246
    const-string v0, "HwSchemeBasicHealthActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressStatisticsDatas errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 248
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 249
    return-void

    .line 251
    :cond_0
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 252
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 253
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 254
    return-void

    .line 258
    :cond_1
    const v0, 0xad12

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 259
    move-object v5, v6

    check-cast v5, Ljava/util/List;

    .line 260
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 261
    if-eqz v7, :cond_2

    .line 262
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 263
    return-void

    .line 265
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$4;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 267
    return-void
.end method

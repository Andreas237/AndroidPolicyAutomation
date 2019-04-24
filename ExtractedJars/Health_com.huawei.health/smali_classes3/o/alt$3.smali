.class Lo/alt$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alt;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/alt;


# direct methods
.method constructor <init>(Lo/alt;)V
    .locals 0

    .line 1365
    iput-object p1, p0, Lo/alt$3;->d:Lo/alt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 1402
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo onFailure="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1403
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 9

    .line 1368
    const-string v0, "Step_LSC"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoFromDB account="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1369
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1370
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoFromDB,null == data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1371
    return-void

    .line 1373
    :cond_0
    const/4 v4, 0x0

    .line 1375
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 1378
    goto :goto_0

    .line 1376
    :catch_0
    move-exception v5

    .line 1377
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1380
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 1381
    :cond_1
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoFromDB,userInfoList == null || userInfoList.size() == 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1382
    return-void

    .line 1384
    :cond_2
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiUserInfo;

    .line 1385
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getRelateType()I

    move-result v0

    if-nez v0, :cond_3

    .line 1386
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo sync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1387
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 1388
    const-string v0, "weight"

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 1389
    const-string v0, "height"

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 1390
    const-string v0, "ownerId"

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getOwerID()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1391
    const-string v0, "huid"

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1392
    const-string v0, "gender"

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1393
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v8

    .line 1394
    const/16 v0, 0x3f8

    iput v0, v8, Landroid/os/Message;->what:I

    .line 1395
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1396
    iget-object v0, p0, Lo/alt$3;->d:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1398
    :cond_3
    goto/16 :goto_1

    .line 1399
    :cond_4
    return-void
.end method

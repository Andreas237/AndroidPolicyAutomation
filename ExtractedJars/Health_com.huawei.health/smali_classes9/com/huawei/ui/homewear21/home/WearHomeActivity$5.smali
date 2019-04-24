.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 1550
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$5;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 1553
    const/4 v4, 0x0

    .line 1555
    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    if-eqz p2, :cond_3

    .line 1556
    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    .line 1557
    const-string v0, "&&"

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1558
    const-string v0, "&&"

    invoke-virtual {v6, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 1559
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INTELLIGENT_HOME_LINKAGE split = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1560
    array-length v0, v7

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 1563
    const/4 v0, 0x3

    :try_start_0
    aget-object v0, v7, v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    .line 1564
    const/4 v4, 0x0

    goto :goto_0

    .line 1566
    :cond_0
    const/4 v4, 0x1

    .line 1570
    :goto_0
    goto :goto_1

    .line 1568
    :catch_0
    move-exception v8

    .line 1569
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "INTELLIGENT_HOME_LINKAGE Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1570
    goto :goto_1

    .line 1572
    :cond_1
    const/4 v4, 0x0

    .line 1574
    :goto_1
    goto :goto_2

    .line 1575
    :cond_2
    const/4 v4, 0x0

    .line 1578
    :cond_3
    :goto_2
    if-eqz v4, :cond_4

    .line 1579
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$5;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_status_enabled:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    .line 1581
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$5;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->o(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_status_disabled:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1583
    :goto_3
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$5;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$5$4;

    invoke-direct {v1, p0, v5}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$5$4;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$5;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1594
    return-void
.end method

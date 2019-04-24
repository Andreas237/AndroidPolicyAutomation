.class Lcom/huawei/hwservicesmgr/PhoneService$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/PhoneService$4;->b(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/hwservicesmgr/PhoneService$4;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService$4;)V
    .locals 0

    .line 454
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$4$5;->d:Lcom/huawei/hwservicesmgr/PhoneService$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 472
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 7

    .line 457
    move-object v4, p1

    check-cast v4, Landroid/os/Bundle;

    .line 458
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u8fd0\u52a8\u6570\u636e\uff1a\u6b65\u6570:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "step"

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u697c\u5c42\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "floor"

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u5361\u8def\u91cc\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "carior"

    .line 459
    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \u76ee\u6807:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "stepTarget"

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 460
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    new-instance v6, Lo/dkf;

    invoke-direct {v6}, Lo/dkf;-><init>()V

    .line 462
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$4$5;->d:Lcom/huawei/hwservicesmgr/PhoneService$4;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$4;->c:Lcom/huawei/hwservicesmgr/PhoneService;

    const-string v1, "step"

    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "carior"

    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "stepTarget"

    invoke-virtual {v4, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v6, v0, v1, v2, v3}, Lo/dkf;->d(Landroid/content/Context;III)V

    .line 463
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 467
    return-void
.end method

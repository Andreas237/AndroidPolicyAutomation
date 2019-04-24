.class Lo/der$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/der;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dgg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/der;

.field final synthetic d:Lo/dgg;


# direct methods
.method constructor <init>(Lo/der;Lo/dgg;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lo/der$1;->c:Lo/der;

    iput-object p2, p0, Lo/der$1;->d:Lo/dgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;Ljava/lang/String;Z)V
    .locals 2

    .line 179
    if-eqz p1, :cond_0

    .line 180
    iget-object v0, p0, Lo/der$1;->d:Lo/dgg;

    invoke-interface {v0, p1}, Lo/dgg;->d(Ljava/lang/Object;)V

    .line 181
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/der$1;->c:Lo/der;

    invoke-static {v0}, Lo/der;->d(Lo/der;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dfd;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 182
    invoke-static {}, Lo/dfb;->a()Lo/dfb;

    move-result-object v0

    invoke-virtual {v0}, Lo/dfb;->c()V

    .line 185
    :cond_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 176
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;

    invoke-virtual {p0, v0, p2, p3}, Lo/der$1;->d(Lcom/huawei/hwcloudmodel/model/intelligent/TransDeviceDataRsq;Ljava/lang/String;Z)V

    return-void
.end method

.class Lo/dkw$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dkw;


# direct methods
.method constructor <init>(Lo/dkw;)V
    .locals 0

    .line 1056
    iput-object p1, p0, Lo/dkw$11;->d:Lo/dkw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 1060
    move-object v0, p2

    check-cast v0, [B

    move-object v4, v0

    check-cast v4, [B

    .line 1061
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1062
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "applyWearAssetfileCallback() onResponse null data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1063
    return-void

    .line 1065
    :cond_0
    new-instance v5, Lo/dkh;

    invoke-direct {v5}, Lo/dkh;-><init>()V

    .line 1066
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/dkh;->d(I)V

    .line 1067
    invoke-virtual {v5, v4}, Lo/dkh;->e([B)V

    .line 1069
    array-length v0, v4

    const/16 v1, 0x8

    if-ne v1, v0, :cond_1

    const/4 v0, 0x2

    aget-byte v0, v4, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_1

    .line 1070
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "applyWearAssetfileCallback() onResponse error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1072
    :cond_1
    iget-object v0, p0, Lo/dkw$11;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1073
    iget-object v0, p0, Lo/dkw$11;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1075
    :cond_2
    iget-object v0, p0, Lo/dkw$11;->d:Lo/dkw;

    const/4 v1, 0x1

    invoke-static {v0, v5, v1}, Lo/dkw;->e(Lo/dkw;Ljava/lang/Object;I)V

    .line 1077
    :goto_0
    return-void
.end method

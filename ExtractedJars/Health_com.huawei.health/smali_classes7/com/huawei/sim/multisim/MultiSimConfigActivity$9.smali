.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/sim/multisim/MultiSimConfigActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 1732
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$9;->d:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 1735
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openEsimWithoutConfirm err_code2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1736
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$9;->d:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    move-result-object v0

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1737
    iput p1, v4, Landroid/os/Message;->arg1:I

    .line 1738
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$9;->d:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->sendMessage(Landroid/os/Message;)Z

    .line 1739
    return-void
.end method

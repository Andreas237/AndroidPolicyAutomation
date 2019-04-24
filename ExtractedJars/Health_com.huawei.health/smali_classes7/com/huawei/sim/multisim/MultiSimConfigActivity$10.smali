.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$10;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$10;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 325
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connectedChanged mNonLocalBroadcastReceiver(): intent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.SIM_STATE_CHANGED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 327
    const-string v0, "ss"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 328
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "connectedChanged mNonLocalBr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const-string v0, "UNKNOWN"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$10;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->finish()V

    .line 332
    :cond_0
    goto :goto_0

    .line 333
    :cond_1
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$10;->e:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->b(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$e;->sendEmptyMessage(I)Z

    .line 335
    :goto_0
    return-void
.end method

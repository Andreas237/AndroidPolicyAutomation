.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$8$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;)V
    .locals 0

    .line 437
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$8$3;->c:Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 440
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "network setting"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$8$3;->c:Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;

    iget-object v0, v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;->c:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    iget-object v0, v0, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/edr;->b(Landroid/content/Context;)V

    .line 442
    return-void
.end method

.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity;->a(Landroid/text/SpannableString;)V
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

    .line 570
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$6;->d:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 573
    const-string v0, "MultiSimConfigActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$6;->d:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lo/egw;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 575
    iget-object v0, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$6;->d:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-static {v0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity;->e(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 577
    :cond_0
    return-void
.end method

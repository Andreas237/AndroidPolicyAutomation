.class Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/sim/multisim/MultiSimConfigActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sim/multisim/MultiSimConfigActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity;)V
    .locals 0

    .line 434
    iput-object p1, p0, Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;->c:Lcom/huawei/sim/multisim/MultiSimConfigActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 437
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/huawei/sim/multisim/MultiSimConfigActivity$8$3;

    invoke-direct {v1, p0}, Lcom/huawei/sim/multisim/MultiSimConfigActivity$8$3;-><init>(Lcom/huawei/sim/multisim/MultiSimConfigActivity$8;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 444
    return-void
.end method

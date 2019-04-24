.class Lcom/huawei/sim/esim/view/ConformActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/ConformActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/sim/esim/view/ConformActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/ConformActivity;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/sim/esim/view/ConformActivity$4;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 91
    const-string v0, "ConformActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBackButton.setOnClickListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$4;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->e(Lcom/huawei/sim/esim/view/ConformActivity;)Lo/ecx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/sim/esim/view/ConformActivity$4;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-static {v1}, Lcom/huawei/sim/esim/view/ConformActivity;->d(Lcom/huawei/sim/esim/view/ConformActivity;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lo/ecx;->b(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 93
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$4;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimProfileAcitvity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$4;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/sim/esim/view/ConformActivity;->startActivity(Landroid/content/Intent;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ConformActivity$4;->d:Lcom/huawei/sim/esim/view/ConformActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/ConformActivity;->finish()V

    .line 96
    return-void
.end method

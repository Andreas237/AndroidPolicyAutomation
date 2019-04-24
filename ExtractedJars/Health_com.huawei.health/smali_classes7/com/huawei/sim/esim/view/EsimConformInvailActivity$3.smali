.class Lcom/huawei/sim/esim/view/EsimConformInvailActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/sim/esim/view/EsimConformInvailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/EsimConformInvailActivity;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity$3;->c:Lcom/huawei/sim/esim/view/EsimConformInvailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 51
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity$3;->c:Lcom/huawei/sim/esim/view/EsimConformInvailActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity$3;->c:Lcom/huawei/sim/esim/view/EsimConformInvailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->startActivity(Landroid/content/Intent;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/sim/esim/view/EsimConformInvailActivity$3;->c:Lcom/huawei/sim/esim/view/EsimConformInvailActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/EsimConformInvailActivity;->finish()V

    .line 54
    return-void
.end method

.class Lcom/huawei/sim/esim/view/ScanFailActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/sim/esim/view/ScanFailActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/sim/esim/view/ScanFailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/sim/esim/view/ScanFailActivity;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/sim/esim/view/ScanFailActivity$4;->a:Lcom/huawei/sim/esim/view/ScanFailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 32
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/sim/esim/view/ScanFailActivity$4;->a:Lcom/huawei/sim/esim/view/ScanFailActivity;

    const-class v1, Lcom/huawei/sim/esim/view/EsimActivationActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 33
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ScanFailActivity$4;->a:Lcom/huawei/sim/esim/view/ScanFailActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/sim/esim/view/ScanFailActivity;->startActivity(Landroid/content/Intent;)V

    .line 34
    iget-object v0, p0, Lcom/huawei/sim/esim/view/ScanFailActivity$4;->a:Lcom/huawei/sim/esim/view/ScanFailActivity;

    invoke-virtual {v0}, Lcom/huawei/sim/esim/view/ScanFailActivity;->finish()V

    .line 35
    return-void
.end method

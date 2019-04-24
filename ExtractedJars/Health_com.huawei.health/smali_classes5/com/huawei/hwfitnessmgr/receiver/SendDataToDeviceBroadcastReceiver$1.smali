.class Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver;Landroid/content/Context;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver$1;->a:Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver;

    iput-object p2, p0, Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver$1;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/hwfitnessmgr/receiver/SendDataToDeviceBroadcastReceiver$1;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    move-result-object v0

    invoke-virtual {v0}, Lo/dez;->d()V

    .line 58
    return-void
.end method

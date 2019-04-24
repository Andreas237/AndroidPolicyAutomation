.class Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver$3;->e:Lcom/huawei/health/suggestion/receiver/NetworkStateReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 44
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->h()V

    .line 45
    const-string v0, "BootReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncData() end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    return-void
.end method

.class final Lo/bsu$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsu;->a(Lcom/huawei/health/suggestion/data/DataSyncService$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/data/DataSyncService$a;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/data/DataSyncService$a;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lo/bsu$4;->d:Lcom/huawei/health/suggestion/data/DataSyncService$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 236
    move-object v1, p2

    check-cast v1, Lcom/huawei/health/suggestion/data/DataSyncService$e;

    .line 237
    new-instance v0, Lo/bsu$4$5;

    invoke-direct {v0, p0}, Lo/bsu$4$5;-><init>(Lo/bsu$4;)V

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/data/DataSyncService$e;->d(Lcom/huawei/health/suggestion/data/DataSyncService$a;)V

    .line 250
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 254
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 255
    return-void
.end method

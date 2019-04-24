.class Lo/bsu$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/suggestion/data/DataSyncService$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsu$4;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bsu$4;


# direct methods
.method constructor <init>(Lo/bsu$4;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lo/bsu$4$5;->b:Lo/bsu$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 2

    .line 240
    iget-object v0, p0, Lo/bsu$4$5;->b:Lo/bsu$4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bsu$4;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 241
    iget-object v0, p0, Lo/bsu$4$5;->b:Lo/bsu$4;

    iget-object v0, v0, Lo/bsu$4;->d:Lcom/huawei/health/suggestion/data/DataSyncService$a;

    invoke-interface {v0, p1, p2}, Lcom/huawei/health/suggestion/data/DataSyncService$a;->b(ILjava/lang/String;)V

    .line 242
    return-void
.end method

.method public c()V
    .locals 2

    .line 246
    iget-object v0, p0, Lo/bsu$4$5;->b:Lo/bsu$4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bsu$4;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 247
    iget-object v0, p0, Lo/bsu$4$5;->b:Lo/bsu$4;

    iget-object v0, v0, Lo/bsu$4;->d:Lcom/huawei/health/suggestion/data/DataSyncService$a;

    invoke-interface {v0}, Lcom/huawei/health/suggestion/data/DataSyncService$a;->c()V

    .line 248
    return-void
.end method

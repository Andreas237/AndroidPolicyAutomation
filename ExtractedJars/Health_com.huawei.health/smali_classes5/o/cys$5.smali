.class Lo/cys$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cys;->a(Landroid/bluetooth/BluetoothDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cys;


# direct methods
.method constructor <init>(Lo/cys;)V
    .locals 0

    .line 492
    iput-object p1, p0, Lo/cys$5;->a:Lo/cys;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 495
    invoke-static {}, Lo/cys;->o()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 496
    :try_start_0
    iget-object v0, p0, Lo/cys$5;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->a(Lo/cys;)Lo/cxw;

    move-result-object v0

    iget-object v1, p0, Lo/cys$5;->a:Lo/cys;

    invoke-static {v1}, Lo/cys;->b(Lo/cys;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxw;->e(Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 497
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 498
    :goto_0
    return-void
.end method

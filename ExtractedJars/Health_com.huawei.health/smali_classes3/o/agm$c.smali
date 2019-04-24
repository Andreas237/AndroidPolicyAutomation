.class Lo/agm$c;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/agm;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/agm;)V
    .locals 1

    .line 487
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 488
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/agm$c;->c:Ljava/lang/ref/WeakReference;

    .line 489
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 493
    iget-object v0, p0, Lo/agm$c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/agm;

    .line 494
    if-nez v4, :cond_0

    .line 495
    return-void

    .line 497
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BleDevice onConnectionStateChange Run autoReconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    invoke-static {v4}, Lo/agm;->g(Lo/agm;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 499
    return-void
.end method

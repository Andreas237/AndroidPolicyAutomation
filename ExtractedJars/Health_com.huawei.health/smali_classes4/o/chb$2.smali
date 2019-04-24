.class Lo/chb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/chb;->c(Landroid/os/Handler;Lo/cew;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/chb;

.field final synthetic c:Landroid/os/Handler;

.field final synthetic e:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lo/chb;Landroid/os/Handler;Ljava/lang/Runnable;)V
    .locals 0

    .line 652
    iput-object p1, p0, Lo/chb$2;->a:Lo/chb;

    iput-object p2, p0, Lo/chb$2;->c:Landroid/os/Handler;

    iput-object p3, p0, Lo/chb$2;->e:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSnapshotReady(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 657
    iget-object v0, p0, Lo/chb$2;->a:Lo/chb;

    invoke-static {v0}, Lo/chb;->d(Lo/chb;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 658
    iget-object v0, p0, Lo/chb$2;->c:Landroid/os/Handler;

    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;)Landroid/os/Message;

    move-result-object v2

    .line 659
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 660
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 661
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 662
    iget-object v0, p0, Lo/chb$2;->a:Lo/chb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/chb;->b(Lo/chb;Z)Z

    .line 663
    iget-object v0, p0, Lo/chb$2;->c:Landroid/os/Handler;

    iget-object v1, p0, Lo/chb$2;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 665
    :cond_0
    return-void
.end method

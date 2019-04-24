.class Lo/chb$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/chb;->c(Landroid/os/Handler;Lo/cew;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Handler;

.field final synthetic d:Lo/chb;


# direct methods
.method constructor <init>(Lo/chb;Landroid/os/Handler;)V
    .locals 0

    .line 637
    iput-object p1, p0, Lo/chb$3;->d:Lo/chb;

    iput-object p2, p0, Lo/chb$3;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 640
    iget-object v0, p0, Lo/chb$3;->d:Lo/chb;

    invoke-static {v0}, Lo/chb;->d(Lo/chb;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 641
    const-string v0, "Track_GoogleMapModel"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "maps Bitmap fail to snapshot"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 642
    iget-object v0, p0, Lo/chb$3;->a:Landroid/os/Handler;

    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;)Landroid/os/Message;

    move-result-object v4

    .line 643
    const/4 v0, 0x0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 644
    const/4 v0, 0x1

    iput v0, v4, Landroid/os/Message;->what:I

    .line 645
    invoke-virtual {v4}, Landroid/os/Message;->sendToTarget()V

    .line 646
    iget-object v0, p0, Lo/chb$3;->d:Lo/chb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/chb;->b(Lo/chb;Z)Z

    .line 648
    :cond_0
    return-void
.end method

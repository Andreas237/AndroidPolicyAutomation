.class Lo/cgy$6;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cgy;


# direct methods
.method constructor <init>(Lo/cgy;)V
    .locals 0

    .line 1494
    iput-object p1, p0, Lo/cgy$6;->b:Lo/cgy;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1498
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1499
    iget-object v0, p0, Lo/cgy$6;->b:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->g(Lo/cgy;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1501
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    .line 1503
    iget-object v0, p0, Lo/cgy$6;->b:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->g(Lo/cgy;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Marker;->setVisible(Z)V

    .line 1504
    iget-object v0, p0, Lo/cgy$6;->b:Lo/cgy;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cgy;->b(Lo/cgy;I)V

    goto :goto_0

    .line 1506
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1508
    iget-object v0, p0, Lo/cgy$6;->b:Lo/cgy;

    invoke-static {v0}, Lo/cgy;->g(Lo/cgy;)Lcom/amap/api/maps/model/Marker;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/amap/api/maps/model/Marker;->setVisible(Z)V

    .line 1509
    iget-object v0, p0, Lo/cgy$6;->b:Lo/cgy;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgy;->b(Lo/cgy;I)V

    .line 1512
    :cond_1
    :goto_0
    return-void
.end method

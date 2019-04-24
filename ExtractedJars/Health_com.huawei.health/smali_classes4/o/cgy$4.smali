.class Lo/cgy$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/maps/AMap$OnMapScreenShotListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgy;->c(Landroid/os/Handler;Lo/cew;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cgy;

.field final synthetic d:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lo/cgy;Landroid/os/Handler;)V
    .locals 0

    .line 1331
    iput-object p1, p0, Lo/cgy$4;->c:Lo/cgy;

    iput-object p2, p0, Lo/cgy$4;->d:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapScreenShot(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1335
    iget-object v0, p0, Lo/cgy$4;->d:Landroid/os/Handler;

    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;)Landroid/os/Message;

    move-result-object v2

    .line 1336
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1337
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 1338
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 1339
    iget-object v0, p0, Lo/cgy$4;->c:Lo/cgy;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cgy;->b(Lo/cgy;Lcom/amap/api/maps/AMap$OnMapScreenShotListener;)Lcom/amap/api/maps/AMap$OnMapScreenShotListener;

    .line 1340
    return-void
.end method

.method public onMapScreenShot(Landroid/graphics/Bitmap;I)V
    .locals 0

    .line 1345
    return-void
.end method

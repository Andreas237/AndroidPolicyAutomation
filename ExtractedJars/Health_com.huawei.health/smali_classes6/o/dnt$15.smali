.class Lo/dnt$15;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt;Landroid/os/Handler;)V
    .locals 0

    .line 468
    iput-object p1, p0, Lo/dnt$15;->c:Lo/dnt;

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 3

    .line 471
    iget-object v0, p0, Lo/dnt$15;->c:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/dnt$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 472
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 3

    .line 476
    iget-object v0, p0, Lo/dnt$15;->c:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/dnt$d;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 477
    return-void
.end method

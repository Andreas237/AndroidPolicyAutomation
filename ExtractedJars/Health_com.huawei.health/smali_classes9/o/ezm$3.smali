.class Lo/ezm$3;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ezm;


# direct methods
.method constructor <init>(Lo/ezm;Landroid/os/Looper;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/ezm$3;->e:Lo/ezm;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 79
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 80
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lo/ezm$b;

    .line 81
    iget-object v0, p0, Lo/ezm$3;->e:Lo/ezm;

    iget-object v1, v2, Lo/ezm$b;->e:Lo/eih;

    invoke-static {v0, v1}, Lo/ezm;->a(Lo/ezm;Lo/eih;)V

    .line 83
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 84
    return-void
.end method

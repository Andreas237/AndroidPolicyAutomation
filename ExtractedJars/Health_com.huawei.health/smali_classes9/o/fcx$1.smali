.class Lo/fcx$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fcx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fcx;


# direct methods
.method constructor <init>(Lo/fcx;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/fcx$1;->d:Lo/fcx;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 104
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 105
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 107
    :sswitch_0
    iget-object v0, p0, Lo/fcx$1;->d:Lo/fcx;

    invoke-static {v0}, Lo/fcx;->d(Lo/fcx;)V

    .line 108
    goto :goto_0

    .line 110
    :sswitch_1
    iget-object v0, p0, Lo/fcx$1;->d:Lo/fcx;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lo/fcx;->d(Lo/fcx;Ljava/util/List;)Ljava/util/List;

    .line 111
    iget-object v0, p0, Lo/fcx$1;->d:Lo/fcx;

    invoke-static {v0}, Lo/fcx;->b(Lo/fcx;)V

    .line 112
    .line 117
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

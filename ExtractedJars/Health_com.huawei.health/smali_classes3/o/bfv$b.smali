.class Lo/bfv$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bfv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/bfv;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/bfv;)V
    .locals 1

    .line 99
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 100
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bfv$b;->d:Ljava/lang/ref/WeakReference;

    .line 101
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 106
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 107
    iget-object v0, p0, Lo/bfv$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/bfv;

    .line 108
    if-nez v1, :cond_0

    .line 110
    return-void

    .line 113
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 117
    :pswitch_0
    invoke-static {v1}, Lo/bfv;->e(Lo/bfv;)V

    .line 118
    goto :goto_0

    .line 122
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v1, v0}, Lo/bfv;->d(Lo/bfv;I)V

    .line 123
    goto :goto_0

    .line 127
    :pswitch_2
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v1, v0}, Lo/bfv;->e(Lo/bfv;I)V

    .line 128
    goto :goto_0

    .line 132
    :pswitch_3
    invoke-static {v1}, Lo/bfv;->c(Lo/bfv;)V

    .line 133
    goto :goto_0

    .line 137
    :pswitch_4
    invoke-static {v1}, Lo/bfv;->a(Lo/bfv;)V

    .line 138
    .line 143
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

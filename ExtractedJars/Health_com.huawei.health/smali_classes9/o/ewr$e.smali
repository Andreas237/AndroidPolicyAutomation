.class public Lo/ewr$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ewr;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/ewr;)V
    .locals 1

    .line 57
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 58
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ewr$e;->c:Ljava/lang/ref/WeakReference;

    .line 59
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 63
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 64
    iget-object v0, p0, Lo/ewr$e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ewr;

    .line 65
    if-nez v1, :cond_0

    .line 66
    return-void

    .line 68
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 70
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lo/ews;

    .line 71
    invoke-static {v1, v2}, Lo/ewr;->d(Lo/ewr;Lo/ews;)V

    .line 72
    .line 76
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
    .end sparse-switch
.end method

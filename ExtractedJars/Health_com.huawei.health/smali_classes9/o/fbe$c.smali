.class Lo/fbe$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lo/fbe;


# direct methods
.method constructor <init>(Lo/fbe;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/fbe$c;->c:Lo/fbe;

    .line 36
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 37
    return-void
.end method

.method constructor <init>(Lo/fbe;Landroid/os/Handler;)V
    .locals 1

    .line 39
    iput-object p1, p0, Lo/fbe$c;->c:Lo/fbe;

    .line 40
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 41
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 45
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 48
    :sswitch_0
    iget-object v0, p0, Lo/fbe$c;->c:Lo/fbe;

    invoke-static {v0}, Lo/fbe;->e(Lo/fbe;)V

    .line 49
    .line 54
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

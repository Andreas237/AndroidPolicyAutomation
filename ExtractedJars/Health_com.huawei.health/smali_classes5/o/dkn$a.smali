.class Lo/dkn$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic d:Lo/dkn;


# direct methods
.method public constructor <init>(Lo/dkn;Landroid/os/Looper;)V
    .locals 0

    .line 843
    iput-object p1, p0, Lo/dkn$a;->d:Lo/dkn;

    .line 844
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 845
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 848
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 849
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 851
    :sswitch_0
    const-string v0, "NotifySendData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " handleMessage start handleCheckService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 852
    iget-object v0, p0, Lo/dkn$a;->d:Lo/dkn;

    invoke-static {v0}, Lo/dkn;->b(Lo/dkn;)V

    .line 853
    .line 857
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
    .end sparse-switch
.end method

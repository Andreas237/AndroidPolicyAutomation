.class Lo/dix$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dix;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dix;


# direct methods
.method constructor <init>(Lo/dix;Landroid/os/Looper;)V
    .locals 0

    .line 498
    iput-object p1, p0, Lo/dix$4;->b:Lo/dix;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 501
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 502
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 504
    :sswitch_0
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage MSG_REPORT_MUSIC_INFO 5.36.1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    iget-object v0, p0, Lo/dix$4;->b:Lo/dix;

    invoke-static {v0}, Lo/dix;->d(Lo/dix;)V

    .line 506
    goto :goto_0

    .line 508
    :sswitch_1
    const-string v0, "HWMusicControlManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage regist callback 5.36.3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 510
    invoke-static {}, Lo/dit;->d()Lo/dit;

    move-result-object v0

    invoke-virtual {v0}, Lo/dit;->c()V

    .line 511
    .line 514
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

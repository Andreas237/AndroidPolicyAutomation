.class Lo/dxo$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dxo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dxo;


# direct methods
.method constructor <init>(Lo/dxo;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/dxo$4;->c:Lo/dxo;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 118
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    .line 119
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "start getTrackData"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lo/dxo$4;->c:Lo/dxo;

    iget-object v1, p0, Lo/dxo$4;->c:Lo/dxo;

    invoke-static {v1}, Lo/dxo;->d(Lo/dxo;)I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lo/dxk;->d(IZ)J

    move-result-wide v1

    iget-object v3, p0, Lo/dxo$4;->c:Lo/dxo;

    invoke-static {v3}, Lo/dxo;->d(Lo/dxo;)I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lo/dxk;->d(IZ)J

    move-result-wide v3

    iget-object v5, p0, Lo/dxo$4;->c:Lo/dxo;

    invoke-static {v5}, Lo/dxo;->d(Lo/dxo;)I

    move-result v5

    invoke-static/range {v0 .. v5}, Lo/dxo;->d(Lo/dxo;JJI)V

    goto :goto_0

    .line 121
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 122
    const-string v0, "PLGACHIEVE_AchieveAnnualDataHlr"

    const-string v1, "start get AnnualData"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lo/dxo$4;->c:Lo/dxo;

    iget-object v1, p0, Lo/dxo$4;->c:Lo/dxo;

    invoke-static {v1}, Lo/dxo;->d(Lo/dxo;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/dxo;->k(I)V

    .line 125
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 126
    return-void
.end method

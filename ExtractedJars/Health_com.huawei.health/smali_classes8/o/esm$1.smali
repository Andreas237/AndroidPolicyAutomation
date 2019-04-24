.class Lo/esm$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/esm;


# direct methods
.method constructor <init>(Lo/esm;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lo/esm$1;->d:Lo/esm;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 67
    const-string v0, "refresh_type"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 68
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "action_dataType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 70
    iget-object v0, p0, Lo/esm$1;->d:Lo/esm;

    invoke-static {v0}, Lo/esm;->d(Lo/esm;)Lo/esr;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 71
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiBroadcastReceiver refish data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lo/esm$1;->d:Lo/esm;

    invoke-static {v0}, Lo/esm;->d(Lo/esm;)Lo/esr;

    move-result-object v0

    invoke-virtual {v0}, Lo/esr;->d()V

    goto :goto_0

    .line 74
    :cond_0
    const-string v0, "SportsRecordingCard"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mReader is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Lo/esm$1;->d:Lo/esm;

    invoke-static {v0}, Lo/esm;->c(Lo/esm;)V

    .line 78
    :cond_1
    :goto_0
    return-void
.end method

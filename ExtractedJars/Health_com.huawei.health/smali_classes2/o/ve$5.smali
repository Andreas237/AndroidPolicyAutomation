.class Lo/ve$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ve;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ve;


# direct methods
.method constructor <init>(Lo/ve;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/ve$5;->d:Lo/ve;

    .line 1042
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1046
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "Connection service ok"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1047
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    invoke-static {v0}, Lo/ve;->d(Lo/ve;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1048
    invoke-static {}, Lo/ve;->a()I

    move-result v0

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 1049
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    .line 1050
    invoke-static {p2}, Lo/eep$a;->c(Landroid/os/IBinder;)Lo/eep;

    move-result-object v1

    .line 1049
    invoke-static {v0, v1}, Lo/ve;->d(Lo/ve;Lo/eep;)V

    .line 1051
    goto :goto_0

    .line 1052
    :cond_0
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    .line 1053
    invoke-static {p2}, Lo/vk$e;->a(Landroid/os/IBinder;)Lo/vk;

    move-result-object v1

    .line 1052
    invoke-static {v0, v1}, Lo/ve;->e(Lo/ve;Lo/vk;)V

    .line 1055
    :goto_0
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    invoke-static {v0}, Lo/ve;->e(Lo/ve;)Z

    .line 1056
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    invoke-static {v0}, Lo/ve;->b(Lo/ve;)V

    .line 1057
    invoke-static {}, Lo/ve;->a()I

    move-result v0

    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    .line 1058
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    invoke-static {v0}, Lo/ve;->g(Lo/ve;)Lo/vm;

    move-result-object v0

    invoke-interface {v0}, Lo/vm;->c()V

    .line 1059
    goto :goto_1

    .line 1060
    :cond_1
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    invoke-static {v0}, Lo/ve;->d(Lo/ve;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1062
    :goto_1
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1066
    invoke-static {}, Lo/ve;->a()I

    move-result v0

    const/16 v1, 0x19

    if-lt v0, v1, :cond_0

    .line 1067
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ve;->d(Lo/ve;Lo/eep;)V

    .line 1068
    goto :goto_0

    .line 1069
    :cond_0
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ve;->e(Lo/ve;Lo/vk;)V

    .line 1071
    :goto_0
    iget-object v0, p0, Lo/ve$5;->d:Lo/ve;

    invoke-static {v0}, Lo/ve;->g(Lo/ve;)Lo/vm;

    move-result-object v0

    invoke-interface {v0}, Lo/vm;->d()V

    .line 1072
    return-void
.end method

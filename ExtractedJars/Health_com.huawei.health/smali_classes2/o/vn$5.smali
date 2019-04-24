.class Lo/vn$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/vn;


# direct methods
.method constructor <init>(Lo/vn;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lo/vn$5;->d:Lo/vn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 61
    invoke-static {p2}, Lo/vo$c;->a(Landroid/os/IBinder;)Lo/vo;

    move-result-object v0

    invoke-static {v0}, Lo/vn;->a(Lo/vo;)Lo/vo;

    .line 62
    const-string v0, "PowerKitApi"

    const-string v1, "Powerkit service connected"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    iget-object v0, p0, Lo/vn$5;->d:Lo/vn;

    invoke-static {v0}, Lo/vn;->d(Lo/vn;)Lo/vq;

    move-result-object v0

    invoke-interface {v0}, Lo/vq;->b()V

    .line 65
    invoke-static {}, Lo/vn;->d()Lo/vo;

    move-result-object v0

    invoke-interface {v0}, Lo/vo;->asBinder()Landroid/os/IBinder;

    move-result-object v3

    .line 67
    :try_start_0
    iget-object v0, p0, Lo/vn$5;->d:Lo/vn;

    invoke-static {v0}, Lo/vn;->b(Lo/vn;)Lo/vn;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    goto :goto_0

    .line 68
    :catch_0
    move-exception v4

    .line 69
    const-string v0, "PowerKitApi"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "powerkit linkToDeath failed ! calling pid: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 54
    const-string v0, "PowerKitApi"

    const-string v1, "Powerkit service disconnected"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    iget-object v0, p0, Lo/vn$5;->d:Lo/vn;

    invoke-static {v0}, Lo/vn;->d(Lo/vn;)Lo/vq;

    move-result-object v0

    invoke-interface {v0}, Lo/vq;->d()V

    .line 56
    return-void
.end method

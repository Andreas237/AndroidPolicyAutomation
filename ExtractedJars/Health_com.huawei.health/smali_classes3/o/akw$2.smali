.class Lo/akw$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/akw;


# direct methods
.method constructor <init>(Lo/akw;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/akw$2;->d:Lo/akw;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 44
    if-nez p2, :cond_0

    .line 45
    return-void

    .line 47
    :cond_0
    const-string v0, "refresh_type"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    .line 49
    const/4 v0, 0x7

    if-ne v4, v0, :cond_1

    .line 50
    invoke-static {}, Lo/akw;->c()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lo/akw$2$5;

    invoke-direct {v1, p0, v4}, Lo/akw$2$5;-><init>(Lo/akw$2;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 57
    :cond_1
    const-string v0, "Step_SyncManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not recognized type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :goto_0
    return-void
.end method

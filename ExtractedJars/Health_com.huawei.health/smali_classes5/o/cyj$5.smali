.class Lo/cyj$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cyj;


# direct methods
.method constructor <init>(Lo/cyj;)V
    .locals 0

    .line 2610
    iput-object p1, p0, Lo/cyj$5;->e:Lo/cyj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 2615
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect service connected so start to set service handle ."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2616
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 2617
    invoke-static {p2}, Lo/dqe$a;->b(Landroid/os/IBinder;)Lo/dqe;

    move-result-object v0

    invoke-static {v0}, Lo/cxo;->e(Lo/dqe;)V

    goto :goto_0

    .line 2619
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "service is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2620
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cxo;->e(Lo/dqe;)V

    .line 2622
    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    .line 2627
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect service disconnect so start to set service handle is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2628
    const/4 v0, 0x0

    invoke-static {v0}, Lo/cxo;->e(Lo/dqe;)V

    .line 2629
    return-void
.end method

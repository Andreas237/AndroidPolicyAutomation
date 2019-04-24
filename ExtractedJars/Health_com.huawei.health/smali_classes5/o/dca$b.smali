.class Lo/dca$b;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dca;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Z

.field final synthetic d:Lo/dca;


# direct methods
.method public constructor <init>(Lo/dca;Z)V
    .locals 4

    .line 891
    iput-object p1, p0, Lo/dca$b;->d:Lo/dca;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 889
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dca$b;->a:Z

    .line 892
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SyncTimerTask:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 893
    iput-boolean p2, p0, Lo/dca$b;->a:Z

    .line 894
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 898
    const-string v0, "CORESLEEPMISSON_HwCoreSleepMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "run..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 899
    iget-object v0, p0, Lo/dca$b;->d:Lo/dca;

    iget-boolean v1, p0, Lo/dca$b;->a:Z

    invoke-static {v0, v1}, Lo/dca;->a(Lo/dca;Z)V

    .line 900
    return-void
.end method

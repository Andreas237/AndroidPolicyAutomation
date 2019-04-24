.class public Lo/aeo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aeo$a;
    }
.end annotation


# instance fields
.field private b:Lo/aeq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/aeq<Lo/aer;>;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Lo/aep;


# direct methods
.method public constructor <init>(Lo/aep;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Lo/aeq;

    invoke-direct {v0}, Lo/aeq;-><init>()V

    iput-object v0, p0, Lo/aeo;->b:Lo/aeq;

    .line 25
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeo;->d:Z

    .line 29
    iput-object p1, p0, Lo/aeo;->e:Lo/aep;

    .line 30
    return-void
.end method

.method static synthetic c(Lo/aeo;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lo/aeo;->e()V

    return-void
.end method

.method private e()V
    .locals 5

    .line 89
    iget-object v0, p0, Lo/aeo;->b:Lo/aeq;

    invoke-virtual {v0}, Lo/aeq;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 90
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTaskQueue.size()==0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeo;->d:Z

    .line 92
    return-void

    .line 95
    :cond_0
    const-wide/16 v0, 0x64

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 96
    :catch_0
    move-exception v4

    .line 97
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BLETaskQueueUtil "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/aeo;->e(Ljava/lang/Boolean;)V

    .line 100
    return-void
.end method

.method private e(Ljava/lang/Boolean;)V
    .locals 5

    .line 49
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Current task queue size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aeo;->b:Lo/aeq;

    invoke-virtual {v3}, Lo/aeq;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lo/aeo;->b:Lo/aeq;

    invoke-virtual {v0}, Lo/aeq;->a()I

    move-result v0

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeo;->d:Z

    .line 52
    return-void

    .line 55
    :cond_0
    iget-boolean v0, p0, Lo/aeo;->d:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    return-void

    .line 58
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aeo;->d:Z

    .line 59
    iget-object v0, p0, Lo/aeo;->b:Lo/aeq;

    invoke-virtual {v0}, Lo/aeq;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aer;

    .line 60
    sget-object v0, Lo/aeo$3;->d:[I

    invoke-virtual {v4}, Lo/aer;->b()Lo/aeo$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/aeo$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 65
    :pswitch_0
    iget-object v0, p0, Lo/aeo;->e:Lo/aep;

    new-instance v1, Lo/aeo$5;

    invoke-direct {v1, p0}, Lo/aeo$5;-><init>(Lo/aeo;)V

    invoke-interface {v0, v4, v1}, Lo/aep;->d(Lo/aer;Lo/aes;)V

    .line 72
    goto :goto_0

    .line 76
    :pswitch_1
    iget-object v0, p0, Lo/aeo;->e:Lo/aep;

    new-instance v1, Lo/aeo$4;

    invoke-direct {v1, p0}, Lo/aeo$4;-><init>(Lo/aeo;)V

    invoke-interface {v0, v4, v1}, Lo/aep;->b(Lo/aer;Lo/aes;)V

    .line 86
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 33
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clearTask"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aeo;->d:Z

    .line 35
    iget-object v0, p0, Lo/aeo;->b:Lo/aeq;

    invoke-virtual {v0}, Lo/aeq;->d()V

    .line 36
    return-void
.end method

.method public c()V
    .locals 1

    .line 44
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/aeo;->e(Ljava/lang/Boolean;)V

    .line 45
    return-void
.end method

.method public e(Lo/aer;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aeo;->b:Lo/aeq;

    invoke-virtual {v0, p1}, Lo/aeq;->b(Ljava/lang/Object;)V

    .line 41
    return-void
.end method

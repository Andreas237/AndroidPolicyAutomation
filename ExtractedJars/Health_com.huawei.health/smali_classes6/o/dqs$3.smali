.class Lo/dqs$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dqs;


# direct methods
.method constructor <init>(Lo/dqs;)V
    .locals 0

    .line 905
    iput-object p1, p0, Lo/dqs$3;->e:Lo/dqs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 3

    .line 908
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dqs;->e(I)I

    .line 909
    const-string v0, "AttachedDeviceManager"

    const-string v1, "MultiSimService binderDied."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 910
    iget-object v0, p0, Lo/dqs$3;->e:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->h(Lo/dqs;)Lo/dsu;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 911
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Binder is null."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 912
    const/4 v0, 0x2

    invoke-static {v0}, Lo/dqs;->e(I)I

    .line 913
    iget-object v0, p0, Lo/dqs$3;->e:Lo/dqs;

    invoke-static {}, Lo/dqs;->g()I

    move-result v1

    invoke-static {v0, v1}, Lo/dqs;->b(Lo/dqs;I)V

    .line 914
    return-void

    .line 916
    :cond_0
    iget-object v0, p0, Lo/dqs$3;->e:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->h(Lo/dqs;)Lo/dsu;

    move-result-object v0

    invoke-interface {v0}, Lo/dsu;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lo/dqs$3;->e:Lo/dqs;

    invoke-static {v1}, Lo/dqs;->e(Lo/dqs;)Landroid/os/IBinder$DeathRecipient;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 917
    iget-object v0, p0, Lo/dqs$3;->e:Lo/dqs;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dqs;->a(Lo/dqs;Lo/dsr;)Lo/dsr;

    .line 918
    iget-object v0, p0, Lo/dqs$3;->e:Lo/dqs;

    invoke-virtual {v0}, Lo/dqs;->a()I

    .line 919
    return-void
.end method

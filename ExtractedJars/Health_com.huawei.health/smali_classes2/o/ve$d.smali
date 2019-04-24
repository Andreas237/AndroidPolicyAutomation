.class Lo/ve$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ve;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic e:Lo/ve;


# direct methods
.method private constructor <init>(Lo/ve;)V
    .locals 0

    .line 1127
    iput-object p1, p0, Lo/ve$d;->e:Lo/ve;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/ve;Lo/ve$d;)V
    .locals 0

    .line 1127
    invoke-direct {p0, p1}, Lo/ve$d;-><init>(Lo/ve;)V

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 3

    .line 1131
    const-string v0, "ARMoudle.HwActivityRecognition"

    const-string v1, "Ar service has died!"

    invoke-static {v0, v1}, Lo/vj;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1132
    iget-object v0, p0, Lo/ve$d;->e:Lo/ve;

    invoke-static {v0}, Lo/ve;->g(Lo/ve;)Lo/vm;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1133
    iget-object v0, p0, Lo/ve$d;->e:Lo/ve;

    invoke-static {v0}, Lo/ve;->g(Lo/ve;)Lo/vm;

    move-result-object v0

    invoke-interface {v0}, Lo/vm;->d()V

    .line 1135
    :cond_0
    invoke-static {}, Lo/ve;->a()I

    move-result v0

    const/16 v1, 0x19

    if-lt v0, v1, :cond_1

    .line 1136
    iget-object v0, p0, Lo/ve$d;->e:Lo/ve;

    invoke-static {v0}, Lo/ve;->f(Lo/ve;)Lo/eep;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1137
    iget-object v0, p0, Lo/ve$d;->e:Lo/ve;

    invoke-static {v0}, Lo/ve;->f(Lo/ve;)Lo/eep;

    move-result-object v0

    invoke-interface {v0}, Lo/eep;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lo/ve$d;->e:Lo/ve;

    invoke-static {v1}, Lo/ve;->i(Lo/ve;)Lo/ve$d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 1138
    iget-object v0, p0, Lo/ve$d;->e:Lo/ve;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ve;->d(Lo/ve;Lo/eep;)V

    .line 1140
    goto :goto_0

    .line 1141
    :cond_1
    iget-object v0, p0, Lo/ve$d;->e:Lo/ve;

    invoke-static {v0}, Lo/ve;->k(Lo/ve;)Lo/vk;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1142
    iget-object v0, p0, Lo/ve$d;->e:Lo/ve;

    invoke-static {v0}, Lo/ve;->k(Lo/ve;)Lo/vk;

    move-result-object v0

    invoke-interface {v0}, Lo/vk;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v1, p0, Lo/ve$d;->e:Lo/ve;

    invoke-static {v1}, Lo/ve;->i(Lo/ve;)Lo/ve$d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 1143
    iget-object v0, p0, Lo/ve$d;->e:Lo/ve;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ve;->e(Lo/ve;Lo/vk;)V

    .line 1146
    :cond_2
    :goto_0
    return-void
.end method

.class public Lo/abp;
.super Lo/abm;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/abp$b;,
        Lo/abp$e;,
        Lo/abp$d;,
        Lo/abp$c;,
        Lo/abp$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lo/abp$a;

.field private c:Landroid/content/Context;

.field private d:Lo/akm;

.field private e:I

.field private f:Lo/abp$d;

.field private g:Lo/abp$c;

.field private k:Lo/ala;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 47
    invoke-direct {p0}, Lo/abm;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abp;->c:Landroid/content/Context;

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/abp;->a:Z

    .line 35
    const/4 v0, 0x0

    iput v0, p0, Lo/abp;->e:I

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abp;->d:Lo/akm;

    .line 37
    new-instance v0, Lo/abp$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/abp$a;-><init>(Lo/abp;Lo/abp$1;)V

    iput-object v0, p0, Lo/abp;->b:Lo/abp$a;

    .line 40
    new-instance v0, Lo/abp$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/abp$c;-><init>(Lo/abp;Lo/abp$1;)V

    iput-object v0, p0, Lo/abp;->g:Lo/abp$c;

    .line 42
    new-instance v0, Lo/abp$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/abp$d;-><init>(Lo/abp;Lo/abp$1;)V

    iput-object v0, p0, Lo/abp;->f:Lo/abp$d;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abp;->k:Lo/ala;

    .line 48
    iput-object p1, p0, Lo/abp;->c:Landroid/content/Context;

    .line 49
    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1

    .line 171
    invoke-static {p1}, Lo/akz;->h(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/abp;Lo/akm;)Lo/akm;
    .locals 0

    .line 28
    iput-object p1, p0, Lo/abp;->d:Lo/akm;

    return-object p1
.end method

.method static synthetic c(Lo/abp;)Landroid/content/Context;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/abp;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/abp;)Lo/ala;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/abp;->k:Lo/ala;

    return-object v0
.end method

.method private g()V
    .locals 5

    .line 77
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerLogCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    if-eqz v0, :cond_0

    .line 82
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x4

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerLogCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " cb:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->f:Lo/abp$d;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    iget-object v1, p0, Lo/abp;->f:Lo/abp$d;

    invoke-interface {v0, v1}, Lo/akm;->b(Lo/akk;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    goto :goto_0

    .line 84
    :catch_0
    move-exception v4

    .line 85
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    :cond_0
    :goto_0
    return-void
.end method

.method private i()Z
    .locals 7

    .line 146
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initMidwareSerivce "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->c:Landroid/content/Context;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const/4 v4, 0x0

    .line 150
    iget-object v0, p0, Lo/abp;->c:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 151
    iget-object v0, p0, Lo/abp;->c:Landroid/content/Context;

    invoke-direct {p0, v0}, Lo/abp;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v5

    .line 153
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 154
    :try_start_0
    iget-object v0, p0, Lo/abp;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/abp;->b:Lo/abp$a;

    const/4 v2, 0x1

    invoke-virtual {v0, v5, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 158
    :cond_0
    goto :goto_0

    .line 156
    :catch_0
    move-exception v6

    .line 157
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mid ware bind failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    :goto_0
    if-nez v4, :cond_1

    .line 160
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mid ware bind ret false,init onfailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lo/abp;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/alt;->e(Z)V

    .line 162
    iget-object v0, p0, Lo/abp;->k:Lo/ala;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/ala;->a(Landroid/os/Bundle;)V

    .line 164
    :cond_1
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bind ret "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    :cond_2
    return v4
.end method

.method private k()V
    .locals 5

    .line 92
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterLogCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    if-eqz v0, :cond_0

    .line 97
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x4

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterLogCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " cb:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->f:Lo/abp$d;

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    iget-object v1, p0, Lo/abp;->f:Lo/abp$d;

    invoke-interface {v0, v1}, Lo/akm;->e(Lo/akk;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    goto :goto_0

    .line 99
    :catch_0
    move-exception v4

    .line 100
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 60
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStepCounter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    if-eqz v0, :cond_0

    .line 64
    :try_start_0
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    invoke-interface {v0}, Lo/akm;->c()I

    .line 65
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    iget-object v1, p0, Lo/abp;->g:Lo/abp$c;

    invoke-interface {v0, v1}, Lo/akm;->a(Lo/akk;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    goto :goto_0

    .line 67
    :catch_0
    move-exception v4

    .line 68
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    :cond_0
    :goto_0
    invoke-direct {p0}, Lo/abp;->g()V

    .line 73
    return-void
.end method

.method public a(Lo/ala;)V
    .locals 1

    .line 53
    iput-object p1, p0, Lo/abp;->k:Lo/ala;

    .line 54
    invoke-direct {p0}, Lo/abp;->i()Z

    .line 55
    return-void
.end method

.method public b()Z
    .locals 6

    .line 257
    move-object v4, p0

    monitor-enter v4

    .line 258
    :try_start_0
    iget-boolean v0, p0, Lo/abp;->a:Z

    if-nez v0, :cond_1

    .line 259
    iget v0, p0, Lo/abp;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/abp;->e:I

    .line 260
    iget v0, p0, Lo/abp;->e:I

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    .line 261
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cannot sync with db while midware cache not ready,retry:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/abp;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 262
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 264
    :cond_0
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cannot sync with db while midware cache not ready,force sync"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    const/4 v0, 0x0

    iput v0, p0, Lo/abp;->e:I

    .line 266
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/abp;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 267
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 271
    :cond_1
    const/4 v0, 0x0

    :try_start_2
    iput v0, p0, Lo/abp;->e:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 273
    monitor-exit v4

    const/4 v0, 0x1

    return v0

    .line 274
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public c()Ljava/lang/String;
    .locals 5

    .line 132
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    if-eqz v0, :cond_0

    .line 134
    :try_start_0
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    invoke-interface {v0}, Lo/akm;->b()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 135
    :catch_0
    move-exception v4

    .line 136
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()V
    .locals 5

    .line 107
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopStepCounter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 110
    iget-object v0, p0, Lo/abp;->c:Landroid/content/Context;

    .line 111
    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    invoke-virtual {v0}, Lo/alt;->c()Lo/aku;

    move-result-object v4

    .line 112
    if-eqz v4, :cond_0

    .line 113
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Lo/aku;->c(Z)V

    .line 117
    :cond_0
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    if-eqz v0, :cond_1

    .line 119
    :try_start_0
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    invoke-interface {v0}, Lo/akm;->d()I

    .line 120
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    iget-object v1, p0, Lo/abp;->g:Lo/abp$c;

    invoke-interface {v0, v1}, Lo/akm;->d(Lo/akk;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    goto :goto_0

    .line 122
    :catch_0
    move-exception v4

    .line 123
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    :cond_1
    :goto_0
    invoke-direct {p0}, Lo/abp;->k()V

    .line 128
    return-void
.end method

.method public d(JJLo/abp$b;)V
    .locals 7

    .line 278
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMidWareCache mRemote="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/abp;->d:Lo/akm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    if-eqz v0, :cond_0

    .line 281
    :try_start_0
    iget-object v0, p0, Lo/abp;->d:Lo/akm;

    move-wide v1, p1

    move-wide v3, p3

    new-instance v5, Lo/abp$e;

    invoke-direct {v5, p0, p5}, Lo/abp$e;-><init>(Lo/abp;Lo/abp$b;)V

    invoke-interface/range {v0 .. v5}, Lo/akm;->c(JJLo/akk;)Z

    move-result v6

    .line 282
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMidWareCache result="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    goto :goto_0

    .line 283
    :catch_0
    move-exception v6

    .line 284
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    :cond_0
    :goto_0
    return-void
.end method

.method public e()V
    .locals 3

    .line 175
    move-object v1, p0

    monitor-enter v1

    .line 176
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lo/abp;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 178
    :goto_0
    return-void
.end method

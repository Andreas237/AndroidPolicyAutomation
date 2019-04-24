.class public Lo/amb;
.super Lo/aav$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/amb$a;,
        Lo/amb$b;,
        Lo/amb$c;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/health/manager/DaemonService;

.field private b:Z

.field private c:Lo/alt;

.field private d:Lo/amc;

.field private e:Lo/amt;

.field private f:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<Lo/abg;>;"
        }
    .end annotation
.end field

.field private h:Lo/amb$b;

.field private i:Lo/can;

.field private k:Lo/amb$c;


# direct methods
.method public constructor <init>(Lcom/huawei/health/manager/DaemonService;)V
    .locals 5

    .line 59
    invoke-direct {p0}, Lo/aav$a;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amb;->e:Lo/amt;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amb;->a:Lcom/huawei/health/manager/DaemonService;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amb;->c:Lo/alt;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amb;->d:Lo/amc;

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/amb;->b:Z

    .line 43
    new-instance v0, Lo/amb$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/amb$c;-><init>(Lo/amb;Lo/amb$5;)V

    iput-object v0, p0, Lo/amb;->k:Lo/amb$c;

    .line 45
    new-instance v0, Lo/amb$5;

    invoke-direct {v0, p0}, Lo/amb$5;-><init>(Lo/amb;)V

    iput-object v0, p0, Lo/amb;->f:Landroid/os/RemoteCallbackList;

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amb;->i:Lo/can;

    .line 528
    new-instance v0, Lo/amb$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/amb$b;-><init>(Lo/amb;Lo/amb$5;)V

    iput-object v0, p0, Lo/amb;->h:Lo/amb$b;

    .line 61
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StepCounterRemoteProxy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    new-instance v0, Lo/amt;

    invoke-direct {v0, p1}, Lo/amt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/amb;->e:Lo/amt;

    .line 65
    iput-object p1, p0, Lo/amb;->a:Lcom/huawei/health/manager/DaemonService;

    .line 66
    iget-object v0, p0, Lo/amb;->a:Lcom/huawei/health/manager/DaemonService;

    invoke-static {v0}, Lo/alt;->c(Landroid/content/Context;)Lo/alt;

    move-result-object v0

    iput-object v0, p0, Lo/amb;->c:Lo/alt;

    .line 67
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    iget-object v1, p0, Lo/amb;->k:Lo/amb$c;

    invoke-virtual {v0, v1}, Lo/alt;->b(Lo/alb;)V

    .line 69
    new-instance v0, Lo/amc;

    iget-object v1, p0, Lo/amb;->a:Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v0, v1}, Lo/amc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/amb;->d:Lo/amc;

    .line 72
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    iget-object v1, p0, Lo/amb;->h:Lo/amb$b;

    invoke-virtual {v0, v1}, Lo/alt;->d(Lo/ala;)V

    .line 74
    new-instance v4, Lo/cal;

    iget-object v0, p0, Lo/amb;->a:Lcom/huawei/health/manager/DaemonService;

    invoke-direct {v4, v0}, Lo/cal;-><init>(Landroid/content/Context;)V

    .line 75
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v4}, Lo/cal;->h()Lo/alb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/alt;->d(Lo/alb;)V

    .line 76
    invoke-virtual {v4}, Lo/cal;->i()V

    .line 77
    invoke-virtual {v4}, Lo/cal;->f()Lo/can;

    move-result-object v0

    iput-object v0, p0, Lo/amb;->i:Lo/can;

    .line 78
    return-void
.end method

.method private b(III)I
    .locals 1

    .line 321
    const/16 v0, 0x186

    if-lt p1, v0, :cond_0

    const/16 v0, 0x78

    if-lt p2, v0, :cond_0

    const/4 v0, 0x2

    if-gt p3, v0, :cond_0

    .line 322
    const/4 v0, 0x3

    return v0

    .line 325
    :cond_0
    const/16 v0, 0x14a

    if-lt p1, v0, :cond_1

    const/16 v0, 0x5a

    if-lt p2, v0, :cond_1

    const/16 v0, 0x78

    if-ge p2, v0, :cond_1

    const/4 v0, 0x3

    if-gt p3, v0, :cond_1

    .line 326
    const/4 v0, 0x2

    return v0

    .line 330
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lo/amb;)Lo/alt;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    return-object v0
.end method

.method static synthetic b(Lo/amb;Z)Z
    .locals 0

    .line 27
    iput-boolean p1, p0, Lo/amb;->b:Z

    return p1
.end method

.method static synthetic d(Lo/amb;)Landroid/os/RemoteCallbackList;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/amb;->f:Landroid/os/RemoteCallbackList;

    return-object v0
.end method


# virtual methods
.method public a(JIII)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 186
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBaseData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/alt;->b(JIII)V

    .line 191
    :cond_0
    return-void
.end method

.method public a(Lo/aay;)V
    .locals 5

    .line 337
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTodaySportData callback="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    if-eqz p1, :cond_1

    .line 339
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_0

    .line 341
    :try_start_0
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->b()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {p1, v0}, Lo/aay;->c(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 344
    goto :goto_0

    .line 342
    :catch_0
    move-exception v4

    .line 343
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    goto :goto_0

    .line 347
    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-interface {p1, v0}, Lo/aay;->d(Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 350
    goto :goto_0

    .line 348
    :catch_1
    move-exception v4

    .line 349
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    :cond_1
    :goto_0
    return-void
.end method

.method public a(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 96
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStepCounterSwitchStatus status="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lo/amb;->b:Z

    if-eqz v0, :cond_1

    .line 98
    if-eqz p1, :cond_0

    .line 99
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->k()V

    goto :goto_0

    .line 101
    :cond_0
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->m()V

    .line 104
    :cond_1
    :goto_0
    return-void
.end method

.method public a()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 176
    const/4 v1, 0x0

    .line 177
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    invoke-virtual {v0}, Lo/amc;->d()Z

    move-result v1

    .line 180
    :cond_0
    return v1
.end method

.method public a(Lo/abg;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 156
    const/4 v4, 0x0

    .line 157
    if-eqz p1, :cond_0

    .line 158
    iget-object v0, p0, Lo/amb;->f:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    move-result v4

    .line 161
    :cond_0
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterStepReportCallback ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    return v4
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 91
    const-string v0, "1.0.0.0"

    return-object v0
.end method

.method public b(Landroid/content/Intent;)V
    .locals 4

    .line 478
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealBroadcastEvents "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0, p1}, Lo/alt;->c(Landroid/content/Intent;)V

    .line 482
    :cond_0
    return-void
.end method

.method public b(Lo/aay;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 358
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDebugInfo callback="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    if-eqz p1, :cond_1

    .line 360
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_0

    .line 362
    :try_start_0
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->d()Landroid/os/Bundle;

    move-result-object v0

    invoke-interface {p1, v0}, Lo/aay;->c(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 365
    goto :goto_0

    .line 363
    :catch_0
    move-exception v4

    .line 364
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    goto :goto_0

    .line 368
    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-interface {p1, v0}, Lo/aay;->d(Landroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 371
    goto :goto_0

    .line 369
    :catch_1
    move-exception v4

    .line 370
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 374
    :cond_1
    :goto_0
    return-void
.end method

.method public b(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 195
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNotificationEnable status="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    if-eqz v0, :cond_0

    .line 198
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    invoke-interface {v0, p1}, Lo/can;->d(Z)V

    .line 200
    :cond_0
    return-void
.end method

.method public b(Lo/abg;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 138
    const/4 v4, 0x0

    .line 140
    if-eqz p1, :cond_0

    .line 141
    iget-object v0, p0, Lo/amb;->f:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, p1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    move-result v4

    .line 144
    :cond_0
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    iget-object v1, p0, Lo/amb;->k:Lo/amb$c;

    invoke-virtual {v0, v1}, Lo/alt;->b(Lo/alb;)V

    .line 148
    :cond_1
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerStepReportCallback ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return v4
.end method

.method public c(Lo/aay;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 242
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-nez v0, :cond_0

    .line 243
    return-void

    .line 245
    :cond_0
    const/4 v2, 0x0

    .line 246
    if-eqz p1, :cond_1

    .line 247
    new-instance v2, Lo/amb$a;

    invoke-direct {v2, p1}, Lo/amb$a;-><init>(Lo/aay;)V

    .line 249
    :cond_1
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lo/alt;->a(Lo/ala;Z)V

    .line 250
    return-void
.end method

.method public c(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 204
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNotificationEnable status="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    invoke-interface {v0, p1}, Lo/can;->a(Z)V

    .line 209
    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 116
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->l()Z

    move-result v0

    return v0

    .line 119
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Lo/aay;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 422
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStandSteps callback="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    const/4 v4, -0x1

    .line 426
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_0

    .line 427
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    invoke-virtual {v0}, Lo/amc;->k()V

    .line 428
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->n()I

    move-result v4

    .line 431
    :cond_0
    if-eqz p1, :cond_1

    .line 433
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStandSteps "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 435
    const-string v0, "standSteps"

    invoke-virtual {v5, v0, v4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 436
    invoke-interface {p1, v5}, Lo/aay;->c(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 439
    goto :goto_0

    .line 437
    :catch_0
    move-exception v5

    .line 438
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    :cond_1
    :goto_0
    return-void
.end method

.method public d(Z)V
    .locals 4

    .line 455
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchTrackMonitor "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    if-nez v0, :cond_0

    .line 458
    return-void

    .line 461
    :cond_0
    if-eqz p1, :cond_1

    .line 462
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    invoke-virtual {v0}, Lo/amc;->c()V

    goto :goto_0

    .line 464
    :cond_1
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    invoke-virtual {v0}, Lo/amc;->e()V

    .line 466
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 108
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->e()Z

    move-result v4

    .line 109
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStepCounterSwitchStatus result= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return v4
.end method

.method public d(Lo/abb;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 167
    const/4 v1, 0x0

    .line 168
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    invoke-virtual {v0, p1, p2}, Lo/amc;->b(Lo/abb;I)Z

    move-result v1

    .line 171
    :cond_0
    return v1
.end method

.method public e()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lo/amb;->a:Lcom/huawei/health/manager/DaemonService;

    invoke-static {v0}, Lo/akz;->c(Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 270
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo status="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0, p1}, Lo/alt;->c(Landroid/os/Bundle;)V

    .line 274
    :cond_0
    return-void
.end method

.method public e(Lo/aay;)V
    .locals 6

    .line 279
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepData callback="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    if-eqz p1, :cond_1

    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_1

    .line 281
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 282
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0, v4}, Lo/alt;->c(Ljava/util/Map;)V

    .line 285
    :try_start_0
    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    .line 286
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSleepData sleepDataMap.size() ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/aay;->d(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_0

    .line 290
    :cond_0
    :try_start_1
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 291
    const-string v0, "sleep_start_time"

    const-string v1, "sleep_start_time"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 292
    const-string v0, "sleep_end_time"

    const-string v1, "sleep_end_time"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 293
    const-string v0, "sleep_duration_sum"

    const-string v1, "sleep_duration_sum"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 294
    const-string v0, "sleep_deep_duration"

    const-string v1, "sleep_deep_duration"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 295
    const-string v0, "sleep_shallow_duration"

    const-string v1, "sleep_shallow_duration"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 296
    const-string v0, "sleep_wake_duration"

    const-string v1, "sleep_wake_duration"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 297
    const-string v0, "sleep_wake_count"

    const-string v1, "sleep_wake_count"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 298
    const-string v0, "sleep_quality"

    const-string v1, "sleep_duration_sum"

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "sleep_deep_duration"

    .line 299
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "sleep_wake_count"

    .line 300
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 298
    invoke-direct {p0, v1, v2, v3}, Lo/amb;->b(III)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 301
    invoke-interface {p1, v5}, Lo/aay;->c(Landroid/os/Bundle;)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 305
    goto :goto_0

    .line 302
    :catch_0
    move-exception v5

    .line 303
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepData NumberFormatException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/aay;->d(Landroid/os/Bundle;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 309
    :goto_0
    goto :goto_1

    .line 307
    :catch_1
    move-exception v5

    .line 308
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSleepData RemoteException"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    :cond_1
    :goto_1
    return-void
.end method

.method public e(Z)V
    .locals 2

    .line 254
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/can;->d(Z)V

    .line 257
    :cond_0
    return-void
.end method

.method public f(Lo/aay;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 382
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedPromptKeepAlive callback="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    if-nez p1, :cond_0

    .line 384
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedPromptKeepAlive callback null,warning!!!(can not given the result via callback) return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    return-void

    .line 388
    :cond_0
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-nez v0, :cond_1

    .line 389
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNeedPromptKeepAlive mLogicalStepCounter null,warning!!!(can not invoke function) return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/aay;->d(Landroid/os/Bundle;)V

    .line 393
    return-void

    .line 397
    :cond_1
    :try_start_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 398
    const-string v0, "isNeedPromptKeepAlive"

    iget-object v1, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v1}, Lo/alt;->g()Z

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 399
    invoke-interface {p1, v4}, Lo/aay;->c(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 402
    goto :goto_0

    .line 400
    :catch_0
    move-exception v4

    .line 401
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    :goto_0
    return-void
.end method

.method public f()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 229
    const/4 v4, 0x0

    .line 231
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    if-eqz v0, :cond_0

    .line 232
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    invoke-interface {v0}, Lo/can;->b()Z

    move-result v4

    .line 234
    :cond_0
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalNotifiState result= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    return v4
.end method

.method public g()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 216
    const/4 v4, 0x0

    .line 218
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    invoke-interface {v0}, Lo/can;->d()Z

    move-result v4

    .line 221
    :cond_0
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStepsNotifiState result= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    return v4
.end method

.method public h()Z
    .locals 1

    .line 314
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    invoke-interface {v0}, Lo/can;->a()Z

    move-result v0

    return v0

    .line 317
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public i()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 446
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyUserInfoChanged "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-eqz v0, :cond_0

    .line 448
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->h()V

    .line 450
    :cond_0
    return-void
.end method

.method public k()Z
    .locals 2

    .line 261
    const/4 v1, 0x0

    .line 262
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    if-eqz v0, :cond_1

    .line 263
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    invoke-interface {v0}, Lo/can;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/amb;->i:Lo/can;

    invoke-interface {v0}, Lo/can;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 265
    :cond_1
    :goto_0
    return v1
.end method

.method public m()V
    .locals 1

    .line 485
    iget-object v0, p0, Lo/amb;->i:Lo/can;

    invoke-interface {v0}, Lo/can;->e()V

    .line 486
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->f()V

    .line 487
    return-void
.end method

.method public n()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lo/amb;->a:Lcom/huawei/health/manager/DaemonService;

    invoke-static {v0}, Lo/akz;->d(Landroid/content/Context;)I

    move-result v0

    return v0
.end method

.method public o()V
    .locals 4

    .line 471
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tickTrackDog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/amb;->d:Lo/amc;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    if-eqz v0, :cond_0

    .line 473
    iget-object v0, p0, Lo/amb;->d:Lo/amc;

    invoke-virtual {v0}, Lo/amc;->b()V

    .line 475
    :cond_0
    return-void
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lo/amb;->e:Lo/amt;

    invoke-virtual {v0}, Lo/amt;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    new-instance v0, Landroid/os/RemoteException;

    const-string v1, "hw permission check failed"

    invoke-direct {v0, v1}, Landroid/os/RemoteException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lo/aav$a;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0
.end method

.method public p()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 410
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "makePromptNoSense"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    if-nez v0, :cond_0

    .line 412
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLogicalStepCounter null,makePromptNoSense failed,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    return-void

    .line 415
    :cond_0
    iget-object v0, p0, Lo/amb;->c:Lo/alt;

    invoke-virtual {v0}, Lo/alt;->i()V

    .line 416
    return-void
.end method

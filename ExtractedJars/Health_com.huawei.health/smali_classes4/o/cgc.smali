.class public Lo/cgc;
.super Lo/abf$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cgc$d;,
        Lo/cgc$a;
    }
.end annotation


# static fields
.field private static c:Landroid/os/RemoteCallbackList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/RemoteCallbackList<Lo/cgc$a;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lo/cgb;

.field private b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

.field d:Lo/cbu;

.field private e:Lo/cgc$d;

.field private f:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    sput-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/open/TrackService;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Lo/abf$e;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgc;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgc;->a:Lo/cgb;

    .line 27
    new-instance v0, Lo/cgc$d;

    invoke-direct {v0}, Lo/cgc$d;-><init>()V

    iput-object v0, p0, Lo/cgc;->e:Lo/cgc$d;

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lo/cgc;->f:I

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgc;->d:Lo/cbu;

    .line 45
    iput-object p1, p0, Lo/cgc;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    .line 47
    new-instance v0, Lo/cgb;

    iget-object v1, p0, Lo/cgc;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    invoke-direct {v0, v1}, Lo/cgb;-><init>(Lcom/huawei/healthcloud/plugintrack/open/TrackService;)V

    iput-object v0, p0, Lo/cgc;->a:Lo/cgb;

    .line 49
    iget-object v0, p0, Lo/cgc;->a:Lo/cgb;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lo/cgc;->a:Lo/cgb;

    iget-object v1, p0, Lo/cgc;->e:Lo/cgc$d;

    invoke-virtual {v0, v1}, Lo/cgb;->b(Lo/cgc$d;)V

    .line 55
    :cond_0
    iget-object v0, p0, Lo/cgc;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/open/TrackService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cbu;->c(Landroid/content/Context;)Lo/cbu;

    move-result-object v0

    iput-object v0, p0, Lo/cgc;->d:Lo/cbu;

    .line 57
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->i()I

    move-result v0

    iput v0, p0, Lo/cgc;->f:I

    .line 59
    return-void
.end method

.method static synthetic b(Lo/cgc;)I
    .locals 1

    .line 19
    iget v0, p0, Lo/cgc;->f:I

    return v0
.end method

.method static synthetic d(Lo/cgc;I)I
    .locals 0

    .line 19
    iput p1, p0, Lo/cgc;->f:I

    return p1
.end method

.method static synthetic d(Lo/cgc;)Lo/cgb;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/cgc;->a:Lo/cgb;

    return-object v0
.end method

.method static synthetic g()Landroid/os/RemoteCallbackList;
    .locals 1

    .line 19
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 329
    const/4 v0, 0x1

    iput v0, p0, Lo/cgc;->f:I

    .line 330
    iget-object v0, p0, Lo/cgc;->a:Lo/cgb;

    iget v1, p0, Lo/cgc;->f:I

    invoke-virtual {v0, v1}, Lo/cgb;->d(I)V

    .line 331
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackDataRemoteProxy startSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    return-void
.end method

.method public a(Lo/abd;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lo/cgc;->a:Lo/cgb;

    invoke-virtual {v0}, Lo/cgb;->a()V

    .line 77
    iget-object v0, p0, Lo/cgc;->a:Lo/cgb;

    invoke-virtual {v0}, Lo/cgb;->e()I

    move-result v0

    iput v0, p0, Lo/cgc;->f:I

    .line 79
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataCallback "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " at "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    if-eqz p1, :cond_3

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 84
    :try_start_0
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v6, v0

    .line 87
    goto :goto_0

    .line 85
    :catch_0
    move-exception v7

    .line 86
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "beginBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    :goto_0
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "registerDataCallback:Report client count "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_1

    .line 91
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v7}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lo/cgc$a;

    invoke-virtual {v0}, Lo/cgc$a;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {p1}, Lo/abd;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 92
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v7}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cgc$a;

    .line 93
    goto :goto_2

    .line 90
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 100
    :cond_1
    :goto_2
    :try_start_1
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 103
    goto :goto_3

    .line 101
    :catch_1
    move-exception v7

    .line 102
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :goto_3
    if-nez v5, :cond_2

    .line 106
    new-instance v5, Lo/cgc$a;

    invoke-direct {v5, p0, p1}, Lo/cgc$a;-><init>(Lo/cgc;Lo/abd;)V

    .line 107
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0, v5}, Lo/cbu;->a(Lo/cbu$e;)V

    .line 108
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-static {v5}, Lo/cbu;->e(Lo/cck;)V

    .line 110
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0, v5}, Lo/cbu;->a(Lo/ccn;)V

    .line 111
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v5}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    goto :goto_4

    .line 114
    :cond_2
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataCallback cb is exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    :goto_4
    goto :goto_5

    .line 117
    :cond_3
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDataCallback cb is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    :goto_5
    iget v0, p0, Lo/cgc;->f:I

    if-eqz v0, :cond_4

    iget v0, p0, Lo/cgc;->f:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    .line 122
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->L()V

    .line 125
    :cond_4
    return-void
.end method

.method public b()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 364
    iget v0, p0, Lo/cgc;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 365
    const/4 v0, 0x1

    iput v0, p0, Lo/cgc;->f:I

    .line 366
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->ac()V

    .line 369
    :cond_0
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackDataRemoteProxy resumeSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 371
    return-void
.end method

.method public c()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 354
    iget v0, p0, Lo/cgc;->f:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 355
    const/4 v0, 0x3

    iput v0, p0, Lo/cgc;->f:I

    .line 356
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->Z()V

    .line 359
    :cond_0
    return-void
.end method

.method public c(Lo/abd;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 130
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterDataCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    if-eqz p1, :cond_2

    .line 132
    const/4 v4, 0x0

    .line 134
    :try_start_0
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->beginBroadcast()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 137
    goto :goto_0

    .line 135
    :catch_0
    move-exception v5

    .line 136
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "beginBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lo/cgc;->f:I

    .line 141
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unRegisterDataCallback:Report client count "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const/4 v5, 0x0

    .line 145
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_1

    .line 146
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v6}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lo/cgc$a;

    invoke-virtual {v0}, Lo/cgc$a;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-interface {p1}, Lo/abd;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 147
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v6}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cgc$a;

    .line 148
    goto :goto_2

    .line 145
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 154
    :cond_1
    :goto_2
    :try_start_1
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 157
    goto :goto_3

    .line 155
    :catch_1
    move-exception v6

    .line 156
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishBroadcast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    :goto_3
    if-eqz v5, :cond_2

    .line 161
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0, v5}, Lo/cbu;->e(Lo/cbu$e;)V

    .line 162
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-static {v5}, Lo/cbu;->a(Lo/cck;)V

    .line 164
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0, v5}, Lo/cbu;->b(Lo/ccn;)V

    .line 165
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0, v5}, Landroid/os/RemoteCallbackList;->unregister(Landroid/os/IInterface;)Z

    .line 167
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unregister the callback on service"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    :cond_2
    return-void
.end method

.method public d()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lo/cgc;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    if-nez v0, :cond_1

    .line 65
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 67
    :cond_1
    iget v0, p0, Lo/cgc;->f:I

    return v0
.end method

.method public e()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 339
    iget v0, p0, Lo/cgc;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 340
    const/4 v0, 0x2

    iput v0, p0, Lo/cgc;->f:I

    .line 342
    iget-object v0, p0, Lo/cgc;->d:Lo/cbu;

    invoke-virtual {v0}, Lo/cbu;->U()V

    .line 346
    :cond_0
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TrackDataRemoteProxy pauseSport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    return-void
.end method

.method public i()V
    .locals 4

    .line 317
    const-string v0, "Track_TrackDataRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgc;->b:Lcom/huawei/healthcloud/plugintrack/open/TrackService;

    .line 319
    const/4 v0, 0x3

    iput v0, p0, Lo/cgc;->f:I

    .line 321
    sget-object v0, Lo/cgc;->c:Landroid/os/RemoteCallbackList;

    invoke-virtual {v0}, Landroid/os/RemoteCallbackList;->kill()V

    .line 322
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgc;->d:Lo/cbu;

    .line 324
    return-void
.end method

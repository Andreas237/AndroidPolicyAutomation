.class final Lo/brm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brk;


# static fields
.field private static i:Lo/brm;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-string v0, "https://sns%d.hicloud.com/SNS/client/"

    iput-object v0, p0, Lo/brm;->b:Ljava/lang/String;

    .line 36
    const-string v0, "https://im%d.hicloud.com:8443/mps"

    iput-object v0, p0, Lo/brm;->e:Ljava/lang/String;

    .line 41
    const-string v0, "sns.hicloud.com"

    iput-object v0, p0, Lo/brm;->c:Ljava/lang/String;

    .line 46
    const-string v0, "https://im%d.hicloud.com:8443/TRSServer/GetRoute"

    iput-object v0, p0, Lo/brm;->a:Ljava/lang/String;

    .line 51
    const-string v0, "https://im%d.hicloud.com:8443/senswords/GetSensWords"

    iput-object v0, p0, Lo/brm;->d:Ljava/lang/String;

    .line 56
    const-string v0, "https://cis%d.hicloud.com:8443/cis"

    iput-object v0, p0, Lo/brm;->f:Ljava/lang/String;

    .line 61
    const-string v0, "^http://hwid[0-9]*\\.vmall\\.com/oauth2/mobile/login\\.jsp$"

    iput-object v0, p0, Lo/brm;->k:Ljava/lang/String;

    .line 67
    const-string v0, "hwsns"

    const-string v1, "this is release version."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    return-void
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 151
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->b()Lo/axr;

    move-result-object v3

    .line 154
    const/4 v4, 0x1

    .line 155
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lo/axr;->c()I

    move-result v0

    if-gtz v0, :cond_1

    .line 157
    :cond_0
    const-string v0, "ReleaseVersionManager"

    const-string v1, "formatUrl() AccountInfo is null or site id <= 0"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 161
    :cond_1
    invoke-virtual {v3}, Lo/axr;->c()I

    move-result v4

    .line 163
    :goto_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized k()Lo/brm;
    .locals 4

    const-class v2, Lo/brm;

    monitor-enter v2

    .line 72
    :try_start_0
    sget-object v0, Lo/brm;->i:Lo/brm;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 74
    new-instance v0, Lo/brm;

    invoke-direct {v0}, Lo/brm;-><init>()V

    sput-object v0, Lo/brm;->i:Lo/brm;

    .line 76
    :cond_0
    sget-object v0, Lo/brm;->i:Lo/brm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/brm;->c:Ljava/lang/String;

    .line 98
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 2

    .line 83
    iget-object v0, p0, Lo/brm;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/brm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 84
    return-object v1
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 120
    iget-object v0, p0, Lo/brm;->d:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/brm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 121
    return-object v1
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 108
    iget-object v0, p0, Lo/brm;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/brm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 109
    return-object v1
.end method

.method public e()Ljava/lang/String;
    .locals 2

    .line 90
    const-string v0, "https://im%d.hicloud.com:8443/mts"

    invoke-direct {p0, v0}, Lo/brm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 91
    return-object v1
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lo/brm;->k:Ljava/lang/String;

    .line 141
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 2

    .line 133
    iget-object v0, p0, Lo/brm;->f:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/brm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 134
    return-object v1
.end method

.method public i()Ljava/lang/String;
    .locals 2

    .line 126
    iget-object v0, p0, Lo/brm;->e:Ljava/lang/String;

    invoke-direct {p0, v0}, Lo/brm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 127
    return-object v1
.end method

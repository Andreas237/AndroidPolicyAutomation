.class public final Lo/auk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aue;


# static fields
.field private static e:Lo/auk;


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private b:Ljava/lang/Object;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/aud;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    new-instance v0, Lo/auk;

    invoke-direct {v0}, Lo/auk;-><init>()V

    sput-object v0, Lo/auk;->e:Lo/auk;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/auk;->b:Ljava/lang/Object;

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/auk;->d:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/auk;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 53
    return-void
.end method

.method public static a()Lo/auk;
    .locals 1

    .line 57
    sget-object v0, Lo/auk;->e:Lo/auk;

    return-object v0
.end method

.method static synthetic c(Lo/auk;Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lo/auk;->d(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method private d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 5

    .line 183
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 185
    iget-object v3, p0, Lo/auk;->b:Ljava/lang/Object;

    monitor-enter v3

    .line 188
    :try_start_0
    iget-object v0, p0, Lo/auk;->d:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 189
    iget-object v0, p0, Lo/auk;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    .line 192
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aud;

    .line 194
    invoke-direct {p0, v4, p1}, Lo/auk;->d(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 195
    goto :goto_1

    .line 197
    :cond_0
    iget-object v0, p0, Lo/auk;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 198
    return-void
.end method

.method private d(Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 4

    .line 149
    if-eqz p2, :cond_2

    instance-of v0, p2, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;

    if-eqz v0, :cond_2

    .line 151
    move-object v3, p2

    check-cast v3, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;

    .line 153
    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->getErrCode()I

    move-result v0

    if-nez v0, :cond_0

    .line 155
    const-string v0, "MediaServerLoginRequest"

    const-string v1, "login MTS server success"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    invoke-static {}, Lo/ayx;->d()Lo/ayx;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->getSessionExpire()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ayx;->c(I)V

    .line 157
    invoke-static {}, Lo/ayx;->d()Lo/ayx;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ayx;->a(Z)V

    .line 158
    invoke-interface {p1}, Lo/aud;->a()V

    goto :goto_0

    .line 160
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->getErrCode()I

    move-result v0

    const/16 v1, 0x3eb

    if-ne v0, v1, :cond_1

    .line 162
    const-string v0, "MediaServerLoginRequest"

    const-string v1, "login MTS server st error."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    goto :goto_0

    .line 167
    :cond_1
    const-string v0, "MediaServerLoginRequest"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "login MTS server error errcode_:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->getErrCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " response.responseCode : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    iget v0, p2, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->responseCode:I

    invoke-virtual {v3}, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerResponse;->getErrCode()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 173
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/auk;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1}, Lo/auk;->d(Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    return-void
.end method

.method private e(Lo/aud;)V
    .locals 3

    .line 207
    iget-object v1, p0, Lo/auk;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 209
    :try_start_0
    iget-object v0, p0, Lo/auk;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 211
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lo/aud;)V
    .locals 0

    .line 217
    return-void
.end method

.method public b(Lo/aud;)V
    .locals 4

    .line 94
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 96
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->g()Lo/axr;

    move-result-object v2

    .line 97
    if-nez v2, :cond_0

    .line 99
    const-string v0, "MediaServerLoginRequest"

    const-string v1, "accountInfo is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    .line 101
    return-void

    .line 103
    :cond_0
    invoke-static {v2}, Lo/aug;->b(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 105
    const v0, 0x14ffc

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 106
    return-void

    .line 109
    :cond_1
    invoke-static {v2}, Lo/aug;->c(Lo/axr;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 111
    const v0, 0x14ffb

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 112
    return-void

    .line 116
    :cond_2
    iget-object v0, p0, Lo/auk;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    invoke-direct {p0, p1}, Lo/auk;->e(Lo/aud;)V

    .line 119
    return-void

    .line 121
    :cond_3
    iget-object v0, p0, Lo/auk;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 123
    new-instance v3, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;

    invoke-direct {v3, v2}, Lcom/huawei/health/sns/logic/chat/media/LoginMediaServerRequest;-><init>(Lo/axr;)V

    .line 124
    new-instance v0, Lo/auk$1;

    invoke-direct {v0, p0, p1}, Lo/auk$1;-><init>(Lo/auk;Lo/aud;)V

    invoke-static {v3, v0}, Lo/bqr;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lo/bqq;

    .line 134
    goto :goto_0

    .line 137
    :cond_4
    invoke-static {p0, p1}, Lo/aug;->d(Lo/aue;Lo/aud;)V

    .line 138
    const-string v0, "MediaServerLoginRequest"

    const-string v1, "RequestUtil: has not login hwaccount!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    :goto_0
    return-void
.end method

.method public c(Lo/aud;)V
    .locals 4

    .line 64
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    const-string v0, "MediaServerLoginRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OverSea cant not connect,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    return-void

    .line 68
    :cond_0
    const-string v0, "MediaServerLoginRequest"

    const-string v1, "doRequest"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    if-nez p1, :cond_1

    .line 71
    return-void

    .line 74
    :cond_1
    invoke-static {}, Lo/ayx;->d()Lo/ayx;

    move-result-object v0

    invoke-virtual {v0}, Lo/ayx;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 76
    const-string v0, "MediaServerLoginRequest"

    const-string v1, "listener.onLoginSucc"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-interface {p1}, Lo/aud;->a()V

    .line 78
    const-string v0, "MediaServerLoginRequest"

    const-string v1, "has login MTS server session valid"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 82
    :cond_2
    const-string v0, "MediaServerLoginRequest"

    const-string v1, "listener.isSessionValid false"

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0, p1}, Lo/auk;->b(Lo/aud;)V

    .line 85
    :goto_0
    return-void
.end method

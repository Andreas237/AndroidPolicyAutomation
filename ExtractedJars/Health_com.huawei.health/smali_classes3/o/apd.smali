.class public final Lo/apd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/apd;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method

.method public static declared-synchronized a()Lo/apd;
    .locals 3

    const-class v1, Lo/apd;

    monitor-enter v1

    .line 46
    :try_start_0
    sget-object v0, Lo/apd;->a:Lo/apd;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lo/apd;

    invoke-direct {v0}, Lo/apd;-><init>()V

    sput-object v0, Lo/apd;->a:Lo/apd;

    .line 50
    :cond_0
    sget-object v0, Lo/apd;->a:Lo/apd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic a(Lo/apd;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/apd;->d(Ljava/lang/String;)V

    return-void
.end method

.method private b(J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 74
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/apm;->f(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/apd;J)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 1

    .line 23
    invoke-direct {p0, p1, p2}, Lo/apd;->b(J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 1

    .line 84
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->c(Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 3

    .line 60
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    move-result v2

    .line 61
    const/4 v0, -0x1

    if-ne v2, v0, :cond_0

    .line 63
    const-string v0, "ChatDraftManager"

    const-string v1, "saveDraft falied , rowId == -1 "

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/apd;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/apd;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    return-void
.end method


# virtual methods
.method public d(JILjava/lang/String;)V
    .locals 7

    .line 134
    const-string v0, "ChatDraftManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "asyncSaveDraft draftText:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/apd$5;

    move-object v2, p0

    move-object v3, p4

    move-wide v4, p1

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lo/apd$5;-><init>(Lo/apd;Ljava/lang/String;JI)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 183
    return-void
.end method

.method public e(JLandroid/os/Handler;I)V
    .locals 7

    .line 97
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/apd$4;

    move-object v2, p0

    move-wide v3, p1

    move-object v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lo/apd$4;-><init>(Lo/apd;JLandroid/os/Handler;I)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 122
    return-void
.end method

.class public final Lo/aqe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/aqe;


# instance fields
.field private d:Lo/bqy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/bqy<Ljava/lang/Boolean;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    const/4 v0, 0x0

    sput-object v0, Lo/aqe;->a:Lo/aqe;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    return-void
.end method

.method public static declared-synchronized b()Lo/aqe;
    .locals 3

    const-class v1, Lo/aqe;

    monitor-enter v1

    .line 57
    :try_start_0
    sget-object v0, Lo/aqe;->a:Lo/aqe;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lo/aqe;

    invoke-direct {v0}, Lo/aqe;-><init>()V

    sput-object v0, Lo/aqe;->a:Lo/aqe;

    .line 61
    :cond_0
    sget-object v0, Lo/aqe;->a:Lo/aqe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private static b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/os/Handler;I)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/os/Handler;I)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 92
    new-instance v0, Lo/aqe$4;

    invoke-direct {v0, p0, p1, p2}, Lo/aqe$4;-><init>(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/os/Handler;I)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/os/Handler;I)V
    .locals 2

    .line 74
    iget-object v0, p0, Lo/aqe;->d:Lo/bqy;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lo/aqe;->d:Lo/bqy;

    invoke-interface {v0}, Lo/bqy;->b()V

    .line 79
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p1, p2, p3}, Lo/aqe;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/os/Handler;I)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    move-result-object v0

    iput-object v0, p0, Lo/aqe;->d:Lo/bqy;

    .line 80
    return-void
.end method

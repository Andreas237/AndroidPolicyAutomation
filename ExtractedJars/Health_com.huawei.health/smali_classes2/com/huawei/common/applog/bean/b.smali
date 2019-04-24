.class public final Lcom/huawei/common/applog/bean/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lcom/huawei/common/applog/bean/b;


# instance fields
.field private a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Lcom/huawei/common/applog/bean/Event;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Lcom/huawei/common/applog/bean/b;

    invoke-direct {v0}, Lcom/huawei/common/applog/bean/b;-><init>()V

    sput-object v0, Lcom/huawei/common/applog/bean/b;->c:Lcom/huawei/common/applog/bean/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/common/applog/bean/b;->a:Ljava/util/concurrent/BlockingQueue;

    .line 21
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/huawei/common/applog/bean/b;->b:Ljava/util/concurrent/BlockingQueue;

    .line 30
    return-void
.end method

.method public static a()Lcom/huawei/common/applog/bean/b;
    .locals 1

    .line 33
    sget-object v0, Lcom/huawei/common/applog/bean/b;->c:Lcom/huawei/common/applog/bean/b;

    return-object v0
.end method

.method public static b()V
    .locals 0

    .line 40
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/common/applog/bean/Event;)Z
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/common/applog/bean/b;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/util/HashMap;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/huawei/common/applog/bean/b;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public c()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/huawei/common/applog/bean/b;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    return-object v0
.end method

.method public d()Lcom/huawei/common/applog/bean/Event;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/common/applog/bean/b;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/common/applog/bean/Event;

    return-object v0
.end method

.method public e()V
    .locals 2

    .line 82
    const-string v0, "ReportApi"

    const-string v1, "messageQueue and eventQueue clear"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/common/applog/bean/b;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V

    .line 84
    iget-object v0, p0, Lcom/huawei/common/applog/bean/b;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->clear()V

    .line 85
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/common/applog/bean/b;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Ljava/util/concurrent/BlockingQueue;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/concurrent/BlockingQueue<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/huawei/common/applog/bean/b;->a:Ljava/util/concurrent/BlockingQueue;

    return-object v0
.end method

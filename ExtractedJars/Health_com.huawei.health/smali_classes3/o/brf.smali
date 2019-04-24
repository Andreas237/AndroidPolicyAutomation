.class public final Lo/brf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/brf;


# instance fields
.field private d:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<Lo/bqy;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Lo/brf;

    invoke-direct {v0}, Lo/brf;-><init>()V

    sput-object v0, Lo/brf;->c:Lo/brf;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lo/brf;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 27
    return-void
.end method

.method public static c()Lo/brf;
    .locals 1

    .line 31
    sget-object v0, Lo/brf;->c:Lo/brf;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 65
    iget-object v0, p0, Lo/brf;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bqy;

    .line 67
    if-eqz v2, :cond_0

    .line 69
    invoke-interface {v2}, Lo/bqy;->b()V

    .line 71
    :cond_0
    goto :goto_0

    .line 72
    :cond_1
    iget-object v0, p0, Lo/brf;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    .line 73
    return-void
.end method

.method public a(Lo/bqy;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lo/brf;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    iget-object v0, p0, Lo/brf;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 45
    :cond_0
    return-void
.end method

.method public b(Lo/bqy;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lo/brf;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lo/brf;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 58
    :cond_0
    return-void
.end method

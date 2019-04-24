.class Lcom/launchdarkly/eventsource/EventSource$1;
.super Ljava/lang/Object;
.source "EventSource.java"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/eventsource/EventSource;->createThreadFactory(Ljava/lang/String;)Ljava/util/concurrent/ThreadFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/eventsource/EventSource;

.field final synthetic val$backingThreadFactory:Ljava/util/concurrent/ThreadFactory;

.field final synthetic val$count:Ljava/util/concurrent/atomic/AtomicLong;

.field final synthetic val$type:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/launchdarkly/eventsource/EventSource;Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicLong;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/launchdarkly/eventsource/EventSource$1;->this$0:Lcom/launchdarkly/eventsource/EventSource;

    iput-object p2, p0, Lcom/launchdarkly/eventsource/EventSource$1;->val$backingThreadFactory:Ljava/util/concurrent/ThreadFactory;

    iput-object p3, p0, Lcom/launchdarkly/eventsource/EventSource$1;->val$type:Ljava/lang/String;

    iput-object p4, p0, Lcom/launchdarkly/eventsource/EventSource$1;->val$count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 7

    .line 97
    iget-object v0, p0, Lcom/launchdarkly/eventsource/EventSource$1;->val$backingThreadFactory:Ljava/util/concurrent/ThreadFactory;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    .line 98
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v1, "%s-[%s]-%d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/launchdarkly/eventsource/EventSource$1;->val$type:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/launchdarkly/eventsource/EventSource$1;->this$0:Lcom/launchdarkly/eventsource/EventSource;

    invoke-static {v3}, Lcom/launchdarkly/eventsource/EventSource;->access$1000(Lcom/launchdarkly/eventsource/EventSource;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/launchdarkly/eventsource/EventSource$1;->val$count:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v2, v5

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 99
    invoke-virtual {p1, v4}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object p1
.end method

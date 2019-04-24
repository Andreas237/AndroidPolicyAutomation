.class final Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;
.super Ljava/lang/Object;
.source "SKApp.java"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/SKApp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "UncaughtExceptionHandler"
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private handler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field final synthetic this$0:Lcom/shopkick/app/application/SKApp;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/SKApp;Landroid/content/Context;Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 1852
    iput-object p1, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->this$0:Lcom/shopkick/app/application/SKApp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1854
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->handler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 1855
    iput-object p2, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->context:Landroid/content/Context;

    .line 1856
    iput-object p3, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 7

    .line 1863
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->phoneStateNotifier:Lcom/shopkick/app/telephony/PhoneCallStateNotifier;

    invoke-virtual {v0}, Lcom/shopkick/app/telephony/PhoneCallStateNotifier;->stop()V

    .line 1866
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->this$0:Lcom/shopkick/app/application/SKApp;

    iget-object v0, v0, Lcom/shopkick/app/application/SKApp;->presenceController:Lcom/shopkick/app/presence/PresenceController;

    invoke-virtual {v0}, Lcom/shopkick/app/presence/PresenceController;->stopPresenceListening()V

    .line 1868
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "ThreadName"

    .line 1869
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ThrowableClass"

    .line 1870
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ThrowableMessage"

    .line 1871
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ThrowableString"

    .line 1872
    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1874
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1875
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    .line 1876
    :goto_0
    array-length v5, v2

    const/4 v6, 0x4

    if-ge v4, v5, :cond_0

    if-ge v4, v6, :cond_0

    .line 1877
    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v2, v4

    .line 1878
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v2, v4

    .line 1879
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ";"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const-string v2, "CaughtBy"

    .line 1881
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1883
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1884
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1886
    invoke-virtual {v2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    .line 1887
    :goto_1
    array-length v4, v2

    if-ge v3, v4, :cond_1

    if-ge v3, v6, :cond_1

    .line 1888
    aget-object v4, v2, v3

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v4, v2, v3

    .line 1889
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v4, v2, v3

    .line 1890
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "; "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const-string v2, "CausedBy"

    .line 1893
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1895
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    const-string v2, "Uncaught Error"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/application/SKLogger;->onEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 1896
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v1, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->onEndSession(Landroid/content/Context;)V

    .line 1898
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$UncaughtExceptionHandler;->handler:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_2

    .line 1900
    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

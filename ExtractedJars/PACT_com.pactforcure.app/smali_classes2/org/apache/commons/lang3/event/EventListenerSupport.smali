.class public Lorg/apache/commons/lang3/event/EventListenerSupport;
.super Ljava/lang/Object;
.source "EventListenerSupport.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/event/EventListenerSupport$ProxyInvocationHandler;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x31ddd8615c1ecd20L


# instance fields
.field private listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<T",
            "L;",
            ">;"
        }
    .end annotation
.end field

.field private transient prototypeArray:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[T",
            "L;"
        }
    .end annotation
.end field

.field private transient proxy:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "T",
            "L;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 151
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->listeners:Ljava/util/List;

    .line 152
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<T",
            "L;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 122
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    .local p1, "listenerInterface":Ljava/lang/Class;, "Ljava/lang/Class<TL;>;"
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/lang3/event/EventListenerSupport;-><init>(Ljava/lang/Class;Ljava/lang/ClassLoader;)V

    .line 123
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/ClassLoader;)V
    .locals 5
    .param p2, "classLoader"    # Ljava/lang/ClassLoader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<T",
            "L;",
            ">;",
            "Ljava/lang/ClassLoader;",
            ")V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    .local p1, "listenerInterface":Ljava/lang/Class;, "Ljava/lang/Class<TL;>;"
    const/4 v4, 0x0

    .line 139
    invoke-direct {p0}, Lorg/apache/commons/lang3/event/EventListenerSupport;-><init>()V

    .line 140
    const-string v0, "Listener interface cannot be null."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lorg/apache/commons/lang3/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    const-string v0, "ClassLoader cannot be null."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {p2, v0, v1}, Lorg/apache/commons/lang3/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    const-string v1, "Class {0} is not an interface"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lorg/apache/commons/lang3/Validate;->isTrue(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/event/EventListenerSupport;->initializeTransientFields(Ljava/lang/Class;Ljava/lang/ClassLoader;)V

    .line 145
    return-void
.end method

.method static synthetic access$000(Lorg/apache/commons/lang3/event/EventListenerSupport;)Ljava/util/List;
    .locals 1
    .param p0, "x0"    # Lorg/apache/commons/lang3/event/EventListenerSupport;

    .prologue
    .line 66
    iget-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->listeners:Ljava/util/List;

    return-object v0
.end method

.method public static create(Ljava/lang/Class;)Lorg/apache/commons/lang3/event/EventListenerSupport;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lorg/apache/commons/lang3/event/EventListenerSupport",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 106
    .local p0, "listenerInterface":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    new-instance v0, Lorg/apache/commons/lang3/event/EventListenerSupport;

    invoke-direct {v0, p0}, Lorg/apache/commons/lang3/event/EventListenerSupport;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method private createProxy(Ljava/lang/Class;Ljava/lang/ClassLoader;)V
    .locals 2
    .param p2, "classLoader"    # Ljava/lang/ClassLoader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<T",
            "L;",
            ">;",
            "Ljava/lang/ClassLoader;",
            ")V"
        }
    .end annotation

    .prologue
    .line 277
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    .local p1, "listenerInterface":Ljava/lang/Class;, "Ljava/lang/Class<TL;>;"
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {p0}, Lorg/apache/commons/lang3/event/EventListenerSupport;->createInvocationHandler()Ljava/lang/reflect/InvocationHandler;

    move-result-object v1

    invoke-static {p2, v0, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->proxy:Ljava/lang/Object;

    .line 279
    return-void
.end method

.method private initializeTransientFields(Ljava/lang/Class;Ljava/lang/ClassLoader;)V
    .locals 2
    .param p2, "classLoader"    # Ljava/lang/ClassLoader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<T",
            "L;",
            ">;",
            "Ljava/lang/ClassLoader;",
            ")V"
        }
    .end annotation

    .prologue
    .line 266
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    .local p1, "listenerInterface":Ljava/lang/Class;, "Ljava/lang/Class<TL;>;"
    const/4 v1, 0x0

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    move-object v0, v1

    check-cast v0, [Ljava/lang/Object;

    .line 267
    .local v0, "array":[Ljava/lang/Object;, "[TL;"
    iput-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->prototypeArray:[Ljava/lang/Object;

    .line 268
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/lang3/event/EventListenerSupport;->createProxy(Ljava/lang/Class;Ljava/lang/ClassLoader;)V

    .line 269
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 3
    .param p1, "objectInputStream"    # Ljava/io/ObjectInputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/ClassNotFoundException;
        }
    .end annotation

    .prologue
    .line 249
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    move-object v1, v2

    check-cast v1, [Ljava/lang/Object;

    .line 251
    .local v1, "listeners":[Ljava/lang/Object;, "[TL;"
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>([Ljava/lang/Object;)V

    iput-object v2, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->listeners:Ljava/util/List;

    .line 254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    .line 256
    .local v0, "listenerInterface":Ljava/lang/Class;, "Ljava/lang/Class<TL;>;"
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lorg/apache/commons/lang3/event/EventListenerSupport;->initializeTransientFields(Ljava/lang/Class;Ljava/lang/ClassLoader;)V

    .line 257
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 6
    .param p1, "objectOutputStream"    # Ljava/io/ObjectOutputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 221
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .local v3, "serializableListeners":Ljava/util/ArrayList;, "Ljava/util/ArrayList<TL;>;"
    new-instance v4, Ljava/io/ObjectOutputStream;

    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-direct {v4, v5}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 225
    .local v4, "testObjectOutputStream":Ljava/io/ObjectOutputStream;
    iget-object v5, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->listeners:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 227
    .local v2, "listener":Ljava/lang/Object;, "TL;"
    :try_start_0
    invoke-virtual {v4, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 228
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 229
    :catch_0
    move-exception v0

    .line 231
    .local v0, "exception":Ljava/io/IOException;
    new-instance v4, Ljava/io/ObjectOutputStream;

    .end local v4    # "testObjectOutputStream":Ljava/io/ObjectOutputStream;
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-direct {v4, v5}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .restart local v4    # "testObjectOutputStream":Ljava/io/ObjectOutputStream;
    goto :goto_0

    .line 238
    .end local v0    # "exception":Ljava/io/IOException;
    .end local v2    # "listener":Ljava/lang/Object;, "TL;"
    :cond_0
    iget-object v5, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->prototypeArray:[Ljava/lang/Object;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 239
    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L;",
            ")V"
        }
    .end annotation

    .prologue
    .line 179
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    .local p1, "listener":Ljava/lang/Object;, "TL;"
    const-string v0, "Listener object cannot be null."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lorg/apache/commons/lang3/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    iget-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 181
    return-void
.end method

.method protected createInvocationHandler()Ljava/lang/reflect/InvocationHandler;
    .locals 1

    .prologue
    .line 287
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    new-instance v0, Lorg/apache/commons/lang3/event/EventListenerSupport$ProxyInvocationHandler;

    invoke-direct {v0, p0}, Lorg/apache/commons/lang3/event/EventListenerSupport$ProxyInvocationHandler;-><init>(Lorg/apache/commons/lang3/event/EventListenerSupport;)V

    return-object v0
.end method

.method public fire()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()T",
            "L;"
        }
    .end annotation

    .prologue
    .line 163
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->proxy:Ljava/lang/Object;

    return-object v0
.end method

.method getListenerCount()I
    .locals 1

    .prologue
    .line 189
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getListeners()[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[T",
            "L;"
        }
    .end annotation

    .prologue
    .line 212
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->listeners:Ljava/util/List;

    iget-object v1, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->prototypeArray:[Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public removeListener(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L;",
            ")V"
        }
    .end annotation

    .prologue
    .line 201
    .local p0, "this":Lorg/apache/commons/lang3/event/EventListenerSupport;, "Lorg/apache/commons/lang3/event/EventListenerSupport<TL;>;"
    .local p1, "listener":Ljava/lang/Object;, "TL;"
    const-string v0, "Listener object cannot be null."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lorg/apache/commons/lang3/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    iget-object v0, p0, Lorg/apache/commons/lang3/event/EventListenerSupport;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 203
    return-void
.end method

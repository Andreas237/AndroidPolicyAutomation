.class public final Ldagger/internal/Linker;
.super Ljava/lang/Object;
.source "Linker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldagger/internal/Linker$DeferredBinding;,
        Ldagger/internal/Linker$ErrorHandler;,
        Ldagger/internal/Linker$SingletonBinding;
    }
.end annotation


# static fields
.field private static final UNINITIALIZED:Ljava/lang/Object;


# instance fields
.field private attachSuccess:Z

.field private final base:Ldagger/internal/Linker;

.field private final bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ldagger/internal/Binding<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final errorHandler:Ldagger/internal/Linker$ErrorHandler;

.field private final errors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile linkedBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ldagger/internal/Binding<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final plugin:Ldagger/internal/Loader;

.field private final toLink:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ldagger/internal/Binding<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ldagger/internal/Linker;->UNINITIALIZED:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldagger/internal/Linker;Ldagger/internal/Loader;Ldagger/internal/Linker$ErrorHandler;)V
    .locals 1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ldagger/internal/ArrayQueue;

    invoke-direct {v0}, Ldagger/internal/ArrayQueue;-><init>()V

    iput-object v0, p0, Ldagger/internal/Linker;->toLink:Ljava/util/Queue;

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Ldagger/internal/Linker;->attachSuccess:Z

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldagger/internal/Linker;->errors:Ljava/util/List;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Ldagger/internal/Linker;->linkedBindings:Ljava/util/Map;

    if-nez p2, :cond_0

    .line 65
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "plugin"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-nez p3, :cond_1

    .line 66
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "errorHandler"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 68
    :cond_1
    iput-object p1, p0, Ldagger/internal/Linker;->base:Ldagger/internal/Linker;

    .line 69
    iput-object p2, p0, Ldagger/internal/Linker;->plugin:Ldagger/internal/Loader;

    .line 70
    iput-object p3, p0, Ldagger/internal/Linker;->errorHandler:Ldagger/internal/Linker$ErrorHandler;

    return-void
.end method

.method static synthetic access$200()Ljava/lang/Object;
    .locals 1

    .line 30
    sget-object v0, Ldagger/internal/Linker;->UNINITIALIZED:Ljava/lang/Object;

    return-object v0
.end method

.method private addError(Ljava/lang/String;)V
    .locals 1

    .line 336
    iget-object v0, p0, Ldagger/internal/Linker;->errors:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private assertLockHeld()V
    .locals 1

    .line 194
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    return-void
.end method

.method private createBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;Z)Ldagger/internal/Binding;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/ClassLoader;",
            "Z)",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation

    .line 210
    invoke-static {p1}, Ldagger/internal/Keys;->getBuiltInBindingsKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 212
    new-instance p4, Ldagger/internal/BuiltInBinding;

    invoke-direct {p4, p1, p2, p3, v0}, Ldagger/internal/BuiltInBinding;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    return-object p4

    .line 214
    :cond_0
    invoke-static {p1}, Ldagger/internal/Keys;->getLazyKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 216
    new-instance p4, Ldagger/internal/LazyBinding;

    invoke-direct {p4, p1, p2, p3, v0}, Ldagger/internal/LazyBinding;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    return-object p4

    .line 219
    :cond_1
    invoke-static {p1}, Ldagger/internal/Keys;->getClassName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 220
    invoke-static {p1}, Ldagger/internal/Keys;->isAnnotated(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 224
    :cond_2
    iget-object v0, p0, Ldagger/internal/Linker;->plugin:Ldagger/internal/Loader;

    invoke-virtual {v0, p1, p2, p3, p4}, Ldagger/internal/Loader;->getAtInjectBinding(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ldagger/internal/Binding;

    move-result-object p3

    if-eqz p3, :cond_3

    return-object p3

    .line 229
    :cond_3
    new-instance p3, Ldagger/internal/Binding$InvalidBindingException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "could not be bound with key "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p2, p1}, Ldagger/internal/Binding$InvalidBindingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p3

    .line 222
    :cond_4
    :goto_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private putBinding(Ldagger/internal/Binding;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldagger/internal/Binding<",
            "TT;>;)V"
        }
    .end annotation

    .line 305
    iget-object v0, p1, Ldagger/internal/Binding;->provideKey:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 306
    iget-object v0, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    iget-object v1, p1, Ldagger/internal/Binding;->provideKey:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p1}, Ldagger/internal/Linker;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    :cond_0
    iget-object v0, p1, Ldagger/internal/Binding;->membersKey:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 309
    iget-object v0, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    iget-object v1, p1, Ldagger/internal/Binding;->membersKey:Ljava/lang/String;

    invoke-direct {p0, v0, v1, p1}, Ldagger/internal/Linker;->putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private putIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;TK;TV;)V"
        }
    .end annotation

    .line 328
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 330
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method static scope(Ldagger/internal/Binding;)Ldagger/internal/Binding;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldagger/internal/Binding<",
            "TT;>;)",
            "Ldagger/internal/Binding<",
            "TT;>;"
        }
    .end annotation

    .line 317
    invoke-virtual {p0}, Ldagger/internal/Binding;->isSingleton()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of v0, p0, Ldagger/internal/Linker$SingletonBinding;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 320
    :cond_0
    new-instance v0, Ldagger/internal/Linker$SingletonBinding;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldagger/internal/Linker$SingletonBinding;-><init>(Ldagger/internal/Binding;Ldagger/internal/Linker$1;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public fullyLinkedBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ldagger/internal/Binding<",
            "*>;>;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Ldagger/internal/Linker;->linkedBindings:Ljava/util/Map;

    return-object v0
.end method

.method public installBindings(Ldagger/internal/BindingsGroup;)V
    .locals 3

    .line 82
    iget-object v0, p0, Ldagger/internal/Linker;->linkedBindings:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 83
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot install further bindings after calling linkAll()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 85
    :cond_0
    invoke-virtual {p1}, Ldagger/internal/BindingsGroup;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 86
    iget-object v1, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldagger/internal/Binding;

    invoke-static {v0}, Ldagger/internal/Linker;->scope(Ldagger/internal/Binding;)Ldagger/internal/Binding;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public linkAll()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ldagger/internal/Binding<",
            "*>;>;"
        }
    .end annotation

    .line 100
    invoke-direct {p0}, Ldagger/internal/Linker;->assertLockHeld()V

    .line 101
    iget-object v0, p0, Ldagger/internal/Linker;->linkedBindings:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 102
    iget-object v0, p0, Ldagger/internal/Linker;->linkedBindings:Ljava/util/Map;

    return-object v0

    .line 104
    :cond_0
    iget-object v0, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldagger/internal/Binding;

    .line 105
    invoke-virtual {v1}, Ldagger/internal/Binding;->isLinked()Z

    move-result v2

    if-nez v2, :cond_1

    .line 106
    iget-object v2, p0, Ldagger/internal/Linker;->toLink:Ljava/util/Queue;

    invoke-interface {v2, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 109
    :cond_2
    invoke-virtual {p0}, Ldagger/internal/Linker;->linkRequested()V

    .line 110
    iget-object v0, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Ldagger/internal/Linker;->linkedBindings:Ljava/util/Map;

    .line 111
    iget-object v0, p0, Ldagger/internal/Linker;->linkedBindings:Ljava/util/Map;

    return-object v0
.end method

.method public linkRequested()V
    .locals 5

    .line 130
    invoke-direct {p0}, Ldagger/internal/Linker;->assertLockHeld()V

    .line 132
    :goto_0
    iget-object v0, p0, Ldagger/internal/Linker;->toLink:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldagger/internal/Binding;

    if-eqz v0, :cond_4

    .line 133
    instance-of v1, v0, Ldagger/internal/Linker$DeferredBinding;

    if-eqz v1, :cond_2

    .line 134
    move-object v1, v0

    check-cast v1, Ldagger/internal/Linker$DeferredBinding;

    .line 135
    iget-object v2, v1, Ldagger/internal/Linker$DeferredBinding;->deferredKey:Ljava/lang/String;

    .line 136
    iget-boolean v3, v1, Ldagger/internal/Linker$DeferredBinding;->mustHaveInjections:Z

    .line 137
    iget-object v4, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    :try_start_0
    iget-object v4, v0, Ldagger/internal/Binding;->requiredBy:Ljava/lang/Object;

    iget-object v1, v1, Ldagger/internal/Linker$DeferredBinding;->classLoader:Ljava/lang/ClassLoader;

    invoke-direct {p0, v2, v4, v1, v3}, Ldagger/internal/Linker;->createBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;Z)Ldagger/internal/Binding;

    move-result-object v1

    .line 143
    invoke-virtual {v0}, Ldagger/internal/Binding;->library()Z

    move-result v3

    invoke-virtual {v1, v3}, Ldagger/internal/Binding;->setLibrary(Z)V

    .line 144
    invoke-virtual {v0}, Ldagger/internal/Binding;->dependedOn()Z

    move-result v3

    invoke-virtual {v1, v3}, Ldagger/internal/Binding;->setDependedOn(Z)V

    .line 146
    iget-object v3, v1, Ldagger/internal/Binding;->provideKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, v1, Ldagger/internal/Binding;->membersKey:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 147
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to create binding for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 150
    :cond_1
    invoke-static {v1}, Ldagger/internal/Linker;->scope(Ldagger/internal/Binding;)Ldagger/internal/Binding;

    move-result-object v1

    .line 151
    iget-object v3, p0, Ldagger/internal/Linker;->toLink:Ljava/util/Queue;

    invoke-interface {v3, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 152
    invoke-direct {p0, v1}, Ldagger/internal/Linker;->putBinding(Ldagger/internal/Binding;)V
    :try_end_0
    .catch Ldagger/internal/Binding$InvalidBindingException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 165
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 163
    throw v0

    :catch_2
    move-exception v1

    .line 160
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " required by "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Ldagger/internal/Binding;->requiredBy:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ldagger/internal/Linker;->addError(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    sget-object v1, Ldagger/internal/Binding;->UNRESOLVED:Ldagger/internal/Binding;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :catch_3
    move-exception v1

    .line 157
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/UnsupportedOperationException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " required by "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Ldagger/internal/Binding;->requiredBy:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ldagger/internal/Linker;->addError(Ljava/lang/String;)V

    .line 158
    iget-object v0, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    sget-object v1, Ldagger/internal/Binding;->UNRESOLVED:Ldagger/internal/Binding;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :catch_4
    move-exception v1

    .line 154
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Ldagger/internal/Binding$InvalidBindingException;->type:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ldagger/internal/Binding$InvalidBindingException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " required by "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Ldagger/internal/Binding;->requiredBy:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ldagger/internal/Linker;->addError(Ljava/lang/String;)V

    .line 155
    iget-object v0, p0, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    sget-object v1, Ldagger/internal/Binding;->UNRESOLVED:Ldagger/internal/Binding;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_2
    const/4 v1, 0x1

    .line 171
    iput-boolean v1, p0, Ldagger/internal/Linker;->attachSuccess:Z

    .line 172
    invoke-virtual {v0, p0}, Ldagger/internal/Binding;->attach(Ldagger/internal/Linker;)V

    .line 173
    iget-boolean v1, p0, Ldagger/internal/Linker;->attachSuccess:Z

    if-eqz v1, :cond_3

    .line 174
    invoke-virtual {v0}, Ldagger/internal/Binding;->setLinked()V

    goto/16 :goto_0

    .line 176
    :cond_3
    iget-object v1, p0, Ldagger/internal/Linker;->toLink:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 182
    :cond_4
    :try_start_1
    iget-object v0, p0, Ldagger/internal/Linker;->errorHandler:Ldagger/internal/Linker$ErrorHandler;

    iget-object v1, p0, Ldagger/internal/Linker;->errors:Ljava/util/List;

    invoke-interface {v0, v1}, Ldagger/internal/Linker$ErrorHandler;->handleErrors(Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    iget-object v0, p0, Ldagger/internal/Linker;->errors:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ldagger/internal/Linker;->errors:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    throw v0
.end method

.method public requestBinding(Ljava/lang/String;Ljava/lang/Object;)Ldagger/internal/Binding;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 235
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;ZZ)Ldagger/internal/Binding;

    move-result-object p1

    return-object p1
.end method

.method public requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/ClassLoader;",
            ")",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 245
    invoke-virtual/range {v0 .. v5}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;ZZ)Ldagger/internal/Binding;

    move-result-object p1

    return-object p1
.end method

.method public requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;ZZ)Ldagger/internal/Binding;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/ClassLoader;",
            "ZZ)",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation

    .line 269
    invoke-direct {p0}, Ldagger/internal/Linker;->assertLockHeld()V

    const/4 v0, 0x0

    move-object v1, p0

    move-object v2, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 273
    iget-object v2, v1, Ldagger/internal/Linker;->bindings:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldagger/internal/Binding;

    if-eqz v2, :cond_0

    if-eq v1, p0, :cond_1

    .line 275
    invoke-virtual {v2}, Ldagger/internal/Binding;->isLinked()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 272
    :cond_0
    iget-object v1, v1, Ldagger/internal/Linker;->base:Ldagger/internal/Linker;

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    if-nez v2, :cond_2

    .line 282
    new-instance v2, Ldagger/internal/Linker$DeferredBinding;

    const/4 v8, 0x0

    move-object v3, v2

    move-object v4, p1

    move-object v5, p3

    move-object v6, p2

    move v7, p4

    invoke-direct/range {v3 .. v8}, Ldagger/internal/Linker$DeferredBinding;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Object;ZLdagger/internal/Linker$1;)V

    .line 284
    invoke-virtual {v2, p5}, Ldagger/internal/Binding;->setLibrary(Z)V

    .line 285
    invoke-virtual {v2, v1}, Ldagger/internal/Binding;->setDependedOn(Z)V

    .line 286
    iget-object p1, p0, Ldagger/internal/Linker;->toLink:Ljava/util/Queue;

    invoke-interface {p1, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 287
    iput-boolean p1, p0, Ldagger/internal/Linker;->attachSuccess:Z

    return-object v0

    .line 291
    :cond_2
    invoke-virtual {v2}, Ldagger/internal/Binding;->isLinked()Z

    move-result p1

    if-nez p1, :cond_3

    .line 292
    iget-object p1, p0, Ldagger/internal/Linker;->toLink:Ljava/util/Queue;

    invoke-interface {p1, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 295
    :cond_3
    invoke-virtual {v2, p5}, Ldagger/internal/Binding;->setLibrary(Z)V

    .line 296
    invoke-virtual {v2, v1}, Ldagger/internal/Binding;->setDependedOn(Z)V

    return-object v2
.end method

.method public requestBinding(Ljava/lang/String;Ljava/lang/Object;ZZ)Ldagger/internal/Binding;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "ZZ)",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    move v6, p4

    invoke-virtual/range {v1 .. v6}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;ZZ)Ldagger/internal/Binding;

    move-result-object p1

    return-object p1
.end method

.class public final Ldagger/internal/Modules;
.super Ljava/lang/Object;
.source "Modules.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static collectIncludedModulesRecursively(Ldagger/internal/Loader;Ldagger/internal/ModuleAdapter;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Loader;",
            "Ldagger/internal/ModuleAdapter<",
            "*>;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ldagger/internal/ModuleAdapter<",
            "*>;>;)V"
        }
    .end annotation

    .line 74
    iget-object p1, p1, Ldagger/internal/ModuleAdapter;->includes:[Ljava/lang/Class;

    const/4 v0, 0x0

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    .line 75
    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 76
    invoke-virtual {p0, v2}, Ldagger/internal/Loader;->getModuleAdapter(Ljava/lang/Class;)Ldagger/internal/ModuleAdapter;

    move-result-object v3

    .line 77
    invoke-interface {p2, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    invoke-static {p0, v3, p2}, Ldagger/internal/Modules;->collectIncludedModulesRecursively(Ldagger/internal/Loader;Ldagger/internal/ModuleAdapter;Ljava/util/Map;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static loadModules(Ldagger/internal/Loader;[Ljava/lang/Object;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Loader;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map<",
            "Ldagger/internal/ModuleAdapter<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 36
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x0

    array-length v2, p1

    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 38
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 39
    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Class;

    if-eqz v2, :cond_0

    .line 40
    aget-object v2, p1, v1

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {p0, v2}, Ldagger/internal/Loader;->getModuleAdapter(Ljava/lang/Class;)Ldagger/internal/ModuleAdapter;

    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ldagger/internal/ModuleAdapter;->newModule()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 43
    :cond_0
    aget-object v2, p1, v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0, v2}, Ldagger/internal/Loader;->getModuleAdapter(Ljava/lang/Class;)Ldagger/internal/ModuleAdapter;

    move-result-object v2

    .line 44
    aget-object v3, p1, v1

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 50
    :cond_1
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 54
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 56
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldagger/internal/ModuleAdapter;

    .line 57
    invoke-static {p0, v2, v1}, Ldagger/internal/Modules;->collectIncludedModulesRecursively(Ldagger/internal/Loader;Ldagger/internal/ModuleAdapter;Ljava/util/Map;)V

    goto :goto_2

    .line 60
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldagger/internal/ModuleAdapter;

    .line 61
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 62
    invoke-virtual {v0}, Ldagger/internal/ModuleAdapter;->newModule()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    return-object p1
.end method

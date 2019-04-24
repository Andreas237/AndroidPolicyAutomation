.class public final Lio/gsonfire/GsonFireBuilder;
.super Ljava/lang/Object;
.source "GsonFireBuilder.java"


# instance fields
.field private final classConfigMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lio/gsonfire/ClassConfig;",
            ">;"
        }
    .end annotation
.end field

.field private dateDeserializationStrict:Z

.field private dateSerializationPolicy:Lio/gsonfire/DateSerializationPolicy;

.field private enableExclusionByValueStrategies:Z

.field private enableExposeMethodResults:Z

.field private final enumDefaultValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Ljava/lang/Enum;",
            ">;"
        }
    .end annotation
.end field

.field private final factory:Lio/gsonfire/util/reflection/Factory;

.field private final fieldInspector:Lio/gsonfire/util/reflection/FieldInspector;

.field private final orderedClasses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field private final serializationExclusions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/gsonfire/gson/FireExclusionStrategy;",
            ">;"
        }
    .end annotation
.end field

.field private serializeTimeZone:Ljava/util/TimeZone;

.field private final wrappedClasses:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class;",
            "Lio/gsonfire/util/Mapper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/gsonfire/GsonFireBuilder;->classConfigMap:Ljava/util/Map;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/gsonfire/GsonFireBuilder;->wrappedClasses:Ljava/util/Map;

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/gsonfire/GsonFireBuilder;->orderedClasses:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/gsonfire/GsonFireBuilder;->serializationExclusions:Ljava/util/List;

    .line 26
    new-instance v0, Lio/gsonfire/util/reflection/FieldInspector;

    invoke-direct {v0}, Lio/gsonfire/util/reflection/FieldInspector;-><init>()V

    iput-object v0, p0, Lio/gsonfire/GsonFireBuilder;->fieldInspector:Lio/gsonfire/util/reflection/FieldInspector;

    .line 27
    new-instance v0, Lio/gsonfire/util/reflection/CachedReflectionFactory;

    invoke-direct {v0}, Lio/gsonfire/util/reflection/CachedReflectionFactory;-><init>()V

    iput-object v0, p0, Lio/gsonfire/GsonFireBuilder;->factory:Lio/gsonfire/util/reflection/Factory;

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/gsonfire/GsonFireBuilder;->enumDefaultValues:Ljava/util/Map;

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Lio/gsonfire/GsonFireBuilder;->dateDeserializationStrict:Z

    .line 32
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    iput-object v0, p0, Lio/gsonfire/GsonFireBuilder;->serializeTimeZone:Ljava/util/TimeZone;

    const/4 v0, 0x0

    .line 33
    iput-boolean v0, p0, Lio/gsonfire/GsonFireBuilder;->enableExposeMethodResults:Z

    .line 34
    iput-boolean v0, p0, Lio/gsonfire/GsonFireBuilder;->enableExclusionByValueStrategies:Z

    return-void
.end method

.method private getClassConfig(Ljava/lang/Class;)Lio/gsonfire/ClassConfig;
    .locals 2

    .line 37
    iget-object v0, p0, Lio/gsonfire/GsonFireBuilder;->classConfigMap:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/gsonfire/ClassConfig;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Lio/gsonfire/ClassConfig;

    invoke-direct {v0, p1}, Lio/gsonfire/ClassConfig;-><init>(Ljava/lang/Class;)V

    .line 40
    iget-object v1, p0, Lio/gsonfire/GsonFireBuilder;->classConfigMap:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object v1, p0, Lio/gsonfire/GsonFireBuilder;->orderedClasses:Ljava/util/List;

    invoke-static {v1, p1}, Lio/gsonfire/GsonFireBuilder;->insertOrdered(Ljava/util/List;Ljava/lang/Class;)V

    :cond_0
    return-object v0
.end method

.method private static insertOrdered(Ljava/util/List;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    .line 47
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 48
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 50
    invoke-interface {p0, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 54
    invoke-interface {p0, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public createGsonBuilder()Lcom/google/gson/GsonBuilder;
    .locals 5

    .line 228
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    .line 229
    new-instance v1, Lcom/google/gson/GsonBuilder;

    invoke-direct {v1}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 231
    iget-boolean v2, p0, Lio/gsonfire/GsonFireBuilder;->enableExposeMethodResults:Z

    if-eqz v2, :cond_0

    .line 232
    new-instance v2, Lio/gsonfire/gson/FireExclusionStrategyComposite;

    iget-object v3, p0, Lio/gsonfire/GsonFireBuilder;->serializationExclusions:Ljava/util/List;

    invoke-direct {v2, v3}, Lio/gsonfire/gson/FireExclusionStrategyComposite;-><init>(Ljava/util/Collection;)V

    .line 233
    const-class v3, Ljava/lang/Object;

    new-instance v4, Lio/gsonfire/postprocessors/methodinvoker/MethodInvokerPostProcessor;

    invoke-direct {v4, v2}, Lio/gsonfire/postprocessors/methodinvoker/MethodInvokerPostProcessor;-><init>(Lio/gsonfire/gson/FireExclusionStrategy;)V

    invoke-virtual {p0, v3, v4}, Lio/gsonfire/GsonFireBuilder;->registerPostProcessor(Ljava/lang/Class;Lio/gsonfire/PostProcessor;)Lio/gsonfire/GsonFireBuilder;

    .line 236
    :cond_0
    iget-boolean v2, p0, Lio/gsonfire/GsonFireBuilder;->enableExclusionByValueStrategies:Z

    if-eqz v2, :cond_1

    .line 237
    new-instance v2, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;

    iget-object v3, p0, Lio/gsonfire/GsonFireBuilder;->fieldInspector:Lio/gsonfire/util/reflection/FieldInspector;

    iget-object v4, p0, Lio/gsonfire/GsonFireBuilder;->factory:Lio/gsonfire/util/reflection/Factory;

    invoke-direct {v2, v3, v4}, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;-><init>(Lio/gsonfire/util/reflection/FieldInspector;Lio/gsonfire/util/reflection/Factory;)V

    invoke-virtual {v1, v2}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    .line 240
    :cond_1
    iget-object v2, p0, Lio/gsonfire/GsonFireBuilder;->orderedClasses:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    .line 241
    iget-object v4, p0, Lio/gsonfire/GsonFireBuilder;->classConfigMap:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/gsonfire/ClassConfig;

    .line 242
    invoke-virtual {v3}, Lio/gsonfire/ClassConfig;->getTypeSelector()Lio/gsonfire/TypeSelector;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 243
    new-instance v4, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;

    invoke-direct {v4, v3, v0}, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;-><init>(Lio/gsonfire/ClassConfig;Ljava/util/Set;)V

    invoke-virtual {v1, v4}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    .line 245
    :cond_2
    new-instance v4, Lio/gsonfire/gson/FireTypeAdapterFactory;

    invoke-direct {v4, v3}, Lio/gsonfire/gson/FireTypeAdapterFactory;-><init>(Lio/gsonfire/ClassConfig;)V

    invoke-virtual {v1, v4}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    goto :goto_0

    .line 248
    :cond_3
    iget-object v0, p0, Lio/gsonfire/GsonFireBuilder;->enumDefaultValues:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 249
    new-instance v3, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Enum;

    invoke-direct {v3, v4, v2}, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;-><init>(Ljava/lang/Class;Ljava/lang/Enum;)V

    invoke-virtual {v1, v3}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    goto :goto_1

    .line 252
    :cond_4
    iget-object v0, p0, Lio/gsonfire/GsonFireBuilder;->dateSerializationPolicy:Lio/gsonfire/DateSerializationPolicy;

    if-eqz v0, :cond_5

    .line 253
    const-class v2, Ljava/util/Date;

    iget-object v3, p0, Lio/gsonfire/GsonFireBuilder;->serializeTimeZone:Ljava/util/TimeZone;

    invoke-virtual {v0, v3}, Lio/gsonfire/DateSerializationPolicy;->createTypeAdapter(Ljava/util/TimeZone;)Lcom/google/gson/TypeAdapter;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    .line 256
    :cond_5
    new-instance v0, Lio/gsonfire/gson/SimpleIterableTypeAdapterFactory;

    invoke-direct {v0}, Lio/gsonfire/gson/SimpleIterableTypeAdapterFactory;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    .line 257
    new-instance v0, Lio/gsonfire/gson/WrapTypeAdapterFactory;

    iget-object v2, p0, Lio/gsonfire/GsonFireBuilder;->wrappedClasses:Ljava/util/Map;

    invoke-direct {v0, v2}, Lio/gsonfire/gson/WrapTypeAdapterFactory;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapterFactory(Lcom/google/gson/TypeAdapterFactory;)Lcom/google/gson/GsonBuilder;

    return-object v1
.end method

.method public registerPostProcessor(Ljava/lang/Class;Lio/gsonfire/PostProcessor;)Lio/gsonfire/GsonFireBuilder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/gsonfire/PostProcessor<",
            "-TT;>;)",
            "Lio/gsonfire/GsonFireBuilder;"
        }
    .end annotation

    .line 85
    invoke-direct {p0, p1}, Lio/gsonfire/GsonFireBuilder;->getClassConfig(Ljava/lang/Class;)Lio/gsonfire/ClassConfig;

    move-result-object p1

    .line 86
    invoke-virtual {p1}, Lio/gsonfire/ClassConfig;->getPostProcessors()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

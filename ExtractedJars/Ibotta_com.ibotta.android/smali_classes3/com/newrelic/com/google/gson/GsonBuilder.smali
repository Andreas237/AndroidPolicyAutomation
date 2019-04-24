.class public final Lcom/newrelic/com/google/gson/GsonBuilder;
.super Ljava/lang/Object;
.source "GsonBuilder.java"


# instance fields
.field private complexMapKeySerialization:Z

.field private datePattern:Ljava/lang/String;

.field private dateStyle:I

.field private escapeHtmlChars:Z

.field private excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

.field private final factories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/newrelic/com/google/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field private fieldNamingPolicy:Lcom/newrelic/com/google/gson/FieldNamingStrategy;

.field private generateNonExecutableJson:Z

.field private final hierarchyFactories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/newrelic/com/google/gson/TypeAdapterFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final instanceCreators:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Lcom/newrelic/com/google/gson/InstanceCreator<",
            "*>;>;"
        }
    .end annotation
.end field

.field private longSerializationPolicy:Lcom/newrelic/com/google/gson/LongSerializationPolicy;

.field private prettyPrinting:Z

.field private serializeNulls:Z

.field private serializeSpecialFloatingPointValues:Z

.field private timeStyle:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    sget-object v0, Lcom/newrelic/com/google/gson/internal/Excluder;->DEFAULT:Lcom/newrelic/com/google/gson/internal/Excluder;

    iput-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    .line 70
    sget-object v0, Lcom/newrelic/com/google/gson/LongSerializationPolicy;->DEFAULT:Lcom/newrelic/com/google/gson/LongSerializationPolicy;

    iput-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/newrelic/com/google/gson/LongSerializationPolicy;

    .line 71
    sget-object v0, Lcom/newrelic/com/google/gson/FieldNamingPolicy;->IDENTITY:Lcom/newrelic/com/google/gson/FieldNamingPolicy;

    iput-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/newrelic/com/google/gson/FieldNamingStrategy;

    .line 72
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->factories:Ljava/util/List;

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    const/4 v0, 0x2

    .line 79
    iput v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->dateStyle:I

    .line 80
    iput v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->timeStyle:I

    const/4 v0, 0x1

    .line 83
    iput-boolean v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->escapeHtmlChars:Z

    return-void
.end method

.method private addTypeAdaptersForDate(Ljava/lang/String;IILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/newrelic/com/google/gson/TypeAdapterFactory;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    const-string v0, ""

    .line 554
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 555
    new-instance p2, Lcom/newrelic/com/google/gson/DefaultDateTypeAdapter;

    invoke-direct {p2, p1}, Lcom/newrelic/com/google/gson/DefaultDateTypeAdapter;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    if-eq p2, p1, :cond_1

    if-eq p3, p1, :cond_1

    .line 557
    new-instance p1, Lcom/newrelic/com/google/gson/DefaultDateTypeAdapter;

    invoke-direct {p1, p2, p3}, Lcom/newrelic/com/google/gson/DefaultDateTypeAdapter;-><init>(II)V

    .line 562
    :goto_0
    const-class p2, Ljava/util/Date;

    invoke-static {p2}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/newrelic/com/google/gson/reflect/TypeToken;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->newFactory(Lcom/newrelic/com/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    move-result-object p2

    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 563
    const-class p2, Ljava/sql/Timestamp;

    invoke-static {p2}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/newrelic/com/google/gson/reflect/TypeToken;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->newFactory(Lcom/newrelic/com/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    move-result-object p2

    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 564
    const-class p2, Ljava/sql/Date;

    invoke-static {p2}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/newrelic/com/google/gson/reflect/TypeToken;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->newFactory(Lcom/newrelic/com/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    move-result-object p1

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    return-void
.end method


# virtual methods
.method public addDeserializationExclusionStrategy(Lcom/newrelic/com/google/gson/ExclusionStrategy;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 3

    .line 339
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lcom/newrelic/com/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/newrelic/com/google/gson/ExclusionStrategy;ZZ)Lcom/newrelic/com/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    return-object p0
.end method

.method public addSerializationExclusionStrategy(Lcom/newrelic/com/google/gson/ExclusionStrategy;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 3

    .line 322
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/newrelic/com/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/newrelic/com/google/gson/ExclusionStrategy;ZZ)Lcom/newrelic/com/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    return-object p0
.end method

.method public create()Lcom/newrelic/com/google/gson/Gson;
    .locals 13

    .line 539
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 540
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {v11, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 541
    invoke-static {v11}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 542
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-interface {v11, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 543
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    iget v1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->dateStyle:I

    iget v2, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->timeStyle:I

    invoke-direct {p0, v0, v1, v2, v11}, Lcom/newrelic/com/google/gson/GsonBuilder;->addTypeAdaptersForDate(Ljava/lang/String;IILjava/util/List;)V

    .line 545
    new-instance v12, Lcom/newrelic/com/google/gson/Gson;

    iget-object v1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    iget-object v2, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/newrelic/com/google/gson/FieldNamingStrategy;

    iget-object v3, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    iget-boolean v4, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->serializeNulls:Z

    iget-boolean v5, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->complexMapKeySerialization:Z

    iget-boolean v6, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->generateNonExecutableJson:Z

    iget-boolean v7, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->escapeHtmlChars:Z

    iget-boolean v8, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->prettyPrinting:Z

    iget-boolean v9, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    iget-object v10, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/newrelic/com/google/gson/LongSerializationPolicy;

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Lcom/newrelic/com/google/gson/Gson;-><init>(Lcom/newrelic/com/google/gson/internal/Excluder;Lcom/newrelic/com/google/gson/FieldNamingStrategy;Ljava/util/Map;ZZZZZZLcom/newrelic/com/google/gson/LongSerializationPolicy;Ljava/util/List;)V

    return-object v12
.end method

.method public disableHtmlEscaping()Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 362
    iput-boolean v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->escapeHtmlChars:Z

    return-object p0
.end method

.method public disableInnerClassSerialization()Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/internal/Excluder;->disableInnerClassSerialization()Lcom/newrelic/com/google/gson/internal/Excluder;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    return-object p0
.end method

.method public enableComplexMapKeySerialization()Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 238
    iput-boolean v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->complexMapKeySerialization:Z

    return-object p0
.end method

.method public varargs excludeFieldsWithModifiers([I)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    invoke-virtual {v0, p1}, Lcom/newrelic/com/google/gson/internal/Excluder;->withModifiers([I)Lcom/newrelic/com/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    return-object p0
.end method

.method public excludeFieldsWithoutExposeAnnotation()Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/internal/Excluder;->excludeFieldsWithoutExposeAnnotation()Lcom/newrelic/com/google/gson/internal/Excluder;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    return-object p0
.end method

.method public generateNonExecutableJson()Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 134
    iput-boolean v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->generateNonExecutableJson:Z

    return-object p0
.end method

.method public registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 3

    .line 448
    instance-of v0, p2, Lcom/newrelic/com/google/gson/JsonSerializer;

    if-nez v0, :cond_1

    instance-of v1, p2, Lcom/newrelic/com/google/gson/JsonDeserializer;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/newrelic/com/google/gson/InstanceCreator;

    if-nez v1, :cond_1

    instance-of v1, p2, Lcom/newrelic/com/google/gson/TypeAdapter;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lcom/newrelic/com/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V

    .line 452
    instance-of v1, p2, Lcom/newrelic/com/google/gson/InstanceCreator;

    if-eqz v1, :cond_2

    .line 453
    iget-object v1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->instanceCreators:Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Lcom/newrelic/com/google/gson/InstanceCreator;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez v0, :cond_3

    .line 455
    instance-of v0, p2, Lcom/newrelic/com/google/gson/JsonDeserializer;

    if-eqz v0, :cond_4

    .line 456
    :cond_3
    invoke-static {p1}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/newrelic/com/google/gson/reflect/TypeToken;

    move-result-object v0

    .line 457
    iget-object v1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-static {v0, p2}, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->newFactoryWithMatchRawType(Lcom/newrelic/com/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 459
    :cond_4
    instance-of v0, p2, Lcom/newrelic/com/google/gson/TypeAdapter;

    if-eqz v0, :cond_5

    .line 460
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-static {p1}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/newrelic/com/google/gson/reflect/TypeToken;

    move-result-object p1

    check-cast p2, Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-static {p1, p2}, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters;->newFactory(Lcom/newrelic/com/google/gson/reflect/TypeToken;Lcom/newrelic/com/google/gson/TypeAdapter;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object p0
.end method

.method public registerTypeAdapterFactory(Lcom/newrelic/com/google/gson/TypeAdapterFactory;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    .line 474
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->factories:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public registerTypeHierarchyAdapter(Ljava/lang/Class;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/newrelic/com/google/gson/GsonBuilder;"
        }
    .end annotation

    .line 494
    instance-of v0, p2, Lcom/newrelic/com/google/gson/JsonSerializer;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    instance-of v2, p2, Lcom/newrelic/com/google/gson/JsonDeserializer;

    if-nez v2, :cond_1

    instance-of v2, p2, Lcom/newrelic/com/google/gson/TypeAdapter;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    invoke-static {v2}, Lcom/newrelic/com/google/gson/internal/$Gson$Preconditions;->checkArgument(Z)V

    .line 497
    instance-of v2, p2, Lcom/newrelic/com/google/gson/JsonDeserializer;

    if-nez v2, :cond_2

    if-eqz v0, :cond_3

    .line 498
    :cond_2
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->hierarchyFactories:Ljava/util/List;

    invoke-static {p1, p2}, Lcom/newrelic/com/google/gson/TreeTypeAdapter;->newTypeHierarchyFactory(Ljava/lang/Class;Ljava/lang/Object;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 501
    :cond_3
    instance-of v0, p2, Lcom/newrelic/com/google/gson/TypeAdapter;

    if-eqz v0, :cond_4

    .line 502
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->factories:Ljava/util/List;

    check-cast p2, Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-static {p1, p2}, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters;->newTypeHierarchyFactory(Ljava/lang/Class;Lcom/newrelic/com/google/gson/TypeAdapter;)Lcom/newrelic/com/google/gson/TypeAdapterFactory;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object p0
.end method

.method public serializeNulls()Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 157
    iput-boolean v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->serializeNulls:Z

    return-object p0
.end method

.method public serializeSpecialFloatingPointValues()Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 528
    iput-boolean v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->serializeSpecialFloatingPointValues:Z

    return-object p0
.end method

.method public setDateFormat(I)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 0

    .line 403
    iput p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->dateStyle:I

    const/4 p1, 0x0

    .line 404
    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public setDateFormat(II)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 0

    .line 424
    iput p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->dateStyle:I

    .line 425
    iput p2, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->timeStyle:I

    const/4 p1, 0x0

    .line 426
    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public setDateFormat(Ljava/lang/String;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 0

    .line 384
    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->datePattern:Ljava/lang/String;

    return-object p0
.end method

.method public varargs setExclusionStrategies([Lcom/newrelic/com/google/gson/ExclusionStrategy;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 5

    .line 303
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 304
    iget-object v3, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v4, v4}, Lcom/newrelic/com/google/gson/internal/Excluder;->withExclusionStrategy(Lcom/newrelic/com/google/gson/ExclusionStrategy;ZZ)Lcom/newrelic/com/google/gson/internal/Excluder;

    move-result-object v2

    iput-object v2, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public setFieldNamingPolicy(Lcom/newrelic/com/google/gson/FieldNamingPolicy;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/newrelic/com/google/gson/FieldNamingStrategy;

    return-object p0
.end method

.method public setFieldNamingStrategy(Lcom/newrelic/com/google/gson/FieldNamingStrategy;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 0

    .line 288
    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->fieldNamingPolicy:Lcom/newrelic/com/google/gson/FieldNamingStrategy;

    return-object p0
.end method

.method public setLongSerializationPolicy(Lcom/newrelic/com/google/gson/LongSerializationPolicy;)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 0

    .line 262
    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->longSerializationPolicy:Lcom/newrelic/com/google/gson/LongSerializationPolicy;

    return-object p0
.end method

.method public setPrettyPrinting()Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 350
    iput-boolean v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->prettyPrinting:Z

    return-object p0
.end method

.method public setVersion(D)Lcom/newrelic/com/google/gson/GsonBuilder;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    invoke-virtual {v0, p1, p2}, Lcom/newrelic/com/google/gson/internal/Excluder;->withVersion(D)Lcom/newrelic/com/google/gson/internal/Excluder;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/com/google/gson/GsonBuilder;->excluder:Lcom/newrelic/com/google/gson/internal/Excluder;

    return-object p0
.end method

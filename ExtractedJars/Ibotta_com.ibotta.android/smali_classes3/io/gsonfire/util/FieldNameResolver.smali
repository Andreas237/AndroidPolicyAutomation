.class public final Lio/gsonfire/util/FieldNameResolver;
.super Ljava/lang/Object;
.source "FieldNameResolver.java"


# instance fields
.field private final fieldNameCache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldNamingStrategy:Lcom/google/gson/FieldNamingStrategy;


# direct methods
.method public constructor <init>(Lcom/google/gson/Gson;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/gsonfire/util/FieldNameResolver;->fieldNameCache:Ljava/util/concurrent/ConcurrentMap;

    .line 17
    invoke-direct {p0, p1}, Lio/gsonfire/util/FieldNameResolver;->getFieldNamingStrategy(Lcom/google/gson/Gson;)Lcom/google/gson/FieldNamingStrategy;

    move-result-object p1

    iput-object p1, p0, Lio/gsonfire/util/FieldNameResolver;->fieldNamingStrategy:Lcom/google/gson/FieldNamingStrategy;

    return-void
.end method

.method private getFieldNamingStrategy(Lcom/google/gson/Gson;)Lcom/google/gson/FieldNamingStrategy;
    .locals 0

    .line 38
    invoke-virtual {p1}, Lcom/google/gson/Gson;->fieldNamingStrategy()Lcom/google/gson/FieldNamingStrategy;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getFieldName(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 2

    .line 21
    iget-object v0, p0, Lio/gsonfire/util/FieldNameResolver;->fieldNameCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    .line 23
    const-class v0, Lcom/google/gson/annotations/SerializedName;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lcom/google/gson/annotations/SerializedName;

    if-nez v0, :cond_0

    .line 25
    iget-object v0, p0, Lio/gsonfire/util/FieldNameResolver;->fieldNamingStrategy:Lcom/google/gson/FieldNamingStrategy;

    invoke-interface {v0, p1}, Lcom/google/gson/FieldNamingStrategy;->translateName(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {v0}, Lcom/google/gson/annotations/SerializedName;->value()Ljava/lang/String;

    move-result-object v0

    .line 30
    :goto_0
    iget-object v1, p0, Lio/gsonfire/util/FieldNameResolver;->fieldNameCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1}, Ljava/util/concurrent/ConcurrentMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 31
    iget-object v1, p0, Lio/gsonfire/util/FieldNameResolver;->fieldNameCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v1, p1, v0}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

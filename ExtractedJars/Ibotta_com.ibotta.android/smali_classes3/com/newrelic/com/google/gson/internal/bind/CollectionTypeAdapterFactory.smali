.class public final Lcom/newrelic/com/google/gson/internal/bind/CollectionTypeAdapterFactory;
.super Ljava/lang/Object;
.source "CollectionTypeAdapterFactory.java"

# interfaces
.implements Lcom/newrelic/com/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/com/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;
    }
.end annotation


# instance fields
.field private final constructorConstructor:Lcom/newrelic/com/google/gson/internal/ConstructorConstructor;


# direct methods
.method public constructor <init>(Lcom/newrelic/com/google/gson/internal/ConstructorConstructor;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/CollectionTypeAdapterFactory;->constructorConstructor:Lcom/newrelic/com/google/gson/internal/ConstructorConstructor;

    return-void
.end method


# virtual methods
.method public create(Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/reflect/TypeToken;)Lcom/newrelic/com/google/gson/TypeAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/newrelic/com/google/gson/Gson;",
            "Lcom/newrelic/com/google/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lcom/newrelic/com/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 44
    invoke-virtual {p2}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 46
    invoke-virtual {p2}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    .line 47
    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 51
    :cond_0
    invoke-static {v0, v1}, Lcom/newrelic/com/google/gson/internal/$Gson$Types;->getCollectionElementType(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 52
    invoke-static {v0}, Lcom/newrelic/com/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/newrelic/com/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/newrelic/com/google/gson/Gson;->getAdapter(Lcom/newrelic/com/google/gson/reflect/TypeToken;)Lcom/newrelic/com/google/gson/TypeAdapter;

    move-result-object v1

    .line 53
    iget-object v2, p0, Lcom/newrelic/com/google/gson/internal/bind/CollectionTypeAdapterFactory;->constructorConstructor:Lcom/newrelic/com/google/gson/internal/ConstructorConstructor;

    invoke-virtual {v2, p2}, Lcom/newrelic/com/google/gson/internal/ConstructorConstructor;->get(Lcom/newrelic/com/google/gson/reflect/TypeToken;)Lcom/newrelic/com/google/gson/internal/ObjectConstructor;

    move-result-object p2

    .line 56
    new-instance v2, Lcom/newrelic/com/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;

    invoke-direct {v2, p1, v0, v1, p2}, Lcom/newrelic/com/google/gson/internal/bind/CollectionTypeAdapterFactory$Adapter;-><init>(Lcom/newrelic/com/google/gson/Gson;Ljava/lang/reflect/Type;Lcom/newrelic/com/google/gson/TypeAdapter;Lcom/newrelic/com/google/gson/internal/ObjectConstructor;)V

    return-object v2
.end method

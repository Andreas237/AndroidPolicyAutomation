.class public Lio/gsonfire/gson/WrapTypeAdapterFactory;
.super Ljava/lang/Object;
.source "WrapTypeAdapterFactory.java"

# interfaces
.implements Lcom/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/gson/TypeAdapterFactory;"
    }
.end annotation


# instance fields
.field private final wrappedClasses:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/gsonfire/util/Mapper<",
            "TT;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/gsonfire/util/Mapper<",
            "TT;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory;->wrappedClasses:Ljava/util/Map;

    return-void
.end method

.method private getMostSpecificMapper(Ljava/lang/Class;)Lio/gsonfire/util/Mapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            ")",
            "Lio/gsonfire/util/Mapper<",
            "TT;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :goto_0
    if-eqz p1, :cond_1

    .line 39
    iget-object v0, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory;->wrappedClasses:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/gsonfire/util/Mapper;

    if-eqz v0, :cond_0

    return-object v0

    .line 43
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/gson/Gson;",
            "Lcom/google/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lcom/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation

    .line 25
    invoke-virtual {p1, p0, p2}, Lcom/google/gson/Gson;->getDelegateAdapter(Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    move-result-object v0

    .line 26
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p0, p2}, Lio/gsonfire/gson/WrapTypeAdapterFactory;->getMostSpecificMapper(Ljava/lang/Class;)Lio/gsonfire/util/Mapper;

    move-result-object p2

    if-nez p2, :cond_0

    return-object v0

    .line 31
    :cond_0
    new-instance v1, Lio/gsonfire/gson/NullableTypeAdapter;

    new-instance v2, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;

    invoke-direct {v2, p0, p2, p1, v0}, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;-><init>(Lio/gsonfire/gson/WrapTypeAdapterFactory;Lio/gsonfire/util/Mapper;Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V

    invoke-direct {v1, v2}, Lio/gsonfire/gson/NullableTypeAdapter;-><init>(Lcom/google/gson/TypeAdapter;)V

    return-object v1
.end method

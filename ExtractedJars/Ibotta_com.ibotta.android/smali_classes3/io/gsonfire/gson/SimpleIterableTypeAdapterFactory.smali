.class public final Lio/gsonfire/gson/SimpleIterableTypeAdapterFactory;
.super Ljava/lang/Object;
.source "SimpleIterableTypeAdapterFactory.java"

# interfaces
.implements Lcom/google/gson/TypeAdapterFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 2

    .line 19
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lio/gsonfire/util/SimpleIterable;

    if-ne v0, v1, :cond_1

    .line 20
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_0

    .line 21
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object p2

    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 22
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p2

    const/4 v0, 0x0

    aget-object p2, p2, v0

    .line 23
    new-instance v0, Lio/gsonfire/gson/SimpleIterableTypeAdapter;

    invoke-direct {v0, p1, p2}, Lio/gsonfire/gson/SimpleIterableTypeAdapter;-><init>(Lcom/google/gson/Gson;Ljava/lang/reflect/Type;)V

    return-object v0

    .line 25
    :cond_0
    new-instance p2, Lio/gsonfire/gson/SimpleIterableTypeAdapter;

    const-class v0, Ljava/lang/Object;

    invoke-direct {p2, p1, v0}, Lio/gsonfire/gson/SimpleIterableTypeAdapter;-><init>(Lcom/google/gson/Gson;Ljava/lang/reflect/Type;)V

    return-object p2

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

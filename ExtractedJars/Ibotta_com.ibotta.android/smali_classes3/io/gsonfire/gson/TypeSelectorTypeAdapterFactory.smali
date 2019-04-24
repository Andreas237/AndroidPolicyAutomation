.class public Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;
.super Ljava/lang/Object;
.source "TypeSelectorTypeAdapterFactory.java"

# interfaces
.implements Lcom/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory$TypeSelectorTypeAdapter;
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
.field private final alreadyResolvedTypeTokensRegistry:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/gson/reflect/TypeToken;",
            ">;"
        }
    .end annotation
.end field

.field private final classConfig:Lio/gsonfire/ClassConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/gsonfire/ClassConfig<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/gsonfire/ClassConfig;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/gsonfire/ClassConfig<",
            "TT;>;",
            "Ljava/util/Set<",
            "Lcom/google/gson/reflect/TypeToken;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;->classConfig:Lio/gsonfire/ClassConfig;

    .line 24
    iput-object p2, p0, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;->alreadyResolvedTypeTokensRegistry:Ljava/util/Set;

    return-void
.end method

.method static synthetic access$100(Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;)Ljava/util/Set;
    .locals 0

    .line 17
    iget-object p0, p0, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;->alreadyResolvedTypeTokensRegistry:Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 8
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

    .line 29
    iget-object v0, p0, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;->alreadyResolvedTypeTokensRegistry:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 32
    :cond_0
    iget-object v0, p0, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-virtual {v0}, Lio/gsonfire/ClassConfig;->getConfiguredClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    new-instance v0, Lio/gsonfire/gson/NullableTypeAdapter;

    new-instance v7, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory$TypeSelectorTypeAdapter;

    .line 35
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v3

    iget-object p2, p0, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-virtual {p2}, Lio/gsonfire/ClassConfig;->getTypeSelector()Lio/gsonfire/TypeSelector;

    move-result-object v4

    const/4 v6, 0x0

    move-object v1, v7

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v6}, Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory$TypeSelectorTypeAdapter;-><init>(Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory;Ljava/lang/Class;Lio/gsonfire/TypeSelector;Lcom/google/gson/Gson;Lio/gsonfire/gson/TypeSelectorTypeAdapterFactory$1;)V

    invoke-direct {v0, v7}, Lio/gsonfire/gson/NullableTypeAdapter;-><init>(Lcom/google/gson/TypeAdapter;)V

    return-object v0

    :cond_1
    return-object v1
.end method

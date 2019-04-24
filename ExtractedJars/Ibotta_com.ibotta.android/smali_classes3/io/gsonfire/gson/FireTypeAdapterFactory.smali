.class public final Lio/gsonfire/gson/FireTypeAdapterFactory;
.super Ljava/lang/Object;
.source "FireTypeAdapterFactory.java"

# interfaces
.implements Lcom/google/gson/TypeAdapterFactory;


# annotations
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
.field private final classConfig:Lio/gsonfire/ClassConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/gsonfire/ClassConfig<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/gsonfire/ClassConfig;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/gsonfire/ClassConfig<",
            "TT;>;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lio/gsonfire/gson/FireTypeAdapterFactory;->classConfig:Lio/gsonfire/ClassConfig;

    return-void
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

    .line 22
    iget-object v0, p0, Lio/gsonfire/gson/FireTypeAdapterFactory;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-virtual {v0}, Lio/gsonfire/ClassConfig;->getConfiguredClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {p1, p0, p2}, Lcom/google/gson/Gson;->getDelegateAdapter(Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    move-result-object v0

    .line 24
    new-instance v1, Lio/gsonfire/gson/FireTypeAdapter;

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object p2

    iget-object v2, p0, Lio/gsonfire/gson/FireTypeAdapterFactory;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-direct {v1, p2, v2, v0, p1}, Lio/gsonfire/gson/FireTypeAdapter;-><init>(Ljava/lang/Class;Lio/gsonfire/ClassConfig;Lcom/google/gson/TypeAdapter;Lcom/google/gson/Gson;)V

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

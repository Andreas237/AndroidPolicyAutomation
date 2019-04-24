.class public final Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;
.super Ljava/lang/Object;
.source "EnumDefaultValueTypeAdapterFactory.java"

# interfaces
.implements Lcom/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Enum;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/gson/TypeAdapterFactory;"
    }
.end annotation


# instance fields
.field private final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final defaultValue:Ljava/lang/Enum;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Enum;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;->clazz:Ljava/lang/Class;

    .line 22
    iput-object p2, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;->defaultValue:Ljava/lang/Enum;

    return-void
.end method

.method static synthetic access$000(Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;)Ljava/lang/Enum;
    .locals 0

    .line 15
    iget-object p0, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;->defaultValue:Ljava/lang/Enum;

    return-object p0
.end method


# virtual methods
.method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 2
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

    .line 27
    iget-object v0, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;->clazz:Ljava/lang/Class;

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {p1, p0, p2}, Lcom/google/gson/Gson;->getDelegateAdapter(Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    move-result-object p1

    .line 29
    new-instance p2, Lio/gsonfire/gson/NullableTypeAdapter;

    new-instance v0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory$1;

    invoke-direct {v0, p0, p1}, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory$1;-><init>(Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;Lcom/google/gson/TypeAdapter;)V

    invoke-direct {p2, v0}, Lio/gsonfire/gson/NullableTypeAdapter;-><init>(Lcom/google/gson/TypeAdapter;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

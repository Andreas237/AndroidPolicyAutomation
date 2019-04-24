.class public final Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;
.super Ljava/lang/Object;
.source "ExcludeByValueTypeAdapterFactory.java"

# interfaces
.implements Lcom/google/gson/TypeAdapterFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;
    }
.end annotation


# instance fields
.field private final factory:Lio/gsonfire/util/reflection/Factory;

.field private final fieldInspector:Lio/gsonfire/util/reflection/FieldInspector;

.field private fieldNameResolver:Lio/gsonfire/util/FieldNameResolver;


# direct methods
.method public constructor <init>(Lio/gsonfire/util/reflection/FieldInspector;Lio/gsonfire/util/reflection/Factory;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->fieldNameResolver:Lio/gsonfire/util/FieldNameResolver;

    .line 26
    iput-object p1, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->fieldInspector:Lio/gsonfire/util/reflection/FieldInspector;

    .line 27
    iput-object p2, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->factory:Lio/gsonfire/util/reflection/Factory;

    return-void
.end method

.method static synthetic access$000(Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;)Lio/gsonfire/util/reflection/FieldInspector;
    .locals 0

    .line 18
    iget-object p0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->fieldInspector:Lio/gsonfire/util/reflection/FieldInspector;

    return-object p0
.end method

.method static synthetic access$100(Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;)Lio/gsonfire/util/reflection/Factory;
    .locals 0

    .line 18
    iget-object p0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->factory:Lio/gsonfire/util/reflection/Factory;

    return-object p0
.end method

.method static synthetic access$200(Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;)Lio/gsonfire/util/FieldNameResolver;
    .locals 0

    .line 18
    iget-object p0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->fieldNameResolver:Lio/gsonfire/util/FieldNameResolver;

    return-object p0
.end method


# virtual methods
.method public create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
    .locals 1
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

    .line 32
    iget-object v0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->fieldNameResolver:Lio/gsonfire/util/FieldNameResolver;

    if-nez v0, :cond_0

    .line 33
    new-instance v0, Lio/gsonfire/util/FieldNameResolver;

    invoke-direct {v0, p1}, Lio/gsonfire/util/FieldNameResolver;-><init>(Lcom/google/gson/Gson;)V

    iput-object v0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->fieldNameResolver:Lio/gsonfire/util/FieldNameResolver;

    .line 35
    :cond_0
    invoke-virtual {p1, p0, p2}, Lcom/google/gson/Gson;->getDelegateAdapter(Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    move-result-object p2

    .line 36
    new-instance v0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;

    invoke-direct {v0, p0, p1, p2}, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;-><init>(Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V

    return-object v0
.end method

.class public final Lio/gsonfire/gson/HooksInvoker;
.super Ljava/lang/Object;
.source "HooksInvoker.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;
    }
.end annotation


# static fields
.field private static final SUPPORTED_TYPES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private inspector:Lio/gsonfire/util/reflection/AbstractMethodInspector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/gsonfire/util/reflection/AbstractMethodInspector<",
            "Lio/gsonfire/util/reflection/MethodInvoker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 22
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Lcom/google/gson/JsonElement;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/google/gson/Gson;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lio/gsonfire/gson/HooksInvoker;->SUPPORTED_TYPES:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lio/gsonfire/gson/HooksInvoker$1;

    invoke-direct {v0, p0}, Lio/gsonfire/gson/HooksInvoker$1;-><init>(Lio/gsonfire/gson/HooksInvoker;)V

    iput-object v0, p0, Lio/gsonfire/gson/HooksInvoker;->inspector:Lio/gsonfire/util/reflection/AbstractMethodInspector;

    return-void
.end method

.method static synthetic access$000()Ljava/util/Set;
    .locals 1

    .line 20
    sget-object v0, Lio/gsonfire/gson/HooksInvoker;->SUPPORTED_TYPES:Ljava/util/Set;

    return-object v0
.end method

.method private invokeAll(Ljava/lang/Object;Ljava/lang/Class;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/google/gson/JsonElement;",
            "Lcom/google/gson/Gson;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 48
    iget-object v0, p0, Lio/gsonfire/gson/HooksInvoker;->inspector:Lio/gsonfire/util/reflection/AbstractMethodInspector;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lio/gsonfire/util/reflection/AbstractMethodInspector;->getAnnotatedMembers(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/gsonfire/util/reflection/MethodInvoker;

    .line 50
    :try_start_0
    new-instance v1, Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;

    const/4 v2, 0x0

    invoke-direct {v1, p3, p4, v2}, Lio/gsonfire/gson/HooksInvoker$HooksInvokerValueSupplier;-><init>(Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;Lio/gsonfire/gson/HooksInvoker$1;)V

    invoke-virtual {v0, p1, v1}, Lio/gsonfire/util/reflection/MethodInvoker;->invoke(Ljava/lang/Object;Lio/gsonfire/util/reflection/MethodInvoker$ValueSupplier;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public postDeserialize(Ljava/lang/Object;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V
    .locals 1

    .line 43
    const-class v0, Lio/gsonfire/annotations/PostDeserialize;

    invoke-direct {p0, p1, v0, p2, p3}, Lio/gsonfire/gson/HooksInvoker;->invokeAll(Ljava/lang/Object;Ljava/lang/Class;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V

    return-void
.end method

.method public preSerialize(Ljava/lang/Object;)V
    .locals 2

    .line 39
    const-class v0, Lio/gsonfire/annotations/PreSerialize;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1, v1}, Lio/gsonfire/gson/HooksInvoker;->invokeAll(Ljava/lang/Object;Ljava/lang/Class;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V

    return-void
.end method

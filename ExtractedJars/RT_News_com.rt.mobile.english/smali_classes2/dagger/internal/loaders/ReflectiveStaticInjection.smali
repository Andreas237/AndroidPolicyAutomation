.class public final Ldagger/internal/loaders/ReflectiveStaticInjection;
.super Ldagger/internal/StaticInjection;
.source "ReflectiveStaticInjection.java"


# instance fields
.field private bindings:[Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation
.end field

.field private final fields:[Ljava/lang/reflect/Field;

.field private final loader:Ljava/lang/ClassLoader;


# direct methods
.method private constructor <init>(Ljava/lang/ClassLoader;[Ljava/lang/reflect/Field;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ldagger/internal/StaticInjection;-><init>()V

    .line 37
    iput-object p2, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->fields:[Ljava/lang/reflect/Field;

    .line 38
    iput-object p1, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->loader:Ljava/lang/ClassLoader;

    return-void
.end method

.method public static create(Ljava/lang/Class;)Ldagger/internal/StaticInjection;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ldagger/internal/StaticInjection;"
        }
    .end annotation

    .line 61
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v1, v2

    .line 63
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-eqz v5, :cond_0

    const-class v5, Ljavax/inject/Inject;

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    .line 64
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 65
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 68
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 69
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No static injections: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_2
    new-instance v1, Ldagger/internal/loaders/ReflectiveStaticInjection;

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/reflect/Field;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/reflect/Field;

    invoke-direct {v1, p0, v0}, Ldagger/internal/loaders/ReflectiveStaticInjection;-><init>(Ljava/lang/ClassLoader;[Ljava/lang/reflect/Field;)V

    return-object v1
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 5

    .line 42
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->fields:[Ljava/lang/reflect/Field;

    const/4 v1, 0x0

    array-length v0, v0

    new-array v0, v0, [Ldagger/internal/Binding;

    iput-object v0, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->bindings:[Ldagger/internal/Binding;

    .line 43
    :goto_0
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->fields:[Ljava/lang/reflect/Field;

    array-length v0, v0

    if-ge v1, v0, :cond_0

    .line 44
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->fields:[Ljava/lang/reflect/Field;

    aget-object v0, v0, v1

    .line 45
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v3

    invoke-static {v2, v3, v0}, Ldagger/internal/Keys;->get(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 46
    iget-object v3, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->bindings:[Ldagger/internal/Binding;

    iget-object v4, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->loader:Ljava/lang/ClassLoader;

    invoke-virtual {p1, v2, v0, v4}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v0

    aput-object v0, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public inject()V
    .locals 4

    const/4 v0, 0x0

    .line 52
    :goto_0
    :try_start_0
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->fields:[Ljava/lang/reflect/Field;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 53
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->fields:[Ljava/lang/reflect/Field;

    aget-object v1, v1, v0

    const/4 v2, 0x0

    iget-object v3, p0, Ldagger/internal/loaders/ReflectiveStaticInjection;->bindings:[Ldagger/internal/Binding;

    aget-object v3, v3, v0

    invoke-virtual {v3}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    .line 56
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

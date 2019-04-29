.class public final Ldagger/internal/loaders/ReflectiveAtInjectBinding;
.super Ldagger/internal/Binding;
.source "ReflectiveAtInjectBinding.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ldagger/internal/Binding<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final constructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final fieldBindings:[Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation
.end field

.field private final fields:[Ljava/lang/reflect/Field;

.field private final keys:[Ljava/lang/String;

.field private final loader:Ljava/lang/ClassLoader;

.field private final parameterBindings:[Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ldagger/internal/Binding<",
            "*>;"
        }
    .end annotation
.end field

.field private final supertype:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private supertypeBinding:Ldagger/internal/Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Binding<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Class;[Ljava/lang/reflect/Field;Ljava/lang/reflect/Constructor;ILjava/lang/Class;[Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/reflect/Constructor<",
            "TT;>;I",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 59
    invoke-direct {p0, p1, p2, p3, p4}, Ldagger/internal/Binding;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;)V

    .line 60
    iput-object p6, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->constructor:Ljava/lang/reflect/Constructor;

    .line 61
    iput-object p5, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fields:[Ljava/lang/reflect/Field;

    .line 62
    iput-object p8, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->supertype:Ljava/lang/Class;

    .line 63
    iput-object p9, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->keys:[Ljava/lang/String;

    .line 64
    new-array p1, p7, [Ldagger/internal/Binding;

    iput-object p1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    .line 65
    array-length p1, p5

    new-array p1, p1, [Ldagger/internal/Binding;

    iput-object p1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fieldBindings:[Ldagger/internal/Binding;

    .line 66
    invoke-virtual {p4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    iput-object p1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->loader:Ljava/lang/ClassLoader;

    return-void
.end method

.method public static create(Ljava/lang/Class;Z)Ldagger/internal/Binding;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;Z)",
            "Ldagger/internal/Binding<",
            "TT;>;"
        }
    .end annotation

    .line 145
    const-class v0, Ljavax/inject/Singleton;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v4

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 149
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v2, p0

    .line 150
    :goto_0
    const-class v3, Ljava/lang/Object;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v2, v3, :cond_4

    .line 151
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    array-length v7, v3

    :goto_1
    if-ge v6, v7, :cond_3

    aget-object v8, v3, v6

    .line 152
    const-class v9, Ljavax/inject/Inject;

    invoke-virtual {v8, v9}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v9

    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    .line 155
    :cond_0
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v9

    and-int/lit8 v9, v9, 0x2

    if-eqz v9, :cond_1

    .line 156
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Can\'t inject private field: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 158
    :cond_1
    invoke-virtual {v8, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 159
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v9

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v10

    invoke-static {v9, v10, v8}, Ldagger/internal/Keys;->get(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 150
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 168
    :cond_4
    invoke-static {p0}, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->getConstructorsForType(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;

    move-result-object v2

    const/4 v3, 0x0

    array-length v7, v2

    move-object v9, v3

    move v8, v6

    :goto_3
    if-ge v8, v7, :cond_7

    aget-object v10, v2, v8

    .line 169
    const-class v11, Ljavax/inject/Inject;

    invoke-virtual {v10, v11}, Ljava/lang/reflect/Constructor;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_4

    :cond_5
    if-eqz v9, :cond_6

    .line 173
    new-instance p1, Ldagger/internal/Binding$InvalidBindingException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "has too many injectable constructors"

    invoke-direct {p1, p0, v0}, Ldagger/internal/Binding$InvalidBindingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p1

    :cond_6
    move-object v9, v10

    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_7
    if-nez v9, :cond_9

    .line 178
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    .line 180
    :try_start_0
    new-array p1, v6, [Ljava/lang/Class;

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v7, p1

    goto :goto_5

    :cond_8
    if-eqz p1, :cond_9

    .line 184
    new-instance p1, Ldagger/internal/Binding$InvalidBindingException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "has no injectable members. Do you want to add an injectable constructor?"

    invoke-direct {p1, p0, v0}, Ldagger/internal/Binding$InvalidBindingException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p1

    :catch_0
    :cond_9
    move-object v7, v9

    :goto_5
    if-eqz v7, :cond_c

    .line 192
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result p1

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_a

    .line 193
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Can\'t inject private constructor: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 196
    :cond_a
    invoke-static {p0}, Ldagger/internal/Keys;->get(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p1

    .line 197
    invoke-virtual {v7, v5}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 198
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v2

    .line 199
    array-length v5, v2

    if-eqz v5, :cond_b

    .line 201
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v8

    .line 202
    :goto_6
    array-length v9, v2

    if-ge v6, v9, :cond_b

    .line 203
    aget-object v9, v2, v6

    aget-object v10, v8, v6

    invoke-static {v9, v10, v7}, Ldagger/internal/Keys;->get(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_b
    move-object v2, p1

    move v8, v5

    goto :goto_7

    :cond_c
    if-eqz v4, :cond_d

    .line 210
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "No injectable constructor on @Singleton "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    move-object v2, v3

    move v8, v6

    .line 215
    :goto_7
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_f

    .line 217
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ldagger/internal/Keys;->isPlatformType(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    move-object v9, v3

    goto :goto_8

    .line 220
    :cond_e
    invoke-static {p1}, Ldagger/internal/Keys;->getMembersKey(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    move-object v9, p1

    .line 224
    :goto_8
    invoke-static {p0}, Ldagger/internal/Keys;->getMembersKey(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    .line 225
    new-instance p1, Ldagger/internal/loaders/ReflectiveAtInjectBinding;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Ljava/lang/reflect/Field;

    invoke-interface {v1, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, [Ljava/lang/reflect/Field;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, [Ljava/lang/String;

    move-object v1, p1

    move-object v5, p0

    invoke-direct/range {v1 .. v10}, Ldagger/internal/loaders/ReflectiveAtInjectBinding;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Class;[Ljava/lang/reflect/Field;Ljava/lang/reflect/Constructor;ILjava/lang/Class;[Ljava/lang/String;)V

    return-object p1
.end method

.method private static getConstructorsForType(Ljava/lang/Class;)[Ljava/lang/reflect/Constructor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)[",
            "Ljava/lang/reflect/Constructor<",
            "TT;>;"
        }
    .end annotation

    .line 232
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p0

    check-cast p0, [Ljava/lang/reflect/Constructor;

    return-object p0
.end method


# virtual methods
.method public attach(Ldagger/internal/Linker;)V
    .locals 9

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    .line 72
    :goto_0
    iget-object v3, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fields:[Ljava/lang/reflect/Field;

    array-length v3, v3

    if-ge v1, v3, :cond_1

    .line 73
    iget-object v3, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fieldBindings:[Ldagger/internal/Binding;

    aget-object v3, v3, v1

    if-nez v3, :cond_0

    .line 74
    iget-object v3, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fieldBindings:[Ldagger/internal/Binding;

    iget-object v4, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->keys:[Ljava/lang/String;

    aget-object v4, v4, v2

    iget-object v5, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fields:[Ljava/lang/reflect/Field;

    aget-object v5, v5, v1

    iget-object v6, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->loader:Ljava/lang/ClassLoader;

    invoke-virtual {p1, v4, v5, v6}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v4

    aput-object v4, v3, v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 78
    :cond_1
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->constructor:Ljava/lang/reflect/Constructor;

    if-eqz v1, :cond_3

    .line 79
    :goto_1
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    .line 80
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    aget-object v1, v1, v0

    if-nez v1, :cond_2

    .line 81
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    iget-object v3, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->keys:[Ljava/lang/String;

    aget-object v3, v3, v2

    iget-object v4, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->constructor:Ljava/lang/reflect/Constructor;

    iget-object v5, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->loader:Ljava/lang/ClassLoader;

    invoke-virtual {p1, v3, v4, v5}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ldagger/internal/Binding;

    move-result-object v3

    aput-object v3, v1, v0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 86
    :cond_3
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->supertype:Ljava/lang/Class;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->supertypeBinding:Ldagger/internal/Binding;

    if-nez v0, :cond_4

    .line 87
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->keys:[Ljava/lang/String;

    aget-object v4, v0, v2

    iget-object v5, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->membersKey:Ljava/lang/String;

    iget-object v6, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->loader:Ljava/lang/ClassLoader;

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Ldagger/internal/Linker;->requestBinding(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/ClassLoader;ZZ)Ldagger/internal/Binding;

    move-result-object p1

    iput-object p1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->supertypeBinding:Ldagger/internal/Binding;

    :cond_4
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->constructor:Ljava/lang/reflect/Constructor;

    if-nez v0, :cond_0

    .line 94
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 96
    :cond_0
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 97
    :goto_0
    iget-object v2, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    array-length v2, v2

    if-ge v1, v2, :cond_1

    .line 98
    iget-object v2, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 102
    :cond_1
    :try_start_0
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->constructor:Ljava/lang/reflect/Constructor;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    invoke-virtual {p0, v0}, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->injectMembers(Ljava/lang/Object;)V

    return-object v0

    :catch_0
    move-exception v0

    .line 111
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 109
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :catch_2
    move-exception v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 105
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/RuntimeException;

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v1

    :goto_1
    throw v0
.end method

.method public getDependencies(Ljava/util/Set;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ldagger/internal/Binding<",
            "*>;>;",
            "Ljava/util/Set<",
            "Ldagger/internal/Binding<",
            "*>;>;)V"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->parameterBindings:[Ldagger/internal/Binding;

    invoke-static {p1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 134
    :cond_0
    iget-object p1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fieldBindings:[Ldagger/internal/Binding;

    invoke-static {p2, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 135
    iget-object p1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->supertypeBinding:Ldagger/internal/Binding;

    if-eqz p1, :cond_1

    .line 136
    iget-object p1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->supertypeBinding:Ldagger/internal/Binding;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public injectMembers(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 119
    :goto_0
    :try_start_0
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fields:[Ljava/lang/reflect/Field;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 120
    iget-object v1, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fields:[Ljava/lang/reflect/Field;

    aget-object v1, v1, v0

    iget-object v2, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->fieldBindings:[Ldagger/internal/Binding;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Ldagger/internal/Binding;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 122
    :cond_0
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->supertypeBinding:Ldagger/internal/Binding;

    if-eqz v0, :cond_1

    .line 123
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->supertypeBinding:Ldagger/internal/Binding;

    invoke-virtual {v0, p1}, Ldagger/internal/Binding;->injectMembers(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    .line 126
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->provideKey:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->provideKey:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ldagger/internal/loaders/ReflectiveAtInjectBinding;->membersKey:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

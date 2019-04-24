.class final Lretrofit/Types;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lretrofit/Types$WildcardTypeImpl;,
        Lretrofit/Types$GenericArrayTypeImpl;,
        Lretrofit/Types$ParameterizedTypeImpl;
    }
.end annotation


# static fields
.field private static final EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/reflect/Type;

    sput-object v0, Lretrofit/Types;->EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    return-void
.end method

.method static synthetic access$000(Ljava/lang/reflect/Type;)V
    .locals 0

    .line 34
    invoke-static {p0}, Lretrofit/Types;->checkNotPrimitive(Ljava/lang/reflect/Type;)V

    return-void
.end method

.method static synthetic access$100(Ljava/lang/Object;)I
    .locals 1

    .line 34
    invoke-static {p0}, Lretrofit/Types;->hashCodeOrZero(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static synthetic access$200()[Ljava/lang/reflect/Type;
    .locals 1

    .line 34
    sget-object v0, Lretrofit/Types;->EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;

    return-object v0
.end method

.method private static checkNotPrimitive(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 280
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 281
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 283
    :cond_0
    return-void
.end method

.method private static declaringClassOf(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/reflect/TypeVariable<*>;)Ljava/lang/Class<*>;"
        }
    .end annotation

    .line 275
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v1

    .line 276
    instance-of v0, v1, Ljava/lang/Class;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private static equal(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 160
    if-eq p0, p1, :cond_0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 4

    .line 76
    if-ne p0, p1, :cond_0

    .line 77
    const/4 v0, 0x1

    return v0

    .line 79
    :cond_0
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 82
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_4

    .line 83
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    return v0

    .line 84
    :cond_2
    move-object v2, p0

    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .line 85
    move-object v3, p1

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 86
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v1}, Lretrofit/Types;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 88
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 90
    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_6

    .line 91
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_5

    const/4 v0, 0x0

    return v0

    .line 92
    :cond_5
    move-object v2, p0

    check-cast v2, Ljava/lang/reflect/GenericArrayType;

    .line 93
    move-object v3, p1

    check-cast v3, Ljava/lang/reflect/GenericArrayType;

    .line 94
    invoke-interface {v2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v1}, Lretrofit/Types;->equals(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v0

    return v0

    .line 96
    :cond_6
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_9

    .line 97
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    if-nez v0, :cond_7

    const/4 v0, 0x0

    return v0

    .line 98
    :cond_7
    move-object v2, p0

    check-cast v2, Ljava/lang/reflect/WildcardType;

    .line 99
    move-object v3, p1

    check-cast v3, Ljava/lang/reflect/WildcardType;

    .line 100
    invoke-interface {v2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 101
    invoke-interface {v2}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    goto :goto_1

    :cond_8
    const/4 v0, 0x0

    :goto_1
    return v0

    .line 103
    :cond_9
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_c

    .line 104
    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    if-nez v0, :cond_a

    const/4 v0, 0x0

    return v0

    .line 105
    :cond_a
    move-object v2, p0

    check-cast v2, Ljava/lang/reflect/TypeVariable;

    .line 106
    move-object v3, p1

    check-cast v3, Ljava/lang/reflect/TypeVariable;

    .line 107
    invoke-interface {v2}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v1

    if-ne v0, v1, :cond_b

    .line 108
    invoke-interface {v2}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v0, 0x1

    goto :goto_2

    :cond_b
    const/4 v0, 0x0

    :goto_2
    return v0

    .line 111
    :cond_c
    const/4 v0, 0x0

    return v0
.end method

.method static getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/reflect/Type;Ljava/lang/Class<*>;Ljava/lang/Class<*>;)Ljava/lang/reflect/Type;"
        }
    .end annotation

    .line 121
    if-ne p2, p1, :cond_0

    return-object p0

    .line 124
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 125
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v2

    .line 126
    const/4 v3, 0x0

    array-length v4, v2

    :goto_0
    if-ge v3, v4, :cond_3

    .line 127
    aget-object v0, v2, v3

    if-ne v0, p2, :cond_1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v3

    return-object v0

    .line 129
    :cond_1
    aget-object v0, v2, v3

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v3

    aget-object v1, v2, v3

    invoke-static {v0, v1, p2}, Lretrofit/Types;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0

    .line 126
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 136
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-nez v0, :cond_6

    .line 137
    :goto_1
    const-class v0, Ljava/lang/Object;

    if-eq p1, v0, :cond_6

    .line 138
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    .line 139
    if-ne v2, p2, :cond_4

    .line 140
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0

    .line 141
    :cond_4
    invoke-virtual {p2, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 142
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0, v2, p2}, Lretrofit/Types;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0

    .line 144
    :cond_5
    move-object p1, v2

    .line 145
    goto :goto_1

    .line 149
    :cond_6
    return-object p2
.end method

.method public static getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/reflect/Type;)Ljava/lang/Class<*>;"
        }
    .end annotation

    .line 42
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 44
    move-object v0, p0

    check-cast v0, Ljava/lang/Class;

    return-object v0

    .line 46
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2

    .line 47
    move-object v3, p0

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 51
    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v4

    .line 52
    instance-of v0, v4, Ljava/lang/Class;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 53
    :cond_1
    move-object v0, v4

    check-cast v0, Ljava/lang/Class;

    return-object v0

    .line 55
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_3

    .line 56
    move-object v0, p0

    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v3

    .line 57
    invoke-static {v3}, Lretrofit/Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    .line 59
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_4

    .line 62
    const-class v0, Ljava/lang/Object;

    return-object v0

    .line 64
    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_5

    .line 65
    move-object v0, p0

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Lretrofit/Types;->getRawType(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    return-object v0

    .line 68
    :cond_5
    if-nez p0, :cond_6

    const-string v3, "null"

    goto :goto_0

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    .line 69
    :goto_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "> is of type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/reflect/Type;Ljava/lang/Class<*>;Ljava/lang/Class<*>;)Ljava/lang/reflect/Type;"
        }
    .end annotation

    .line 179
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 180
    .line 181
    :cond_0
    invoke-static {p0, p1, p2}, Lretrofit/Types;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v0

    .line 180
    invoke-static {p0, p1, v0}, Lretrofit/Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method

.method private static hashCodeOrZero(Ljava/lang/Object;)I
    .locals 1

    .line 164
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static indexOf([Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 153
    const/4 v1, 0x0

    :goto_0
    array-length v0, p0

    if-ge v1, v0, :cond_1

    .line 154
    aget-object v0, p0, v1

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 153
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 156
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public static resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/reflect/Type;Ljava/lang/Class<*>;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;"
        }
    .end annotation

    .line 187
    :goto_0
    instance-of v0, p2, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_1

    .line 188
    move-object v4, p2

    check-cast v4, Ljava/lang/reflect/TypeVariable;

    .line 189
    invoke-static {p0, p1, v4}, Lretrofit/Types;->resolveTypeVariable(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;

    move-result-object p2

    .line 190
    if-ne p2, v4, :cond_0

    .line 191
    return-object p2

    .line 194
    :cond_0
    goto :goto_0

    :cond_1
    instance-of v0, p2, Ljava/lang/Class;

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 195
    move-object v4, p2

    check-cast v4, Ljava/lang/Class;

    .line 196
    invoke-virtual {v4}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v5

    .line 197
    invoke-static {p0, p1, v5}, Lretrofit/Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v6

    .line 198
    if-ne v5, v6, :cond_2

    move-object v0, v4

    goto :goto_1

    :cond_2
    new-instance v0, Lretrofit/Types$GenericArrayTypeImpl;

    invoke-direct {v0, v6}, Lretrofit/Types$GenericArrayTypeImpl;-><init>(Ljava/lang/reflect/Type;)V

    :goto_1
    return-object v0

    .line 201
    :cond_3
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_5

    .line 202
    move-object v4, p2

    check-cast v4, Ljava/lang/reflect/GenericArrayType;

    .line 203
    invoke-interface {v4}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v5

    .line 204
    invoke-static {p0, p1, v5}, Lretrofit/Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v6

    .line 205
    if-ne v5, v6, :cond_4

    move-object v0, v4

    goto :goto_2

    :cond_4
    new-instance v0, Lretrofit/Types$GenericArrayTypeImpl;

    invoke-direct {v0, v6}, Lretrofit/Types$GenericArrayTypeImpl;-><init>(Ljava/lang/reflect/Type;)V

    :goto_2
    return-object v0

    .line 208
    :cond_5
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_b

    .line 209
    move-object v4, p2

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 210
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v5

    .line 211
    invoke-static {p0, p1, v5}, Lretrofit/Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v6

    .line 212
    if-eq v6, v5, :cond_6

    const/4 v7, 0x1

    goto :goto_3

    :cond_6
    const/4 v7, 0x0

    .line 214
    :goto_3
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v8

    .line 215
    const/4 v9, 0x0

    array-length v10, v8

    :goto_4
    if-ge v9, v10, :cond_9

    .line 216
    aget-object v0, v8, v9

    invoke-static {p0, p1, v0}, Lretrofit/Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v11

    .line 217
    aget-object v0, v8, v9

    if-eq v11, v0, :cond_8

    .line 218
    if-nez v7, :cond_7

    .line 219
    invoke-virtual {v8}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, [Ljava/lang/reflect/Type;

    .line 220
    const/4 v7, 0x1

    .line 222
    :cond_7
    aput-object v11, v8, v9

    .line 215
    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 226
    :cond_9
    if-eqz v7, :cond_a

    new-instance v0, Lretrofit/Types$ParameterizedTypeImpl;

    .line 227
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-direct {v0, v6, v1, v8}, Lretrofit/Types$ParameterizedTypeImpl;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    goto :goto_5

    :cond_a
    move-object v0, v4

    :goto_5
    return-object v0

    .line 230
    :cond_b
    instance-of v0, p2, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_f

    .line 231
    move-object v4, p2

    check-cast v4, Ljava/lang/reflect/WildcardType;

    .line 232
    invoke-interface {v4}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v5

    .line 233
    invoke-interface {v4}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v6

    .line 235
    array-length v0, v5

    const/4 v1, 0x1

    if-ne v0, v1, :cond_d

    .line 236
    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-static {p0, p1, v0}, Lretrofit/Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v7

    .line 237
    const/4 v0, 0x0

    aget-object v0, v5, v0

    if-eq v7, v0, :cond_c

    .line 238
    new-instance v0, Lretrofit/Types$WildcardTypeImpl;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/reflect/Type;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    invoke-direct {v0, v1, v2}, Lretrofit/Types$WildcardTypeImpl;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    return-object v0

    .line 240
    :cond_c
    goto :goto_6

    :cond_d
    array-length v0, v6

    const/4 v1, 0x1

    if-ne v0, v1, :cond_e

    .line 241
    const/4 v0, 0x0

    aget-object v0, v6, v0

    invoke-static {p0, p1, v0}, Lretrofit/Types;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v7

    .line 242
    const/4 v0, 0x0

    aget-object v0, v6, v0

    if-eq v7, v0, :cond_e

    .line 243
    new-instance v0, Lretrofit/Types$WildcardTypeImpl;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    sget-object v2, Lretrofit/Types;->EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;

    invoke-direct {v0, v1, v2}, Lretrofit/Types$WildcardTypeImpl;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    return-object v0

    .line 246
    :cond_e
    :goto_6
    return-object v4

    .line 249
    :cond_f
    return-object p2
.end method

.method private static resolveTypeVariable(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/reflect/Type;Ljava/lang/Class<*>;Ljava/lang/reflect/TypeVariable<*>;)Ljava/lang/reflect/Type;"
        }
    .end annotation

    .line 256
    invoke-static {p2}, Lretrofit/Types;->declaringClassOf(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;

    move-result-object v1

    .line 259
    if-nez v1, :cond_0

    return-object p2

    .line 261
    :cond_0
    invoke-static {p0, p1, v1}, Lretrofit/Types;->getGenericSupertype(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v2

    .line 262
    instance-of v0, v2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_1

    .line 263
    invoke-virtual {v1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v0

    invoke-static {v0, p2}, Lretrofit/Types;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    .line 264
    move-object v0, v2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v3

    return-object v0

    .line 267
    :cond_1
    return-object p2
.end method

.method public static typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .line 168
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

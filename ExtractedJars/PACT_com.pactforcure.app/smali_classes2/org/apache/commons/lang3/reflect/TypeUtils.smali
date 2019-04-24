.class public Lorg/apache/commons/lang3/reflect/TypeUtils;
.super Ljava/lang/Object;
.source "TypeUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    return-void
.end method

.method public static determineTypeArguments(Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/util/Map;
    .locals 6
    .param p1, "superType"    # Ljava/lang/reflect/ParameterizedType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/reflect/ParameterizedType;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    .prologue
    .local p0, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v4, 0x0

    .line 699
    invoke-static {p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v3

    .line 702
    .local v3, "superClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {p0, v3}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 726
    :goto_0
    return-object v4

    .line 706
    :cond_0
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 707
    invoke-static {p1, v3, v4}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/ParameterizedType;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    .line 711
    :cond_1
    invoke-static {p0, v3}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getClosestParentType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v2

    .line 714
    .local v2, "midType":Ljava/lang/reflect/Type;
    instance-of v5, v2, Ljava/lang/Class;

    if-eqz v5, :cond_2

    .line 715
    check-cast v2, Ljava/lang/Class;

    .end local v2    # "midType":Ljava/lang/reflect/Type;
    invoke-static {v2, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->determineTypeArguments(Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    .restart local v2    # "midType":Ljava/lang/reflect/Type;
    :cond_2
    move-object v1, v2

    .line 718
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 719
    .local v1, "midParameterizedType":Ljava/lang/reflect/ParameterizedType;
    invoke-static {v1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v0

    .line 722
    .local v0, "midClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {v0, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->determineTypeArguments(Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/util/Map;

    move-result-object v4

    .line 724
    .local v4, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    invoke-static {p0, v1, v4}, Lorg/apache/commons/lang3/reflect/TypeUtils;->mapTypeVariablesToArguments(Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)V

    goto :goto_0
.end method

.method public static getArrayComponentType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 3
    .param p0, "type"    # Ljava/lang/reflect/Type;

    .prologue
    const/4 v1, 0x0

    .line 1078
    instance-of v2, p0, Ljava/lang/Class;

    if-eqz v2, :cond_1

    move-object v0, p0

    .line 1079
    check-cast v0, Ljava/lang/Class;

    .line 1080
    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    .line 1085
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local p0    # "type":Ljava/lang/reflect/Type;
    :cond_0
    :goto_0
    return-object v1

    .line 1082
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_1
    instance-of v2, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v2, :cond_0

    .line 1083
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v1

    goto :goto_0
.end method

.method private static getClosestParentType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/reflect/Type;"
        }
    .end annotation

    .prologue
    .line 786
    .local p0, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p1, "superClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 788
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object v3

    .line 790
    .local v3, "interfaceTypes":[Ljava/lang/reflect/Type;
    const/4 v1, 0x0

    .line 793
    .local v1, "genericInterface":Ljava/lang/reflect/Type;
    move-object v0, v3

    .local v0, "arr$":[Ljava/lang/reflect/Type;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v4, :cond_3

    aget-object v6, v0, v2

    .line 794
    .local v6, "midType":Ljava/lang/reflect/Type;
    const/4 v5, 0x0

    .line 796
    .local v5, "midClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    instance-of v7, v6, Ljava/lang/reflect/ParameterizedType;

    if-eqz v7, :cond_1

    move-object v7, v6

    .line 797
    check-cast v7, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v7}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v5

    .line 807
    :goto_1
    invoke-static {v5, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-static {v1, v5}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 809
    move-object v1, v6

    .line 793
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 798
    :cond_1
    instance-of v7, v6, Ljava/lang/Class;

    if-eqz v7, :cond_2

    move-object v5, v6

    .line 799
    check-cast v5, Ljava/lang/Class;

    goto :goto_1

    .line 801
    :cond_2
    new-instance v7, Ljava/lang/IllegalStateException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Unexpected generic interface type found: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 814
    .end local v5    # "midClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v6    # "midType":Ljava/lang/reflect/Type;
    :cond_3
    if-eqz v1, :cond_4

    .line 821
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v1    # "genericInterface":Ljava/lang/reflect/Type;
    .end local v2    # "i$":I
    .end local v3    # "interfaceTypes":[Ljava/lang/reflect/Type;
    .end local v4    # "len$":I
    :goto_2
    return-object v1

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    goto :goto_2
.end method

.method public static getImplicitBounds(Ljava/lang/reflect/TypeVariable;)[Ljava/lang/reflect/Type;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;)[",
            "Ljava/lang/reflect/Type;"
        }
    .end annotation

    .prologue
    .line 898
    .local p0, "typeVariable":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    .line 900
    .local v0, "bounds":[Ljava/lang/reflect/Type;
    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const/4 v2, 0x0

    const-class v3, Ljava/lang/Object;

    aput-object v3, v1, v2

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->normalizeUpperBounds([Ljava/lang/reflect/Type;)[Ljava/lang/reflect/Type;

    move-result-object v1

    goto :goto_0
.end method

.method public static getImplicitLowerBounds(Ljava/lang/reflect/WildcardType;)[Ljava/lang/reflect/Type;
    .locals 3
    .param p0, "wildcardType"    # Ljava/lang/reflect/WildcardType;

    .prologue
    .line 929
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    .line 931
    .local v0, "bounds":[Ljava/lang/reflect/Type;
    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    new-array v0, v1, [Ljava/lang/reflect/Type;

    .end local v0    # "bounds":[Ljava/lang/reflect/Type;
    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    :cond_0
    return-object v0
.end method

.method public static getImplicitUpperBounds(Ljava/lang/reflect/WildcardType;)[Ljava/lang/reflect/Type;
    .locals 4
    .param p0, "wildcardType"    # Ljava/lang/reflect/WildcardType;

    .prologue
    .line 914
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    .line 916
    .local v0, "bounds":[Ljava/lang/reflect/Type;
    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const/4 v2, 0x0

    const-class v3, Ljava/lang/Object;

    aput-object v3, v1, v2

    :goto_0
    return-object v1

    :cond_0
    invoke-static {v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->normalizeUpperBounds([Ljava/lang/reflect/Type;)[Ljava/lang/reflect/Type;

    move-result-object v1

    goto :goto_0
.end method

.method private static getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;
    .locals 4
    .param p0, "parameterizedType"    # Ljava/lang/reflect/ParameterizedType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/ParameterizedType;",
            ")",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 973
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 980
    .local v0, "rawType":Ljava/lang/reflect/Type;
    instance-of v1, v0, Ljava/lang/Class;

    if-nez v1, :cond_0

    .line 981
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Wait... What!? Type of rawType: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 984
    :cond_0
    check-cast v0, Ljava/lang/Class;

    .end local v0    # "rawType":Ljava/lang/reflect/Type;
    return-object v0
.end method

.method public static getRawType(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 7
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .param p1, "assigningType"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    .line 1000
    instance-of v4, p0, Ljava/lang/Class;

    if-eqz v4, :cond_0

    .line 1002
    check-cast p0, Ljava/lang/Class;

    .line 1057
    .end local p0    # "type":Ljava/lang/reflect/Type;
    :goto_0
    return-object p0

    .line 1005
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_0
    instance-of v4, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_1

    .line 1007
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    .line 1010
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_1
    instance-of v4, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v4, :cond_6

    .line 1011
    if-nez p1, :cond_2

    move-object p0, v5

    .line 1012
    goto :goto_0

    :cond_2
    move-object v4, p0

    .line 1016
    check-cast v4, Ljava/lang/reflect/TypeVariable;

    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v0

    .line 1020
    .local v0, "genericDeclaration":Ljava/lang/reflect/GenericDeclaration;
    instance-of v4, v0, Ljava/lang/Class;

    if-nez v4, :cond_3

    move-object p0, v5

    .line 1021
    goto :goto_0

    .line 1026
    :cond_3
    check-cast v0, Ljava/lang/Class;

    .end local v0    # "genericDeclaration":Ljava/lang/reflect/GenericDeclaration;
    invoke-static {p1, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/util/Map;

    move-result-object v3

    .line 1031
    .local v3, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    if-nez v3, :cond_4

    move-object p0, v5

    .line 1032
    goto :goto_0

    .line 1036
    :cond_4
    invoke-interface {v3, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Type;

    .line 1038
    .local v2, "typeArgument":Ljava/lang/reflect/Type;
    if-nez v2, :cond_5

    move-object p0, v5

    .line 1039
    goto :goto_0

    .line 1043
    :cond_5
    invoke-static {v2, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    .line 1046
    .end local v2    # "typeArgument":Ljava/lang/reflect/Type;
    .end local v3    # "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    :cond_6
    instance-of v4, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v4, :cond_7

    .line 1048
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    .line 1052
    .local v1, "rawComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v4, 0x0

    invoke-static {v1, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_0

    .line 1056
    .end local v1    # "rawComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_7
    instance-of v4, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v4, :cond_8

    move-object p0, v5

    .line 1057
    goto :goto_0

    .line 1060
    :cond_8
    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "unknown type: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method private static getTypeArguments(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    .prologue
    .line 640
    .local p0, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p1, "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p2, "subtypeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 641
    const/4 v0, 0x0

    .line 667
    :cond_0
    :goto_0
    return-object v0

    .line 645
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 647
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 650
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    goto :goto_0

    .line 654
    :cond_2
    invoke-static {p0}, Lorg/apache/commons/lang3/ClassUtils;->primitiveToWrapper(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p0

    .line 658
    :cond_3
    if-nez p2, :cond_4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 662
    .local v0, "typeVarAssigns":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v1

    array-length v1, v1

    if-gtz v1, :cond_0

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 667
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getClosestParentType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    .line 658
    .end local v0    # "typeVarAssigns":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    :cond_4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    goto :goto_1
.end method

.method public static getTypeArguments(Ljava/lang/reflect/ParameterizedType;)Ljava/util/Map;
    .locals 2
    .param p0, "type"    # Ljava/lang/reflect/ParameterizedType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/ParameterizedType;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    .prologue
    .line 485
    invoke-static {p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/ParameterizedType;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static getTypeArguments(Ljava/lang/reflect/ParameterizedType;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;
    .locals 10
    .param p0, "parameterizedType"    # Ljava/lang/reflect/ParameterizedType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/ParameterizedType;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    .prologue
    .line 587
    .local p1, "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p2, "subtypeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    invoke-static {p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v0

    .line 590
    .local v0, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {v0, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 591
    const/4 v7, 0x0

    .line 626
    :cond_0
    :goto_0
    return-object v7

    .line 594
    :cond_1
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v2

    .line 597
    .local v2, "ownerType":Ljava/lang/reflect/Type;
    instance-of v8, v2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v8, :cond_2

    move-object v3, v2

    .line 599
    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 600
    .local v3, "parameterizedOwnerType":Ljava/lang/reflect/ParameterizedType;
    invoke-static {v3}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v8

    invoke-static {v3, v8, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/ParameterizedType;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    .line 609
    .end local v3    # "parameterizedOwnerType":Ljava/lang/reflect/ParameterizedType;
    .local v7, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    :goto_1
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v5

    .line 611
    .local v5, "typeArgs":[Ljava/lang/reflect/Type;
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v6

    .line 614
    .local v6, "typeParams":[Ljava/lang/reflect/TypeVariable;, "[Ljava/lang/reflect/TypeVariable<*>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_2
    array-length v8, v6

    if-ge v1, v8, :cond_5

    .line 615
    aget-object v4, v5, v1

    .line 616
    .local v4, "typeArg":Ljava/lang/reflect/Type;
    aget-object v9, v6, v1

    invoke-interface {v7, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/reflect/Type;

    :goto_3
    invoke-interface {v7, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 604
    .end local v1    # "i":I
    .end local v4    # "typeArg":Ljava/lang/reflect/Type;
    .end local v5    # "typeArgs":[Ljava/lang/reflect/Type;
    .end local v6    # "typeParams":[Ljava/lang/reflect/TypeVariable;, "[Ljava/lang/reflect/TypeVariable<*>;"
    .end local v7    # "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    :cond_2
    if-nez p2, :cond_3

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .restart local v7    # "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    :goto_4
    goto :goto_1

    .end local v7    # "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    :cond_3
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    goto :goto_4

    .restart local v1    # "i":I
    .restart local v4    # "typeArg":Ljava/lang/reflect/Type;
    .restart local v5    # "typeArgs":[Ljava/lang/reflect/Type;
    .restart local v6    # "typeParams":[Ljava/lang/reflect/TypeVariable;, "[Ljava/lang/reflect/TypeVariable<*>;"
    .restart local v7    # "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    :cond_4
    move-object v8, v4

    .line 616
    goto :goto_3

    .line 620
    .end local v4    # "typeArg":Ljava/lang/reflect/Type;
    :cond_5
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 626
    invoke-static {v0, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getClosestParentType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v8, p1, v7}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v7

    goto :goto_0
.end method

.method public static getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/util/Map;
    .locals 1
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    .prologue
    .line 521
    .local p1, "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;
    .locals 7
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    .prologue
    .local p1, "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .local p2, "subtypeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    const/4 v4, 0x0

    .line 534
    instance-of v5, p0, Ljava/lang/Class;

    if-eqz v5, :cond_1

    .line 535
    check-cast p0, Ljava/lang/Class;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    .line 569
    .end local p1    # "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_0
    :goto_0
    return-object v4

    .line 538
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    .restart local p1    # "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_1
    instance-of v5, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_2

    .line 539
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/ParameterizedType;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    .line 542
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_2
    instance-of v5, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v5, :cond_4

    .line 543
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    .end local p1    # "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_3
    invoke-static {v4, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    .line 549
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    .restart local p1    # "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_4
    instance-of v5, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v5, :cond_6

    .line 550
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitUpperBounds(Ljava/lang/reflect/WildcardType;)[Ljava/lang/reflect/Type;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Type;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_1
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 552
    .local v1, "bound":Ljava/lang/reflect/Type;
    invoke-static {v1, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 553
    invoke-static {v1, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    .line 550
    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 561
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v1    # "bound":Ljava/lang/reflect/Type;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_6
    instance-of v5, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v5, :cond_8

    .line 562
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitBounds(Ljava/lang/reflect/TypeVariable;)[Ljava/lang/reflect/Type;

    move-result-object v0

    .restart local v0    # "arr$":[Ljava/lang/reflect/Type;
    array-length v3, v0

    .restart local v3    # "len$":I
    const/4 v2, 0x0

    .restart local v2    # "i$":I
    :goto_2
    if-ge v2, v3, :cond_0

    aget-object v1, v0, v2

    .line 564
    .restart local v1    # "bound":Ljava/lang/reflect/Type;
    invoke-static {v1, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 565
    invoke-static {v1, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    .line 562
    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 573
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v1    # "bound":Ljava/lang/reflect/Type;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_8
    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "found an unhandled type: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method public static isArrayType(Ljava/lang/reflect/Type;)Z
    .locals 1
    .param p0, "type"    # Ljava/lang/reflect/Type;

    .prologue
    .line 1069
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/Class;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z
    .locals 8
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .local p1, "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 113
    if-nez p0, :cond_2

    .line 115
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v6

    if-nez v6, :cond_1

    :cond_0
    move v4, v5

    .line 164
    .end local p0    # "type":Ljava/lang/reflect/Type;
    :cond_1
    :goto_0
    return v4

    .line 120
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_2
    if-eqz p1, :cond_1

    .line 125
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v4, v5

    .line 126
    goto :goto_0

    .line 129
    :cond_3
    instance-of v6, p0, Ljava/lang/Class;

    if-eqz v6, :cond_4

    .line 131
    check-cast p0, Ljava/lang/Class;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ClassUtils;->isAssignable(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v4

    goto :goto_0

    .line 134
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_4
    instance-of v6, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v6, :cond_5

    .line 136
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v4

    goto :goto_0

    .line 140
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_5
    instance-of v6, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v6, :cond_7

    .line 143
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Type;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_1
    if-ge v2, v3, :cond_1

    aget-object v1, v0, v2

    .line 144
    .local v1, "bound":Ljava/lang/reflect/Type;
    invoke-static {v1, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_6

    move v4, v5

    .line 145
    goto :goto_0

    .line 143
    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 154
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v1    # "bound":Ljava/lang/reflect/Type;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_7
    instance-of v6, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v6, :cond_9

    .line 155
    const-class v6, Ljava/lang/Object;

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v6

    if-eqz v6, :cond_1

    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v7

    invoke-static {v6, v7}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_1

    :cond_8
    move v4, v5

    goto :goto_0

    .line 163
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_9
    instance-of v5, p0, Ljava/lang/reflect/WildcardType;

    if-nez v5, :cond_1

    .line 167
    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "found an unhandled type: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method private static isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/GenericArrayType;Ljava/util/Map;)Z
    .locals 9
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .param p1, "toGenericArrayType"    # Ljava/lang/reflect/GenericArrayType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/GenericArrayType;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p2, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 249
    if-nez p0, :cond_1

    .line 307
    .end local p0    # "type":Ljava/lang/reflect/Type;
    :cond_0
    :goto_0
    return v6

    .line 255
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_1
    if-nez p1, :cond_2

    move v6, v7

    .line 256
    goto :goto_0

    .line 260
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 264
    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v5

    .line 266
    .local v5, "toComponentType":Ljava/lang/reflect/Type;
    instance-of v8, p0, Ljava/lang/Class;

    if-eqz v8, :cond_4

    move-object v2, p0

    .line 267
    check-cast v2, Ljava/lang/Class;

    .line 270
    .local v2, "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8, v5, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v8

    if-nez v8, :cond_0

    :cond_3
    move v6, v7

    goto :goto_0

    .line 274
    .end local v2    # "cls":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_4
    instance-of v8, p0, Ljava/lang/reflect/GenericArrayType;

    if-eqz v8, :cond_5

    .line 276
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-static {v6, v5, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v6

    goto :goto_0

    .line 280
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_5
    instance-of v8, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v8, :cond_7

    .line 282
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitUpperBounds(Ljava/lang/reflect/WildcardType;)[Ljava/lang/reflect/Type;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Type;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_1
    if-ge v3, v4, :cond_6

    aget-object v1, v0, v3

    .line 283
    .local v1, "bound":Ljava/lang/reflect/Type;
    invoke-static {v1, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 282
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .end local v1    # "bound":Ljava/lang/reflect/Type;
    :cond_6
    move v6, v7

    .line 288
    goto :goto_0

    .line 291
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_7
    instance-of v8, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v8, :cond_9

    .line 294
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .end local p0    # "type":Ljava/lang/reflect/Type;
    invoke-static {p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitBounds(Ljava/lang/reflect/TypeVariable;)[Ljava/lang/reflect/Type;

    move-result-object v0

    .restart local v0    # "arr$":[Ljava/lang/reflect/Type;
    array-length v4, v0

    .restart local v4    # "len$":I
    const/4 v3, 0x0

    .restart local v3    # "i$":I
    :goto_2
    if-ge v3, v4, :cond_8

    aget-object v1, v0, v3

    .line 295
    .restart local v1    # "bound":Ljava/lang/reflect/Type;
    invoke-static {v1, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 294
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .end local v1    # "bound":Ljava/lang/reflect/Type;
    :cond_8
    move v6, v7

    .line 300
    goto :goto_0

    .line 303
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    .restart local p0    # "type":Ljava/lang/reflect/Type;
    :cond_9
    instance-of v6, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v6, :cond_a

    move v6, v7

    .line 307
    goto :goto_0

    .line 310
    :cond_a
    new-instance v6, Ljava/lang/IllegalStateException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "found an unhandled type: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v6
.end method

.method private static isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
    .locals 10
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .param p1, "toParameterizedType"    # Ljava/lang/reflect/ParameterizedType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/ParameterizedType;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p2, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 181
    if-nez p0, :cond_1

    .line 234
    :cond_0
    :goto_0
    return v7

    .line 187
    :cond_1
    if-nez p1, :cond_2

    move v7, v8

    .line 188
    goto :goto_0

    .line 192
    :cond_2
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 197
    invoke-static {p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v4

    .line 200
    .local v4, "toClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/4 v9, 0x0

    invoke-static {p0, v4, v9}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 203
    .local v2, "fromTypeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    if-nez v2, :cond_3

    move v7, v8

    .line 204
    goto :goto_0

    .line 210
    :cond_3
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_0

    .line 215
    invoke-static {p1, v4, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getTypeArguments(Ljava/lang/reflect/ParameterizedType;Ljava/lang/Class;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    .line 219
    .local v6, "toTypeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 220
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/reflect/Type;

    .line 221
    .local v5, "toTypeArg":Ljava/lang/reflect/Type;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Type;

    .line 226
    .local v1, "fromTypeArg":Ljava/lang/reflect/Type;
    if-eqz v1, :cond_4

    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    instance-of v9, v5, Ljava/lang/reflect/WildcardType;

    if-eqz v9, :cond_5

    invoke-static {v1, v5, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v9

    if-nez v9, :cond_4

    :cond_5
    move v7, v8

    .line 230
    goto :goto_0
.end method

.method public static isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 1
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .param p1, "toType"    # Ljava/lang/reflect/Type;

    .prologue
    .line 65
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v0

    return v0
.end method

.method private static isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z
    .locals 3
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .param p1, "toType"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 79
    .local p2, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    if-eqz p1, :cond_0

    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_1

    .line 80
    :cond_0
    check-cast p1, Ljava/lang/Class;

    .end local p1    # "toType":Ljava/lang/reflect/Type;
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/Class;)Z

    move-result v0

    .line 97
    :goto_0
    return v0

    .line 83
    .restart local p1    # "toType":Ljava/lang/reflect/Type;
    :cond_1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_2

    .line 84
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .end local p1    # "toType":Ljava/lang/reflect/Type;
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z

    move-result v0

    goto :goto_0

    .line 87
    .restart local p1    # "toType":Ljava/lang/reflect/Type;
    :cond_2
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    if-eqz v0, :cond_3

    .line 88
    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    .end local p1    # "toType":Ljava/lang/reflect/Type;
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/GenericArrayType;Ljava/util/Map;)Z

    move-result v0

    goto :goto_0

    .line 91
    .restart local p1    # "toType":Ljava/lang/reflect/Type;
    :cond_3
    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_4

    .line 92
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .end local p1    # "toType":Ljava/lang/reflect/Type;
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/WildcardType;Ljava/util/Map;)Z

    move-result v0

    goto :goto_0

    .line 96
    .restart local p1    # "toType":Ljava/lang/reflect/Type;
    :cond_4
    instance-of v0, p1, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_5

    .line 97
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .end local p1    # "toType":Ljava/lang/reflect/Type;
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/TypeVariable;Ljava/util/Map;)Z

    move-result v0

    goto :goto_0

    .line 101
    .restart local p1    # "toType":Ljava/lang/reflect/Type;
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "found an unhandled type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/TypeVariable;Ljava/util/Map;)Z
    .locals 8
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .local p1, "toTypeVariable":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    .local p2, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 414
    if-nez p0, :cond_0

    move v5, v6

    .line 444
    :goto_0
    return v5

    .line 420
    :cond_0
    if-nez p1, :cond_1

    move v5, v7

    .line 421
    goto :goto_0

    .line 425
    :cond_1
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    .line 426
    goto :goto_0

    .line 429
    :cond_2
    instance-of v5, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v5, :cond_4

    move-object v5, p0

    .line 433
    check-cast v5, Ljava/lang/reflect/TypeVariable;

    invoke-static {v5}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitBounds(Ljava/lang/reflect/TypeVariable;)[Ljava/lang/reflect/Type;

    move-result-object v2

    .line 435
    .local v2, "bounds":[Ljava/lang/reflect/Type;
    move-object v0, v2

    .local v0, "arr$":[Ljava/lang/reflect/Type;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_1
    if-ge v3, v4, :cond_4

    aget-object v1, v0, v3

    .line 436
    .local v1, "bound":Ljava/lang/reflect/Type;
    invoke-static {v1, p1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/TypeVariable;Ljava/util/Map;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    .line 437
    goto :goto_0

    .line 435
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 442
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v1    # "bound":Ljava/lang/reflect/Type;
    .end local v2    # "bounds":[Ljava/lang/reflect/Type;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    :cond_4
    instance-of v5, p0, Ljava/lang/Class;

    if-nez v5, :cond_5

    instance-of v5, p0, Ljava/lang/reflect/ParameterizedType;

    if-nez v5, :cond_5

    instance-of v5, p0, Ljava/lang/reflect/GenericArrayType;

    if-nez v5, :cond_5

    instance-of v5, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v5, :cond_6

    :cond_5
    move v5, v7

    .line 444
    goto :goto_0

    .line 447
    :cond_6
    new-instance v5, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "found an unhandled type: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v5
.end method

.method private static isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/WildcardType;Ljava/util/Map;)Z
    .locals 15
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .param p1, "toWildcardType"    # Ljava/lang/reflect/WildcardType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/WildcardType;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 325
    .local p2, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    if-nez p0, :cond_0

    .line 326
    const/4 v14, 0x1

    .line 399
    :goto_0
    return v14

    .line 331
    :cond_0
    if-nez p1, :cond_1

    .line 332
    const/4 v14, 0x0

    goto :goto_0

    .line 336
    :cond_1
    move-object/from16 v0, p1

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    .line 337
    const/4 v14, 0x1

    goto :goto_0

    .line 340
    :cond_2
    invoke-static/range {p1 .. p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitUpperBounds(Ljava/lang/reflect/WildcardType;)[Ljava/lang/reflect/Type;

    move-result-object v11

    .line 341
    .local v11, "toUpperBounds":[Ljava/lang/reflect/Type;
    invoke-static/range {p1 .. p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitLowerBounds(Ljava/lang/reflect/WildcardType;)[Ljava/lang/reflect/Type;

    move-result-object v10

    .line 343
    .local v10, "toLowerBounds":[Ljava/lang/reflect/Type;
    instance-of v14, p0, Ljava/lang/reflect/WildcardType;

    if-eqz v14, :cond_9

    move-object v13, p0

    .line 344
    check-cast v13, Ljava/lang/reflect/WildcardType;

    .line 345
    .local v13, "wildcardType":Ljava/lang/reflect/WildcardType;
    invoke-static {v13}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitUpperBounds(Ljava/lang/reflect/WildcardType;)[Ljava/lang/reflect/Type;

    move-result-object v12

    .line 346
    .local v12, "upperBounds":[Ljava/lang/reflect/Type;
    invoke-static {v13}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitLowerBounds(Ljava/lang/reflect/WildcardType;)[Ljava/lang/reflect/Type;

    move-result-object v8

    .line 348
    .local v8, "lowerBounds":[Ljava/lang/reflect/Type;
    move-object v1, v11

    .local v1, "arr$":[Ljava/lang/reflect/Type;
    array-length v6, v1

    .local v6, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    move v5, v4

    .end local v1    # "arr$":[Ljava/lang/reflect/Type;
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    .local v5, "i$":I
    :goto_1
    if-ge v5, v6, :cond_5

    aget-object v9, v1, v5

    .line 351
    .local v9, "toBound":Ljava/lang/reflect/Type;
    move-object/from16 v0, p2

    invoke-static {v9, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->substituteTypeVariables(Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;

    move-result-object v9

    .line 356
    move-object v2, v12

    .local v2, "arr$":[Ljava/lang/reflect/Type;
    array-length v7, v2

    .local v7, "len$":I
    const/4 v4, 0x0

    .end local v5    # "i$":I
    .restart local v4    # "i$":I
    :goto_2
    if-ge v4, v7, :cond_4

    aget-object v3, v2, v4

    .line 357
    .local v3, "bound":Ljava/lang/reflect/Type;
    move-object/from16 v0, p2

    invoke-static {v3, v9, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v14

    if-nez v14, :cond_3

    .line 358
    const/4 v14, 0x0

    goto :goto_0

    .line 356
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 348
    .end local v3    # "bound":Ljava/lang/reflect/Type;
    :cond_4
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    .end local v4    # "i$":I
    .restart local v5    # "i$":I
    goto :goto_1

    .line 363
    .end local v2    # "arr$":[Ljava/lang/reflect/Type;
    .end local v7    # "len$":I
    .end local v9    # "toBound":Ljava/lang/reflect/Type;
    :cond_5
    move-object v1, v10

    .restart local v1    # "arr$":[Ljava/lang/reflect/Type;
    array-length v6, v1

    .restart local v6    # "len$":I
    const/4 v4, 0x0

    .end local v5    # "i$":I
    .restart local v4    # "i$":I
    move v5, v4

    .end local v1    # "arr$":[Ljava/lang/reflect/Type;
    .end local v4    # "i$":I
    .end local v6    # "len$":I
    .restart local v5    # "i$":I
    :goto_3
    if-ge v5, v6, :cond_8

    aget-object v9, v1, v5

    .line 366
    .restart local v9    # "toBound":Ljava/lang/reflect/Type;
    move-object/from16 v0, p2

    invoke-static {v9, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->substituteTypeVariables(Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;

    move-result-object v9

    .line 371
    move-object v2, v8

    .restart local v2    # "arr$":[Ljava/lang/reflect/Type;
    array-length v7, v2

    .restart local v7    # "len$":I
    const/4 v4, 0x0

    .end local v5    # "i$":I
    .restart local v4    # "i$":I
    :goto_4
    if-ge v4, v7, :cond_7

    aget-object v3, v2, v4

    .line 372
    .restart local v3    # "bound":Ljava/lang/reflect/Type;
    move-object/from16 v0, p2

    invoke-static {v9, v3, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v14

    if-nez v14, :cond_6

    .line 373
    const/4 v14, 0x0

    goto :goto_0

    .line 371
    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 363
    .end local v3    # "bound":Ljava/lang/reflect/Type;
    :cond_7
    add-int/lit8 v4, v5, 0x1

    move v5, v4

    .end local v4    # "i$":I
    .restart local v5    # "i$":I
    goto :goto_3

    .line 378
    .end local v2    # "arr$":[Ljava/lang/reflect/Type;
    .end local v7    # "len$":I
    .end local v9    # "toBound":Ljava/lang/reflect/Type;
    :cond_8
    const/4 v14, 0x1

    goto :goto_0

    .line 381
    .end local v5    # "i$":I
    .end local v8    # "lowerBounds":[Ljava/lang/reflect/Type;
    .end local v12    # "upperBounds":[Ljava/lang/reflect/Type;
    .end local v13    # "wildcardType":Ljava/lang/reflect/WildcardType;
    :cond_9
    move-object v1, v11

    .restart local v1    # "arr$":[Ljava/lang/reflect/Type;
    array-length v6, v1

    .restart local v6    # "len$":I
    const/4 v4, 0x0

    .restart local v4    # "i$":I
    :goto_5
    if-ge v4, v6, :cond_b

    aget-object v9, v1, v4

    .line 384
    .restart local v9    # "toBound":Ljava/lang/reflect/Type;
    move-object/from16 v0, p2

    invoke-static {v9, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->substituteTypeVariables(Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;

    move-result-object v14

    move-object/from16 v0, p2

    invoke-static {p0, v14, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v14

    if-nez v14, :cond_a

    .line 386
    const/4 v14, 0x0

    goto/16 :goto_0

    .line 381
    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 390
    .end local v9    # "toBound":Ljava/lang/reflect/Type;
    :cond_b
    move-object v1, v10

    array-length v6, v1

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v6, :cond_d

    aget-object v9, v1, v4

    .line 393
    .restart local v9    # "toBound":Ljava/lang/reflect/Type;
    move-object/from16 v0, p2

    invoke-static {v9, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->substituteTypeVariables(Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;

    move-result-object v14

    move-object/from16 v0, p2

    invoke-static {v14, p0, v0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v14

    if-nez v14, :cond_c

    .line 395
    const/4 v14, 0x0

    goto/16 :goto_0

    .line 390
    :cond_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 399
    .end local v9    # "toBound":Ljava/lang/reflect/Type;
    :cond_d
    const/4 v14, 0x1

    goto/16 :goto_0
.end method

.method public static isInstance(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z
    .locals 2
    .param p0, "value"    # Ljava/lang/Object;
    .param p1, "type"    # Ljava/lang/reflect/Type;

    .prologue
    const/4 v0, 0x0

    .line 833
    if-nez p1, :cond_1

    .line 837
    .end local p1    # "type":Ljava/lang/reflect/Type;
    :cond_0
    :goto_0
    return v0

    .restart local p1    # "type":Ljava/lang/reflect/Type;
    :cond_1
    if-nez p0, :cond_3

    instance-of v1, p1, Ljava/lang/Class;

    if-eqz v1, :cond_2

    check-cast p1, Ljava/lang/Class;

    .end local p1    # "type":Ljava/lang/reflect/Type;
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .restart local p1    # "type":Ljava/lang/reflect/Type;
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v0

    goto :goto_0
.end method

.method private static mapTypeVariablesToArguments(Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)V
    .locals 8
    .param p1, "parameterizedType"    # Ljava/lang/reflect/ParameterizedType;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Ljava/lang/reflect/ParameterizedType;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 740
    .local p0, "cls":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .local p2, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 742
    .local v1, "ownerType":Ljava/lang/reflect/Type;
    instance-of v7, v1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v7, :cond_0

    .line 744
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .end local v1    # "ownerType":Ljava/lang/reflect/Type;
    invoke-static {p0, v1, p2}, Lorg/apache/commons/lang3/reflect/TypeUtils;->mapTypeVariablesToArguments(Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)V

    .line 751
    :cond_0
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    .line 755
    .local v3, "typeArgs":[Ljava/lang/reflect/Type;
    invoke-static {p1}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getRawType(Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v6

    .line 758
    .local v6, "typeVars":[Ljava/lang/reflect/TypeVariable;, "[Ljava/lang/reflect/TypeVariable<*>;"
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    .line 761
    .local v5, "typeVarList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/reflect/TypeVariable<Ljava/lang/Class<TT;>;>;>;"
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v7, v3

    if-ge v0, v7, :cond_2

    .line 762
    aget-object v4, v6, v0

    .line 763
    .local v4, "typeVar":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    aget-object v2, v3, v0

    .line 766
    .local v2, "typeArg":Ljava/lang/reflect/Type;
    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {p2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 771
    check-cast v2, Ljava/lang/reflect/TypeVariable;

    .end local v2    # "typeArg":Ljava/lang/reflect/Type;
    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {p2, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 774
    .end local v4    # "typeVar":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    :cond_2
    return-void
.end method

.method public static normalizeUpperBounds([Ljava/lang/reflect/Type;)[Ljava/lang/reflect/Type;
    .locals 12
    .param p0, "bounds"    # [Ljava/lang/reflect/Type;

    .prologue
    .line 864
    array-length v10, p0

    const/4 v11, 0x2

    if-ge v10, v11, :cond_0

    .line 885
    .end local p0    # "bounds":[Ljava/lang/reflect/Type;
    :goto_0
    return-object p0

    .line 868
    .restart local p0    # "bounds":[Ljava/lang/reflect/Type;
    :cond_0
    new-instance v9, Ljava/util/HashSet;

    array-length v10, p0

    invoke-direct {v9, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 870
    .local v9, "types":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/reflect/Type;>;"
    move-object v0, p0

    .local v0, "arr$":[Ljava/lang/reflect/Type;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    move v3, v2

    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v2    # "i$":I
    .end local v4    # "len$":I
    .local v3, "i$":I
    :goto_1
    if-ge v3, v4, :cond_4

    aget-object v7, v0, v3

    .line 871
    .local v7, "type1":Ljava/lang/reflect/Type;
    const/4 v6, 0x0

    .line 873
    .local v6, "subtypeFound":Z
    move-object v1, p0

    .local v1, "arr$":[Ljava/lang/reflect/Type;
    array-length v5, v1

    .local v5, "len$":I
    const/4 v2, 0x0

    .end local v3    # "i$":I
    .restart local v2    # "i$":I
    :goto_2
    if-ge v2, v5, :cond_1

    aget-object v8, v1, v2

    .line 874
    .local v8, "type2":Ljava/lang/reflect/Type;
    if-eq v7, v8, :cond_3

    const/4 v10, 0x0

    invoke-static {v8, v7, v10}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 875
    const/4 v6, 0x1

    .line 880
    .end local v8    # "type2":Ljava/lang/reflect/Type;
    :cond_1
    if-nez v6, :cond_2

    .line 881
    invoke-interface {v9, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 870
    :cond_2
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    .end local v2    # "i$":I
    .restart local v3    # "i$":I
    goto :goto_1

    .line 873
    .end local v3    # "i$":I
    .restart local v2    # "i$":I
    .restart local v8    # "type2":Ljava/lang/reflect/Type;
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 885
    .end local v1    # "arr$":[Ljava/lang/reflect/Type;
    .end local v2    # "i$":I
    .end local v5    # "len$":I
    .end local v6    # "subtypeFound":Z
    .end local v7    # "type1":Ljava/lang/reflect/Type;
    .end local v8    # "type2":Ljava/lang/reflect/Type;
    .restart local v3    # "i$":I
    :cond_4
    invoke-interface {v9}, Ljava/util/Set;->size()I

    move-result v10

    new-array v10, v10, [Ljava/lang/reflect/Type;

    invoke-interface {v9, v10}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [Ljava/lang/reflect/Type;

    move-object p0, v10

    goto :goto_0
.end method

.method private static substituteTypeVariables(Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;
    .locals 4
    .param p0, "type"    # Ljava/lang/reflect/Type;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)",
            "Ljava/lang/reflect/Type;"
        }
    .end annotation

    .prologue
    .line 459
    .local p1, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    instance-of v1, p0, Ljava/lang/reflect/TypeVariable;

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 460
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Type;

    .line 462
    .local v0, "replacementType":Ljava/lang/reflect/Type;
    if-nez v0, :cond_1

    .line 463
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "missing assignment type for type variable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .end local v0    # "replacementType":Ljava/lang/reflect/Type;
    :cond_0
    move-object v0, p0

    .line 470
    :cond_1
    return-object v0
.end method

.method public static typesSatisfyVariables(Ljava/util/Map;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/TypeVariable",
            "<*>;",
            "Ljava/lang/reflect/Type;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 950
    .local p0, "typeVarAssigns":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 951
    .local v2, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/reflect/TypeVariable;

    .line 952
    .local v7, "typeVar":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/reflect/Type;

    .line 954
    .local v6, "type":Ljava/lang/reflect/Type;
    invoke-static {v7}, Lorg/apache/commons/lang3/reflect/TypeUtils;->getImplicitBounds(Ljava/lang/reflect/TypeVariable;)[Ljava/lang/reflect/Type;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Type;
    array-length v5, v0

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_0
    if-ge v4, v5, :cond_0

    aget-object v1, v0, v4

    .line 955
    .local v1, "bound":Ljava/lang/reflect/Type;
    invoke-static {v1, p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->substituteTypeVariables(Ljava/lang/reflect/Type;Ljava/util/Map;)Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-static {v6, v8, p0}, Lorg/apache/commons/lang3/reflect/TypeUtils;->isAssignable(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 957
    const/4 v8, 0x0

    .line 962
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v1    # "bound":Ljava/lang/reflect/Type;
    .end local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    .end local v4    # "i$":I
    .end local v5    # "len$":I
    .end local v6    # "type":Ljava/lang/reflect/Type;
    .end local v7    # "typeVar":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    :goto_1
    return v8

    .line 954
    .restart local v0    # "arr$":[Ljava/lang/reflect/Type;
    .restart local v1    # "bound":Ljava/lang/reflect/Type;
    .restart local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    .restart local v4    # "i$":I
    .restart local v5    # "len$":I
    .restart local v6    # "type":Ljava/lang/reflect/Type;
    .restart local v7    # "typeVar":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 962
    .end local v0    # "arr$":[Ljava/lang/reflect/Type;
    .end local v1    # "bound":Ljava/lang/reflect/Type;
    .end local v2    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/reflect/TypeVariable<*>;Ljava/lang/reflect/Type;>;"
    .end local v4    # "i$":I
    .end local v5    # "len$":I
    .end local v6    # "type":Ljava/lang/reflect/Type;
    .end local v7    # "typeVar":Ljava/lang/reflect/TypeVariable;, "Ljava/lang/reflect/TypeVariable<*>;"
    :cond_2
    const/4 v8, 0x1

    goto :goto_1
.end method

.class public Lcom/huawei/health/sns/util/protocol/http/utils/ReflectAPI;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDeclaredFields(Ljava/lang/Class;)[Ljava/lang/reflect/Field;
    .locals 11

    .line 31
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ReflectAPI;->getDeclaredFields(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v5

    .line 44
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    .line 47
    if-eqz v5, :cond_1

    array-length v0, v5

    if-lez v0, :cond_1

    .line 49
    array-length v0, v4

    array-length v1, v5

    add-int/2addr v0, v1

    new-array v3, v0, [Ljava/lang/reflect/Field;

    .line 50
    array-length v0, v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v5, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    array-length v0, v5

    array-length v1, v4

    const/4 v2, 0x0

    invoke-static {v4, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 55
    :cond_1
    move-object v3, v4

    .line 59
    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 60
    move-object v7, v3

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    .line 62
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_2

    .line 64
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 68
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    array-length v1, v3

    if-eq v0, v1, :cond_4

    .line 70
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/reflect/Field;

    .line 71
    invoke-interface {v6, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 73
    :cond_4
    return-object v3
.end method

.method public static getMapListGenericType(Ljava/lang/reflect/Field;)Ljava/lang/Class;
    .locals 3

    .line 85
    const/4 v2, 0x0

    .line 86
    const-class v0, Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ReflectAPI;->getType(Ljava/lang/reflect/Field;I)Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 92
    :cond_0
    const-class v0, Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/health/sns/util/protocol/http/utils/ReflectAPI;->getType(Ljava/lang/reflect/Field;I)Ljava/lang/Class;

    move-result-object v2

    .line 96
    :cond_1
    :goto_0
    return-object v2
.end method

.method private static getType(Ljava/lang/reflect/Field;I)Ljava/lang/Class;
    .locals 9

    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v3

    .line 104
    instance-of v0, v3, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_3

    .line 106
    move-object v4, v3

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 108
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v5

    .line 109
    if-eqz v5, :cond_3

    array-length v0, v5

    if-le v0, p1, :cond_3

    .line 113
    :try_start_0
    aget-object v0, v5, p1

    instance-of v0, v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 116
    aget-object v0, v5, p1

    check-cast v0, Ljava/lang/Class;

    move-object v2, v0

    goto :goto_0

    .line 121
    :cond_0
    aget-object v0, v5, p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 123
    const-string v0, "class "

    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    move v7, v0

    if-gez v0, :cond_1

    .line 125
    const/4 v7, 0x0

    .line 128
    :cond_1
    const-string v0, "<"

    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    move v8, v0

    if-gez v0, :cond_2

    .line 130
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    .line 133
    :cond_2
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 134
    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 140
    :goto_0
    goto :goto_1

    .line 137
    :catch_0
    move-exception v6

    .line 139
    const-string v0, "ReflectAPI"

    const-string v1, "getType exception!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :cond_3
    :goto_1
    return-object v2
.end method

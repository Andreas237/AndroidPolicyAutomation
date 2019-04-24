.class public abstract Lcom/huawei/updatesdk/sdk/a/c/d;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/updatesdk/sdk/a/c/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/updatesdk/sdk/a/c/d;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/reflect/Field;)Ljava/lang/Class;
    .locals 3

    const/4 v2, 0x0

    const-class v0, Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/updatesdk/sdk/a/c/d;->a(Ljava/lang/reflect/Field;I)Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-class v0, Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/huawei/updatesdk/sdk/a/c/d;->a(Ljava/lang/reflect/Field;I)Ljava/lang/Class;

    move-result-object v2

    :cond_1
    :goto_0
    return-object v2
.end method

.method private static a(Ljava/lang/reflect/Field;I)Ljava/lang/Class;
    .locals 10

    const/4 v3, 0x0

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v4

    instance-of v0, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_3

    move-object v5, v4

    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v5}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v6

    if-eqz v6, :cond_3

    array-length v0, v6

    if-le v0, p1, :cond_3

    :try_start_0
    aget-object v0, v6, p1

    instance-of v0, v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    aget-object v0, v6, p1

    check-cast v0, Ljava/lang/Class;

    move-object v3, v0

    goto :goto_0

    :cond_0
    aget-object v0, v6, p1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v0, "class "

    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    move v8, v0

    if-gez v0, :cond_1

    const/4 v8, 0x0

    :cond_1
    const-string v0, "<"

    invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    move v9, v0

    if-gez v0, :cond_2

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    :cond_2
    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v7

    sget-object v0, Lcom/huawei/updatesdk/sdk/a/c/d;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getType exception!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-object v3
.end method

.method public static a(Ljava/lang/Class;)[Ljava/lang/reflect/Field;
    .locals 11

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/d;->a(Ljava/lang/Class;)[Ljava/lang/reflect/Field;

    move-result-object v5

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    if-eqz v5, :cond_1

    array-length v0, v5

    if-lez v0, :cond_1

    array-length v0, v4

    array-length v1, v5

    add-int/2addr v0, v1

    new-array v3, v0, [Ljava/lang/reflect/Field;

    array-length v0, v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v5, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v0, v5

    array-length v1, v4

    const/4 v2, 0x0

    invoke-static {v4, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v3

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_2

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    array-length v1, v3

    if-eq v0, v1, :cond_4

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/reflect/Field;

    invoke-interface {v6, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    :cond_4
    return-object v3
.end method

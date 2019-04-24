.class public Lcom/huawei/hms/core/aidl/g;
.super Lcom/huawei/hms/core/aidl/f;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/huawei/hms/core/aidl/f;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/reflect/Type;Landroid/os/Bundle;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/reflect/Type;Landroid/os/Bundle;)Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 36
    const-string v0, "_list_size_"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    .line 37
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_5

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_list_item_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 41
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, v6, Ljava/lang/String;

    if-nez v0, :cond_0

    instance-of v0, v6, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    .line 43
    :cond_0
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 44
    :cond_1
    instance-of v0, v6, Landroid/os/Bundle;

    if-eqz v0, :cond_4

    .line 45
    move-object v4, v6

    check-cast v4, Landroid/os/Bundle;

    .line 46
    const-string v0, "_val_type_"

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v7

    .line 47
    const/4 v0, 0x1

    if-ne v7, v0, :cond_2

    .line 48
    new-instance v0, Ljava/lang/InstantiationException;

    const-string v1, "Nested List can not be supported"

    invoke-direct {v0, v1}, Ljava/lang/InstantiationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_2
    if-nez v7, :cond_3

    .line 50
    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v8, v0, v1

    .line 51
    move-object v9, v8

    check-cast v9, Ljava/lang/Class;

    .line 52
    invoke-virtual {v9}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v10

    .line 53
    move-object v0, v10

    check-cast v0, Lcom/huawei/hms/core/aidl/IMessageEntity;

    invoke-virtual {p0, v4, v0}, Lcom/huawei/hms/core/aidl/g;->a(Landroid/os/Bundle;Lcom/huawei/hms/core/aidl/IMessageEntity;)Lcom/huawei/hms/core/aidl/IMessageEntity;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    goto :goto_1

    .line 55
    :cond_3
    new-instance v0, Ljava/lang/InstantiationException;

    const-string v1, "Unknown type can not be supported"

    invoke-direct {v0, v1}, Ljava/lang/InstantiationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 39
    :cond_4
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 60
    :cond_5
    return-object v3
.end method

.method protected a(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V
    .locals 4

    .line 65
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 66
    const-string v0, "_val_type_"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 67
    const-string v0, "_list_size_"

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 69
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_0

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_list_item_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/hms/core/aidl/g;->a(Ljava/lang/String;Ljava/lang/Object;Landroid/os/Bundle;)V

    .line 69
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p3, p1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 73
    return-void
.end method

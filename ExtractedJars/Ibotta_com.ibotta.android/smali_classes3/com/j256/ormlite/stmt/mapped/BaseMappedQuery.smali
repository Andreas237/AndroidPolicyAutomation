.class public abstract Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;
.super Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;
.source "BaseMappedQuery.java"

# interfaces
.implements Lcom/j256/ormlite/stmt/GenericRowMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement<",
        "TT;TID;>;",
        "Lcom/j256/ormlite/stmt/GenericRowMapper<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private columnPositions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private parent:Ljava/lang/Object;

.field private parentId:Ljava/lang/Object;

.field protected final resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;


# direct methods
.method protected constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lcom/j256/ormlite/field/FieldType;",
            "[",
            "Lcom/j256/ormlite/field/FieldType;",
            ")V"
        }
    .end annotation

    .line 29
    invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V

    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;

    .line 24
    iput-object p1, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;

    .line 25
    iput-object p1, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parentId:Ljava/lang/Object;

    .line 30
    iput-object p4, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    return-void
.end method


# virtual methods
.method public mapRow(Lcom/j256/ormlite/support/DatabaseResults;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/support/DatabaseResults;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 41
    :cond_0
    invoke-interface {p1}, Lcom/j256/ormlite/support/DatabaseResults;->getObjectCache()Lcom/j256/ormlite/dao/ObjectCache;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 43
    iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v2, p1, v0}, Lcom/j256/ormlite/field/FieldType;->resultToJava(Lcom/j256/ormlite/support/DatabaseResults;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v2

    .line 44
    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->clazz:Ljava/lang/Class;

    invoke-interface {v1, v3, v2}, Lcom/j256/ormlite/dao/ObjectCache;->get(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    .line 52
    :cond_1
    iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->tableInfo:Lcom/j256/ormlite/table/TableInfo;

    invoke-virtual {v2}, Lcom/j256/ormlite/table/TableInfo;->createObject()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    .line 56
    iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    array-length v5, v4

    const/4 v6, 0x0

    move-object v8, v3

    const/4 v3, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v3, v5, :cond_5

    aget-object v9, v4, v3

    .line 57
    invoke-virtual {v9}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z

    move-result v10

    const/4 v11, 0x1

    if-eqz v10, :cond_2

    const/4 v7, 0x1

    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {v9, p1, v0}, Lcom/j256/ormlite/field/FieldType;->resultToJava(Lcom/j256/ormlite/support/DatabaseResults;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_3

    .line 67
    iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;

    if-eqz v12, :cond_3

    invoke-virtual {v9}, Lcom/j256/ormlite/field/FieldType;->getField()Ljava/lang/reflect/Field;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v12

    iget-object v13, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    if-ne v12, v13, :cond_3

    iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parentId:Ljava/lang/Object;

    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 69
    iget-object v12, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;

    invoke-virtual {v9, v2, v12, v11, v1}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V

    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v9, v2, v10, v6, v1}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V

    .line 73
    :goto_1
    iget-object v11, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->idField:Lcom/j256/ormlite/field/FieldType;

    if-ne v9, v11, :cond_4

    move-object v8, v10

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-eqz v7, :cond_7

    .line 80
    iget-object p1, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->resultsFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    array-length v3, p1

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_7

    aget-object v5, p1, v4

    .line 81
    invoke-virtual {v5}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 82
    invoke-virtual {v5, v2, v8}, Lcom/j256/ormlite/field/FieldType;->buildForeignCollection(Ljava/lang/Object;Ljava/lang/Object;)Lcom/j256/ormlite/dao/BaseForeignCollection;

    move-result-object v7

    if-eqz v7, :cond_6

    .line 84
    invoke-virtual {v5, v2, v7, v6, v1}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    if-eqz v1, :cond_8

    if-eqz v8, :cond_8

    .line 91
    iget-object p1, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->clazz:Ljava/lang/Class;

    invoke-interface {v1, p1, v8, v2}, Lcom/j256/ormlite/dao/ObjectCache;->put(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    :cond_8
    iget-object p1, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;

    if-nez p1, :cond_9

    .line 94
    iput-object v0, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->columnPositions:Ljava/util/Map;

    :cond_9
    return-object v2
.end method

.method public setParentInformation(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parent:Ljava/lang/Object;

    .line 104
    iput-object p2, p0, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;->parentId:Ljava/lang/Object;

    return-void
.end method

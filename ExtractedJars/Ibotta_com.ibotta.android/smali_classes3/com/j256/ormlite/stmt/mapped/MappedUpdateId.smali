.class public Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;
.super Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;
.source "MappedUpdateId.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement<",
        "TT;TID;>;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lcom/j256/ormlite/field/FieldType;",
            ")V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V

    return-void
.end method

.method public static build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/j256/ormlite/db/DatabaseType;",
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;)",
            "Lcom/j256/ormlite/stmt/mapped/MappedUpdateId<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 57
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x40

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "UPDATE "

    .line 63
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v1, v2, v3}, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->appendTableName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "SET "

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    .line 65
    invoke-static {p0, v1, v0, v2}, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->appendFieldColumnName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V

    const-string v3, "= ? "

    .line 66
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    invoke-static {p0, v0, v1, v2}, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->appendWhereFieldEq(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 68
    new-instance p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/j256/ormlite/field/FieldType;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    invoke-direct {p0, p1, v1, v2}, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V

    return-object p0

    .line 59
    :cond_0
    new-instance p0, Ljava/sql/SQLException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot update-id in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " because it doesn\'t have an id field"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private extractIdToFieldObject(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v0, p1}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public execute(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/support/DatabaseConnection;",
            "TT;TID;",
            "Lcom/j256/ormlite/dao/ObjectCache;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    const/4 v0, 0x2

    .line 30
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, p3}, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->convertIdToFieldObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-direct {p0, p2}, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->extractIdToFieldObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v0, v1

    .line 31
    iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->statement:Ljava/lang/String;

    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    invoke-interface {p1, v1, v0, v3}, Lcom/j256/ormlite/support/DatabaseConnection;->update(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;)I

    move-result p1

    if-lez p1, :cond_1

    if-eqz p4, :cond_0

    .line 34
    iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v1, p2}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 35
    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->clazz:Ljava/lang/Class;

    invoke-interface {p4, v3, v1, p3}, Lcom/j256/ormlite/dao/ObjectCache;->updateId(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eq v1, p2, :cond_0

    .line 38
    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v3, v1, p3, v2, p4}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v1, p2, p3, v2, p4}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V

    .line 44
    :cond_1
    sget-object p3, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p4, "updating-id with statement \'{}\' and {} args, changed {} rows"

    iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->statement:Ljava/lang/String;

    array-length v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p3, p4, v1, v2, v3}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    array-length p3, v0

    if-lez p3, :cond_2

    .line 47
    sget-object p3, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p4, "updating-id arguments: {}"

    invoke-virtual {p3, p4, v0}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return p1

    :catch_0
    move-exception p1

    .line 51
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unable to run update-id stmt on object "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/j256/ormlite/stmt/mapped/MappedUpdateId;->statement:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
.end method

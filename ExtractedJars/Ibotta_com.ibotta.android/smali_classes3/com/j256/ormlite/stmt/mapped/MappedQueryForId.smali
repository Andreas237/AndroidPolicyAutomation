.class public Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
.super Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;
.source "MappedQueryForId.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery<",
        "TT;TID;>;"
    }
.end annotation


# instance fields
.field private final label:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)V
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
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/j256/ormlite/stmt/mapped/BaseMappedQuery;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;)V

    .line 23
    iput-object p5, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;

    return-void
.end method

.method public static build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/j256/ormlite/db/DatabaseType;",
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;",
            "Lcom/j256/ormlite/field/FieldType;",
            ")",
            "Lcom/j256/ormlite/stmt/mapped/MappedQueryForId<",
            "TT;TID;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    if-nez p2, :cond_1

    .line 57
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 59
    :cond_0
    new-instance p0, Ljava/sql/SQLException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot query-for-id with "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " because it doesn\'t have an id field"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 63
    :cond_1
    :goto_0
    invoke-static {p0, p1, p2}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->buildStatement(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;

    move-result-object v2

    .line 64
    new-instance p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;

    const/4 v0, 0x1

    new-array v3, v0, [Lcom/j256/ormlite/field/FieldType;

    const/4 v0, 0x0

    aput-object p2, v3, v0

    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;

    move-result-object v4

    const-string v5, "query-for-id"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)V

    return-object p0
.end method

.method protected static buildStatement(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "ID:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/j256/ormlite/db/DatabaseType;",
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;",
            "Lcom/j256/ormlite/field/FieldType;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "SELECT * FROM "

    .line 72
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, v1, p1}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->appendTableName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 73
    invoke-static {p0, p2, v0, p1}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->appendWhereFieldEq(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private logArgs([Ljava/lang/Object;)V
    .locals 3

    .line 78
    array-length v0, p1

    if-lez v0, :cond_0

    .line 80
    sget-object v0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v1, "{} arguments: {}"

    iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, p1}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public execute(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/support/DatabaseConnection;",
            "TID;",
            "Lcom/j256/ormlite/dao/ObjectCache;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    if-eqz p3, :cond_0

    .line 31
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->clazz:Ljava/lang/Class;

    invoke-interface {p3, v0, p2}, Lcom/j256/ormlite/dao/ObjectCache;->get(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    .line 36
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p0, p2}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->convertIdToFieldObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    aput-object p2, v0, v1

    .line 38
    iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;

    iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    move-object v1, p1

    move-object v3, v0

    move-object v5, p0

    move-object v6, p3

    invoke-interface/range {v1 .. v6}, Lcom/j256/ormlite/support/DatabaseConnection;->queryForOne(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/stmt/GenericRowMapper;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    .line 40
    sget-object p2, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p3, "{} using \'{}\' and {} args, got no results"

    iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;

    array-length v3, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p2, p3, v1, v2, v3}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 41
    :cond_1
    sget-object p2, Lcom/j256/ormlite/support/DatabaseConnection;->MORE_THAN_ONE:Ljava/lang/Object;

    if-eq p1, p2, :cond_2

    .line 46
    sget-object p2, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p3, "{} using \'{}\' and {} args, got 1 result"

    iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;

    iget-object v2, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;

    array-length v3, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p2, p3, v1, v2, v3}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    :goto_0
    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logArgs([Ljava/lang/Object;)V

    return-object p1

    .line 42
    :cond_2
    sget-object p1, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logger:Lcom/j256/ormlite/logger/Logger;

    iget-object p2, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;

    iget-object p3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;

    array-length v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "{} using \'{}\' and {} args, got >1 results"

    invoke-virtual {p1, v2, p2, p3, v1}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    invoke-direct {p0, v0}, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->logArgs([Ljava/lang/Object;)V

    .line 44
    new-instance p1, Ljava/sql/SQLException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->label:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " got more than 1 result: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/j256/ormlite/stmt/mapped/MappedQueryForId;->statement:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.class public Lcom/j256/ormlite/stmt/mapped/MappedCreate;
.super Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;
.source "MappedCreate.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;
    }
.end annotation

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


# instance fields
.field private dataClassName:Ljava/lang/String;

.field private final queryNextSequenceStmt:Ljava/lang/String;

.field private versionFieldTypeIndex:I


# direct methods
.method private constructor <init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/table/TableInfo<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lcom/j256/ormlite/field/FieldType;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0, p1, p2, p3}, Lcom/j256/ormlite/stmt/mapped/BaseMappedStatement;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;)V

    .line 28
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getDataClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->dataClassName:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->queryNextSequenceStmt:Ljava/lang/String;

    .line 30
    iput p5, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I

    return-void
.end method

.method private assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Number;",
            "Ljava/lang/String;",
            "Lcom/j256/ormlite/dao/ObjectCache;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 248
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v0, p1, p2, p4}, Lcom/j256/ormlite/field/FieldType;->assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Lcom/j256/ormlite/dao/ObjectCache;)Ljava/lang/Object;

    .line 249
    sget-object p1, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;

    sget-object p4, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;

    invoke-virtual {p1, p4}, Lcom/j256/ormlite/logger/Logger;->isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 250
    sget-object p1, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p4, "assigned id \'{}\' from {} to \'{}\' in {} object"

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 p2, 0x1

    aput-object p3, v0, p2

    const/4 p2, 0x2

    iget-object p3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {p3}, Lcom/j256/ormlite/field/FieldType;->getFieldName()Ljava/lang/String;

    move-result-object p3

    aput-object p3, v0, p2

    const/4 p2, 0x3

    iget-object p3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->dataClassName:Ljava/lang/String;

    aput-object p3, v0, p2

    invoke-virtual {p1, p4, v0}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private assignSequenceId(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/support/DatabaseConnection;",
            "TT;",
            "Lcom/j256/ormlite/dao/ObjectCache;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 237
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->queryNextSequenceStmt:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/j256/ormlite/support/DatabaseConnection;->queryForLong(Ljava/lang/String;)J

    move-result-wide v0

    .line 238
    sget-object p1, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v2, "queried for sequence {} using stmt: {}"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->queryNextSequenceStmt:Ljava/lang/String;

    invoke-virtual {p1, v2, v3, v4}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    .line 243
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string v0, "sequence"

    invoke-direct {p0, p2, p1, v0, p3}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V

    return-void

    .line 241
    :cond_0
    new-instance p1, Ljava/sql/SQLException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Should not have returned 0 for stmt: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->queryNextSequenceStmt:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static build(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/table/TableInfo;)Lcom/j256/ormlite/stmt/mapped/MappedCreate;
    .locals 12
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
            "Lcom/j256/ormlite/stmt/mapped/MappedCreate<",
            "TT;TID;>;"
        }
    .end annotation

    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "INSERT INTO "

    .line 141
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getTableName()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v0, v1, v2}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->appendTableName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v11, -0x1

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v6, v1, v4

    .line 146
    invoke-static {p0, v6}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->isFieldCreatable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 147
    invoke-virtual {v6}, Lcom/j256/ormlite/field/FieldType;->isVersion()Z

    move-result v6

    if-eqz v6, :cond_0

    move v11, v5

    :cond_0
    add-int/lit8 v5, v5, 0x1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 153
    :cond_2
    new-array v9, v5, [Lcom/j256/ormlite/field/FieldType;

    if-nez v5, :cond_3

    .line 155
    invoke-interface {p0, v0}, Lcom/j256/ormlite/db/DatabaseType;->appendInsertNoColumns(Ljava/lang/StringBuilder;)V

    goto :goto_7

    :cond_3
    const/16 v1, 0x28

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 160
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    array-length v2, v1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    :goto_1
    if-ge v5, v2, :cond_6

    aget-object v8, v1, v5

    .line 161
    invoke-static {p0, v8}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->isFieldCreatable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Z

    move-result v10

    if-nez v10, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v6, :cond_5

    const/4 v6, 0x0

    goto :goto_2

    :cond_5
    const-string v10, ","

    .line 167
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    const/4 v10, 0x0

    .line 169
    invoke-static {p0, v0, v8, v10}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->appendFieldColumnName(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/StringBuilder;Lcom/j256/ormlite/field/FieldType;Ljava/util/List;)V

    add-int/lit8 v10, v7, 0x1

    .line 170
    aput-object v8, v9, v7

    move v7, v10

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    const-string v1, ") VALUES ("

    .line 172
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    array-length v2, v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    :goto_4
    if-ge v4, v2, :cond_9

    aget-object v6, v1, v4

    .line 175
    invoke-static {p0, v6}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->isFieldCreatable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_6

    :cond_7
    if-eqz v5, :cond_8

    const/4 v5, 0x0

    goto :goto_5

    :cond_8
    const-string v6, ","

    .line 181
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_5
    const-string v6, "?"

    .line 183
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_9
    const-string v1, ")"

    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    :goto_7
    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getIdField()Lcom/j256/ormlite/field/FieldType;

    move-result-object v1

    .line 188
    invoke-static {p0, v1}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->buildQueryNextSequence(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;

    move-result-object v10

    .line 189
    new-instance p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v6 .. v11}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;-><init>(Lcom/j256/ormlite/table/TableInfo;Ljava/lang/String;[Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)V

    return-object p0
.end method

.method private static buildQueryNextSequence(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 224
    :cond_0
    invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->getGeneratedIdSequence()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    .line 228
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 229
    invoke-interface {p0, v0, p1}, Lcom/j256/ormlite/db/DatabaseType;->appendSelectNextValFromSequence(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private foreignCollectionsAreAssigned([Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 193
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    .line 194
    invoke-virtual {v3, p2}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private static isFieldCreatable(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/field/FieldType;)Z
    .locals 3

    .line 203
    invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isForeignCollection()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 206
    :cond_0
    invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isReadOnly()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 209
    :cond_1
    invoke-interface {p0}, Lcom/j256/ormlite/db/DatabaseType;->isIdSequenceNeeded()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-interface {p0}, Lcom/j256/ormlite/db/DatabaseType;->isSelectSequenceBeforeInsert()Z

    move-result p0

    if-eqz p0, :cond_2

    return v2

    .line 212
    :cond_2
    invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isAllowGeneratedIdInsert()Z

    move-result p0

    if-nez p0, :cond_3

    return v1

    :cond_3
    return v2
.end method


# virtual methods
.method public insert(Lcom/j256/ormlite/db/DatabaseType;Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/j256/ormlite/db/DatabaseType;",
            "Lcom/j256/ormlite/support/DatabaseConnection;",
            "TT;",
            "Lcom/j256/ormlite/dao/ObjectCache;",
            ")I"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 41
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->isAllowGeneratedIdInsert()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v0, p3}, Lcom/j256/ormlite/field/FieldType;->isObjectsFieldValueDefault(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 46
    :goto_0
    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v3}, Lcom/j256/ormlite/field/FieldType;->isSelfGeneratedId()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v3}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z

    move-result v3

    if-eqz v3, :cond_1

    if-eqz v0, :cond_3

    .line 48
    iget-object p1, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v0}, Lcom/j256/ormlite/field/FieldType;->generateId()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p3, v0, v1, p4}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V

    goto :goto_1

    .line 50
    :cond_1
    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {v3}, Lcom/j256/ormlite/field/FieldType;->isGeneratedIdSequence()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Lcom/j256/ormlite/db/DatabaseType;->isSelectSequenceBeforeInsert()Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz v0, :cond_3

    .line 52
    invoke-direct {p0, p2, p3, p4}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->assignSequenceId(Lcom/j256/ormlite/support/DatabaseConnection;Ljava/lang/Object;Lcom/j256/ormlite/dao/ObjectCache;)V

    goto :goto_1

    .line 54
    :cond_2
    iget-object p1, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {p1}, Lcom/j256/ormlite/field/FieldType;->isGeneratedId()Z

    move-result p1

    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    .line 57
    new-instance p1, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;

    invoke-direct {p1, v2}, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;-><init>(Lcom/j256/ormlite/stmt/mapped/MappedCreate$1;)V

    goto :goto_2

    :cond_3
    :goto_1
    move-object p1, v2

    .line 66
    :goto_2
    :try_start_0
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->tableInfo:Lcom/j256/ormlite/table/TableInfo;

    invoke-virtual {v0}, Lcom/j256/ormlite/table/TableInfo;->isForeignAutoCreate()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 67
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->tableInfo:Lcom/j256/ormlite/table/TableInfo;

    invoke-virtual {v0}, Lcom/j256/ormlite/table/TableInfo;->getFieldTypes()[Lcom/j256/ormlite/field/FieldType;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_6

    aget-object v5, v0, v4

    .line 68
    invoke-virtual {v5}, Lcom/j256/ormlite/field/FieldType;->isForeignAutoCreate()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    .line 72
    :cond_4
    invoke-virtual {v5, p3}, Lcom/j256/ormlite/field/FieldType;->extractRawJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 73
    invoke-virtual {v5}, Lcom/j256/ormlite/field/FieldType;->getForeignIdField()Lcom/j256/ormlite/field/FieldType;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/j256/ormlite/field/FieldType;->isObjectsFieldValueDefault(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 74
    invoke-virtual {v5, v6}, Lcom/j256/ormlite/field/FieldType;->createWithForeignDao(Ljava/lang/Object;)I

    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 79
    :cond_6
    invoke-virtual {p0, p3}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->getFieldObjects(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    .line 82
    iget v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I

    if-ltz v3, :cond_7

    iget v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I

    aget-object v3, v0, v3

    if-nez v3, :cond_7

    .line 84
    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    iget v4, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I

    aget-object v3, v3, v4

    .line 85
    invoke-virtual {v3, v2}, Lcom/j256/ormlite/field/FieldType;->moveToNextValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 86
    iget v5, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I

    invoke-virtual {v3, v4}, Lcom/j256/ormlite/field/FieldType;->convertJavaFieldToSqlArgValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v0, v5
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_5

    :cond_7
    move-object v4, v2

    .line 91
    :goto_5
    :try_start_1
    iget-object v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->statement:Ljava/lang/String;

    iget-object v5, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    invoke-interface {p2, v3, v0, v5, p1}, Lcom/j256/ormlite/support/DatabaseConnection;->insert(Ljava/lang/String;[Ljava/lang/Object;[Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/support/GeneratedKeyHolder;)I

    move-result p2
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    :try_start_2
    sget-object v3, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v5, "insert data with statement \'{}\' and {} args, changed {} rows"

    iget-object v6, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->statement:Ljava/lang/String;

    array-length v7, v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v3, v5, v6, v7, v8}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    array-length v3, v0

    if-lez v3, :cond_8

    .line 104
    sget-object v3, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string v5, "insert arguments: {}"

    invoke-virtual {v3, v5, v0}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    if-lez p2, :cond_d

    if-eqz v4, :cond_9

    .line 108
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->argFieldTypes:[Lcom/j256/ormlite/field/FieldType;

    iget v3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->versionFieldTypeIndex:I

    aget-object v0, v0, v3

    invoke-virtual {v0, p3, v4, v1, v2}, Lcom/j256/ormlite/field/FieldType;->assignField(Ljava/lang/Object;Ljava/lang/Object;ZLcom/j256/ormlite/dao/ObjectCache;)V

    :cond_9
    if-eqz p1, :cond_c

    .line 112
    invoke-virtual {p1}, Lcom/j256/ormlite/stmt/mapped/MappedCreate$KeyHolder;->getKey()Ljava/lang/Number;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 117
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_a

    const-string v0, "keyholder"

    .line 121
    invoke-direct {p0, p3, p1, v0, p4}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->assignIdValue(Ljava/lang/Object;Ljava/lang/Number;Ljava/lang/String;Lcom/j256/ormlite/dao/ObjectCache;)V

    goto :goto_6

    .line 119
    :cond_a
    new-instance p1, Ljava/sql/SQLException;

    const-string p2, "generated-id key must not be 0 value"

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 115
    :cond_b
    new-instance p1, Ljava/sql/SQLException;

    const-string p2, "generated-id key was not set by the update call"

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_6
    if-eqz p4, :cond_d

    .line 127
    iget-object p1, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->tableInfo:Lcom/j256/ormlite/table/TableInfo;

    invoke-virtual {p1}, Lcom/j256/ormlite/table/TableInfo;->getForeignCollections()[Lcom/j256/ormlite/field/FieldType;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->foreignCollectionsAreAssigned([Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    .line 128
    iget-object p1, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->idField:Lcom/j256/ormlite/field/FieldType;

    invoke-virtual {p1, p3}, Lcom/j256/ormlite/field/FieldType;->extractJavaFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 129
    iget-object v0, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->clazz:Ljava/lang/Class;

    invoke-interface {p4, v0, p1, p3}, Lcom/j256/ormlite/dao/ObjectCache;->put(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_d
    return p2

    :catch_0
    move-exception p1

    .line 93
    sget-object p2, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p4, "insert data with statement \'{}\' and {} args, threw exception: {}"

    iget-object v1, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->statement:Ljava/lang/String;

    array-length v2, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, p4, v1, v2, p1}, Lcom/j256/ormlite/logger/Logger;->debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    array-length p2, v0

    if-lez p2, :cond_e

    .line 97
    sget-object p2, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->logger:Lcom/j256/ormlite/logger/Logger;

    const-string p4, "insert arguments: {}"

    invoke-virtual {p2, p4, v0}, Lcom/j256/ormlite/logger/Logger;->trace(Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    :cond_e
    throw p1
    :try_end_2
    .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    .line 135
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Unable to run insert stmt on object "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ": "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/j256/ormlite/stmt/mapped/MappedCreate;->statement:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
.end method

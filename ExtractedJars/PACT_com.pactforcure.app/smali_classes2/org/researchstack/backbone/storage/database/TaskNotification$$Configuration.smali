.class public final Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;
.super Ljava/lang/Object;
.source "TaskNotification$$Configuration.java"

# interfaces
.implements Lco/touchlab/squeaky/table/GeneratedTableMapper;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration$Fields;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/touchlab/squeaky/table/GeneratedTableMapper",
        "<",
        "Lorg/researchstack/backbone/storage/database/TaskNotification;",
        ">;"
    }
.end annotation


# static fields
.field public static final instance:Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;


# instance fields
.field fields:[Lco/touchlab/squeaky/field/FieldsEnum;

.field foreignConfigs:[Lco/touchlab/squeaky/field/ForeignCollectionInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;

    invoke-direct {v0}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;-><init>()V

    sput-object v0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->instance:Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->getFields()[Lco/touchlab/squeaky/field/FieldsEnum;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    .line 36
    invoke-static {}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->getForeignConfigs()[Lco/touchlab/squeaky/field/ForeignCollectionInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->foreignConfigs:[Lco/touchlab/squeaky/field/ForeignCollectionInfo;

    .line 37
    return-void
.end method

.method public static getFields()[Lco/touchlab/squeaky/field/FieldsEnum;
    .locals 1

    .prologue
    .line 115
    invoke-static {}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration$Fields;->values()[Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration$Fields;

    move-result-object v0

    return-object v0
.end method

.method public static getForeignConfigs()[Lco/touchlab/squeaky/field/ForeignCollectionInfo;
    .locals 3

    .prologue
    .line 119
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 120
    .local v1, "list":Ljava/util/List;, "Ljava/util/List<Lco/touchlab/squeaky/field/ForeignCollectionInfo;>;"
    const/4 v0, 0x0

    .line 121
    .local v0, "config":Lco/touchlab/squeaky/field/ForeignCollectionInfo;
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lco/touchlab/squeaky/field/ForeignCollectionInfo;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lco/touchlab/squeaky/field/ForeignCollectionInfo;

    return-object v2
.end method


# virtual methods
.method public bridge synthetic assignId(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 27
    check-cast p1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->assignId(Lorg/researchstack/backbone/storage/database/TaskNotification;Ljava/lang/Object;)V

    return-void
.end method

.method public assignId(Lorg/researchstack/backbone/storage/database/TaskNotification;Ljava/lang/Object;)V
    .locals 1
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/TaskNotification;
    .param p2, "val"    # Ljava/lang/Object;

    .prologue
    .line 54
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, p2}, Lco/touchlab/squeaky/field/OrmLiteHelper;->safeConvert(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lorg/researchstack/backbone/storage/database/TaskNotification;->id:I

    .line 55
    return-void
.end method

.method public bridge synthetic bindCreateVals(Lco/touchlab/squeaky/db/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 27
    check-cast p2, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->bindCreateVals(Lco/touchlab/squeaky/db/SQLiteStatement;Lorg/researchstack/backbone/storage/database/TaskNotification;)V

    return-void
.end method

.method public bindCreateVals(Lco/touchlab/squeaky/db/SQLiteStatement;Lorg/researchstack/backbone/storage/database/TaskNotification;)V
    .locals 6
    .param p1, "stmt"    # Lco/touchlab/squeaky/db/SQLiteStatement;
    .param p2, "data"    # Lorg/researchstack/backbone/storage/database/TaskNotification;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 86
    iget-object v0, p2, Lorg/researchstack/backbone/storage/database/TaskNotification;->endDate:Ljava/util/Date;

    .line 87
    .local v0, "val1":Ljava/util/Date;
    if-nez v0, :cond_0

    .line 88
    invoke-interface {p1, v4}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 92
    :goto_0
    iget-object v1, p2, Lorg/researchstack/backbone/storage/database/TaskNotification;->chronTime:Ljava/lang/String;

    .line 93
    .local v1, "val2":Ljava/lang/String;
    if-nez v1, :cond_1

    .line 94
    invoke-interface {p1, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 98
    :goto_1
    return-void

    .line 90
    .end local v1    # "val2":Ljava/lang/String;
    :cond_0
    iget-object v2, p0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v2, v2, v4

    invoke-interface {v2}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v2

    invoke-virtual {v2}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v3, v3, v4

    invoke-interface {v3}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Lco/touchlab/squeaky/field/DataPersister;->javaToSqlArg(Lco/touchlab/squeaky/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v4, v2}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_0

    .line 96
    .restart local v1    # "val2":Ljava/lang/String;
    :cond_1
    iget-object v2, p2, Lorg/researchstack/backbone/storage/database/TaskNotification;->chronTime:Ljava/lang/String;

    invoke-interface {p1, v5, v2}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_1
.end method

.method public bridge synthetic bindVals(Lco/touchlab/squeaky/db/SQLiteStatement;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 27
    check-cast p2, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->bindVals(Lco/touchlab/squeaky/db/SQLiteStatement;Lorg/researchstack/backbone/storage/database/TaskNotification;)V

    return-void
.end method

.method public bindVals(Lco/touchlab/squeaky/db/SQLiteStatement;Lorg/researchstack/backbone/storage/database/TaskNotification;)V
    .locals 6
    .param p1, "stmt"    # Lco/touchlab/squeaky/db/SQLiteStatement;
    .param p2, "data"    # Lorg/researchstack/backbone/storage/database/TaskNotification;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 69
    iget-object v0, p2, Lorg/researchstack/backbone/storage/database/TaskNotification;->endDate:Ljava/util/Date;

    .line 70
    .local v0, "val1":Ljava/util/Date;
    if-nez v0, :cond_0

    .line 71
    invoke-interface {p1, v4}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 75
    :goto_0
    iget-object v1, p2, Lorg/researchstack/backbone/storage/database/TaskNotification;->chronTime:Ljava/lang/String;

    .line 76
    .local v1, "val2":Ljava/lang/String;
    if-nez v1, :cond_1

    .line 77
    invoke-interface {p1, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 81
    :goto_1
    const/4 v2, 0x3

    iget v3, p2, Lorg/researchstack/backbone/storage/database/TaskNotification;->id:I

    int-to-long v4, v3

    invoke-interface {p1, v2, v4, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindLong(IJ)V

    .line 82
    return-void

    .line 73
    .end local v1    # "val2":Ljava/lang/String;
    :cond_0
    iget-object v2, p0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v2, v2, v4

    invoke-interface {v2}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v2

    invoke-virtual {v2}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v3, v3, v4

    invoke-interface {v3}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Lco/touchlab/squeaky/field/DataPersister;->javaToSqlArg(Lco/touchlab/squeaky/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v4, v2}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_0

    .line 79
    .restart local v1    # "val2":Ljava/lang/String;
    :cond_1
    iget-object v2, p2, Lorg/researchstack/backbone/storage/database/TaskNotification;->chronTime:Ljava/lang/String;

    invoke-interface {p1, v5, v2}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_1
.end method

.method public bridge synthetic createObject(Landroid/database/Cursor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->createObject(Landroid/database/Cursor;)Lorg/researchstack/backbone/storage/database/TaskNotification;

    move-result-object v0

    return-object v0
.end method

.method public createObject(Landroid/database/Cursor;)Lorg/researchstack/backbone/storage/database/TaskNotification;
    .locals 1
    .param p1, "results"    # Landroid/database/Cursor;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 41
    new-instance v0, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-direct {v0}, Lorg/researchstack/backbone/storage/database/TaskNotification;-><init>()V

    .line 42
    .local v0, "data":Lorg/researchstack/backbone/storage/database/TaskNotification;
    return-object v0
.end method

.method public extractId(Lorg/researchstack/backbone/storage/database/TaskNotification;)Ljava/lang/Integer;
    .locals 3
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/TaskNotification;

    .prologue
    const/4 v1, 0x0

    .line 59
    if-nez p1, :cond_0

    .line 64
    :goto_0
    return-object v1

    .line 62
    :cond_0
    iget v2, p1, Lorg/researchstack/backbone/storage/database/TaskNotification;->id:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 63
    .local v0, "val":Ljava/lang/Integer;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_1

    move-object v0, v1

    :cond_1
    move-object v1, v0

    .line 64
    goto :goto_0
.end method

.method public bridge synthetic extractId(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    check-cast p1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->extractId(Lorg/researchstack/backbone/storage/database/TaskNotification;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic fillForeignCollection(Ljava/lang/Object;Lco/touchlab/squeaky/dao/ModelDao;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 27
    check-cast p1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, p1, p2, p3}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fillForeignCollection(Lorg/researchstack/backbone/storage/database/TaskNotification;Lco/touchlab/squeaky/dao/ModelDao;Ljava/lang/String;)V

    return-void
.end method

.method public fillForeignCollection(Lorg/researchstack/backbone/storage/database/TaskNotification;Lco/touchlab/squeaky/dao/ModelDao;Ljava/lang/String;)V
    .locals 0
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/TaskNotification;
    .param p3, "fieldName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/researchstack/backbone/storage/database/TaskNotification;",
            "Lco/touchlab/squeaky/dao/ModelDao",
            "<",
            "Lorg/researchstack/backbone/storage/database/TaskNotification;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 112
    .local p2, "modelDao":Lco/touchlab/squeaky/dao/ModelDao;, "Lco/touchlab/squeaky/dao/ModelDao<Lorg/researchstack/backbone/storage/database/TaskNotification;>;"
    return-void
.end method

.method public bridge synthetic fillRow(Ljava/lang/Object;Landroid/database/Cursor;Lco/touchlab/squeaky/dao/ModelDao;[Lco/touchlab/squeaky/dao/Dao$ForeignRefresh;Lco/touchlab/squeaky/table/TransientCache;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 27
    move-object v1, p1

    check-cast v1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fillRow(Lorg/researchstack/backbone/storage/database/TaskNotification;Landroid/database/Cursor;Lco/touchlab/squeaky/dao/ModelDao;[Lco/touchlab/squeaky/dao/Dao$ForeignRefresh;Lco/touchlab/squeaky/table/TransientCache;)V

    return-void
.end method

.method public fillRow(Lorg/researchstack/backbone/storage/database/TaskNotification;Landroid/database/Cursor;Lco/touchlab/squeaky/dao/ModelDao;[Lco/touchlab/squeaky/dao/Dao$ForeignRefresh;Lco/touchlab/squeaky/table/TransientCache;)V
    .locals 3
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/TaskNotification;
    .param p2, "results"    # Landroid/database/Cursor;
    .param p4, "foreignRefreshMap"    # [Lco/touchlab/squeaky/dao/Dao$ForeignRefresh;
    .param p5, "objectCache"    # Lco/touchlab/squeaky/table/TransientCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/researchstack/backbone/storage/database/TaskNotification;",
            "Landroid/database/Cursor;",
            "Lco/touchlab/squeaky/dao/ModelDao",
            "<",
            "Lorg/researchstack/backbone/storage/database/TaskNotification;",
            ">;[",
            "Lco/touchlab/squeaky/dao/Dao$ForeignRefresh;",
            "Lco/touchlab/squeaky/table/TransientCache;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .local p3, "modelDao":Lco/touchlab/squeaky/dao/ModelDao;, "Lco/touchlab/squeaky/dao/ModelDao<Lorg/researchstack/backbone/storage/database/TaskNotification;>;"
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 47
    invoke-interface {p2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p1, Lorg/researchstack/backbone/storage/database/TaskNotification;->id:I

    .line 48
    :cond_0
    invoke-interface {p2, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v0, v0, v2

    invoke-interface {v0}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v0

    invoke-virtual {v0}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v1, v1, v2

    invoke-interface {v1}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v1

    invoke-interface {v0, v1, p2, v2}, Lco/touchlab/squeaky/field/DataPersister;->resultToJava(Lco/touchlab/squeaky/field/FieldType;Landroid/database/Cursor;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p1, Lorg/researchstack/backbone/storage/database/TaskNotification;->endDate:Ljava/util/Date;

    .line 49
    :cond_1
    const/4 v0, 0x2

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lorg/researchstack/backbone/storage/database/TaskNotification;->chronTime:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public getTableConfig()Lco/touchlab/squeaky/table/TableInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/touchlab/squeaky/table/TableInfo",
            "<",
            "Lorg/researchstack/backbone/storage/database/TaskNotification;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 125
    new-instance v0, Lco/touchlab/squeaky/table/TableInfo;

    const-class v1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    const-string v2, "tasknotification"

    invoke-static {}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->getFields()[Lco/touchlab/squeaky/field/FieldsEnum;

    move-result-object v3

    invoke-static {}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->getForeignConfigs()[Lco/touchlab/squeaky/field/ForeignCollectionInfo;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lco/touchlab/squeaky/table/TableInfo;-><init>(Ljava/lang/Class;Ljava/lang/String;[Lco/touchlab/squeaky/field/FieldsEnum;[Lco/touchlab/squeaky/field/ForeignCollectionInfo;)V

    .line 126
    .local v0, "config":Lco/touchlab/squeaky/table/TableInfo;, "Lco/touchlab/squeaky/table/TableInfo<Lorg/researchstack/backbone/storage/database/TaskNotification;>;"
    return-object v0
.end method

.method public bridge synthetic objectToString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 27
    check-cast p1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->objectToString(Lorg/researchstack/backbone/storage/database/TaskNotification;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public objectToString(Lorg/researchstack/backbone/storage/database/TaskNotification;)Ljava/lang/String;
    .locals 1
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/TaskNotification;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 102
    const-string v0, "heyo"

    return-object v0
.end method

.method public bridge synthetic objectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 27
    check-cast p1, Lorg/researchstack/backbone/storage/database/TaskNotification;

    check-cast p2, Lorg/researchstack/backbone/storage/database/TaskNotification;

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/storage/database/TaskNotification$$Configuration;->objectsEqual(Lorg/researchstack/backbone/storage/database/TaskNotification;Lorg/researchstack/backbone/storage/database/TaskNotification;)Z

    move-result v0

    return v0
.end method

.method public objectsEqual(Lorg/researchstack/backbone/storage/database/TaskNotification;Lorg/researchstack/backbone/storage/database/TaskNotification;)Z
    .locals 1
    .param p1, "d1"    # Lorg/researchstack/backbone/storage/database/TaskNotification;
    .param p2, "d2"    # Lorg/researchstack/backbone/storage/database/TaskNotification;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 107
    const/4 v0, 0x0

    return v0
.end method

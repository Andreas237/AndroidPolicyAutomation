.class public final Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;
.super Ljava/lang/Object;
.source "StepRecord$$Configuration.java"

# interfaces
.implements Lco/touchlab/squeaky/table/GeneratedTableMapper;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/touchlab/squeaky/table/GeneratedTableMapper",
        "<",
        "Lorg/researchstack/backbone/storage/database/StepRecord;",
        ">;"
    }
.end annotation


# static fields
.field public static final instance:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;


# instance fields
.field fields:[Lco/touchlab/squeaky/field/FieldsEnum;

.field foreignConfigs:[Lco/touchlab/squeaky/field/ForeignCollectionInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    new-instance v0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;

    invoke-direct {v0}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;-><init>()V

    sput-object v0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->instance:Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->getFields()[Lco/touchlab/squeaky/field/FieldsEnum;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    .line 36
    invoke-static {}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->getForeignConfigs()[Lco/touchlab/squeaky/field/ForeignCollectionInfo;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->foreignConfigs:[Lco/touchlab/squeaky/field/ForeignCollectionInfo;

    .line 37
    return-void
.end method

.method public static getFields()[Lco/touchlab/squeaky/field/FieldsEnum;
    .locals 1

    .prologue
    .line 157
    invoke-static {}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;->values()[Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration$Fields;

    move-result-object v0

    return-object v0
.end method

.method public static getForeignConfigs()[Lco/touchlab/squeaky/field/ForeignCollectionInfo;
    .locals 3

    .prologue
    .line 161
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .local v1, "list":Ljava/util/List;, "Ljava/util/List<Lco/touchlab/squeaky/field/ForeignCollectionInfo;>;"
    const/4 v0, 0x0

    .line 163
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
    check-cast p1, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->assignId(Lorg/researchstack/backbone/storage/database/StepRecord;Ljava/lang/Object;)V

    return-void
.end method

.method public assignId(Lorg/researchstack/backbone/storage/database/StepRecord;Ljava/lang/Object;)V
    .locals 1
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/StepRecord;
    .param p2, "val"    # Ljava/lang/Object;

    .prologue
    .line 58
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, p2}, Lco/touchlab/squeaky/field/OrmLiteHelper;->safeConvert(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->id:I

    .line 59
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
    check-cast p2, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->bindCreateVals(Lco/touchlab/squeaky/db/SQLiteStatement;Lorg/researchstack/backbone/storage/database/StepRecord;)V

    return-void
.end method

.method public bindCreateVals(Lco/touchlab/squeaky/db/SQLiteStatement;Lorg/researchstack/backbone/storage/database/StepRecord;)V
    .locals 13
    .param p1, "stmt"    # Lco/touchlab/squeaky/db/SQLiteStatement;
    .param p2, "data"    # Lorg/researchstack/backbone/storage/database/StepRecord;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    const/4 v12, 0x6

    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v9, 0x5

    const/4 v8, 0x4

    .line 109
    const/4 v5, 0x1

    iget v6, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->taskRecordId:I

    int-to-long v6, v6

    invoke-interface {p1, v5, v6, v7}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindLong(IJ)V

    .line 110
    iget-object v0, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->taskId:Ljava/lang/String;

    .line 111
    .local v0, "val2":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 112
    invoke-interface {p1, v10}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 116
    :goto_0
    iget-object v1, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->stepId:Ljava/lang/String;

    .line 117
    .local v1, "val3":Ljava/lang/String;
    if-nez v1, :cond_1

    .line 118
    invoke-interface {p1, v11}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 122
    :goto_1
    iget-object v2, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->started:Ljava/util/Date;

    .line 123
    .local v2, "val4":Ljava/util/Date;
    if-nez v2, :cond_2

    .line 124
    invoke-interface {p1, v8}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 128
    :goto_2
    iget-object v3, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->completed:Ljava/util/Date;

    .line 129
    .local v3, "val5":Ljava/util/Date;
    if-nez v3, :cond_3

    .line 130
    invoke-interface {p1, v9}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 134
    :goto_3
    iget-object v4, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->result:Ljava/lang/String;

    .line 135
    .local v4, "val6":Ljava/lang/String;
    if-nez v4, :cond_4

    .line 136
    invoke-interface {p1, v12}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 140
    :goto_4
    return-void

    .line 114
    .end local v1    # "val3":Ljava/lang/String;
    .end local v2    # "val4":Ljava/util/Date;
    .end local v3    # "val5":Ljava/util/Date;
    .end local v4    # "val6":Ljava/lang/String;
    :cond_0
    iget-object v5, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->taskId:Ljava/lang/String;

    invoke-interface {p1, v10, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_0

    .line 120
    .restart local v1    # "val3":Ljava/lang/String;
    :cond_1
    iget-object v5, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->stepId:Ljava/lang/String;

    invoke-interface {p1, v11, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_1

    .line 126
    .restart local v2    # "val4":Ljava/util/Date;
    :cond_2
    iget-object v5, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v5, v5, v8

    invoke-interface {v5}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v5

    invoke-virtual {v5}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v5

    iget-object v6, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v6, v6, v8

    invoke-interface {v6}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v6

    invoke-interface {v5, v6, v2}, Lco/touchlab/squeaky/field/DataPersister;->javaToSqlArg(Lco/touchlab/squeaky/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v8, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_2

    .line 132
    .restart local v3    # "val5":Ljava/util/Date;
    :cond_3
    iget-object v5, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v5, v5, v9

    invoke-interface {v5}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v5

    invoke-virtual {v5}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v5

    iget-object v6, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v6, v6, v9

    invoke-interface {v6}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Lco/touchlab/squeaky/field/DataPersister;->javaToSqlArg(Lco/touchlab/squeaky/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v9, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_3

    .line 138
    .restart local v4    # "val6":Ljava/lang/String;
    :cond_4
    iget-object v5, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->result:Ljava/lang/String;

    invoke-interface {p1, v12, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_4
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
    check-cast p2, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->bindVals(Lco/touchlab/squeaky/db/SQLiteStatement;Lorg/researchstack/backbone/storage/database/StepRecord;)V

    return-void
.end method

.method public bindVals(Lco/touchlab/squeaky/db/SQLiteStatement;Lorg/researchstack/backbone/storage/database/StepRecord;)V
    .locals 13
    .param p1, "stmt"    # Lco/touchlab/squeaky/db/SQLiteStatement;
    .param p2, "data"    # Lorg/researchstack/backbone/storage/database/StepRecord;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    const/4 v12, 0x6

    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v9, 0x5

    const/4 v8, 0x4

    .line 73
    const/4 v5, 0x1

    iget v6, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->taskRecordId:I

    int-to-long v6, v6

    invoke-interface {p1, v5, v6, v7}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindLong(IJ)V

    .line 74
    iget-object v0, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->taskId:Ljava/lang/String;

    .line 75
    .local v0, "val2":Ljava/lang/String;
    if-nez v0, :cond_0

    .line 76
    invoke-interface {p1, v10}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 80
    :goto_0
    iget-object v1, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->stepId:Ljava/lang/String;

    .line 81
    .local v1, "val3":Ljava/lang/String;
    if-nez v1, :cond_1

    .line 82
    invoke-interface {p1, v11}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 86
    :goto_1
    iget-object v2, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->started:Ljava/util/Date;

    .line 87
    .local v2, "val4":Ljava/util/Date;
    if-nez v2, :cond_2

    .line 88
    invoke-interface {p1, v8}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 92
    :goto_2
    iget-object v3, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->completed:Ljava/util/Date;

    .line 93
    .local v3, "val5":Ljava/util/Date;
    if-nez v3, :cond_3

    .line 94
    invoke-interface {p1, v9}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 98
    :goto_3
    iget-object v4, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->result:Ljava/lang/String;

    .line 99
    .local v4, "val6":Ljava/lang/String;
    if-nez v4, :cond_4

    .line 100
    invoke-interface {p1, v12}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindNull(I)V

    .line 104
    :goto_4
    const/4 v5, 0x7

    iget v6, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->id:I

    int-to-long v6, v6

    invoke-interface {p1, v5, v6, v7}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindLong(IJ)V

    .line 105
    return-void

    .line 78
    .end local v1    # "val3":Ljava/lang/String;
    .end local v2    # "val4":Ljava/util/Date;
    .end local v3    # "val5":Ljava/util/Date;
    .end local v4    # "val6":Ljava/lang/String;
    :cond_0
    iget-object v5, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->taskId:Ljava/lang/String;

    invoke-interface {p1, v10, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_0

    .line 84
    .restart local v1    # "val3":Ljava/lang/String;
    :cond_1
    iget-object v5, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->stepId:Ljava/lang/String;

    invoke-interface {p1, v11, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_1

    .line 90
    .restart local v2    # "val4":Ljava/util/Date;
    :cond_2
    iget-object v5, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v5, v5, v8

    invoke-interface {v5}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v5

    invoke-virtual {v5}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v5

    iget-object v6, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v6, v6, v8

    invoke-interface {v6}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v6

    invoke-interface {v5, v6, v2}, Lco/touchlab/squeaky/field/DataPersister;->javaToSqlArg(Lco/touchlab/squeaky/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v8, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_2

    .line 96
    .restart local v3    # "val5":Ljava/util/Date;
    :cond_3
    iget-object v5, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v5, v5, v9

    invoke-interface {v5}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v5

    invoke-virtual {v5}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v5

    iget-object v6, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v6, v6, v9

    invoke-interface {v6}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Lco/touchlab/squeaky/field/DataPersister;->javaToSqlArg(Lco/touchlab/squeaky/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v9, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_3

    .line 102
    .restart local v4    # "val6":Ljava/lang/String;
    :cond_4
    iget-object v5, p2, Lorg/researchstack/backbone/storage/database/StepRecord;->result:Ljava/lang/String;

    invoke-interface {p1, v12, v5}, Lco/touchlab/squeaky/db/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_4
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
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->createObject(Landroid/database/Cursor;)Lorg/researchstack/backbone/storage/database/StepRecord;

    move-result-object v0

    return-object v0
.end method

.method public createObject(Landroid/database/Cursor;)Lorg/researchstack/backbone/storage/database/StepRecord;
    .locals 1
    .param p1, "results"    # Landroid/database/Cursor;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 41
    new-instance v0, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-direct {v0}, Lorg/researchstack/backbone/storage/database/StepRecord;-><init>()V

    .line 42
    .local v0, "data":Lorg/researchstack/backbone/storage/database/StepRecord;
    return-object v0
.end method

.method public extractId(Lorg/researchstack/backbone/storage/database/StepRecord;)Ljava/lang/Integer;
    .locals 3
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/StepRecord;

    .prologue
    const/4 v1, 0x0

    .line 63
    if-nez p1, :cond_0

    .line 68
    :goto_0
    return-object v1

    .line 66
    :cond_0
    iget v2, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->id:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 67
    .local v0, "val":Ljava/lang/Integer;
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_1

    move-object v0, v1

    :cond_1
    move-object v1, v0

    .line 68
    goto :goto_0
.end method

.method public bridge synthetic extractId(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    check-cast p1, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->extractId(Lorg/researchstack/backbone/storage/database/StepRecord;)Ljava/lang/Integer;

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
    check-cast p1, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, p1, p2, p3}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fillForeignCollection(Lorg/researchstack/backbone/storage/database/StepRecord;Lco/touchlab/squeaky/dao/ModelDao;Ljava/lang/String;)V

    return-void
.end method

.method public fillForeignCollection(Lorg/researchstack/backbone/storage/database/StepRecord;Lco/touchlab/squeaky/dao/ModelDao;Ljava/lang/String;)V
    .locals 0
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/StepRecord;
    .param p3, "fieldName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/researchstack/backbone/storage/database/StepRecord;",
            "Lco/touchlab/squeaky/dao/ModelDao",
            "<",
            "Lorg/researchstack/backbone/storage/database/StepRecord;",
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
    .line 154
    .local p2, "modelDao":Lco/touchlab/squeaky/dao/ModelDao;, "Lco/touchlab/squeaky/dao/ModelDao<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
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

    check-cast v1, Lorg/researchstack/backbone/storage/database/StepRecord;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fillRow(Lorg/researchstack/backbone/storage/database/StepRecord;Landroid/database/Cursor;Lco/touchlab/squeaky/dao/ModelDao;[Lco/touchlab/squeaky/dao/Dao$ForeignRefresh;Lco/touchlab/squeaky/table/TransientCache;)V

    return-void
.end method

.method public fillRow(Lorg/researchstack/backbone/storage/database/StepRecord;Landroid/database/Cursor;Lco/touchlab/squeaky/dao/ModelDao;[Lco/touchlab/squeaky/dao/Dao$ForeignRefresh;Lco/touchlab/squeaky/table/TransientCache;)V
    .locals 4
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/StepRecord;
    .param p2, "results"    # Landroid/database/Cursor;
    .param p4, "foreignRefreshMap"    # [Lco/touchlab/squeaky/dao/Dao$ForeignRefresh;
    .param p5, "objectCache"    # Lco/touchlab/squeaky/table/TransientCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/researchstack/backbone/storage/database/StepRecord;",
            "Landroid/database/Cursor;",
            "Lco/touchlab/squeaky/dao/ModelDao",
            "<",
            "Lorg/researchstack/backbone/storage/database/StepRecord;",
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
    .local p3, "modelDao":Lco/touchlab/squeaky/dao/ModelDao;, "Lco/touchlab/squeaky/dao/ModelDao<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    const/4 v1, 0x0

    const/4 v3, 0x5

    const/4 v2, 0x4

    .line 47
    invoke-interface {p2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->id:I

    .line 48
    :cond_0
    const/4 v0, 0x1

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->taskRecordId:I

    .line 49
    const/4 v0, 0x2

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->taskId:Ljava/lang/String;

    .line 50
    const/4 v0, 0x3

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->stepId:Ljava/lang/String;

    .line 51
    invoke-interface {p2, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v0, v0, v2

    invoke-interface {v0}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v0

    invoke-virtual {v0}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v1, v1, v2

    invoke-interface {v1}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v1

    invoke-interface {v0, v1, p2, v2}, Lco/touchlab/squeaky/field/DataPersister;->resultToJava(Lco/touchlab/squeaky/field/FieldType;Landroid/database/Cursor;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->started:Ljava/util/Date;

    .line 52
    :cond_1
    invoke-interface {p2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v0, v0, v3

    invoke-interface {v0}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v0

    invoke-virtual {v0}, Lco/touchlab/squeaky/field/FieldType;->getDataPersister()Lco/touchlab/squeaky/field/DataPersister;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->fields:[Lco/touchlab/squeaky/field/FieldsEnum;

    aget-object v1, v1, v3

    invoke-interface {v1}, Lco/touchlab/squeaky/field/FieldsEnum;->getFieldType()Lco/touchlab/squeaky/field/FieldType;

    move-result-object v1

    invoke-interface {v0, v1, p2, v3}, Lco/touchlab/squeaky/field/DataPersister;->resultToJava(Lco/touchlab/squeaky/field/FieldType;Landroid/database/Cursor;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    iput-object v0, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->completed:Ljava/util/Date;

    .line 53
    :cond_2
    const/4 v0, 0x6

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lorg/researchstack/backbone/storage/database/StepRecord;->result:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public getTableConfig()Lco/touchlab/squeaky/table/TableInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/touchlab/squeaky/table/TableInfo",
            "<",
            "Lorg/researchstack/backbone/storage/database/StepRecord;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 167
    new-instance v0, Lco/touchlab/squeaky/table/TableInfo;

    const-class v1, Lorg/researchstack/backbone/storage/database/StepRecord;

    const-string v2, "steprecord"

    invoke-static {}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->getFields()[Lco/touchlab/squeaky/field/FieldsEnum;

    move-result-object v3

    invoke-static {}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->getForeignConfigs()[Lco/touchlab/squeaky/field/ForeignCollectionInfo;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lco/touchlab/squeaky/table/TableInfo;-><init>(Ljava/lang/Class;Ljava/lang/String;[Lco/touchlab/squeaky/field/FieldsEnum;[Lco/touchlab/squeaky/field/ForeignCollectionInfo;)V

    .line 168
    .local v0, "config":Lco/touchlab/squeaky/table/TableInfo;, "Lco/touchlab/squeaky/table/TableInfo<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
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
    check-cast p1, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->objectToString(Lorg/researchstack/backbone/storage/database/StepRecord;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public objectToString(Lorg/researchstack/backbone/storage/database/StepRecord;)Ljava/lang/String;
    .locals 1
    .param p1, "data"    # Lorg/researchstack/backbone/storage/database/StepRecord;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 144
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
    check-cast p1, Lorg/researchstack/backbone/storage/database/StepRecord;

    check-cast p2, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, p1, p2}, Lorg/researchstack/backbone/storage/database/StepRecord$$Configuration;->objectsEqual(Lorg/researchstack/backbone/storage/database/StepRecord;Lorg/researchstack/backbone/storage/database/StepRecord;)Z

    move-result v0

    return v0
.end method

.method public objectsEqual(Lorg/researchstack/backbone/storage/database/StepRecord;Lorg/researchstack/backbone/storage/database/StepRecord;)Z
    .locals 1
    .param p1, "d1"    # Lorg/researchstack/backbone/storage/database/StepRecord;
    .param p2, "d2"    # Lorg/researchstack/backbone/storage/database/StepRecord;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;
        }
    .end annotation

    .prologue
    .line 149
    const/4 v0, 0x0

    return v0
.end method

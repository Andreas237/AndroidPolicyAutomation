.class public Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;
.super Lco/touchlab/squeaky/db/sqlcipher/SqueakyOpenHelper;
.source "SqlCipherDatabaseHelper.java"

# interfaces
.implements Lorg/researchstack/backbone/storage/database/AppDatabase;


# static fields
.field public static final DEFAULT_NAME:Ljava/lang/String; = "appdb"

.field public static final DEFAULT_VERSION:I = 0x1


# instance fields
.field private final passphraseProvider:Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "factory"    # Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;
    .param p4, "version"    # I
    .param p5, "passphraseProvider"    # Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;

    .prologue
    .line 47
    invoke-direct/range {p0 .. p5}, Lco/touchlab/squeaky/db/sqlcipher/SqueakyOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/sqlcipher/database/SQLiteDatabase$CursorFactory;ILco/touchlab/squeaky/db/sqlcipher/PassphraseProvider;)V

    .line 48
    iput-object p5, p0, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->passphraseProvider:Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;

    .line 49
    return-void
.end method


# virtual methods
.method public getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<D::",
            "Lco/touchlab/squeaky/dao/Dao",
            "<TT;>;T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TD;"
        }
    .end annotation

    .prologue
    .line 197
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-super {p0, p1}, Lco/touchlab/squeaky/db/sqlcipher/SqueakyOpenHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v0

    return-object v0
.end method

.method public loadLatestTaskResult(Ljava/lang/String;)Lorg/researchstack/backbone/result/TaskResult;
    .locals 7
    .param p1, "taskIdentifier"    # Ljava/lang/String;

    .prologue
    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "loadTaskResults() id: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 123
    :try_start_0
    const-class v4, Lorg/researchstack/backbone/storage/database/TaskRecord;

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v4

    const-string v5, "taskId"

    invoke-interface {v4, v5, p1}, Lco/touchlab/squeaky/dao/Dao;->queryForEq(Ljava/lang/String;Ljava/lang/Object;)Lco/touchlab/squeaky/dao/Dao$QueryModifiers;

    move-result-object v4

    const-string v5, "completed DESC"

    .line 124
    invoke-interface {v4, v5}, Lco/touchlab/squeaky/dao/Dao$QueryModifiers;->orderBy(Ljava/lang/String;)Lco/touchlab/squeaky/dao/Dao$QueryModifiers;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Lco/touchlab/squeaky/dao/Dao$QueryModifiers;->limit(Ljava/lang/Integer;)Lco/touchlab/squeaky/dao/Dao$QueryModifiers;

    move-result-object v4

    invoke-interface {v4}, Lco/touchlab/squeaky/dao/Dao$QueryModifiers;->list()Ljava/util/List;

    move-result-object v3

    .line 126
    .local v3, "taskRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/TaskRecord;>;"
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 128
    const/4 v4, 0x0

    .line 134
    :goto_0
    return-object v4

    .line 131
    :cond_0
    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/storage/database/TaskRecord;

    .line 132
    .local v1, "record":Lorg/researchstack/backbone/storage/database/TaskRecord;
    const-class v4, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, v4}, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v4

    const-string v5, "taskRecordId"

    iget v6, v1, Lorg/researchstack/backbone/storage/database/TaskRecord;->id:I

    .line 133
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 132
    invoke-interface {v4, v5, v6}, Lco/touchlab/squeaky/dao/Dao;->queryForEq(Ljava/lang/String;Ljava/lang/Object;)Lco/touchlab/squeaky/dao/Dao$QueryModifiers;

    move-result-object v4

    .line 133
    invoke-interface {v4}, Lco/touchlab/squeaky/dao/Dao$QueryModifiers;->list()Ljava/util/List;

    move-result-object v2

    .line 134
    .local v2, "stepRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    invoke-static {v1, v2}, Lorg/researchstack/backbone/storage/database/TaskRecord;->toTaskResult(Lorg/researchstack/backbone/storage/database/TaskRecord;Ljava/util/List;)Lorg/researchstack/backbone/result/TaskResult;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    goto :goto_0

    .line 136
    .end local v1    # "record":Lorg/researchstack/backbone/storage/database/TaskRecord;
    .end local v2    # "stepRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    .end local v3    # "taskRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/TaskRecord;>;"
    :catch_0
    move-exception v0

    .line 138
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4
.end method

.method public loadStepResults(Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .param p1, "stepIdentifier"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/result/StepResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "loadStepResults() id: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 176
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .local v2, "results":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/result/StepResult;>;"
    const-class v5, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, v5}, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v5

    const-string v6, "stepId"

    invoke-interface {v5, v6, p1}, Lco/touchlab/squeaky/dao/Dao;->queryForEq(Ljava/lang/String;Ljava/lang/Object;)Lco/touchlab/squeaky/dao/Dao$QueryModifiers;

    move-result-object v5

    .line 178
    invoke-interface {v5}, Lco/touchlab/squeaky/dao/Dao$QueryModifiers;->list()Ljava/util/List;

    move-result-object v4

    .line 180
    .local v4, "stepRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/researchstack/backbone/storage/database/StepRecord;

    .line 182
    .local v3, "stepRecord":Lorg/researchstack/backbone/storage/database/StepRecord;
    invoke-static {v3}, Lorg/researchstack/backbone/storage/database/StepRecord;->toStepResult(Lorg/researchstack/backbone/storage/database/StepRecord;)Lorg/researchstack/backbone/result/StepResult;

    move-result-object v1

    .line 183
    .local v1, "result":Lorg/researchstack/backbone/result/StepResult;
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 188
    .end local v1    # "result":Lorg/researchstack/backbone/result/StepResult;
    .end local v2    # "results":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/result/StepResult;>;"
    .end local v3    # "stepRecord":Lorg/researchstack/backbone/storage/database/StepRecord;
    .end local v4    # "stepRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    :catch_0
    move-exception v0

    .line 190
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v5, Ljava/lang/RuntimeException;

    invoke-direct {v5, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v5

    .line 186
    .end local v0    # "e":Ljava/sql/SQLException;
    .restart local v2    # "results":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/result/StepResult;>;"
    .restart local v4    # "stepRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    :cond_0
    return-object v2
.end method

.method public loadTaskResults(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .param p1, "taskIdentifier"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/result/TaskResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "loadTaskResults() id: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 149
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .local v3, "results":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/result/TaskResult;>;"
    const-class v6, Lorg/researchstack/backbone/storage/database/TaskRecord;

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v6

    const-string v7, "taskId"

    invoke-interface {v6, v7, p1}, Lco/touchlab/squeaky/dao/Dao;->queryForEq(Ljava/lang/String;Ljava/lang/Object;)Lco/touchlab/squeaky/dao/Dao$QueryModifiers;

    move-result-object v6

    .line 151
    invoke-interface {v6}, Lco/touchlab/squeaky/dao/Dao$QueryModifiers;->list()Ljava/util/List;

    move-result-object v5

    .line 153
    .local v5, "taskRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/TaskRecord;>;"
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/researchstack/backbone/storage/database/TaskRecord;

    .line 155
    .local v1, "record":Lorg/researchstack/backbone/storage/database/TaskRecord;
    const-class v7, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, v7}, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v7

    const-string v8, "taskRecordId"

    iget v9, v1, Lorg/researchstack/backbone/storage/database/TaskRecord;->id:I

    .line 156
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    .line 155
    invoke-interface {v7, v8, v9}, Lco/touchlab/squeaky/dao/Dao;->queryForEq(Ljava/lang/String;Ljava/lang/Object;)Lco/touchlab/squeaky/dao/Dao$QueryModifiers;

    move-result-object v7

    .line 156
    invoke-interface {v7}, Lco/touchlab/squeaky/dao/Dao$QueryModifiers;->list()Ljava/util/List;

    move-result-object v4

    .line 157
    .local v4, "stepRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    invoke-static {v1, v4}, Lorg/researchstack/backbone/storage/database/TaskRecord;->toTaskResult(Lorg/researchstack/backbone/storage/database/TaskRecord;Ljava/util/List;)Lorg/researchstack/backbone/result/TaskResult;

    move-result-object v2

    .line 158
    .local v2, "result":Lorg/researchstack/backbone/result/TaskResult;
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 163
    .end local v1    # "record":Lorg/researchstack/backbone/storage/database/TaskRecord;
    .end local v2    # "result":Lorg/researchstack/backbone/result/TaskResult;
    .end local v3    # "results":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/result/TaskResult;>;"
    .end local v4    # "stepRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    .end local v5    # "taskRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/TaskRecord;>;"
    :catch_0
    move-exception v0

    .line 165
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 161
    .end local v0    # "e":Ljava/sql/SQLException;
    .restart local v3    # "results":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/result/TaskResult;>;"
    .restart local v5    # "taskRecords":Ljava/util/List;, "Ljava/util/List<Lorg/researchstack/backbone/storage/database/TaskRecord;>;"
    :cond_0
    return-object v3
.end method

.method public onCreate(Lnet/sqlcipher/database/SQLiteDatabase;)V
    .locals 5
    .param p1, "sqLiteDatabase"    # Lnet/sqlcipher/database/SQLiteDatabase;

    .prologue
    .line 56
    :try_start_0
    new-instance v1, Lco/touchlab/squeaky/db/sqlcipher/SQLiteDatabaseImpl;

    invoke-direct {v1, p1}, Lco/touchlab/squeaky/db/sqlcipher/SQLiteDatabaseImpl;-><init>(Lnet/sqlcipher/database/SQLiteDatabase;)V

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Lorg/researchstack/backbone/storage/database/TaskRecord;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, Lorg/researchstack/backbone/storage/database/StepRecord;

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lco/touchlab/squeaky/table/TableUtils;->createTables(Lco/touchlab/squeaky/db/SQLiteDatabase;[Ljava/lang/Class;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    return-void

    .line 60
    :catch_0
    move-exception v0

    .line 62
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public onUpgrade(Lnet/sqlcipher/database/SQLiteDatabase;II)V
    .locals 0
    .param p1, "sqLiteDatabase"    # Lnet/sqlcipher/database/SQLiteDatabase;
    .param p2, "i"    # I
    .param p3, "i1"    # I

    .prologue
    .line 70
    return-void
.end method

.method public saveTaskResult(Lorg/researchstack/backbone/result/TaskResult;)V
    .locals 9
    .param p1, "taskResult"    # Lorg/researchstack/backbone/result/TaskResult;

    .prologue
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "saveTaskResult() id: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {p1}, Lorg/researchstack/backbone/result/TaskResult;->getIdentifier()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lorg/researchstack/backbone/utils/LogExt;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 83
    :try_start_0
    new-instance v5, Lorg/researchstack/backbone/storage/database/TaskRecord;

    invoke-direct {v5}, Lorg/researchstack/backbone/storage/database/TaskRecord;-><init>()V

    .line 84
    .local v5, "taskRecord":Lorg/researchstack/backbone/storage/database/TaskRecord;
    invoke-virtual {p1}, Lorg/researchstack/backbone/result/TaskResult;->getIdentifier()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lorg/researchstack/backbone/storage/database/TaskRecord;->taskId:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Lorg/researchstack/backbone/result/TaskResult;->getStartDate()Ljava/util/Date;

    move-result-object v6

    iput-object v6, v5, Lorg/researchstack/backbone/storage/database/TaskRecord;->started:Ljava/util/Date;

    .line 86
    invoke-virtual {p1}, Lorg/researchstack/backbone/result/TaskResult;->getEndDate()Ljava/util/Date;

    move-result-object v6

    iput-object v6, v5, Lorg/researchstack/backbone/storage/database/TaskRecord;->completed:Ljava/util/Date;

    .line 87
    const-class v6, Lorg/researchstack/backbone/storage/database/TaskRecord;

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v6

    invoke-interface {v6, v5}, Lco/touchlab/squeaky/dao/Dao;->create(Ljava/lang/Object;)V

    .line 89
    new-instance v6, Lcom/google/gson/GsonBuilder;

    invoke-direct {v6}, Lcom/google/gson/GsonBuilder;-><init>()V

    const-string v7, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    invoke-virtual {v6, v7}, Lcom/google/gson/GsonBuilder;->setDateFormat(Ljava/lang/String;)Lcom/google/gson/GsonBuilder;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v1

    .line 90
    .local v1, "gson":Lcom/google/gson/Gson;
    const-class v6, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-virtual {p0, v6}, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->getDao(Ljava/lang/Class;)Lco/touchlab/squeaky/dao/Dao;

    move-result-object v4

    .line 92
    .local v4, "stepResultDao":Lco/touchlab/squeaky/dao/Dao;, "Lco/touchlab/squeaky/dao/Dao<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    invoke-virtual {p1}, Lorg/researchstack/backbone/result/TaskResult;->getResults()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/researchstack/backbone/result/StepResult;

    .line 94
    .local v3, "stepResult":Lorg/researchstack/backbone/result/StepResult;
    if-eqz v3, :cond_0

    .line 96
    new-instance v2, Lorg/researchstack/backbone/storage/database/StepRecord;

    invoke-direct {v2}, Lorg/researchstack/backbone/storage/database/StepRecord;-><init>()V

    .line 97
    .local v2, "stepRecord":Lorg/researchstack/backbone/storage/database/StepRecord;
    iget v7, v5, Lorg/researchstack/backbone/storage/database/TaskRecord;->id:I

    iput v7, v2, Lorg/researchstack/backbone/storage/database/StepRecord;->taskRecordId:I

    .line 98
    invoke-virtual {p1}, Lorg/researchstack/backbone/result/TaskResult;->getIdentifier()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v2, Lorg/researchstack/backbone/storage/database/StepRecord;->taskId:Ljava/lang/String;

    .line 99
    invoke-virtual {v3}, Lorg/researchstack/backbone/result/StepResult;->getIdentifier()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v2, Lorg/researchstack/backbone/storage/database/StepRecord;->stepId:Ljava/lang/String;

    .line 100
    invoke-virtual {v3}, Lorg/researchstack/backbone/result/StepResult;->getEndDate()Ljava/util/Date;

    move-result-object v7

    iput-object v7, v2, Lorg/researchstack/backbone/storage/database/StepRecord;->completed:Ljava/util/Date;

    .line 101
    invoke-virtual {v3}, Lorg/researchstack/backbone/result/StepResult;->getResults()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    .line 103
    invoke-virtual {v3}, Lorg/researchstack/backbone/result/StepResult;->getResults()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v2, Lorg/researchstack/backbone/storage/database/StepRecord;->result:Ljava/lang/String;

    .line 106
    :cond_1
    invoke-interface {v4, v2}, Lco/touchlab/squeaky/dao/Dao;->createOrUpdate(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 110
    .end local v1    # "gson":Lcom/google/gson/Gson;
    .end local v2    # "stepRecord":Lorg/researchstack/backbone/storage/database/StepRecord;
    .end local v3    # "stepResult":Lorg/researchstack/backbone/result/StepResult;
    .end local v4    # "stepResultDao":Lco/touchlab/squeaky/dao/Dao;, "Lco/touchlab/squeaky/dao/Dao<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    .end local v5    # "taskRecord":Lorg/researchstack/backbone/storage/database/TaskRecord;
    :catch_0
    move-exception v0

    .line 112
    .local v0, "e":Ljava/sql/SQLException;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 114
    .end local v0    # "e":Ljava/sql/SQLException;
    .restart local v1    # "gson":Lcom/google/gson/Gson;
    .restart local v4    # "stepResultDao":Lco/touchlab/squeaky/dao/Dao;, "Lco/touchlab/squeaky/dao/Dao<Lorg/researchstack/backbone/storage/database/StepRecord;>;"
    .restart local v5    # "taskRecord":Lorg/researchstack/backbone/storage/database/TaskRecord;
    :cond_2
    return-void
.end method

.method public setEncryptionKey(Ljava/lang/String;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 203
    iget-object v0, p0, Lorg/researchstack/backbone/storage/database/sqlite/SqlCipherDatabaseHelper;->passphraseProvider:Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;

    invoke-virtual {v0, p1}, Lorg/researchstack/backbone/storage/database/sqlite/UpdatablePassphraseProvider;->setPassphrase(Ljava/lang/String;)V

    .line 204
    return-void
.end method

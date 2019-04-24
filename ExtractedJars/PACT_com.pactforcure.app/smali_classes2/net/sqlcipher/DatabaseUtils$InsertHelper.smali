.class public Lnet/sqlcipher/DatabaseUtils$InsertHelper;
.super Ljava/lang/Object;
.source "DatabaseUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/sqlcipher/DatabaseUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InsertHelper"
.end annotation


# static fields
.field public static final TABLE_INFO_PRAGMA_COLUMNNAME_INDEX:I = 0x1

.field public static final TABLE_INFO_PRAGMA_DEFAULT_INDEX:I = 0x4


# instance fields
.field private mColumns:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mDb:Lnet/sqlcipher/database/SQLiteDatabase;

.field private mInsertSQL:Ljava/lang/String;

.field private mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

.field private mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

.field private mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

.field private final mTableName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnet/sqlcipher/database/SQLiteDatabase;Ljava/lang/String;)V
    .locals 1
    .param p1, "db"    # Lnet/sqlcipher/database/SQLiteDatabase;
    .param p2, "tableName"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x0

    .line 838
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 820
    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    .line 821
    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 822
    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 823
    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 839
    iput-object p1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mDb:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 840
    iput-object p2, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    .line 841
    return-void
.end method

.method private buildSQL()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .prologue
    const/16 v7, 0x80

    .line 844
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 845
    .local v4, "sb":Ljava/lang/StringBuilder;
    const-string v6, "INSERT INTO "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    iget-object v6, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    const-string v6, " ("

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 849
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 850
    .local v5, "sbv":Ljava/lang/StringBuilder;
    const-string v6, "VALUES ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    const/4 v3, 0x1

    .line 853
    .local v3, "i":I
    const/4 v1, 0x0

    .line 855
    .local v1, "cur":Lnet/sqlcipher/Cursor;
    :try_start_0
    iget-object v6, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mDb:Lnet/sqlcipher/database/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "PRAGMA table_info("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ")"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v1

    .line 856
    new-instance v6, Ljava/util/HashMap;

    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/HashMap;-><init>(I)V

    iput-object v6, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mColumns:Ljava/util/HashMap;

    .line 857
    :goto_0
    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 858
    const/4 v6, 0x1

    invoke-interface {v1, v6}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 859
    .local v0, "columnName":Ljava/lang/String;
    const/4 v6, 0x4

    invoke-interface {v1, v6}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 861
    .local v2, "defaultValue":Ljava/lang/String;
    iget-object v6, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mColumns:Ljava/util/HashMap;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v0, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    const-string v6, "\'"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 863
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    const-string v6, "\'"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 866
    if-nez v2, :cond_0

    .line 867
    const-string v6, "?"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 874
    :goto_1
    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v6

    if-ne v3, v6, :cond_2

    const-string v6, ") "

    :goto_2
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 875
    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v6

    if-ne v3, v6, :cond_3

    const-string v6, ");"

    :goto_3
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 876
    add-int/lit8 v3, v3, 0x1

    .line 877
    goto :goto_0

    .line 869
    :cond_0
    const-string v6, "COALESCE(?, "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 870
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 871
    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 879
    .end local v0    # "columnName":Ljava/lang/String;
    .end local v2    # "defaultValue":Ljava/lang/String;
    :catchall_0
    move-exception v6

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->close()V

    :cond_1
    throw v6

    .line 874
    .restart local v0    # "columnName":Ljava/lang/String;
    .restart local v2    # "defaultValue":Ljava/lang/String;
    :cond_2
    :try_start_1
    const-string v6, ", "

    goto :goto_2

    .line 875
    :cond_3
    const-string v6, ", "
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 879
    .end local v0    # "columnName":Ljava/lang/String;
    .end local v2    # "defaultValue":Ljava/lang/String;
    :cond_4
    if-eqz v1, :cond_5

    invoke-interface {v1}, Lnet/sqlcipher/Cursor;->close()V

    .line 882
    :cond_5
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 884
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    .line 886
    return-void
.end method

.method private getStatement(Z)Lnet/sqlcipher/database/SQLiteStatement;
    .locals 4
    .param p1, "allowReplace"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .prologue
    .line 889
    if-eqz p1, :cond_2

    .line 890
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-nez v1, :cond_1

    .line 891
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    if-nez v1, :cond_0

    invoke-direct {p0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->buildSQL()V

    .line 893
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "INSERT OR REPLACE"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    const/4 v3, 0x6

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 894
    .local v0, "replaceSQL":Ljava/lang/String;
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mDb:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v1, v0}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v1

    iput-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 896
    .end local v0    # "replaceSQL":Ljava/lang/String;
    :cond_1
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 902
    :goto_0
    return-object v1

    .line 898
    :cond_2
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-nez v1, :cond_4

    .line 899
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    if-nez v1, :cond_3

    invoke-direct {p0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->buildSQL()V

    .line 900
    :cond_3
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mDb:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v2, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v1

    iput-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 902
    :cond_4
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    goto :goto_0
.end method

.method private declared-synchronized insertInternal(Landroid/content/ContentValues;Z)J
    .locals 9
    .param p1, "values"    # Landroid/content/ContentValues;
    .param p2, "allowReplace"    # Z

    .prologue
    .line 920
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p2}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->getStatement(Z)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v5

    .line 921
    .local v5, "stmt":Lnet/sqlcipher/database/SQLiteStatement;
    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteStatement;->clearBindings()V

    .line 923
    invoke-virtual {p1}, Landroid/content/ContentValues;->valueSet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .local v3, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 924
    .local v1, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 925
    .local v4, "key":Ljava/lang/String;
    invoke-virtual {p0, v4}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 926
    .local v2, "i":I
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v2, v6}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V
    :try_end_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 933
    .end local v1    # "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v2    # "i":I
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v4    # "key":Ljava/lang/String;
    .end local v5    # "stmt":Lnet/sqlcipher/database/SQLiteStatement;
    :catch_0
    move-exception v0

    .line 934
    .local v0, "e":Lnet/sqlcipher/SQLException;
    :try_start_1
    const-string v6, "DatabaseUtils"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error inserting "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " into table  "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 935
    const-wide/16 v6, -0x1

    .end local v0    # "e":Lnet/sqlcipher/SQLException;
    :goto_1
    monitor-exit p0

    return-wide v6

    .line 932
    .restart local v3    # "i$":Ljava/util/Iterator;
    .restart local v5    # "stmt":Lnet/sqlcipher/database/SQLiteStatement;
    :cond_0
    :try_start_2
    invoke-virtual {v5}, Lnet/sqlcipher/database/SQLiteStatement;->executeInsert()J
    :try_end_2
    .catch Lnet/sqlcipher/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-wide v6

    goto :goto_1

    .line 920
    .end local v3    # "i$":Ljava/util/Iterator;
    .end local v5    # "stmt":Lnet/sqlcipher/database/SQLiteStatement;
    :catchall_0
    move-exception v6

    monitor-exit p0

    throw v6
.end method


# virtual methods
.method public bind(ID)V
    .locals 2
    .param p1, "index"    # I
    .param p2, "value"    # D

    .prologue
    .line 961
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteStatement;->bindDouble(ID)V

    .line 962
    return-void
.end method

.method public bind(IF)V
    .locals 4
    .param p1, "index"    # I
    .param p2, "value"    # F

    .prologue
    .line 971
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    float-to-double v2, p2

    invoke-virtual {v0, p1, v2, v3}, Lnet/sqlcipher/database/SQLiteStatement;->bindDouble(ID)V

    .line 972
    return-void
.end method

.method public bind(II)V
    .locals 4
    .param p1, "index"    # I
    .param p2, "value"    # I

    .prologue
    .line 991
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    int-to-long v2, p2

    invoke-virtual {v0, p1, v2, v3}, Lnet/sqlcipher/database/SQLiteStatement;->bindLong(IJ)V

    .line 992
    return-void
.end method

.method public bind(IJ)V
    .locals 2
    .param p1, "index"    # I
    .param p2, "value"    # J

    .prologue
    .line 981
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteStatement;->bindLong(IJ)V

    .line 982
    return-void
.end method

.method public bind(ILjava/lang/String;)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 1034
    if-nez p2, :cond_0

    .line 1035
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1}, Lnet/sqlcipher/database/SQLiteStatement;->bindNull(I)V

    .line 1039
    :goto_0
    return-void

    .line 1037
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1, p2}, Lnet/sqlcipher/database/SQLiteStatement;->bindString(ILjava/lang/String;)V

    goto :goto_0
.end method

.method public bind(IZ)V
    .locals 3
    .param p1, "index"    # I
    .param p2, "value"    # Z

    .prologue
    .line 1001
    iget-object v2, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-eqz p2, :cond_0

    const-wide/16 v0, 0x1

    :goto_0
    invoke-virtual {v2, p1, v0, v1}, Lnet/sqlcipher/database/SQLiteStatement;->bindLong(IJ)V

    .line 1002
    return-void

    .line 1001
    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public bind(I[B)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "value"    # [B

    .prologue
    .line 1020
    if-nez p2, :cond_0

    .line 1021
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1}, Lnet/sqlcipher/database/SQLiteStatement;->bindNull(I)V

    .line 1025
    :goto_0
    return-void

    .line 1023
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1, p2}, Lnet/sqlcipher/database/SQLiteStatement;->bindBlob(I[B)V

    goto :goto_0
.end method

.method public bindNull(I)V
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 1010
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1}, Lnet/sqlcipher/database/SQLiteStatement;->bindNull(I)V

    .line 1011
    return-void
.end method

.method public close()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1136
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-eqz v0, :cond_0

    .line 1137
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1138
    iput-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 1140
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-eqz v0, :cond_1

    .line 1141
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1142
    iput-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 1144
    :cond_1
    iput-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    .line 1145
    iput-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mColumns:Ljava/util/HashMap;

    .line 1146
    return-void
.end method

.method public execute()J
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1067
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-nez v1, :cond_0

    .line 1068
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "you must prepare this inserter before calling execute"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1073
    :cond_0
    :try_start_0
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v1}, Lnet/sqlcipher/database/SQLiteStatement;->executeInsert()J
    :try_end_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v2

    .line 1079
    iput-object v4, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    :goto_0
    return-wide v2

    .line 1074
    :catch_0
    move-exception v0

    .line 1075
    .local v0, "e":Lnet/sqlcipher/SQLException;
    :try_start_1
    const-string v1, "DatabaseUtils"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error executing InsertHelper with table "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1076
    const-wide/16 v2, -0x1

    .line 1079
    iput-object v4, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    goto :goto_0

    .end local v0    # "e":Lnet/sqlcipher/SQLException;
    :catchall_0
    move-exception v1

    iput-object v4, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    throw v1
.end method

.method public getColumnIndex(Ljava/lang/String;)I
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .prologue
    .line 946
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->getStatement(Z)Lnet/sqlcipher/database/SQLiteStatement;

    .line 947
    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mColumns:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 948
    .local v0, "index":Ljava/lang/Integer;
    if-nez v0, :cond_0

    .line 949
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "column \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' is invalid"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 951
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    return v1
.end method

.method public insert(Landroid/content/ContentValues;)J
    .locals 2
    .param p1, "values"    # Landroid/content/ContentValues;

    .prologue
    .line 1053
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->insertInternal(Landroid/content/ContentValues;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public prepareForInsert()V
    .locals 1

    .prologue
    .line 1095
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->getStatement(Z)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 1096
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->clearBindings()V

    .line 1097
    return-void
.end method

.method public prepareForReplace()V
    .locals 1

    .prologue
    .line 1111
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->getStatement(Z)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 1112
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->clearBindings()V

    .line 1113
    return-void
.end method

.method public replace(Landroid/content/ContentValues;)J
    .locals 2
    .param p1, "values"    # Landroid/content/ContentValues;

    .prologue
    .line 1127
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->insertInternal(Landroid/content/ContentValues;Z)J

    move-result-wide v0

    return-wide v0
.end method

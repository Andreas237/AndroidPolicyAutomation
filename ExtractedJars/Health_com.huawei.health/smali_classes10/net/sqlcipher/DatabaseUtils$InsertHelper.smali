.class public Lnet/sqlcipher/DatabaseUtils$InsertHelper;
.super Ljava/lang/Object;
.source "SourceFile"


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
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;"
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

    .line 838
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 820
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    .line 821
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 822
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 823
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 839
    iput-object p1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mDb:Lnet/sqlcipher/database/SQLiteDatabase;

    .line 840
    iput-object p2, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    .line 841
    return-void
.end method

.method private buildSQL()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 844
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 845
    const-string v0, "INSERT INTO "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    const-string v0, " ("

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 849
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 850
    const-string v0, "VALUES ("

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 852
    const/4 v5, 0x1

    .line 853
    const/4 v6, 0x0

    .line 855
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mDb:Lnet/sqlcipher/database/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PRAGMA table_info("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lnet/sqlcipher/database/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Lnet/sqlcipher/Cursor;

    move-result-object v0

    move-object v6, v0

    .line 856
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mColumns:Ljava/util/HashMap;

    .line 857
    :goto_0
    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 858
    const/4 v0, 0x1

    invoke-interface {v6, v0}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 859
    const/4 v0, 0x4

    invoke-interface {v6, v0}, Lnet/sqlcipher/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 861
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mColumns:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    const-string v0, "\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 863
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 864
    const-string v0, "\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 866
    if-nez v8, :cond_0

    .line 867
    const-string v0, "?"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 869
    :cond_0
    const-string v0, "COALESCE(?, "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 870
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 871
    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 874
    :goto_1
    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v0

    if-ne v5, v0, :cond_1

    const-string v0, ") "

    goto :goto_2

    :cond_1
    const-string v0, ", "

    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 875
    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->getCount()I

    move-result v0

    if-ne v5, v0, :cond_2

    const-string v0, ");"

    goto :goto_3

    :cond_2
    const-string v0, ", "

    :goto_3
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 876
    add-int/lit8 v5, v5, 0x1

    .line 877
    goto/16 :goto_0

    .line 879
    :cond_3
    if-eqz v6, :cond_5

    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->close()V

    goto :goto_4

    :catchall_0
    move-exception v9

    if-eqz v6, :cond_4

    invoke-interface {v6}, Lnet/sqlcipher/Cursor;->close()V

    :cond_4
    throw v9

    .line 882
    :cond_5
    :goto_4
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 884
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    .line 886
    return-void
.end method

.method private getStatement(Z)Lnet/sqlcipher/database/SQLiteStatement;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sqlcipher/SQLException;
        }
    .end annotation

    .line 889
    if-eqz p1, :cond_2

    .line 890
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-nez v0, :cond_1

    .line 891
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->buildSQL()V

    .line 893
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "INSERT OR REPLACE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 894
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mDb:Lnet/sqlcipher/database/SQLiteDatabase;

    invoke-virtual {v0, v3}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 896
    :cond_1
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    return-object v0

    .line 898
    :cond_2
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-nez v0, :cond_4

    .line 899
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    if-nez v0, :cond_3

    invoke-direct {p0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->buildSQL()V

    .line 900
    :cond_3
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mDb:Lnet/sqlcipher/database/SQLiteDatabase;

    iget-object v1, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lnet/sqlcipher/database/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 902
    :cond_4
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    return-object v0
.end method

.method private declared-synchronized insertInternal(Landroid/content/ContentValues;Z)J
    .locals 8

    monitor-enter p0

    .line 920
    :try_start_0
    invoke-direct {p0, p2}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->getStatement(Z)Lnet/sqlcipher/database/SQLiteStatement;

    move-result-object v3

    .line 921
    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteStatement;->clearBindings()V

    .line 923
    invoke-virtual {p1}, Landroid/content/ContentValues;->valueSet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map$Entry;

    .line 924
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 925
    invoke-virtual {p0, v6}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    .line 926
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v7, v0}, Lnet/sqlcipher/DatabaseUtils;->bindObjectToProgram(Lnet/sqlcipher/database/SQLiteProgram;ILjava/lang/Object;)V

    .line 931
    goto :goto_0

    .line 932
    :cond_0
    invoke-virtual {v3}, Lnet/sqlcipher/database/SQLiteStatement;->executeInsert()J
    :try_end_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    .line 933
    :catch_0
    move-exception v3

    .line 934
    const-string v0, "DatabaseUtils"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error inserting "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " into table  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 935
    monitor-exit p0

    const-wide/16 v0, -0x1

    return-wide v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public bind(ID)V
    .locals 1

    .line 961
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteStatement;->bindDouble(ID)V

    .line 962
    return-void
.end method

.method public bind(IF)V
    .locals 3

    .line 971
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    float-to-double v1, p2

    invoke-virtual {v0, p1, v1, v2}, Lnet/sqlcipher/database/SQLiteStatement;->bindDouble(ID)V

    .line 972
    return-void
.end method

.method public bind(II)V
    .locals 3

    .line 991
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    int-to-long v1, p2

    invoke-virtual {v0, p1, v1, v2}, Lnet/sqlcipher/database/SQLiteStatement;->bindLong(IJ)V

    .line 992
    return-void
.end method

.method public bind(IJ)V
    .locals 1

    .line 981
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteStatement;->bindLong(IJ)V

    .line 982
    return-void
.end method

.method public bind(ILjava/lang/String;)V
    .locals 1

    .line 1034
    if-nez p2, :cond_0

    .line 1035
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1}, Lnet/sqlcipher/database/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 1037
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1, p2}, Lnet/sqlcipher/database/SQLiteStatement;->bindString(ILjava/lang/String;)V

    .line 1039
    :goto_0
    return-void
.end method

.method public bind(IZ)V
    .locals 3

    .line 1001
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-eqz p2, :cond_0

    const-wide/16 v1, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    invoke-virtual {v0, p1, v1, v2}, Lnet/sqlcipher/database/SQLiteStatement;->bindLong(IJ)V

    .line 1002
    return-void
.end method

.method public bind(I[B)V
    .locals 1

    .line 1020
    if-nez p2, :cond_0

    .line 1021
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1}, Lnet/sqlcipher/database/SQLiteStatement;->bindNull(I)V

    goto :goto_0

    .line 1023
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1, p2}, Lnet/sqlcipher/database/SQLiteStatement;->bindBlob(I[B)V

    .line 1025
    :goto_0
    return-void
.end method

.method public bindNull(I)V
    .locals 1

    .line 1010
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0, p1}, Lnet/sqlcipher/database/SQLiteStatement;->bindNull(I)V

    .line 1011
    return-void
.end method

.method public close()V
    .locals 1

    .line 1136
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-eqz v0, :cond_0

    .line 1137
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1138
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 1140
    :cond_0
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-eqz v0, :cond_1

    .line 1141
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->close()V

    .line 1142
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mReplaceStatement:Lnet/sqlcipher/database/SQLiteStatement;

    .line 1144
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mInsertSQL:Ljava/lang/String;

    .line 1145
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mColumns:Ljava/util/HashMap;

    .line 1146
    return-void
.end method

.method public execute()J
    .locals 7

    .line 1067
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    if-nez v0, :cond_0

    .line 1068
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "you must prepare this inserter before calling execute"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1073
    :cond_0
    :try_start_0
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    invoke-virtual {v0}, Lnet/sqlcipher/database/SQLiteStatement;->executeInsert()J
    :try_end_0
    .catch Lnet/sqlcipher/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v3

    .line 1079
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    return-wide v3

    .line 1074
    :catch_0
    move-exception v3

    .line 1075
    const-string v0, "DatabaseUtils"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error executing InsertHelper with table "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mTableName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1076
    const-wide/16 v4, -0x1

    .line 1079
    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    return-wide v4

    :catchall_0
    move-exception v6

    const/4 v0, 0x0

    iput-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mPreparedStatement:Lnet/sqlcipher/database/SQLiteStatement;

    throw v6
.end method

.method public getColumnIndex(Ljava/lang/String;)I
    .locals 4

    .line 946
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->getStatement(Z)Lnet/sqlcipher/database/SQLiteStatement;

    .line 947
    iget-object v0, p0, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->mColumns:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    .line 948
    if-nez v3, :cond_0

    .line 949
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "column \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' is invalid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 951
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public insert(Landroid/content/ContentValues;)J
    .locals 2

    .line 1053
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->insertInternal(Landroid/content/ContentValues;Z)J

    move-result-wide v0

    return-wide v0
.end method

.method public prepareForInsert()V
    .locals 1

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

    .line 1127
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lnet/sqlcipher/DatabaseUtils$InsertHelper;->insertInternal(Landroid/content/ContentValues;Z)J

    move-result-wide v0

    return-wide v0
.end method

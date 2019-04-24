.class public Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field private static final MAX_TABLES_COUNT:I = 0xa

.field private static final TABLE_NAMES:[Ljava/lang/String;

.field private static final URI_MATCH_TABLE_CARDORDERINFO:I = 0x3

.field private static final URI_MATCH_TABLE_CARDORDERINFO_ID:I = 0xd

.field private static final URI_MATCH_TABLE_CARDPRODUCTINFO:I = 0x0

.field private static final URI_MATCH_TABLE_CARDPRODUCTINFO_ID:I = 0xa

.field private static final URI_MATCH_TABLE_ISSUERINFO:I = 0x1

.field private static final URI_MATCH_TABLE_ISSUERINFO_ID:I = 0xb

.field private static final URI_MATCH_TABLE_REPORTCARDINFO:I = 0x2

.field private static final URI_MATCH_TABLE_REPORTCARDINFO_ID:I = 0xc

.field private static final URI_MATCH_TABLE_RFCONFINFO:I = 0x4

.field private static final URI_MATCH_TABLE_RFCONFINFO_ID:I = 0xe

.field private static final mUriMatcher:Landroid/content/UriMatcher;


# instance fields
.field private mDBHelper:Landroid/database/sqlite/SQLiteOpenHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 45
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "card_product_info"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "issuer_info"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "report_status_info"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "card_order_info"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "rf_conf_info"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    .line 69
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    .line 71
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    sget-object v2, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 72
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 75
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    sget-object v2, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 76
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xb

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 79
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    sget-object v2, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 80
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v4, 0x2

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 83
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    sget-object v2, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 84
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v4, 0x3

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xd

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 87
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    sget-object v2, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    const/4 v3, 0x4

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 88
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    const/4 v4, 0x4

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xe

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 91
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public applyBatch(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/content/ContentProviderOperation;>;)[Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/OperationApplicationException;
        }
    .end annotation

    .line 241
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mDBHelper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 242
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 245
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 246
    new-array v3, v2, [Landroid/content/ContentProviderResult;

    .line 247
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 249
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ContentProviderOperation;

    invoke-virtual {v0, p0, v3, v4}, Landroid/content/ContentProviderOperation;->apply(Landroid/content/ContentProvider;[Landroid/content/ContentProviderResult;I)Landroid/content/ContentProviderResult;

    move-result-object v0

    aput-object v0, v3, v4

    .line 247
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 251
    :cond_0
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 252
    move-object v4, v3

    .line 256
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 252
    return-object v4

    .line 256
    :catchall_0
    move-exception v5

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 257
    throw v5
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 7

    .line 96
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v2

    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v0, -0x1

    if-ne v0, v2, :cond_0

    .line 100
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown URL"

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 105
    throw v3

    .line 107
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mDBHelper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    .line 108
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    .line 109
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    rem-int/lit8 v1, v2, 0xa

    aget-object v0, v0, v1

    invoke-virtual {v4, v0, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 111
    const/4 v0, 0x0

    invoke-virtual {v5, p1, v0}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    .line 113
    return v6
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 120
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 8

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mDBHelper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 127
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v3

    .line 128
    const/4 v4, 0x0

    .line 129
    const/4 v0, -0x1

    if-ne v0, v3, :cond_0

    .line 131
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown URL"

    invoke-direct {v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 135
    throw v4

    .line 137
    :cond_1
    const/4 v5, 0x0

    .line 138
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    rem-int/lit8 v1, v3, 0xa

    aget-object v0, v0, v1

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v6

    .line 139
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_2

    .line 141
    invoke-static {p1, v6, v7}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v5

    .line 143
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 145
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    .line 147
    :cond_3
    return-object v5
.end method

.method public onCreate()Z
    .locals 2

    .line 153
    new-instance v0, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/storage/db/NFCDBHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mDBHelper:Landroid/database/sqlite/SQLiteOpenHelper;

    .line 154
    const/4 v0, 0x0

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 16

    .line 160
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v9

    .line 161
    const/4 v10, 0x0

    .line 162
    const/4 v11, 0x0

    .line 163
    const/4 v0, -0x1

    if-ne v0, v9, :cond_0

    .line 165
    new-instance v10, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown URL"

    invoke-direct {v10, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    .line 169
    throw v10

    .line 172
    :cond_1
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    rem-int/lit8 v1, v9, 0xa

    aget-object v12, v0, v1

    .line 174
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mDBHelper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v13

    .line 175
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    const/16 v0, 0xa

    if-lt v9, v0, :cond_2

    .line 178
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 179
    const-string v0, "_id = "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    :cond_2
    if-eqz p3, :cond_4

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 184
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 186
    const-string v0, " AND "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    :cond_3
    const/16 v0, 0x28

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 190
    move-object/from16 v0, p3

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    const/16 v0, 0x29

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 193
    :cond_4
    move-object v0, v13

    move-object v1, v12

    move-object/from16 v2, p2

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p4

    move-object/from16 v7, p5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 194
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v11, v0, v1}, Landroid/database/Cursor;->setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 195
    return-object v11
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 7

    .line 201
    iget-object v0, p0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mDBHelper:Landroid/database/sqlite/SQLiteOpenHelper;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    .line 202
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->mUriMatcher:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v3

    .line 203
    const/4 v4, 0x0

    .line 204
    const/4 v0, -0x1

    if-ne v0, v3, :cond_0

    .line 206
    new-instance v4, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown URL"

    invoke-direct {v4, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 208
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 210
    throw v4

    .line 212
    :cond_1
    const/16 v0, 0xa

    if-lt v3, v0, :cond_3

    .line 214
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 217
    const-string v0, "( "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    const-string v0, " ) AND "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    :cond_2
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 222
    const-string v0, "_id = "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 226
    :cond_3
    sget-object v0, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->TABLE_NAMES:[Ljava/lang/String;

    rem-int/lit8 v1, v3, 0xa

    aget-object v0, v0, v1

    invoke-virtual {v2, v0, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 228
    if-lez v5, :cond_4

    .line 230
    const-string v0, "cr.notifyChange"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 231
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/storage/db/NFCContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    .line 232
    const/4 v0, 0x0

    invoke-virtual {v6, p1, v0}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    .line 234
    :cond_4
    return v5
.end method

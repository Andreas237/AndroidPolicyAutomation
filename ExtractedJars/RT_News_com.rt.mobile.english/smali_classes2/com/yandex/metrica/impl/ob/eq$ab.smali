.class Lcom/yandex/metrica/impl/ob/eq$ab;
.super Lcom/yandex/metrica/impl/ob/eq$q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/eq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ab"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1129
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/eq$q;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1129
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/eq$ab;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 5
    .param p1    # Landroid/database/sqlite/SQLiteDatabase;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1133
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "reports"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "first_occurrence_status"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget-object v3, Lcom/yandex/metrica/impl/r;->a:Lcom/yandex/metrica/impl/r;

    iget v3, v3, Lcom/yandex/metrica/impl/r;->d:I

    .line 1137
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    .line 1133
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1139
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)"

    .line 1142
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.class Lcom/yandex/metrica/impl/ob/eq$aa;
.super Lcom/yandex/metrica/impl/ob/eq$q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/eq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "aa"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1103
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/eq$q;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 1103
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/eq$aa;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/sql/SQLException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1107
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d"

    const/4 v2, 0x3

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "reports"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "encrypting_mode"

    const/4 v6, 0x1

    aput-object v4, v3, v6

    sget-object v4, Lcom/yandex/metrica/impl/ob/mo;->a:Lcom/yandex/metrica/impl/ob/mo;

    .line 1109
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/mo;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x2

    aput-object v4, v3, v7

    .line 1107
    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1111
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 1113
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "UPDATE %s SET %s = %d where %s=%d"

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "reports"

    aput-object v4, v3, v5

    const-string v4, "encrypting_mode"

    aput-object v4, v3, v6

    sget-object v4, Lcom/yandex/metrica/impl/ob/mo;->b:Lcom/yandex/metrica/impl/ob/mo;

    .line 1116
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/mo;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    const-string v4, "type"

    aput-object v4, v3, v2

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    .line 1118
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x4

    aput-object v2, v3, v4

    .line 1113
    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1120
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE reports ADD COLUMN profile_id TEXT "

    .line 1122
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

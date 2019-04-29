.class public Lcom/yandex/metrica/impl/ob/ez;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/eq$q;

.field private final b:Lcom/yandex/metrica/impl/ob/eq$q;

.field private final c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/yandex/metrica/impl/ob/eq$q;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/yandex/metrica/impl/ob/fa;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/eq$q;Lcom/yandex/metrica/impl/ob/eq$q;Landroid/util/SparseArray;Lcom/yandex/metrica/impl/ob/fa;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/eq$q;",
            "Lcom/yandex/metrica/impl/ob/eq$q;",
            "Landroid/util/SparseArray<",
            "Lcom/yandex/metrica/impl/ob/eq$q;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/fa;",
            ")V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ez;->a:Lcom/yandex/metrica/impl/ob/eq$q;

    .line 35
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ez;->b:Lcom/yandex/metrica/impl/ob/eq$q;

    .line 36
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/ez;->c:Landroid/util/SparseArray;

    .line 37
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/ez;->d:Lcom/yandex/metrica/impl/ob/fa;

    return-void
.end method


# virtual methods
.method public a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ez;->d:Lcom/yandex/metrica/impl/ob/fa;

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ez;->d:Lcom/yandex/metrica/impl/ob/fa;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/fa;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ez;->a:Lcom/yandex/metrica/impl/ob/eq$q;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ez;->b:Lcom/yandex/metrica/impl/ob/eq$q;

    invoke-virtual {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/ob/ez;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/yandex/metrica/impl/ob/eq$q;Lcom/yandex/metrica/impl/ob/eq$q;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    return-void
.end method

.method public a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 3

    const/4 v0, 0x1

    if-le p3, p2, :cond_1

    const/4 v1, 0x0

    add-int/2addr p2, v0

    :goto_0
    if-gt p2, p3, :cond_2

    .line 80
    :try_start_0
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ez;->c:Landroid/util/SparseArray;

    invoke-virtual {v2, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/eq$q;

    if-eqz v2, :cond_0

    .line 83
    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/eq$q;->a(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :catch_0
    :cond_1
    move v1, v0

    .line 92
    :cond_2
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ez;->d:Lcom/yandex/metrica/impl/ob/fa;

    invoke-interface {p2, p1}, Lcom/yandex/metrica/impl/ob/fa;->a(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result p2

    xor-int/2addr p2, v0

    or-int/2addr p2, v1

    if-eqz p2, :cond_3

    .line 95
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/ez;->a:Lcom/yandex/metrica/impl/ob/eq$q;

    iget-object p3, p0, Lcom/yandex/metrica/impl/ob/ez;->b:Lcom/yandex/metrica/impl/ob/eq$q;

    invoke-virtual {p0, p1, p2, p3}, Lcom/yandex/metrica/impl/ob/ez;->a(Landroid/database/sqlite/SQLiteDatabase;Lcom/yandex/metrica/impl/ob/eq$q;Lcom/yandex/metrica/impl/ob/eq$q;)V

    :cond_3
    return-void
.end method

.method a(Landroid/database/sqlite/SQLiteDatabase;Lcom/yandex/metrica/impl/ob/eq$q;Lcom/yandex/metrica/impl/ob/eq$q;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 1110
    :try_start_0
    invoke-virtual {p3, p1}, Lcom/yandex/metrica/impl/ob/eq$q;->a(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :catch_0
    invoke-virtual {p0, p2, p1}, Lcom/yandex/metrica/impl/ob/ez;->a(Lcom/yandex/metrica/impl/ob/eq$q;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/eq$q;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 66
    :try_start_0
    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/eq$q;->a(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    return-void
.end method

.method public b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ez;->a:Lcom/yandex/metrica/impl/ob/eq$q;

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/ez;->a(Lcom/yandex/metrica/impl/ob/eq$q;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

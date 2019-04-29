.class public Lcom/yandex/metrica/impl/ob/ja;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I


# instance fields
.field private final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/jg$a$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    .line 24
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/yandex/metrica/impl/ob/ja;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x1
        0x2
        0x3
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 37
    sget-object v0, Lcom/yandex/metrica/impl/ob/ja;->a:[I

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/ja;-><init>([I)V

    return-void
.end method

.method constructor <init>([I)V
    .locals 5
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ja;->b:Landroid/util/SparseArray;

    const/4 v0, 0x0

    .line 34
    iput v0, p0, Lcom/yandex/metrica/impl/ob/ja;->c:I

    .line 42
    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_0

    aget v2, p1, v0

    .line 43
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ja;->b:Landroid/util/SparseArray;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v3, v2, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 62
    iget v0, p0, Lcom/yandex/metrica/impl/ob/ja;->c:I

    return v0
.end method

.method public a(ILjava/lang/String;)Lcom/yandex/metrica/impl/ob/jg$a$a;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ja;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/jg$a$a;

    return-object p1
.end method

.method a(Lcom/yandex/metrica/impl/ob/jg$a$a;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 58
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ja;->b:Landroid/util/SparseArray;

    iget v1, p1, Lcom/yandex/metrica/impl/ob/jg$a$a;->c:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    new-instance v1, Ljava/lang/String;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jg$a$a;->b:[B

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b()V
    .locals 1

    .line 66
    iget v0, p0, Lcom/yandex/metrica/impl/ob/ja;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/yandex/metrica/impl/ob/ja;->c:I

    return-void
.end method

.method public c()Lcom/yandex/metrica/impl/ob/jg$a;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 71
    new-instance v0, Lcom/yandex/metrica/impl/ob/jg$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jg$a;-><init>()V

    .line 72
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 73
    :goto_0
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ja;->b:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 74
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/ja;->b:Landroid/util/SparseArray;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/ja;->b:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/HashMap;

    .line 75
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/yandex/metrica/impl/ob/jg$a$a;

    .line 76
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Lcom/yandex/metrica/impl/ob/jg$a$a;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/yandex/metrica/impl/ob/jg$a$a;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jg$a;->b:[Lcom/yandex/metrica/impl/ob/jg$a$a;

    return-object v0
.end method

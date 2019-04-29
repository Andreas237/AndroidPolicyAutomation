.class public Lcom/yandex/metrica/impl/ob/fz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/fv<",
        "Lcom/yandex/metrica/impl/bn$a;",
        "Lcom/yandex/metrica/impl/ob/jj$a$d;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/yandex/metrica/impl/bn$a$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/impl/bn$a$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Lcom/yandex/metrica/impl/ob/fz$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fz$1;-><init>()V

    .line 26
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/fz;->a:Ljava/util/Map;

    .line 33
    new-instance v0, Lcom/yandex/metrica/impl/ob/fz$2;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fz$2;-><init>()V

    .line 34
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/fz;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a([I)Ljava/util/List;
    .locals 5
    .param p0    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I)",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bn$a$a;",
            ">;"
        }
    .end annotation

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_0

    aget v3, p0, v1

    .line 100
    sget-object v4, Lcom/yandex/metrica/impl/ob/fz;->a:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static a([Lcom/yandex/metrica/impl/ob/jj$a$d$a;)Ljava/util/List;
    .locals 6
    .param p0    # [Lcom/yandex/metrica/impl/ob/jj$a$d$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/yandex/metrica/impl/ob/jj$a$d$a;",
            ")",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, p0, v1

    .line 89
    new-instance v4, Landroid/util/Pair;

    iget-object v5, v3, Lcom/yandex/metrica/impl/ob/jj$a$d$a;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/yandex/metrica/impl/ob/jj$a$d$a;->c:Ljava/lang/String;

    invoke-direct {v4, v5, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/jj$a$d;)Lcom/yandex/metrica/impl/bn$a;
    .locals 8
    .param p1    # Lcom/yandex/metrica/impl/ob/jj$a$d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 59
    new-instance v7, Lcom/yandex/metrica/impl/bn$a;

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jj$a$d;->b:Ljava/lang/String;

    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/jj$a$d;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/yandex/metrica/impl/ob/jj$a$d;->d:Ljava/lang/String;

    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    .line 63
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/fz;->a([Lcom/yandex/metrica/impl/ob/jj$a$d$a;)Ljava/util/List;

    move-result-object v4

    iget-wide v5, p1, Lcom/yandex/metrica/impl/ob/jj$a$d;->f:J

    .line 64
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    .line 65
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/fz;->a([I)Ljava/util/List;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/yandex/metrica/impl/bn$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)V

    return-object v7
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 23
    check-cast p1, Lcom/yandex/metrica/impl/bn$a;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fz;->a(Lcom/yandex/metrica/impl/bn$a;)Lcom/yandex/metrica/impl/ob/jj$a$d;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/bn$a;)Lcom/yandex/metrica/impl/ob/jj$a$d;
    .locals 8
    .param p1    # Lcom/yandex/metrica/impl/bn$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 44
    new-instance v0, Lcom/yandex/metrica/impl/ob/jj$a$d;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/jj$a$d;-><init>()V

    .line 46
    iget-object v1, p1, Lcom/yandex/metrica/impl/bn$a;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$d;->b:Ljava/lang/String;

    .line 47
    iget-object v1, p1, Lcom/yandex/metrica/impl/bn$a;->b:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$d;->c:Ljava/lang/String;

    .line 48
    iget-object v1, p1, Lcom/yandex/metrica/impl/bn$a;->c:Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$d;->d:Ljava/lang/String;

    .line 49
    iget-object v1, p1, Lcom/yandex/metrica/impl/bn$a;->d:Ljava/util/List;

    .line 1072
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    .line 1074
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Pair;

    .line 1075
    new-instance v6, Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    invoke-direct {v6}, Lcom/yandex/metrica/impl/ob/jj$a$d$a;-><init>()V

    .line 1077
    iget-object v7, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iput-object v7, v6, Lcom/yandex/metrica/impl/ob/jj$a$d$a;->b:Ljava/lang/String;

    .line 1078
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iput-object v5, v6, Lcom/yandex/metrica/impl/ob/jj$a$d$a;->c:Ljava/lang/String;

    .line 1079
    aput-object v6, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 49
    :cond_0
    iput-object v2, v0, Lcom/yandex/metrica/impl/ob/jj$a$d;->e:[Lcom/yandex/metrica/impl/ob/jj$a$d$a;

    .line 50
    iget-object v1, p1, Lcom/yandex/metrica/impl/bn$a;->e:Ljava/lang/Long;

    if-nez v1, :cond_1

    const-wide/16 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v1, p1, Lcom/yandex/metrica/impl/bn$a;->e:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :goto_1
    iput-wide v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$d;->f:J

    .line 51
    iget-object p1, p1, Lcom/yandex/metrica/impl/bn$a;->f:Ljava/util/List;

    .line 1108
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [I

    .line 1110
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v3, v2, :cond_2

    .line 1111
    sget-object v2, Lcom/yandex/metrica/impl/ob/fz;->b:Ljava/util/Map;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 51
    :cond_2
    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jj$a$d;->g:[I

    return-object v0
.end method

.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/e;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/e;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 23
    check-cast p1, Lcom/yandex/metrica/impl/ob/jj$a$d;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fz;->a(Lcom/yandex/metrica/impl/ob/jj$a$d;)Lcom/yandex/metrica/impl/bn$a;

    move-result-object p1

    return-object p1
.end method

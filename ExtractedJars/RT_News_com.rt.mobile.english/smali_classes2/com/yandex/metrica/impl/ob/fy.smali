.class public Lcom/yandex/metrica/impl/ob/fy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/fv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/fv<",
        "Lcom/yandex/metrica/impl/ob/jk$a;",
        "Lcom/yandex/metrica/impl/ob/ji$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/yandex/metrica/impl/as$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/impl/as$a;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Lcom/yandex/metrica/impl/ob/fy$1;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fy$1;-><init>()V

    .line 24
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/fy;->a:Ljava/util/Map;

    .line 31
    new-instance v0, Lcom/yandex/metrica/impl/ob/fy$2;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fy$2;-><init>()V

    .line 32
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ob/fy;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a([Lcom/yandex/metrica/impl/ob/ji$a$a$a;)Lcom/yandex/metrica/impl/ob/me;
    .locals 5
    .param p0    # [Lcom/yandex/metrica/impl/ob/ji$a$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/yandex/metrica/impl/ob/ji$a$a$a;",
            ")",
            "Lcom/yandex/metrica/impl/ob/me<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 84
    new-instance v0, Lcom/yandex/metrica/impl/ob/me;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/me;-><init>()V

    const/4 v1, 0x0

    .line 86
    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, p0, v1

    .line 87
    iget-object v4, v3, Lcom/yandex/metrica/impl/ob/ji$a$a$a;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/yandex/metrica/impl/ob/ji$a$a$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Lcom/yandex/metrica/impl/ob/me;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Collection;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
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
            "Lcom/yandex/metrica/impl/as$a;",
            ">;"
        }
    .end annotation

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_0

    aget v3, p0, v1

    .line 150
    sget-object v4, Lcom/yandex/metrica/impl/ob/fy;->a:Ljava/util/Map;

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

.method private static b(Lcom/yandex/metrica/impl/ob/ji$a;)Ljava/util/List;
    .locals 13
    .param p0    # Lcom/yandex/metrica/impl/ob/ji$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/ji$a;",
            ")",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/jk$a$a;",
            ">;"
        }
    .end annotation

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 66
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    const/4 v1, 0x0

    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, p0, v1

    .line 67
    new-instance v12, Lcom/yandex/metrica/impl/ob/jk$a$a;

    iget-object v5, v3, Lcom/yandex/metrica/impl/ob/ji$a$a;->b:Ljava/lang/String;

    iget-object v6, v3, Lcom/yandex/metrica/impl/ob/ji$a$a;->c:Ljava/lang/String;

    iget-object v7, v3, Lcom/yandex/metrica/impl/ob/ji$a$a;->d:Ljava/lang/String;

    iget-object v4, v3, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    .line 71
    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/fy;->a([Lcom/yandex/metrica/impl/ob/ji$a$a$a;)Lcom/yandex/metrica/impl/ob/me;

    move-result-object v8

    iget-wide v9, v3, Lcom/yandex/metrica/impl/ob/ji$a$a;->f:J

    iget-object v3, v3, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    .line 73
    invoke-static {v3}, Lcom/yandex/metrica/impl/ob/fy;->a([I)Ljava/util/List;

    move-result-object v11

    move-object v4, v12

    invoke-direct/range {v4 .. v11}, Lcom/yandex/metrica/impl/ob/jk$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/me;JLjava/util/List;)V

    .line 67
    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/e;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 20
    check-cast p1, Lcom/yandex/metrica/impl/ob/jk$a;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fy;->a(Lcom/yandex/metrica/impl/ob/jk$a;)Lcom/yandex/metrica/impl/ob/ji$a;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jk$a;)Lcom/yandex/metrica/impl/ob/ji$a;
    .locals 14
    .param p1    # Lcom/yandex/metrica/impl/ob/jk$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 44
    new-instance v0, Lcom/yandex/metrica/impl/ob/ji$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/ji$a;-><init>()V

    .line 46
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jk$a;->a()Ljava/util/Set;

    move-result-object v1

    .line 47
    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    .line 1095
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jk$a;->b()Ljava/util/List;

    move-result-object p1

    .line 1097
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/ji$a$a;

    const/4 v2, 0x0

    move v3, v2

    .line 1099
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 1100
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/yandex/metrica/impl/ob/jk$a$a;

    .line 1108
    new-instance v5, Lcom/yandex/metrica/impl/ob/ji$a$a;

    invoke-direct {v5}, Lcom/yandex/metrica/impl/ob/ji$a$a;-><init>()V

    .line 1110
    iget-object v6, v4, Lcom/yandex/metrica/impl/ob/jk$a$a;->a:Ljava/lang/String;

    iput-object v6, v5, Lcom/yandex/metrica/impl/ob/ji$a$a;->b:Ljava/lang/String;

    .line 1111
    iget-object v6, v4, Lcom/yandex/metrica/impl/ob/jk$a$a;->b:Ljava/lang/String;

    iput-object v6, v5, Lcom/yandex/metrica/impl/ob/ji$a$a;->c:Ljava/lang/String;

    .line 1124
    iget-object v6, v4, Lcom/yandex/metrica/impl/ob/jk$a$a;->d:Lcom/yandex/metrica/impl/ob/me;

    .line 1125
    invoke-virtual {v6}, Lcom/yandex/metrica/impl/ob/me;->a()I

    move-result v6

    new-array v6, v6, [Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    .line 1129
    iget-object v7, v4, Lcom/yandex/metrica/impl/ob/jk$a$a;->d:Lcom/yandex/metrica/impl/ob/me;

    invoke-virtual {v7}, Lcom/yandex/metrica/impl/ob/me;->b()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v8, v2

    :cond_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .line 1130
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 1131
    new-instance v12, Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    invoke-direct {v12}, Lcom/yandex/metrica/impl/ob/ji$a$a$a;-><init>()V

    .line 1134
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    iput-object v13, v12, Lcom/yandex/metrica/impl/ob/ji$a$a$a;->b:Ljava/lang/String;

    .line 1135
    iput-object v11, v12, Lcom/yandex/metrica/impl/ob/ji$a$a$a;->c:Ljava/lang/String;

    .line 1136
    aput-object v12, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 1112
    :cond_1
    iput-object v6, v5, Lcom/yandex/metrica/impl/ob/ji$a$a;->e:[Lcom/yandex/metrica/impl/ob/ji$a$a$a;

    .line 1113
    iget-object v6, v4, Lcom/yandex/metrica/impl/ob/jk$a$a;->c:Ljava/lang/String;

    iput-object v6, v5, Lcom/yandex/metrica/impl/ob/ji$a$a;->d:Ljava/lang/String;

    .line 1114
    iget-wide v6, v4, Lcom/yandex/metrica/impl/ob/jk$a$a;->e:J

    iput-wide v6, v5, Lcom/yandex/metrica/impl/ob/ji$a$a;->f:J

    .line 1115
    iget-object v4, v4, Lcom/yandex/metrica/impl/ob/jk$a$a;->f:Ljava/util/List;

    .line 1158
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    new-array v6, v6, [I

    move v7, v2

    .line 1160
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_2

    .line 1161
    sget-object v8, Lcom/yandex/metrica/impl/ob/fy;->b:Ljava/util/Map;

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    aput v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 1115
    :cond_2
    iput-object v6, v5, Lcom/yandex/metrica/impl/ob/ji$a$a;->g:[I

    .line 1100
    aput-object v5, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 48
    :cond_3
    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/ji$a;->b:[Lcom/yandex/metrica/impl/ob/ji$a$a;

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ji$a;)Lcom/yandex/metrica/impl/ob/jk$a;
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ji$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 58
    new-instance v0, Lcom/yandex/metrica/impl/ob/jk$a;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/fy;->b(Lcom/yandex/metrica/impl/ob/ji$a;)Ljava/util/List;

    move-result-object v1

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ji$a;->c:[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/jk$a;-><init>(Ljava/util/List;Ljava/util/List;)V

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

    .line 20
    check-cast p1, Lcom/yandex/metrica/impl/ob/ji$a;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/fy;->a(Lcom/yandex/metrica/impl/ob/ji$a;)Lcom/yandex/metrica/impl/ob/jk$a;

    move-result-object p1

    return-object p1
.end method

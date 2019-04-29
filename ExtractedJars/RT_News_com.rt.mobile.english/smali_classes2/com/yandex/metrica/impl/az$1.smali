.class Lcom/yandex/metrica/impl/az$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/lk;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/az;->a(Lcom/yandex/metrica/impl/ob/jc$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/jc$c;

.field final synthetic b:Lcom/yandex/metrica/impl/az;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/az;Lcom/yandex/metrica/impl/ob/jc$c;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/yandex/metrica/impl/az$1;->b:Lcom/yandex/metrica/impl/az;

    iput-object p2, p0, Lcom/yandex/metrica/impl/az$1;->a:Lcom/yandex/metrica/impl/ob/jc$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/lj;)V
    .locals 7

    .line 133
    iget-object v0, p0, Lcom/yandex/metrica/impl/az$1;->a:Lcom/yandex/metrica/impl/ob/jc$c;

    .line 1152
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/lj;->c()Ljava/util/List;

    move-result-object v1

    .line 1153
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 1154
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    iput-object v2, v0, Lcom/yandex/metrica/impl/ob/jc$c;->f:[Ljava/lang/String;

    move v2, v3

    .line 1156
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_1

    .line 1157
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1158
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1159
    iget-object v5, v0, Lcom/yandex/metrica/impl/ob/jc$c;->f:[Ljava/lang/String;

    aput-object v4, v5, v2

    .line 1160
    iget-object v4, p0, Lcom/yandex/metrica/impl/az$1;->b:Lcom/yandex/metrica/impl/az;

    iget v5, v4, Lcom/yandex/metrica/impl/az;->o:I

    iget-object v6, v0, Lcom/yandex/metrica/impl/ob/jc$c;->f:[Ljava/lang/String;

    aget-object v6, v6, v2

    invoke-static {v6}, Lcom/yandex/metrica/impl/ob/b;->b(Ljava/lang/String;)I

    move-result v6

    add-int/2addr v5, v6

    iput v5, v4, Lcom/yandex/metrica/impl/az;->o:I

    .line 1161
    iget-object v4, p0, Lcom/yandex/metrica/impl/az$1;->b:Lcom/yandex/metrica/impl/az;

    iget v5, v4, Lcom/yandex/metrica/impl/az;->o:I

    const/16 v6, 0x9

    invoke-static {v6}, Lcom/yandex/metrica/impl/ob/b;->i(I)I

    move-result v6

    add-int/2addr v5, v6

    iput v5, v4, Lcom/yandex/metrica/impl/az;->o:I

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/az$1;->a:Lcom/yandex/metrica/impl/ob/jc$c;

    .line 2138
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/lj;->a()Ljava/util/List;

    move-result-object p1

    .line 2139
    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 2140
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/yandex/metrica/impl/ob/jc$c$f;

    iput-object v1, v0, Lcom/yandex/metrica/impl/ob/jc$c;->g:[Lcom/yandex/metrica/impl/ob/jc$c$f;

    .line 2142
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v3, v1, :cond_2

    .line 2143
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/lf;

    .line 2144
    iget-object v2, v0, Lcom/yandex/metrica/impl/ob/jc$c;->g:[Lcom/yandex/metrica/impl/ob/jc$c$f;

    invoke-static {v1}, Lcom/yandex/metrica/impl/av;->a(Lcom/yandex/metrica/impl/ob/lf;)Lcom/yandex/metrica/impl/ob/jc$c$f;

    move-result-object v1

    aput-object v1, v2, v3

    .line 2145
    iget-object v1, p0, Lcom/yandex/metrica/impl/az$1;->b:Lcom/yandex/metrica/impl/az;

    iget v2, v1, Lcom/yandex/metrica/impl/az;->o:I

    iget-object v4, v0, Lcom/yandex/metrica/impl/ob/jc$c;->g:[Lcom/yandex/metrica/impl/ob/jc$c$f;

    aget-object v4, v4, v3

    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/b;->b(Lcom/yandex/metrica/impl/ob/e;)I

    move-result v4

    add-int/2addr v2, v4

    iput v2, v1, Lcom/yandex/metrica/impl/az;->o:I

    .line 2146
    iget-object v1, p0, Lcom/yandex/metrica/impl/az$1;->b:Lcom/yandex/metrica/impl/az;

    iget v2, v1, Lcom/yandex/metrica/impl/az;->o:I

    const/16 v4, 0xa

    invoke-static {v4}, Lcom/yandex/metrica/impl/ob/b;->i(I)I

    move-result v4

    add-int/2addr v2, v4

    iput v2, v1, Lcom/yandex/metrica/impl/az;->o:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

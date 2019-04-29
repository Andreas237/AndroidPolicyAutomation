.class public Lcom/yandex/metrica/impl/ob/bc;
.super Lcom/yandex/metrica/impl/ob/be;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/be<",
        "Lcom/yandex/metrica/impl/ob/bq;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/cs;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/yandex/metrica/impl/q$a;",
            "Lcom/yandex/metrica/impl/ob/cl<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;>;"
        }
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/cj;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/cj<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/cj;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/cj<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 5

    .line 70
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/be;-><init>()V

    .line 71
    new-instance v0, Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/cs;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    .line 73
    new-instance p1, Lcom/yandex/metrica/impl/ob/ci;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ci;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/bc;->c:Lcom/yandex/metrica/impl/ob/cj;

    .line 1078
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 1081
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->x:Lcom/yandex/metrica/impl/q$a;

    new-instance v1, Lcom/yandex/metrica/impl/ob/ch;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/ch;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1082
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    new-instance v1, Lcom/yandex/metrica/impl/ob/cv;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/cv;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1084
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    new-instance v1, Lcom/yandex/metrica/impl/ob/cp;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/cp;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1086
    new-instance v0, Lcom/yandex/metrica/impl/ob/cn;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/cn;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    .line 1087
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->e:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1088
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1089
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->q:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1090
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->A:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1091
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->B:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/cr;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v2, v3}, Lcom/yandex/metrica/impl/ob/cr;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1093
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->g:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/cx;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v2, v3}, Lcom/yandex/metrica/impl/ob/cx;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1094
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->m:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/co;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v2, v3}, Lcom/yandex/metrica/impl/ob/co;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1095
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->n:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/cu;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    .line 1096
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/cs;->n()Lcom/yandex/metrica/impl/ob/bv;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/cu;-><init>(Lcom/yandex/metrica/impl/ob/cs;Lcom/yandex/metrica/impl/ob/bq;)V

    .line 1095
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1098
    new-instance v1, Lcom/yandex/metrica/impl/ob/cw;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v1, v2}, Lcom/yandex/metrica/impl/ob/cw;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    .line 1099
    sget-object v2, Lcom/yandex/metrica/impl/q$a;->w:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1101
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/cm;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v2, v3}, Lcom/yandex/metrica/impl/ob/cm;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1102
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->h:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/ct;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    invoke-direct {v2, v3}, Lcom/yandex/metrica/impl/ob/ct;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1103
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->i:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/cu;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    .line 1105
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/cs;->i()Lcom/yandex/metrica/impl/ob/cb;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/cu;-><init>(Lcom/yandex/metrica/impl/ob/cs;Lcom/yandex/metrica/impl/ob/bq;)V

    .line 1103
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1107
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->u:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/cu;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    .line 1109
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/cs;->k()Lcom/yandex/metrica/impl/ob/bn;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/cu;-><init>(Lcom/yandex/metrica/impl/ob/cs;Lcom/yandex/metrica/impl/ob/bq;)V

    .line 1107
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1111
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->v:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/cu;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    .line 1113
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/cs;->l()Lcom/yandex/metrica/impl/ob/bm;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/cu;-><init>(Lcom/yandex/metrica/impl/ob/cs;Lcom/yandex/metrica/impl/ob/bq;)V

    .line 1111
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1115
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->j:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->k:Lcom/yandex/metrica/impl/q$a;

    new-instance v2, Lcom/yandex/metrica/impl/ob/cu;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    .line 1118
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/cs;->q()Lcom/yandex/metrica/impl/ob/cg;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/cu;-><init>(Lcom/yandex/metrica/impl/ob/cs;Lcom/yandex/metrica/impl/ob/bq;)V

    .line 1116
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1119
    sget-object v1, Lcom/yandex/metrica/impl/q$a;->l:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/bc;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/yandex/metrica/impl/ob/bb;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/yandex/metrica/impl/ob/bb<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;"
        }
    .end annotation

    .line 142
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 143
    invoke-static {p1}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object p1

    .line 144
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bc;->c:Lcom/yandex/metrica/impl/ob/cj;

    if-eqz v1, :cond_0

    .line 145
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bc;->c:Lcom/yandex/metrica/impl/ob/cj;

    invoke-virtual {v1, p1, v0}, Lcom/yandex/metrica/impl/ob/cj;->a(Lcom/yandex/metrica/impl/q$a;Ljava/util/List;)V

    .line 147
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bc;->b:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/yandex/metrica/impl/ob/cl;

    if-eqz v1, :cond_1

    .line 149
    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/cl;->a(Ljava/util/List;)V

    .line 152
    :cond_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bc;->d:Lcom/yandex/metrica/impl/ob/cj;

    if-eqz v1, :cond_2

    .line 153
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/bc;->d:Lcom/yandex/metrica/impl/ob/cj;

    invoke-virtual {v1, p1, v0}, Lcom/yandex/metrica/impl/ob/cj;->a(Lcom/yandex/metrica/impl/q$a;Ljava/util/List;)V

    .line 155
    :cond_2
    new-instance p1, Lcom/yandex/metrica/impl/ob/ba;

    invoke-direct {p1, v0}, Lcom/yandex/metrica/impl/ob/ba;-><init>(Ljava/util/List;)V

    return-object p1
.end method

.method public a()Lcom/yandex/metrica/impl/ob/cs;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/bc;->a:Lcom/yandex/metrica/impl/ob/cs;

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/q$a;Lcom/yandex/metrica/impl/ob/cl;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/q$a;",
            "Lcom/yandex/metrica/impl/ob/cl<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;)V"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/bc;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

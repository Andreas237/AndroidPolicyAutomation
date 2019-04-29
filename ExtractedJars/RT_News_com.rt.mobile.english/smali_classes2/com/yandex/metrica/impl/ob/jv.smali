.class public Lcom/yandex/metrica/impl/ob/jv;
.super Lcom/yandex/metrica/impl/ob/jt;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/jv$b;,
        Lcom/yandex/metrica/impl/ob/jv$a;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Landroid/location/Location;

.field private c:Z

.field private d:Z

.field private e:Lcom/yandex/metrica/CounterConfiguration$a;

.field private f:I

.field private g:I

.field private h:Z

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Ljava/lang/String;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private q:Z

.field private r:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/jt;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/jv;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/jv;Ljava/lang/String;)V
    .locals 0

    .line 1115
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jv;->j:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/jv;Z)V
    .locals 0

    .line 1123
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->q:Z

    return-void
.end method


# virtual methods
.method public C()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jv;->p:Ljava/util/List;

    return-object v0
.end method

.method public D()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jv;->j:Ljava/lang/String;

    return-object v0
.end method

.method public E()Z
    .locals 1

    .line 79
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->k:Z

    return v0
.end method

.method public F()Z
    .locals 1

    .line 87
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->l:Z

    return v0
.end method

.method public G()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->m:Z

    return v0
.end method

.method public H()Z
    .locals 1

    .line 95
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->n:Z

    return v0
.end method

.method public I()Z
    .locals 1

    .line 119
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->q:Z

    return v0
.end method

.method public J()Z
    .locals 1

    .line 127
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->a:Z

    return v0
.end method

.method public K()Landroid/location/Location;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jv;->b:Landroid/location/Location;

    return-object v0
.end method

.method public L()Z
    .locals 1

    .line 143
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->c:Z

    return v0
.end method

.method public M()Z
    .locals 1

    .line 151
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->d:Z

    return v0
.end method

.method public N()Lcom/yandex/metrica/CounterConfiguration$a;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jv;->e:Lcom/yandex/metrica/CounterConfiguration$a;

    return-object v0
.end method

.method public O()I
    .locals 1

    .line 167
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jv;->f:I

    return v0
.end method

.method public P()I
    .locals 1

    .line 175
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jv;->g:I

    return v0
.end method

.method public Q()Z
    .locals 1

    .line 183
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/jv;->h:Z

    return v0
.end method

.method public R()I
    .locals 1

    .line 191
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jv;->i:I

    return v0
.end method

.method public S()I
    .locals 1

    .line 199
    iget v0, p0, Lcom/yandex/metrica/impl/ob/jv;->r:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 171
    iput p1, p0, Lcom/yandex/metrica/impl/ob/jv;->f:I

    return-void
.end method

.method public a(Landroid/location/Location;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jv;->b:Landroid/location/Location;

    return-void
.end method

.method public a(Lcom/yandex/metrica/CounterConfiguration$a;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jv;->e:Lcom/yandex/metrica/CounterConfiguration$a;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 67
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jv;->p:Ljava/util/List;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 83
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->k:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/jv;->o:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 179
    iput p1, p0, Lcom/yandex/metrica/impl/ob/jv;->g:I

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 99
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->l:Z

    return-void
.end method

.method public c(I)V
    .locals 0

    .line 195
    iput p1, p0, Lcom/yandex/metrica/impl/ob/jv;->i:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->m:Z

    return-void
.end method

.method public d(I)V
    .locals 0

    .line 203
    iput p1, p0, Lcom/yandex/metrica/impl/ob/jv;->r:I

    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 107
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->n:Z

    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 131
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->a:Z

    return-void
.end method

.method public e()Z
    .locals 1

    .line 111
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/jt;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jv;->C()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f(Z)V
    .locals 0

    .line 147
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->c:Z

    return-void
.end method

.method public g(Z)V
    .locals 0

    .line 155
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->d:Z

    return-void
.end method

.method public h(Z)V
    .locals 0

    .line 187
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/jv;->h:Z

    return-void
.end method

.method i(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/jv;->o:Ljava/lang/String;

    return-void
.end method

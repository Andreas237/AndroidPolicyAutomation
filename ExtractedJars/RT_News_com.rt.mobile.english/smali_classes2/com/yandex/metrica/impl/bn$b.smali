.class public Lcom/yandex/metrica/impl/bn$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/bn$b$a;
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/kh$a;

.field private b:Lcom/yandex/metrica/impl/bn$b$a;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/lang/String;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/lang/String;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Lcom/yandex/metrica/impl/ob/kj;

.field private o:Lcom/yandex/metrica/impl/ob/jj$a$c;

.field private p:Lcom/yandex/metrica/impl/ob/jj$a$a;

.field private q:Ljava/lang/Long;

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bn$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    new-instance v0, Lcom/yandex/metrica/impl/ob/kh$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/kh$a;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->a:Lcom/yandex/metrica/impl/ob/kh$a;

    const/4 v0, 0x0

    .line 156
    iput-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->n:Lcom/yandex/metrica/impl/ob/kj;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/jj$a$a;)Lcom/yandex/metrica/impl/ob/jj$a$a;
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->p:Lcom/yandex/metrica/impl/ob/jj$a$a;

    return-object p1
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/jj$a$c;)Lcom/yandex/metrica/impl/ob/jj$a$c;
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->o:Lcom/yandex/metrica/impl/ob/jj$a$c;

    return-object p1
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/bn$b;)Z
    .locals 0

    .line 135
    iget-boolean p0, p0, Lcom/yandex/metrica/impl/bn$b;->d:Z

    return p0
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/bn$b;)Z
    .locals 0

    .line 135
    iget-boolean p0, p0, Lcom/yandex/metrica/impl/bn$b;->e:Z

    return p0
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/kh;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->a:Lcom/yandex/metrica/impl/ob/kh$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kh$a;->a()Lcom/yandex/metrica/impl/ob/kh;

    move-result-object v0

    return-object v0
.end method

.method a(Lcom/yandex/metrica/impl/bn$b$a;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->b:Lcom/yandex/metrica/impl/bn$b$a;

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/kj;)V
    .locals 0

    .line 277
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->n:Lcom/yandex/metrica/impl/ob/kj;

    return-void
.end method

.method public a(Ljava/lang/Long;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->q:Ljava/lang/Long;

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->g:Ljava/lang/String;

    return-void
.end method

.method a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 197
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->f:Ljava/util/List;

    return-void
.end method

.method a(Z)V
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->a:Lcom/yandex/metrica/impl/ob/kh$a;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kh$a;->a(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    return-void
.end method

.method public b()Lcom/yandex/metrica/impl/ob/kh$a;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->a:Lcom/yandex/metrica/impl/ob/kh$a;

    return-object v0
.end method

.method b(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->i:Ljava/lang/String;

    return-void
.end method

.method b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 213
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->h:Ljava/util/List;

    return-void
.end method

.method b(Z)V
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->a:Lcom/yandex/metrica/impl/ob/kh$a;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kh$a;->b(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 201
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->f:Ljava/util/List;

    return-object v0
.end method

.method c(Ljava/lang/String;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->k:Ljava/lang/String;

    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 229
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->j:Ljava/util/List;

    return-void
.end method

.method c(Z)V
    .locals 0

    .line 189
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/bn$b;->d:Z

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->g:Ljava/lang/String;

    return-object v0
.end method

.method d(Ljava/lang/String;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->l:Ljava/lang/String;

    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bn$a;",
            ">;)V"
        }
    .end annotation

    .line 309
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->r:Ljava/util/List;

    return-void
.end method

.method d(Z)V
    .locals 0

    .line 193
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/bn$b;->e:Z

    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 217
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->h:Ljava/util/List;

    return-object v0
.end method

.method e(Ljava/lang/String;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lcom/yandex/metrica/impl/bn$b;->m:Ljava/lang/String;

    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 273
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/bn$b;->c:Z

    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 225
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->i:Ljava/lang/String;

    return-object v0
.end method

.method public f(Z)V
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->a:Lcom/yandex/metrica/impl/ob/kh$a;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kh$a;->c(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    return-void
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 233
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->j:Ljava/util/List;

    return-object v0
.end method

.method public g(Z)V
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->a:Lcom/yandex/metrica/impl/ob/kh$a;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kh$a;->d(Z)Lcom/yandex/metrica/impl/ob/kh$a;

    return-void
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->k:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->l:Ljava/lang/String;

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->m:Ljava/lang/String;

    return-object v0
.end method

.method public k()Lcom/yandex/metrica/impl/bn$b$a;
    .locals 1

    .line 265
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->b:Lcom/yandex/metrica/impl/bn$b$a;

    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 269
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/bn$b;->c:Z

    return v0
.end method

.method public m()Lcom/yandex/metrica/impl/ob/kj;
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->n:Lcom/yandex/metrica/impl/ob/kj;

    return-object v0
.end method

.method public n()Lcom/yandex/metrica/impl/ob/jj$a$c;
    .locals 1

    .line 285
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->o:Lcom/yandex/metrica/impl/ob/jj$a$c;

    return-object v0
.end method

.method public o()Lcom/yandex/metrica/impl/ob/jj$a$a;
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->p:Lcom/yandex/metrica/impl/ob/jj$a$a;

    return-object v0
.end method

.method public p()Ljava/lang/Long;
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->q:Ljava/lang/Long;

    return-object v0
.end method

.method public q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bn$a;",
            ">;"
        }
    .end annotation

    .line 313
    iget-object v0, p0, Lcom/yandex/metrica/impl/bn$b;->r:Ljava/util/List;

    return-object v0
.end method

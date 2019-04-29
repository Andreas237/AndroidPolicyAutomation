.class public final Lcom/yandex/metrica/impl/ob/kh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/kh$a;,
        Lcom/yandex/metrica/impl/ob/kh$b;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/kh$a;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/kh$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->a(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->a:Z

    .line 36
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->b(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->b:Z

    .line 37
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->c(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->c:Z

    .line 38
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->d(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->d:Z

    .line 39
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->e(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->e:Z

    .line 40
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->f(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->f:Z

    .line 41
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->g(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->g:Z

    .line 42
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->h(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->h:Z

    .line 43
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->i(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->i:Z

    .line 44
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->j(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->j:Z

    .line 45
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->k(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->k:Z

    .line 46
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->l(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->l:Z

    .line 47
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->m(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->m:Z

    .line 48
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kh$a;->n(Lcom/yandex/metrica/impl/ob/kh$a;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/kh;->n:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_f

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 56
    :cond_1
    check-cast p1, Lcom/yandex/metrica/impl/ob/kh;

    .line 58
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->a:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    .line 59
    :cond_2
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->b:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->b:Z

    if-eq v2, v3, :cond_3

    return v1

    .line 60
    :cond_3
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->c:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->c:Z

    if-eq v2, v3, :cond_4

    return v1

    .line 61
    :cond_4
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->d:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->d:Z

    if-eq v2, v3, :cond_5

    return v1

    .line 62
    :cond_5
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->e:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->e:Z

    if-eq v2, v3, :cond_6

    return v1

    .line 63
    :cond_6
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->f:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->f:Z

    if-eq v2, v3, :cond_7

    return v1

    .line 64
    :cond_7
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->g:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->g:Z

    if-eq v2, v3, :cond_8

    return v1

    .line 65
    :cond_8
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->h:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->h:Z

    if-eq v2, v3, :cond_9

    return v1

    .line 66
    :cond_9
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->i:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->i:Z

    if-eq v2, v3, :cond_a

    return v1

    .line 67
    :cond_a
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->j:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->j:Z

    if-eq v2, v3, :cond_b

    return v1

    .line 68
    :cond_b
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->l:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->l:Z

    if-eq v2, v3, :cond_c

    return v1

    .line 69
    :cond_c
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->m:Z

    iget-boolean v3, p1, Lcom/yandex/metrica/impl/ob/kh;->m:Z

    if-eq v2, v3, :cond_d

    return v1

    .line 70
    :cond_d
    iget-boolean v2, p0, Lcom/yandex/metrica/impl/ob/kh;->n:Z

    iget-boolean p1, p1, Lcom/yandex/metrica/impl/ob/kh;->n:Z

    if-ne v2, p1, :cond_e

    return v0

    :cond_e
    return v1

    :cond_f
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 75
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/kh;->a:Z

    mul-int/lit8 v0, v0, 0x1f

    .line 76
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->b:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 77
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 78
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->d:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 79
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->e:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 80
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->f:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 81
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->g:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 82
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->h:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 83
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->i:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 84
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->j:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 85
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->l:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 86
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->m:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 87
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/kh;->n:Z

    add-int/2addr v0, v1

    return v0
.end method

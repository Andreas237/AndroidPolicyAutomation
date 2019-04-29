.class public Lcom/yandex/metrica/impl/ob/ks;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/ks$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/List;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/List;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final j:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final k:Lcom/yandex/metrica/impl/ob/kh;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field public final l:Lcom/yandex/metrica/impl/ob/gs;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final m:Lcom/yandex/metrica/impl/ob/gn;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final n:Lcom/yandex/metrica/impl/ob/kj;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final o:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field public final p:J

.field public final q:Z

.field public final r:Ljava/util/List;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bn$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/ks$a;)V
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/ks$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    .line 60
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    .line 61
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->c:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->c:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->c:Ljava/util/List;

    .line 62
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->d:Ljava/lang/String;

    .line 63
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->e:Ljava/lang/String;

    .line 64
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->f:Ljava/util/List;

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->f:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->f:Ljava/util/List;

    .line 65
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->g:Ljava/util/List;

    if-nez v0, :cond_2

    move-object v0, v1

    goto :goto_2

    :cond_2
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->g:Ljava/util/List;

    .line 66
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->g:Ljava/util/List;

    .line 67
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->h:Ljava/util/List;

    if-nez v0, :cond_3

    move-object v0, v1

    goto :goto_3

    :cond_3
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->h:Ljava/util/List;

    .line 68
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_3
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->h:Ljava/util/List;

    .line 69
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->i:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->i:Ljava/lang/String;

    .line 70
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->j:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->j:Ljava/lang/String;

    .line 71
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->k:Lcom/yandex/metrica/impl/ob/kh;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    .line 72
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->l:Lcom/yandex/metrica/impl/ob/gs;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->l:Lcom/yandex/metrica/impl/ob/gs;

    .line 73
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->m:Lcom/yandex/metrica/impl/ob/gn;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->m:Lcom/yandex/metrica/impl/ob/gn;

    .line 74
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->n:Lcom/yandex/metrica/impl/ob/kj;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->n:Lcom/yandex/metrica/impl/ob/kj;

    .line 75
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->p:Ljava/lang/String;

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/ks;->o:Ljava/lang/String;

    .line 76
    iget-wide v2, p1, Lcom/yandex/metrica/impl/ob/ks$a;->o:J

    iput-wide v2, p0, Lcom/yandex/metrica/impl/ob/ks;->p:J

    .line 77
    iget-boolean v0, p1, Lcom/yandex/metrica/impl/ob/ks$a;->q:Z

    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ks;->q:Z

    .line 78
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/ks$a;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/ks$a;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_4
    iput-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->r:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/ks$a;B)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ks;-><init>(Lcom/yandex/metrica/impl/ob/ks$a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/ks$a;
    .locals 3

    .line 82
    new-instance v0, Lcom/yandex/metrica/impl/ob/ks$a;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;-><init>(Lcom/yandex/metrica/impl/ob/kh;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    .line 83
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    .line 84
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->g:Ljava/util/List;

    .line 85
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->c(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->h:Ljava/util/List;

    .line 86
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->d(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->i:Ljava/lang/String;

    .line 87
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->c:Ljava/util/List;

    .line 88
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->f:Ljava/util/List;

    .line 89
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->b(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->d:Ljava/lang/String;

    .line 90
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->e:Ljava/lang/String;

    .line 91
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->o:Ljava/lang/String;

    .line 92
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->g(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->l:Lcom/yandex/metrica/impl/ob/gs;

    .line 93
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->m:Lcom/yandex/metrica/impl/ob/gn;

    .line 94
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/gn;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->n:Lcom/yandex/metrica/impl/ob/kj;

    .line 95
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/kj;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->j:Ljava/lang/String;

    .line 96
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/ks;->q:Z

    .line 97
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Z)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/ks;->p:J

    .line 98
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ks$a;->a(J)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->r:Ljava/util/List;

    .line 99
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->e(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StartupState{uuid=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", deviceId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", reportUrls="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->c:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", getAdUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", reportAdUrl=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", locationUrls="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->f:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", hostUrlsFromStartup="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->g:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", hostUrlsFromClient="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->h:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", encodedClidsFromResponse=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", lastStartupRequestClids=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", foregroundLocationCollectionConfig="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->l:Lcom/yandex/metrica/impl/ob/gs;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", backgroundLocationCollectionConfig="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->m:Lcom/yandex/metrica/impl/ob/gn;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", socketConfig="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->n:Lcom/yandex/metrica/impl/ob/kj;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", distributionReferrer=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ks;->o:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", obtainTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/yandex/metrica/impl/ob/ks;->p:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", startupClidsMatchWithAppClids="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ob/ks;->q:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", requests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ks;->r:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

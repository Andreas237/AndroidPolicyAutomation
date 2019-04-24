.class public Lorg/c/c/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lorg/c/c/j;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lorg/c/c/j;

.field public static final b:Lorg/c/c/j;

.field public static final c:Lorg/c/c/j;

.field public static final d:Lorg/c/c/j;

.field public static final e:Lorg/c/c/j;

.field public static final f:Lorg/c/c/j;

.field public static final g:Lorg/c/c/j;

.field public static final h:Lorg/c/c/j;

.field public static final i:Lorg/c/c/j;

.field public static final j:Lorg/c/c/j;

.field public static final k:Lorg/c/c/j;

.field public static final l:Lorg/c/c/j;

.field public static final m:Lorg/c/c/j;

.field public static final n:Lorg/c/c/j;

.field public static final o:Lorg/c/c/j;

.field public static final p:Lorg/c/c/j;

.field public static final q:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lorg/c/c/j;",
            ">;"
        }
    .end annotation
.end field

.field public static final r:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lorg/c/c/j;",
            ">;"
        }
    .end annotation
.end field

.field private static final s:Ljava/util/BitSet;


# instance fields
.field private final t:Ljava/lang/String;

.field private final u:Ljava/lang/String;

.field private final v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x1f

    if-gt v3, v4, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 v3, 0x7f

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->set(I)V

    new-instance v3, Ljava/util/BitSet;

    invoke-direct {v3, v1}, Ljava/util/BitSet;-><init>(I)V

    const/16 v4, 0x28

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x29

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x3c

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x3e

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x40

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x2c

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x3b

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x3a

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x5c

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x22

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x2f

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x5b

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x5d

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x3f

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x3d

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x7b

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x7d

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x20

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    const/16 v4, 0x9

    invoke-virtual {v3, v4}, Ljava/util/BitSet;->set(I)V

    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4, v1}, Ljava/util/BitSet;-><init>(I)V

    sput-object v4, Lorg/c/c/j;->s:Ljava/util/BitSet;

    sget-object v4, Lorg/c/c/j;->s:Ljava/util/BitSet;

    invoke-virtual {v4, v2, v1}, Ljava/util/BitSet;->set(II)V

    sget-object v1, Lorg/c/c/j;->s:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    sget-object v0, Lorg/c/c/j;->s:Ljava/util/BitSet;

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    const-string v0, "*/*"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->a:Lorg/c/c/j;

    const-string v0, "application/atom+xml"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->b:Lorg/c/c/j;

    const-string v0, "application/rss+xml"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->c:Lorg/c/c/j;

    const-string v0, "application/x-www-form-urlencoded"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->d:Lorg/c/c/j;

    const-string v0, "application/json"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->e:Lorg/c/c/j;

    const-string v0, "application/octet-stream"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->f:Lorg/c/c/j;

    const-string v0, "application/xhtml+xml"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->g:Lorg/c/c/j;

    const-string v0, "application/xml"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->h:Lorg/c/c/j;

    const-string v0, "application/*+xml"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->i:Lorg/c/c/j;

    const-string v0, "image/gif"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->j:Lorg/c/c/j;

    const-string v0, "image/jpeg"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->k:Lorg/c/c/j;

    const-string v0, "image/png"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->l:Lorg/c/c/j;

    const-string v0, "multipart/form-data"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->m:Lorg/c/c/j;

    const-string v0, "text/html"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->n:Lorg/c/c/j;

    const-string v0, "text/plain"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->o:Lorg/c/c/j;

    const-string v0, "text/xml"

    invoke-static {v0}, Lorg/c/c/j;->b(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object v0

    sput-object v0, Lorg/c/c/j;->p:Lorg/c/c/j;

    new-instance v0, Lorg/c/c/j$1;

    invoke-direct {v0}, Lorg/c/c/j$1;-><init>()V

    sput-object v0, Lorg/c/c/j;->q:Ljava/util/Comparator;

    new-instance v0, Lorg/c/c/j$2;

    invoke-direct {v0}, Lorg/c/c/j$2;-><init>()V

    sput-object v0, Lorg/c/c/j;->r:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 1

    const-string v0, "charset"

    invoke-virtual {p3}, Ljava/nio/charset/Charset;->displayName()Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, p3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "\'type\' must not be empty"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "\'subtype\' must not be empty"

    invoke-static {p2, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lorg/c/c/j;->d(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lorg/c/c/j;->d(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    sget-object p1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-static {p3}, Lorg/c/e/c;->a(Ljava/util/Map;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Lorg/c/e/e;

    invoke-interface {p3}, Ljava/util/Map;->size()I

    move-result p2

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {p1, p2, v0}, Lorg/c/e/e;-><init>(ILjava/util/Locale;)V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-direct {p0, v0, p3}, Lorg/c/c/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lorg/c/c/j;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/c/c/j;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lorg/c/c/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lorg/c/c/j;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1, p2}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static a(Ljava/util/Collection;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/c/c/j;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/c/c/j;

    invoke-direct {v1, v0}, Lorg/c/c/j;->a(Ljava/lang/StringBuilder;)V

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "parameter attribute must not be empty"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "parameter value must not be empty"

    invoke-static {p2, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lorg/c/c/j;->d(Ljava/lang/String;)V

    const-string v0, "q"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p2}, Lorg/c/c/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double p2, v0, v2

    if-ltz p2, :cond_0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double p2, v0, v2

    if-gtz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid quality value \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\": should be between 0.0 and 1.0"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lorg/c/e/a;->a(ZLjava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "charset"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p2}, Lorg/c/c/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    return-void

    :cond_2
    invoke-direct {p0, p2}, Lorg/c/c/j;->e(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0, p2}, Lorg/c/c/j;->d(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method private a(Ljava/lang/StringBuilder;)V
    .locals 1

    iget-object v0, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-direct {p0, v0, p1}, Lorg/c/c/j;->a(Ljava/util/Map;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/c/c/j;",
            ">;)V"
        }
    .end annotation

    const-string v0, "\'mediaTypes\' must not be null"

    invoke-static {p0, v0}, Lorg/c/e/a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    sget-object v0, Lorg/c/c/j;->q:Ljava/util/Comparator;

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/util/Map;Ljava/lang/StringBuilder;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/StringBuilder;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    const/16 v1, 0x3b

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;)Lorg/c/c/j;
    .locals 0

    invoke-static {p0}, Lorg/c/c/j;->c(Ljava/lang/String;)Lorg/c/c/j;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;)Lorg/c/c/j;
    .locals 10

    const-string v0, "\'mediaType\' must not be empty"

    invoke-static {p0, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ";"

    invoke-static {p0, v0}, Lorg/c/e/i;->a(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "*"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v2, "*/*"

    :cond_0
    const/16 v3, 0x2f

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\" does not contain \'/\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    if-ne v3, v5, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\" does not contain subtype after \'/\'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    add-int/2addr v3, v6

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v2, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "*"

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "*"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "A wildcard type is legal only in \'*/*\' (all media types)."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const/4 v3, 0x0

    array-length v5, v0

    if-le v5, v6, :cond_5

    new-instance v3, Ljava/util/LinkedHashMap;

    array-length v5, v0

    sub-int/2addr v5, v6

    invoke-direct {v3, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    :goto_0
    array-length v5, v0

    if-ge v6, v5, :cond_5

    aget-object v5, v0, v6

    const/16 v7, 0x3d

    invoke-virtual {v5, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v7

    if-eq v7, v4, :cond_4

    invoke-virtual {v5, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    invoke-virtual {v5, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    new-instance v0, Lorg/c/c/j;

    invoke-direct {v0, p0, v2, v3}, Lorg/c/c/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method static synthetic d(Lorg/c/c/j;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    return-object p0
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    sget-object v2, Lorg/c/c/j;->s:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid token character \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, "\' in token \""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\""

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\""

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    const/4 v1, 0x0

    return v1
.end method

.method private f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lorg/c/c/j;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public a(Lorg/c/c/j;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lorg/c/c/j;->b()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/c/j;->t:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lorg/c/c/j;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    const/16 v3, 0x2b

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    iget-object v4, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-eq v1, v4, :cond_4

    if-eq v3, v4, :cond_4

    iget-object v4, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    add-int/2addr v1, v2

    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    iget-object p1, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    add-int/2addr v3, v2

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "*"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    return v2

    :cond_4
    return v0
.end method

.method public b()Z
    .locals 2

    const-string v0, "*"

    iget-object v1, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b(Lorg/c/c/j;)Z
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lorg/c/c/j;->b()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_5

    invoke-virtual {p1}, Lorg/c/c/j;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/c/j;->t:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0}, Lorg/c/c/j;->d()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lorg/c/c/j;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    const/16 v3, 0x2b

    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    iget-object v4, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    const/4 v4, -0x1

    if-eq v1, v4, :cond_4

    if-eq v3, v4, :cond_4

    iget-object v4, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v5, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    add-int/2addr v1, v2

    invoke-virtual {v6, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    iget-object p1, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    add-int/2addr v3, v2

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "*"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "*"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    return v2

    :cond_4
    return v0

    :cond_5
    return v2
.end method

.method public c(Lorg/c/c/j;)I
    .locals 5

    iget-object v0, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    iget-object v1, p1, Lorg/c/c/j;->t:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    iget-object v1, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    iget-object v0, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iget-object v1, p1, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_2

    return v0

    :cond_2
    new-instance v0, Ljava/util/TreeSet;

    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iget-object v1, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    new-instance v1, Ljava/util/TreeSet;

    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v1, v2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iget-object v2, p1, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_4

    return v4

    :cond_4
    iget-object v4, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, p1, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_5

    const-string v3, ""

    :cond_5
    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_3

    return v2

    :cond_6
    const/4 p1, 0x0

    return p1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    return-object v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/c/c/j;

    invoke-virtual {p0, p1}, Lorg/c/c/j;->c(Lorg/c/c/j;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 2

    const-string v0, "*"

    iget-object v1, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public e()Ljava/nio/charset/Charset;
    .locals 1

    const-string v0, "charset"

    invoke-virtual {p0, v0}, Lorg/c/c/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lorg/c/c/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/c/c/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/c/c/j;

    iget-object v1, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/c/j;->t:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    iget-object p1, p1, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public f()D
    .locals 2

    const-string v0, "q"

    invoke-virtual {p0, v0}, Lorg/c/c/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lorg/c/c/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/c/c/j;->t:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/c/c/j;->u:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/c/c/j;->v:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v0}, Lorg/c/c/j;->a(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public Lorg/c/c/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lorg/c/c/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lorg/c/c/a;

.field public static final b:Lorg/c/c/a;

.field public static final c:Lorg/c/c/a;

.field public static final d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lorg/c/c/a;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/BitSet;


# instance fields
.field private final f:Ljava/lang/String;

.field private final g:Ljava/util/Map;
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

    sput-object v4, Lorg/c/c/a;->e:Ljava/util/BitSet;

    sget-object v4, Lorg/c/c/a;->e:Ljava/util/BitSet;

    invoke-virtual {v4, v2, v1}, Ljava/util/BitSet;->set(II)V

    sget-object v1, Lorg/c/c/a;->e:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    sget-object v0, Lorg/c/c/a;->e:Ljava/util/BitSet;

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->andNot(Ljava/util/BitSet;)V

    const-string v0, "*"

    invoke-static {v0}, Lorg/c/c/a;->b(Ljava/lang/String;)Lorg/c/c/a;

    move-result-object v0

    sput-object v0, Lorg/c/c/a;->a:Lorg/c/c/a;

    const-string v0, "identity"

    invoke-static {v0}, Lorg/c/c/a;->b(Ljava/lang/String;)Lorg/c/c/a;

    move-result-object v0

    sput-object v0, Lorg/c/c/a;->b:Lorg/c/c/a;

    const-string v0, "gzip"

    invoke-static {v0}, Lorg/c/c/a;->b(Ljava/lang/String;)Lorg/c/c/a;

    move-result-object v0

    sput-object v0, Lorg/c/c/a;->c:Lorg/c/c/a;

    new-instance v0, Lorg/c/c/a$1;

    invoke-direct {v0}, Lorg/c/c/a$1;-><init>()V

    sput-object v0, Lorg/c/c/a;->d:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    invoke-direct {p0, p1}, Lorg/c/c/a;->e(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/c/c/a;->f:Ljava/lang/String;

    invoke-static {p2}, Lorg/c/e/c;->a(Ljava/util/Map;)Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Lorg/c/e/e;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v0

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {p1, v0, v1}, Lorg/c/e/e;-><init>(ILjava/util/Locale;)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v1, v0}, Lorg/c/c/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/c/c/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lorg/c/c/a;->g:Ljava/util/Map;

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-string v0, "parameter attribute must not be empty"

    invoke-static {p1, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "parameter value must not be empty"

    invoke-static {p2, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lorg/c/c/a;->e(Ljava/lang/String;)V

    const-string v0, "q"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p2}, Lorg/c/c/a;->g(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-direct {p0, p2}, Lorg/c/c/a;->f(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-direct {p0, p2}, Lorg/c/c/a;->e(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private a(Ljava/lang/StringBuilder;)V
    .locals 1

    iget-object v0, p0, Lorg/c/c/a;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-direct {p0, v0, p1}, Lorg/c/c/a;->a(Ljava/util/Map;Ljava/lang/StringBuilder;)V

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

.method public static b(Ljava/lang/String;)Lorg/c/c/a;
    .locals 0

    invoke-static {p0}, Lorg/c/c/a;->c(Ljava/lang/String;)Lorg/c/c/a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;)Lorg/c/c/a;
    .locals 8

    const-string v0, "\'codingType\' must not be empty"

    invoke-static {p0, v0}, Lorg/c/e/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ";"

    invoke-static {p0, v0}, Lorg/c/e/i;->a(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    aget-object v1, p0, v0

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    array-length v2, p0

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    new-instance v2, Ljava/util/LinkedHashMap;

    array-length v4, p0

    sub-int/2addr v4, v3

    invoke-direct {v2, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    :goto_0
    array-length v4, p0

    if-ge v3, v4, :cond_2

    aget-object v4, p0, v3

    const/16 v5, 0x3d

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    invoke-virtual {v4, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v4, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :cond_2
    new-instance p0, Lorg/c/c/a;

    invoke-direct {p0, v1, v2}, Lorg/c/c/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/c/c/a;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lorg/c/e/i;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, ","

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Lorg/c/c/a;->c(Ljava/lang/String;)Lorg/c/c/a;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private e(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    sget-object v2, Lorg/c/c/a;->e:Ljava/util/BitSet;

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

.method private f(Ljava/lang/String;)Z
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

.method private g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lorg/c/c/a;->f(Ljava/lang/String;)Z

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
.method public a(Lorg/c/c/a;)I
    .locals 5

    iget-object v0, p0, Lorg/c/c/a;->f:Ljava/lang/String;

    iget-object v1, p1, Lorg/c/c/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iget-object v1, p1, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    sub-int/2addr v0, v1

    if-eqz v0, :cond_1

    return v0

    :cond_1
    new-instance v0, Ljava/util/TreeSet;

    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iget-object v1, p0, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    new-instance v1, Ljava/util/TreeSet;

    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    invoke-direct {v1, v2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iget-object v2, p1, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_3

    return v4

    :cond_3
    iget-object v4, p0, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, p1, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_4

    const-string v3, ""

    :cond_4
    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_2

    return v2

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public b()Z
    .locals 2

    const-string v0, "*"

    iget-object v1, p0, Lorg/c/c/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public c()D
    .locals 2

    const-string v0, "q"

    invoke-virtual {p0, v0}, Lorg/c/c/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lorg/c/c/a;

    invoke-virtual {p0, p1}, Lorg/c/c/a;->a(Lorg/c/c/a;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/c/c/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/c/c/a;

    iget-object v1, p0, Lorg/c/c/a;->f:Ljava/lang/String;

    iget-object v3, p1, Lorg/c/c/a;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/c/c/a;->g:Ljava/util/Map;

    iget-object p1, p1, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lorg/c/c/a;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lorg/c/c/a;->g:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v0}, Lorg/c/c/a;->a(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

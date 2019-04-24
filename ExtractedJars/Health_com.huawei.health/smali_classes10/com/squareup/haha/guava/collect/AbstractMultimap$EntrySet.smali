.class final Lcom/squareup/haha/guava/collect/AbstractMultimap$EntrySet;
.super Lcom/squareup/haha/guava/collect/AbstractMultimap$Entries;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/collect/AbstractMultimap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "EntrySet"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/squareup/haha/guava/collect/AbstractMultimap<TK;TV;>.Entries;Ljava/util/Set<Ljava/util/Map$Entry<TK;TV;>;>;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMultimap;)V
    .locals 1

    .line 131
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/squareup/haha/guava/collect/AbstractMultimap$Entries;-><init>(Lcom/squareup/haha/guava/collect/AbstractMultimap;B)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/haha/guava/collect/AbstractMultimap;B)V
    .locals 0

    .line 131
    invoke-direct {p0, p1}, Lcom/squareup/haha/guava/collect/AbstractMultimap$EntrySet;-><init>(Lcom/squareup/haha/guava/collect/AbstractMultimap;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 139
    invoke-static {p0, p1}, Lcom/squareup/haha/guava/base/Joiner;->equalsImpl(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final hashCode()I
    .locals 6

    .line 134
    move-object v2, p0

    .line 2340
    const/4 v3, 0x0

    .line 2341
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 2342
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    add-int/2addr v0, v3

    .line 2344
    move v3, v0

    xor-int/lit8 v0, v0, -0x1

    xor-int/lit8 v3, v0, -0x1

    .line 2346
    goto :goto_0

    .line 134
    .line 2347
    :cond_1
    return v3
.end method

.class Lcom/shopkick/sdk/zone/query/AndZoneQuery;
.super Lcom/shopkick/sdk/zone/query/ZoneQuery;
.source "AndZoneQuery.java"


# instance fields
.field private final clauses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/query/ZoneQuery;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/zone/query/ZoneQuery;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/query/ZoneQuery;-><init>()V

    if-eqz p1, :cond_2

    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 24
    iput-object p1, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->clauses:Ljava/util/List;

    .line 27
    iget-object p1, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->clauses:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v0, 0x0

    .line 29
    :goto_0
    iget-object v1, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->clauses:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 30
    iget-object v1, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->clauses:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    invoke-virtual {v1}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    iget-object v1, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->clauses:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    const-string v1, " AND "

    .line 32
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->id:Ljava/lang/String;

    return-void

    .line 23
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'attributeName\' can not be empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/zone/query/ZoneQuery;)I
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->id:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 15
    check-cast p1, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->compareTo(Lcom/shopkick/sdk/zone/query/ZoneQuery;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 52
    instance-of v1, p1, Lcom/shopkick/sdk/zone/query/AndZoneQuery;

    if-nez v1, :cond_0

    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v1, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :cond_2
    :goto_0
    return v0
.end method

.method protected getId()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isValid(Lcom/shopkick/sdk/zone/Zone;)Z
    .locals 2
    .param p1    # Lcom/shopkick/sdk/zone/Zone;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 41
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/AndZoneQuery;->clauses:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    .line 42
    invoke-virtual {v1, p1}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->isValid(Lcom/shopkick/sdk/zone/Zone;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

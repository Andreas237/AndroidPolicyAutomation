.class Lcom/shopkick/sdk/zone/query/InZoneQuery;
.super Lcom/shopkick/sdk/zone/query/ZoneQuery;
.source "InZoneQuery.java"


# instance fields
.field private final attributeName:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final values:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/shopkick/sdk/zone/query/ZoneQuery;-><init>()V

    .line 24
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p2, :cond_2

    .line 25
    array-length v0, p2

    if-lez v0, :cond_2

    .line 27
    iput-object p1, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->attributeName:Ljava/lang/String;

    .line 28
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->values:Ljava/util/List;

    .line 31
    iget-object p1, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->values:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 32
    new-instance p1, Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->attributeName:Ljava/lang/String;

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string p2, " IN("

    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p2, 0x0

    .line 34
    :goto_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    .line 35
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->values:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge p2, v0, :cond_0

    const-string v0, ","

    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const-string p2, ")"

    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->id:Ljava/lang/String;

    return-void

    .line 25
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'values\' can not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 24
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'attributeName\' can not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/zone/query/ZoneQuery;)I
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->id:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/query/ZoneQuery;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 16
    check-cast p1, Lcom/shopkick/sdk/zone/query/ZoneQuery;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/query/InZoneQuery;->compareTo(Lcom/shopkick/sdk/zone/query/ZoneQuery;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 60
    instance-of v1, p1, Lcom/shopkick/sdk/zone/query/InZoneQuery;

    if-nez v1, :cond_0

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/query/InZoneQuery;->hashCode()I

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

    .line 72
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isValid(Lcom/shopkick/sdk/zone/Zone;)Z
    .locals 1
    .param p1    # Lcom/shopkick/sdk/zone/Zone;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 53
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->attributeName:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/shopkick/sdk/zone/Zone;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 54
    iget-object v0, p0, Lcom/shopkick/sdk/zone/query/InZoneQuery;->values:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

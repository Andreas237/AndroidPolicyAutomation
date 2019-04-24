.class final Lorg/jdom2/filter/AndFilter;
.super Lorg/jdom2/filter/AbstractFilter;
.source "AndFilter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/jdom2/filter/AbstractFilter<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private final base:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "*>;"
        }
    .end annotation
.end field

.field private final refiner:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/jdom2/filter/Filter;Lorg/jdom2/filter/Filter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jdom2/filter/Filter<",
            "*>;",
            "Lorg/jdom2/filter/Filter<",
            "TT;>;)V"
        }
    .end annotation

    .line 76
    invoke-direct {p0}, Lorg/jdom2/filter/AbstractFilter;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 80
    iput-object p1, p0, Lorg/jdom2/filter/AndFilter;->base:Lorg/jdom2/filter/Filter;

    .line 81
    iput-object p2, p0, Lorg/jdom2/filter/AndFilter;->refiner:Lorg/jdom2/filter/Filter;

    return-void

    .line 78
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Cannot have a null base or refiner filter"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 103
    :cond_0
    instance-of v1, p1, Lorg/jdom2/filter/AndFilter;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 104
    check-cast p1, Lorg/jdom2/filter/AndFilter;

    .line 105
    iget-object v1, p0, Lorg/jdom2/filter/AndFilter;->base:Lorg/jdom2/filter/Filter;

    iget-object v3, p1, Lorg/jdom2/filter/AndFilter;->base:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/jdom2/filter/AndFilter;->refiner:Lorg/jdom2/filter/Filter;

    iget-object v3, p1, Lorg/jdom2/filter/AndFilter;->refiner:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_1
    iget-object v1, p0, Lorg/jdom2/filter/AndFilter;->refiner:Lorg/jdom2/filter/Filter;

    iget-object v3, p1, Lorg/jdom2/filter/AndFilter;->base:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/jdom2/filter/AndFilter;->base:Lorg/jdom2/filter/Filter;

    iget-object p1, p1, Lorg/jdom2/filter/AndFilter;->refiner:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :cond_3
    :goto_0
    return v0

    :cond_4
    return v2
.end method

.method public filter(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lorg/jdom2/filter/AndFilter;->base:Lorg/jdom2/filter/Filter;

    invoke-interface {v0, p1}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lorg/jdom2/filter/AndFilter;->refiner:Lorg/jdom2/filter/Filter;

    invoke-interface {v0, p1}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    .line 95
    iget-object v0, p0, Lorg/jdom2/filter/AndFilter;->base:Lorg/jdom2/filter/Filter;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lorg/jdom2/filter/AndFilter;->refiner:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 114
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "[AndFilter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/jdom2/filter/AndFilter;->base:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "            "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/jdom2/filter/AndFilter;->refiner:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

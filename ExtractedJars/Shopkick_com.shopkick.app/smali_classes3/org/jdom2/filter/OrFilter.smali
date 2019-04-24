.class final Lorg/jdom2/filter/OrFilter;
.super Lorg/jdom2/filter/AbstractFilter;
.source "OrFilter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jdom2/filter/AbstractFilter<",
        "Lorg/jdom2/Content;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private final left:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "*>;"
        }
    .end annotation
.end field

.field private final right:Lorg/jdom2/filter/Filter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/filter/Filter<",
            "*>;"
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
            "*>;)V"
        }
    .end annotation

    .line 85
    invoke-direct {p0}, Lorg/jdom2/filter/AbstractFilter;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 89
    iput-object p1, p0, Lorg/jdom2/filter/OrFilter;->left:Lorg/jdom2/filter/Filter;

    .line 90
    iput-object p2, p0, Lorg/jdom2/filter/OrFilter;->right:Lorg/jdom2/filter/Filter;

    return-void

    .line 87
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null filter not allowed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 107
    :cond_0
    instance-of v1, p1, Lorg/jdom2/filter/OrFilter;

    if-eqz v1, :cond_3

    .line 108
    check-cast p1, Lorg/jdom2/filter/OrFilter;

    .line 109
    iget-object v1, p0, Lorg/jdom2/filter/OrFilter;->left:Lorg/jdom2/filter/Filter;

    iget-object v2, p1, Lorg/jdom2/filter/OrFilter;->left:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/jdom2/filter/OrFilter;->right:Lorg/jdom2/filter/Filter;

    iget-object v2, p1, Lorg/jdom2/filter/OrFilter;->right:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, p0, Lorg/jdom2/filter/OrFilter;->left:Lorg/jdom2/filter/Filter;

    iget-object v2, p1, Lorg/jdom2/filter/OrFilter;->right:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lorg/jdom2/filter/OrFilter;->right:Lorg/jdom2/filter/Filter;

    iget-object p1, p1, Lorg/jdom2/filter/OrFilter;->left:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic filter(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Lorg/jdom2/filter/OrFilter;->filter(Ljava/lang/Object;)Lorg/jdom2/Content;

    move-result-object p1

    return-object p1
.end method

.method public filter(Ljava/lang/Object;)Lorg/jdom2/Content;
    .locals 1

    .line 95
    iget-object v0, p0, Lorg/jdom2/filter/OrFilter;->left:Lorg/jdom2/filter/Filter;

    invoke-interface {v0, p1}, Lorg/jdom2/filter/Filter;->matches(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/jdom2/filter/OrFilter;->right:Lorg/jdom2/filter/Filter;

    invoke-interface {v0, p1}, Lorg/jdom2/filter/Filter;->matches(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 96
    :cond_1
    :goto_0
    check-cast p1, Lorg/jdom2/Content;

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    .line 119
    iget-object v0, p0, Lorg/jdom2/filter/OrFilter;->left:Lorg/jdom2/filter/Filter;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    not-int v0, v0

    iget-object v1, p0, Lorg/jdom2/filter/OrFilter;->right:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "[OrFilter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/jdom2/filter/OrFilter;->left:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "           "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/jdom2/filter/OrFilter;->right:Lorg/jdom2/filter/Filter;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public Lorg/jdom2/filter/AttributeFilter;
.super Lorg/jdom2/filter/AbstractFilter;
.source "AttributeFilter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jdom2/filter/AbstractFilter<",
        "Lorg/jdom2/Attribute;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xc8L


# instance fields
.field private final name:Ljava/lang/String;

.field private final namespace:Lorg/jdom2/Namespace;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    invoke-direct {p0, v0, v0}, Lorg/jdom2/filter/AttributeFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 91
    invoke-direct {p0, p1, v0}, Lorg/jdom2/filter/AttributeFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V
    .locals 0

    .line 109
    invoke-direct {p0}, Lorg/jdom2/filter/AbstractFilter;-><init>()V

    .line 110
    iput-object p1, p0, Lorg/jdom2/filter/AttributeFilter;->name:Ljava/lang/String;

    .line 111
    iput-object p2, p0, Lorg/jdom2/filter/AttributeFilter;->namespace:Lorg/jdom2/Namespace;

    return-void
.end method

.method public constructor <init>(Lorg/jdom2/Namespace;)V
    .locals 1

    const/4 v0, 0x0

    .line 100
    invoke-direct {p0, v0, p1}, Lorg/jdom2/filter/AttributeFilter;-><init>(Ljava/lang/String;Lorg/jdom2/Namespace;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 153
    :cond_0
    instance-of v1, p1, Lorg/jdom2/filter/AttributeFilter;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 155
    :cond_1
    check-cast p1, Lorg/jdom2/filter/AttributeFilter;

    .line 157
    iget-object v1, p0, Lorg/jdom2/filter/AttributeFilter;->name:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v3, p1, Lorg/jdom2/filter/AttributeFilter;->name:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_2
    iget-object v1, p1, Lorg/jdom2/filter/AttributeFilter;->name:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_0
    return v2

    .line 158
    :cond_3
    iget-object v1, p0, Lorg/jdom2/filter/AttributeFilter;->namespace:Lorg/jdom2/Namespace;

    if-eqz v1, :cond_4

    iget-object p1, p1, Lorg/jdom2/filter/AttributeFilter;->namespace:Lorg/jdom2/Namespace;

    invoke-virtual {v1, p1}, Lorg/jdom2/Namespace;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_4
    iget-object p1, p1, Lorg/jdom2/filter/AttributeFilter;->namespace:Lorg/jdom2/Namespace;

    if-eqz p1, :cond_5

    :goto_1
    return v2

    :cond_5
    return v0
.end method

.method public bridge synthetic filter(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 65
    invoke-virtual {p0, p1}, Lorg/jdom2/filter/AttributeFilter;->filter(Ljava/lang/Object;)Lorg/jdom2/Attribute;

    move-result-object p1

    return-object p1
.end method

.method public filter(Ljava/lang/Object;)Lorg/jdom2/Attribute;
    .locals 3

    .line 123
    instance-of v0, p1, Lorg/jdom2/Attribute;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 124
    check-cast p1, Lorg/jdom2/Attribute;

    .line 125
    iget-object v0, p0, Lorg/jdom2/filter/AttributeFilter;->name:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 126
    iget-object v0, p0, Lorg/jdom2/filter/AttributeFilter;->namespace:Lorg/jdom2/Namespace;

    if-nez v0, :cond_0

    return-object p1

    .line 129
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/jdom2/Namespace;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    return-object p1

    .line 131
    :cond_2
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    return-object v1

    .line 134
    :cond_3
    iget-object v0, p0, Lorg/jdom2/filter/AttributeFilter;->namespace:Lorg/jdom2/Namespace;

    if-nez v0, :cond_4

    return-object p1

    .line 137
    :cond_4
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespace()Lorg/jdom2/Namespace;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/jdom2/Namespace;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    move-object p1, v1

    :goto_1
    return-object p1

    :cond_6
    return-object v1
.end method

.method public hashCode()I
    .locals 3

    .line 166
    iget-object v0, p0, Lorg/jdom2/filter/AttributeFilter;->name:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x1d

    .line 167
    iget-object v2, p0, Lorg/jdom2/filter/AttributeFilter;->namespace:Lorg/jdom2/Namespace;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lorg/jdom2/Namespace;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

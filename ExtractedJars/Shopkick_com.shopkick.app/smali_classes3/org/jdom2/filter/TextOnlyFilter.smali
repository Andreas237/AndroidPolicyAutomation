.class final Lorg/jdom2/filter/TextOnlyFilter;
.super Lorg/jdom2/filter/AbstractFilter;
.source "TextOnlyFilter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/jdom2/filter/AbstractFilter<",
        "Lorg/jdom2/Text;",
        ">;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xc8L


# direct methods
.method constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Lorg/jdom2/filter/AbstractFilter;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 92
    instance-of p1, p1, Lorg/jdom2/filter/TextOnlyFilter;

    return p1
.end method

.method public bridge synthetic filter(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 67
    invoke-virtual {p0, p1}, Lorg/jdom2/filter/TextOnlyFilter;->filter(Ljava/lang/Object;)Lorg/jdom2/Text;

    move-result-object p1

    return-object p1
.end method

.method public filter(Ljava/lang/Object;)Lorg/jdom2/Text;
    .locals 2

    .line 76
    instance-of v0, p1, Lorg/jdom2/Text;

    if-eqz v0, :cond_0

    .line 77
    check-cast p1, Lorg/jdom2/Text;

    .line 78
    invoke-virtual {p1}, Lorg/jdom2/Text;->getCType()Lorg/jdom2/Content$CType;

    move-result-object v0

    sget-object v1, Lorg/jdom2/Content$CType;->Text:Lorg/jdom2/Content$CType;

    if-ne v0, v1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

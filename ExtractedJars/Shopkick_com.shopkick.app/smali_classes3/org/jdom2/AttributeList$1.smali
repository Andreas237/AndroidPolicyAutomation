.class final Lorg/jdom2/AttributeList$1;
.super Ljava/lang/Object;
.source "AttributeList.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/AttributeList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lorg/jdom2/Attribute;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 90
    check-cast p1, Lorg/jdom2/Attribute;

    check-cast p2, Lorg/jdom2/Attribute;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/AttributeList$1;->compare(Lorg/jdom2/Attribute;Lorg/jdom2/Attribute;)I

    move-result p1

    return p1
.end method

.method public compare(Lorg/jdom2/Attribute;Lorg/jdom2/Attribute;)I
    .locals 2

    .line 94
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lorg/jdom2/Attribute;->getNamespacePrefix()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 98
    :cond_0
    invoke-virtual {p1}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lorg/jdom2/Attribute;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

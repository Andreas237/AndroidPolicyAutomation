.class final Lorg/jdom2/util/NamespaceStack$1;
.super Ljava/lang/Object;
.source "NamespaceStack.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/jdom2/util/NamespaceStack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lorg/jdom2/Namespace;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 234
    check-cast p1, Lorg/jdom2/Namespace;

    check-cast p2, Lorg/jdom2/Namespace;

    invoke-virtual {p0, p1, p2}, Lorg/jdom2/util/NamespaceStack$1;->compare(Lorg/jdom2/Namespace;Lorg/jdom2/Namespace;)I

    move-result p1

    return p1
.end method

.method public compare(Lorg/jdom2/Namespace;Lorg/jdom2/Namespace;)I
    .locals 0

    .line 237
    invoke-virtual {p1}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lorg/jdom2/Namespace;->getPrefix()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

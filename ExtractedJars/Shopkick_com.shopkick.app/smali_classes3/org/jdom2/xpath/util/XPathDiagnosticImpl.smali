.class public Lorg/jdom2/xpath/util/XPathDiagnosticImpl;
.super Ljava/lang/Object;
.source "XPathDiagnosticImpl.java"

# interfaces
.implements Lorg/jdom2/xpath/XPathDiagnostic;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/jdom2/xpath/XPathDiagnostic<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final dcontext:Ljava/lang/Object;

.field private final dfiltered:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final dfirstonly:Z

.field private final draw:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final dresult:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final dxpath:Lorg/jdom2/xpath/XPathExpression;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lorg/jdom2/xpath/XPathExpression;Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;",
            "Ljava/util/List<",
            "*>;Z)V"
        }
    .end annotation

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    .line 100
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    invoke-interface {p2}, Lorg/jdom2/xpath/XPathExpression;->getFilter()Lorg/jdom2/filter/Filter;

    move-result-object v0

    .line 105
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 106
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    invoke-interface {v0, v4}, Lorg/jdom2/filter/Filter;->filter(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_0

    .line 109
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 111
    :cond_0
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 115
    :cond_1
    iput-object p1, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dcontext:Ljava/lang/Object;

    .line 116
    iput-object p2, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dxpath:Lorg/jdom2/xpath/XPathExpression;

    .line 117
    iput-boolean p4, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dfirstonly:Z

    .line 119
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dfiltered:Ljava/util/List;

    .line 120
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->draw:Ljava/util/List;

    .line 121
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dresult:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getContext()Ljava/lang/Object;
    .locals 1

    .line 127
    iget-object v0, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dcontext:Ljava/lang/Object;

    return-object v0
.end method

.method public getFilteredResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 142
    iget-object v0, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dfiltered:Ljava/util/List;

    return-object v0
.end method

.method public getRawResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 147
    iget-object v0, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->draw:Ljava/util/List;

    return-object v0
.end method

.method public getResult()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    .line 137
    iget-object v0, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dresult:Ljava/util/List;

    return-object v0
.end method

.method public getXPathExpression()Lorg/jdom2/xpath/XPathExpression;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/jdom2/xpath/XPathExpression<",
            "TT;>;"
        }
    .end annotation

    .line 132
    iget-object v0, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dxpath:Lorg/jdom2/xpath/XPathExpression;

    return-object v0
.end method

.method public isFirstOnly()Z
    .locals 1

    .line 152
    iget-boolean v0, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dfirstonly:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "[XPathDiagnostic: \'%s\' evaluated (%s) against %s produced  raw=%d discarded=%d returned=%d]"

    const/4 v1, 0x6

    .line 157
    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dxpath:Lorg/jdom2/xpath/XPathExpression;

    invoke-interface {v2}, Lorg/jdom2/xpath/XPathExpression;->getExpression()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dfirstonly:Z

    if-eqz v2, :cond_0

    const-string v2, "first"

    goto :goto_0

    :cond_0
    const-string v2, "all"

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    iget-object v3, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dcontext:Ljava/lang/Object;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->draw:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dfiltered:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-object v3, p0, Lorg/jdom2/xpath/util/XPathDiagnosticImpl;->dresult:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

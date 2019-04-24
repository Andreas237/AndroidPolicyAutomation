.class final Lorg/jdom2/DescendantIterator;
.super Ljava/lang/Object;
.source "DescendantIterator.java"

# interfaces
.implements Lorg/jdom2/util/IteratorIterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/jdom2/util/IteratorIterable<",
        "Lorg/jdom2/Content;",
        ">;"
    }
.end annotation


# instance fields
.field private ascending:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end field

.field private current:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end field

.field private descending:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end field

.field private hasnext:Z

.field private final parent:Lorg/jdom2/Parent;

.field private ssize:I

.field private stack:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Lorg/jdom2/Parent;)V
    .locals 1

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    .line 83
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lorg/jdom2/DescendantIterator;->stack:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 84
    iput v0, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    const/4 v0, 0x0

    .line 87
    iput-object v0, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    .line 89
    iput-object v0, p0, Lorg/jdom2/DescendantIterator;->descending:Ljava/util/Iterator;

    .line 91
    iput-object v0, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, Lorg/jdom2/DescendantIterator;->hasnext:Z

    .line 101
    iput-object p1, p0, Lorg/jdom2/DescendantIterator;->parent:Lorg/jdom2/Parent;

    .line 103
    invoke-interface {p1}, Lorg/jdom2/Parent;->getContent()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    .line 104
    iget-object p1, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    iput-boolean p1, p0, Lorg/jdom2/DescendantIterator;->hasnext:Z

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 120
    iget-boolean v0, p0, Lorg/jdom2/DescendantIterator;->hasnext:Z

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 72
    invoke-virtual {p0}, Lorg/jdom2/DescendantIterator;->iterator()Lorg/jdom2/DescendantIterator;

    move-result-object v0

    return-object v0
.end method

.method public iterator()Lorg/jdom2/DescendantIterator;
    .locals 2

    .line 110
    new-instance v0, Lorg/jdom2/DescendantIterator;

    iget-object v1, p0, Lorg/jdom2/DescendantIterator;->parent:Lorg/jdom2/Parent;

    invoke-direct {v0, v1}, Lorg/jdom2/DescendantIterator;-><init>(Lorg/jdom2/Parent;)V

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 72
    invoke-virtual {p0}, Lorg/jdom2/DescendantIterator;->next()Lorg/jdom2/Content;

    move-result-object v0

    return-object v0
.end method

.method public next()Lorg/jdom2/Content;
    .locals 4

    .line 131
    iget-object v0, p0, Lorg/jdom2/DescendantIterator;->descending:Ljava/util/Iterator;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 132
    iput-object v0, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    .line 133
    iput-object v1, p0, Lorg/jdom2/DescendantIterator;->descending:Ljava/util/Iterator;

    goto :goto_0

    .line 134
    :cond_0
    iget-object v0, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    if-eqz v0, :cond_1

    .line 135
    iput-object v0, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    .line 136
    iput-object v1, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    .line 139
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Content;

    .line 143
    instance-of v2, v0, Lorg/jdom2/Element;

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, Lorg/jdom2/Element;

    invoke-virtual {v2}, Lorg/jdom2/Element;->getContentSize()I

    move-result v3

    if-lez v3, :cond_3

    .line 146
    invoke-virtual {v2}, Lorg/jdom2/Element;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    iput-object v1, p0, Lorg/jdom2/DescendantIterator;->descending:Ljava/util/Iterator;

    .line 147
    iget v1, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    iget-object v2, p0, Lorg/jdom2/DescendantIterator;->stack:[Ljava/lang/Object;

    array-length v3, v2

    if-lt v1, v3, :cond_2

    add-int/lit8 v1, v1, 0x10

    .line 148
    invoke-static {v2, v1}, Lorg/jdom2/internal/ArrayCopy;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lorg/jdom2/DescendantIterator;->stack:[Ljava/lang/Object;

    .line 150
    :cond_2
    iget-object v1, p0, Lorg/jdom2/DescendantIterator;->stack:[Ljava/lang/Object;

    iget v2, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    iget-object v3, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    aput-object v3, v1, v2

    return-object v0

    .line 154
    :cond_3
    iget-object v2, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    return-object v0

    .line 160
    :cond_4
    iget v2, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    if-lez v2, :cond_5

    .line 165
    iget-object v3, p0, Lorg/jdom2/DescendantIterator;->stack:[Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    aget-object v2, v3, v2

    check-cast v2, Ljava/util/Iterator;

    .line 166
    iput-object v2, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    .line 167
    iget v2, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    aput-object v1, v3, v2

    .line 168
    iget-object v2, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    return-object v0

    .line 173
    :cond_5
    iput-object v1, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    const/4 v1, 0x0

    .line 174
    iput-boolean v1, p0, Lorg/jdom2/DescendantIterator;->hasnext:Z

    return-object v0
.end method

.method public remove()V
    .locals 4

    .line 186
    iget-object v0, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v0, 0x0

    .line 189
    iput-object v0, p0, Lorg/jdom2/DescendantIterator;->descending:Ljava/util/Iterator;

    .line 190
    iget-object v1, p0, Lorg/jdom2/DescendantIterator;->current:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 197
    :cond_0
    iget v1, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    if-lez v1, :cond_1

    .line 199
    iget-object v2, p0, Lorg/jdom2/DescendantIterator;->stack:[Ljava/lang/Object;

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    aget-object v1, v2, v1

    check-cast v1, Ljava/util/Iterator;

    .line 200
    iget v3, p0, Lorg/jdom2/DescendantIterator;->ssize:I

    aput-object v0, v2, v3

    .line 201
    iput-object v1, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    .line 202
    iget-object v1, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 206
    :cond_1
    iput-object v0, p0, Lorg/jdom2/DescendantIterator;->ascending:Ljava/util/Iterator;

    const/4 v0, 0x0

    .line 207
    iput-boolean v0, p0, Lorg/jdom2/DescendantIterator;->hasnext:Z

    return-void

    :cond_2
    :goto_0
    return-void
.end method

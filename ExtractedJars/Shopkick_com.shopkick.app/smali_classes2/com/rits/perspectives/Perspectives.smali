.class public Lcom/rits/perspectives/Perspectives;
.super Ljava/lang/Object;
.source "Perspectives.java"


# instance fields
.field private final cloner:Lcom/rits/cloning/Cloner;


# direct methods
.method public constructor <init>(Lcom/rits/cloning/Cloner;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/rits/perspectives/Perspectives;->cloner:Lcom/rits/cloning/Cloner;

    return-void
.end method


# virtual methods
.method public viewAs(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "E:TT;>(",
            "Ljava/lang/Class<",
            "TE;>;TT;)TE;"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 40
    :cond_0
    instance-of v0, p2, Ljava/util/Collection;

    if-nez v0, :cond_1

    .line 41
    iget-object v0, p0, Lcom/rits/perspectives/Perspectives;->cloner:Lcom/rits/cloning/Cloner;

    invoke-virtual {v0, p1}, Lcom/rits/cloning/Cloner;->fastCloneOrNewInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    .line 42
    iget-object v0, p0, Lcom/rits/perspectives/Perspectives;->cloner:Lcom/rits/cloning/Cloner;

    invoke-virtual {v0, p2, p1}, Lcom/rits/cloning/Cloner;->copyPropertiesOfInheritedClass(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "for collections please use viewCollectionAs() method. Invalid object "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public viewCollectionAs(Ljava/util/Collection;Ljava/lang/Class;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "NI:TI;T::",
            "Ljava/util/Collection<",
            "TI;>;E::",
            "Ljava/util/Collection<",
            "TNI;>;>(TE;",
            "Ljava/lang/Class<",
            "TNI;>;TT;)TE;"
        }
    .end annotation

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 66
    :cond_0
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 68
    invoke-virtual {p0, p2, v0}, Lcom/rits/perspectives/Perspectives;->viewAs(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 69
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p1
.end method

.class public Lorg/jdom2/output/support/WalkerPRESERVE;
.super Ljava/lang/Object;
.source "WalkerPRESERVE.java"

# interfaces
.implements Lorg/jdom2/output/support/Walker;


# static fields
.field private static final EMPTYIT:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final alltext:Z

.field private final iter:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+",
            "Lorg/jdom2/Content;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    new-instance v0, Lorg/jdom2/output/support/WalkerPRESERVE$1;

    invoke-direct {v0}, Lorg/jdom2/output/support/WalkerPRESERVE$1;-><init>()V

    sput-object v0, Lorg/jdom2/output/support/WalkerPRESERVE;->EMPTYIT:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/jdom2/Content;",
            ">;)V"
        }
    .end annotation

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 101
    iput-boolean p1, p0, Lorg/jdom2/output/support/WalkerPRESERVE;->alltext:Z

    .line 102
    sget-object p1, Lorg/jdom2/output/support/WalkerPRESERVE;->EMPTYIT:Ljava/util/Iterator;

    iput-object p1, p0, Lorg/jdom2/output/support/WalkerPRESERVE;->iter:Ljava/util/Iterator;

    goto :goto_0

    .line 104
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lorg/jdom2/output/support/WalkerPRESERVE;->iter:Ljava/util/Iterator;

    const/4 p1, 0x0

    .line 105
    iput-boolean p1, p0, Lorg/jdom2/output/support/WalkerPRESERVE;->alltext:Z

    :goto_0
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 131
    iget-object v0, p0, Lorg/jdom2/output/support/WalkerPRESERVE;->iter:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public isAllText()Z
    .locals 1

    .line 126
    iget-boolean v0, p0, Lorg/jdom2/output/support/WalkerPRESERVE;->alltext:Z

    return v0
.end method

.method public isAllWhitespace()Z
    .locals 1

    .line 151
    iget-boolean v0, p0, Lorg/jdom2/output/support/WalkerPRESERVE;->alltext:Z

    return v0
.end method

.method public isCDATA()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public next()Lorg/jdom2/Content;
    .locals 1

    .line 136
    iget-object v0, p0, Lorg/jdom2/output/support/WalkerPRESERVE;->iter:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/jdom2/Content;

    return-object v0
.end method

.method public text()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

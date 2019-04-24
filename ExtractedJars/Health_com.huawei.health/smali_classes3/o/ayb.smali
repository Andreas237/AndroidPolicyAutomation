.class public Lo/ayb;
.super Lo/bfh;
.source "SourceFile"


# instance fields
.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bfh;>;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ayb;->c:Ljava/util/ArrayList;

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ayb;->d:Z

    .line 33
    const/16 v0, 0x25

    invoke-virtual {p0, v0}, Lo/ayb;->setCardType(I)V

    .line 34
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 63
    iput-boolean p1, p0, Lo/ayb;->d:Z

    .line 64
    return-void
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/bfh;>;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lo/ayb;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 73
    iget-object v0, p0, Lo/ayb;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 75
    const/4 v0, 0x0

    return v0

    .line 77
    :cond_0
    iget-object v0, p0, Lo/ayb;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public c(Lo/bfh;)V
    .locals 1

    .line 87
    iget-object v0, p0, Lo/ayb;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ayb;->c:Ljava/util/ArrayList;

    .line 91
    :cond_0
    if-eqz p1, :cond_1

    .line 93
    iget-object v0, p0, Lo/ayb;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_1
    return-void
.end method

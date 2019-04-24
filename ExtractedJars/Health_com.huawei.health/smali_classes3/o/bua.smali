.class public Lo/bua;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput p1, p0, Lo/bua;->b:I

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bua;->d:Ljava/util/List;

    .line 14
    return-void
.end method


# virtual methods
.method public b()I
    .locals 3

    .line 26
    iget-object v0, p0, Lo/bua;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 27
    iget-object v0, p0, Lo/bua;->d:Ljava/util/List;

    iget-object v1, p0, Lo/bua;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 29
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public b(I)I
    .locals 2

    .line 18
    iget-object v0, p0, Lo/bua;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/bua;->b:I

    if-lt v0, v1, :cond_0

    .line 19
    iget-object v0, p0, Lo/bua;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 21
    :cond_0
    iget-object v0, p0, Lo/bua;->d:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {p0}, Lo/bua;->b()I

    move-result v0

    return v0
.end method

.method public e()V
    .locals 1

    .line 33
    iget-object v0, p0, Lo/bua;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 34
    return-void
.end method

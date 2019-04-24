.class public abstract Lo/bfk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected b:Landroid/content/Context;

.field protected c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bfl;>;"
        }
    .end annotation
.end field

.field protected d:I

.field protected e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bfk;->c:Ljava/util/ArrayList;

    .line 23
    const/4 v0, 0x1

    iput v0, p0, Lo/bfk;->d:I

    .line 25
    const/4 v0, -0x1

    iput v0, p0, Lo/bfk;->e:I

    .line 31
    iput-object p1, p0, Lo/bfk;->b:Landroid/content/Context;

    .line 32
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 63
    iget v0, p0, Lo/bfk;->e:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 114
    return-void
.end method

.method public b(I)Lo/bfl;
    .locals 2

    .line 49
    iget-object v0, p0, Lo/bfk;->c:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/bfk;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 51
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 53
    :cond_1
    iget-object v0, p0, Lo/bfk;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bfl;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 68
    iget v0, p0, Lo/bfk;->d:I

    return v0
.end method

.method public d(Lo/bfl;)V
    .locals 1

    .line 36
    if-eqz p1, :cond_0

    .line 38
    iget-object v0, p0, Lo/bfk;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    :cond_0
    return-void
.end method

.method public d(Lo/bfp;)V
    .locals 4

    .line 100
    invoke-virtual {p0}, Lo/bfk;->e()I

    move-result v1

    .line 101
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 103
    invoke-virtual {p0, v2}, Lo/bfk;->b(I)Lo/bfl;

    move-result-object v3

    .line 104
    if-eqz v3, :cond_0

    .line 106
    invoke-virtual {v3, p1}, Lo/bfl;->e(Lo/bfp;)V

    .line 101
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 109
    :cond_1
    return-void
.end method

.method public e()I
    .locals 1

    .line 58
    iget-object v0, p0, Lo/bfk;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public abstract e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
.end method

.method public e(Lo/bfq$e;)Z
    .locals 6

    .line 76
    invoke-virtual {p0}, Lo/bfk;->c()I

    move-result v3

    .line 78
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    .line 80
    invoke-virtual {p0, v4}, Lo/bfk;->b(I)Lo/bfl;

    move-result-object v5

    .line 81
    if-nez v5, :cond_0

    .line 82
    goto :goto_1

    .line 84
    :cond_0
    invoke-virtual {p1, v4}, Lo/bfq$e;->b(I)Lo/bfh;

    move-result-object v2

    .line 85
    if-eqz v2, :cond_1

    .line 87
    invoke-virtual {v5, v2}, Lo/bfl;->d(Lo/bfh;)V

    .line 88
    invoke-virtual {v5}, Lo/bfl;->c()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {v5}, Lo/bfl;->c()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 78
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 95
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

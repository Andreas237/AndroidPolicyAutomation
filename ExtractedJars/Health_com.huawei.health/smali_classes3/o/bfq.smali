.class public Lo/bfq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bfq$e;,
        Lo/bfq$c;
    }
.end annotation


# instance fields
.field protected a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bfq$e;>;"
        }
    .end annotation
.end field

.field protected b:Landroid/content/Context;

.field protected c:Lo/bfn;

.field protected d:Lo/bfq$c;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bfq;->a:Ljava/util/List;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bfq;->d:Lo/bfq$c;

    .line 31
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bfq;->e:Z

    .line 53
    iput-object p1, p0, Lo/bfq;->b:Landroid/content/Context;

    .line 56
    return-void
.end method


# virtual methods
.method public a()Lo/bfq$c;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/bfq;->d:Lo/bfq$c;

    return-object v0
.end method

.method protected b(Lo/bfq$e;)I
    .locals 3

    .line 170
    iget v2, p1, Lo/bfq$e;->a:I

    .line 172
    if-ltz v2, :cond_0

    iget-object v0, p1, Lo/bfq$e;->c:Lo/bfk;

    invoke-virtual {v0}, Lo/bfk;->c()I

    move-result v0

    mul-int/2addr v0, v2

    iget-object v1, p1, Lo/bfq$e;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    .line 173
    :cond_0
    iget-object v0, p1, Lo/bfq$e;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p1, Lo/bfq$e;->c:Lo/bfk;

    invoke-virtual {v1}, Lo/bfk;->c()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    const v1, 0x3f666666    # 0.9f

    add-float/2addr v0, v1

    float-to-int v2, v0

    .line 175
    :cond_1
    return v2
.end method

.method public b(Lo/bfn;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lo/bfq;->c:Lo/bfn;

    .line 46
    return-void
.end method

.method public c(I)I
    .locals 6

    .line 122
    const/4 v1, -0x1

    .line 123
    const/4 v2, 0x0

    .line 125
    iget-object v0, p0, Lo/bfq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bfq$e;

    .line 127
    invoke-virtual {p0, v4}, Lo/bfq;->b(Lo/bfq$e;)I

    move-result v5

    .line 128
    add-int/2addr v2, v5

    .line 129
    add-int/lit8 v0, p1, 0x1

    if-gt v0, v2, :cond_0

    .line 131
    iget-object v0, v4, Lo/bfq$e;->c:Lo/bfk;

    invoke-virtual {v0}, Lo/bfk;->a()I

    move-result v1

    .line 132
    goto :goto_1

    .line 134
    :cond_0
    goto :goto_0

    .line 136
    :cond_1
    :goto_1
    return v1
.end method

.method public c(Lo/bfq$c;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/bfq;->d:Lo/bfq$c;

    .line 82
    return-void
.end method

.method public d()V
    .locals 0

    .line 107
    return-void
.end method

.method public e()I
    .locals 5

    .line 111
    const/4 v1, 0x0

    .line 112
    iget-object v0, p0, Lo/bfq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bfq$e;

    .line 114
    invoke-virtual {p0, v3}, Lo/bfq;->b(Lo/bfq$e;)I

    move-result v4

    .line 115
    add-int/2addr v1, v4

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    return v1
.end method

.method public e(I)Lo/bfq$e;
    .locals 9

    .line 141
    const/4 v2, 0x0

    .line 142
    const/4 v3, 0x0

    .line 143
    const/4 v4, 0x0

    .line 144
    const/4 v5, 0x0

    .line 145
    iget-object v0, p0, Lo/bfq;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/bfq$e;

    .line 147
    invoke-virtual {p0, v7}, Lo/bfq;->b(Lo/bfq$e;)I

    move-result v8

    .line 148
    add-int/2addr v4, v8

    .line 149
    if-le v4, p1, :cond_0

    .line 151
    sub-int v0, p1, v5

    iget-object v1, v7, Lo/bfq$e;->c:Lo/bfk;

    invoke-virtual {v1}, Lo/bfk;->c()I

    move-result v1

    mul-int v3, v0, v1

    .line 152
    iput v3, v7, Lo/bfq$e;->b:I

    .line 153
    move-object v2, v7

    .line 154
    goto :goto_1

    .line 156
    :cond_0
    add-int/2addr v5, v8

    .line 157
    goto :goto_0

    .line 158
    :cond_1
    :goto_1
    return-object v2
.end method

.method public e(IIILjava/util/List;)Lo/bfq$e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIILjava/util/List<+Lo/bfh;>;)Lo/bfq$e;"
        }
    .end annotation

    .line 86
    const/4 v2, 0x0

    .line 87
    iget-object v0, p0, Lo/bfq;->c:Lo/bfn;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lo/bfq;->c:Lo/bfn;

    iget-object v1, p0, Lo/bfq;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, p2}, Lo/bfn;->b(Landroid/content/Context;I)Lo/bfk;

    move-result-object v2

    .line 91
    :cond_0
    if-nez v2, :cond_1

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 93
    :cond_1
    new-instance v3, Lo/bfq$e;

    invoke-direct {v3, p1, v2, p3, p4}, Lo/bfq$e;-><init>(ILo/bfk;ILjava/util/List;)V

    .line 94
    iget-object v0, p0, Lo/bfq;->a:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    return-object v3
.end method

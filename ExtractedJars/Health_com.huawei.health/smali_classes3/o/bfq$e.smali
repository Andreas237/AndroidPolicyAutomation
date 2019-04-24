.class public Lo/bfq$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bfq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public a:I

.field protected b:I

.field public c:Lo/bfk;

.field protected d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bfh;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILo/bfk;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bfk;ILjava/util/List<+Lo/bfh;>;)V"
        }
    .end annotation

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    const/4 v0, 0x0

    iput v0, p0, Lo/bfq$e;->b:I

    .line 186
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bfq$e;->d:Ljava/util/List;

    .line 195
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bfq$e;->c(ILo/bfk;ILjava/util/List;)V

    .line 196
    return-void
.end method

.method private c(ILo/bfk;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILo/bfk;ILjava/util/List<+Lo/bfh;>;)V"
        }
    .end annotation

    .line 200
    iput-object p2, p0, Lo/bfq$e;->c:Lo/bfk;

    .line 201
    iput p3, p0, Lo/bfq$e;->a:I

    .line 202
    if-eqz p4, :cond_0

    .line 204
    iget-object v0, p0, Lo/bfq$e;->d:Ljava/util/List;

    invoke-interface {v0, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 206
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/bfq$e;->b:I

    .line 207
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 236
    iget-object v0, p0, Lo/bfq$e;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public b(I)Lo/bfh;
    .locals 3

    .line 225
    const/4 v2, 0x0

    .line 226
    iget v0, p0, Lo/bfq$e;->b:I

    add-int/2addr v0, p1

    iget-object v1, p0, Lo/bfq$e;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 228
    iget-object v0, p0, Lo/bfq$e;->d:Ljava/util/List;

    iget v1, p0, Lo/bfq$e;->b:I

    add-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bfh;

    .line 231
    :cond_0
    return-object v2
.end method

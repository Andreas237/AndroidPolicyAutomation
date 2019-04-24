.class Lo/eih$o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "o"
.end annotation


# instance fields
.field final synthetic a:Lo/eih;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eih<TT;>.k;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lo/eih;)V
    .locals 1

    .line 1302
    iput-object p1, p0, Lo/eih$o;->a:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1303
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eih$o;->c:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lo/eih;Lo/eih$4;)V
    .locals 0

    .line 1302
    invoke-direct {p0, p1}, Lo/eih$o;-><init>(Lo/eih;)V

    return-void
.end method


# virtual methods
.method public b(Lo/eih$k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;)V"
        }
    .end annotation

    .line 1306
    iget-object v0, p0, Lo/eih$o;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1307
    iget-object v0, p0, Lo/eih$o;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1311
    :cond_0
    return-void
.end method

.method public d(Lo/eih$k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/eih<TT;>.k;)V"
        }
    .end annotation

    .line 1314
    iget-object v0, p0, Lo/eih$o;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1317
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1320
    iget-object v0, p0, Lo/eih$o;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1321
    const/4 v0, 0x1

    return v0

    .line 1323
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

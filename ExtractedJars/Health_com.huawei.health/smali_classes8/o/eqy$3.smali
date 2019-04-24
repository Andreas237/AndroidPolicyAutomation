.class Lo/eqy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/etc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eqy;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/etc<Ljava/util/List<Lo/fil;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/eqy;


# direct methods
.method constructor <init>(Lo/eqy;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/eqy$3;->a:Lo/eqy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 1

    .line 78
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/eqy$3;->b(Ljava/util/List;)V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fil;>;)V"
        }
    .end annotation

    .line 81
    if-eqz p1, :cond_0

    .line 82
    iget-object v0, p0, Lo/eqy$3;->a:Lo/eqy;

    invoke-static {v0}, Lo/eqy;->d(Lo/eqy;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 83
    iget-object v0, p0, Lo/eqy$3;->a:Lo/eqy;

    invoke-static {v0}, Lo/eqy;->d(Lo/eqy;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 84
    iget-object v0, p0, Lo/eqy$3;->a:Lo/eqy;

    invoke-static {v0}, Lo/eqy;->c(Lo/eqy;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lo/eqy$3;->a:Lo/eqy;

    invoke-static {v0}, Lo/eqy;->c(Lo/eqy;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 88
    :goto_0
    return-void
.end method

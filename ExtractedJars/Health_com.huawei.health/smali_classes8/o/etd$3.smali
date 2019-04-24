.class Lo/etd$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/etc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etd;->e(Z)V
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
.field final synthetic d:Lo/etd;


# direct methods
.method constructor <init>(Lo/etd;)V
    .locals 0

    .line 381
    iput-object p1, p0, Lo/etd$3;->d:Lo/etd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 1

    .line 381
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/etd$3;->b(Ljava/util/List;)V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/fil;>;)V"
        }
    .end annotation

    .line 384
    if-eqz p1, :cond_0

    .line 385
    iget-object v0, p0, Lo/etd$3;->d:Lo/etd;

    invoke-static {v0}, Lo/etd;->b(Lo/etd;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 386
    iget-object v0, p0, Lo/etd$3;->d:Lo/etd;

    invoke-static {v0}, Lo/etd;->b(Lo/etd;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 387
    iget-object v0, p0, Lo/etd$3;->d:Lo/etd;

    invoke-static {v0}, Lo/etd;->c(Lo/etd;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x6b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 389
    :cond_0
    iget-object v0, p0, Lo/etd$3;->d:Lo/etd;

    invoke-static {v0}, Lo/etd;->c(Lo/etd;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x6b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 391
    :goto_0
    return-void
.end method

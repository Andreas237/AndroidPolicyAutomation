.class public Lo/fgr;
.super Lo/fgt;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/fgt<Lo/fgw;>;"
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;


# virtual methods
.method public a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 37
    if-nez p2, :cond_0

    .line 38
    new-instance p2, Lo/fgz;

    iget-object v0, p0, Lo/fgr;->b:Landroid/content/Context;

    invoke-direct {p2, v0}, Lo/fgz;-><init>(Landroid/content/Context;)V

    .line 40
    :cond_0
    move-object v1, p2

    check-cast v1, Lo/fgz;

    .line 41
    iget-object v0, p0, Lo/fgr;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 42
    iget-object v0, p0, Lo/fgr;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fgw;

    invoke-virtual {v0}, Lo/fgw;->b()I

    move-result v0

    invoke-virtual {v1, v0}, Lo/fgz;->setImage(I)V

    .line 43
    iget-object v0, p0, Lo/fgr;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fgw;

    invoke-virtual {v0}, Lo/fgw;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/fgz;->setText(Ljava/lang/CharSequence;)V

    .line 45
    :cond_1
    return-object p2
.end method

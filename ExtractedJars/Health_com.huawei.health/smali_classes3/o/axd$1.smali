.class Lo/axd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd;->d(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/axd;


# direct methods
.method constructor <init>(Lo/axd;I)V
    .locals 0

    .line 275
    iput-object p1, p0, Lo/axd$1;->b:Lo/axd;

    iput p2, p0, Lo/axd$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;>;)V"
        }
    .end annotation

    .line 279
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 280
    if-nez v2, :cond_0

    .line 282
    return-void

    .line 285
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 287
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 288
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    .line 290
    const/4 v0, 0x3

    if-lt v5, v0, :cond_1

    .line 292
    goto :goto_1

    .line 294
    :cond_1
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 297
    :cond_2
    :goto_1
    iget-object v0, p0, Lo/axd$1;->b:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    if-eqz v0, :cond_3

    .line 299
    iget-object v0, p0, Lo/axd$1;->b:Lo/axd;

    invoke-static {v0, v4}, Lo/axd;->c(Lo/axd;Ljava/util/List;)Ljava/lang/String;

    move-result-object v5

    .line 300
    iget-object v0, p0, Lo/axd$1;->b:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    iget v1, p0, Lo/axd$1;->a:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 301
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 302
    const-string v0, "bundleKeyNotifyNoteList"

    invoke-virtual {v7, v0, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 303
    const-string v0, "bundle_sensitive_tip"

    invoke-virtual {v7, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    invoke-virtual {v6, v7}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 305
    iget-object v0, p0, Lo/axd$1;->b:Lo/axd;

    iget-object v0, v0, Lo/axd;->d:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 307
    :cond_3
    return-void
.end method

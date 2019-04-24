.class final Lo/bjc$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bjc;->d(Landroid/os/Handler;)Lo/brc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/bjc$3;->c:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/search/SNSSearchBean;>;>;)V"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lo/bjc$3;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 95
    const/4 v0, 0x3

    iput v0, v1, Landroid/os/Message;->what:I

    .line 96
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 97
    if-eqz v2, :cond_0

    .line 99
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 100
    const-string v0, "keySearchGroupMemberMatchList"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 101
    invoke-virtual {v1, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 103
    :cond_0
    iget-object v0, p0, Lo/bjc$3;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 104
    return-void
.end method

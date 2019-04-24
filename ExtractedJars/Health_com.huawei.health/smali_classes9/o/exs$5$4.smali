.class Lo/exs$5$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exs$5;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/exs$5;


# direct methods
.method constructor <init>(Lo/exs$5;)V
    .locals 0

    .line 376
    iput-object p1, p0, Lo/exs$5$4;->d:Lo/exs$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 379
    iget-object v0, p0, Lo/exs$5$4;->d:Lo/exs$5;

    iget-object v0, v0, Lo/exs$5;->b:Lo/exs;

    iget-object v1, p0, Lo/exs$5$4;->d:Lo/exs$5;

    iget-object v1, v1, Lo/exs$5;->b:Lo/exs;

    invoke-static {v1}, Lo/exs;->d(Lo/exs;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0, v1}, Lo/exs;->c(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 380
    return-void
.end method

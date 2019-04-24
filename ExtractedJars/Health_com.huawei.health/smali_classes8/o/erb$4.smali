.class Lo/erb$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/erb;->b(Lo/erb$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/erb;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/erb;I)V
    .locals 0

    .line 73
    iput-object p1, p0, Lo/erb$4;->c:Lo/erb;

    iput p2, p0, Lo/erb$4;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 76
    iget-object v0, p0, Lo/erb$4;->c:Lo/erb;

    invoke-static {v0}, Lo/erb;->b(Lo/erb;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, p0, Lo/erb$4;->e:I

    iget-object v1, p0, Lo/erb$4;->c:Lo/erb;

    invoke-static {v1}, Lo/erb;->b(Lo/erb;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lo/erb$4;->c:Lo/erb;

    invoke-static {v0}, Lo/erb;->b(Lo/erb;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/erb$4;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lo/erb$4;->c:Lo/erb;

    invoke-static {v0}, Lo/erb;->b(Lo/erb;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/erb$4;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v3

    .line 78
    iget-object v0, p0, Lo/erb$4;->c:Lo/erb;

    iget-object v1, p0, Lo/erb$4;->c:Lo/erb;

    invoke-static {v1}, Lo/erb;->b(Lo/erb;)Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lo/erb$4;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-static {v0, v1}, Lo/erb;->c(Lo/erb;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 79
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/erb$4;->c:Lo/erb;

    invoke-static {v0}, Lo/erb;->a(Lo/erb;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cze;->c(Landroid/content/Context;)Lo/cze;

    move-result-object v0

    const-string v1, "messageCenterUrl"

    new-instance v2, Lo/erb$4$2;

    invoke-direct {v2, p0, v3}, Lo/erb$4$2;-><init>(Lo/erb$4;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lo/cze;->d(Ljava/lang/String;Lo/cza;)V

    .line 97
    :cond_0
    return-void
.end method

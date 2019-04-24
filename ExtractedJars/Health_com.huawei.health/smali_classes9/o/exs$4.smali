.class Lo/exs$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exs;->a(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/exs;


# direct methods
.method constructor <init>(Lo/exs;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lo/exs$4;->d:Lo/exs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 172
    iget-object v0, p0, Lo/exs$4;->d:Lo/exs;

    invoke-static {v0}, Lo/exs;->e(Lo/exs;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    const-string v1, "IC10"

    .line 173
    invoke-virtual {v0, v1}, Lo/eaa;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 175
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 176
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 177
    goto :goto_0

    .line 179
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getDetailUri()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 180
    iget-object v0, p0, Lo/exs$4;->d:Lo/exs;

    invoke-static {v0}, Lo/exs;->d(Lo/exs;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    :cond_1
    goto :goto_0

    .line 183
    :cond_2
    const-string v0, "SCUI_FitnessStepDetailInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initStepDetailWalkInfo infoMessageList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/exs$4;->d:Lo/exs;

    invoke-static {v2}, Lo/exs;->d(Lo/exs;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    iget-object v0, p0, Lo/exs$4;->d:Lo/exs;

    invoke-static {v0}, Lo/exs;->b(Lo/exs;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x271a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 185
    return-void
.end method

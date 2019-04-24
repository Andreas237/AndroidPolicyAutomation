.class Lo/dwo$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dwo;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dwo;


# direct methods
.method constructor <init>(Lo/dwo;)V
    .locals 0

    .line 777
    iput-object p1, p0, Lo/dwo$2;->e:Lo/dwo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 779
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 780
    const-string v0, "taskId"

    const v1, 0x1dc162

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 781
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v4

    .line 782
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 783
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "kakas is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 784
    return-void

    .line 786
    :cond_0
    instance-of v0, v4, Lo/dvq;

    if-eqz v0, :cond_2

    .line 787
    move-object v5, v4

    check-cast v5, Lo/dvq;

    .line 788
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lo/dvq;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 789
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "dealWeChatTask finish"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 790
    iget-object v0, p0, Lo/dwo$2;->e:Lo/dwo;

    const v1, 0x1dc162

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/dwo;->d(Ljava/lang/String;I)V

    .line 791
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/dvq;->f(Ljava/lang/String;)V

    .line 792
    invoke-static {}, Lo/dwo;->h()Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dwr;->d(Lo/dvf;)Z

    .line 793
    iget-object v0, p0, Lo/dwo$2;->e:Lo/dwo;

    invoke-static {v0}, Lo/dwo;->e(Lo/dwo;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "wechatBindStatus"

    const-string v2, "true"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 795
    :cond_1
    iget-object v0, p0, Lo/dwo$2;->e:Lo/dwo;

    invoke-static {v0}, Lo/dwo;->e(Lo/dwo;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "wechatBindStatus"

    const-string v2, "true"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 796
    invoke-static {}, Lo/dwo;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Task finished"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 799
    :cond_2
    :goto_0
    return-void
.end method

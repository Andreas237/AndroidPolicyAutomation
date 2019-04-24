.class Lo/auj$3;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auj;->b(Ljava/util/List;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/auj;

.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/auj;Ljava/util/List;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V
    .locals 0

    .line 216
    iput-object p1, p0, Lo/auj$3;->a:Lo/auj;

    iput-object p2, p0, Lo/auj$3;->e:Ljava/util/List;

    iput-object p3, p0, Lo/auj$3;->d:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iput-boolean p4, p0, Lo/auj$3;->c:Z

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 216
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/auj$3;->e([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected varargs e([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 1

    .line 220
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected e(Ljava/lang/Boolean;)V
    .locals 5

    .line 225
    iget-object v0, p0, Lo/auj$3;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aud;

    .line 227
    iget-object v0, p0, Lo/auj$3;->a:Lo/auj;

    iget-object v1, p0, Lo/auj$3;->d:Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    iget-boolean v2, p0, Lo/auj$3;->c:Z

    invoke-static {v0, v4, v1, v2}, Lo/auj;->a(Lo/auj;Lo/aud;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Z)V

    .line 228
    goto :goto_0

    .line 229
    :cond_0
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 216
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lo/auj$3;->e(Ljava/lang/Boolean;)V

    return-void
.end method

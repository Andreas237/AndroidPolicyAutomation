.class Lo/bdr$5;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bdr;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/bdr;


# direct methods
.method constructor <init>(Lo/bdr;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lo/bdr$5;->d:Lo/bdr;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 291
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bdr$5;->e([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs e([Ljava/lang/Void;)Ljava/lang/String;
    .locals 5

    .line 295
    new-instance v0, Lo/bdv;

    invoke-direct {v0}, Lo/bdv;-><init>()V

    iget-object v1, p0, Lo/bdr$5;->d:Lo/bdr;

    invoke-static {v1}, Lo/bdr;->a(Lo/bdr;)Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bdr$5;->d:Lo/bdr;

    invoke-static {v2}, Lo/bdr;->d(Lo/bdr;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lo/bdr$5;->d:Lo/bdr;

    invoke-static {v3}, Lo/bdr;->d(Lo/bdr;)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bdv;->e(Landroid/content/Context;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected e(Ljava/lang/String;)V
    .locals 2

    .line 300
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 302
    iget-object v0, p0, Lo/bdr$5;->d:Lo/bdr;

    invoke-static {v0}, Lo/bdr;->a(Lo/bdr;)Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 304
    :cond_0
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 291
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/bdr$5;->e(Ljava/lang/String;)V

    return-void
.end method

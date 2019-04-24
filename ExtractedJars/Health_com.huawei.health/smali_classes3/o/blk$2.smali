.class Lo/blk$2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/blk;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Object;Ljava/lang/Void;Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/blk;


# direct methods
.method constructor <init>(Lo/blk;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/blk$2;->b:Lo/blk;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected b(Ljava/lang/String;)V
    .locals 7

    .line 124
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lo/blk$2;->b:Lo/blk;

    iget-object v1, p0, Lo/blk$2;->b:Lo/blk;

    iget-object v1, v1, Lo/blk;->e:Landroid/app/Activity;

    iget-object v2, p0, Lo/blk$2;->b:Lo/blk;

    iget-object v3, p0, Lo/blk$2;->b:Lo/blk;

    invoke-static {v3}, Lo/blk;->c(Lo/blk;)Lo/aws;

    move-result-object v3

    iget-object v4, p0, Lo/blk$2;->b:Lo/blk;

    invoke-static {v4}, Lo/blk;->a(Lo/blk;)Ljava/lang/String;

    move-result-object v5

    move-object v6, p1

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lo/awm;->b(Landroid/content/Context;Lo/awm$d;Lo/aws;Lo/bfh;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog;

    move-result-object v1

    iput-object v1, v0, Lo/blk;->i:Landroid/app/AlertDialog;

    .line 126
    return-void
.end method

.method protected c([Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lo/blk$2;->b:Lo/blk;

    iget-object v0, v0, Lo/blk;->e:Landroid/app/Activity;

    invoke-static {v0}, Lo/awm;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 114
    invoke-virtual {p0, p1}, Lo/blk$2;->c([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 114
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/blk$2;->b(Ljava/lang/String;)V

    return-void
.end method

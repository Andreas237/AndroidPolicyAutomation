.class final Lo/bbo$2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bbo;->b(Lo/bbf;Lo/bbp;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/bbf;

.field final synthetic c:Lo/bbp;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/bbf;Lo/bbp;Landroid/content/Context;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/bbo$2;->b:Lo/bbf;

    iput-object p2, p0, Lo/bbo$2;->c:Lo/bbp;

    iput-object p3, p0, Lo/bbo$2;->e:Landroid/content/Context;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    .line 192
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lo/bbo$2;->b:Lo/bbf;

    invoke-virtual {v1}, Lo/bbf;->c()J

    move-result-wide v1

    iget-object v3, p0, Lo/bbo$2;->b:Lo/bbf;

    invoke-virtual {v3}, Lo/bbf;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->a(JLjava/lang/String;)Z

    .line 194
    const-string v0, "ImageWorkerHelper"

    const-string v1, "clearOldImage. doInBackground"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    iget-object v0, p0, Lo/bbo$2;->b:Lo/bbf;

    iget-object v1, p0, Lo/bbo$2;->c:Lo/bbp;

    invoke-static {v0, v1}, Lo/bbo;->c(Lo/bbf;Lo/bbp;)V

    .line 197
    const/4 v0, 0x0

    return-object v0
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 2

    .line 203
    iget-object v0, p0, Lo/bbo$2;->b:Lo/bbf;

    iget-object v1, p0, Lo/bbo$2;->e:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/bbs;->b(Lo/bbf;Landroid/content/Context;)V

    .line 204
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 188
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bbo$2;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 188
    move-object v0, p1

    check-cast v0, Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bbo$2;->a(Ljava/lang/Void;)V

    return-void
.end method

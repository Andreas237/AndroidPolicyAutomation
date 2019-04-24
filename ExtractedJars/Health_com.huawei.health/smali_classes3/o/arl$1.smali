.class Lo/arl$1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arl;->e(Landroid/net/Uri;Lo/arl$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Integer;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/arl$d;

.field final synthetic b:Landroid/net/Uri;

.field final synthetic d:Lo/arl;


# direct methods
.method constructor <init>(Lo/arl;Landroid/net/Uri;Lo/arl$d;)V
    .locals 0

    .line 276
    iput-object p1, p0, Lo/arl$1;->d:Lo/arl;

    iput-object p2, p0, Lo/arl$1;->b:Landroid/net/Uri;

    iput-object p3, p0, Lo/arl$1;->a:Lo/arl$d;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs b([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 2

    .line 280
    iget-object v0, p0, Lo/arl$1;->d:Lo/arl;

    iget-object v1, p0, Lo/arl$1;->b:Landroid/net/Uri;

    invoke-static {v0, v1}, Lo/arl;->b(Lo/arl;Landroid/net/Uri;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/lang/Integer;)V
    .locals 2

    .line 285
    iget-object v0, p0, Lo/arl$1;->a:Lo/arl$d;

    if-eqz v0, :cond_0

    .line 287
    iget-object v0, p0, Lo/arl$1;->a:Lo/arl$d;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lo/arl$d;->c(I)V

    .line 289
    :cond_0
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 276
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/arl$1;->b([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 276
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p0, v0}, Lo/arl$1;->b(Ljava/lang/Integer;)V

    return-void
.end method

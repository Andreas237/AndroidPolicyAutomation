.class public Lo/bje;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field private c:Lo/bjb;


# direct methods
.method public constructor <init>(Lo/bjb;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 24
    iput-object p1, p0, Lo/bje;->c:Lo/bjb;

    .line 25
    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/bje;->c:Lo/bjb;

    if-eqz v0, :cond_0

    .line 32
    iget-object v0, p0, Lo/bje;->c:Lo/bjb;

    invoke-interface {v0}, Lo/bjb;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 34
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 40
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 41
    iget-object v0, p0, Lo/bje;->c:Lo/bjb;

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lo/bje;->c:Lo/bjb;

    invoke-interface {v0, p1}, Lo/bjb;->b(Ljava/lang/Object;)V

    .line 45
    :cond_0
    return-void
.end method

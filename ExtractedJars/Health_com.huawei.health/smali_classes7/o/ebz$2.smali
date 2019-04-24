.class Lo/ebz$2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebz;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Ljava/lang/Object;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/ebz;


# direct methods
.method constructor <init>(Lo/ebz;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lo/ebz$2;->d:Lo/ebz;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs d([Ljava/lang/Void;)Ljava/lang/Object;
    .locals 1

    .line 63
    iget-object v0, p0, Lo/ebz$2;->d:Lo/ebz;

    invoke-static {v0}, Lo/ebz;->d(Lo/ebz;)V

    .line 64
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 57
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/ebz$2;->d([Ljava/lang/Void;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 70
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .line 59
    return-void
.end method

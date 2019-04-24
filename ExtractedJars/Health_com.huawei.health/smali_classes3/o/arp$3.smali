.class Lo/arp$3;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arp;->c(Lo/arp$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Landroid/graphics/Bitmap;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/arp$c;

.field final synthetic c:Lo/arp;


# direct methods
.method constructor <init>(Lo/arp;Lo/arp$c;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lo/arp$3;->c:Lo/arp;

    iput-object p2, p0, Lo/arp$3;->a:Lo/arp$c;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 1

    .line 120
    iget-object v0, p0, Lo/arp$3;->c:Lo/arp;

    invoke-static {v0}, Lo/arp;->e(Lo/arp;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 116
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/arp$3;->a([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected e(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 125
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/arp$3;->a:Lo/arp$c;

    if-eqz v0, :cond_0

    .line 128
    invoke-static {}, Lo/aps;->a()Lo/aps;

    move-result-object v0

    invoke-virtual {v0}, Lo/aps;->e()V

    .line 129
    iget-object v0, p0, Lo/arp$3;->a:Lo/arp$c;

    iget-object v1, p0, Lo/arp$3;->c:Lo/arp;

    invoke-static {v1}, Lo/arp;->d(Lo/arp;)I

    move-result v1

    invoke-interface {v0, p1, v1}, Lo/arp$c;->a(Landroid/graphics/Bitmap;I)V

    .line 131
    :cond_0
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 116
    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lo/arp$3;->e(Landroid/graphics/Bitmap;)V

    return-void
.end method

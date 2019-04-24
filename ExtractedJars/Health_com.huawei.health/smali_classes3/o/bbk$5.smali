.class final Lo/bbk$5;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bbk;->d(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 264
    iput-wide p1, p0, Lo/bbk$5;->d:J

    iput-object p3, p0, Lo/bbk$5;->e:Ljava/lang/String;

    iput-object p4, p0, Lo/bbk$5;->b:Ljava/lang/String;

    iput-object p5, p0, Lo/bbk$5;->a:Ljava/lang/String;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    .line 268
    iget-wide v0, p0, Lo/bbk$5;->d:J

    iget-object v2, p0, Lo/bbk$5;->e:Ljava/lang/String;

    iget-object v3, p0, Lo/bbk$5;->b:Ljava/lang/String;

    iget-object v4, p0, Lo/bbk$5;->a:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lo/bbk;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 269
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 264
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bbk$5;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected e(Ljava/lang/Void;)V
    .locals 0

    .line 274
    return-void
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 264
    move-object v0, p1

    check-cast v0, Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bbk$5;->e(Ljava/lang/Void;)V

    return-void
.end method

.class Lo/bjx$c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bjx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Landroid/graphics/Bitmap;>;"
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 60
    iput-object p1, p0, Lo/bjx$c;->b:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lo/bjx$c;->d:Landroid/widget/ImageView;

    .line 62
    iput-object p3, p0, Lo/bjx$c;->c:Ljava/lang/String;

    .line 63
    return-void
.end method


# virtual methods
.method protected b(Landroid/graphics/Bitmap;)V
    .locals 2

    .line 118
    iget-object v0, p0, Lo/bjx$c;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 120
    if-eqz p1, :cond_0

    .line 122
    iget-object v0, p0, Lo/bjx$c;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 126
    :cond_0
    iget-object v0, p0, Lo/bjx$c;->d:Landroid/widget/ImageView;

    invoke-static {}, Lo/bjx;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 129
    :cond_1
    :goto_0
    return-void
.end method

.method protected varargs d([Ljava/lang/Void;)Landroid/graphics/Bitmap;
    .locals 8

    .line 68
    const/4 v4, 0x0

    .line 71
    iget-object v5, p0, Lo/bjx$c;->c:Ljava/lang/String;

    .line 72
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lo/bjx$c;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/bjx;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 77
    :cond_0
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 78
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 81
    iget-object v0, p0, Lo/bjx$c;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/bjx;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 82
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 85
    const-string v0, "AccountImage"

    const-string v1, "not exist local headPic"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 91
    :cond_1
    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0x400000

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 93
    const-string v0, "AccountImage"

    const-string v1, "pic file size is more than BITMAP_MAXSIZE_4M err"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const/4 v0, 0x0

    return-object v0

    .line 99
    :cond_2
    :try_start_0
    invoke-static {v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 101
    if-eqz v7, :cond_3

    .line 103
    invoke-static {v7}, Lo/boe;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 110
    :cond_3
    goto :goto_0

    .line 106
    :catch_0
    move-exception v7

    .line 108
    const-string v0, "AccountImage"

    const-string v1, "getLocalBitmap fail,"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const/4 v0, 0x0

    return-object v0

    .line 111
    :goto_0
    return-object v4
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 50
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bjx$c;->d([Ljava/lang/Void;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 50
    move-object v0, p1

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lo/bjx$c;->b(Landroid/graphics/Bitmap;)V

    return-void
.end method

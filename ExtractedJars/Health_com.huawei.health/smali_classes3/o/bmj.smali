.class public final Lo/bmj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bmj$e;
    }
.end annotation


# static fields
.field private static d:Lo/bmj;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bmj$e;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Lo/bmj;

    invoke-direct {v0}, Lo/bmj;-><init>()V

    sput-object v0, Lo/bmj;->d:Lo/bmj;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bmj;->a:Ljava/util/List;

    .line 37
    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 6

    .line 120
    if-nez p1, :cond_0

    .line 122
    const/4 v0, 0x0

    return-object v0

    .line 125
    :cond_0
    const/4 v2, 0x0

    .line 127
    const/4 v3, 0x0

    .line 130
    :try_start_0
    invoke-static {p1}, Lo/bpy;->c(Ljava/lang/String;)Lo/bqg;

    move-result-object v0

    move-object v3, v0

    .line 132
    invoke-virtual {v3}, Lo/bqg;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 134
    invoke-virtual {v3}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-virtual {v0}, Lo/bqi;->b()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    .line 144
    :cond_1
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 145
    goto :goto_0

    .line 138
    :catch_0
    move-exception v4

    .line 140
    const-string v0, "ShareWebViewManager"

    const-string v1, "getBitmapFromUrl error,IOException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 144
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 145
    goto :goto_0

    .line 144
    :catchall_0
    move-exception v5

    invoke-static {v3}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 145
    throw v5

    .line 147
    :goto_0
    if-eqz v2, :cond_2

    .line 149
    invoke-static {p1, v2}, Lo/bay;->e(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 152
    :cond_2
    return-object v2
.end method

.method public static a()Lo/bmj;
    .locals 1

    .line 41
    sget-object v0, Lo/bmj;->d:Lo/bmj;

    return-object v0
.end method

.method static synthetic c(Lo/bmj;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Lo/bmj;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 163
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-nez v0, :cond_0

    .line 165
    const/4 v0, 0x0

    return-object v0

    .line 167
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/bmj;)Ljava/util/List;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bmj;->a:Ljava/util/List;

    return-object v0
.end method

.method private e(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    .line 104
    invoke-static {p1}, Lo/bay;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 105
    if-eqz v2, :cond_0

    .line 107
    const-string v0, "ShareWebViewManager"

    const-string v1, "getBitmap use bitmapFromMemCache"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-direct {p0, v2}, Lo/bmj;->d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 111
    :cond_0
    invoke-direct {p0, p1}, Lo/bmj;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 112
    return-object v3
.end method


# virtual methods
.method public b(Lo/bmj$e;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lo/bmj;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 52
    return-void
.end method

.method public d(Lo/bmj$e;)V
    .locals 1

    .line 56
    iget-object v0, p0, Lo/bmj;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 57
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 72
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bmj$1;

    invoke-direct {v1, p0, p1, p2}, Lo/bmj$1;-><init>(Lo/bmj;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 94
    return-void
.end method

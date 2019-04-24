.class public Lo/bbj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bbj$e;
    }
.end annotation


# instance fields
.field private b:Lo/bbj$e;

.field private e:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<Ljava/lang/String;Landroid/graphics/drawable/Drawable;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Lo/bbj$e;

    const-string v1, "Default Cache"

    invoke-direct {v0, v1}, Lo/bbj$e;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lo/bbj;->b(Lo/bbj$e;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Lo/bbj$e;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-direct {p0, p1}, Lo/bbj;->b(Lo/bbj$e;)V

    .line 30
    return-void
.end method

.method private static a(Lo/bbj$e;)Landroid/support/v4/util/LruCache;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bbj$e;)Landroid/support/v4/util/LruCache<Ljava/lang/String;Landroid/graphics/drawable/Drawable;>;"
        }
    .end annotation

    .line 64
    new-instance v0, Lo/bbj$4;

    iget v1, p0, Lo/bbj$e;->d:I

    invoke-direct {v0, v1}, Lo/bbj$4;-><init>(I)V

    return-object v0
.end method

.method private b(Lo/bbj$e;)V
    .locals 1

    .line 47
    iput-object p1, p0, Lo/bbj;->b:Lo/bbj$e;

    .line 50
    iget-object v0, p0, Lo/bbj;->b:Lo/bbj$e;

    iget-boolean v0, v0, Lo/bbj$e;->c:Z

    if-eqz v0, :cond_0

    .line 52
    invoke-static {p1}, Lo/bbj;->a(Lo/bbj$e;)Landroid/support/v4/util/LruCache;

    move-result-object v0

    iput-object v0, p0, Lo/bbj;->e:Landroid/support/v4/util/LruCache;

    .line 54
    :cond_0
    return-void
.end method

.method public static c(Landroid/graphics/drawable/Drawable;)I
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xc
    .end annotation

    .line 154
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_1

    .line 156
    move-object v0, p0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 158
    invoke-static {}, Lo/brg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v0

    return v0

    .line 163
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    return v0

    .line 167
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    mul-int/2addr v0, v1

    return v0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 179
    invoke-static {p0}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 180
    if-nez v2, :cond_0

    .line 182
    const/4 v0, 0x0

    return-object v0

    .line 184
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 193
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 195
    const/4 v0, 0x0

    return-object v0

    .line 197
    :cond_0
    invoke-static {p0}, Lo/bop;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 91
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    return-void

    .line 97
    :cond_0
    iget-object v0, p0, Lo/bbj;->e:Landroid/support/v4/util/LruCache;

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lo/bbj;->e:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    :cond_1
    return-void
.end method

.method public b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 111
    const/4 v1, 0x0

    .line 113
    iget-object v0, p0, Lo/bbj;->e:Landroid/support/v4/util/LruCache;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lo/bbj;->e:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 118
    :cond_0
    return-object v1
.end method

.method public e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 76
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_1

    .line 78
    :cond_0
    return-void

    .line 82
    :cond_1
    iget-object v0, p0, Lo/bbj;->e:Landroid/support/v4/util/LruCache;

    if-eqz v0, :cond_2

    .line 84
    iget-object v0, p0, Lo/bbj;->e:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    :cond_2
    return-void
.end method

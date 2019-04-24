.class public final Lo/bbe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/bbe;


# instance fields
.field private a:Lo/bbj$e;

.field private c:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<Ljava/lang/Integer;Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private e:Lo/bbj;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Lo/bbj$e;

    const-string v1, "SNS Cache"

    invoke-direct {v0, v1}, Lo/bbj$e;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/bbe;->a:Lo/bbj$e;

    .line 58
    iget-object v0, p0, Lo/bbe;->a:Lo/bbj$e;

    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v1

    invoke-virtual {v1}, Lo/bcm;->d()F

    move-result v1

    invoke-virtual {v0, v1}, Lo/bbj$e;->a(F)V

    .line 59
    new-instance v0, Lo/bbj;

    iget-object v1, p0, Lo/bbe;->a:Lo/bbj$e;

    invoke-direct {v0, v1}, Lo/bbj;-><init>(Lo/bbj$e;)V

    iput-object v0, p0, Lo/bbe;->e:Lo/bbj;

    .line 60
    new-instance v0, Landroid/support/v4/util/LruCache;

    const/16 v1, 0x200

    invoke-direct {v0, v1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lo/bbe;->c:Landroid/support/v4/util/LruCache;

    .line 61
    return-void
.end method

.method private a(I)Landroid/graphics/Bitmap;
    .locals 3

    .line 158
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 159
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 160
    return-object v2
.end method

.method private b(ILandroid/graphics/Bitmap;)V
    .locals 2

    .line 126
    if-nez p2, :cond_0

    .line 128
    return-void

    .line 130
    :cond_0
    iget-object v0, p0, Lo/bbe;->c:Landroid/support/v4/util/LruCache;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    return-void
.end method

.method public static declared-synchronized c()Lo/bbe;
    .locals 3

    const-class v1, Lo/bbe;

    monitor-enter v1

    .line 70
    :try_start_0
    sget-object v0, Lo/bbe;->d:Lo/bbe;

    if-nez v0, :cond_0

    .line 72
    new-instance v0, Lo/bbe;

    invoke-direct {v0}, Lo/bbe;-><init>()V

    sput-object v0, Lo/bbe;->d:Lo/bbe;

    .line 74
    :cond_0
    sget-object v0, Lo/bbe;->d:Lo/bbe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private d(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 172
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 173
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 174
    return-object v2
.end method


# virtual methods
.method public b(I)Landroid/graphics/Bitmap;
    .locals 2

    .line 96
    iget-object v0, p0, Lo/bbe;->c:Landroid/support/v4/util/LruCache;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public b()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 140
    iget-object v0, p0, Lo/bbe;->e:Lo/bbj;

    const-string v1, "chatDefaultKey"

    invoke-virtual {v0, v1}, Lo/bbj;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 141
    if-nez v2, :cond_0

    .line 143
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_picture_selected:I

    invoke-direct {p0, v0}, Lo/bbe;->d(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 144
    iget-object v0, p0, Lo/bbe;->e:Lo/bbj;

    const-string v1, "chatDefaultKey"

    invoke-virtual {v0, v1, v2}, Lo/bbj;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 147
    :cond_0
    return-object v2
.end method

.method public d()Lo/bbj;
    .locals 1

    .line 84
    iget-object v0, p0, Lo/bbe;->e:Lo/bbj;

    return-object v0
.end method

.method public e(I)Landroid/graphics/Bitmap;
    .locals 1

    .line 108
    invoke-virtual {p0, p1}, Lo/bbe;->b(I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 109
    if-nez v0, :cond_0

    .line 111
    invoke-direct {p0, p1}, Lo/bbe;->a(I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 112
    invoke-direct {p0, p1, v0}, Lo/bbe;->b(ILandroid/graphics/Bitmap;)V

    .line 114
    :cond_0
    return-object v0
.end method

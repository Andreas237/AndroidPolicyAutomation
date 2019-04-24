.class public Lo/bvu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bvz;
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bvu$d;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field protected b:Ljava/lang/String;

.field protected c:Z

.field protected d:Ljava/lang/String;

.field protected e:Landroid/media/MediaPlayer;

.field private f:Landroid/view/SurfaceView;

.field private g:Z

.field private h:I

.field protected i:I

.field private k:Landroid/content/Context;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/net/Uri;>;"
        }
    .end annotation
.end field

.field private n:Lo/bvu$d;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-string v0, "mediaHelper"

    iput-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvu;->g:Z

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvu;->c:Z

    .line 61
    const-string v0, "F"

    iput-object v0, p0, Lo/bvu;->d:Ljava/lang/String;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvu;->l:Ljava/util/List;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvu;->p:Ljava/util/List;

    .line 109
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    .line 110
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 111
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lo/bvu;->c:Z

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 112
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const-string v0, "mediaHelper"

    iput-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bvu;->g:Z

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bvu;->c:Z

    .line 61
    const-string v0, "F"

    iput-object v0, p0, Lo/bvu;->d:Ljava/lang/String;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvu;->l:Ljava/util/List;

    .line 91
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvu;->p:Ljava/util/List;

    .line 102
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/bvu;->k:Landroid/content/Context;

    .line 103
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    .line 104
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 105
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lo/bvu;->c:Z

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 106
    return-void
.end method

.method private a()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/SecurityException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 478
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 480
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 481
    iget-object v0, p0, Lo/bvu;->n:Lo/bvu$d;

    sget-object v1, Lo/bvu$d;->d:Lo/bvu$d;

    if-ne v0, v1, :cond_2

    .line 482
    const/4 v6, 0x0

    .line 484
    :try_start_0
    iget-object v0, p0, Lo/bvu;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    iget-object v1, p0, Lo/bvu;->o:Ljava/util/List;

    iget v2, p0, Lo/bvu;->i:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    move-object v6, v0

    .line 485
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 486
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 488
    if-eqz v6, :cond_1

    .line 489
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V

    goto :goto_0

    .line 488
    :catchall_0
    move-exception v7

    if-eqz v6, :cond_0

    .line 489
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 491
    :cond_0
    throw v7

    .line 492
    :cond_1
    :goto_0
    goto/16 :goto_1

    :cond_2
    iget-object v0, p0, Lo/bvu;->n:Lo/bvu$d;

    sget-object v1, Lo/bvu$d;->c:Lo/bvu$d;

    if-ne v0, v1, :cond_3

    .line 493
    iget-object v0, p0, Lo/bvu;->k:Landroid/content/Context;

    iget-object v1, p0, Lo/bvu;->p:Ljava/util/List;

    iget v2, p0, Lo/bvu;->i:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object v0

    iput-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    goto :goto_1

    .line 494
    :cond_3
    iget-object v0, p0, Lo/bvu;->n:Lo/bvu$d;

    sget-object v1, Lo/bvu$d;->b:Lo/bvu$d;

    if-ne v0, v1, :cond_4

    .line 495
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u64ad\u653e\u7684\u89c6\u9891\u8def\u5f84"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bvu;->o:Ljava/util/List;

    iget v3, p0, Lo/bvu;->i:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 496
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lo/bvu;->o:Ljava/util/List;

    iget v2, p0, Lo/bvu;->i:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 497
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    goto :goto_1

    .line 499
    :cond_4
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lo/bvu;->k:Landroid/content/Context;

    iget-object v2, p0, Lo/bvu;->l:Ljava/util/List;

    iget v3, p0, Lo/bvu;->i:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 500
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V

    .line 502
    :goto_1
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    iget-boolean v1, p0, Lo/bvu;->c:Z

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 503
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    goto :goto_2

    .line 505
    :cond_5
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    :goto_2
    return-void
.end method

.method private b()V
    .locals 5

    .line 333
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    iget-boolean v1, p0, Lo/bvu;->c:Z

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 335
    :try_start_0
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    goto :goto_0

    .line 338
    :catch_0
    move-exception v4

    .line 339
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "later player prepare()\u51c6\u5907error:="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    :goto_0
    return-void
.end method

.method private b(Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 709
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNumb_b99()---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    div-int/lit8 v1, p2, 0x64

    mul-int/lit8 v1, v1, 0x64

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bvu;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvu;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 712
    const/16 v0, 0x64

    if-le p2, v0, :cond_1

    .line 713
    const/16 v0, 0x78

    if-ge p2, v0, :cond_0

    .line 714
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lo/bvu;->e(Ljava/util/List;I)V

    .line 715
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have no media"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 725
    :cond_0
    rem-int/lit8 v0, p2, 0x64

    invoke-virtual {p0, p1, v0}, Lo/bvu;->d(Ljava/util/List;I)V

    .line 728
    :cond_1
    :goto_0
    return-void
.end method

.method private d(Landroid/view/View;II)V
    .locals 10

    .line 196
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 197
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getWidth()I

    move-result v5

    .line 198
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getHeight()I

    move-result v6

    .line 199
    if-lez v5, :cond_3

    if-lez v6, :cond_3

    .line 200
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 201
    iget-boolean v0, p0, Lo/bvu;->g:Z

    if-eqz v0, :cond_1

    .line 202
    int-to-float v0, p2

    int-to-float v1, p3

    div-float v8, v0, v1

    .line 203
    int-to-float v0, v5

    int-to-float v1, v6

    div-float v9, v0, v1

    .line 204
    cmpg-float v0, v8, v9

    if-gez v0, :cond_0

    .line 205
    iput v5, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 206
    int-to-float v0, v5

    div-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 207
    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    sub-int v0, v6, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    sub-int v1, v6, v1

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v2, v0, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0

    .line 209
    :cond_0
    iput v6, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 210
    int-to-float v0, v6

    mul-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 211
    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    sub-int v0, v5, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    sub-int v1, v5, v1

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v2, v1, v3}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 213
    :goto_0
    goto :goto_1

    .line 215
    :cond_1
    int-to-float v0, p2

    int-to-float v1, p3

    div-float v8, v0, v1

    .line 216
    int-to-float v0, v5

    int-to-float v1, v6

    div-float v9, v0, v1

    .line 217
    cmpl-float v0, v8, v9

    if-lez v0, :cond_2

    .line 218
    iput v5, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 219
    int-to-float v0, v5

    div-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 220
    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    sub-int v0, v6, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    sub-int v1, v6, v1

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v2, v0, v3, v1}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_1

    .line 222
    :cond_2
    iput v6, v7, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 223
    int-to-float v0, v6

    mul-float/2addr v0, v8

    float-to-int v0, v0

    iput v0, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 224
    iget v0, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    sub-int v0, v5, v0

    div-int/lit8 v0, v0, 0x2

    iget v1, v7, Landroid/widget/FrameLayout$LayoutParams;->width:I

    sub-int v1, v5, v1

    div-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v7, v0, v2, v1, v3}, Landroid/widget/FrameLayout$LayoutParams;->setMargins(IIII)V

    .line 228
    :goto_1
    invoke-virtual {p1, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    :cond_3
    return-void
.end method


# virtual methods
.method public a(Landroid/view/SurfaceHolder;)Lo/bvz;
    .locals 4
    .param p1    # Landroid/view/SurfaceHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 363
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 364
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V

    goto :goto_0

    .line 366
    :cond_0
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    :goto_0
    return-object p0
.end method

.method public a(I)V
    .locals 0

    .line 591
    iput p1, p0, Lo/bvu;->i:I

    .line 592
    return-void
.end method

.method public b(Landroid/view/Surface;)Lo/bvz;
    .locals 4
    .param p1    # Landroid/view/Surface;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 379
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 380
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    goto :goto_0

    .line 382
    :cond_0
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    :goto_0
    return-object p0
.end method

.method public varargs b([Ljava/lang/String;)Lo/bvz;
    .locals 5
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 282
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 283
    invoke-virtual {p0, p1}, Lo/bvu;->c([Ljava/lang/String;)Lo/bvz;

    move-result-object v0

    return-object v0

    .line 285
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/bvu;->i:I

    .line 287
    :try_start_0
    array-length v0, p1

    iput v0, p0, Lo/bvu;->h:I

    .line 288
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 289
    sget-object v0, Lo/bvu$d;->b:Lo/bvu$d;

    iput-object v0, p0, Lo/bvu;->n:Lo/bvu$d;

    .line 290
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 291
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 293
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 294
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u64ad\u653e\u7684\u89c6\u9891\u8def\u5f84"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bvu;->o:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lo/bvu;->o:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 296
    invoke-direct {p0}, Lo/bvu;->b()V

    goto :goto_0

    .line 298
    :cond_1
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 302
    :goto_0
    goto :goto_1

    .line 300
    :catch_0
    move-exception v4

    .line 301
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDataSource fail -- "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    :goto_1
    return-object p0
.end method

.method public c(Ljava/lang/String;)Lo/bvz;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 277
    iget-object v0, p0, Lo/bvu;->d:Ljava/lang/String;

    iget-object v1, p0, Lo/bvu;->b:Ljava/lang/String;

    const-string v2, ".mp3"

    invoke-static {p1, v0, v1, v2}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 278
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v3, v0, v1

    invoke-virtual {p0, v0}, Lo/bvu;->b([Ljava/lang/String;)Lo/bvz;

    move-result-object v0

    return-object v0
.end method

.method public varargs c([Ljava/lang/String;)Lo/bvz;
    .locals 8
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 153
    const/4 v0, 0x0

    iput v0, p0, Lo/bvu;->i:I

    .line 155
    :try_start_0
    array-length v0, p1

    iput v0, p0, Lo/bvu;->h:I

    .line 156
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 157
    sget-object v0, Lo/bvu$d;->d:Lo/bvu$d;

    iput-object v0, p0, Lo/bvu;->n:Lo/bvu$d;

    .line 158
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 159
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 161
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    const/4 v6, 0x0

    .line 164
    :try_start_1
    iget-object v0, p0, Lo/bvu;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    move-object v6, v0

    .line 165
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 166
    invoke-direct {p0}, Lo/bvu;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 168
    if-eqz v6, :cond_1

    .line 169
    :try_start_2
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V

    goto :goto_0

    .line 168
    :catchall_0
    move-exception v7

    if-eqz v6, :cond_0

    .line 169
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 171
    :cond_0
    throw v7

    .line 172
    :cond_1
    :goto_0
    goto :goto_1

    .line 173
    :cond_2
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    .line 177
    :goto_1
    goto :goto_2

    .line 175
    :catch_0
    move-exception v6

    .line 176
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    :goto_2
    return-object p0
.end method

.method public c(I)V
    .locals 1

    .line 605
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 606
    const-string v0, "F"

    iput-object v0, p0, Lo/bvu;->d:Ljava/lang/String;

    goto :goto_0

    .line 608
    :cond_0
    const-string v0, "M"

    iput-object v0, p0, Lo/bvu;->d:Ljava/lang/String;

    .line 610
    :goto_0
    return-void
.end method

.method public d()Lo/bvz;
    .locals 2

    .line 547
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 548
    const/4 v0, 0x0

    iput v0, p0, Lo/bvu;->i:I

    .line 549
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvu;->p:Ljava/util/List;

    .line 550
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    .line 551
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvu;->l:Ljava/util/List;

    .line 553
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 554
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    .line 556
    :cond_0
    return-object p0
.end method

.method public d(Landroid/view/SurfaceView;)Lo/bvz;
    .locals 0

    .line 372
    if-eqz p1, :cond_0

    .line 373
    iput-object p1, p0, Lo/bvu;->f:Landroid/view/SurfaceView;

    .line 375
    :cond_0
    return-object p0
.end method

.method public d(Ljava/util/List;)Lo/bvz;
    .locals 8
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Lo/bvz;"
        }
    .end annotation

    .line 248
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/bvu;->h:I

    .line 249
    const/4 v0, 0x0

    iput v0, p0, Lo/bvu;->i:I

    .line 250
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 252
    :try_start_0
    sget-object v0, Lo/bvu$d;->d:Lo/bvu$d;

    iput-object v0, p0, Lo/bvu;->n:Lo/bvu$d;

    .line 253
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 254
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 256
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    const/4 v6, 0x0

    .line 259
    :try_start_1
    iget-object v0, p0, Lo/bvu;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    move-object v6, v0

    .line 260
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    .line 261
    invoke-direct {p0}, Lo/bvu;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    if-eqz v6, :cond_1

    .line 264
    :try_start_2
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V

    goto :goto_0

    .line 263
    :catchall_0
    move-exception v7

    if-eqz v6, :cond_0

    .line 264
    invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V

    .line 266
    :cond_0
    throw v7
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    .line 269
    :cond_1
    :goto_0
    goto :goto_1

    .line 267
    :catch_0
    move-exception v6

    .line 268
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAudioAssetSources"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    goto :goto_1

    .line 271
    :cond_2
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    :goto_1
    return-object p0
.end method

.method public d(F)V
    .locals 2
    .param p1    # F
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 585
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 586
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1, p1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 588
    :cond_0
    return-void
.end method

.method public d(Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 691
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNumb_99()---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 692
    const/16 v0, 0x9

    if-le p2, v0, :cond_0

    const/16 v0, 0x64

    if-ge p2, v0, :cond_0

    .line 694
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "B0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    div-int/lit8 v1, p2, 0xa

    mul-int/lit8 v1, v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bvu;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvu;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 695
    rem-int/lit8 v0, p2, 0xa

    if-lez v0, :cond_0

    .line 697
    rem-int/lit8 v0, p2, 0xa

    invoke-virtual {p0, p1, v0}, Lo/bvu;->e(Ljava/util/List;I)V

    .line 700
    :cond_0
    return-void
.end method

.method public e(Ljava/util/List;)Lo/bvz;
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)Lo/bvz;"
        }
    .end annotation

    .line 307
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    invoke-virtual {p0, p1}, Lo/bvu;->d(Ljava/util/List;)Lo/bvz;

    move-result-object v0

    return-object v0

    .line 310
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lo/bvu;->i:I

    .line 312
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lo/bvu;->h:I

    .line 313
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 314
    sget-object v0, Lo/bvu$d;->b:Lo/bvu$d;

    iput-object v0, p0, Lo/bvu;->n:Lo/bvu$d;

    .line 315
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 316
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 318
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 319
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 320
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lo/bvu;->o:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 321
    invoke-direct {p0}, Lo/bvu;->b()V

    goto :goto_0

    .line 324
    :cond_1
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 328
    :cond_2
    :goto_0
    goto :goto_1

    .line 326
    :catch_0
    move-exception v4

    .line 327
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setSDSources(@NonNull List<String> fileName) "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    :goto_1
    return-object p0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lo/bvu;->b:Ljava/lang/String;

    .line 732
    return-void
.end method

.method public e(Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 668
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNumb_9()---"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    const/16 v0, 0xa

    if-ge p2, v0, :cond_0

    .line 671
    invoke-virtual {p0, p2}, Lo/bvu;->f(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 673
    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 188
    iput-boolean p1, p0, Lo/bvu;->g:Z

    .line 189
    return-void
.end method

.method public f(I)Ljava/lang/String;
    .locals 4

    .line 681
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "B00"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bvu;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvu;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Lo/bvz;
    .locals 2

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lo/bvu;->i:I

    .line 117
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 118
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 120
    :cond_0
    return-object p0
.end method

.method public k(I)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 645
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 646
    const/16 v0, 0x82

    if-le p1, v0, :cond_0

    .line 647
    invoke-direct {p0, v4, p1}, Lo/bvu;->b(Ljava/util/List;I)V

    goto :goto_1

    .line 649
    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v0, "B"

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 650
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    rsub-int/lit8 v6, v0, 0x3

    .line 651
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    .line 652
    const-string v0, "0"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 656
    :cond_1
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bvu;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/bvu;->b:Ljava/lang/String;

    const-string v3, ".mp3"

    invoke-static {v0, v1, v2, v3}, Lo/bsm;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 658
    :goto_1
    return-object v4
.end method

.method public k()Lo/bvz;
    .locals 2

    .line 397
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 398
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 400
    :cond_0
    return-object p0
.end method

.method public l()Lo/bvz;
    .locals 2

    .line 534
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 535
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 537
    :cond_0
    return-object p0
.end method

.method public m()Lo/bvz;
    .locals 2

    .line 405
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 406
    iget v0, p0, Lo/bvu;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/bvu;->i:I

    .line 407
    invoke-virtual {p0}, Lo/bvu;->n()Lo/bvz;

    .line 409
    :cond_0
    return-object p0
.end method

.method public n()Lo/bvz;
    .locals 5

    .line 436
    :try_start_0
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 437
    iget v0, p0, Lo/bvu;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bvu;->i:I

    .line 438
    iget v0, p0, Lo/bvu;->i:I

    iget v1, p0, Lo/bvu;->h:I

    if-lt v0, v1, :cond_0

    .line 439
    iget v0, p0, Lo/bvu;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/bvu;->i:I

    .line 440
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5df2\u7ecf\u662f\u6700\u540e\u4e00\u4e2a\u4e86"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 441
    return-object p0

    .line 443
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lo/bvu;->a()V

    goto :goto_0

    .line 446
    :cond_1
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 454
    :goto_0
    goto :goto_1

    .line 448
    :catch_0
    move-exception v4

    .line 453
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "next_error--"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    :goto_1
    return-object p0
.end method

.method public o()I
    .locals 1

    .line 564
    iget v0, p0, Lo/bvu;->i:I

    return v0
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 0

    .line 65
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    .line 66
    return-void
.end method

.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 1

    .line 70
    iget-object v0, p0, Lo/bvu;->f:Landroid/view/SurfaceView;

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Lo/bvu;->f:Landroid/view/SurfaceView;

    invoke-direct {p0, v0, p2, p3}, Lo/bvu;->d(Landroid/view/View;II)V

    .line 74
    :cond_0
    return-void
.end method

.method public p()Lo/bvz;
    .locals 5

    .line 415
    :try_start_0
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 416
    iget v0, p0, Lo/bvu;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/bvu;->i:I

    .line 417
    iget v0, p0, Lo/bvu;->i:I

    if-gez v0, :cond_0

    .line 418
    iget v0, p0, Lo/bvu;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bvu;->i:I

    .line 419
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u662f\u7b2c\u4e00\u4e2a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 420
    return-object p0

    .line 422
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lo/bvu;->a()V

    goto :goto_0

    .line 425
    :cond_1
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mPlayer == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 429
    :goto_0
    goto :goto_1

    .line 427
    :catch_0
    move-exception v4

    .line 428
    iget-object v0, p0, Lo/bvu;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    :goto_1
    return-object p0
.end method

.method public q()I
    .locals 1

    .line 625
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 626
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    return v0

    .line 628
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public r()V
    .locals 1

    .line 633
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 634
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    .line 636
    :cond_0
    return-void
.end method

.method public s()Ljava/lang/String;
    .locals 2

    .line 568
    iget-object v0, p0, Lo/bvu;->o:Ljava/util/List;

    iget v1, p0, Lo/bvu;->i:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public t()Z
    .locals 1

    .line 617
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 618
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    return v0

    .line 620
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public u()Landroid/media/MediaPlayer;
    .locals 1

    .line 613
    iget-object v0, p0, Lo/bvu;->e:Landroid/media/MediaPlayer;

    return-object v0
.end method

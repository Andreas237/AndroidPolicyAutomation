.class public Lcom/squareup/picasso/RequestCreator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final nextId:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private final data:Lcom/squareup/picasso/Request$Builder;

.field private deferred:Z

.field private errorDrawable:Landroid/graphics/drawable/Drawable;

.field private errorResId:I

.field private memoryPolicy:I

.field private networkPolicy:I

.field private noFade:Z

.field private final picasso:Lcom/squareup/picasso/Picasso;

.field private placeholderDrawable:Landroid/graphics/drawable/Drawable;

.field private placeholderResId:I

.field private setPlaceholder:Z

.field private tag:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/squareup/picasso/RequestCreator;->nextId:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method constructor <init>()V
    .locals 4

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    .line 80
    new-instance v0, Lcom/squareup/picasso/Request$Builder;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/squareup/picasso/Request$Builder;-><init>(Landroid/net/Uri;ILandroid/graphics/Bitmap$Config;)V

    iput-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    .line 81
    return-void
.end method

.method constructor <init>(Lcom/squareup/picasso/Picasso;Landroid/net/Uri;I)V
    .locals 2

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    .line 70
    iget-boolean v0, p1, Lcom/squareup/picasso/Picasso;->shutdown:Z

    if-eqz v0, :cond_0

    .line 71
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Picasso instance already shut down. Cannot submit new requests."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_0
    iput-object p1, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    .line 75
    new-instance v0, Lcom/squareup/picasso/Request$Builder;

    iget-object v1, p1, Lcom/squareup/picasso/Picasso;->defaultBitmapConfig:Landroid/graphics/Bitmap$Config;

    invoke-direct {v0, p2, p3, v1}, Lcom/squareup/picasso/Request$Builder;-><init>(Landroid/net/Uri;ILandroid/graphics/Bitmap$Config;)V

    iput-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    .line 76
    return-void
.end method

.method private createRequest(J)Lcom/squareup/picasso/Request;
    .locals 9

    .line 684
    sget-object v0, Lcom/squareup/picasso/RequestCreator;->nextId:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v5

    .line 686
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->build()Lcom/squareup/picasso/Request;

    move-result-object v6

    .line 687
    iput v5, v6, Lcom/squareup/picasso/Request;->id:I

    .line 688
    iput-wide p1, v6, Lcom/squareup/picasso/Request;->started:J

    .line 690
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-boolean v7, v0, Lcom/squareup/picasso/Picasso;->loggingEnabled:Z

    .line 691
    if-eqz v7, :cond_0

    .line 692
    const-string v0, "Main"

    const-string v1, "created"

    invoke-virtual {v6}, Lcom/squareup/picasso/Request;->plainId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Lcom/squareup/picasso/Request;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/picasso/Utils;->log(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 695
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    invoke-virtual {v0, v6}, Lcom/squareup/picasso/Picasso;->transformRequest(Lcom/squareup/picasso/Request;)Lcom/squareup/picasso/Request;

    move-result-object v8

    .line 696
    if-eq v8, v6, :cond_1

    .line 698
    iput v5, v8, Lcom/squareup/picasso/Request;->id:I

    .line 699
    iput-wide p1, v8, Lcom/squareup/picasso/Request;->started:J

    .line 701
    if-eqz v7, :cond_1

    .line 702
    const-string v0, "Main"

    const-string v1, "changed"

    invoke-virtual {v8}, Lcom/squareup/picasso/Request;->logId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "into "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/picasso/Utils;->log(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 706
    :cond_1
    return-object v8
.end method

.method private getPlaceholderDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 675
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    if-eqz v0, :cond_0

    .line 676
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-object v0, v0, Lcom/squareup/picasso/Picasso;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v1, p0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 678
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->placeholderDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method private performRemoteViewInto(Lcom/squareup/picasso/RemoteViewsAction;)V
    .locals 3

    .line 710
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    invoke-static {v0}, Lcom/squareup/picasso/MemoryPolicy;->shouldReadFromMemoryCache(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 711
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    invoke-virtual {p1}, Lcom/squareup/picasso/RemoteViewsAction;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->quickMemoryCacheCheck(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 712
    if-eqz v2, :cond_0

    .line 713
    sget-object v0, Lcom/squareup/picasso/Picasso$LoadedFrom;->MEMORY:Lcom/squareup/picasso/Picasso$LoadedFrom;

    invoke-virtual {p1, v2, v0}, Lcom/squareup/picasso/RemoteViewsAction;->complete(Landroid/graphics/Bitmap;Lcom/squareup/picasso/Picasso$LoadedFrom;)V

    .line 714
    return-void

    .line 718
    :cond_0
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    if-eqz v0, :cond_1

    .line 719
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    invoke-virtual {p1, v0}, Lcom/squareup/picasso/RemoteViewsAction;->setImageResource(I)V

    .line 722
    :cond_1
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Picasso;->enqueueAndSubmit(Lcom/squareup/picasso/Action;)V

    .line 723
    return-void
.end method


# virtual methods
.method public centerCrop()Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->centerCrop()Lcom/squareup/picasso/Request$Builder;

    .line 230
    return-object p0
.end method

.method public centerInside()Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 238
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->centerInside()Lcom/squareup/picasso/Request$Builder;

    .line 239
    return-object p0
.end method

.method public config(Landroid/graphics/Bitmap$Config;)Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Request$Builder;->config(Landroid/graphics/Bitmap$Config;)Lcom/squareup/picasso/Request$Builder;

    .line 271
    return-object p0
.end method

.method public error(I)Lcom/squareup/picasso/RequestCreator;
    .locals 2

    .line 141
    if-nez p1, :cond_0

    .line 142
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Error image resource invalid."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->errorDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 145
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Error image already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 147
    :cond_1
    iput p1, p0, Lcom/squareup/picasso/RequestCreator;->errorResId:I

    .line 148
    return-object p0
.end method

.method public error(Landroid/graphics/drawable/Drawable;)Lcom/squareup/picasso/RequestCreator;
    .locals 2

    .line 153
    if-nez p1, :cond_0

    .line 154
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Error image may not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 156
    :cond_0
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->errorResId:I

    if-eqz v0, :cond_1

    .line 157
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Error image already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 159
    :cond_1
    iput-object p1, p0, Lcom/squareup/picasso/RequestCreator;->errorDrawable:Landroid/graphics/drawable/Drawable;

    .line 160
    return-object p0
.end method

.method public fetch()V
    .locals 1

    .line 406
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/squareup/picasso/RequestCreator;->fetch(Lcom/squareup/picasso/Callback;)V

    .line 407
    return-void
.end method

.method public fetch(Lcom/squareup/picasso/Callback;)V
    .locals 14

    .line 419
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    .line 421
    iget-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->deferred:Z

    if-eqz v0, :cond_0

    .line 422
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fit cannot be used with fetch."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 424
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->hasImage()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 426
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->hasPriority()Z

    move-result v0

    if-nez v0, :cond_1

    .line 427
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    sget-object v1, Lcom/squareup/picasso/Picasso$Priority;->LOW:Lcom/squareup/picasso/Picasso$Priority;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Request$Builder;->priority(Lcom/squareup/picasso/Picasso$Priority;)Lcom/squareup/picasso/Request$Builder;

    .line 430
    :cond_1
    invoke-direct {p0, v8, v9}, Lcom/squareup/picasso/RequestCreator;->createRequest(J)Lcom/squareup/picasso/Request;

    move-result-object v10

    .line 431
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v10, v0}, Lcom/squareup/picasso/Utils;->createKey(Lcom/squareup/picasso/Request;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v11

    .line 432
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    invoke-virtual {v0, v11}, Lcom/squareup/picasso/Picasso;->quickMemoryCacheCheck(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 434
    if-eqz v12, :cond_3

    .line 435
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-boolean v0, v0, Lcom/squareup/picasso/Picasso;->loggingEnabled:Z

    if-eqz v0, :cond_2

    .line 436
    const-string v0, "Main"

    const-string v1, "completed"

    invoke-virtual {v10}, Lcom/squareup/picasso/Request;->plainId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/squareup/picasso/Picasso$LoadedFrom;->MEMORY:Lcom/squareup/picasso/Picasso$LoadedFrom;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/picasso/Utils;->log(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    :cond_2
    if-eqz p1, :cond_4

    .line 439
    invoke-interface {p1}, Lcom/squareup/picasso/Callback;->onSuccess()V

    goto :goto_0

    .line 442
    :cond_3
    new-instance v0, Lcom/squareup/picasso/FetchAction;

    iget-object v1, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object v2, v10

    iget v3, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    iget v4, p0, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    iget-object v5, p0, Lcom/squareup/picasso/RequestCreator;->tag:Ljava/lang/Object;

    move-object v6, v11

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/squareup/picasso/FetchAction;-><init>(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/Request;IILjava/lang/Object;Ljava/lang/String;Lcom/squareup/picasso/Callback;)V

    move-object v13, v0

    .line 444
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    invoke-virtual {v0, v13}, Lcom/squareup/picasso/Picasso;->submit(Lcom/squareup/picasso/Action;)V

    .line 447
    :cond_4
    :goto_0
    return-void
.end method

.method public fit()Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 199
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->deferred:Z

    .line 200
    return-object p0
.end method

.method public get()Landroid/graphics/Bitmap;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 382
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    .line 383
    invoke-static {}, Lcom/squareup/picasso/Utils;->checkNotMain()V

    .line 385
    iget-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->deferred:Z

    if-eqz v0, :cond_0

    .line 386
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fit cannot be used with get."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 388
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->hasImage()Z

    move-result v0

    if-nez v0, :cond_1

    .line 389
    const/4 v0, 0x0

    return-object v0

    .line 392
    :cond_1
    invoke-direct {p0, v7, v8}, Lcom/squareup/picasso/RequestCreator;->createRequest(J)Lcom/squareup/picasso/Request;

    move-result-object v9

    .line 393
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v0}, Lcom/squareup/picasso/Utils;->createKey(Lcom/squareup/picasso/Request;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v10

    .line 395
    new-instance v0, Lcom/squareup/picasso/GetAction;

    iget-object v1, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object v2, v9

    iget v3, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    iget v4, p0, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    iget-object v5, p0, Lcom/squareup/picasso/RequestCreator;->tag:Ljava/lang/Object;

    move-object v6, v10

    invoke-direct/range {v0 .. v6}, Lcom/squareup/picasso/GetAction;-><init>(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/Request;IILjava/lang/Object;Ljava/lang/String;)V

    move-object v11, v0

    .line 396
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-object v1, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-object v1, v1, Lcom/squareup/picasso/Picasso;->dispatcher:Lcom/squareup/picasso/Dispatcher;

    iget-object v2, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-object v2, v2, Lcom/squareup/picasso/Picasso;->cache:Lcom/squareup/picasso/Cache;

    iget-object v3, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-object v3, v3, Lcom/squareup/picasso/Picasso;->stats:Lcom/squareup/picasso/Stats;

    invoke-static {v0, v1, v2, v3, v11}, Lcom/squareup/picasso/BitmapHunter;->forRequest(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/Dispatcher;Lcom/squareup/picasso/Cache;Lcom/squareup/picasso/Stats;Lcom/squareup/picasso/Action;)Lcom/squareup/picasso/BitmapHunter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/picasso/BitmapHunter;->hunt()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public into(Landroid/widget/ImageView;)V
    .locals 1

    .line 601
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;Lcom/squareup/picasso/Callback;)V

    .line 602
    return-void
.end method

.method public into(Landroid/widget/ImageView;Lcom/squareup/picasso/Callback;)V
    .locals 17

    .line 614
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v12

    .line 615
    invoke-static {}, Lcom/squareup/picasso/Utils;->checkMain()V

    .line 617
    if-nez p1, :cond_0

    .line 618
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Target must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 621
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->hasImage()Z

    move-result v0

    if-nez v0, :cond_2

    .line 622
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->cancelRequest(Landroid/widget/ImageView;)V

    .line 623
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    if-eqz v0, :cond_1

    .line 624
    invoke-direct/range {p0 .. p0}, Lcom/squareup/picasso/RequestCreator;->getPlaceholderDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/squareup/picasso/PicassoDrawable;->setPlaceholder(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 626
    :cond_1
    return-void

    .line 629
    :cond_2
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/squareup/picasso/RequestCreator;->deferred:Z

    if-eqz v0, :cond_7

    .line 630
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->hasSize()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 631
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fit cannot be used with resize."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 633
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getWidth()I

    move-result v14

    .line 634
    invoke-virtual/range {p1 .. p1}, Landroid/widget/ImageView;->getHeight()I

    move-result v15

    .line 635
    if-eqz v14, :cond_4

    if-nez v15, :cond_6

    .line 636
    :cond_4
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    if-eqz v0, :cond_5

    .line 637
    invoke-direct/range {p0 .. p0}, Lcom/squareup/picasso/RequestCreator;->getPlaceholderDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/squareup/picasso/PicassoDrawable;->setPlaceholder(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 639
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    new-instance v1, Lcom/squareup/picasso/DeferredRequestCreator;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    invoke-direct {v1, v2, v3, v4}, Lcom/squareup/picasso/DeferredRequestCreator;-><init>(Lcom/squareup/picasso/RequestCreator;Landroid/widget/ImageView;Lcom/squareup/picasso/Callback;)V

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1}, Lcom/squareup/picasso/Picasso;->defer(Landroid/widget/ImageView;Lcom/squareup/picasso/DeferredRequestCreator;)V

    .line 640
    return-void

    .line 642
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, v14, v15}, Lcom/squareup/picasso/Request$Builder;->resize(II)Lcom/squareup/picasso/Request$Builder;

    .line 645
    :cond_7
    move-object/from16 v0, p0

    invoke-direct {v0, v12, v13}, Lcom/squareup/picasso/RequestCreator;->createRequest(J)Lcom/squareup/picasso/Request;

    move-result-object v14

    .line 646
    invoke-static {v14}, Lcom/squareup/picasso/Utils;->createKey(Lcom/squareup/picasso/Request;)Ljava/lang/String;

    move-result-object v15

    .line 648
    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    invoke-static {v0}, Lcom/squareup/picasso/MemoryPolicy;->shouldReadFromMemoryCache(I)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 649
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    invoke-virtual {v0, v15}, Lcom/squareup/picasso/Picasso;->quickMemoryCacheCheck(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v16

    .line 650
    if-eqz v16, :cond_a

    .line 651
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->cancelRequest(Landroid/widget/ImageView;)V

    .line 652
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-object v1, v1, Lcom/squareup/picasso/Picasso;->context:Landroid/content/Context;

    move-object/from16 v2, v16

    sget-object v3, Lcom/squareup/picasso/Picasso$LoadedFrom;->MEMORY:Lcom/squareup/picasso/Picasso$LoadedFrom;

    move-object/from16 v4, p0

    iget-boolean v4, v4, Lcom/squareup/picasso/RequestCreator;->noFade:Z

    move-object/from16 v5, p0

    iget-object v5, v5, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-boolean v5, v5, Lcom/squareup/picasso/Picasso;->indicatorsEnabled:Z

    invoke-static/range {v0 .. v5}, Lcom/squareup/picasso/PicassoDrawable;->setBitmap(Landroid/widget/ImageView;Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/squareup/picasso/Picasso$LoadedFrom;ZZ)V

    .line 653
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-boolean v0, v0, Lcom/squareup/picasso/Picasso;->loggingEnabled:Z

    if-eqz v0, :cond_8

    .line 654
    const-string v0, "Main"

    const-string v1, "completed"

    invoke-virtual {v14}, Lcom/squareup/picasso/Request;->plainId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/squareup/picasso/Picasso$LoadedFrom;->MEMORY:Lcom/squareup/picasso/Picasso$LoadedFrom;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/picasso/Utils;->log(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    :cond_8
    if-eqz p2, :cond_9

    .line 657
    invoke-interface/range {p2 .. p2}, Lcom/squareup/picasso/Callback;->onSuccess()V

    .line 659
    :cond_9
    return-void

    .line 663
    :cond_a
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    if-eqz v0, :cond_b

    .line 664
    invoke-direct/range {p0 .. p0}, Lcom/squareup/picasso/RequestCreator;->getPlaceholderDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lcom/squareup/picasso/PicassoDrawable;->setPlaceholder(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 667
    :cond_b
    new-instance v0, Lcom/squareup/picasso/ImageViewAction;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object/from16 v2, p1

    move-object v3, v14

    move-object/from16 v4, p0

    iget v4, v4, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    move-object/from16 v5, p0

    iget v5, v5, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    move-object/from16 v6, p0

    iget v6, v6, Lcom/squareup/picasso/RequestCreator;->errorResId:I

    move-object/from16 v7, p0

    iget-object v7, v7, Lcom/squareup/picasso/RequestCreator;->errorDrawable:Landroid/graphics/drawable/Drawable;

    move-object v8, v15

    move-object/from16 v9, p0

    iget-object v9, v9, Lcom/squareup/picasso/RequestCreator;->tag:Ljava/lang/Object;

    move-object/from16 v10, p2

    move-object/from16 v11, p0

    iget-boolean v11, v11, Lcom/squareup/picasso/RequestCreator;->noFade:Z

    invoke-direct/range {v0 .. v11}, Lcom/squareup/picasso/ImageViewAction;-><init>(Lcom/squareup/picasso/Picasso;Landroid/widget/ImageView;Lcom/squareup/picasso/Request;IIILandroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Object;Lcom/squareup/picasso/Callback;Z)V

    move-object/from16 v16, v0

    .line 671
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->enqueueAndSubmit(Lcom/squareup/picasso/Action;)V

    .line 672
    return-void
.end method

.method public into(Landroid/widget/RemoteViews;IILandroid/app/Notification;)V
    .locals 17

    .line 537
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v12

    .line 539
    if-nez p1, :cond_0

    .line 540
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "RemoteViews must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 542
    :cond_0
    if-nez p4, :cond_1

    .line 543
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Notification must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 545
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/squareup/picasso/RequestCreator;->deferred:Z

    if-eqz v0, :cond_2

    .line 546
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fit cannot be used with RemoteViews."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 548
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->placeholderDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->errorDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    .line 549
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot use placeholder or error drawables with remote views."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 553
    :cond_4
    move-object/from16 v0, p0

    invoke-direct {v0, v12, v13}, Lcom/squareup/picasso/RequestCreator;->createRequest(J)Lcom/squareup/picasso/Request;

    move-result-object v14

    .line 554
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v14, v0}, Lcom/squareup/picasso/Utils;->createKey(Lcom/squareup/picasso/Request;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v15

    .line 556
    new-instance v0, Lcom/squareup/picasso/RemoteViewsAction$NotificationAction;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object v2, v14

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p0

    iget v7, v7, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    move-object/from16 v8, p0

    iget v8, v8, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    move-object v9, v15

    move-object/from16 v10, p0

    iget-object v10, v10, Lcom/squareup/picasso/RequestCreator;->tag:Ljava/lang/Object;

    move-object/from16 v11, p0

    iget v11, v11, Lcom/squareup/picasso/RequestCreator;->errorResId:I

    invoke-direct/range {v0 .. v11}, Lcom/squareup/picasso/RemoteViewsAction$NotificationAction;-><init>(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/Request;Landroid/widget/RemoteViews;IILandroid/app/Notification;IILjava/lang/String;Ljava/lang/Object;I)V

    move-object/from16 v16, v0

    .line 560
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lcom/squareup/picasso/RequestCreator;->performRemoteViewInto(Lcom/squareup/picasso/RemoteViewsAction;)V

    .line 561
    return-void
.end method

.method public into(Landroid/widget/RemoteViews;I[I)V
    .locals 16

    .line 568
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v11

    .line 570
    if-nez p1, :cond_0

    .line 571
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "remoteViews must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 573
    :cond_0
    if-nez p3, :cond_1

    .line 574
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "appWidgetIds must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 576
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/squareup/picasso/RequestCreator;->deferred:Z

    if-eqz v0, :cond_2

    .line 577
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fit cannot be used with remote views."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 579
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->placeholderDrawable:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    iget v0, v0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/squareup/picasso/RequestCreator;->errorDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    .line 580
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot use placeholder or error drawables with remote views."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 584
    :cond_4
    move-object/from16 v0, p0

    invoke-direct {v0, v11, v12}, Lcom/squareup/picasso/RequestCreator;->createRequest(J)Lcom/squareup/picasso/Request;

    move-result-object v13

    .line 585
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v13, v0}, Lcom/squareup/picasso/Utils;->createKey(Lcom/squareup/picasso/Request;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v14

    .line 587
    new-instance v0, Lcom/squareup/picasso/RemoteViewsAction$AppWidgetAction;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object v2, v13

    move-object/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p0

    iget v6, v6, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    move-object/from16 v7, p0

    iget v7, v7, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    move-object v8, v14

    move-object/from16 v9, p0

    iget-object v9, v9, Lcom/squareup/picasso/RequestCreator;->tag:Ljava/lang/Object;

    move-object/from16 v10, p0

    iget v10, v10, Lcom/squareup/picasso/RequestCreator;->errorResId:I

    invoke-direct/range {v0 .. v10}, Lcom/squareup/picasso/RemoteViewsAction$AppWidgetAction;-><init>(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/Request;Landroid/widget/RemoteViews;I[IIILjava/lang/String;Ljava/lang/Object;I)V

    move-object v15, v0

    .line 591
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/squareup/picasso/RequestCreator;->performRemoteViewInto(Lcom/squareup/picasso/RemoteViewsAction;)V

    .line 592
    return-void
.end method

.method public into(Lcom/squareup/picasso/Target;)V
    .locals 15

    .line 495
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    .line 496
    invoke-static {}, Lcom/squareup/picasso/Utils;->checkMain()V

    .line 498
    if-nez p1, :cond_0

    .line 499
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Target must not be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 501
    :cond_0
    iget-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->deferred:Z

    if-eqz v0, :cond_1

    .line 502
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fit cannot be used with a Target."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 505
    :cond_1
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->hasImage()Z

    move-result v0

    if-nez v0, :cond_3

    .line 506
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->cancelRequest(Lcom/squareup/picasso/Target;)V

    .line 507
    iget-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/squareup/picasso/RequestCreator;->getPlaceholderDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lcom/squareup/picasso/Target;->onPrepareLoad(Landroid/graphics/drawable/Drawable;)V

    .line 508
    return-void

    .line 511
    :cond_3
    invoke-direct {p0, v10, v11}, Lcom/squareup/picasso/RequestCreator;->createRequest(J)Lcom/squareup/picasso/Request;

    move-result-object v12

    .line 512
    invoke-static {v12}, Lcom/squareup/picasso/Utils;->createKey(Lcom/squareup/picasso/Request;)Ljava/lang/String;

    move-result-object v13

    .line 514
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    invoke-static {v0}, Lcom/squareup/picasso/MemoryPolicy;->shouldReadFromMemoryCache(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 515
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    invoke-virtual {v0, v13}, Lcom/squareup/picasso/Picasso;->quickMemoryCacheCheck(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v14

    .line 516
    if-eqz v14, :cond_4

    .line 517
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->cancelRequest(Lcom/squareup/picasso/Target;)V

    .line 518
    sget-object v0, Lcom/squareup/picasso/Picasso$LoadedFrom;->MEMORY:Lcom/squareup/picasso/Picasso$LoadedFrom;

    move-object/from16 v1, p1

    invoke-interface {v1, v14, v0}, Lcom/squareup/picasso/Target;->onBitmapLoaded(Landroid/graphics/Bitmap;Lcom/squareup/picasso/Picasso$LoadedFrom;)V

    .line 519
    return-void

    .line 523
    :cond_4
    iget-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lcom/squareup/picasso/RequestCreator;->getPlaceholderDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Lcom/squareup/picasso/Target;->onPrepareLoad(Landroid/graphics/drawable/Drawable;)V

    .line 525
    new-instance v0, Lcom/squareup/picasso/TargetAction;

    iget-object v1, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    move-object/from16 v2, p1

    move-object v3, v12

    iget v4, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    iget v5, p0, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    iget-object v6, p0, Lcom/squareup/picasso/RequestCreator;->errorDrawable:Landroid/graphics/drawable/Drawable;

    move-object v7, v13

    iget-object v8, p0, Lcom/squareup/picasso/RequestCreator;->tag:Ljava/lang/Object;

    iget v9, p0, Lcom/squareup/picasso/RequestCreator;->errorResId:I

    invoke-direct/range {v0 .. v9}, Lcom/squareup/picasso/TargetAction;-><init>(Lcom/squareup/picasso/Picasso;Lcom/squareup/picasso/Target;Lcom/squareup/picasso/Request;IILandroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Object;I)V

    move-object v14, v0

    .line 528
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    invoke-virtual {v0, v14}, Lcom/squareup/picasso/Picasso;->enqueueAndSubmit(Lcom/squareup/picasso/Action;)V

    .line 529
    return-void
.end method

.method public varargs memoryPolicy(Lcom/squareup/picasso/MemoryPolicy;[Lcom/squareup/picasso/MemoryPolicy;)Lcom/squareup/picasso/RequestCreator;
    .locals 6

    .line 328
    if-nez p1, :cond_0

    .line 329
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Memory policy cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 331
    :cond_0
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    iget v1, p1, Lcom/squareup/picasso/MemoryPolicy;->index:I

    or-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    .line 332
    if-nez p2, :cond_1

    .line 333
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Memory policy cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 335
    :cond_1
    array-length v0, p2

    if-lez v0, :cond_3

    .line 336
    move-object v2, p2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 337
    if-nez v5, :cond_2

    .line 338
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Memory policy cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 340
    :cond_2
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    iget v1, v5, Lcom/squareup/picasso/MemoryPolicy;->index:I

    or-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/picasso/RequestCreator;->memoryPolicy:I

    .line 336
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 343
    :cond_3
    return-object p0
.end method

.method public varargs networkPolicy(Lcom/squareup/picasso/NetworkPolicy;[Lcom/squareup/picasso/NetworkPolicy;)Lcom/squareup/picasso/RequestCreator;
    .locals 6

    .line 351
    if-nez p1, :cond_0

    .line 352
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Network policy cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 354
    :cond_0
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    iget v1, p1, Lcom/squareup/picasso/NetworkPolicy;->index:I

    or-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    .line 355
    if-nez p2, :cond_1

    .line 356
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Network policy cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 358
    :cond_1
    array-length v0, p2

    if-lez v0, :cond_3

    .line 359
    move-object v2, p2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    .line 360
    if-nez v5, :cond_2

    .line 361
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Network policy cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 363
    :cond_2
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    iget v1, v5, Lcom/squareup/picasso/NetworkPolicy;->index:I

    or-int/2addr v0, v1

    iput v0, p0, Lcom/squareup/picasso/RequestCreator;->networkPolicy:I

    .line 359
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 366
    :cond_3
    return-object p0
.end method

.method public noFade()Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 371
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->noFade:Z

    .line 372
    return-object p0
.end method

.method public noPlaceholder()Lcom/squareup/picasso/RequestCreator;
    .locals 2

    .line 91
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    if-eqz v0, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Placeholder resource already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->placeholderDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 95
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Placeholder image already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    .line 98
    return-object p0
.end method

.method public onlyScaleDown()Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0}, Lcom/squareup/picasso/Request$Builder;->onlyScaleDown()Lcom/squareup/picasso/Request$Builder;

    .line 248
    return-object p0
.end method

.method public placeholder(I)Lcom/squareup/picasso/RequestCreator;
    .locals 2

    .line 107
    iget-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    if-nez v0, :cond_0

    .line 108
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already explicitly declared as no placeholder."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_0
    if-nez p1, :cond_1

    .line 111
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Placeholder image resource invalid."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 113
    :cond_1
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->placeholderDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 114
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Placeholder image already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_2
    iput p1, p0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    .line 117
    return-object p0
.end method

.method public placeholder(Landroid/graphics/drawable/Drawable;)Lcom/squareup/picasso/RequestCreator;
    .locals 2

    .line 129
    iget-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->setPlaceholder:Z

    if-nez v0, :cond_0

    .line 130
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already explicitly declared as no placeholder."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_0
    iget v0, p0, Lcom/squareup/picasso/RequestCreator;->placeholderResId:I

    if-eqz v0, :cond_1

    .line 133
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Placeholder image already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_1
    iput-object p1, p0, Lcom/squareup/picasso/RequestCreator;->placeholderDrawable:Landroid/graphics/drawable/Drawable;

    .line 136
    return-object p0
.end method

.method public priority(Lcom/squareup/picasso/Picasso$Priority;)Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 291
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Request$Builder;->priority(Lcom/squareup/picasso/Picasso$Priority;)Lcom/squareup/picasso/Request$Builder;

    .line 292
    return-object p0
.end method

.method public resize(II)Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 219
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/picasso/Request$Builder;->resize(II)Lcom/squareup/picasso/Request$Builder;

    .line 220
    return-object p0
.end method

.method public resizeDimen(II)Lcom/squareup/picasso/RequestCreator;
    .locals 4

    .line 211
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->picasso:Lcom/squareup/picasso/Picasso;

    iget-object v0, v0, Lcom/squareup/picasso/Picasso;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 212
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 213
    invoke-virtual {v1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 214
    invoke-virtual {p0, v2, v3}, Lcom/squareup/picasso/RequestCreator;->resize(II)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    return-object v0
.end method

.method public rotate(F)Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Request$Builder;->rotate(F)Lcom/squareup/picasso/Request$Builder;

    .line 254
    return-object p0
.end method

.method public rotate(FFF)Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 259
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, p1, p2, p3}, Lcom/squareup/picasso/Request$Builder;->rotate(FFF)Lcom/squareup/picasso/Request$Builder;

    .line 260
    return-object p0
.end method

.method public skipMemoryCache()Lcom/squareup/picasso/RequestCreator;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 320
    sget-object v0, Lcom/squareup/picasso/MemoryPolicy;->NO_CACHE:Lcom/squareup/picasso/MemoryPolicy;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/squareup/picasso/MemoryPolicy;

    sget-object v2, Lcom/squareup/picasso/MemoryPolicy;->NO_STORE:Lcom/squareup/picasso/MemoryPolicy;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0, v0, v1}, Lcom/squareup/picasso/RequestCreator;->memoryPolicy(Lcom/squareup/picasso/MemoryPolicy;[Lcom/squareup/picasso/MemoryPolicy;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    return-object v0
.end method

.method public stableKey(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Request$Builder;->stableKey(Ljava/lang/String;)Lcom/squareup/picasso/Request$Builder;

    .line 280
    return-object p0
.end method

.method public tag(Ljava/lang/Object;)Lcom/squareup/picasso/RequestCreator;
    .locals 2

    .line 182
    if-nez p1, :cond_0

    .line 183
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Tag invalid."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_0
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->tag:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 186
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Tag already set."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 188
    :cond_1
    iput-object p1, p0, Lcom/squareup/picasso/RequestCreator;->tag:Ljava/lang/Object;

    .line 189
    return-object p0
.end method

.method public transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Request$Builder;->transform(Lcom/squareup/picasso/Transformation;)Lcom/squareup/picasso/Request$Builder;

    .line 303
    return-object p0
.end method

.method public transform(Ljava/util/List;)Lcom/squareup/picasso/RequestCreator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/squareup/picasso/Transformation;>;)Lcom/squareup/picasso/RequestCreator;"
        }
    .end annotation

    .line 312
    iget-object v0, p0, Lcom/squareup/picasso/RequestCreator;->data:Lcom/squareup/picasso/Request$Builder;

    invoke-virtual {v0, p1}, Lcom/squareup/picasso/Request$Builder;->transform(Ljava/util/List;)Lcom/squareup/picasso/Request$Builder;

    .line 313
    return-object p0
.end method

.method unfit()Lcom/squareup/picasso/RequestCreator;
    .locals 1

    .line 205
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/squareup/picasso/RequestCreator;->deferred:Z

    .line 206
    return-object p0
.end method

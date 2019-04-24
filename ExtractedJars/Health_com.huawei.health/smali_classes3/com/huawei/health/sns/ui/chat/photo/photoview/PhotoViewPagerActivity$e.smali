.class Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;
.super Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private b:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

.field final synthetic c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation
.end field

.field private h:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$b;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Ljava/util/ArrayList;Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;)V"
        }
    .end annotation

    .line 266
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/send/PhotoBasePagerActivity;)V

    .line 257
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->h:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$b;

    .line 267
    iput-object p2, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->d:Ljava/util/ArrayList;

    .line 268
    iput-object p3, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->b:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    .line 269
    invoke-virtual {p3}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->a:Landroid/view/LayoutInflater;

    .line 270
    new-instance v0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$b;

    invoke-direct {v0, p1}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$b;-><init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->h:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$b;

    .line 271
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Ljava/util/ArrayList;Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$1;)V
    .locals 0

    .line 242
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;-><init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Ljava/util/ArrayList;Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/model/chat/MessageItem;)I
    .locals 4

    .line 281
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 283
    const/4 v0, -0x1

    return v0

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 286
    add-int/lit8 v2, v1, -0x1

    :goto_0
    if-ltz v2, :cond_2

    .line 288
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 289
    invoke-virtual {p1, v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 291
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 292
    return v2

    .line 286
    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 295
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public getCount()I
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .line 301
    const/4 v0, -0x2

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 9

    .line 314
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_photoview_pager_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 315
    sget v0, Lcom/huawei/android/sns/R$id;->image:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/kv;

    .line 316
    sget v0, Lcom/huawei/android/sns/R$id;->layout_failed:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 317
    sget v0, Lcom/huawei/android/sns/R$id;->loading:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->h:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$b;

    invoke-virtual {v4, v0}, Lo/kv;->setOnPhotoTapListener(Lo/ko;)V

    .line 323
    new-instance v0, Lo/bdr;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->b:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    invoke-direct {v0, v1, v7}, Lo/bdr;-><init>(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    invoke-virtual {v4, v0}, Lo/kv;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 325
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->getDownloadStatus()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v3, v5}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;ZZLandroid/view/View;Landroid/view/View;)V

    .line 328
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    invoke-static {v0, v7, v4, v6}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/kv;Landroid/view/View;)Z

    move-result v8

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity$e;->c:Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    invoke-virtual {v7}, Lcom/huawei/health/sns/model/chat/MessageItem;->getOriginalDownStatus()I

    move-result v1

    const/4 v2, 0x6

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v8, v1, v3, v5}, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;->a(Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;ZZLandroid/view/View;Landroid/view/View;)V

    .line 335
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 336
    return-object v3
.end method

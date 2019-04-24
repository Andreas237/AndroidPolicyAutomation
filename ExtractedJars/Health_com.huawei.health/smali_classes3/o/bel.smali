.class public Lo/bel;
.super Lo/beo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bel$d;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lo/beo;-><init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;Lo/bfa;)V

    .line 40
    return-void
.end method

.method private a(Lo/bel$d;)V
    .locals 2

    .line 267
    iget-object v0, p1, Lo/bel$d;->e:Lo/bmx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bmx;->c(Z)V

    .line 268
    iget-object v0, p1, Lo/bel$d;->e:Lo/bmx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bmx;->setLoading(Z)V

    .line 269
    iget-object v0, p1, Lo/bel$d;->c:Lo/bnp;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnp;->setVisibility(I)V

    .line 270
    return-void
.end method

.method private b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    .line 74
    const/4 v3, 0x0

    .line 75
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/bel$d;

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bel$d;

    .line 80
    invoke-direct {p0, v3}, Lo/bel;->e(Lo/bel$d;)V

    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Lo/bel;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_pic_left_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 85
    new-instance v3, Lo/bel$d;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/bel$d;-><init>(Lo/bel$1;)V

    .line 87
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 89
    invoke-virtual {v3, p1}, Lo/bel$d;->b(Landroid/view/View;)V

    .line 90
    invoke-direct {p0, v3}, Lo/bel;->e(Lo/bel$d;)V

    .line 93
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getDownloadStatus()I

    move-result v4

    .line 94
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    .line 95
    const/4 v6, 0x0

    .line 98
    if-eqz v5, :cond_1

    invoke-direct {p0, v4}, Lo/bel;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setProgress(I)V

    .line 101
    const/4 v6, 0x1

    .line 104
    :cond_1
    invoke-virtual {p0, p2, v3}, Lo/bel;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 106
    invoke-direct {p0, v6, v3, p2}, Lo/bel;->e(ZLo/bel$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 108
    invoke-virtual {p0, p2, v3}, Lo/bel;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 109
    invoke-virtual {p0, p2}, Lo/bel;->c(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 110
    invoke-virtual {p0, p2, p1, v3}, Lo/bel;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 111
    iget-object v0, v3, Lo/bel$d;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, p2, v0, v3}, Lo/bel;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 114
    if-eqz v5, :cond_2

    .line 117
    if-nez v4, :cond_3

    .line 119
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setProgress(I)V

    .line 120
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/aus;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    goto :goto_1

    .line 125
    :cond_2
    iget-object v0, v3, Lo/bel$d;->e:Lo/bmx;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aqx;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 128
    :cond_3
    :goto_1
    if-eqz v5, :cond_4

    invoke-direct {p0, v4}, Lo/bel;->c(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 130
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getProgress()I

    move-result v0

    invoke-direct {p0, v3, v0}, Lo/bel;->d(Lo/bel$d;I)V

    goto :goto_2

    .line 134
    :cond_4
    invoke-direct {p0, v3}, Lo/bel;->a(Lo/bel$d;)V

    .line 137
    :goto_2
    if-eqz v6, :cond_5

    .line 139
    iget-object v0, v3, Lo/bel$d;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    .line 143
    :cond_5
    iget-object v0, v3, Lo/bel$d;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 146
    :goto_3
    move-object v7, v3

    .line 147
    new-instance v8, Lo/bel$1;

    invoke-direct {v8, p0, p2, v7}, Lo/bel$1;-><init>(Lo/bel;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bel$d;)V

    .line 154
    iget-object v0, v3, Lo/bel$d;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    return-object p1
.end method

.method private c(Lo/bel$d;)V
    .locals 2

    .line 319
    iget-object v0, p1, Lo/bel$d;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 320
    iget-object v0, p1, Lo/bel$d;->c:Lo/bnp;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnp;->setVisibility(I)V

    .line 321
    iget-object v0, p1, Lo/bel$d;->e:Lo/bmx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bmx;->c(Z)V

    .line 322
    iget-object v0, p1, Lo/bel$d;->e:Lo/bmx;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bmx;->setImageWithDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 323
    iget-object v0, p1, Lo/bel$d;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 324
    return-void
.end method

.method private c(I)Z
    .locals 1

    .line 180
    if-eqz p1, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 5

    .line 279
    iget-object v0, p0, Lo/bel;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_0

    .line 283
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 284
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 285
    const-string v0, "picMessageItem"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 286
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 287
    iget-object v0, p0, Lo/bel;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/photo/photoview/PhotoViewPagerActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 288
    iget-object v0, p0, Lo/bel;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 290
    iget-object v0, p0, Lo/bel;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    sget v1, Lcom/huawei/android/sns/R$anim;->sns_view_photo_scale_fadein:I

    sget v2, Lcom/huawei/android/sns/R$anim;->sns_view_photo_last_out:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->overridePendingTransition(II)V

    .line 291
    goto :goto_0

    .line 295
    :cond_0
    invoke-virtual {p0, p1, p2}, Lo/bel;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 297
    :goto_0
    return-void
.end method

.method private d(Lo/bel$d;I)V
    .locals 2

    .line 254
    iget-object v0, p1, Lo/bel$d;->e:Lo/bmx;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bmx;->c(Z)V

    .line 255
    iget-object v0, p1, Lo/bel$d;->e:Lo/bmx;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bmx;->setLoading(Z)V

    .line 256
    iget-object v0, p1, Lo/bel$d;->c:Lo/bnp;

    invoke-virtual {v0, p2}, Lo/bnp;->setProgress(I)V

    .line 257
    iget-object v0, p1, Lo/bel$d;->c:Lo/bnp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bnp;->setVisibility(I)V

    .line 258
    return-void
.end method

.method private e(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InflateParams"
        }
    .end annotation

    .line 194
    const/4 v3, 0x0

    .line 195
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 196
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/bel$d;

    if-eqz v0, :cond_0

    .line 198
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bel$d;

    .line 199
    invoke-direct {p0, v3}, Lo/bel;->c(Lo/bel$d;)V

    goto :goto_0

    .line 203
    :cond_0
    iget-object v0, p0, Lo/bel;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_chat_pic_right_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 204
    new-instance v3, Lo/bel$d;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/bel$d;-><init>(Lo/bel$1;)V

    .line 205
    invoke-virtual {p1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 206
    invoke-virtual {v3, p1}, Lo/bel$d;->d(Landroid/view/View;)V

    .line 210
    :goto_0
    invoke-virtual {p0, p2, v3}, Lo/bel;->e(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 212
    const/4 v0, 0x0

    invoke-direct {p0, v0, v3, p2}, Lo/bel;->e(ZLo/bel$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 214
    invoke-virtual {p0, p2, v3}, Lo/bel;->b(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 215
    invoke-virtual {p0, p2, p1, v3}, Lo/bel;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 216
    iget-object v0, v3, Lo/bel$d;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, p2, v0, v3}, Lo/bel;->a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Lo/beu;)V

    .line 219
    invoke-virtual {p0, v3, p2}, Lo/bel;->c(Lo/beu;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 221
    iget-object v0, v3, Lo/bel$d;->e:Lo/bmx;

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/aqx;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 223
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 225
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/chat/MessageItem;->getProgress()I

    move-result v0

    invoke-direct {p0, v3, v0}, Lo/bel;->d(Lo/bel$d;I)V

    goto :goto_1

    .line 229
    :cond_1
    invoke-direct {p0, v3}, Lo/bel;->a(Lo/bel$d;)V

    .line 232
    :goto_1
    move-object v4, v3

    .line 233
    new-instance v5, Lo/bel$2;

    invoke-direct {v5, p0, p2, v4}, Lo/bel$2;-><init>(Lo/bel;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/bel$d;)V

    .line 241
    iget-object v0, v3, Lo/bel$d;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    return-object p1
.end method

.method private e(Lo/bel$d;)V
    .locals 2

    .line 306
    iget-object v0, p1, Lo/bel$d;->c:Lo/bnp;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bnp;->setVisibility(I)V

    .line 307
    iget-object v0, p1, Lo/bel$d;->e:Lo/bmx;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bmx;->c(Z)V

    .line 308
    iget-object v0, p1, Lo/bel$d;->e:Lo/bmx;

    invoke-static {}, Lo/bbe;->c()Lo/bbe;

    move-result-object v1

    invoke-virtual {v1}, Lo/bbe;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bmx;->setImageWithDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 309
    iget-object v0, p1, Lo/bel$d;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 310
    return-void
.end method

.method static synthetic e(Lo/bel;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lo/bel;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    return-void
.end method

.method private e(ZLo/bel$d;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 8

    .line 402
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 405
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 407
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 409
    const/4 v0, 0x1

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 410
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 411
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "*"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMediaRemark(Ljava/lang/String;)V

    .line 412
    iget-object v0, p2, Lo/bel$d;->e:Lo/bmx;

    iget v1, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {v0, p1, v1, v2}, Lo/bmx;->setImageWidthAndHeight(ZII)V

    .line 413
    goto :goto_0

    .line 417
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v3

    .line 418
    const-string v0, "\\*"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 419
    const/4 v0, 0x0

    aget-object v5, v4, v0

    .line 420
    const/4 v0, 0x1

    aget-object v6, v4, v0

    .line 423
    :try_start_0
    iget-object v0, p2, Lo/bel$d;->e:Lo/bmx;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 424
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 423
    invoke-virtual {v0, p1, v1, v2}, Lo/bmx;->setImageWidthAndHeight(ZII)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 429
    goto :goto_0

    .line 426
    :catch_0
    move-exception v7

    .line 428
    const-string v0, ""

    const-string v1, "setImageViewWidthAndHeight NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    :cond_1
    :goto_0
    return-void
.end method

.method private e(I)Z
    .locals 1

    .line 167
    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 51
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 53
    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 57
    invoke-direct {p0, p2, p1, p3}, Lo/bel;->b(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 61
    :cond_1
    invoke-direct {p0, p2, p1, p3}, Lo/bel;->e(Landroid/view/View;Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

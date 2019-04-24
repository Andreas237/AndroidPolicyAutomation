.class public final Lo/bpg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;

.field private static final c:Ljava/util/concurrent/ThreadFactory;

.field private static final d:Ljava/util/concurrent/Executor;

.field private static final e:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 50
    new-instance v0, Lo/bpg$1;

    invoke-direct {v0}, Lo/bpg$1;-><init>()V

    sput-object v0, Lo/bpg;->c:Ljava/util/concurrent/ThreadFactory;

    .line 64
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/bpg;->d:Ljava/util/concurrent/Executor;

    .line 69
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/bpg;->e:Ljava/util/concurrent/Executor;

    .line 73
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/bpg;->a:Landroid/content/Context;

    .line 74
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/health/sns/model/group/Group;)Landroid/graphics/Bitmap;
    .locals 11

    .line 119
    const/4 v5, 0x0

    .line 120
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 122
    return-object v5

    .line 126
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 128
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 129
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v4

    .line 128
    invoke-static {v0, v1, v2, v3, v4}, Lo/bbn;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 131
    return-object v5

    .line 135
    :cond_1
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 136
    invoke-static {v6, p0}, Lo/boz;->b(Ljava/lang/StringBuffer;Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    move-result-object v7

    .line 138
    if-nez v7, :cond_2

    .line 140
    return-object v5

    .line 143
    :cond_2
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    .line 144
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 146
    return-object v5

    .line 149
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "RoundCorner;"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 151
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v9

    .line 153
    const/4 v0, 0x1

    if-ne v9, v0, :cond_4

    .line 155
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 156
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getOldUserImageUrl()Ljava/lang/String;

    move-result-object v2

    .line 157
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserImageDownloadUrl()Ljava/lang/String;

    move-result-object v4

    .line 156
    invoke-static {v0, v1, v2, v3, v4}, Lo/bbk;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 158
    return-object v5

    .line 161
    :cond_4
    const/4 v10, 0x0

    .line 162
    invoke-static {v8}, Lo/bbk;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    .line 163
    if-eqz v10, :cond_5

    .line 165
    invoke-static {v10}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 166
    if-eqz v5, :cond_5

    .line 168
    return-object v5

    .line 172
    :cond_5
    invoke-static {v7, v8}, Lo/bpg;->b(Ljava/util/ArrayList;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 173
    return-object v5
.end method

.method public static a(Landroid/widget/ImageView;J)V
    .locals 2

    .line 84
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, p1, p2, v0, v1}, Lo/bpg;->c(Landroid/widget/ImageView;JLjava/util/ArrayList;Z)V

    .line 85
    return-void
.end method

.method public static a(Landroid/widget/ImageView;JLjava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/ImageView;JLjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 97
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, p3, v0}, Lo/bpg;->c(Landroid/widget/ImageView;JLjava/util/ArrayList;Z)V

    .line 98
    return-void
.end method

.method private static b(Ljava/util/ArrayList;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Ljava/lang/String;)Landroid/graphics/Bitmap;"
        }
    .end annotation

    .line 185
    const/4 v1, 0x0

    .line 186
    const/4 v0, 0x1

    invoke-static {v0}, Lo/boy;->a(Z)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 188
    const/4 v3, 0x0

    .line 189
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 190
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 192
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lo/boy;->a(Lcom/huawei/health/sns/model/group/GroupMember;Z)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 193
    if-nez v3, :cond_0

    move-object v0, v2

    goto :goto_1

    :cond_0
    move-object v0, v3

    :goto_1
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    goto :goto_0

    .line 195
    :cond_1
    invoke-static {v4}, Lo/bow;->e(Ljava/util/ArrayList;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 196
    if-eqz v1, :cond_2

    .line 198
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    sget-object v0, Lo/bpg;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v5, v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 199
    const/4 v0, 0x1

    invoke-static {p1, v5, v0}, Lo/boy;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V

    .line 200
    goto :goto_2

    .line 204
    :cond_2
    move-object v1, v2

    .line 206
    :goto_2
    return-object v1
.end method

.method private static b(Ljava/util/ArrayList;J)Lo/ayc;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;J)Lo/ayc;"
        }
    .end annotation

    .line 315
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 316
    :goto_0
    if-eqz v2, :cond_1

    .line 318
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ata;->b(J)Lo/ayc;

    move-result-object v1

    goto :goto_1

    .line 322
    :cond_1
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/ata;->a(J)Lo/ayc;

    move-result-object v1

    .line 324
    :goto_1
    return-object v1
.end method

.method private static c(Landroid/widget/ImageView;)Lo/bou;
    .locals 3

    .line 479
    if-eqz p0, :cond_0

    .line 481
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 482
    instance-of v0, v1, Lo/bos;

    if-eqz v0, :cond_0

    .line 484
    move-object v2, v1

    check-cast v2, Lo/bos;

    .line 485
    invoke-virtual {v2}, Lo/bos;->e()Lo/bou;

    move-result-object v0

    return-object v0

    .line 488
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static c(JLjava/util/ArrayList;Z)Lo/bpa;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Z)Lo/bpa;"
        }
    .end annotation

    .line 297
    new-instance v1, Lo/bpa;

    invoke-direct {v1}, Lo/bpa;-><init>()V

    .line 298
    invoke-virtual {v1, p0, p1}, Lo/bpa;->d(J)V

    .line 299
    invoke-virtual {v1, p2}, Lo/bpa;->b(Ljava/util/ArrayList;)V

    .line 300
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Lo/bpa;->d(Z)V

    .line 301
    invoke-virtual {v1, p3}, Lo/bpa;->e(Z)V

    .line 302
    return-object v1
.end method

.method private static c(Landroid/widget/ImageView;JLjava/util/ArrayList;Z)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/ImageView;JLjava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;Z)V"
        }
    .end annotation

    .line 220
    if-nez p0, :cond_0

    .line 222
    return-void

    .line 226
    :cond_0
    invoke-static {p3, p1, p2}, Lo/bpg;->b(Ljava/util/ArrayList;J)Lo/ayc;

    move-result-object v2

    .line 228
    if-eqz v2, :cond_2

    .line 231
    invoke-virtual {v2}, Lo/ayc;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    invoke-static {p0, v2, p4}, Lo/boy;->e(Landroid/widget/ImageView;Lo/ayc;Z)V

    .line 234
    return-void

    .line 239
    :cond_1
    invoke-virtual {v2}, Lo/ayc;->f()Ljava/lang/String;

    move-result-object v3

    .line 240
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 242
    invoke-static {v3, p4}, Lo/boy;->a(Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 243
    if-eqz v4, :cond_2

    .line 245
    invoke-virtual {p0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 246
    invoke-static {p1, p2, p3, p4}, Lo/bpg;->c(JLjava/util/ArrayList;Z)Lo/bpa;

    move-result-object v0

    invoke-static {p0, v4, v3, v0}, Lo/bpg;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lo/bpa;)V

    .line 247
    return-void

    .line 254
    :cond_2
    invoke-static {p1, p2, p3, p4}, Lo/bpg;->c(JLjava/util/ArrayList;Z)Lo/bpa;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lo/bpg;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V

    .line 255
    return-void
.end method

.method private static c(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V
    .locals 3

    .line 337
    new-instance v0, Lo/bpg$2;

    invoke-direct {v0, p2, p0, p1}, Lo/bpg$2;-><init>(Lo/bpa;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    sget-object v1, Lo/bpg;->e:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 390
    invoke-virtual {v0, v1, v2}, Lo/bpg$2;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 391
    return-void
.end method

.method private static c(JLandroid/widget/ImageView;)Z
    .locals 4

    .line 454
    invoke-static {p2}, Lo/bpg;->c(Landroid/widget/ImageView;)Lo/bou;

    move-result-object v1

    .line 455
    if-eqz v1, :cond_1

    .line 457
    invoke-virtual {v1}, Lo/bou;->d()J

    move-result-wide v2

    .line 458
    cmp-long v0, v2, p0

    if-eqz v0, :cond_0

    .line 460
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/bou;->cancel(Z)Z

    goto :goto_0

    .line 465
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 468
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private static d(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/Bitmap;
    .locals 2

    .line 425
    const/4 v1, 0x0

    .line 426
    if-eqz p0, :cond_1

    .line 428
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 430
    move-object v0, p0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    .line 434
    :cond_0
    invoke-static {p0}, Lo/boe;->b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v1

    goto :goto_0

    .line 439
    :cond_1
    invoke-static {p1}, Lo/boy;->a(Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 441
    :goto_0
    return-object v1
.end method

.method private static d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lo/bpa;)V
    .locals 4

    .line 268
    invoke-virtual {p3}, Lo/bpa;->e()Ljava/util/ArrayList;

    move-result-object v1

    .line 269
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 271
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 272
    invoke-static {v1, v2}, Lo/boz;->d(Ljava/util/ArrayList;Ljava/lang/StringBuffer;)Ljava/util/ArrayList;

    .line 273
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 275
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    invoke-static {p0, p1, p3}, Lo/bpg;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V

    .line 278
    return-void

    .line 280
    :cond_0
    goto :goto_0

    .line 283
    :cond_1
    invoke-static {p0, p1, p3}, Lo/bpg;->c(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V

    .line 285
    :goto_0
    return-void
.end method

.method private static d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V
    .locals 4

    .line 402
    if-nez p2, :cond_0

    .line 404
    return-void

    .line 406
    :cond_0
    invoke-virtual {p2}, Lo/bpa;->d()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Lo/bpg;->c(JLandroid/widget/ImageView;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 408
    new-instance v2, Lo/bou;

    invoke-direct {v2, p0, p2}, Lo/bou;-><init>(Landroid/widget/ImageView;Lo/bpa;)V

    .line 409
    new-instance v3, Lo/bos;

    sget-object v0, Lo/bpg;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 410
    invoke-virtual {p2}, Lo/bpa;->a()Z

    move-result v1

    invoke-static {p1, v1}, Lo/bpg;->d(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {v3, v0, v1, v2}, Lo/bos;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;Lo/bou;)V

    .line 411
    invoke-virtual {p0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 412
    sget-object v0, Lo/bpg;->d:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v2, v0, v1}, Lo/bou;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 414
    :cond_1
    return-void
.end method

.method public static e(Landroid/widget/ImageView;J)V
    .locals 2

    .line 108
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, p2, v0, v1}, Lo/bpg;->c(Landroid/widget/ImageView;JLjava/util/ArrayList;Z)V

    .line 109
    return-void
.end method

.method static synthetic e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V
    .locals 0

    .line 34
    invoke-static {p0, p1, p2}, Lo/bpg;->d(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V

    return-void
.end method

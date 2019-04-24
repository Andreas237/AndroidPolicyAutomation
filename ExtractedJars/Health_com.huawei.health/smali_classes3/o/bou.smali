.class public Lo/bou;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Landroid/graphics/drawable/Drawable;>;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/widget/ImageView;>;"
        }
    .end annotation
.end field

.field private e:Lo/bpa;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lo/bpa;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bou;->e:Lo/bpa;

    .line 43
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/bou;->d:Ljava/lang/ref/WeakReference;

    .line 44
    iput-object p2, p0, Lo/bou;->e:Lo/bpa;

    .line 45
    return-void
.end method

.method private a(Landroid/widget/ImageView;)Lo/bou;
    .locals 3

    .line 255
    if-eqz p1, :cond_0

    .line 257
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 258
    instance-of v0, v1, Lo/bos;

    if-eqz v0, :cond_0

    .line 260
    move-object v2, v1

    check-cast v2, Lo/bos;

    .line 261
    invoke-virtual {v2}, Lo/bos;->e()Lo/bou;

    move-result-object v0

    return-object v0

    .line 264
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(ZJLo/ayc;)V
    .locals 1

    .line 176
    if-eqz p1, :cond_0

    .line 178
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/ata;->e(JLo/ayc;)V

    goto :goto_0

    .line 182
    :cond_0
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lo/ata;->b(JLo/ayc;)V

    .line 184
    :goto_0
    return-void
.end method

.method private a()Z
    .locals 1

    .line 68
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/bou;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lo/bou;->b()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private b()Landroid/widget/ImageView;
    .locals 3

    .line 236
    iget-object v0, p0, Lo/bou;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 237
    invoke-direct {p0, v1}, Lo/bou;->a(Landroid/widget/ImageView;)Lo/bou;

    move-result-object v2

    .line 239
    if-ne p0, v2, :cond_0

    .line 241
    return-object v1

    .line 244
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private c(Ljava/util/ArrayList;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)Z"
        }
    .end annotation

    .line 79
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(ZJ)V
    .locals 1

    .line 194
    if-eqz p1, :cond_0

    .line 196
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/ata;->d(J)V

    goto :goto_0

    .line 200
    :cond_0
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/ata;->c(J)V

    .line 202
    :goto_0
    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Landroid/graphics/drawable/Drawable;
    .locals 12

    .line 88
    const/4 v3, 0x0

    .line 90
    invoke-direct {p0}, Lo/bou;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_0
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->e()Ljava/util/ArrayList;

    move-result-object v4

    .line 96
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 97
    invoke-direct {p0, v4}, Lo/bou;->c(Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 99
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v1}, Lo/bpa;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v6

    .line 100
    if-nez v6, :cond_1

    .line 102
    const/4 v0, 0x0

    return-object v0

    .line 105
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 108
    new-instance v7, Lo/ayc;

    invoke-direct {v7}, Lo/ayc;-><init>()V

    .line 109
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->d()J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lo/ayc;->e(J)V

    .line 110
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/ayc;->e(Z)V

    .line 111
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ayc;->c(Ljava/lang/String;)V

    .line 112
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ayc;->d(Ljava/lang/String;)V

    .line 113
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/ayc;->b(Ljava/lang/String;)V

    .line 114
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->a()Z

    move-result v0

    invoke-static {v6, v0}, Lo/boy;->d(Lcom/huawei/health/sns/model/group/Group;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    .line 115
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    iget-object v1, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v1}, Lo/bpa;->d()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, v7}, Lo/ata;->b(JLo/ayc;)V

    .line 116
    return-object v8

    .line 118
    :cond_2
    invoke-static {v5, v6}, Lo/boz;->b(Ljava/lang/StringBuffer;Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    move-result-object v4

    .line 119
    goto :goto_0

    .line 122
    :cond_3
    invoke-static {v4, v5}, Lo/boz;->d(Ljava/util/ArrayList;Ljava/lang/StringBuffer;)Ljava/util/ArrayList;

    move-result-object v4

    .line 125
    :goto_0
    invoke-direct {p0, v4}, Lo/bou;->c(Ljava/util/ArrayList;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 127
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->b()Z

    move-result v0

    iget-object v1, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v1}, Lo/bpa;->d()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2}, Lo/bou;->d(ZJ)V

    .line 128
    const/4 v0, 0x0

    return-object v0

    .line 131
    :cond_4
    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    .line 132
    const/4 v7, 0x0

    .line 135
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->a()Z

    move-result v0

    if-nez v0, :cond_5

    .line 137
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 138
    const/4 v0, 0x0

    invoke-static {v8, v0}, Lo/boy;->a(Lcom/huawei/health/sns/model/group/GroupMember;Z)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 139
    goto :goto_3

    .line 142
    :cond_5
    const/4 v8, 0x0

    .line 143
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 144
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 146
    const/4 v0, 0x1

    invoke-static {v11, v0}, Lo/boy;->a(Lcom/huawei/health/sns/model/group/GroupMember;Z)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 147
    if-nez v8, :cond_6

    const/4 v0, 0x1

    invoke-static {v0}, Lo/boy;->a(Z)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_2

    :cond_6
    move-object v0, v8

    :goto_2
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    goto :goto_1

    .line 149
    :cond_7
    invoke-static {v9}, Lo/bow;->e(Ljava/util/ArrayList;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 152
    :goto_3
    if-eqz v7, :cond_8

    .line 154
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v8

    .line 155
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v3, v0, v7}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 156
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->a()Z

    move-result v0

    invoke-static {v6, v3, v0}, Lo/boy;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V

    .line 158
    new-instance v9, Lo/ayc;

    invoke-direct {v9}, Lo/ayc;-><init>()V

    .line 159
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->d()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Lo/ayc;->e(J)V

    .line 160
    invoke-virtual {v9, v6}, Lo/ayc;->e(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->b()Z

    move-result v0

    iget-object v1, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v1}, Lo/bpa;->d()J

    move-result-wide v1

    invoke-direct {p0, v0, v1, v2, v9}, Lo/bou;->a(ZJLo/ayc;)V

    .line 164
    :cond_8
    return-object v3
.end method

.method protected c(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 207
    invoke-virtual {p0}, Lo/bou;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    const/4 p1, 0x0

    .line 212
    :cond_0
    invoke-direct {p0}, Lo/bou;->b()Landroid/widget/ImageView;

    move-result-object v1

    .line 213
    if-eqz v1, :cond_2

    .line 215
    if-eqz p1, :cond_1

    .line 217
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 218
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_0

    .line 221
    :cond_1
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 223
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_cloudsetting_default_head_img:I

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 224
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 227
    :cond_2
    :goto_0
    return-void
.end method

.method d()J
    .locals 2

    .line 54
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lo/bou;->e:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->d()J

    move-result-wide v0

    return-wide v0

    .line 58
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 23
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bou;->a([Ljava/lang/Void;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 23
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lo/bou;->c(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

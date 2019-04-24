.class final Lo/bpg$2;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bpg;->c(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Ljava/lang/Void;Ljava/lang/Void;Lo/bpa;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/bpa;

.field final synthetic c:Landroid/widget/ImageView;

.field final synthetic d:Landroid/graphics/drawable/Drawable;


# direct methods
.method constructor <init>(Lo/bpa;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lo/bpg$2;->a:Lo/bpa;

    iput-object p2, p0, Lo/bpg$2;->c:Landroid/widget/ImageView;

    iput-object p3, p0, Lo/bpg$2;->d:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected c(Lo/bpa;)V
    .locals 2

    .line 384
    if-nez p1, :cond_0

    .line 386
    return-void

    .line 388
    :cond_0
    iget-object v0, p0, Lo/bpg$2;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bpg$2;->d:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1, p1}, Lo/bpg;->e(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Lo/bpa;)V

    .line 389
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 338
    move-object v0, p1

    check-cast v0, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lo/bpg$2;->e([Ljava/lang/Void;)Lo/bpa;

    move-result-object v0

    return-object v0
.end method

.method protected varargs e([Ljava/lang/Void;)Lo/bpa;
    .locals 9

    .line 343
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 344
    iget-object v0, p0, Lo/bpg$2;->a:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->e()Ljava/util/ArrayList;

    move-result-object v3

    .line 345
    iget-object v0, p0, Lo/bpg$2;->a:Lo/bpa;

    invoke-virtual {v0}, Lo/bpa;->d()J

    move-result-wide v4

    .line 346
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 348
    :cond_0
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v6

    .line 349
    if-nez v6, :cond_1

    .line 351
    const/4 v0, 0x0

    return-object v0

    .line 353
    :cond_1
    invoke-static {v2, v6}, Lo/boz;->b(Ljava/lang/StringBuffer;Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    move-result-object v3

    .line 354
    goto :goto_0

    .line 357
    :cond_2
    invoke-static {v3, v2}, Lo/boz;->d(Ljava/util/ArrayList;Ljava/lang/StringBuffer;)Ljava/util/ArrayList;

    move-result-object v3

    .line 360
    :goto_0
    iget-object v0, p0, Lo/bpg$2;->a:Lo/bpa;

    invoke-virtual {v0, v3}, Lo/bpa;->b(Ljava/util/ArrayList;)V

    .line 362
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    .line 363
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 365
    const/4 v0, 0x0

    return-object v0

    .line 369
    :cond_3
    invoke-static {}, Lo/ata;->d()Lo/ata;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/ata;->a(J)Lo/ayc;

    move-result-object v7

    .line 370
    if-eqz v7, :cond_4

    .line 372
    invoke-virtual {v7}, Lo/ayc;->f()Ljava/lang/String;

    move-result-object v8

    .line 373
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 375
    const-string v0, "SNSGroupImage"

    const-string v1, "SNSGroupImage urlJoinStr change."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    iget-object v0, p0, Lo/bpg$2;->a:Lo/bpa;

    return-object v0

    .line 379
    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 338
    move-object v0, p1

    check-cast v0, Lo/bpa;

    invoke-virtual {p0, v0}, Lo/bpg$2;->c(Lo/bpa;)V

    return-void
.end method

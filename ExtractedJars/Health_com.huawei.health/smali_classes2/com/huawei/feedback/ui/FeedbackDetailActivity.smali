.class public Lcom/huawei/feedback/ui/FeedbackDetailActivity;
.super Lcom/huawei/feedback/ui/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/FeedbackDetailActivity$b;,
        Lcom/huawei/feedback/ui/FeedbackDetailActivity$d;,
        Lcom/huawei/feedback/ui/FeedbackDetailActivity$a;,
        Lcom/huawei/feedback/ui/FeedbackDetailActivity$c;
    }
.end annotation


# static fields
.field private static final A:Ljava/lang/String; = "save_draft_state"

.field public static final f:I = 0x1000

.field public static final g:I = 0x1001

.field private static final h:Ljava/lang/String; = "FeedbackDetailActivity"

.field private static final y:I = 0x1f4

.field private static final z:I = 0xbcd


# instance fields
.field private B:Lcom/huawei/feedback/ui/CustomActionBar;

.field private C:Landroid/view/View$OnClickListener;

.field private D:Landroid/os/Handler;

.field b:Lcom/huawei/feedback/bean/f;

.field c:Lcom/huawei/feedback/bean/f;

.field d:Ljava/lang/String;

.field e:Landroid/graphics/Bitmap;

.field private i:Lcom/huawei/feedback/ui/ResizeRelativeLayout;

.field private j:Landroid/app/ActionBar;

.field private k:Landroid/widget/ListView;

.field private l:Lcom/huawei/feedback/ui/j;

.field private m:Landroid/widget/LinearLayout;

.field private n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/RelativeLayout;

.field private q:Landroid/widget/ImageButton;

.field private r:Landroid/widget/ImageButton;

.field private s:Landroid/widget/ImageButton;

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/feedback/bean/f;>;"
        }
    .end annotation
.end field

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 64
    invoke-direct {p0}, Lcom/huawei/feedback/ui/BaseActivity;-><init>()V

    .line 93
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    .line 97
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d:Ljava/lang/String;

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->x:Z

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    .line 415
    new-instance v0, Lcom/huawei/feedback/ui/g;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/g;-><init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->C:Landroid/view/View$OnClickListener;

    .line 1108
    new-instance v0, Lcom/huawei/feedback/ui/i;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/i;-><init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->D:Landroid/os/Handler;

    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 6

    .line 984
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/feedback/e;->a(Landroid/content/ContextWrapper;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    .line 985
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v3

    .line 986
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 987
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "null == imagePath,will getRealImagePath"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 988
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v4

    .line 990
    :try_start_0
    invoke-static {v4, p0}, Lcom/huawei/feedback/e;->a(Landroid/net/Uri;Landroid/content/Context;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 993
    goto :goto_0

    .line 991
    :catch_0
    move-exception v5

    .line 992
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "can not getRealImagePath"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 997
    :cond_0
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    .line 999
    :cond_1
    invoke-direct {p0, v2, v3}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1002
    :cond_2
    return-void
.end method

.method private a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1049
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "feedback_ui_9_dip"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->g(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    invoke-static {p1, v0}, Lcom/huawei/feedback/e;->a(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 1053
    new-instance v2, Lcom/huawei/feedback/ui/as;

    invoke-direct {v2}, Lcom/huawei/feedback/ui/as;-><init>()V

    .line 1054
    invoke-virtual {v2, p2}, Lcom/huawei/feedback/ui/as;->a(Ljava/lang/String;)V

    .line 1056
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1057
    const-string v0, ""

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/ui/as;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 1059
    :cond_0
    invoke-virtual {v2, p3}, Lcom/huawei/feedback/ui/as;->b(Ljava/lang/String;)V

    .line 1070
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->p:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1071
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1072
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 1074
    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 2

    .line 347
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 350
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->finish()V

    .line 351
    return-void

    .line 354
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d:Ljava/lang/String;

    .line 355
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    .line 357
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->x()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->v:Ljava/lang/String;

    .line 358
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->y()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->w:Ljava/lang/String;

    .line 360
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->f()Lcom/huawei/feedback/bean/f;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    .line 363
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    .line 364
    if-eqz p1, :cond_2

    .line 365
    const-string v0, "save_draft_state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/bean/f;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    .line 368
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    if-eqz v0, :cond_3

    .line 369
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Lcom/huawei/feedback/bean/f;)V

    goto :goto_0

    .line 370
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    if-eqz v0, :cond_4

    .line 371
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Lcom/huawei/feedback/bean/f;)V

    goto :goto_0

    .line 373
    :cond_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->r:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 377
    :goto_0
    new-instance v0, Lcom/huawei/feedback/ui/j;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/huawei/feedback/ui/j;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->l:Lcom/huawei/feedback/ui/j;

    .line 378
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->k:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->l:Lcom/huawei/feedback/ui/j;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 379
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->k:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->l:Lcom/huawei/feedback/ui/j;

    invoke-virtual {v1}, Lcom/huawei/feedback/ui/j;->getCount()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 380
    return-void
.end method

.method private a(Lcom/huawei/feedback/bean/f;)V
    .locals 2

    .line 383
    if-nez p1, :cond_0

    .line 384
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b(Z)V

    .line 385
    return-void

    .line 388
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, ""

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 389
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 393
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->setText(Ljava/lang/CharSequence;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->r:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    goto :goto_0

    .line 398
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->r:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 401
    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->l()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackDetailActivity;Landroid/content/Intent;)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/FeedbackDetailActivity;Z)V
    .locals 0

    .line 64
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b(Z)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1007
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/16 v1, 0x1001

    invoke-static {p0, v0, v1}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1009
    return-void

    .line 1015
    :cond_0
    invoke-static {p1}, Lcom/huawei/feedback/e;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1016
    const-string v0, "feedback_file_format_not_support"

    .line 1018
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 1017
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1016
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 1019
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1021
    return-void

    .line 1024
    :cond_1
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1025
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1029
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "image is not exist"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1030
    return-void

    .line 1035
    :cond_2
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getWidth()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/e;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    .line 1036
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1037
    const-string v0, "feedback_file_format_not_support"

    .line 1039
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 1038
    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1037
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 1040
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1041
    return-void

    .line 1045
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    invoke-direct {p0, v0, p1, p2}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V

    .line 1046
    return-void
.end method

.method static synthetic b(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Landroid/os/Handler;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->D:Landroid/os/Handler;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 209
    const-string v0, "custom_actionbar"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/ui/CustomActionBar;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    .line 210
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    const-string v1, "feedbackDetail_title"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomActionBar;->a(I)V

    .line 211
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    new-instance v1, Lcom/huawei/feedback/ui/c;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/c;-><init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomActionBar;->a(Lcom/huawei/feedback/ui/CustomActionBar$a;)V

    .line 219
    return-void
.end method

.method private b(Z)V
    .locals 2

    .line 732
    if-eqz p1, :cond_0

    .line 734
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->m:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 735
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->setFocusable(Z)V

    .line 736
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->setFocusableInTouchMode(Z)V

    .line 742
    :cond_0
    return-void
.end method

.method private c()V
    .locals 2

    .line 260
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->r:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->C:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 264
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->s:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->C:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 266
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->i:Lcom/huawei/feedback/ui/ResizeRelativeLayout;

    new-instance v1, Lcom/huawei/feedback/ui/d;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/d;-><init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/ResizeRelativeLayout;->a(Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    new-instance v1, Lcom/huawei/feedback/ui/e;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/e;-><init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 296
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->k:Landroid/widget/ListView;

    new-instance v1, Lcom/huawei/feedback/ui/f;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/f;-><init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 340
    return-void
.end method

.method static synthetic c(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->g()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 407
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->j:Landroid/app/ActionBar;

    .line 408
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->j:Landroid/app/ActionBar;

    if-eqz v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->j:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    .line 411
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->j:Landroid/app/ActionBar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 413
    :cond_0
    return-void
.end method

.method private e()V
    .locals 17

    .line 636
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "pQuestionId"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    .line 638
    const-string v0, "FeedbackDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "pQuestionId: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 640
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 641
    return-void

    .line 643
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 644
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    .line 645
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    .line 646
    if-lez v4, :cond_7

    .line 647
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_7

    .line 648
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/feedback/bean/f;

    .line 650
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 651
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v7

    .line 652
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v8

    .line 653
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 654
    :cond_1
    const-string v0, "\\|"

    invoke-virtual {v7, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 655
    const-string v0, "\\|"

    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 656
    array-length v0, v9

    if-lez v0, :cond_4

    .line 657
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v11

    .line 659
    const/4 v12, 0x0

    :goto_1
    array-length v0, v9

    if-ge v12, v0, :cond_3

    .line 660
    aget-object v13, v9, v12

    .line 661
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 663
    new-instance v14, Ljava/io/File;

    invoke-direct {v14, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 664
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 666
    const/4 v15, 0x0

    .line 668
    .line 669
    :try_start_0
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/feedback/bean/f;

    .line 670
    const-string v0, ""

    invoke-virtual {v15, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 671
    aget-object v0, v9, v12

    .line 672
    invoke-virtual {v15, v0}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 673
    aget-object v0, v10, v12

    .line 674
    invoke-virtual {v15, v0}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 675
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-interface {v0, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 678
    goto :goto_2

    .line 676
    :catch_0
    move-exception v16

    .line 677
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "clone image CloneNotSupportedException "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 659
    :cond_2
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 686
    .line 687
    :cond_3
    :try_start_1
    invoke-virtual {v6}, Lcom/huawei/feedback/bean/f;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/feedback/bean/f;

    .line 688
    invoke-virtual {v12, v11}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 689
    const-string v0, ""

    invoke-virtual {v12, v0}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 690
    const-string v0, ""

    invoke-virtual {v12, v0}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 691
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 694
    goto :goto_3

    .line 692
    :catch_1
    move-exception v13

    .line 693
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "clone Content CloneNotSupportedException "

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    :goto_3
    goto :goto_4

    .line 697
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 699
    :goto_4
    goto :goto_5

    .line 700
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 647
    :cond_6
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 707
    :cond_7
    const-string v0, "FeedbackDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "listData: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    return-void
.end method

.method static synthetic e(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->j()V

    return-void
.end method

.method private f()Lcom/huawei/feedback/bean/f;
    .locals 5

    .line 718
    const/4 v2, 0x0

    .line 720
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 721
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 722
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/bean/f;

    .line 723
    invoke-virtual {v4}, Lcom/huawei/feedback/bean/f;->q()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 724
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 725
    move-object v2, v4

    .line 727
    :cond_0
    goto :goto_0

    .line 728
    :cond_1
    return-object v2
.end method

.method static synthetic f(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->k()V

    return-void
.end method

.method private g()V
    .locals 2

    .line 745
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 746
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->r:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    goto :goto_0

    .line 750
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->r:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 754
    :goto_0
    return-void
.end method

.method static synthetic g(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->h()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 770
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->d(Ljava/lang/String;)V

    .line 772
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 773
    const-string v0, "deleted_id"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 774
    const/16 v0, 0x65

    invoke-virtual {p0, v0, v2}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->setResult(ILandroid/content/Intent;)V

    .line 775
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->finish()V

    .line 776
    return-void
.end method

.method private i()V
    .locals 8

    .line 780
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 781
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "FeedbackApi.getApplicationcontext() null!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 782
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->finish()V

    .line 783
    return-void

    .line 787
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    if-eqz v0, :cond_5

    .line 789
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    .line 791
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->v()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->a(I)V

    goto/16 :goto_2

    .line 794
    :cond_1
    const-string v2, ""

    .line 795
    const-string v3, ""

    .line 796
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 797
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/ui/as;

    .line 798
    invoke-virtual {v4}, Lcom/huawei/feedback/ui/as;->a()Ljava/lang/String;

    move-result-object v2

    .line 799
    invoke-virtual {v4}, Lcom/huawei/feedback/ui/as;->b()Ljava/lang/String;

    move-result-object v3

    .line 801
    :cond_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 803
    const-string v5, ""

    .line 804
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 805
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v5

    .line 808
    :cond_3
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 809
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->finish()V

    .line 810
    return-void

    .line 814
    :cond_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->v()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->a(I)V

    .line 816
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v4}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 817
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v2}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 818
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v3}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 819
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->p(Ljava/lang/String;)V

    .line 821
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/bean/f;->q(Ljava/lang/String;)V

    .line 824
    :try_start_0
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/M/d HH:mm"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v6, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 825
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 827
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0, v7}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 832
    goto :goto_0

    .line 828
    :catch_0
    move-exception v6

    .line 829
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "get date IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 832
    goto :goto_0

    .line 830
    :catch_1
    move-exception v6

    .line 831
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "get date Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 833
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->a(Lcom/huawei/feedback/bean/f;)J

    .line 835
    goto/16 :goto_2

    .line 839
    :cond_5
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 841
    :cond_6
    new-instance v2, Lcom/huawei/feedback/bean/f;

    invoke-direct {v2}, Lcom/huawei/feedback/bean/f;-><init>()V

    .line 842
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 843
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 844
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/feedback/ui/as;

    .line 845
    invoke-virtual {v3}, Lcom/huawei/feedback/ui/as;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 846
    invoke-virtual {v3}, Lcom/huawei/feedback/ui/as;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 850
    :cond_7
    :try_start_1
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/M/d HH:mm"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v3, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 851
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 852
    invoke-virtual {v2, v4}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 857
    goto :goto_1

    .line 853
    :catch_2
    move-exception v3

    .line 854
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "backEvent get date IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 857
    goto :goto_1

    .line 855
    :catch_3
    move-exception v3

    .line 856
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "backEvent get date Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 859
    :goto_1
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 860
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 861
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 863
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->v:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->p(Ljava/lang/String;)V

    .line 864
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->w:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->q(Ljava/lang/String;)V

    .line 866
    invoke-static {v2}, Lcom/huawei/feedback/logic/f;->a(Lcom/huawei/feedback/bean/f;)J

    .line 868
    goto :goto_2

    .line 869
    :cond_8
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->finish()V

    .line 870
    return-void

    .line 877
    :goto_2
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 878
    const-string v0, "pQuestionId"

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 879
    const/16 v0, 0x66

    invoke-virtual {p0, v0, v2}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->setResult(ILandroid/content/Intent;)V

    .line 880
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->finish()V

    .line 881
    return-void
.end method

.method private j()V
    .locals 6

    .line 885
    invoke-static {p0}, Lcom/huawei/phoneserviceuni/common/e/a;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 886
    const-string v0, "feedback_no_network_connection_prompt"

    .line 887
    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    .line 886
    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 888
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 889
    return-void

    .line 892
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 914
    new-instance v3, Lcom/huawei/feedback/bean/f;

    invoke-direct {v3}, Lcom/huawei/feedback/bean/f;-><init>()V

    .line 915
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->u:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 916
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 917
    invoke-virtual {v3, v2}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 918
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 919
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/feedback/ui/as;

    .line 920
    invoke-virtual {v4}, Lcom/huawei/feedback/ui/as;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 921
    invoke-virtual {v4}, Lcom/huawei/feedback/ui/as;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 924
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 926
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->v:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->p(Ljava/lang/String;)V

    .line 927
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->w:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/feedback/bean/f;->q(Ljava/lang/String;)V

    .line 930
    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/M/d HH:mm"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v4, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 931
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 932
    invoke-virtual {v3, v5}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 937
    goto :goto_0

    .line 933
    :catch_0
    move-exception v4

    .line 934
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "sendFeedback get date IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 937
    goto :goto_0

    .line 935
    :catch_1
    move-exception v4

    .line 936
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "sendFeedback get date Exception"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 940
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    if-eqz v0, :cond_2

    .line 942
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->v()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/feedback/logic/f;->a(I)V

    .line 946
    :cond_2
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a()Lcom/huawei/phoneserviceuni/common/e/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/logic/i;

    invoke-direct {v1, v3}, Lcom/huawei/feedback/logic/i;-><init>(Lcom/huawei/feedback/bean/f;)V

    invoke-virtual {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a(Ljava/lang/Runnable;)V

    .line 948
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/huawei/feedback/logic/g;->a(Landroid/content/Context;ILandroid/content/ContentValues;)V

    .line 950
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->finish()V

    .line 952
    return-void
.end method

.method private k()V
    .locals 2

    .line 955
    iget-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->x:Z

    if-nez v0, :cond_1

    .line 958
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/16 v1, 0x1000

    invoke-static {p0, v0, v1}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 960
    return-void

    .line 964
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->x:Z

    .line 965
    const/16 v0, 0xbcd

    invoke-static {p0, v0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;I)V

    .line 967
    :cond_1
    return-void
.end method

.method private l()V
    .locals 2

    .line 971
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 972
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 973
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 974
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 975
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    .line 977
    :cond_0
    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    .line 520
    const/16 v0, 0xbcd

    if-ne p1, v0, :cond_1

    .line 521
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->x:Z

    .line 523
    const/4 v0, -0x1

    if-ne v0, p2, :cond_1

    .line 525
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 526
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 527
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 528
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "feedback_dialog_textview"

    .line 529
    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 530
    const-string v0, "textView"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 531
    const-string v0, "feedback_notify_to_replace_pic"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(I)V

    .line 533
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/h;

    invoke-direct {v1, p0, p3}, Lcom/huawei/feedback/ui/h;-><init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;Landroid/content/Intent;)V

    .line 538
    const v2, 0x1040013

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackDetailActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/feedback/ui/FeedbackDetailActivity$c;-><init>(Lcom/huawei/feedback/ui/b;)V

    .line 547
    const/high16 v2, 0x1040000

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 548
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 549
    goto :goto_0

    .line 551
    :cond_0
    invoke-direct {p0, p3}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Landroid/content/Intent;)V

    .line 599
    :cond_1
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1146
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1147
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->l:Lcom/huawei/feedback/ui/j;

    if-eqz v0, :cond_0

    .line 1148
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->l:Lcom/huawei/feedback/ui/j;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/j;->notifyDataSetChanged()V

    .line 1150
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 135
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 137
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 138
    invoke-virtual {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/feedback/FeedbackApi;->setApplicationcontext(Landroid/content/Context;)V

    .line 140
    :cond_0
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->d()V

    .line 141
    const-string v0, "feedback_detail"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->setContentView(I)V

    .line 142
    const-string v0, "feedback_datail_layout"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/ui/ResizeRelativeLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->i:Lcom/huawei/feedback/ui/ResizeRelativeLayout;

    .line 144
    const-string v0, "feedback_detail_list"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->k:Landroid/widget/ListView;

    .line 146
    const-string v0, "feedback_input_layout"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->m:Landroid/widget/LinearLayout;

    .line 152
    const-string v0, "feedback_edittext_imageview"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    .line 153
    const-string v0, "layout_bottom"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->p:Landroid/widget/RelativeLayout;

    .line 154
    const-string v0, "feedback_delete_image"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->q:Landroid/widget/ImageButton;

    .line 155
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->q:Landroid/widget/ImageButton;

    new-instance v1, Lcom/huawei/feedback/ui/b;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/b;-><init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->m:Landroid/widget/LinearLayout;

    const-string v1, "add_image_btn"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->s:Landroid/widget/ImageButton;

    .line 164
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->m:Landroid/widget/LinearLayout;

    const-string v1, "feedback_send_btn"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->r:Landroid/widget/ImageButton;

    .line 173
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->m:Landroid/widget/LinearLayout;

    const-string v1, "feedback_input_view"

    invoke-static {p0, v1}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    .line 174
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    const/4 v1, 0x1

    new-array v1, v1, [Landroid/text/InputFilter;

    new-instance v2, Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;

    const/16 v3, 0x1f4

    invoke-direct {v2, v3}, Lcom/huawei/phoneserviceuni/common/widget/EditTextInputFilter;-><init>(I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->setFilters([Landroid/text/InputFilter;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->D:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->a(Landroid/os/Handler;)V

    .line 177
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e()V

    .line 185
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c()V

    .line 186
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Landroid/os/Bundle;)V

    .line 197
    invoke-static {}, Lcom/huawei/feedback/logic/g;->c()V

    .line 198
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b()V

    .line 199
    const-string v0, "content_layout"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(ILcom/huawei/feedback/ui/CustomActionBar;)V

    .line 200
    const-string v0, "feedback_input_layout"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->B:Lcom/huawei/feedback/ui/CustomActionBar;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(ILcom/huawei/feedback/ui/CustomActionBar;)V

    .line 201
    const-string v0, "emui_color_gray_1"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-static {p0, v0}, Lcom/huawei/phoneserviceuni/common/e/a;->a(Landroid/app/Activity;I)V

    .line 202
    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 245
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onDestroy()V

    .line 248
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 249
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 250
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->e:Landroid/graphics/Bitmap;

    .line 253
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 510
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 511
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->i()V

    .line 512
    const/4 v0, 0x1

    return v0

    .line 515
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/huawei/feedback/ui/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    .line 473
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    .line 474
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->i()V

    .line 475
    const/4 v0, 0x1

    return v0

    .line 477
    :cond_0
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method protected onPause()V
    .locals 1

    .line 121
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onPause()V

    .line 122
    const-string v0, "onPause"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 123
    const-string v0, "onReport"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 124
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    .line 1160
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 1162
    :sswitch_0
    array-length v0, p3

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 1163
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->x:Z

    .line 1164
    const/16 v0, 0xbcd

    invoke-static {p0, v0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;I)V

    goto/16 :goto_0

    .line 1166
    :cond_0
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "WRITE_EXTERNAL_STORAGE Permission denied!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1167
    const-string v0, "feedback_no_authority_tips"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 1168
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1170
    goto :goto_0

    .line 1173
    :sswitch_1
    array-length v0, p3

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_2

    .line 1175
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1176
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1177
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1178
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/f;->s()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c:Lcom/huawei/feedback/bean/f;

    invoke-virtual {v1}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1182
    :cond_2
    const-string v0, "FeedbackDetailActivity"

    const-string v1, "WRITE_EXTERNAL_STORAGE denied!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1183
    const-string v0, "feedback_no_authority_tips"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 1184
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1185
    invoke-direct {p0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->i()V

    .line 1187
    .line 1192
    :cond_3
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1000 -> :sswitch_0
        0x1001 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onResume()V
    .locals 1

    .line 129
    invoke-super {p0}, Lcom/huawei/feedback/ui/BaseActivity;->onResume()V

    .line 130
    const-string v0, "onResume"

    invoke-static {p0, v0}, Lcom/huawei/feedback/f;->j(Landroid/content/Context;Ljava/lang/String;)V

    .line 131
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 223
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 225
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 227
    :cond_0
    new-instance v2, Lcom/huawei/feedback/bean/f;

    invoke-direct {v2}, Lcom/huawei/feedback/bean/f;-><init>()V

    .line 228
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->n:Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/CustomEdittext/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/feedback/ui/as;

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/feedback/ui/as;

    .line 231
    invoke-virtual {v3}, Lcom/huawei/feedback/ui/as;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 232
    invoke-virtual {v3}, Lcom/huawei/feedback/ui/as;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 235
    :cond_1
    const-string v0, "save_draft_state"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 240
    :cond_2
    invoke-super {p0, p1}, Lcom/huawei/feedback/ui/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 241
    return-void
.end method

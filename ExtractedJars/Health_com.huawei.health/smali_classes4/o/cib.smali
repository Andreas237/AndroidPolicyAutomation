.class public Lo/cib;
.super Lo/dam;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/view/View;

.field private g:I

.field private h:Landroid/graphics/drawable/GradientDrawable;

.field private i:Lo/chv;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Lo/dam;-><init>()V

    .line 30
    const/4 v0, 0x2

    iput v0, p0, Lo/cib;->g:I

    .line 34
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_watermark_4:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cib;->e:Landroid/view/View;

    .line 35
    iget-object v0, p0, Lo/cib;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cib;->b:Landroid/widget/TextView;

    .line 36
    iget-object v0, p0, Lo/cib;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cib;->c:Landroid/widget/ImageView;

    .line 37
    iget-object v0, p0, Lo/cib;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cib;->d:Landroid/widget/TextView;

    .line 38
    iget-object v0, p0, Lo/cib;->e:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_simple_track:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chv;

    iput-object v0, p0, Lo/cib;->i:Lo/chv;

    .line 39
    iget-object v0, p0, Lo/cib;->i:Lo/chv;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-virtual {v0, v1}, Lo/chv;->b(F)V

    .line 40
    invoke-static {p1}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    const/4 v0, 0x3

    iput v0, p0, Lo/cib;->g:I

    .line 43
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_data_watermark_layout_4:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/cib;->a:Landroid/graphics/Bitmap;

    .line 44
    iget-object v0, p0, Lo/cib;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lo/cib;->h:Landroid/graphics/drawable/GradientDrawable;

    .line 45
    const v0, -0xffcce1

    const v1, -0x272728

    invoke-virtual {p0, v0, v1}, Lo/cib;->d(II)V

    .line 46
    return-void
.end method

.method private c(I)V
    .locals 7

    .line 74
    const v3, 0xffffff

    .line 75
    const/high16 v4, 0x7f000000

    .line 76
    and-int v5, v3, p1

    .line 77
    xor-int v6, v4, v5

    .line 78
    iget-object v0, p0, Lo/cib;->h:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v6, v1, v2

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 79
    return-void
.end method


# virtual methods
.method public c()Landroid/view/View;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/cib;->e:Landroid/view/View;

    return-object v0
.end method

.method public final d(II)V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/cib;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    iget-object v0, p0, Lo/cib;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 52
    iget-object v0, p0, Lo/cib;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 53
    iget-object v0, p0, Lo/cib;->i:Lo/chv;

    invoke-virtual {v0, p1}, Lo/chv;->d(I)V

    .line 54
    invoke-direct {p0, p2}, Lo/cib;->c(I)V

    .line 55
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Landroid/graphics/PointF;>;)V"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lo/cib;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    iget-object v0, p0, Lo/cib;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget-object v0, p0, Lo/cib;->i:Lo/chv;

    iget v1, p0, Lo/cib;->g:I

    invoke-virtual {v0, p3, v1}, Lo/chv;->a(Ljava/util/List;I)V

    .line 71
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/cib;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

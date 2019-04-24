.class public Lo/cih;
.super Lo/dam;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/view/View;

.field private c:Landroid/graphics/Bitmap;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private g:Lo/chv;

.field private i:I

.field private k:Landroid/graphics/drawable/GradientDrawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Lo/dam;-><init>()V

    .line 29
    const/4 v0, 0x1

    iput v0, p0, Lo/cih;->i:I

    .line 33
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_share_watermark_5:I

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/cih;->b:Landroid/view/View;

    .line 34
    iget-object v0, p0, Lo/cih;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cih;->d:Landroid/widget/TextView;

    .line 35
    iget-object v0, p0, Lo/cih;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/cih;->a:Landroid/widget/ImageView;

    .line 36
    iget-object v0, p0, Lo/cih;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_watermark_distance_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/cih;->e:Landroid/widget/TextView;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$drawable;->track_share_data_watermark_layout_5:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lo/cih;->c:Landroid/graphics/Bitmap;

    .line 38
    iget-object v0, p0, Lo/cih;->b:Landroid/view/View;

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$id;->track_share_simple_track:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/chv;

    iput-object v0, p0, Lo/cih;->g:Lo/chv;

    .line 39
    iget-object v0, p0, Lo/cih;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iput-object v0, p0, Lo/cih;->k:Landroid/graphics/drawable/GradientDrawable;

    .line 40
    const v0, -0xffcce1

    const v1, -0x272728

    invoke-virtual {p0, v0, v1}, Lo/cih;->d(II)V

    .line 41
    return-void
.end method

.method private b(I)V
    .locals 7

    .line 69
    const v3, 0xffffff

    .line 70
    const/high16 v4, 0x7f000000

    .line 71
    and-int v5, v3, p1

    .line 72
    xor-int v6, v4, v5

    .line 73
    iget-object v0, p0, Lo/cih;->k:Landroid/graphics/drawable/GradientDrawable;

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v6, v1, v2

    const/4 v2, 0x1

    aput v5, v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 74
    return-void
.end method


# virtual methods
.method public c()Landroid/view/View;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/cih;->b:Landroid/view/View;

    return-object v0
.end method

.method public final d(II)V
    .locals 1

    .line 45
    iget-object v0, p0, Lo/cih;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    iget-object v0, p0, Lo/cih;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 47
    iget-object v0, p0, Lo/cih;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 48
    iget-object v0, p0, Lo/cih;->g:Lo/chv;

    invoke-virtual {v0, p1}, Lo/chv;->d(I)V

    .line 49
    invoke-direct {p0, p2}, Lo/cih;->b(I)V

    .line 50
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Landroid/graphics/PointF;>;)V"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lo/cih;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 64
    iget-object v0, p0, Lo/cih;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    iget-object v0, p0, Lo/cih;->g:Lo/chv;

    iget v1, p0, Lo/cih;->i:I

    invoke-virtual {v0, p3, v1}, Lo/chv;->a(Ljava/util/List;I)V

    .line 66
    return-void
.end method

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 59
    iget-object v0, p0, Lo/cih;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method

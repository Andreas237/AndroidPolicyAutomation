.class public Lo/ebj;
.super Landroid/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field private static l:I


# instance fields
.field private a:Lo/ebp;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/Bitmap;>;"
        }
    .end annotation
.end field

.field private c:Lo/ebn;

.field private d:I

.field private e:Landroid/widget/GridView;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dam;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/drawable/Drawable;>;"
        }
    .end annotation
.end field

.field private h:I

.field private i:I

.field private k:Landroid/content/Context;

.field private o:Landroid/graphics/Rect;

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const/4 v0, 0x0

    sput v0, Lo/ebj;->l:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 57
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    .line 43
    const/4 v0, -0x1

    iput v0, p0, Lo/ebj;->i:I

    .line 44
    const/4 v0, -0x1

    iput v0, p0, Lo/ebj;->h:I

    .line 45
    const/4 v0, -0x1

    iput v0, p0, Lo/ebj;->p:I

    .line 47
    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/16 v2, 0x2d0

    const/16 v3, 0x438

    const/16 v4, 0x438

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lo/ebj;->o:Landroid/graphics/Rect;

    .line 59
    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILandroid/content/Context;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/graphics/Bitmap;>;ILandroid/content/Context;Ljava/util/List<Lo/dam;>;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    .line 43
    const/4 v0, -0x1

    iput v0, p0, Lo/ebj;->i:I

    .line 44
    const/4 v0, -0x1

    iput v0, p0, Lo/ebj;->h:I

    .line 45
    const/4 v0, -0x1

    iput v0, p0, Lo/ebj;->p:I

    .line 47
    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, 0x0

    const/16 v2, 0x2d0

    const/16 v3, 0x438

    const/16 v4, 0x438

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lo/ebj;->o:Landroid/graphics/Rect;

    .line 49
    iput-object p3, p0, Lo/ebj;->k:Landroid/content/Context;

    .line 50
    iput-object p1, p0, Lo/ebj;->b:Ljava/util/List;

    .line 51
    iput p2, p0, Lo/ebj;->d:I

    .line 52
    iput-object p4, p0, Lo/ebj;->f:Ljava/util/List;

    .line 53
    invoke-direct {p0}, Lo/ebj;->d()V

    .line 54
    const-string v0, "EditShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "imgArr size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-void
.end method

.method private a(II)V
    .locals 6

    .line 125
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    .line 127
    :pswitch_0
    const-string v0, "EditShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "position = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    if-eqz p2, :cond_2

    .line 129
    iget-object v0, p0, Lo/ebj;->b:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 130
    iget-object v0, p0, Lo/ebj;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/ebj;->o:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ecc;->c(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lo/ebj;->h:I

    .line 131
    iget-object v0, p0, Lo/ebj;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, Lo/ebj;->o:Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ecc;->a(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Lhuawei/android/hwcolorpicker/HwColorPicker$ClientType;)I

    move-result v0

    iput v0, p0, Lo/ebj;->p:I

    .line 132
    const-string v0, "EditShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "widgetColor = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ebj;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    iget-object v0, p0, Lo/ebj;->f:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 135
    iget-object v0, p0, Lo/ebj;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 136
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 137
    iget-object v0, p0, Lo/ebj;->f:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dam;

    iget v1, p0, Lo/ebj;->h:I

    iget v2, p0, Lo/ebj;->p:I

    invoke-virtual {v0, v1, v2}, Lo/dam;->d(II)V

    .line 136
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 139
    :cond_0
    sget v0, Lo/ebj;->l:I

    if-ltz v0, :cond_1

    sget v0, Lo/ebj;->l:I

    if-ge v0, v4, :cond_1

    .line 140
    const-string v0, "EditShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "iconArr size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ebj;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    iget-object v0, p0, Lo/ebj;->f:Ljava/util/List;

    sget v1, Lo/ebj;->l:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dam;

    invoke-virtual {v0}, Lo/dam;->c()Landroid/view/View;

    move-result-object v5

    .line 142
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    iget-object v0, p0, Lo/ebj;->b:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/ebj;->a:Lo/ebp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 143
    iget-object v0, p0, Lo/ebj;->a:Lo/ebp;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p0, Lo/ebj;->b:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap;

    invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-interface {v0, v1, v5, p1, p2}, Lo/ebp;->a(Landroid/graphics/drawable/Drawable;Landroid/view/View;II)V

    .line 146
    :cond_1
    goto :goto_1

    .line 149
    :cond_2
    iget-object v0, p0, Lo/ebj;->a:Lo/ebp;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p1, p2}, Lo/ebp;->a(Landroid/graphics/drawable/Drawable;Landroid/view/View;II)V

    .line 151
    goto :goto_1

    .line 153
    :pswitch_1
    iget-object v0, p0, Lo/ebj;->f:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 154
    iget-object v0, p0, Lo/ebj;->a:Lo/ebp;

    iget-object v1, p0, Lo/ebj;->f:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/dam;

    invoke-virtual {v1}, Lo/dam;->c()Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1, p1, p2}, Lo/ebp;->a(Landroid/graphics/drawable/Drawable;Landroid/view/View;II)V

    .line 155
    sput p2, Lo/ebj;->l:I

    goto :goto_1

    .line 159
    :pswitch_2
    iget-object v0, p0, Lo/ebj;->a:Lo/ebp;

    iget-object v1, p0, Lo/ebj;->g:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p1, p2}, Lo/ebp;->a(Landroid/graphics/drawable/Drawable;Landroid/view/View;II)V

    .line 160
    .line 164
    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static c()V
    .locals 1

    .line 73
    const/4 v0, 0x0

    sput v0, Lo/ebj;->l:I

    .line 74
    return-void
.end method

.method private d()V
    .locals 3

    .line 62
    iget-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_big_watermark1:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    iget-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_big_watermark3:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    iget-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_big_watermark4:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    iget-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_big_watermark5:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_big_watermark9:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_big_watermark10:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_big_watermark11:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object v0, p0, Lo/ebj;->g:Ljava/util/List;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginsocialshare/R$mipmap;->hw_health_edit_share_big_watermark12:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 5

    .line 80
    const-string v0, "EditShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGride_position1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const-string v0, "EditShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGride_position2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ebj;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/ebj;->e:Landroid/widget/GridView;

    if-nez v0, :cond_0

    .line 83
    const-string v0, "EditShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGride_position mGrideView is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    return-void

    .line 86
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/ebj;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_2

    .line 87
    :cond_1
    return-void

    .line 90
    :cond_2
    iget v0, p0, Lo/ebj;->d:I

    if-nez v0, :cond_3

    .line 91
    const-string v0, "EditShareFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGride_position3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-object v0, p0, Lo/ebj;->e:Landroid/widget/GridView;

    invoke-virtual {v0, p1}, Landroid/widget/GridView;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 93
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_select:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 95
    :cond_3
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 2

    .line 168
    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 170
    instance-of v0, p1, Lo/ebp;

    if-eqz v0, :cond_0

    .line 171
    move-object v0, p1

    check-cast v0, Lo/ebp;

    iput-object v0, p0, Lo/ebj;->a:Lo/ebp;

    goto :goto_0

    .line 173
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "activity must implements FragmentInteraction"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 175
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 180
    iget-object v0, p0, Lo/ebj;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ebj;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 181
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 183
    :cond_1
    sget v0, Lcom/huawei/pluginsocialshare/R$layout;->hw_health_edit_share_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 184
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_gridview:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lo/ebj;->e:Landroid/widget/GridView;

    .line 185
    new-instance v0, Lo/ebn;

    iget-object v1, p0, Lo/ebj;->k:Landroid/content/Context;

    iget-object v2, p0, Lo/ebj;->b:Ljava/util/List;

    iget v3, p0, Lo/ebj;->d:I

    invoke-direct {v0, v1, v2, v3}, Lo/ebn;-><init>(Landroid/content/Context;Ljava/util/List;I)V

    iput-object v0, p0, Lo/ebj;->c:Lo/ebn;

    .line 186
    iget-object v0, p0, Lo/ebj;->k:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 187
    iget-object v0, p0, Lo/ebj;->e:Landroid/widget/GridView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    goto :goto_0

    .line 189
    :cond_2
    iget-object v0, p0, Lo/ebj;->e:Landroid/widget/GridView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 191
    :goto_0
    iget-object v0, p0, Lo/ebj;->e:Landroid/widget/GridView;

    iget-object v1, p0, Lo/ebj;->c:Lo/ebn;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 192
    iget-object v0, p0, Lo/ebj;->e:Landroid/widget/GridView;

    invoke-virtual {v0, p0}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 193
    iget-object v0, p0, Lo/ebj;->e:Landroid/widget/GridView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setFocusable(Z)V

    .line 194
    return-object v4
.end method

.method public onDetach()V
    .locals 1

    .line 199
    invoke-super {p0}, Landroid/app/Fragment;->onDetach()V

    .line 200
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ebj;->a:Lo/ebp;

    .line 201
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 99
    iget v0, p0, Lo/ebj;->d:I

    invoke-direct {p0, v0, p3}, Lo/ebj;->a(II)V

    .line 100
    const-string v0, "EditShareFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "EditShare_onItemClick "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 102
    iget v0, p0, Lo/ebj;->d:I

    if-nez v0, :cond_0

    if-nez p3, :cond_0

    .line 103
    return-void

    .line 105
    :cond_0
    invoke-virtual {p1, v4}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 106
    if-ne p3, v4, :cond_1

    .line 107
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_select:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 109
    :cond_1
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_select:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 112
    :goto_1
    iget v0, p0, Lo/ebj;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    if-ne p3, v4, :cond_3

    .line 113
    iget v0, p0, Lo/ebj;->i:I

    if-ne v0, p3, :cond_2

    .line 114
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_select:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 115
    const/4 v0, -0x1

    iput v0, p0, Lo/ebj;->i:I

    goto :goto_2

    .line 117
    :cond_2
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->hw_health_edit_share_select:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 118
    iput p3, p0, Lo/ebj;->i:I

    .line 101
    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 122
    :cond_4
    return-void
.end method

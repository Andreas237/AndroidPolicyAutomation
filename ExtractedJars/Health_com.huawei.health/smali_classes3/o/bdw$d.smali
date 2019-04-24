.class public Lo/bdw$d;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bdw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 178
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lo/bdw$d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 179
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 183
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bdw$d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 184
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 189
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 190
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_photo_grid_item:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 191
    sget v0, Lcom/huawei/android/sns/R$id;->photo_image_view:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bdw$d;->a:Landroid/widget/ImageView;

    .line 192
    sget v0, Lcom/huawei/android/sns/R$id;->sns_photo_select_cb:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lo/bdw$d;->e:Landroid/widget/CheckBox;

    .line 193
    sget v0, Lcom/huawei/android/sns/R$id;->white_view:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bdw$d;->d:Landroid/view/View;

    .line 194
    sget v0, Lcom/huawei/android/sns/R$id;->white_album:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bdw$d;->c:Landroid/view/View;

    .line 195
    invoke-virtual {p0}, Lo/bdw$d;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_checkbox_pic_selector_emui50:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 196
    iget-object v0, p0, Lo/bdw$d;->e:Landroid/widget/CheckBox;

    invoke-virtual {v0, v3}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 197
    iget-object v0, p0, Lo/bdw$d;->e:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setHeight(I)V

    .line 198
    return-void
.end method

.method static synthetic b(Lo/bdw$d;)Landroid/widget/ImageView;
    .locals 1

    .line 156
    iget-object v0, p0, Lo/bdw$d;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lo/bdw$d;)Landroid/view/View;
    .locals 1

    .line 156
    iget-object v0, p0, Lo/bdw$d;->d:Landroid/view/View;

    return-object v0
.end method

.method static synthetic e(Lo/bdw$d;)Landroid/widget/CheckBox;
    .locals 1

    .line 156
    iget-object v0, p0, Lo/bdw$d;->e:Landroid/widget/CheckBox;

    return-object v0
.end method


# virtual methods
.method public getCover()Landroid/view/View;
    .locals 1

    .line 173
    iget-object v0, p0, Lo/bdw$d;->c:Landroid/view/View;

    return-object v0
.end method

.method public getPhotoCheckBox()Landroid/widget/CheckBox;
    .locals 1

    .line 166
    iget-object v0, p0, Lo/bdw$d;->e:Landroid/widget/CheckBox;

    return-object v0
.end method

.class Lo/ezf$k;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "k"
.end annotation


# instance fields
.field b:I

.field d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;II)V
    .locals 0

    .line 200
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 203
    iput p4, p0, Lo/ezf$k;->d:I

    .line 204
    iput p5, p0, Lo/ezf$k;->b:I

    .line 205
    invoke-direct {p0, p2, p3, p4, p5}, Lo/ezf$k;->e(ILjava/lang/String;II)V

    .line 206
    return-void
.end method

.method private e(ILjava/lang/String;II)V
    .locals 8

    .line 209
    invoke-virtual {p0}, Lo/ezf$k;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->view_proportion_each:I

    invoke-static {v0, v1, p0}, Lo/ezf$k;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 211
    sget v0, Lcom/huawei/ui/main/R$id;->image:I

    invoke-virtual {p0, v0}, Lo/ezf$k;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 212
    invoke-virtual {p0}, Lo/ezf$k;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 215
    sget v0, Lcom/huawei/ui/main/R$id;->title:I

    invoke-virtual {p0, v0}, Lo/ezf$k;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 216
    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    sget v0, Lcom/huawei/ui/main/R$id;->value:I

    invoke-virtual {p0, v0}, Lo/ezf$k;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 220
    iget v0, p0, Lo/ezf$k;->d:I

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v7

    .line 221
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    invoke-virtual {v6, p4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 224
    return-void
.end method


# virtual methods
.method public setPercent(I)V
    .locals 6

    .line 227
    iput p1, p0, Lo/ezf$k;->d:I

    .line 229
    sget v0, Lcom/huawei/ui/main/R$id;->value:I

    invoke-virtual {p0, v0}, Lo/ezf$k;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 230
    iget v0, p0, Lo/ezf$k;->d:I

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 231
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    return-void
.end method

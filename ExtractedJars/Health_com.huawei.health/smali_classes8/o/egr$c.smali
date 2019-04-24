.class Lo/egr$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/view/View;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    invoke-direct {p0, p1}, Lo/egr$c;->b(Landroid/content/Context;)V

    .line 183
    return-void
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    .line 190
    const-string v0, "layout_inflater"

    .line 191
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 192
    sget v0, Lcom/huawei/ui/commonui/R$layout;->commonui_loading_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/egr$c;->c:Landroid/view/View;

    .line 194
    iget-object v0, p0, Lo/egr$c;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_rlyt_content:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/egr$c;->b:Landroid/widget/LinearLayout;

    .line 196
    iget-object v0, p0, Lo/egr$c;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_tv_message:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/egr$c;->e:Landroid/widget/TextView;

    .line 198
    iget-object v0, p0, Lo/egr$c;->c:Landroid/view/View;

    sget v1, Lcom/huawei/ui/commonui/R$id;->dialog_pb_progressbar:I

    invoke-static {v0, v1}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/egr$c;->d:Landroid/widget/ImageView;

    .line 199
    iget-object v0, p0, Lo/egr$c;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/graphics/drawable/AnimationDrawable;

    .line 200
    invoke-virtual {v3}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 201
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 224
    iget-object v0, p0, Lo/egr$c;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 225
    iget-object v0, p0, Lo/egr$c;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 226
    iget-object v0, p0, Lo/egr$c;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    return-void
.end method

.method public b()V
    .locals 2

    .line 215
    iget-object v0, p0, Lo/egr$c;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 216
    iget-object v0, p0, Lo/egr$c;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 217
    return-void
.end method

.method public d()Landroid/view/View;
    .locals 1

    .line 208
    iget-object v0, p0, Lo/egr$c;->c:Landroid/view/View;

    return-object v0
.end method

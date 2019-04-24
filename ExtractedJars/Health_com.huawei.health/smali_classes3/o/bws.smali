.class public Lo/bws;
.super Landroid/app/Fragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bws$a;,
        Lo/bws$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/EditText;

.field private c:Lo/bws$a;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/bws;)Landroid/widget/ImageView;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/bws;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method private b()V
    .locals 2

    .line 61
    new-instance v0, Lo/bws$a;

    invoke-direct {v0, p0}, Lo/bws$a;-><init>(Lo/bws;)V

    iput-object v0, p0, Lo/bws;->c:Lo/bws$a;

    .line 62
    iget-object v0, p0, Lo/bws;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bws;->c:Lo/bws$a;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    iget-object v0, p0, Lo/bws;->a:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bws;->c:Lo/bws$a;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    iget-object v0, p0, Lo/bws;->d:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bws;->c:Lo/bws$a;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    iget-object v0, p0, Lo/bws;->b:Landroid/widget/EditText;

    iget-object v1, p0, Lo/bws;->c:Lo/bws$a;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 66
    iget-object v0, p0, Lo/bws;->b:Landroid/widget/EditText;

    iget-object v1, p0, Lo/bws;->c:Lo/bws$a;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 67
    return-void
.end method

.method static synthetic c(Lo/bws;)Landroid/widget/EditText;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/bws;->b:Landroid/widget/EditText;

    return-object v0
.end method

.method private c(Landroid/view/View;)V
    .locals 1

    .line 54
    sget v0, Lcom/huawei/health/suggestion/R$id;->back_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bws;->e:Landroid/widget/ImageView;

    .line 55
    sget v0, Lcom/huawei/health/suggestion/R$id;->search_editText:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lo/bws;->b:Landroid/widget/EditText;

    .line 56
    sget v0, Lcom/huawei/health/suggestion/R$id;->search_cancel_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bws;->a:Landroid/widget/ImageView;

    .line 57
    sget v0, Lcom/huawei/health/suggestion/R$id;->search_ok_imageView:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bws;->d:Landroid/widget/ImageView;

    .line 58
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .line 75
    iget-object v0, p0, Lo/bws;->b:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v0, p0, Lo/bws;->b:Landroid/widget/EditText;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 77
    return-void
.end method

.method public e(Lo/bws$b;)V
    .locals 1

    .line 80
    iget-object v0, p0, Lo/bws;->c:Lo/bws$a;

    invoke-virtual {v0, p1}, Lo/bws$a;->d(Lo/bws$b;)V

    .line 81
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 71
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 72
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 40
    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 41
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 46
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fragment_fit_search_bar:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 47
    invoke-direct {p0, v2}, Lo/bws;->c(Landroid/view/View;)V

    .line 48
    invoke-direct {p0}, Lo/bws;->b()V

    .line 49
    return-object v2
.end method

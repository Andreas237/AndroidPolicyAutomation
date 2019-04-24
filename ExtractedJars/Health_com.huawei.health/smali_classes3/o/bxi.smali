.class public Lo/bxi;
.super Landroid/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxi$e;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lo/egw;

.field private c:Lo/bxi$e;

.field private d:Lo/eha;

.field private e:Landroid/text/InputFilter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    .line 107
    new-instance v0, Lo/bxi$3;

    invoke-direct {v0, p0}, Lo/bxi$3;-><init>(Lo/bxi;)V

    iput-object v0, p0, Lo/bxi;->e:Landroid/text/InputFilter;

    return-void
.end method

.method private b()V
    .locals 3

    .line 92
    iget-object v0, p0, Lo/bxi;->d:Lo/eha;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lo/bxi;->d:Lo/eha;

    iget-object v1, p0, Lo/bxi;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eha;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v0, p0, Lo/bxi;->d:Lo/eha;

    invoke-virtual {v0}, Lo/eha;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 95
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 96
    iget-object v0, p0, Lo/bxi;->d:Lo/eha;

    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eha;->setSelection(I)V

    .line 99
    :cond_0
    return-void
.end method

.method private c()Landroid/view/View;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 85
    invoke-virtual {p0}, Lo/bxi;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_edit_plan_name:I

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lo/bxi;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 86
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_edit_plan_name:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/eha;

    iput-object v0, p0, Lo/bxi;->d:Lo/eha;

    .line 87
    iget-object v0, p0, Lo/bxi;->d:Lo/eha;

    invoke-direct {p0, v0}, Lo/bxi;->d(Landroid/widget/EditText;)V

    .line 88
    return-object v4
.end method

.method static synthetic c(Lo/bxi;)Lo/eha;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bxi;->d:Lo/eha;

    return-object v0
.end method

.method private d(Landroid/widget/EditText;)V
    .locals 2

    .line 102
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Landroid/widget/EditText;->getFilters()[Landroid/text/InputFilter;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 103
    iget-object v0, p0, Lo/bxi;->e:Landroid/text/InputFilter;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Landroid/text/InputFilter;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/text/InputFilter;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    .line 105
    return-void
.end method

.method static synthetic e(Lo/bxi;)Lo/bxi$e;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bxi;->c:Lo/bxi$e;

    return-object v0
.end method

.method private e()Lo/egw;
    .locals 5

    .line 47
    invoke-virtual {p0}, Lo/bxi;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 48
    new-instance v0, Lo/egw$c;

    invoke-virtual {p0}, Lo/bxi;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 49
    invoke-virtual {v0, v3}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    .line 50
    invoke-direct {p0}, Lo/bxi;->c()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lo/bxi$1;

    invoke-direct {v2, p0}, Lo/bxi$1;-><init>(Lo/bxi;)V

    .line 51
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    new-instance v2, Lo/bxi$2;

    invoke-direct {v2, p0}, Lo/bxi$2;-><init>(Lo/bxi;)V

    .line 57
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 66
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egw;->setCanceledOnTouchOutside(Z)V

    .line 67
    return-object v4
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lo/bxi;->a:Ljava/lang/String;

    .line 72
    invoke-direct {p0}, Lo/bxi;->b()V

    .line 73
    return-void
.end method

.method public e(Lo/bxi$e;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lo/bxi;->c:Lo/bxi$e;

    .line 77
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/bxi;->b:Lo/egw;

    if-nez v0, :cond_0

    .line 40
    invoke-direct {p0}, Lo/bxi;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/bxi;->b:Lo/egw;

    .line 41
    invoke-direct {p0}, Lo/bxi;->b()V

    .line 43
    :cond_0
    iget-object v0, p0, Lo/bxi;->b:Lo/egw;

    return-object v0
.end method

.class public Lo/egf;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egf$d;
    }
.end annotation


# instance fields
.field private a:[Ljava/lang/String;

.field private b:[Z

.field private c:Landroid/content/Context;

.field private d:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;[ZLandroid/widget/AdapterView$OnItemClickListener;)V
    .locals 2

    .line 37
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 38
    invoke-virtual {p2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/egf;->a:[Ljava/lang/String;

    .line 39
    invoke-virtual {p3}, [Z->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    iput-object v0, p0, Lo/egf;->b:[Z

    .line 40
    iput-object p1, p0, Lo/egf;->c:Landroid/content/Context;

    .line 41
    iget-object v0, p0, Lo/egf;->c:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lo/egf;->d:Landroid/view/LayoutInflater;

    .line 43
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 47
    iget-object v0, p0, Lo/egf;->a:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/egf;->a:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 57
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 63
    iget-object v0, p0, Lo/egf;->a:[Ljava/lang/String;

    aget-object v4, v0, p1

    .line 64
    if-nez p2, :cond_0

    .line 65
    iget-object v0, p0, Lo/egf;->d:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/commonui/R$layout;->commonui_dialog_single_choice_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 67
    new-instance v3, Lo/egf$d;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/egf$d;-><init>(Lo/egf$4;)V

    .line 69
    sget v0, Lcom/huawei/ui/commonui/R$id;->contact_name:I

    .line 70
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/egf$d;->e:Landroid/widget/TextView;

    .line 71
    sget v0, Lcom/huawei/ui/commonui/R$id;->line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lo/egf$d;->b:Landroid/widget/ImageView;

    .line 72
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/egf$d;

    .line 77
    :goto_0
    iget-object v0, v3, Lo/egf$d;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    sget v0, Lcom/huawei/ui/commonui/R$id;->chk_selectone:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    .line 79
    iput-object v5, v3, Lo/egf$d;->a:Landroid/widget/CheckBox;

    .line 80
    iget-object v0, v3, Lo/egf$d;->a:Landroid/widget/CheckBox;

    iget-object v1, p0, Lo/egf;->b:[Z

    aget-boolean v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 81
    iget-object v0, p0, Lo/egf;->a:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 82
    iget-object v0, v3, Lo/egf$d;->b:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 84
    :cond_1
    iget-object v0, v3, Lo/egf$d;->b:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 86
    :goto_1
    return-object p2
.end method

.class public Lo/egh;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/egh$b;,
        Lo/egh$e;
    }
.end annotation


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private c:[Z

.field private d:[Ljava/lang/String;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;[Z)V
    .locals 2

    .line 33
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 68
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lo/egh;->b:Landroid/util/SparseArray;

    .line 34
    invoke-virtual {p2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/egh;->d:[Ljava/lang/String;

    .line 35
    invoke-virtual {p3}, [Z->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    iput-object v0, p0, Lo/egh;->c:[Z

    .line 36
    iput-object p1, p0, Lo/egh;->e:Landroid/content/Context;

    .line 37
    iget-object v0, p0, Lo/egh;->e:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lo/egh;->a:Landroid/view/LayoutInflater;

    .line 38
    return-void
.end method


# virtual methods
.method public d()[Z
    .locals 5

    .line 60
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Lo/egh;->getCount()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 61
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v0, v1}, Lo/egh;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 62
    sget v0, Lcom/huawei/ui/commonui/R$id;->chk_selectone:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/CheckBox;

    .line 63
    iget-object v0, p0, Lo/egh;->c:[Z

    invoke-virtual {v4}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    aput-boolean v1, v0, v2

    .line 60
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 65
    :cond_0
    iget-object v0, p0, Lo/egh;->c:[Z

    invoke-virtual {v0}, [Z->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 42
    iget-object v0, p0, Lo/egh;->d:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/egh;->d:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 52
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 71
    const/4 v3, 0x0

    .line 73
    iget-object v0, p0, Lo/egh;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 74
    iget-object v0, p0, Lo/egh;->a:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/commonui/R$layout;->commonui_dialog_multi_choice_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 75
    new-instance v3, Lo/egh$e;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/egh$e;-><init>(Lo/egh$2;)V

    .line 76
    sget v0, Lcom/huawei/ui/commonui/R$id;->contact_name:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/egh$e;->a:Landroid/widget/TextView;

    .line 77
    sget v0, Lcom/huawei/ui/commonui/R$id;->clock_line:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lo/egh$e;->d:Landroid/widget/ImageView;

    .line 78
    sget v0, Lcom/huawei/ui/commonui/R$id;->chk_selectone:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, v3, Lo/egh$e;->c:Landroid/widget/CheckBox;

    .line 79
    iget-object v0, p0, Lo/egh;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 80
    iget-object v0, p0, Lo/egh;->d:[Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/egh;->d:[Ljava/lang/String;

    array-length v0, v0

    if-lez v0, :cond_2

    .line 81
    iget-object v0, p0, Lo/egh;->d:[Ljava/lang/String;

    aget-object v5, v0, p1

    .line 82
    iget-object v0, v3, Lo/egh$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    iget-object v0, p0, Lo/egh;->c:[Z

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, v3, Lo/egh$e;->c:Landroid/widget/CheckBox;

    iget-object v1, p0, Lo/egh;->c:[Z

    aget-boolean v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, v3, Lo/egh$e;->c:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 88
    :goto_0
    iget-object v0, p0, Lo/egh;->d:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 89
    iget-object v0, v3, Lo/egh$e;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 91
    :cond_1
    iget-object v0, v3, Lo/egh$e;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 95
    :cond_2
    :goto_1
    invoke-virtual {v4, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_2

    .line 97
    :cond_3
    iget-object v0, p0, Lo/egh;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    .line 99
    :goto_2
    return-object v4
.end method

.class public Lo/fcm;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fcm$b;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/content/Context;

.field private c:Landroid/view/LayoutInflater;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lo/fcm;->a:I

    .line 26
    iput-object p1, p0, Lo/fcm;->b:Landroid/content/Context;

    .line 27
    iput-object p2, p0, Lo/fcm;->e:Ljava/util/ArrayList;

    .line 28
    iput p3, p0, Lo/fcm;->a:I

    .line 29
    iget-object v0, p0, Lo/fcm;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lo/fcm;->c:Landroid/view/LayoutInflater;

    .line 30
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 34
    iget-object v0, p0, Lo/fcm;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 44
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 51
    if-nez p2, :cond_0

    .line 52
    new-instance v3, Lo/fcm$b;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lo/fcm$b;-><init>(Lo/fcm$2;)V

    .line 53
    iget-object v0, p0, Lo/fcm;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->health_healthdata_horizontallist_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 54
    sget v0, Lcom/huawei/ui/main/R$id;->text_list_item:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v3, v0}, Lo/fcm$b;->d(Lo/fcm$b;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 55
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fcm$b;

    .line 59
    :goto_0
    iget v0, p0, Lo/fcm;->a:I

    if-ne p1, v0, :cond_1

    .line 60
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    .line 61
    invoke-static {v3}, Lo/fcm$b;->d(Lo/fcm$b;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_user_sel_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_1

    .line 63
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    .line 64
    invoke-static {v3}, Lo/fcm$b;->d(Lo/fcm$b;)Landroid/widget/TextView;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_healthdata_user_nor_bg:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 67
    :goto_1
    invoke-static {v3}, Lo/fcm$b;->d(Lo/fcm$b;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/fcm;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    return-object p2
.end method

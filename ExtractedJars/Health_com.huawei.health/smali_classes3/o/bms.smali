.class public Lo/bms;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bms$b;,
        Lo/bms$d;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/PopupWindow;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/AssistantMenu;>;"
        }
    .end annotation
.end field

.field private d:Lo/bnw;

.field private e:Lo/bms$d;

.field private f:Landroid/view/View;

.field private g:I

.field private h:Lo/bms$b;

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLo/bms$b;)V
    .locals 3

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lo/bms;->k:I

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lo/bms;->g:I

    .line 80
    iput-object p1, p0, Lo/bms;->b:Landroid/content/Context;

    .line 81
    iput-object p3, p0, Lo/bms;->h:Lo/bms$b;

    .line 82
    if-eqz p2, :cond_0

    .line 84
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_assist_pop_menu_emui50:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bms;->f:Landroid/view/View;

    goto :goto_0

    .line 88
    :cond_0
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_assist_pop_menu:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lo/bms;->f:Landroid/view/View;

    .line 90
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bms;->c:Ljava/util/ArrayList;

    .line 92
    iget-object v0, p0, Lo/bms;->f:Landroid/view/View;

    sget v1, Lcom/huawei/android/sns/R$id;->sns_menu_list:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bnw;

    iput-object v0, p0, Lo/bms;->d:Lo/bnw;

    .line 94
    iget-object v0, p0, Lo/bms;->d:Lo/bnw;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/bnw;->setOverScrollMode(I)V

    .line 95
    iget-object v0, p0, Lo/bms;->d:Lo/bnw;

    invoke-virtual {v0, p0}, Lo/bnw;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 96
    new-instance v0, Lo/bms$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bms$d;-><init>(Lo/bms;Lo/bms$2;)V

    iput-object v0, p0, Lo/bms;->e:Lo/bms$d;

    .line 97
    iget-object v0, p0, Lo/bms;->d:Lo/bnw;

    iget-object v1, p0, Lo/bms;->e:Lo/bms$d;

    invoke-virtual {v0, v1}, Lo/bnw;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 99
    return-void
.end method

.method static synthetic d(Lo/bms;)Ljava/util/ArrayList;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bms;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic e(Lo/bms;)Landroid/content/Context;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bms;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 163
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    .line 164
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 163
    :goto_0
    return v0
.end method

.method public b()Lo/bms;
    .locals 4

    .line 108
    new-instance v0, Landroid/widget/PopupWindow;

    iget-object v1, p0, Lo/bms;->f:Landroid/view/View;

    const/4 v2, -0x2

    const/4 v3, -0x2

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    .line 109
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 112
    return-object p0
.end method

.method public b(Ljava/util/ArrayList;)Lo/bms;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/AssistantMenu;>;)Lo/bms;"
        }
    .end annotation

    .line 118
    iput-object p1, p0, Lo/bms;->c:Ljava/util/ArrayList;

    .line 119
    iget-object v0, p0, Lo/bms;->e:Lo/bms$d;

    invoke-virtual {v0}, Lo/bms$d;->notifyDataSetChanged()V

    .line 120
    return-object p0
.end method

.method public b(Landroid/view/View;)V
    .locals 3

    .line 145
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 147
    return-void

    .line 152
    :cond_0
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    iget v1, p0, Lo/bms;->g:I

    iget v2, p0, Lo/bms;->k:I

    neg-int v2, v2

    invoke-virtual {v0, p1, v1, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 154
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 156
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 158
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->update()V

    .line 159
    return-void
.end method

.method public c()V
    .locals 1

    .line 170
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 172
    return-void

    .line 174
    :cond_0
    iget-object v0, p0, Lo/bms;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 175
    return-void
.end method

.method public d(II)Lo/bms;
    .locals 3

    .line 133
    const/16 v0, 0x14

    if-ge p1, v0, :cond_0

    .line 135
    const/16 p1, 0x14

    .line 137
    :cond_0
    iput p1, p0, Lo/bms;->g:I

    .line 138
    iget-object v0, p0, Lo/bms;->d:Lo/bnw;

    invoke-virtual {v0}, Lo/bnw;->getDividerHeight()I

    move-result v0

    iget-object v1, p0, Lo/bms;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    mul-int/2addr v0, v1

    add-int/2addr v0, p2

    iput v0, p0, Lo/bms;->k:I

    .line 139
    return-object p0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 267
    invoke-virtual {p0}, Lo/bms;->c()V

    .line 268
    iget-object v0, p0, Lo/bms;->h:Lo/bms$b;

    iget-object v1, p0, Lo/bms;->e:Lo/bms$d;

    invoke-virtual {v1, p3}, Lo/bms$d;->e(I)Lcom/huawei/health/sns/model/chat/AssistantMenu;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bms$b;->d(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V

    .line 269
    return-void
.end method

.class public Lo/epc;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 16
    iput-object p1, p0, Lo/epc;->e:Landroid/content/Context;

    .line 17
    invoke-direct {p0}, Lo/epc;->b()V

    .line 18
    return-void
.end method

.method private b()V
    .locals 3

    .line 21
    iget-object v0, p0, Lo/epc;->e:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 22
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->recyclerview_slide_menu_layout:I

    invoke-virtual {v2, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 23
    return-void
.end method

.class public Lo/equ;
.super Lo/erc;
.source "SourceFile"


# instance fields
.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/content/Context;Z)V
    .locals 1

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 24
    sget v0, Lcom/huawei/ui/homehealth/R$id;->opera_msg_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/equ;->b:Landroid/widget/TextView;

    .line 25
    sget v0, Lcom/huawei/ui/homehealth/R$id;->opera_msg_layout:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lo/equ;->c:Landroid/widget/RelativeLayout;

    .line 26
    return-void
.end method

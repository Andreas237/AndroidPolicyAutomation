.class public Lo/eqt;
.super Lo/eqv;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private d:I

.field private e:Lo/equ;

.field private h:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 63
    invoke-direct {p0}, Lo/eqv;-><init>()V

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lo/eqt;->d:I

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lo/eqt;->b:I

    .line 60
    const-string v0, ""

    iput-object v0, p0, Lo/eqt;->h:Ljava/lang/String;

    .line 61
    const-string v0, ""

    iput-object v0, p0, Lo/eqt;->k:Ljava/lang/String;

    .line 64
    const-string v0, "OperaMSGCardData-OperaMSGCardData constructor enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 65
    iput-object p1, p0, Lo/eqt;->a:Landroid/content/Context;

    .line 67
    const-string v0, "OperaMSGCardData-OperaMSGCardData constructor end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 68
    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 94
    const-string v0, "OperaMSGCardData-getCardViewHolder enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 95
    new-instance v0, Lo/equ;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->home_item_layout_opera_msg:I

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lo/eqt;->a:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/equ;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    iput-object v0, p0, Lo/eqt;->e:Lo/equ;

    .line 97
    iget-object v0, p0, Lo/eqt;->e:Lo/equ;

    iget-object v0, v0, Lo/equ;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    invoke-virtual {p0}, Lo/eqt;->b()V

    .line 99
    const-string v0, "OperaMSGCardData-getCardViewHolder end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lo/eqt;->e:Lo/equ;

    return-object v0
.end method

.method public b()V
    .locals 0

    .line 134
    return-void
.end method

.method public d()V
    .locals 4

    .line 72
    invoke-super {p0}, Lo/eqv;->d()V

    .line 73
    const-string v0, "OperaMSGCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====onResume===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    invoke-virtual {p0}, Lo/eqt;->b()V

    .line 75
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/ui/homehealth/R$id;->opera_msg_layout:I

    if-ne v0, v1, :cond_0

    .line 80
    const-string v0, "OperaMSGCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "operaMsg click"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 82
    const-string v0, "id"

    iget v1, p0, Lo/eqt;->b:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 83
    const-string v0, "msgType"

    iget v1, p0, Lo/eqt;->d:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 84
    const-string v0, "msgContent"

    iget-object v1, p0, Lo/eqt;->h:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 85
    const-string v0, "msgTitle"

    iget-object v1, p0, Lo/eqt;->k:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    const-string v0, "from"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 87
    iget-object v0, p0, Lo/eqt;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/smartcenter/activity/SmartMsgSkipActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 88
    iget-object v0, p0, Lo/eqt;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 90
    :cond_0
    return-void
.end method

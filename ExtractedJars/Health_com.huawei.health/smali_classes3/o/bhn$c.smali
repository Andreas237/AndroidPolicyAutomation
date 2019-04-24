.class public Lo/bhn$c;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/bhn;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lo/bhn;Landroid/view/View;)V
    .locals 1

    .line 90
    iput-object p1, p0, Lo/bhn$c;->a:Lo/bhn;

    .line 91
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 92
    sget v0, Lcom/huawei/android/sns/R$id;->help_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhn$c;->d:Landroid/widget/TextView;

    .line 93
    sget v0, Lcom/huawei/android/sns/R$id;->help_context:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bhn$c;->c:Landroid/widget/TextView;

    .line 94
    return-void
.end method

.method static synthetic b(Lo/bhn$c;)Landroid/widget/TextView;
    .locals 1

    .line 85
    iget-object v0, p0, Lo/bhn$c;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lo/bhn$c;)Landroid/widget/TextView;
    .locals 1

    .line 85
    iget-object v0, p0, Lo/bhn$c;->d:Landroid/widget/TextView;

    return-object v0
.end method

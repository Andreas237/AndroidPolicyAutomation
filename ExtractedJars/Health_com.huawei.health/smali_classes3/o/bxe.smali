.class public Lo/bxe;
.super Landroid/app/DialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxe$b;
    }
.end annotation


# instance fields
.field private a:Lo/egw;

.field private b:Lo/bze;

.field private c:I

.field private d:Lo/bxe$b;

.field private e:I

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method static synthetic b(Lo/bxe;)Lo/bxe$b;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/bxe;->d:Lo/bxe$b;

    return-object v0
.end method

.method private c()Lo/egw;
    .locals 4

    .line 49
    invoke-virtual {p0}, Lo/bxe;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 50
    new-instance v0, Lo/bze;

    invoke-virtual {p0}, Lo/bxe;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/bze;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/bxe;->b:Lo/bze;

    .line 51
    new-instance v0, Lo/egw$c;

    invoke-virtual {p0}, Lo/bxe;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 52
    invoke-virtual {v0, v3}, Lo/egw$c;->e(I)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lo/bxe;->b:Lo/bze;

    .line 53
    invoke-virtual {v0, v1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_cancal:I

    new-instance v2, Lo/bxe$1;

    invoke-direct {v2, p0}, Lo/bxe$1;-><init>(Lo/bxe;)V

    .line 54
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_plugin_fitnessadvice_ok:I

    new-instance v2, Lo/bxe$3;

    invoke-direct {v2, p0}, Lo/bxe$3;-><init>(Lo/bxe;)V

    .line 59
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    .line 51
    return-object v0
.end method

.method static synthetic e(Lo/bxe;)Lo/bze;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/bxe;->b:Lo/bze;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 71
    iget-object v0, p0, Lo/bxe;->b:Lo/bze;

    iget v1, p0, Lo/bxe;->c:I

    invoke-virtual {v0, v1}, Lo/bze;->setStartTime(I)V

    .line 72
    iget v0, p0, Lo/bxe;->k:I

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lo/bxe;->b:Lo/bze;

    iget v1, p0, Lo/bxe;->k:I

    invoke-virtual {v0, v1}, Lo/bze;->setEndTime(I)V

    .line 75
    :cond_0
    iget-object v0, p0, Lo/bxe;->b:Lo/bze;

    iget v1, p0, Lo/bxe;->e:I

    invoke-virtual {v0, v1}, Lo/bze;->setTime(I)V

    .line 76
    return-void
.end method


# virtual methods
.method public b(III)V
    .locals 0

    .line 35
    iput p1, p0, Lo/bxe;->e:I

    .line 36
    iput p2, p0, Lo/bxe;->c:I

    .line 37
    iput p3, p0, Lo/bxe;->k:I

    .line 38
    return-void
.end method

.method public d(Lo/bxe$b;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lo/bxe;->d:Lo/bxe$b;

    .line 42
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/bxe;->a:Lo/egw;

    if-nez v0, :cond_0

    .line 28
    invoke-direct {p0}, Lo/bxe;->c()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/bxe;->a:Lo/egw;

    .line 30
    :cond_0
    invoke-direct {p0}, Lo/bxe;->e()V

    .line 31
    iget-object v0, p0, Lo/bxe;->a:Lo/egw;

    return-object v0
.end method

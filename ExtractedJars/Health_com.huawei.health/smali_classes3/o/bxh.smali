.class public Lo/bxh;
.super Landroid/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bxh$c;
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/widget/CheckBox;>;"
        }
    .end annotation
.end field

.field private b:Lo/bxh$c;

.field private c:I

.field private d:Lo/egw;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bxh;->a:Ljava/util/ArrayList;

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bxh;->e:Ljava/util/ArrayList;

    return-void
.end method

.method private d(Landroid/app/Activity;)Landroid/view/View;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 45
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_run_dialog_distance:I

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    .line 46
    iget-object v0, p0, Lo/bxh;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_cb_5km:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    iget-object v0, p0, Lo/bxh;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_cb_10km:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    iget-object v0, p0, Lo/bxh;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_cb_half_marathon:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    iget-object v0, p0, Lo/bxh;->a:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_cb_marathon:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    iget-object v0, p0, Lo/bxh;->e:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_ll_option_5km:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    iget-object v0, p0, Lo/bxh;->e:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_ll_option_10km:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    iget-object v0, p0, Lo/bxh;->e:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_ll_option_half_marathon:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    iget-object v0, p0, Lo/bxh;->e:Ljava/util/ArrayList;

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_ll_option_marathon:I

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    invoke-direct {p0, v4}, Lo/bxh;->d(Landroid/view/View;)V

    .line 55
    invoke-virtual {p0}, Lo/bxh;->b()V

    .line 56
    return-object v4
.end method

.method private d(Landroid/view/View;)V
    .locals 8

    .line 60
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_10km:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0xa

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 61
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_5km:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_km:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x5

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 62
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_txt:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_mile:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide v3, 0x402a333333333333L    # 13.1

    invoke-static {v3, v4}, Lo/buk;->e(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0xd

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 64
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_ability_marathon:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    sget v1, Lcom/huawei/health/suggestion/R$plurals;->sug_mile:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-wide v3, 0x403a333333333333L    # 26.2

    invoke-static {v3, v4}, Lo/buk;->e(D)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/16 v3, 0x1a

    invoke-static {v1, v3, v2}, Lo/buk;->e(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 67
    :cond_0
    iget-object v0, p0, Lo/bxh;->a:Ljava/util/ArrayList;

    iget v1, p0, Lo/bxh;->c:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 69
    const/4 v7, 0x0

    :goto_0
    iget v0, p0, Lo/bxh;->c:I

    if-gt v7, v0, :cond_1

    .line 70
    iget-object v0, p0, Lo/bxh;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 69
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 72
    :cond_1
    return-void
.end method

.method private e(I)V
    .locals 4

    .line 95
    iget-object v0, p0, Lo/bxh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/CheckBox;

    .line 96
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    iget-object v0, p0, Lo/bxh;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 99
    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 75
    iget v0, p0, Lo/bxh;->c:I

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lo/bxh;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    .line 77
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    goto :goto_0

    .line 80
    :cond_0
    return-void
.end method

.method public e(Lo/bxh$c;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/bxh;->b:Lo/bxh$c;

    .line 103
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 84
    iget-object v0, p0, Lo/bxh;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 85
    if-ltz v2, :cond_0

    .line 86
    iget-object v0, p0, Lo/bxh;->b:Lo/bxh$c;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lo/bxh;->b:Lo/bxh$c;

    add-int/lit8 v1, v2, 0x0

    invoke-interface {v0, v1}, Lo/bxh$c;->b(I)V

    .line 88
    invoke-direct {p0, v2}, Lo/bxh;->e(I)V

    .line 91
    :cond_0
    invoke-virtual {p0}, Lo/bxh;->dismiss()V

    .line 92
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 36
    iget-object v0, p0, Lo/bxh;->d:Lo/egw;

    if-nez v0, :cond_0

    .line 37
    invoke-virtual {p0}, Lo/bxh;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "goal"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lo/bxh;->c:I

    .line 38
    new-instance v0, Lo/egw$c;

    invoke-virtual {p0}, Lo/bxh;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lo/bxh;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {p0, v1}, Lo/bxh;->d(Landroid/app/Activity;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lo/bxh;->d:Lo/egw;

    .line 40
    :cond_0
    iget-object v0, p0, Lo/bxh;->d:Lo/egw;

    return-object v0
.end method

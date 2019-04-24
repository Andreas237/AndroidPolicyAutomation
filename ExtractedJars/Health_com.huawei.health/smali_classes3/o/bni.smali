.class public Lo/bni;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bni$d;
    }
.end annotation


# instance fields
.field private a:Lo/bni$d;

.field private b:Landroid/widget/LinearLayout;

.field private c:Lo/egd;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private g:Ljava/lang/String;

.field private h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 106
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bni;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 107
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 111
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bni;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 112
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 116
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    invoke-virtual {p0}, Lo/bni;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_network_error_retry:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bni;->g:Ljava/lang/String;

    .line 117
    invoke-direct {p0, p1}, Lo/bni;->e(Landroid/content/Context;)V

    .line 118
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 4

    .line 122
    invoke-virtual {p0}, Lo/bni;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 123
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_net_work_layout:I

    const/4 v1, 0x1

    invoke-virtual {v2, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 124
    sget v0, Lcom/huawei/android/sns/R$id;->no_data_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/bni;->b:Landroid/widget/LinearLayout;

    .line 125
    sget v0, Lcom/huawei/android/sns/R$id;->no_net_imageview:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bni;->e:Landroid/widget/ImageView;

    .line 126
    sget v0, Lcom/huawei/android/sns/R$id;->no_net_textview:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bni;->d:Landroid/widget/TextView;

    .line 127
    sget v0, Lcom/huawei/android/sns/R$id;->set_net_button:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/bni;->c:Lo/egd;

    .line 128
    iget-object v0, p0, Lo/bni;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    iget-object v0, p0, Lo/bni;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    iget-object v0, p0, Lo/bni;->c:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 133
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Lo/bni;->c:Lo/egd;

    invoke-static {v0, v1}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 134
    iget-object v0, p0, Lo/bni;->b:Landroid/widget/LinearLayout;

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 136
    :cond_0
    return-void
.end method


# virtual methods
.method public getTip()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/bni;->g:Ljava/lang/String;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 148
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->no_net_imageview:I

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->no_net_textview:I

    if-ne v0, v1, :cond_1

    .line 150
    :cond_0
    iget-object v0, p0, Lo/bni;->a:Lo/bni$d;

    if-eqz v0, :cond_2

    .line 152
    iget-object v0, p0, Lo/bni;->a:Lo/bni$d;

    invoke-interface {v0}, Lo/bni$d;->k()V

    goto :goto_0

    .line 155
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/huawei/android/sns/R$id;->set_net_button:I

    if-ne v0, v1, :cond_2

    .line 157
    invoke-virtual {p0}, Lo/bni;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/boc;->a(Landroid/content/Context;)V

    .line 159
    :cond_2
    :goto_0
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 141
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 142
    iget-object v0, p0, Lo/bni;->b:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lo/bni;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    invoke-static {v0, v1}, Lo/bph;->b(Landroid/widget/LinearLayout;Landroid/app/Activity;)V

    .line 143
    return-void
.end method

.method public setCallBack(Lo/bni$d;)V
    .locals 2

    .line 77
    iput-object p1, p0, Lo/bni;->a:Lo/bni$d;

    .line 78
    if-eqz p1, :cond_2

    .line 80
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/bni;->setVisibility(I)V

    .line 81
    iget-object v0, p0, Lo/bni;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/bni;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bni;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    :cond_0
    iget-object v0, p0, Lo/bni;->c:Lo/egd;

    if-eqz v0, :cond_2

    .line 87
    iget-boolean v0, p0, Lo/bni;->h:Z

    if-eqz v0, :cond_1

    .line 89
    iget-object v0, p0, Lo/bni;->c:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 93
    :cond_1
    iget-object v0, p0, Lo/bni;->c:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 97
    :cond_2
    :goto_0
    return-void
.end method

.method public setShowNetWorkButton(Z)V
    .locals 0

    .line 72
    iput-boolean p1, p0, Lo/bni;->h:Z

    .line 73
    return-void
.end method

.method public setTip(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/bni;->g:Ljava/lang/String;

    .line 63
    return-void
.end method

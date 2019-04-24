.class public Lo/eyt$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "b"
.end annotation


# instance fields
.field protected a:Landroid/view/View$OnClickListener;

.field protected b:Z

.field protected c:Lo/eii;

.field final synthetic d:Lo/eyt;

.field protected e:Lo/ehe$a;


# direct methods
.method protected constructor <init>(Lo/eyt;)V
    .locals 1

    .line 76
    iput-object p1, p0, Lo/eyt$b;->d:Lo/eyt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyt$b;->b:Z

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyt$b;->c:Lo/eii;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eyt$b;->e:Lo/ehe$a;

    .line 81
    new-instance v0, Lo/eyt$b$5;

    invoke-direct {v0, p0}, Lo/eyt$b$5;-><init>(Lo/eyt$b;)V

    iput-object v0, p0, Lo/eyt$b;->a:Landroid/view/View$OnClickListener;

    return-void
.end method

.method private f()V
    .locals 2

    .line 196
    iget-boolean v0, p0, Lo/eyt$b;->b:Z

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 198
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 199
    return-void

    .line 202
    :cond_0
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->c:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 203
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 204
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .line 140
    iget-boolean v0, p0, Lo/eyt$b;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/eyt$b;->c:Lo/eii;

    if-nez v0, :cond_1

    .line 141
    :cond_0
    return-void

    .line 143
    :cond_1
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->f:Lo/ezh;

    iget-object v1, p0, Lo/eyt$b;->c:Lo/eii;

    invoke-virtual {v0, v1}, Lo/ezh;->d(Lo/eii;)V

    .line 144
    invoke-virtual {p0}, Lo/eyt$b;->k()V

    .line 145
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eyt$b;->b:Z

    .line 146
    return-void
.end method

.method protected b()V
    .locals 3

    .line 126
    iget-boolean v0, p0, Lo/eyt$b;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/eyt$b;->c:Lo/eii;

    if-nez v0, :cond_1

    .line 127
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "addSuperLayer failed,current has SuperLayer!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 134
    :cond_1
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->f:Lo/ezh;

    iget-object v1, p0, Lo/eyt$b;->c:Lo/eii;

    iget-object v2, p0, Lo/eyt$b;->e:Lo/ehe$a;

    invoke-virtual {v0, v1, v2}, Lo/ezh;->b(Lo/eii;Lo/ehe$a;)V

    .line 135
    invoke-virtual {p0}, Lo/eyt$b;->h()V

    .line 136
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eyt$b;->b:Z

    .line 137
    return-void
.end method

.method protected c()V
    .locals 1

    .line 116
    invoke-virtual {p0}, Lo/eyt$b;->b()V

    .line 117
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->d:Lo/ezj;

    invoke-virtual {p0, v0}, Lo/eyt$b;->e(Landroid/view/View;)V

    .line 118
    return-void
.end method

.method protected c(ZZ)V
    .locals 2

    .line 99
    if-ne p1, p2, :cond_0

    .line 100
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Can not focus two item in the same time"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_0
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->e:Lo/ezj;

    invoke-virtual {v0, p1}, Lo/ezj;->a(Z)V

    .line 103
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->d:Lo/ezj;

    invoke-virtual {v0, p2}, Lo/ezj;->a(Z)V

    .line 104
    return-void
.end method

.method protected d()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lo/eyt$b;->b:Z

    return v0
.end method

.method protected e()V
    .locals 1

    .line 111
    invoke-virtual {p0}, Lo/eyt$b;->a()V

    .line 112
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->e:Lo/ezj;

    invoke-virtual {p0, v0}, Lo/eyt$b;->e(Landroid/view/View;)V

    .line 113
    return-void
.end method

.method public e(Landroid/view/View;)V
    .locals 2

    .line 149
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->e:Lo/ezj;

    sget v1, Lcom/huawei/ui/main/R$drawable;->scrollchart_observer_hr_unfocus_bg:I

    invoke-virtual {v0, v1}, Lo/ezj;->setBackgroundResource(I)V

    .line 150
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->d:Lo/ezj;

    sget v1, Lcom/huawei/ui/main/R$drawable;->scrollchart_observer_hr_unfocus_bg:I

    invoke-virtual {v0, v1}, Lo/ezj;->setBackgroundResource(I)V

    .line 151
    sget v0, Lcom/huawei/ui/main/R$drawable;->scrollchart_observer_hr_focus_bg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 153
    invoke-direct {p0}, Lo/eyt$b;->f()V

    .line 154
    return-void
.end method

.method protected g()V
    .locals 3

    .line 160
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->c:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/eyt$b;->a:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->b:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lo/eyt$b;->a:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->e:Lo/ezj;

    invoke-virtual {p0, v0}, Lo/eyt$b;->e(Landroid/view/View;)V

    .line 164
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/eyt$b;->c(ZZ)V

    .line 172
    new-instance v2, Lo/ehe$a;

    invoke-direct {v2}, Lo/ehe$a;-><init>()V

    .line 173
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->f:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    .line 174
    const-string v0, "rest_hr"

    invoke-virtual {v2, v0}, Lo/ehe$a;->a(Ljava/lang/String;)Lo/ehe$a;

    .line 175
    iput-object v2, p0, Lo/eyt$b;->e:Lo/ehe$a;

    .line 176
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->f:Lo/ezh;

    invoke-virtual {v0, v2}, Lo/ezh;->c(Lo/ehe$a;)Lo/eii;

    move-result-object v0

    iput-object v0, p0, Lo/eyt$b;->c:Lo/eii;

    .line 177
    invoke-virtual {p0}, Lo/eyt$b;->k()V

    .line 178
    return-void
.end method

.method protected h()V
    .locals 2

    .line 191
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->f:Lo/ezh;

    iget-object v1, p0, Lo/eyt$b;->c:Lo/eii;

    invoke-virtual {v0, v1}, Lo/ezh;->e(Lo/eii;)V

    .line 192
    return-void
.end method

.method protected k()V
    .locals 6

    .line 181
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->f:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->f()Lo/ejf;

    move-result-object v4

    .line 182
    instance-of v0, v4, Lo/ehl;

    if-nez v0, :cond_0

    .line 183
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not support scrollable,init focus now only support scrollable chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 185
    :cond_0
    move-object v0, v4

    check-cast v0, Lo/ehl;

    .line 186
    invoke-virtual {v0}, Lo/ehl;->d()Lo/ejk;

    move-result-object v5

    .line 187
    iget-object v0, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v0, v0, Lo/eyt;->f:Lo/ezh;

    iget-object v1, p0, Lo/eyt$b;->c:Lo/eii;

    iget-object v2, p0, Lo/eyt$b;->d:Lo/eyt;

    iget-object v2, v2, Lo/eyt;->f:Lo/ezh;

    invoke-virtual {v2}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v2

    iget-object v3, p0, Lo/eyt$b;->e:Lo/ehe$a;

    invoke-virtual {v0, v1, v5, v2, v3}, Lo/ezh;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 188
    return-void
.end method

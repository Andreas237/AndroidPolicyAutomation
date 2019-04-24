.class public Lo/ezi$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ezi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "g"
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field protected b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<+Landroid/view/View;>;"
        }
    .end annotation
.end field

.field private c:Lo/ezi$i;

.field final synthetic d:Lo/ezi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 173
    const-class v0, Lo/ezi;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/ezi$g;->a:Z

    return-void
.end method

.method public constructor <init>(Lo/ezi;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Landroid/view/View;>;)V"
        }
    .end annotation

    .line 186
    iput-object p1, p0, Lo/ezi$g;->d:Lo/ezi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    iput-object p2, p0, Lo/ezi$g;->b:Ljava/util/List;

    .line 188
    iget-object v0, p0, Lo/ezi$g;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    .line 189
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    goto :goto_0

    .line 191
    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 273
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    iget-boolean v0, v0, Lo/ezi$d;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    iget-object v0, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    if-nez v0, :cond_1

    .line 274
    :cond_0
    return-void

    .line 276
    :cond_1
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    iget-object v2, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 277
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->f:Lo/ezh;

    iget-object v1, v2, Lo/ezi$d$c;->e:Lo/eii;

    invoke-virtual {v0, v1}, Lo/ezh;->d(Lo/eii;)V

    .line 278
    iget-object v0, v2, Lo/ezi$d$c;->a:Lo/ehe$a;

    iget-object v1, v2, Lo/ezi$d$c;->e:Lo/eii;

    invoke-virtual {p0, v0, v1}, Lo/ezi$g;->c(Lo/ehe$a;Lo/eii;)V

    .line 280
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/ezi$d;->e:Z

    .line 281
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 282
    return-void
.end method

.method public a(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ezi$f;
        }
    .end annotation

    .line 256
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ehe$a;

    .line 257
    sget-object v0, Lo/ezi;->c:Lo/ehe$a;

    if-ne v2, v0, :cond_0

    .line 258
    new-instance v0, Lo/ezi$f;

    invoke-direct {v0}, Lo/ezi$f;-><init>()V

    throw v0

    .line 260
    :cond_0
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->b:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/eii;

    .line 261
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->f:Lo/ezh;

    invoke-virtual {v0, v3, v2}, Lo/ezh;->b(Lo/eii;Lo/ehe$a;)V

    .line 262
    invoke-virtual {p0, v3}, Lo/ezi$g;->b(Lo/eii;)V

    .line 264
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/ezi$d;->e:Z

    .line 265
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    new-instance v1, Lo/ezi$d$c;

    invoke-direct {v1, v3, v2}, Lo/ezi$d$c;-><init>(Lo/eii;Lo/ehe$a;)V

    iput-object v1, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    .line 266
    return-void
.end method

.method public a(Lo/ezi$i;)V
    .locals 0

    .line 252
    iput-object p1, p0, Lo/ezi$g;->c:Lo/ezi$i;

    .line 253
    return-void
.end method

.method protected b(Lo/eii;)V
    .locals 1

    .line 269
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->f:Lo/ezh;

    invoke-virtual {v0, p1}, Lo/ezh;->e(Lo/eii;)V

    .line 270
    return-void
.end method

.method public b()Z
    .locals 1

    .line 176
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    iget-boolean v0, v0, Lo/ezi$d;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->d:Lo/ezi$d;

    iget-object v0, v0, Lo/ezi$d;->c:Lo/ezi$d$c;

    if-nez v0, :cond_1

    .line 177
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 179
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method protected c(Lo/ehe$a;Lo/eii;)V
    .locals 4

    .line 242
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->f:Lo/ezh;

    invoke-virtual {v0}, Lo/ezh;->f()Lo/ejf;

    move-result-object v2

    .line 243
    instance-of v0, v2, Lo/ehl;

    if-nez v0, :cond_0

    .line 244
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not support scrollable,init focus now only support scrollable chart!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 246
    :cond_0
    move-object v0, v2

    check-cast v0, Lo/ehl;

    .line 247
    invoke-virtual {v0}, Lo/ehl;->d()Lo/ejk;

    move-result-object v3

    .line 248
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->f:Lo/ezh;

    iget-object v1, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v1, v1, Lo/ezi;->f:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    invoke-virtual {v0, p2, v3, v1, p1}, Lo/ezh;->c(Lo/eii;Lo/ejk;Lo/eic;Lo/ehe$a;)V

    .line 249
    return-void
.end method

.method public d()V
    .locals 4

    .line 231
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ehe$a;

    .line 232
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->f:Lo/ezh;

    invoke-virtual {v0, v2}, Lo/ezh;->c(Lo/ehe$a;)Lo/eii;

    move-result-object v3

    .line 233
    sget-object v0, Lo/ezi;->c:Lo/ehe$a;

    if-ne v2, v0, :cond_0

    .line 234
    goto :goto_0

    .line 236
    :cond_0
    invoke-virtual {p0, v2, v3}, Lo/ezi$g;->c(Lo/ehe$a;Lo/eii;)V

    .line 237
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    iget-object v0, v0, Lo/ezi;->b:Ljava/util/Map;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    goto :goto_0

    .line 239
    :cond_1
    return-void
.end method

.method public d(Landroid/view/View;)V
    .locals 4

    .line 214
    sget-boolean v0, Lo/ezi$g;->a:Z

    if-nez v0, :cond_0

    instance-of v0, p1, Lo/ezj;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 216
    :cond_0
    iget-object v0, p0, Lo/ezi$g;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    .line 217
    sget v0, Lcom/huawei/ui/main/R$drawable;->scrollchart_observer_hr_unfocus_bg:I

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 218
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/view/View;->setClickable(Z)V

    .line 220
    move-object v0, v3

    check-cast v0, Lo/ezj;

    if-ne v3, p1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lo/ezj;->a(Z)V

    .line 221
    goto :goto_0

    .line 222
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$drawable;->scrollchart_observer_hr_focus_bg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 223
    iget-object v0, p0, Lo/ezi$g;->d:Lo/ezi;

    move-object v1, p1

    check-cast v1, Lo/ezj;

    iput-object v1, v0, Lo/ezi;->k:Lo/ezj;

    .line 224
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 225
    sget-boolean v0, Lo/ezi$g;->a:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lo/ezi$g;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 226
    :cond_3
    iget-object v0, p0, Lo/ezi$g;->c:Lo/ezi$i;

    iget-object v1, p0, Lo/ezi$g;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-interface {v0, p1, v1}, Lo/ezi$i;->a(Landroid/view/View;I)V

    .line 227
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 202
    sget-boolean v0, Lo/ezi$g;->a:Z

    if-nez v0, :cond_1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/ezi$g;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 203
    :cond_1
    iget-object v0, p0, Lo/ezi$g;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lo/ezi$g;->d(Landroid/view/View;)V

    .line 204
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 209
    invoke-virtual {p0, p1}, Lo/ezi$g;->d(Landroid/view/View;)V

    .line 210
    return-void
.end method

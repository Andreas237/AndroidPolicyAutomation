.class Lo/bwa$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bwf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->Q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 626
    iput-object p1, p0, Lo/bwa$2;->e:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .line 630
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 634
    if-eqz p1, :cond_1

    .line 635
    iget-object v0, p0, Lo/bwa$2;->e:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->e(Lo/bwa;)Lo/bwc;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/bwc;->setVisibility(I)V

    .line 636
    iget-object v0, p0, Lo/bwa$2;->e:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->b(Lo/bwa;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 637
    iget-object v0, p0, Lo/bwa$2;->e:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->b(Lo/bwa;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_fitness_ic_unlock:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 640
    :cond_0
    iget-object v0, p0, Lo/bwa$2;->e:Lo/bwa;

    iget-object v0, v0, Lo/bwa;->t:Lo/bwr;

    invoke-virtual {v0}, Lo/bwr;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    .line 641
    iget-object v0, p0, Lo/bwa$2;->e:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->p()V

    .line 643
    :cond_1
    return-void
.end method

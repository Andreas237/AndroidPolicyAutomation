.class Lo/bwa$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->S()V
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

    .line 683
    iput-object p1, p0, Lo/bwa$10;->e:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 686
    iget-object v0, p0, Lo/bwa$10;->e:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->b(Lo/bwa;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_fitness_ic_locked:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 687
    iget-object v0, p0, Lo/bwa$10;->e:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->f(Lo/bwa;)V

    .line 688
    return-void
.end method

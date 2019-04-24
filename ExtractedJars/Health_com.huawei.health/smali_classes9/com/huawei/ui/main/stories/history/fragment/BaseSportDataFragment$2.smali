.class Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V
    .locals 0

    .line 328
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$2;->a:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$2;->a:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->p:Z

    if-eqz v0, :cond_0

    .line 332
    return-void

    .line 334
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$2;->a:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->e()V

    .line 335
    return-void
.end method

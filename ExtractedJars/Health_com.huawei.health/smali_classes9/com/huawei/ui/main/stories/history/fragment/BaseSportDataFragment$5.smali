.class Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$5;
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
.field final synthetic c:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V
    .locals 0

    .line 318
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->p:Z

    if-eqz v0, :cond_0

    .line 322
    return-void

    .line 324
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$5;->c:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->b()V

    .line 325
    return-void
.end method

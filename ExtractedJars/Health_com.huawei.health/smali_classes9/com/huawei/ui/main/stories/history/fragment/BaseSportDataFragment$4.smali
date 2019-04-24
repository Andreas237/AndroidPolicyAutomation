.class Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;->d:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;->d:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->c()V

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;->d:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->b(Z)V

    .line 184
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;->d:Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a(Z)V

    .line 185
    return-void
.end method

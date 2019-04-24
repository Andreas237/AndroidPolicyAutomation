.class Lcom/huawei/ui/main/stories/history/SportDataActivity$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d(Lo/eic;IILo/eie;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/history/SportDataActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportDataActivity$2;)V
    .locals 0

    .line 703
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2$3;->a:Lcom/huawei/ui/main/stories/history/SportDataActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 706
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2$3;->a:Lcom/huawei/ui/main/stories/history/SportDataActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_motiontrack_sport_data_share_date:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2$3;->a:Lcom/huawei/ui/main/stories/history/SportDataActivity$2;

    iget-object v3, v3, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    iget-object v3, v3, Lcom/huawei/ui/main/stories/history/SportDataActivity;->d:Lo/eyk;

    invoke-virtual {v3}, Lo/eyk;->c()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2$3;->a:Lcom/huawei/ui/main/stories/history/SportDataActivity$2;

    iget-object v3, v3, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->l(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 707
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2$3;->a:Lcom/huawei/ui/main/stories/history/SportDataActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/history/SportDataActivity$2;->d:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->o(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 708
    return-void
.end method

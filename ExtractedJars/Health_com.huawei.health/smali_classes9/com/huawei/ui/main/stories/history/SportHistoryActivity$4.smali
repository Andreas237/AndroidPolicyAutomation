.class Lcom/huawei/ui/main/stories/history/SportHistoryActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$4;->d:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$4;->d:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->a(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_choose_arrow_down:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 156
    return-void
.end method

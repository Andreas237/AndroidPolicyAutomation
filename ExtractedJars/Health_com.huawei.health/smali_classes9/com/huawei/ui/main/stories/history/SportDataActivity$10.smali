.class Lcom/huawei/ui/main/stories/history/SportDataActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportDataActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/history/SportDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportDataActivity;)V
    .locals 0

    .line 298
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$10;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .line 301
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportDataActivity$10;->c:Lcom/huawei/ui/main/stories/history/SportDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportDataActivity;->g(Lcom/huawei/ui/main/stories/history/SportDataActivity;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->ic_health_choose_arrow_down:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 302
    return-void
.end method

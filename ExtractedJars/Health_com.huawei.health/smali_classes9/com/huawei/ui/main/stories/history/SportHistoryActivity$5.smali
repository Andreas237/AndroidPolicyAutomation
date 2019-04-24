.class Lcom/huawei/ui/main/stories/history/SportHistoryActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->onCheckedChanged(Landroid/widget/RadioGroup;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)V
    .locals 0

    .line 317
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$5;->e:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->d(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 321
    return-void
.end method

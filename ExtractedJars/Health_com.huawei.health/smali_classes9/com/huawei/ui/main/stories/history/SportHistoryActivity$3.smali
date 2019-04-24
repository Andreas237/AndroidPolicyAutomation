.class Lcom/huawei/ui/main/stories/history/SportHistoryActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$3;->c:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/SportHistoryActivity$3;->c:Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;->c(Lcom/huawei/ui/main/stories/history/SportHistoryActivity;Z)Z

    .line 252
    return-void
.end method

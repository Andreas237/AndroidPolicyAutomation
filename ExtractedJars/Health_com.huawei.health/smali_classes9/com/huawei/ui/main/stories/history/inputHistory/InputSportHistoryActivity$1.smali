.class Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$1;->a:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 195
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$1;->a:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->c(Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    const-string v0, "Track_InputSportHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "close window(), onClick()  mClickCheck is true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    return-void

    .line 199
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$1;->a:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->setResult(I)V

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity$1;->a:Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/history/inputHistory/InputSportHistoryActivity;->finish()V

    .line 201
    return-void
.end method

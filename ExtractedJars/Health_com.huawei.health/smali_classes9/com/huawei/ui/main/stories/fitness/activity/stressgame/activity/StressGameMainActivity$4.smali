.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->b(Ljava/lang/String;F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

.field final synthetic d:F


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;F)V
    .locals 0

    .line 213
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->c:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->a:Ljava/lang/String;

    iput p3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 217
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->c:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->d:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->c:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendMessageToH5() functionName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " algorithmValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$4;->d:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    return-void
.end method

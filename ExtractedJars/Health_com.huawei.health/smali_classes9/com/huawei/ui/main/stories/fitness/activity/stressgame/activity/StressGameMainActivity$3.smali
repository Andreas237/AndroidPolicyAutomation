.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->c(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 230
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 234
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->g(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "(\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\')"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->a:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendStringMessageToH5() functionName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " algorithmValue = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/activity/StressGameMainActivity$3;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    return-void
.end method

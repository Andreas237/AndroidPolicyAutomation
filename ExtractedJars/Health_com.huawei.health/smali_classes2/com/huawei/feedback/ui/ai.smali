.class Lcom/huawei/feedback/ui/ai;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lcom/huawei/feedback/ui/ai;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 335
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "receive a broadcast"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/feedback/ui/ai;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->f(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/feedback/ui/ai;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 341
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "begin update feedback records by receive broadcast"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    iget-object v0, p0, Lcom/huawei/feedback/ui/ai;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->notifyDataSetChanged()V

    .line 345
    :cond_0
    invoke-static {}, Lcom/huawei/feedback/logic/g;->d()V

    .line 346
    return-void
.end method

.class public Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProgressStartReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 2086
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 2091
    if-nez p2, :cond_0

    .line 2092
    return-void

    .line 2094
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 2096
    const-string v0, "com.example.logupload.progress.start"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2099
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "ProgressStartReceiver onReceive"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2103
    const-wide/16 v4, -0x1

    .line 2105
    const-string v0, "strID"

    const-wide/16 v1, -0x1

    :try_start_0
    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 2108
    goto :goto_0

    .line 2106
    :catch_0
    move-exception v6

    .line 2107
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "strId get exception"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2112
    :goto_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/feedback/bean/f;

    .line 2117
    invoke-virtual {v7}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2118
    goto :goto_1

    .line 2127
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-nez v0, :cond_3

    .line 2132
    const-string v0, "0"

    invoke-virtual {v7, v0}, Lcom/huawei/feedback/bean/f;->d(Ljava/lang/String;)V

    .line 2133
    invoke-virtual {v7}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 2134
    goto :goto_1

    .line 2137
    :cond_2
    const/4 v0, 0x5

    invoke-virtual {v7, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 2142
    :cond_3
    goto :goto_1

    .line 2146
    :cond_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 2147
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressStartReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->notifyDataSetChanged()V

    .line 2151
    :cond_5
    goto :goto_2

    .line 2152
    :cond_6
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "ProgressStartReceiver mLogUploadInfo == null"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2154
    :goto_2
    return-void
.end method

.class public Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackRecordActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ProgressCancelReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)V
    .locals 0

    .line 2157
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 2162
    if-nez p2, :cond_0

    .line 2163
    return-void

    .line 2165
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 2167
    const-string v0, "com.example.logupload.progress.cancel"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2169
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "ProgressCancelReceiver onReceive"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2173
    const-wide/16 v4, -0x1

    .line 2175
    const-string v0, "strID"

    const-wide/16 v1, -0x1

    :try_start_0
    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 2178
    goto :goto_0

    .line 2176
    :catch_0
    move-exception v6

    .line 2177
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

    .line 2182
    :goto_0
    const-string v0, "FeedbackRecordActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "strId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2185
    goto/16 :goto_5

    :cond_1
    const-string v0, "com.example.logupload.exception"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2186
    const-wide/16 v4, -0x1

    .line 2188
    const-string v0, "strID"

    const-wide/16 v1, -0x1

    :try_start_1
    invoke-virtual {p2, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v0

    move-wide v4, v0

    .line 2191
    goto :goto_1

    .line 2189
    :catch_1
    move-exception v6

    .line 2190
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

    .line 2192
    :goto_1
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/huawei/feedback/logic/f;->a(Ljava/lang/String;I)V

    .line 2194
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/feedback/bean/f;

    .line 2195
    invoke-virtual {v7}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2196
    goto :goto_2

    .line 2198
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/feedback/bean/f;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-nez v0, :cond_3

    .line 2199
    const/4 v0, 0x3

    invoke-virtual {v7, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 2200
    goto :goto_3

    .line 2202
    :cond_3
    goto :goto_2

    .line 2208
    :cond_4
    :goto_3
    :try_start_2
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->l(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;

    invoke-direct {v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$c;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 2211
    goto :goto_4

    .line 2209
    :catch_2
    move-exception v6

    .line 2210
    const-string v0, "FeedbackRecordActivity"

    const-string v1, "Arrays sort IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 2215
    :goto_4
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 2216
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->i(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity$b;->notifyDataSetChanged()V

    .line 2219
    :cond_5
    const/4 v6, 0x0

    .line 2220
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->q(Lcom/huawei/feedback/ui/FeedbackRecordActivity;)I

    move-result v6

    .line 2221
    if-lez v6, :cond_6

    .line 2223
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackRecordActivity$ProgressCancelReceiver;->a:Lcom/huawei/feedback/ui/FeedbackRecordActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackRecordActivity;->b(Lcom/huawei/feedback/ui/FeedbackRecordActivity;Z)V

    .line 2230
    :cond_6
    :goto_5
    return-void
.end method

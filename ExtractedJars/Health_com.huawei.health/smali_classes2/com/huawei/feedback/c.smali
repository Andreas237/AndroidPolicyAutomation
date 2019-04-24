.class final Lcom/huawei/feedback/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 174
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->access$000()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->access$100()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    sget-object v0, Lcom/huawei/feedback/d;->aq:Ljava/lang/String;

    .line 178
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->access$000()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->access$200()Ljava/lang/String;

    move-result-object v2

    .line 176
    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->access$100()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->access$000()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->access$200()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/e;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    :cond_0
    return-void
.end method

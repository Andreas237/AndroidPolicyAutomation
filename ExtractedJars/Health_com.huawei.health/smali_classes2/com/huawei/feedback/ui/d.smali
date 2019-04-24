.class Lcom/huawei/feedback/ui/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/feedback/ui/ResizeRelativeLayout$a;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/huawei/feedback/ui/d;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIII)V
    .locals 3

    .line 269
    const/4 v1, -0x1

    .line 270
    if-ge p2, p4, :cond_0

    .line 271
    const/4 v1, 0x0

    goto :goto_0

    .line 272
    :cond_0
    if-le p2, p4, :cond_1

    .line 273
    const/4 v1, 0x1

    .line 275
    :cond_1
    :goto_0
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 276
    iput v1, v2, Landroid/os/Message;->arg1:I

    .line 277
    iget-object v0, p0, Lcom/huawei/feedback/ui/d;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->b(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 278
    return-void
.end method

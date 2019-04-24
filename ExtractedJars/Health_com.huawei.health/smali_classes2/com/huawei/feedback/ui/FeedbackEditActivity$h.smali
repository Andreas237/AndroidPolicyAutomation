.class Lcom/huawei/feedback/ui/FeedbackEditActivity$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackEditActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 1758
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;Lcom/huawei/feedback/ui/n;)V
    .locals 0

    .line 1758
    invoke-direct {p0, p1}, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;-><init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 13

    .line 1761
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->g()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1762
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 1765
    :cond_0
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_1

    .line 1766
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0, v1}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->a(Lcom/huawei/feedback/ui/FeedbackEditActivity;Landroid/content/Context;)Landroid/content/Context;

    .line 1775
    :cond_1
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a()Lcom/huawei/phoneserviceuni/common/e/b/a;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/logic/i;

    iget-object v2, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 1776
    invoke-static {v2}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v3}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->x(Lcom/huawei/feedback/ui/FeedbackEditActivity;)I

    move-result v3

    iget-object v4, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v4}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->y(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/lcagent/client/LogCollectManager;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 1777
    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->b(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Landroid/content/Context;

    move-result-object v6

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->z(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v7

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/feedback/bean/d;->p()Ljava/lang/String;

    move-result-object v8

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->A(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/lang/String;

    move-result-object v9

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    .line 1778
    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->l(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v10

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    iget-object v11, v5, Lcom/huawei/feedback/ui/FeedbackEditActivity;->k:Landroid/os/Handler;

    iget-object v5, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v5}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/feedback/bean/d;->a()Ljava/lang/String;

    move-result-object v12

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v12}, Lcom/huawei/feedback/logic/i;-><init>(Lcom/huawei/feedback/bean/d;ILcom/huawei/lcagent/client/LogCollectManager;Lcom/huawei/lcagent/client/LogMetricInfo;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Handler;Ljava/lang/String;)V

    .line 1776
    invoke-virtual {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/b/a;->a(Ljava/lang/Runnable;)V

    .line 1792
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$h;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->finish()V

    .line 1793
    return-void
.end method

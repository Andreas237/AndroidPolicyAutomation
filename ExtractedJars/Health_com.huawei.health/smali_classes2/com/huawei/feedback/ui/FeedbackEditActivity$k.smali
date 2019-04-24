.class Lcom/huawei/feedback/ui/FeedbackEditActivity$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/feedback/ui/FeedbackEditActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "k"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 1918
    iput-object p1, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$k;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1921
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$k;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/bean/d;->k()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 1924
    :goto_0
    if-eqz v3, :cond_1

    .line 1925
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$k;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1926
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$k;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/16 v2, 0x1002

    invoke-static {v0, v1, v2}, Lcom/huawei/feedback/e;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1928
    return-void

    .line 1934
    :cond_1
    iget-object v0, p0, Lcom/huawei/feedback/ui/FeedbackEditActivity$k;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->h(Lcom/huawei/feedback/ui/FeedbackEditActivity;)Lcom/huawei/feedback/bean/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/feedback/bean/d;->a(Z)V

    .line 1935
    return-void
.end method

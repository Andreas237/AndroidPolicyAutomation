.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 1957
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1961
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    invoke-virtual {v1}, Lo/bdj;->getCount()I

    move-result v1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->H:I

    const/16 v1, 0x14

    if-gt v0, v1, :cond_0

    .line 1964
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/arn;->d(Ljava/lang/Boolean;J)V

    goto :goto_0

    .line 1968
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->s:Lo/bdj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bdj;->a(I)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    .line 1969
    if-eqz v4, :cond_1

    .line 1971
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v0

    int-to-long v5, v0

    .line 1972
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$6;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->g:Lo/arn;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1, v5, v6}, Lo/arn;->d(Ljava/lang/Boolean;J)V

    .line 1975
    :cond_1
    :goto_0
    return-void
.end method

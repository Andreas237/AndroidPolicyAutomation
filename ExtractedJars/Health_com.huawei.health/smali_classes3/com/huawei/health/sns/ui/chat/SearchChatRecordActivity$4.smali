.class Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$4;->a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 2

    .line 188
    if-eqz p2, :cond_0

    .line 190
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$4;->a:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->e(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;Landroid/view/View;)V

    .line 192
    :cond_0
    return-void
.end method

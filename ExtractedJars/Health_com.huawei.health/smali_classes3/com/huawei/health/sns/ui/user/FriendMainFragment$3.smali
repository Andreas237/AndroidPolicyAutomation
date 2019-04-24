.class Lcom/huawei/health/sns/ui/user/FriendMainFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/user/FriendMainFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/user/FriendMainFragment;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment$3;->b:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 3

    .line 176
    if-eqz p2, :cond_0

    .line 178
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment$3;->b:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->e(Lcom/huawei/health/sns/ui/user/FriendMainFragment;Landroid/view/View;)V

    goto :goto_0

    .line 182
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment$3;->b:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->c:Landroid/view/inputmethod/InputMethodManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/FriendMainFragment$3;->b:Lcom/huawei/health/sns/ui/user/FriendMainFragment;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/user/FriendMainFragment;->c:Landroid/view/inputmethod/InputMethodManager;

    .line 183
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 185
    const-string v0, "FriendMainFragment"

    const-string v1, "Failed to hide soft input method."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    :cond_1
    :goto_0
    return-void
.end method

.class Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$2;->a:Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 4

    .line 289
    if-eqz p2, :cond_0

    .line 291
    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v2

    .line 292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity$2;->a:Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    .line 293
    if-eqz v3, :cond_0

    .line 295
    const/4 v0, 0x0

    invoke-virtual {v3, v2, v0}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 297
    const-string v0, "DeleteGroupMemberActivity"

    const-string v1, "Failed to show soft input method."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    :cond_0
    return-void
.end method

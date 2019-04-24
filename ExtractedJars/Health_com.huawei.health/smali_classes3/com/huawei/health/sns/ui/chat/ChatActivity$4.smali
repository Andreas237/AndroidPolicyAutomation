.class Lcom/huawei/health/sns/ui/chat/ChatActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bnk$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatActivity;->r()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/ChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 0

    .line 413
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$4;->c:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(IIII)V
    .locals 1

    .line 417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$4;->c:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 419
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$4;->c:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->q()V

    .line 421
    :cond_0
    return-void
.end method

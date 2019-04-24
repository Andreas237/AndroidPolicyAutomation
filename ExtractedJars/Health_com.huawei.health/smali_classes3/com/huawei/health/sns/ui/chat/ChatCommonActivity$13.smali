.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->d(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 769
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$13;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 773
    const-string v0, "ChatCommonActivity"

    const-string v1, "click setting now."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 775
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$13;->a:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->e(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V

    .line 776
    return-void
.end method

.method public d()V
    .locals 2

    .line 781
    const-string v0, "ChatCommonActivity"

    const-string v1, "click later."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 783
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->f()V

    .line 784
    return-void
.end method

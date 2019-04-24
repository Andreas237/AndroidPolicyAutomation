.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/arl$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onActivityResult(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)V
    .locals 0

    .line 2051
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$9;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 3

    .line 2055
    if-lez p1, :cond_0

    .line 2057
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$9;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->k(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;)Lo/arp;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/arp;->c(I)V

    .line 2058
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2059
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2060
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$9;->e:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->a(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;ZLjava/util/ArrayList;)V

    .line 2061
    goto :goto_0

    .line 2064
    :cond_0
    const-string v0, "ChatCommonActivity"

    const-string v1, "onActivityResult get photo Id failed!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2066
    :goto_0
    return-void
.end method

.class Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->b(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:I

.field final synthetic d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;I)V
    .locals 0

    .line 1671
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iput p2, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1675
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->J:Z

    if-eqz v0, :cond_0

    .line 1678
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;->c:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bdu;->setSelectionFromTop(II)V

    goto :goto_0

    .line 1682
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;->d:Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->j:Lo/bdu;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity$2;->c:I

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bdu;->setSelectionFromTop(II)V

    .line 1684
    :goto_0
    return-void
.end method

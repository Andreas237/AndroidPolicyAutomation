.class Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationFragment;Landroid/os/Handler;)V
    .locals 0

    .line 641
    iput-object p1, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    .line 642
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 643
    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 1

    .line 648
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationFragment$e;->e:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->e()V

    .line 649
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 650
    return-void
.end method

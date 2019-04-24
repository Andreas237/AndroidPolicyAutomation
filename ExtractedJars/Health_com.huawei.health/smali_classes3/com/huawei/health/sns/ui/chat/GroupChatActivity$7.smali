.class Lcom/huawei/health/sns/ui/chat/GroupChatActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->onActivityResult(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 0

    .line 1279
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$7;->d:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1284
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$7;->d:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->c()V

    .line 1285
    return-void
.end method

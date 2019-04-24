.class Lo/beg$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/beg;->c(Lo/beg$a;Lcom/huawei/health/sns/model/chat/MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic b:Lo/beg$a;

.field final synthetic c:Lo/beg;


# direct methods
.method constructor <init>(Lo/beg;Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beg$a;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lo/beg$2;->c:Lo/beg;

    iput-object p2, p0, Lo/beg$2;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iput-object p3, p0, Lo/beg$2;->b:Lo/beg$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 278
    iget-object v0, p0, Lo/beg$2;->c:Lo/beg;

    iget-object v0, v0, Lo/beg;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-boolean v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->o:Z

    if-eqz v0, :cond_1

    .line 283
    :try_start_0
    iget-object v0, p0, Lo/beg$2;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v3

    .line 289
    goto :goto_0

    .line 285
    :catch_0
    move-exception v5

    .line 287
    const-string v0, "ChatCardView"

    const-string v1, "setOnClick NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    return-void

    .line 291
    :goto_0
    new-instance v5, Landroid/content/Intent;

    iget-object v0, p0, Lo/beg$2;->c:Lo/beg;

    iget-object v0, v0, Lo/beg;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 292
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 293
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v6, v0, v3, v4}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 294
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x4

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 295
    iget-object v0, p0, Lo/beg$2;->c:Lo/beg;

    iget-object v0, v0, Lo/beg;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->f:J

    cmp-long v0, v3, v0

    if-nez v0, :cond_0

    .line 298
    const-string v0, "bundleKeyIsNeedGobackToHomeActivity"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 301
    :cond_0
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 302
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 303
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 304
    iget-object v0, p0, Lo/beg$2;->c:Lo/beg;

    iget-object v0, v0, Lo/beg;->d:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v5}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 305
    goto :goto_1

    .line 308
    :cond_1
    iget-object v0, p0, Lo/beg$2;->c:Lo/beg;

    iget-object v1, p0, Lo/beg$2;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/beg$2;->b:Lo/beg$a;

    invoke-virtual {v0, v1, v2}, Lo/beg;->c(Lcom/huawei/health/sns/model/chat/MessageItem;Lo/beu;)V

    .line 310
    :goto_1
    return-void
.end method

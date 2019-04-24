.class final Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->e(JLandroid/app/Activity;Z)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:J

.field final synthetic d:Z


# direct methods
.method constructor <init>(Landroid/app/Activity;JZ)V
    .locals 0

    .line 1311
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->a:Landroid/app/Activity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->b:J

    iput-boolean p4, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1311
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->c(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Void;
    .locals 5

    .line 1315
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1317
    invoke-static {}, Lo/apg;->b()Lo/apg;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->b:J

    invoke-virtual {v0, v1, v2}, Lo/apg;->c(J)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v4

    .line 1318
    if-eqz v4, :cond_0

    .line 1320
    const-string v0, "assistant_user"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1323
    :cond_0
    const-string v0, "assistant_user_id"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->b:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1324
    const-string v0, "isFromSdk"

    iget-boolean v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->d:Z

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$5;->a:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1328
    const/4 v0, 0x0

    return-object v0
.end method

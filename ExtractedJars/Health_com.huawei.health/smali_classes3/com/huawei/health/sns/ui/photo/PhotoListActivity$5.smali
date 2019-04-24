.class final Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->d(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;Ljava/lang/String;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;Ljava/lang/String;)V
    .locals 0

    .line 418
    iput-object p1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;->a:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 418
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 423
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 424
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;->a:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    const-class v1, Lcom/huawei/health/sns/ui/selector/TransmitActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 425
    const-string v0, "photoLink"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;->d:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 426
    const-string v0, "isNeedStoragePermission"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 428
    const-string v0, "needResult"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 429
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$5;->a:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->startActivity(Landroid/content/Intent;)V

    .line 430
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

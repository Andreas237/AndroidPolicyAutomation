.class Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 375
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 372
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;->a:Ljava/lang/String;

    .line 373
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;->b:Landroid/content/Context;

    .line 376
    iput-object p2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;->a:Ljava/lang/String;

    .line 377
    iput-object p1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;->b:Landroid/content/Context;

    .line 378
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 382
    const-string v0, "MemberServiceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MyDialogInterface  onClick-->which="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 385
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 386
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 389
    :try_start_0
    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;->b:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 392
    goto :goto_0

    .line 390
    :catch_0
    move-exception v4

    .line 391
    const-string v0, "MemberServiceManager"

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    :goto_0
    goto :goto_1

    .line 394
    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 397
    :goto_1
    return-void
.end method

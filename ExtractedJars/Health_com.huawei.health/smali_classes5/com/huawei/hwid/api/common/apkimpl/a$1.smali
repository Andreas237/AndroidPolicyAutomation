.class final Lcom/huawei/hwid/api/common/apkimpl/a$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/UseCase$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroid/os/Bundle;

.field final synthetic e:Lcom/huawei/cloudservice/LoginHandler;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->d:Landroid/os/Bundle;

    iput-object p5, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->e:Lcom/huawei/cloudservice/LoginHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 5

    .line 82
    const-string v0, "accountstatus"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 83
    const-string v0, "blocked"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->d:Landroid/os/Bundle;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->d:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/huawei/hwid/api/common/apkimpl/a$1;->e:Lcom/huawei/cloudservice/LoginHandler;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/api/common/apkimpl/a;->a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 88
    :goto_0
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 0

    .line 91
    return-void
.end method

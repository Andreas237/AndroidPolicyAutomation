.class Lo/dnq$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnq;->a(Lcom/huawei/up/callback/CommonCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnq;

.field final synthetic e:Lcom/huawei/up/callback/CommonCallback;


# direct methods
.method constructor <init>(Lo/dnq;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lo/dnq$7;->a:Lo/dnq;

    iput-object p2, p0, Lo/dnq$7;->e:Lcom/huawei/up/callback/CommonCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/up/model/UserInfomation;)V
    .locals 2

    .line 424
    iget-object v0, p0, Lo/dnq$7;->e:Lcom/huawei/up/callback/CommonCallback;

    if-eqz v0, :cond_0

    .line 425
    iget-object v0, p0, Lo/dnq$7;->e:Lcom/huawei/up/callback/CommonCallback;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v0, v1}, Lcom/huawei/up/callback/CommonCallback;->onSuccess(Landroid/os/Bundle;)V

    .line 427
    :cond_0
    return-void
.end method

.method public d(I)V
    .locals 1

    .line 431
    iget-object v0, p0, Lo/dnq$7;->e:Lcom/huawei/up/callback/CommonCallback;

    if-eqz v0, :cond_0

    .line 432
    iget-object v0, p0, Lo/dnq$7;->e:Lcom/huawei/up/callback/CommonCallback;

    invoke-interface {v0, p1}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 434
    :cond_0
    return-void
.end method

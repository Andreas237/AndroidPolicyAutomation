.class public Lcom/huawei/hwid/core/b/a/a/b$a;
.super Lcom/huawei/hwid/core/helper/handler/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/core/b/a/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 108
    invoke-direct {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;-><init>(Landroid/content/Context;)V

    .line 109
    iput-object p1, p0, Lcom/huawei/hwid/core/b/a/a/b$a;->a:Landroid/content/Context;

    .line 110
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 114
    invoke-super {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->a(Landroid/os/Bundle;)V

    .line 115
    const-string v0, "OpLogRequest"

    const-string v1, "upload log success"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/b$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/a/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/core/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/core/a/a;->a()V

    .line 118
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwid/core/a/c;->a(I)V

    .line 119
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/b$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/a/c;->a(Landroid/content/Context;)V

    .line 120
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .line 124
    invoke-super {p0, p1}, Lcom/huawei/hwid/core/helper/handler/a;->b(Landroid/os/Bundle;)V

    .line 125
    const-string v0, "requestError"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    .line 126
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwid/core/a/c;->a(I)V

    .line 127
    iget-object v0, p0, Lcom/huawei/hwid/core/b/a/a/b$a;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/hwid/core/a/c;->a(Landroid/content/Context;)V

    .line 128
    return-void
.end method

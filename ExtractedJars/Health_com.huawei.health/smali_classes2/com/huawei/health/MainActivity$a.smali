.class Lcom/huawei/health/MainActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/czi;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Landroid/os/Handler;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2213
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/MainActivity$a;->b:Ljava/lang/ref/WeakReference;

    .line 2214
    iput-object p2, p0, Lcom/huawei/health/MainActivity$a;->d:Ljava/lang/String;

    .line 2215
    iput-object p3, p0, Lcom/huawei/health/MainActivity$a;->c:Ljava/lang/String;

    .line 2216
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 7

    .line 2220
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_1

    .line 2221
    iget-object v0, p0, Lcom/huawei/health/MainActivity$a;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/Handler;

    .line 2222
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 2223
    return-void

    .line 2226
    :cond_0
    const/16 v0, 0x2711

    invoke-virtual {v4, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 2227
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 2228
    const-string v0, "result"

    invoke-virtual {v6, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2229
    const-string v0, "token"

    iget-object v1, p0, Lcom/huawei/health/MainActivity$a;->c:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2230
    const-string v0, "agrUrl"

    iget-object v1, p0, Lcom/huawei/health/MainActivity$a;->d:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2231
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 2232
    invoke-virtual {v4, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2233
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "agr_query_sign_response data "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2235
    :cond_1
    return-void
.end method

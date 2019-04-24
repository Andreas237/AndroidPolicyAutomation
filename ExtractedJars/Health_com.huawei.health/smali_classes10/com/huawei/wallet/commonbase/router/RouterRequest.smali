.class public Lcom/huawei/wallet/commonbase/router/RouterRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->a:Landroid/content/Context;

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->d:Ljava/lang/String;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b:Ljava/lang/String;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->c:Ljava/lang/String;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e:Ljava/util/Map;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->h:Ljava/util/Map;

    .line 39
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->a:Landroid/content/Context;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e:Ljava/util/Map;

    .line 42
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->h:Ljava/util/Map;

    .line 43
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b:Ljava/lang/String;

    .line 57
    return-object p0
.end method

.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e:Ljava/util/Map;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->d:Ljava/lang/String;

    .line 51
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Landroid/content/Context;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->a:Landroid/content/Context;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lcom/huawei/wallet/commonbase/router/RouterRequest;
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->c:Ljava/lang/String;

    .line 63
    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/commonbase/router/RouterRequest;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
